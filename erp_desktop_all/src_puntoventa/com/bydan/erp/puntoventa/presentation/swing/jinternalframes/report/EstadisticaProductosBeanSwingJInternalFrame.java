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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.EstadisticaProductosConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.EstadisticaProductosParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.EstadisticaProductosParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.EstadisticaProductosBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadisticaProductosBeanSwingJInternalFrame extends EstadisticaProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadisticaProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadisticaProductos> estadisticaproductosValidator = new ClassValidator<EstadisticaProductos>(EstadisticaProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadisticaProductos estadisticaproductos;	
	public EstadisticaProductos estadisticaproductosAux;
	public EstadisticaProductos estadisticaproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadisticaProductos estadisticaproductosTotales;
	public Long idEstadisticaProductosActual;
	public Long iIdNuevoEstadisticaProductos=0L;
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
	
	public Boolean isPermisoTodoEstadisticaProductos;
	public Boolean isPermisoNuevoEstadisticaProductos;
	public Boolean isPermisoActualizarEstadisticaProductos;
	public Boolean isPermisoActualizarOriginalEstadisticaProductos;
	public Boolean isPermisoEliminarEstadisticaProductos;
	public Boolean isPermisoGuardarCambiosEstadisticaProductos;
	public Boolean isPermisoConsultaEstadisticaProductos;
	public Boolean isPermisoBusquedaEstadisticaProductos;
	public Boolean isPermisoReporteEstadisticaProductos;
	public Boolean isPermisoPaginacionMedioEstadisticaProductos;
	public Boolean isPermisoPaginacionAltoEstadisticaProductos;
	public Boolean isPermisoPaginacionTodoEstadisticaProductos;
	public Boolean isPermisoCopiarEstadisticaProductos;
	public Boolean isPermisoVerFormEstadisticaProductos;
	public Boolean isPermisoDuplicarEstadisticaProductos;
	public Boolean isPermisoOrdenEstadisticaProductos;
	
	
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
	
	public EstadisticaProductosParameterReturnGeneral estadisticaproductosReturnGeneral;
	public EstadisticaProductosParameterReturnGeneral estadisticaproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadisticaProductos=false;
	public Boolean esParaAccionDesdeFormularioEstadisticaProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadisticaProductosSessionBeanAdditional estadisticaproductosSessionBeanAdditional=null;
	
	public EstadisticaProductosSessionBeanAdditional getEstadisticaProductosSessionBeanAdditional() {
		return this.estadisticaproductosSessionBeanAdditional;
	}
	
	public void setEstadisticaProductosSessionBeanAdditional(EstadisticaProductosSessionBeanAdditional estadisticaproductosSessionBeanAdditional) {
		try {
			this.estadisticaproductosSessionBeanAdditional=estadisticaproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadisticaProductosBeanSwingJInternalFrameAdditional estadisticaproductosBeanSwingJInternalFrameAdditional=null;
	//public class EstadisticaProductosBeanSwingJInternalFrame
	
	public EstadisticaProductosBeanSwingJInternalFrameAdditional getEstadisticaProductosBeanSwingJInternalFrameAdditional() {
		return this.estadisticaproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadisticaProductosBeanSwingJInternalFrameAdditional(EstadisticaProductosBeanSwingJInternalFrameAdditional estadisticaproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.estadisticaproductosBeanSwingJInternalFrameAdditional=estadisticaproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadisticaProductosLogic estadisticaproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadisticaProductos estadisticaproductosBean;
	public EstadisticaProductosConstantesFunciones estadisticaproductosConstantesFunciones;
	//public EstadisticaProductosParameterReturnGeneral estadisticaproductosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<EstadisticaProductos> estadisticaproductoss;	
	//public List<EstadisticaProductos> estadisticaproductossEliminados;
	//public List<EstadisticaProductos> estadisticaproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadisticaProductos=false;
	public Boolean isVisibilidadCeldaDuplicarEstadisticaProductos=true;
	public Boolean isVisibilidadCeldaCopiarEstadisticaProductos=true;
	public Boolean isVisibilidadCeldaVerFormEstadisticaProductos=true;
	public Boolean isVisibilidadCeldaOrdenEstadisticaProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
	public Boolean isVisibilidadCeldaModificarEstadisticaProductos=false;
	public Boolean isVisibilidadCeldaActualizarEstadisticaProductos=false;
	public Boolean isVisibilidadCeldaEliminarEstadisticaProductos=false;
	public Boolean isVisibilidadCeldaCancelarEstadisticaProductos=false;
	public Boolean isVisibilidadCeldaGuardarEstadisticaProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaEstadisticaProductos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoEstadisticaProductos() {
		return this.iIdNuevoEstadisticaProductos;
	}

	public void setiIdNuevoEstadisticaProductos(Long iIdNuevoEstadisticaProductos) {
		this.iIdNuevoEstadisticaProductos = iIdNuevoEstadisticaProductos;
	}
	
	public Long getidEstadisticaProductosActual() {
		return this.idEstadisticaProductosActual;
	}

	public void setidEstadisticaProductosActual(Long idEstadisticaProductosActual) {
		this.idEstadisticaProductosActual = idEstadisticaProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadisticaProductos getestadisticaproductos() {
		return this.estadisticaproductos;
	}

	public void setestadisticaproductos(EstadisticaProductos estadisticaproductos) {
		this.estadisticaproductos = estadisticaproductos;
	}
	
	public EstadisticaProductos getestadisticaproductosAux() {
		return this.estadisticaproductosAux;
	}

	public void setestadisticaproductosAux(EstadisticaProductos estadisticaproductosAux) {
		this.estadisticaproductosAux = estadisticaproductosAux;
	}				
	
	public EstadisticaProductos getestadisticaproductosAnterior() {
		return this.estadisticaproductosAnterior;
	}

	public void setestadisticaproductosAnterior(EstadisticaProductos estadisticaproductosAnterior) {
		this.estadisticaproductosAnterior = estadisticaproductosAnterior;
	}	
	
	public EstadisticaProductos getestadisticaproductosTotales() {
		return this.estadisticaproductosTotales;
	}

	public void setestadisticaproductosTotales(EstadisticaProductos estadisticaproductosTotales) {
		this.estadisticaproductosTotales = estadisticaproductosTotales;
	}	
	
	public EstadisticaProductos getestadisticaproductosBean() {
		return this.estadisticaproductosBean;
	}

	public void setestadisticaproductosBean(EstadisticaProductos estadisticaproductosBean) {
		this.estadisticaproductosBean = estadisticaproductosBean;
	}	
	
	public EstadisticaProductosParameterReturnGeneral getestadisticaproductosReturnGeneral() {
		return this.estadisticaproductosReturnGeneral;
	}

	public void setestadisticaproductosReturnGeneral(EstadisticaProductosParameterReturnGeneral estadisticaproductosReturnGeneral) {
		this.estadisticaproductosReturnGeneral = estadisticaproductosReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaEstadisticaProductos=-1L;

	public Long getid_productoBusquedaEstadisticaProductos() {
		return this.id_productoBusquedaEstadisticaProductos;
	}

	public void setid_productoBusquedaEstadisticaProductos(Long id_productoBusquedaEstadisticaProductos) {
		this.id_productoBusquedaEstadisticaProductos = id_productoBusquedaEstadisticaProductos;
	}

;
	public Date fecha_inicioBusquedaEstadisticaProductos=new Date();

	public Date getfecha_inicioBusquedaEstadisticaProductos() {
		return this.fecha_inicioBusquedaEstadisticaProductos;
	}

	public void setfecha_inicioBusquedaEstadisticaProductos(Date fecha_inicioBusquedaEstadisticaProductos) {
		this.fecha_inicioBusquedaEstadisticaProductos = fecha_inicioBusquedaEstadisticaProductos;
	}

;
	public Date fecha_finBusquedaEstadisticaProductos=new Date();

	public Date getfecha_finBusquedaEstadisticaProductos() {
		return this.fecha_finBusquedaEstadisticaProductos;
	}

	public void setfecha_finBusquedaEstadisticaProductos(Date fecha_finBusquedaEstadisticaProductos) {
		this.fecha_finBusquedaEstadisticaProductos = fecha_finBusquedaEstadisticaProductos;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadisticaProductosLogic getEstadisticaProductosLogic()	{		
		return estadisticaproductosLogic;
	}

	public void setEstadisticaProductosLogic(EstadisticaProductosLogic estadisticaproductosLogic) {
		this.estadisticaproductosLogic = estadisticaproductosLogic;
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
	
	public Boolean getIsEsNuevoEstadisticaProductos() {
		return isEsNuevoEstadisticaProductos;
	}

	public void setIsEsNuevoEstadisticaProductos(Boolean isEsNuevoEstadisticaProductos) {
		this.isEsNuevoEstadisticaProductos = isEsNuevoEstadisticaProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadisticaProductos() {
		return esParaAccionDesdeFormularioEstadisticaProductos;
	}
	
	public void setEsParaAccionDesdeFormularioEstadisticaProductos(Boolean esParaAccionDesdeFormularioEstadisticaProductos) {
		this.esParaAccionDesdeFormularioEstadisticaProductos = esParaAccionDesdeFormularioEstadisticaProductos;
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

			if(this.estadisticaproductosSessionBean==null) {
				this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
			}

			if(!this.estadisticaproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(estadisticaproductosSessionBean.getlidEmpresaActual());
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

			if(this.estadisticaproductosSessionBean==null) {
				this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
			}

			if(!this.estadisticaproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(estadisticaproductosSessionBean.getlidSucursalActual());
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

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.estadisticaproductosSessionBean==null) {
				this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
			}

			if(!this.estadisticaproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

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
					productoLogic.getEntityWithConnection(estadisticaproductosSessionBean.getlidProductoActual());
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

					if(this.estadisticaproductos!=null) {
						this.estadisticaproductos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
						this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEstadisticaProductos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
						if(this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEstadisticaProductosGenerico)throws Exception
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
				jComboBoxid_empresaEstadisticaProductosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEstadisticaProductosGenerico!=null && jComboBoxid_empresaEstadisticaProductosGenerico.getItemCount()>0) {
					jComboBoxid_empresaEstadisticaProductosGenerico.setSelectedIndex(0);
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

					if(this.estadisticaproductos!=null) {
						this.estadisticaproductos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
						this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalEstadisticaProductos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
						if(this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalEstadisticaProductosGenerico)throws Exception
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
				jComboBoxid_sucursalEstadisticaProductosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalEstadisticaProductosGenerico!=null && jComboBoxid_sucursalEstadisticaProductosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalEstadisticaProductosGenerico.setSelectedIndex(0);
				}
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

					if(this.estadisticaproductos!=null) {
						this.estadisticaproductos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
						this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoEstadisticaProductos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
						if(this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaEstadisticaProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos!=null) {
						jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos!=null) {
							//jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.getItemCount()>0) {
								jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoEstadisticaProductosGenerico)throws Exception
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
				jComboBoxid_productoEstadisticaProductosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoEstadisticaProductosGenerico!=null && jComboBoxid_productoEstadisticaProductosGenerico.getItemCount()>0) {
					jComboBoxid_productoEstadisticaProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EstadisticaProductos estadisticaproductos,JComboBox jComboBoxid_empresaEstadisticaProductosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEstadisticaProductosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEstadisticaProductosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				estadisticaproductos.setid_empresa(empresaAux.getId());
				estadisticaproductos.setempresa_descripcion(EstadisticaProductosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				estadisticaproductos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(EstadisticaProductos estadisticaproductos,JComboBox jComboBoxid_sucursalEstadisticaProductosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalEstadisticaProductosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalEstadisticaProductosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				estadisticaproductos.setid_sucursal(sucursalAux.getId());
				estadisticaproductos.setsucursal_descripcion(EstadisticaProductosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				estadisticaproductos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(EstadisticaProductos estadisticaproductos,JComboBox jComboBoxid_productoEstadisticaProductosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoEstadisticaProductosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoEstadisticaProductosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				estadisticaproductos.setid_producto(productoAux.getId());
				estadisticaproductos.setproducto_descripcion(EstadisticaProductosConstantesFunciones.getProductoDescripcion(productoAux));
				estadisticaproductos.setProducto(productoAux);			}
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

					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { 
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { 
					}

					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { 
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { 
					}

					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { 
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { 
					}

					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaEstadisticaProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.addItem(producto);
							}
						}

						if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEstadisticaProductos() throws Exception {
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
		
	public EstadisticaProductosParameterReturnGeneral getEstadisticaProductosParameterGeneral() {
		return this.estadisticaproductosParameterGeneral;
	}
	
	public void setEstadisticaProductosParameterGeneral(EstadisticaProductosParameterReturnGeneral estadisticaproductosParameterGeneral) {
		this.estadisticaproductosParameterGeneral = estadisticaproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadisticaProductos() {
		return isPermisoTodoEstadisticaProductos;
	}

	public void setIsPermisoTodoEstadisticaProductos(Boolean isPermisoTodoEstadisticaProductos) {
		this.isPermisoTodoEstadisticaProductos = isPermisoTodoEstadisticaProductos;
	}

	public Boolean getIsPermisoNuevoEstadisticaProductos() {
		return isPermisoNuevoEstadisticaProductos;
	}

	public void setIsPermisoNuevoEstadisticaProductos(Boolean isPermisoNuevoEstadisticaProductos) {
		this.isPermisoNuevoEstadisticaProductos = isPermisoNuevoEstadisticaProductos;
	}

	public Boolean getIsPermisoActualizarEstadisticaProductos() {
		return isPermisoActualizarEstadisticaProductos;
	}

	public void setIsPermisoActualizarEstadisticaProductos(Boolean isPermisoActualizarEstadisticaProductos) {
		this.isPermisoActualizarEstadisticaProductos = isPermisoActualizarEstadisticaProductos;
	}

	public Boolean getIsPermisoEliminarEstadisticaProductos() {
		return isPermisoEliminarEstadisticaProductos;
	}

	public void setIsPermisoEliminarEstadisticaProductos(Boolean isPermisoEliminarEstadisticaProductos) {
		this.isPermisoEliminarEstadisticaProductos = isPermisoEliminarEstadisticaProductos;
	}

	public Boolean getIsPermisoGuardarCambiosEstadisticaProductos() {
		return isPermisoGuardarCambiosEstadisticaProductos;
	}

	public void setIsPermisoGuardarCambiosEstadisticaProductos(Boolean isPermisoGuardarCambiosEstadisticaProductos) {
		this.isPermisoGuardarCambiosEstadisticaProductos = isPermisoGuardarCambiosEstadisticaProductos;
	}
	
	public Boolean getIsPermisoConsultaEstadisticaProductos() {
		return isPermisoConsultaEstadisticaProductos;
	}

	public void setIsPermisoConsultaEstadisticaProductos(Boolean isPermisoConsultaEstadisticaProductos) {
		this.isPermisoConsultaEstadisticaProductos = isPermisoConsultaEstadisticaProductos;
	}

	public Boolean getIsPermisoBusquedaEstadisticaProductos() {
		return isPermisoBusquedaEstadisticaProductos;
	}

	public void setIsPermisoBusquedaEstadisticaProductos(Boolean isPermisoBusquedaEstadisticaProductos) {
		this.isPermisoBusquedaEstadisticaProductos = isPermisoBusquedaEstadisticaProductos;
	}

	public Boolean getIsPermisoReporteEstadisticaProductos() {
		return isPermisoReporteEstadisticaProductos;
	}

	public void setIsPermisoReporteEstadisticaProductos(Boolean isPermisoReporteEstadisticaProductos) {
		this.isPermisoReporteEstadisticaProductos = isPermisoReporteEstadisticaProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadisticaProductos() {
		return isPermisoPaginacionMedioEstadisticaProductos;
	}

	public void setIsPermisoPaginacionMedioEstadisticaProductos(Boolean isPermisoPaginacionMedioEstadisticaProductos) {
		this.isPermisoPaginacionMedioEstadisticaProductos = isPermisoPaginacionMedioEstadisticaProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadisticaProductos() {
		return isPermisoPaginacionTodoEstadisticaProductos;
	}

	public void setIsPermisoPaginacionTodoEstadisticaProductos(Boolean isPermisoPaginacionTodoEstadisticaProductos) {
		this.isPermisoPaginacionTodoEstadisticaProductos = isPermisoPaginacionTodoEstadisticaProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadisticaProductos() {
		return isPermisoPaginacionAltoEstadisticaProductos;
	}

	public void setIsPermisoPaginacionAltoEstadisticaProductos(Boolean isPermisoPaginacionAltoEstadisticaProductos) {
		this.isPermisoPaginacionAltoEstadisticaProductos = isPermisoPaginacionAltoEstadisticaProductos;
	}
	
	public Boolean getIsPermisoCopiarEstadisticaProductos() {
		return isPermisoCopiarEstadisticaProductos;
	}

	public void setIsPermisoCopiarEstadisticaProductos(Boolean isPermisoCopiarEstadisticaProductos) {
		this.isPermisoCopiarEstadisticaProductos = isPermisoCopiarEstadisticaProductos;
	}
	
	public Boolean getIsPermisoVerFormEstadisticaProductos() {
		return isPermisoVerFormEstadisticaProductos;
	}

	public void setIsPermisoVerFormEstadisticaProductos(Boolean isPermisoVerFormEstadisticaProductos) {
		this.isPermisoVerFormEstadisticaProductos = isPermisoVerFormEstadisticaProductos;
	}
	
	public Boolean getIsPermisoDuplicarEstadisticaProductos() {
		return isPermisoDuplicarEstadisticaProductos;
	}

	public void setIsPermisoDuplicarEstadisticaProductos(Boolean isPermisoDuplicarEstadisticaProductos) {
		this.isPermisoDuplicarEstadisticaProductos = isPermisoDuplicarEstadisticaProductos;
	}
	
	public Boolean getIsPermisoOrdenEstadisticaProductos() {
		return isPermisoOrdenEstadisticaProductos;
	}

	public void setIsPermisoOrdenEstadisticaProductos(Boolean isPermisoOrdenEstadisticaProductos) {
		this.isPermisoOrdenEstadisticaProductos = isPermisoOrdenEstadisticaProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadisticaProductos() {
		return isVisibilidadCeldaNuevoEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaNuevoEstadisticaProductos(Boolean isVisibilidadCeldaNuevoEstadisticaProductos) {
		this.isVisibilidadCeldaNuevoEstadisticaProductos = isVisibilidadCeldaNuevoEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadisticaProductos() {
		return isVisibilidadCeldaDuplicarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaDuplicarEstadisticaProductos(Boolean isVisibilidadCeldaDuplicarEstadisticaProductos) {
		this.isVisibilidadCeldaDuplicarEstadisticaProductos = isVisibilidadCeldaDuplicarEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadisticaProductos() {
		return isVisibilidadCeldaCopiarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaCopiarEstadisticaProductos(Boolean isVisibilidadCeldaCopiarEstadisticaProductos) {
		this.isVisibilidadCeldaCopiarEstadisticaProductos = isVisibilidadCeldaCopiarEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadisticaProductos() {
		return isVisibilidadCeldaVerFormEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaVerFormEstadisticaProductos(Boolean isVisibilidadCeldaVerFormEstadisticaProductos) {
		this.isVisibilidadCeldaVerFormEstadisticaProductos = isVisibilidadCeldaVerFormEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadisticaProductos() {
		return isVisibilidadCeldaOrdenEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaOrdenEstadisticaProductos(Boolean isVisibilidadCeldaOrdenEstadisticaProductos) {
		this.isVisibilidadCeldaOrdenEstadisticaProductos = isVisibilidadCeldaOrdenEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadisticaProductos() {
		return isVisibilidadCeldaNuevoRelacionesEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadisticaProductos(Boolean isVisibilidadCeldaNuevoRelacionesEstadisticaProductos) {
		this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos = isVisibilidadCeldaNuevoRelacionesEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadisticaProductos() {
		return isVisibilidadCeldaModificarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaModificarEstadisticaProductos(Boolean isVisibilidadCeldaModificarEstadisticaProductos) {
		this.isVisibilidadCeldaModificarEstadisticaProductos = isVisibilidadCeldaModificarEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadisticaProductos() {
		return isVisibilidadCeldaActualizarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaActualizarEstadisticaProductos(Boolean isVisibilidadCeldaActualizarEstadisticaProductos) {
		this.isVisibilidadCeldaActualizarEstadisticaProductos = isVisibilidadCeldaActualizarEstadisticaProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadisticaProductos() {
		return isVisibilidadCeldaEliminarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaEliminarEstadisticaProductos(Boolean isVisibilidadCeldaEliminarEstadisticaProductos) {
		this.isVisibilidadCeldaEliminarEstadisticaProductos = isVisibilidadCeldaEliminarEstadisticaProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadisticaProductos() {
		return isVisibilidadCeldaCancelarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaCancelarEstadisticaProductos(Boolean isVisibilidadCeldaCancelarEstadisticaProductos) {
		this.isVisibilidadCeldaCancelarEstadisticaProductos = isVisibilidadCeldaCancelarEstadisticaProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadisticaProductos() {
		return isVisibilidadCeldaGuardarEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaGuardarEstadisticaProductos(Boolean isVisibilidadCeldaGuardarEstadisticaProductos) {
		this.isVisibilidadCeldaGuardarEstadisticaProductos = isVisibilidadCeldaGuardarEstadisticaProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadisticaProductos() {
		return isVisibilidadCeldaGuardarCambiosEstadisticaProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadisticaProductos(Boolean isVisibilidadCeldaGuardarCambiosEstadisticaProductos) {
		this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos = isVisibilidadCeldaGuardarCambiosEstadisticaProductos;
	}
		
	public EstadisticaProductosSessionBean getestadisticaproductosSessionBean() {
		return this.estadisticaproductosSessionBean;
	}
	
	public void setestadisticaproductosSessionBean(EstadisticaProductosSessionBean estadisticaproductosSessionBean) {
		this.estadisticaproductosSessionBean=estadisticaproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaEstadisticaProductos() {
		return this.isVisibilidadBusquedaEstadisticaProductos;
	}

	public void setisVisibilidadBusquedaEstadisticaProductos(Boolean isVisibilidadBusquedaEstadisticaProductos) {
		this.isVisibilidadBusquedaEstadisticaProductos=isVisibilidadBusquedaEstadisticaProductos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(EstadisticaProductos estadisticaproductos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(estadisticaproductos,null);
				this.setActualParaGuardarSucursalForeignKey(estadisticaproductos,null);
				this.setActualParaGuardarProductoForeignKey(estadisticaproductos,null);
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
	
	public void bugActualizarReferenciaActual(EstadisticaProductos estadisticaproductos,EstadisticaProductos estadisticaproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadisticaProductos(estadisticaproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadisticaproductosAux.setId(estadisticaproductos.getId());
		estadisticaproductosAux.setVersionRow(estadisticaproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(EstadisticaProductos estadisticaproductosLocal) throws Exception {
		
		if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadisticaProductos estadisticaproductosLocal) throws Exception {	
		if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				estadisticaproductosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				estadisticaproductosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				estadisticaproductosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEstadisticaProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadisticaproductosValidator.getInvalidValues(this.estadisticaproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadisticaProductos estadisticaproductos,List<EstadisticaProductos> estadisticaproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(EstadisticaProductos estadisticaproductos,List<EstadisticaProductos> estadisticaproductoss) throws Exception {
		try	{			
			EstadisticaProductosConstantesFunciones.actualizarSelectedLista(estadisticaproductos,estadisticaproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadisticaProductos> estadisticaproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadisticaproductossLocal=this.estadisticaproductosLogic.getEstadisticaProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadisticaproductossLocal=this.estadisticaproductoss;
			}
			//ARCHITECTURE
		
			for(EstadisticaProductos estadisticaproductosLocal:estadisticaproductossLocal) {
				if(this.permiteMantenimiento(estadisticaproductosLocal) && estadisticaproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadisticaProductosConstantesFunciones.getEstadisticaProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadisticaProductosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcodigo_productoEstadisticaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadisticaProductosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelnombre_productoEstadisticaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadisticaProductosConstantesFunciones.CANTIDADPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcantidad_precioEstadisticaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadisticaProductosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcantidadEstadisticaProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcodigo_productoEstadisticaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelnombre_productoEstadisticaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcantidad_precioEstadisticaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcantidadEstadisticaProductos,"");
		
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
		this.iIdNuevoEstadisticaProductos--;	
		
		
		this.estadisticaproductosAux=new EstadisticaProductos();
		
		this.estadisticaproductosAux.setId(this.iIdNuevoEstadisticaProductos);
		this.estadisticaproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadisticaproductosLogic.getEstadisticaProductoss().add(this.estadisticaproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadisticaproductoss.add(this.estadisticaproductosAux);
		}
		//ARCHITECTURE
		
		this.estadisticaproductos=this.estadisticaproductosAux;
		
		if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadisticaProductos(this.estadisticaproductos);
		}
				
		//this.setDefaultControlesEstadisticaProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadisticaProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadisticaProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadisticaProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadisticaProductos(this.estadisticaproductosBean,this.estadisticaproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadisticaProductos(this.estadisticaproductosReturnGeneral,this.estadisticaproductosBean,false);
		
		if(this.estadisticaproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadisticaProductos(this.estadisticaproductosReturnGeneral.getEstadisticaProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductosReturnGeneral.getEstadisticaProductos());
		}
		
		if(this.estadisticaproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductosReturnGeneral.getEstadisticaProductos(),classes);//this.estadisticaproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadisticaProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadisticaProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.RecargarFormEstadisticaProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadisticaProductos(false);
						
			if(estadisticaproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadisticaProductos();
			}
			
			this.actualizarVisualTableDatosEstadisticaProductos();
			
			this.jTableDatosEstadisticaProductos.setRowSelectionInterval(this.getIndiceNuevoEstadisticaProductos(), this.getIndiceNuevoEstadisticaProductos());
			
			this.seleccionarFilaTablaEstadisticaProductosActual();
						
			this.actualizarEstadoCeldasBotonesEstadisticaProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadisticaProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_inicioEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarfecha_inicioEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_finEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarfecha_finEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarcodigo_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarnombre_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarcantidad_precioEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarcantidadEstadisticaProductos);	
		//
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarid_empresaEstadisticaProductos);//
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarid_sucursalEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setEnabled(isHabilitar && this.estadisticaproductosConstantesFunciones.activarid_productoEstadisticaProductos);
	};
	
	public void setDefaultControlesEstadisticaProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadisticaProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadisticaproductosSessionBean.setConGuardarRelaciones(true);			
			this.estadisticaproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.setVisible(true);
			
					
		} else {
			//this.estadisticaproductosSessionBean.setConGuardarRelaciones(false);			
			this.estadisticaproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadisticaProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
				if(estadisticaproductosAux.getId().equals(this.iIdNuevoEstadisticaProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductoss) {
				if(estadisticaproductosAux.getId().equals(this.iIdNuevoEstadisticaProductos)) {
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
	
	public int getIndiceActualEstadisticaProductos(EstadisticaProductos estadisticaproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
				if(estadisticaproductosAux.getId().equals(estadisticaproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductoss) {
				if(estadisticaproductosAux.getId().equals(estadisticaproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadisticaProductos(EstadisticaProductos estadisticaproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
				if(estadisticaproductosAux.getEstadisticaProductosOriginal().getId().equals(estadisticaproductosOriginal.getId())) {
					existe=true;
					estadisticaproductosOriginal.setId(estadisticaproductosAux.getId());
					estadisticaproductosOriginal.setVersionRow(estadisticaproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductoss) {
				if(estadisticaproductosAux.getEstadisticaProductosOriginal().getId().equals(estadisticaproductosOriginal.getId())) {
					existe=true;
					estadisticaproductosOriginal.setId(estadisticaproductosAux.getId());
					estadisticaproductosOriginal.setVersionRow(estadisticaproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadisticaProductos(Boolean esParaCancelar) throws Exception {
		estadisticaproductossAux=new ArrayList<EstadisticaProductos>();
		estadisticaproductosAux=new EstadisticaProductos();
		
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
					if(estadisticaproductosAux.getId()<0) {
						estadisticaproductossAux.add(estadisticaproductosAux);
					}		
				}
				this.iIdNuevoEstadisticaProductos=0L;
				this.estadisticaproductosLogic.getEstadisticaProductoss().removeAll(estadisticaproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductoss) {
					if(estadisticaproductosAux.getId()<0) {
						estadisticaproductossAux.add(estadisticaproductosAux);
					}		
				}
				this.iIdNuevoEstadisticaProductos=0L;
				this.estadisticaproductoss.removeAll(estadisticaproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadisticaProductos 
					&& this.estadisticaproductosLogic.getEstadisticaProductoss().size()>0
					) {
					estadisticaproductosAux=this.estadisticaproductosLogic.getEstadisticaProductoss().get(this.estadisticaproductosLogic.getEstadisticaProductoss().size() - 1);
				
					if(estadisticaproductosAux.getId()<0) {
						this.estadisticaproductosLogic.getEstadisticaProductoss().remove(estadisticaproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadisticaProductos && this.estadisticaproductoss.size()>0) {
					estadisticaproductosAux=this.estadisticaproductoss.get(this.estadisticaproductoss.size() - 1);
				
					if(estadisticaproductosAux.getId()<0) {
						this.estadisticaproductoss.remove(estadisticaproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadisticaProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadisticaproductos.getId()<0) {
				this.estadisticaproductosLogic.getEstadisticaProductoss().remove(this.estadisticaproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadisticaproductos.getId()<0) {
				this.estadisticaproductoss.remove(this.estadisticaproductos);
			}
		}			
	}
	
	public void setEstadosInicialesEstadisticaProductos(List<EstadisticaProductos> estadisticaproductossAux) throws Exception {
		EstadisticaProductosConstantesFunciones.setEstadosInicialesEstadisticaProductos(estadisticaproductossAux);
	}
	
	public void setEstadosInicialesEstadisticaProductos(EstadisticaProductos estadisticaproductosAux) throws Exception {
		EstadisticaProductosConstantesFunciones.setEstadosInicialesEstadisticaProductos(estadisticaproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadisticaProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadisticaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadisticaProductosActual()) {
				if(!this.isEsNuevoEstadisticaProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadisticaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadisticaProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadisticaProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estadistica Productos ?", "MANTENIMIENTO DE Estadistica Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadisticaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadisticaProductos estadisticaproductos) throws Exception {
		EstadisticaProductosConstantesFunciones.seleccionarAsignar(this.estadisticaproductos,estadisticaproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadisticaProductos=this.isPermisoActualizarOriginalEstadisticaProductos;
			
			
			this.seleccionarAsignar(estadisticaproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesEstadisticaProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadisticaproductosSessionBean.setsFuncionBusquedaRapida(this.estadisticaproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadisticaProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadisticaProductos(esParaCancelar);				
				this.cancelarNuevoEstadisticaProductos(esParaCancelar);								
			}
			
			this.estadisticaproductos=new EstadisticaProductos();
			
			this.inicializarEstadisticaProductos();
			
			this.actualizarEstadoCeldasBotonesEstadisticaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadisticaProductos() throws Exception {
		try {
			EstadisticaProductosConstantesFunciones.inicializarEstadisticaProductos(this.estadisticaproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadisticaproductosLogic.getEstadisticaProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadisticaProductoss(String sAccionBusqueda,List<EstadisticaProductos> estadisticaproductossParaReportes) throws Exception {
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
					sPathReporteFinal="EstadisticaProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadisticaProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadisticaProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadisticaProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estadistica Productoses");		
		parameters.put("busquedapor", EstadisticaProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadisticaProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadisticaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadisticaProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadisticaProductos=new JRBeanArrayDataSource(EstadisticaProductosJInternalFrame.TraerEstadisticaProductosBeans(estadisticaproductossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadisticaProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadisticaProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadisticaProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadisticaProductosBean.TraerEstadisticaProductosBeans(estadisticaproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadisticaProductoss(sAccionBusqueda,sTipoArchivoReporte,estadisticaproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadisticaProductoss(sAccionBusqueda,sTipoArchivoReporte,estadisticaproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadisticaProductosActionPerformed(null);
					//this.generarExcelReporteEstadisticaProductoss(sAccionBusqueda,sTipoArchivoReporte,estadisticaproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadisticaProductoss(sAccionBusqueda,sTipoArchivoReporte,estadisticaproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadisticaProductoss(sAccionBusqueda,sTipoArchivoReporte,estadisticaproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadisticaProductoss(sAccionBusqueda,sTipoArchivoReporte,estadisticaproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadisticaProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadisticaProductos> estadisticaproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadisticaProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadisticaProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadisticaProductos estadisticaproductos : estadisticaproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadisticaProductosConstantesFunciones.generarExcelReporteDataEstadisticaProductos("NORMAL",row,workbook,estadisticaproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadisticaProductos(String sTipo,Row row,Workbook workbook) {
		
		EstadisticaProductosConstantesFunciones.generarExcelReporteHeaderEstadisticaProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadisticaProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadisticaProductos> estadisticaproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadisticaProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadisticaProductos estadisticaproductos : estadisticaproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadisticaProductosConstantesFunciones.getEstadisticaProductosDescripcion(estadisticaproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getcantidad_precio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadisticaproductos.getcantidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadisticaProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadisticaProductos> estadisticaproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadisticaProductos> estadisticaproductossRespaldo=null;
		
		classes=EstadisticaProductosConstantesFunciones.getClassesRelationshipsOfEstadisticaProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadisticaproductosLogic.setDatosCliente(this.datosCliente);
		this.estadisticaproductosLogic.setDatosDeep(this.datosDeep);
		this.estadisticaproductosLogic.setIsConDeep(true);
		
		estadisticaproductossRespaldo=this.estadisticaproductosLogic.getEstadisticaProductoss();
		
		this.estadisticaproductosLogic.setEstadisticaProductoss(estadisticaproductossParaReportes);	
		this.estadisticaproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadisticaproductossParaReportes=this.estadisticaproductosLogic.getEstadisticaProductoss();
		this.estadisticaproductosLogic.setEstadisticaProductoss(estadisticaproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadisticaProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadisticaProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadisticaProductos estadisticaproductos : estadisticaproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadisticaProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadisticaProductosConstantesFunciones.generarExcelReporteDataEstadisticaProductos("NORMAL",row,workbook,estadisticaproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadisticaProductosConstantesFunciones.getEstadisticaProductosDescripcion(estadisticaproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadisticaProductos() throws Exception {		
		this.startProcessEstadisticaProductos(true);
	}
	
	public void startProcessEstadisticaProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEstadisticaProductos ,this.jPanelParametrosReportesEstadisticaProductos, this.jScrollPanelDatosEstadisticaProductos,this.jPanelPaginacionEstadisticaProductos, this.jScrollPanelDatosEdicionEstadisticaProductos, this.jPanelAccionesEstadisticaProductos,this.jPanelAccionesFormularioEstadisticaProductos,this.jmenuBarEstadisticaProductos,this.jmenuBarDetalleEstadisticaProductos,this.jTtoolBarEstadisticaProductos,this.jTtoolBarDetalleEstadisticaProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadisticaProductos=this.jTabbedPaneBusquedasEstadisticaProductos; 
		
		final JPanel jPanelParametrosReportesEstadisticaProductos=this.jPanelParametrosReportesEstadisticaProductos;
		//final JScrollPane jScrollPanelDatosEstadisticaProductos=this.jScrollPanelDatosEstadisticaProductos;
		final JTable jTableDatosEstadisticaProductos=this.jTableDatosEstadisticaProductos;		
		final JPanel jPanelPaginacionEstadisticaProductos=this.jPanelPaginacionEstadisticaProductos;
		//final JScrollPane jScrollPanelDatosEdicionEstadisticaProductos=this.jScrollPanelDatosEdicionEstadisticaProductos;
		final JPanel jPanelAccionesEstadisticaProductos=this.jPanelAccionesEstadisticaProductos;
		
		JPanel jPanelCamposAuxiliarEstadisticaProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadisticaProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			jPanelCamposAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jPanelCamposEstadisticaProductos;
			jPanelAccionesFormularioAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jPanelAccionesFormularioEstadisticaProductos;
		}
		
		final JPanel jPanelCamposEstadisticaProductos=jPanelCamposAuxiliarEstadisticaProductos;
		final JPanel jPanelAccionesFormularioEstadisticaProductos=jPanelAccionesFormularioAuxiliarEstadisticaProductos;
		
		
		final JMenuBar jmenuBarEstadisticaProductos=this.jmenuBarEstadisticaProductos;
		final JToolBar jTtoolBarEstadisticaProductos=this.jTtoolBarEstadisticaProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadisticaProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadisticaProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			jmenuBarDetalleAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jmenuBarDetalleEstadisticaProductos;
			jTtoolBarDetalleAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jTtoolBarDetalleEstadisticaProductos;
		}
		
		final JMenuBar jmenuBarDetalleEstadisticaProductos=jmenuBarDetalleAuxiliarEstadisticaProductos;
		final JToolBar jTtoolBarDetalleEstadisticaProductos=jTtoolBarDetalleAuxiliarEstadisticaProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadisticaProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadisticaProductos;
			processRunnable.jTableDatos=jTableDatosEstadisticaProductos;
			processRunnable.jPanelCampos=jPanelCamposEstadisticaProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadisticaProductos;
			processRunnable.jPanelAcciones=jPanelAccionesEstadisticaProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadisticaProductos;
			
			
			processRunnable.jmenuBar=jmenuBarEstadisticaProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadisticaProductos;
			processRunnable.jTtoolBar=jTtoolBarEstadisticaProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadisticaProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadisticaProductos ,jPanelParametrosReportesEstadisticaProductos,jTableDatosEstadisticaProductos, /*jScrollPanelDatosEstadisticaProductos,*/jPanelCamposEstadisticaProductos,jPanelPaginacionEstadisticaProductos, /*jScrollPanelDatosEdicionEstadisticaProductos,*/ jPanelAccionesEstadisticaProductos,jPanelAccionesFormularioEstadisticaProductos,jmenuBarEstadisticaProductos,jmenuBarDetalleEstadisticaProductos,jTtoolBarEstadisticaProductos,jTtoolBarDetalleEstadisticaProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadisticaProductos ,jPanelParametrosReportesEstadisticaProductos, jScrollPanelDatosEstadisticaProductos,jPanelPaginacionEstadisticaProductos, jScrollPanelDatosEdicionEstadisticaProductos, jPanelAccionesEstadisticaProductos,jPanelAccionesFormularioEstadisticaProductos,jmenuBarEstadisticaProductos,jmenuBarDetalleEstadisticaProductos,jTtoolBarEstadisticaProductos,jTtoolBarDetalleEstadisticaProductos);
						
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
	
	public void finishProcessEstadisticaProductos() {// throws Exception 
		this.finishProcessEstadisticaProductos(true);
	}
	
	public void finishProcessEstadisticaProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEstadisticaProductos ,this.jPanelParametrosReportesEstadisticaProductos, this.jScrollPanelDatosEstadisticaProductos,this.jPanelPaginacionEstadisticaProductos, this.jScrollPanelDatosEdicionEstadisticaProductos, this.jPanelAccionesEstadisticaProductos,this.jPanelAccionesFormularioEstadisticaProductos,this.jmenuBarEstadisticaProductos,this.jmenuBarDetalleEstadisticaProductos,this.jTtoolBarEstadisticaProductos,this.jTtoolBarDetalleEstadisticaProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadisticaProductos=this.jTabbedPaneBusquedasEstadisticaProductos; 
		
		final JPanel jPanelParametrosReportesEstadisticaProductos=this.jPanelParametrosReportesEstadisticaProductos;
		//final JScrollPane jScrollPanelDatosEstadisticaProductos=this.jScrollPanelDatosEstadisticaProductos;
		final JTable jTableDatosEstadisticaProductos=this.jTableDatosEstadisticaProductos;		
		final JPanel jPanelPaginacionEstadisticaProductos=this.jPanelPaginacionEstadisticaProductos;
		//final JScrollPane jScrollPanelDatosEdicionEstadisticaProductos=this.jScrollPanelDatosEdicionEstadisticaProductos;
		final JPanel jPanelAccionesEstadisticaProductos=this.jPanelAccionesEstadisticaProductos;
		
		JPanel jPanelCamposAuxiliarEstadisticaProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadisticaProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			jPanelCamposAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jPanelCamposEstadisticaProductos;
			jPanelAccionesFormularioAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jPanelAccionesFormularioEstadisticaProductos;
		}
		
		final JPanel jPanelCamposEstadisticaProductos=jPanelCamposAuxiliarEstadisticaProductos;
		final JPanel jPanelAccionesFormularioEstadisticaProductos=jPanelAccionesFormularioAuxiliarEstadisticaProductos;
		
		
		final JMenuBar jmenuBarEstadisticaProductos=this.jmenuBarEstadisticaProductos;		
		final JToolBar jTtoolBarEstadisticaProductos=this.jTtoolBarEstadisticaProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadisticaProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadisticaProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			jmenuBarDetalleAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jmenuBarDetalleEstadisticaProductos;
			jTtoolBarDetalleAuxiliarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jTtoolBarDetalleEstadisticaProductos;		
		}
		
		final JMenuBar jmenuBarDetalleEstadisticaProductos=jmenuBarDetalleAuxiliarEstadisticaProductos;
		final JToolBar jTtoolBarDetalleEstadisticaProductos=jTtoolBarDetalleAuxiliarEstadisticaProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadisticaProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadisticaProductos;
			processRunnable.jTableDatos=jTableDatosEstadisticaProductos;
			processRunnable.jPanelCampos=jPanelCamposEstadisticaProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadisticaProductos;
			processRunnable.jPanelAcciones=jPanelAccionesEstadisticaProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadisticaProductos;
			
			
			processRunnable.jmenuBar=jmenuBarEstadisticaProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadisticaProductos;
			processRunnable.jTtoolBar=jTtoolBarEstadisticaProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadisticaProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadisticaProductos ,jPanelParametrosReportesEstadisticaProductos, jTableDatosEstadisticaProductos,/*jScrollPanelDatosEstadisticaProductos,*/jPanelCamposEstadisticaProductos,jPanelPaginacionEstadisticaProductos, /*jScrollPanelDatosEdicionEstadisticaProductos,*/ jPanelAccionesEstadisticaProductos,jPanelAccionesFormularioEstadisticaProductos,jmenuBarEstadisticaProductos,jmenuBarDetalleEstadisticaProductos,jTtoolBarEstadisticaProductos,jTtoolBarDetalleEstadisticaProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadisticaProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadisticaProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadisticaProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadisticaProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadisticaProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadisticaProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadisticaProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadisticaProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadisticaProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadisticaproductosConstantesFunciones.getsFinalQueryEstadisticaProductos();
		String  finalQueryPaginacionTodos=this.estadisticaproductosConstantesFunciones.getsFinalQueryEstadisticaProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadisticaProductosConstantesFunciones.getArrayColumnasGlobalesNoEstadisticaProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadisticaProductosConstantesFunciones.getArrayColumnasGlobalesEstadisticaProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadisticaProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadisticaproductossEliminados= new ArrayList<EstadisticaProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadisticaProductos();
		
				///*EstadisticaProductosSessionBean*/this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
			
			if(this.estadisticaproductosSessionBean==null) {
				this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
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
					this.iNumeroPaginacion=EstadisticaProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadisticaProductosConstantesFunciones.getClassesForeignKeysOfEstadisticaProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadisticaproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadisticaproductossAux= new ArrayList<EstadisticaProductos>();
			
				
			estadisticaproductosLogic.setDatosCliente(this.datosCliente);
			estadisticaproductosLogic.setDatosDeep(this.datosDeep);
			estadisticaproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaEstadisticaProductos")) {
				this.sDetalleReporte=EstadisticaProductosConstantesFunciones.getDetalleIndiceBusquedaEstadisticaProductos(id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					estadisticaproductosLogic.getEstadisticaProductossBusquedaEstadisticaProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadisticaProductosConstantesFunciones.getDetalleIndiceBusquedaEstadisticaProductos(id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadisticaProductosConstantesFunciones.getDetalleIndiceBusquedaEstadisticaProductos(id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=estadisticaproductosLogic.getEstadisticaProductoss()==null||estadisticaproductosLogic.getEstadisticaProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=estadisticaproductoss==null|| estadisticaproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						estadisticaproductossAux=new ArrayList<EstadisticaProductos>();
						estadisticaproductossAux.addAll(estadisticaproductosLogic.getEstadisticaProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadisticaproductossAux=new ArrayList<EstadisticaProductos>();
							estadisticaproductossAux.addAll(estadisticaproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							estadisticaproductosLogic.getEstadisticaProductossBusquedaEstadisticaProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EstadisticaProductosConstantesFunciones.getDetalleIndiceBusquedaEstadisticaProductos(id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EstadisticaProductosConstantesFunciones.getDetalleIndiceBusquedaEstadisticaProductos(id_productoBusquedaEstadisticaProductos,fecha_inicioBusquedaEstadisticaProductos,fecha_finBusquedaEstadisticaProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEstadisticaProductoss("BusquedaEstadisticaProductos",estadisticaproductosLogic.getEstadisticaProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEstadisticaProductoss("BusquedaEstadisticaProductos",estadisticaproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						estadisticaproductosLogic.setEstadisticaProductoss(new ArrayList<EstadisticaProductos>());
						estadisticaproductosLogic.getEstadisticaProductoss().addAll(estadisticaproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadisticaproductoss=new ArrayList<EstadisticaProductos>();
							estadisticaproductoss.addAll(estadisticaproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadisticaProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadisticaProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadisticaproductosLogic.getEstadisticaProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadisticaproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadisticaproductosLogic.getEstadisticaProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadisticaproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadisticaProductos estadisticaproductos) {
		Boolean permite=true;
		
		if(this.estadisticaproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadisticaProductosConstantesFunciones.getOrderByListaEstadisticaProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadisticaProductosConstantesFunciones.getOrderByListaEstadisticaProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadisticaProductos estadisticaproductos:estadisticaproductosLogic.getEstadisticaProductoss()) {
				if(estadisticaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					estadisticaproductosTotales=estadisticaproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadisticaProductos estadisticaproductos:this.estadisticaproductoss) {
				if(estadisticaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					estadisticaproductosTotales=estadisticaproductos;
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
			this.estadisticaproductosAux=new EstadisticaProductos();
			this.estadisticaproductosAux.setsType(Constantes2.S_TOTALES);
			this.estadisticaproductosAux.setIsNew(false);
			this.estadisticaproductosAux.setIsChanged(false);
			this.estadisticaproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//EstadisticaProductosConstantesFunciones.TotalizarValoresFilaEstadisticaProductos(this.estadisticaproductosLogic.getEstadisticaProductoss(),this.estadisticaproductosAux);
				
				//this.estadisticaproductosLogic.getEstadisticaProductoss().add(this.estadisticaproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadisticaProductosConstantesFunciones.TotalizarValoresFilaEstadisticaProductos(this.estadisticaproductoss,this.estadisticaproductosAux);
				
				this.estadisticaproductoss.add(this.estadisticaproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadisticaproductosTotales=new EstadisticaProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadisticaproductosLogic.getEstadisticaProductoss().remove(estadisticaproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadisticaproductoss.remove(estadisticaproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadisticaproductosTotales=new EstadisticaProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadisticaProductos estadisticaproductos:estadisticaproductosLogic.getEstadisticaProductoss()) {
				if(estadisticaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					estadisticaproductosTotales=estadisticaproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadisticaProductosConstantesFunciones.TotalizarValoresFilaEstadisticaProductos(this.estadisticaproductosLogic.getEstadisticaProductoss(),estadisticaproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadisticaProductos estadisticaproductos:this.estadisticaproductoss) {
				if(estadisticaproductos.getsType().equals(Constantes2.S_TOTALES)) {
					estadisticaproductosTotales=estadisticaproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadisticaProductosConstantesFunciones.TotalizarValoresFilaEstadisticaProductos(this.estadisticaproductoss,estadisticaproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadisticaProductossBusquedaEstadisticaProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaEstadisticaProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadisticaProductossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadisticaProductossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEstadisticaProductossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEstadisticaProductossBusquedaEstadisticaProductos(String sFinalQuery,Long id_producto,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadisticaproductosLogic.getEstadisticaProductossBusquedaEstadisticaProductos(sFinalQuery,this.pagination,id_producto,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadisticaProductossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadisticaproductosLogic.getEstadisticaProductossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadisticaProductossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadisticaproductosLogic.getEstadisticaProductossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEstadisticaProductossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadisticaproductosLogic.getEstadisticaProductossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosEstadisticaProductos() {
		this.isPermisoTodoEstadisticaProductos=false;
		this.isPermisoNuevoEstadisticaProductos=false;
		this.isPermisoActualizarEstadisticaProductos=false;
		this.isPermisoActualizarOriginalEstadisticaProductos=false;
		this.isPermisoEliminarEstadisticaProductos=false;
		this.isPermisoGuardarCambiosEstadisticaProductos=false;
		this.isPermisoConsultaEstadisticaProductos=true;
		this.isPermisoBusquedaEstadisticaProductos=true;
		this.isPermisoReporteEstadisticaProductos=true;
		this.isPermisoOrdenEstadisticaProductos=false;		
		this.isPermisoPaginacionMedioEstadisticaProductos=false;		
		this.isPermisoPaginacionAltoEstadisticaProductos=false;		
		this.isPermisoPaginacionTodoEstadisticaProductos=false;		
		this.isPermisoCopiarEstadisticaProductos=false;		
		this.isPermisoVerFormEstadisticaProductos=false;		
		this.isPermisoDuplicarEstadisticaProductos=false;
		this.isPermisoOrdenEstadisticaProductos=false;
	}
	
	public void setPermisosUsuarioEstadisticaProductos(Boolean isPermiso) {
		this.isPermisoTodoEstadisticaProductos=isPermiso;
		this.isPermisoNuevoEstadisticaProductos=isPermiso;
		this.isPermisoActualizarEstadisticaProductos=isPermiso;
		this.isPermisoActualizarOriginalEstadisticaProductos=isPermiso;
		this.isPermisoEliminarEstadisticaProductos=isPermiso;
		this.isPermisoGuardarCambiosEstadisticaProductos=isPermiso;
		this.isPermisoConsultaEstadisticaProductos=isPermiso;
		this.isPermisoBusquedaEstadisticaProductos=isPermiso;
		this.isPermisoReporteEstadisticaProductos=isPermiso;
		this.isPermisoOrdenEstadisticaProductos=isPermiso;		
		this.isPermisoPaginacionMedioEstadisticaProductos=isPermiso;		
		this.isPermisoPaginacionAltoEstadisticaProductos=isPermiso;		
		this.isPermisoPaginacionTodoEstadisticaProductos=isPermiso;		
		this.isPermisoCopiarEstadisticaProductos=isPermiso;		
		this.isPermisoVerFormEstadisticaProductos=isPermiso;		
		this.isPermisoDuplicarEstadisticaProductos=isPermiso;
		this.isPermisoOrdenEstadisticaProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadisticaProductos(Boolean isPermiso) {
		//this.isPermisoTodoEstadisticaProductos=isPermiso;
		this.isPermisoNuevoEstadisticaProductos=isPermiso;
		this.isPermisoActualizarEstadisticaProductos=isPermiso;
		this.isPermisoActualizarOriginalEstadisticaProductos=isPermiso;
		this.isPermisoEliminarEstadisticaProductos=isPermiso;
		this.isPermisoGuardarCambiosEstadisticaProductos=isPermiso;
		//this.isPermisoConsultaEstadisticaProductos=isPermiso;
		//this.isPermisoBusquedaEstadisticaProductos=isPermiso;
		//this.isPermisoReporteEstadisticaProductos=isPermiso;
		//this.isPermisoOrdenEstadisticaProductos=isPermiso;		
		//this.isPermisoPaginacionMedioEstadisticaProductos=isPermiso;		
		//this.isPermisoPaginacionAltoEstadisticaProductos=isPermiso;		
		//this.isPermisoPaginacionTodoEstadisticaProductos=isPermiso;		
		//this.isPermisoCopiarEstadisticaProductos=isPermiso;		
		//this.isPermisoDuplicarEstadisticaProductos=isPermiso;
		//this.isPermisoOrdenEstadisticaProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadisticaProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadisticaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadisticaProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadisticaProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadisticaProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadisticaProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadisticaProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadisticaProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadisticaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadisticaProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadisticaProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadisticaProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadisticaProductos=this.isPermisoActualizarEstadisticaProductos;
			this.isPermisoEliminarEstadisticaProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadisticaProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadisticaProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadisticaProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadisticaProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadisticaProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadisticaProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadisticaProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadisticaProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadisticaProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadisticaProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadisticaProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadisticaProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadisticaProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadisticaProductos.setToolTipText(this.jTableDatosEstadisticaProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadisticaProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadisticaProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadisticaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadisticaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadisticaProductos() throws Exception {
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
	public void inicializarCombosForeignKeyEstadisticaProductosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadisticaProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadisticaProductosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyEstadisticaProductos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.estadisticaproductosSessionBean==null) {
				this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean();
			}

			if(!this.estadisticaproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.estadisticaproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.estadisticaproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyEstadisticaProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadisticaProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadisticaProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadisticaProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadisticaProductos(EstadisticaProductos estadisticaproductos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadisticaProductos(EstadisticaProductos estadisticaproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadisticaProductos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadisticaProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadisticaProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadisticaProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadisticaProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadisticaProductos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadisticaProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadisticaProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EstadisticaProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadisticaProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadisticaProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadisticaproductosSessionBean=new EstadisticaProductosSessionBean(); 
		this.estadisticaproductosConstantesFunciones=new EstadisticaProductosConstantesFunciones(); 
		this.estadisticaproductosBean=new EstadisticaProductos();//(this.estadisticaproductosConstantesFunciones); 		
		this.estadisticaproductosReturnGeneral=new EstadisticaProductosParameterReturnGeneral(); 
		
		this.estadisticaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadisticaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadisticaProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadisticaProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadisticaProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadisticaProductos(true);
			
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
			
			this.estadisticaproductosConstantesFunciones=new EstadisticaProductosConstantesFunciones(); 
			this.estadisticaproductosBean=new EstadisticaProductos();//this.estadisticaproductosConstantesFunciones); 			
			this.estadisticaproductosReturnGeneral=new EstadisticaProductosParameterReturnGeneral(); 
		
			EstadisticaProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estadistica Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.estadisticaproductos=new EstadisticaProductos();
			this.estadisticaproductoss = new ArrayList<EstadisticaProductos>();
			this.estadisticaproductossAux = new ArrayList<EstadisticaProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic=new EstadisticaProductosLogic();
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estadisticaproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadisticaproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadisticaProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadisticaProductos);	
					}
					
					if(this.jInternalFrameImportacionEstadisticaProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadisticaProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadisticaProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadisticaProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadisticaProductos);
				this.jInternalFrameDetalleFormEstadisticaProductos.setVisible(false);
				this.jInternalFrameDetalleFormEstadisticaProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadisticaProductos);
					this.jInternalFrameReporteDinamicoEstadisticaProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadisticaProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadisticaProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadisticaProductos);
					this.jInternalFrameImportacionEstadisticaProductos.setVisible(false);
					this.jInternalFrameImportacionEstadisticaProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadisticaProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadisticaProductos);
					this.jInternalFrameOrderByEstadisticaProductos.setVisible(false);
					this.jInternalFrameOrderByEstadisticaProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadisticaProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadisticaProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadisticaproductosReturnGeneral=new EstadisticaProductosParameterReturnGeneral();
			
			this.estadisticaproductosParameterGeneral=new EstadisticaProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadisticaproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadisticaProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadisticaProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),this.estadisticaproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadisticaProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),this.estadisticaproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaDuplicarEstadisticaProductos=true;
			this.isVisibilidadCeldaCopiarEstadisticaProductos=true;
			this.isVisibilidadCeldaVerFormEstadisticaProductos=true;
			this.isVisibilidadCeldaOrdenEstadisticaProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
			this.isVisibilidadCeldaModificarEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
			
			
			this.isVisibilidadBusquedaEstadisticaProductos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadisticaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadisticaProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadisticaProductos(false);
			
			this.setPermisosUsuarioEstadisticaProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.estadisticaproductosSessionBean.getEsGuardarRelacionado() && this.estadisticaproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadisticaProductosClasesRelacionadas();
			}
			
			if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadisticaProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadisticaProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadisticaProductos();
			}
			
			if(!this.isPermisoBusquedaEstadisticaProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadisticaProductosConstantesFunciones.getTiposSeleccionarEstadisticaProductos());
				
				this.tiposColumnasSelect=EstadisticaProductosConstantesFunciones.getTiposSeleccionarEstadisticaProductos(true);
				
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
			//if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadisticaProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioEstadisticaProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioEstadisticaProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadisticaProductos() ;
			
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
			this.productoLogic=new ProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadisticaproductosImplementable= (EstadisticaProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadisticaProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadisticaproductosImplementableHome= (EstadisticaProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadisticaProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadisticaproductoss= new ArrayList<EstadisticaProductos>();
			this.estadisticaproductossEliminados= new ArrayList<EstadisticaProductos>();
						
			this.isEsNuevoEstadisticaProductos=false;
			this.esParaAccionDesdeFormularioEstadisticaProductos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadisticaProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadisticaProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadisticaProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadisticaProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadisticaProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadisticaProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadisticaProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadisticaProductos();
			}
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEstadisticaProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEstadisticaProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEstadisticaProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadisticaProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadisticaProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadisticaProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadisticaProductos")) {
				iIndex=this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadisticaProductos();	
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
	
	public void cargarCombosForeignKeyEstadisticaProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadisticaProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadisticaProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadisticaProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadisticaProductos();
		
		this.cargarCombosFrameForeignKeyEstadisticaProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadisticaProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadisticaProductos();
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
	
	public void jButtonNuevoEstadisticaProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			
			if(jTableDatosEstadisticaProductos.getRowCount()>=1) {
				jTableDatosEstadisticaProductos.removeRowSelectionInterval(0, jTableDatosEstadisticaProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadisticaProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadisticaProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadisticaProductos(true);			
			//this.estadisticaproductos=new EstadisticaProductos();
			//this.estadisticaproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadisticaProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadisticaProductos() ;
			
			if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadisticaProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadisticaproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);				
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadisticaProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadisticaProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadisticaProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadisticaProductos.getSelectedRows().length;			
			}
			
			estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadisticaProductos--;			
				//EstadisticaProductos estadisticaproductosAux= new EstadisticaProductos();			
				//estadisticaproductosAux.setId(this.iIdNuevoEstadisticaProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadisticaProductos estadisticaproductosOrigen=new EstadisticaProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadisticaProductos estadisticaproductosOrigen : estadisticaproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadisticaproductosOrigen =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadisticaproductosOrigen =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadisticaProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadisticaproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadisticaProductos(estadisticaproductosOrigen,this.estadisticaproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadisticaproductosLogic.getEstadisticaProductoss().add(this.estadisticaproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadisticaproductoss.add(this.estadisticaproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
				
				this.jTableDatosEstadisticaProductos.setRowSelectionInterval(this.getIndiceNuevoEstadisticaProductos(), this.getIndiceNuevoEstadisticaProductos());
				
				int iLastRow =  this.jTableDatosEstadisticaProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadisticaProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadisticaProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadisticaProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();									
		
			EstadisticaProductos estadisticaproductosOrigen=new EstadisticaProductos();
			EstadisticaProductos estadisticaproductosDestino=new EstadisticaProductos();
				
			estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadisticaProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadisticaproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadisticaProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadisticaproductosOrigen =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadisticaproductosOrigen =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadisticaproductosDestino =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadisticaproductosDestino =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadisticaproductosOrigen =estadisticaproductossSeleccionados.get(0);
				estadisticaproductosDestino =estadisticaproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadisticaProductos(estadisticaproductosOrigen,estadisticaproductosDestino,true,false);
				
				estadisticaproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadisticaproductosDestino,estadisticaproductosLogic.getEstadisticaProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadisticaproductosDestino,estadisticaproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
				
				//this.jTableDatosEstadisticaProductos.setRowSelectionInterval(this.getIndiceNuevoEstadisticaProductos(), this.getIndiceNuevoEstadisticaProductos());
				
				int iLastRow =  this.jTableDatosEstadisticaProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadisticaProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadisticaProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadisticaProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadisticaProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadisticaProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEstadisticaProductos.setVisible(!isVisible);
			this.jPanelPaginacionEstadisticaProductos.setVisible(!isVisible);
			this.jPanelAccionesEstadisticaProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadisticaProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadisticaProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadisticaProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadisticaProductos();
			
			this.abrirFrameOrderByEstadisticaProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadisticaProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadisticaProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadisticaProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadisticaProductos.isMaximum()) {
					this.jInternalFrameDetalleFormEstadisticaProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadisticaProductos.setSize(this.jInternalFrameDetalleFormEstadisticaProductos.iWidthFormulario,this.jInternalFrameDetalleFormEstadisticaProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadisticaProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadisticaProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadisticaProductos.isMaximum()) {
						this.jInternalFrameDetalleFormEstadisticaProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadisticaProductos.jContentPaneDetalleEstadisticaProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadisticaProductos.jContentPaneDetalleEstadisticaProductos.getWidth(),EstadisticaProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadisticaProductos.jContentPaneDetalleEstadisticaProductos.getWidth(),EstadisticaProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadisticaProductos.jContentPaneDetalleEstadisticaProductos.getWidth(),EstadisticaProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadisticaProductos.setVisible(true);
	        this.jInternalFrameDetalleFormEstadisticaProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadisticaProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadisticaProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadisticaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadisticaProductos,false,this);
				} else {
					this.jInternalFrameOrderByEstadisticaProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadisticaProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadisticaProductos);
				this.jInternalFrameOrderByEstadisticaProductos.setVisible(false);
				this.jInternalFrameOrderByEstadisticaProductos.setSelected(false);
				
				this.jInternalFrameOrderByEstadisticaProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadisticaProductos"));
				
				this.inicializarActualizarBindingTablaOrderByEstadisticaProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadisticaProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadisticaProductos==null) {
				
				this.jInternalFrameImportacionEstadisticaProductos=new ImportacionJInternalFrame(EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadisticaProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadisticaProductos);
				this.jInternalFrameImportacionEstadisticaProductos.setVisible(false);
				this.jInternalFrameImportacionEstadisticaProductos.setSelected(false);


				this.jInternalFrameImportacionEstadisticaProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadisticaProductos"));
				this.jInternalFrameImportacionEstadisticaProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadisticaProductos"));
				this.jInternalFrameImportacionEstadisticaProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadisticaProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadisticaProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadisticaProductos==null) {
				this.jInternalFrameReporteDinamicoEstadisticaProductos=new ReporteDinamicoJInternalFrame(EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadisticaProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadisticaProductos);
				this.jInternalFrameReporteDinamicoEstadisticaProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadisticaProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadisticaProductos"));
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadisticaProductos"));
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadisticaProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadisticaProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadisticaProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadisticaProductos);
			
	       	this.jInternalFrameDetalleFormEstadisticaProductos.setVisible(false);
	        this.jInternalFrameDetalleFormEstadisticaProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadisticaProductos.dispose();
			//this.jInternalFrameDetalleFormEstadisticaProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadisticaProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadisticaProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadisticaProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadisticaProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadisticaProductos.setVisible(true);
	        this.jInternalFrameImportacionEstadisticaProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadisticaProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadisticaProductos.setVisible(true);
	        this.jInternalFrameOrderByEstadisticaProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadisticaProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadisticaProductos.setVisible(false);
	        this.jInternalFrameOrderByEstadisticaProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadisticaProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadisticaProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadisticaProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadisticaProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadisticaProductos.setVisible(false);
	        this.jInternalFrameImportacionEstadisticaProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadisticaProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadisticaProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadisticaProductos(true);
			//this.isEsNuevoEstadisticaProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadisticaProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadisticaProductos(false) ;
			
			if(estadisticaproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadisticaProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadisticaProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadisticaProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadisticaProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadisticaProductos(true);
			//this.isEsNuevoEstadisticaProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadisticaproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadisticaProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadisticaProductos(false) ;
			
			if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadisticaProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadisticaProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEstadisticaProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadisticaProductos(false);
			
			//if(!this.isEsNuevoEstadisticaProductos) {								
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				
			}
			
			if(this.permiteMantenimiento(this.estadisticaproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadisticaProductos=true;
					this.inicializarActualizarBindingTablaEstadisticaProductos(false);
					this.isEsNuevoEstadisticaProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadisticaProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadisticaProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadisticaProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadisticaProductos(false);
				
				this.habilitarDeshabilitarControlesEstadisticaProductos(false);
			
												
				
				if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadisticaProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadisticaProductosActionPerformed(evt,estadisticaproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadisticaProductos(this.estadisticaproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadisticaProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadisticaproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadisticaproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				this.estadisticaproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				this.estadisticaproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadisticaproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadisticaProductosModel) this.jTableDatosEstadisticaProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadisticaProductos=true;
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
				this.isEsNuevoEstadisticaProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadisticaProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadisticaProductos(false);
				
				this.habilitarDeshabilitarControlesEstadisticaProductos(false);
				
				
				
				if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadisticaProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadisticaProductos.getRowCount()>=1) {
				jTableDatosEstadisticaProductos.removeRowSelectionInterval(0, jTableDatosEstadisticaProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadisticaProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadisticaProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadisticaProductos(false) ;
			
			this.isEsNuevoEstadisticaProductos=false;
			
			if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadisticaProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadisticaProductos(false);
				
				//SI ES MANUAL
				if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadisticaProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadisticaProductos--;			
			//EstadisticaProductos estadisticaproductosAux= new EstadisticaProductos();			
			//estadisticaproductosAux.setId(this.iIdNuevoEstadisticaProductos);
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadisticaProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
			
			this.estadisticaproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadisticaproductosLogic.getEstadisticaProductoss().add(this.estadisticaproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadisticaproductoss.add(this.estadisticaproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			
			this.jTableDatosEstadisticaProductos.setRowSelectionInterval(this.getIndiceNuevoEstadisticaProductos(), this.getIndiceNuevoEstadisticaProductos());
			
			int iLastRow =  this.jTableDatosEstadisticaProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadisticaProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadisticaProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadisticaProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadisticaProductos(false);
			
			//SI ES MANUAL
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadisticaProductos();
			}
			
			//this.abrirFrameTreeEstadisticaProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadisticaProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadisticaProductos.setFileImportacion(this.jInternalFrameImportacionEstadisticaProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadisticaProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadisticaProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadisticaProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadisticaProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		

		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadisticaProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadisticaProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO:
					sNombreCampoCategoria="cantidad_precio";
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO:
					sNombreCampoCategoriaValor="cantidad_precio";
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_precio");
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadisticaProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getcantidad_precio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(EstadisticaProductos estadisticaproductos:estadisticaproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadisticaproductos.getcantidad());
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
			//	this.getFilaCabeceraExportarExcelEstadisticaProductos(row);				
			//	iRow++;
			//}				
			
			//for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadisticaProductos(estadisticaproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadisticaProductos(false);
			
			//SI ES MANUAL
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadisticaProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadisticaProductos(false);
			
			//SI ES MANUAL
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadisticaProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadisticaProductos(false);
			
			//SI ES MANUAL
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadisticaProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadisticaProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadisticaProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadisticaProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadisticaProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadisticaProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadisticaProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadisticaProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadisticaProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadisticaProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadisticaProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadisticaProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadisticaProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadisticaProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadisticaProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadisticaProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadisticaProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadisticaProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadisticaProductos();
		
		this.inicializarActualizarBindingBotonesManualEstadisticaProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadisticaProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadisticaProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadisticaProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadisticaProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadisticaProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadisticaProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadisticaProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadisticaProductos.jCheckBoxPostAccionNuevoEstadisticaProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadisticaProductos.jCheckBoxPostAccionSinCerrarEstadisticaProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadisticaProductos.jCheckBoxPostAccionSinMensajeEstadisticaProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadisticaProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadisticaProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadisticaProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
				this.jInternalFrameDetalleFormEstadisticaProductos.jCheckBoxPostAccionNuevoEstadisticaProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadisticaProductos.jCheckBoxPostAccionSinCerrarEstadisticaProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadisticaProductos.jCheckBoxPostAccionSinMensajeEstadisticaProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadisticaProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadisticaProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadisticaProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadisticaProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadisticaProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadisticaProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadisticaProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadisticaProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadisticaProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadisticaProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadisticaProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadisticaProductos() throws Exception {
		try	{
			if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadisticaProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadisticaProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadisticaProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadisticaProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadisticaProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadisticaProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadisticaProductos.addItem(reporte);
			}
			
			
			if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadisticaProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadisticaProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadisticaProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadisticaProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadisticaProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadisticaProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadisticaProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadisticaProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadisticaProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EstadisticaProductosConstantesFunciones.getTiposSeleccionarEstadisticaProductos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EstadisticaProductosConstantesFunciones.getTiposSeleccionarEstadisticaProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EstadisticaProductosConstantesFunciones.getTiposSeleccionarEstadisticaProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEstadisticaProductos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadisticaProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.getSelectedItem()!=null){this.id_productoBusquedaEstadisticaProductos=((Producto)this.jComboBoxid_productoBusquedaEstadisticaProductosEstadisticaProductos.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaEstadisticaProductos=new Date(this.jDateChooserfecha_inicioBusquedaEstadisticaProductosEstadisticaProductos.getDate().getTime());
		this.fecha_finBusquedaEstadisticaProductos=new Date(this.jDateChooserfecha_finBusquedaEstadisticaProductosEstadisticaProductos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadisticaProductos(Boolean esInicializar) throws Exception {				
		if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadisticaProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadisticaProductos() throws Exception {
		this.inicializarActualizarBindingTablaEstadisticaProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadisticaProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadisticaProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadisticaProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadisticaproductosLogic.getEstadisticaProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadisticaproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadisticaProductos.setModel(new EstadisticaProductosModel(this.estadisticaproductosLogic.getEstadisticaProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadisticaProductos.setModel(new EstadisticaProductosModel(this.estadisticaproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadisticaProductos!=null && this.jInternalFrameOrderByEstadisticaProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadisticaProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO,estadisticaproductosConstantesFunciones.resaltarSeleccionarEstadisticaProductos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadisticaProductosConstantesFunciones.SCLASSWEBTITULO,estadisticaproductosConstantesFunciones.resaltarSeleccionarEstadisticaProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,EstadisticaProductosConstantesFunciones.LABEL_ID));

		if(this.estadisticaproductosConstantesFunciones.mostraridEstadisticaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadisticaProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadisticaproductosConstantesFunciones.resaltaridEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activaridEstadisticaProductos,iSizeTabla,this,true,"idEstadisticaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadisticaproductosConstantesFunciones.resaltaridEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activaridEstadisticaProductos,this,true,"idEstadisticaProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.estadisticaproductosConstantesFunciones.mostrarcodigo_productoEstadisticaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadisticaproductosConstantesFunciones.resaltarcodigo_productoEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarcodigo_productoEstadisticaProductos,iSizeTabla,this,true,"codigo_productoEstadisticaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadisticaproductosConstantesFunciones.resaltarcodigo_productoEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarcodigo_productoEstadisticaProductos,this,true,"codigo_productoEstadisticaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.estadisticaproductosConstantesFunciones.mostrarnombre_productoEstadisticaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadisticaproductosConstantesFunciones.resaltarnombre_productoEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarnombre_productoEstadisticaProductos,iSizeTabla,this,true,"nombre_productoEstadisticaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadisticaproductosConstantesFunciones.resaltarnombre_productoEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarnombre_productoEstadisticaProductos,this,true,"nombre_productoEstadisticaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO));

		if(this.estadisticaproductosConstantesFunciones.mostrarcantidad_precioEstadisticaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadisticaproductosConstantesFunciones.resaltarcantidad_precioEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarcantidad_precioEstadisticaProductos,iSizeTabla,this,true,"cantidad_precioEstadisticaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadisticaproductosConstantesFunciones.resaltarcantidad_precioEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarcantidad_precioEstadisticaProductos,this,true,"cantidad_precioEstadisticaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD));

		if(this.estadisticaproductosConstantesFunciones.mostrarcantidadEstadisticaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadisticaproductosConstantesFunciones.resaltarcantidadEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarcantidadEstadisticaProductos,iSizeTabla,this,true,"cantidadEstadisticaProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadisticaproductosConstantesFunciones.resaltarcantidadEstadisticaProductos,this.estadisticaproductosConstantesFunciones.activarcantidadEstadisticaProductos,this,true,"cantidadEstadisticaProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EstadisticaProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadisticaProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadisticaProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadisticaProductos.addColumn(tableColumn);
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
			
			this.jTableDatosEstadisticaProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadisticaProductos.moveColumn(this.jTableDatosEstadisticaProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadisticaProductos.moveColumn(this.jTableDatosEstadisticaProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadisticaProductos.moveColumn(this.jTableDatosEstadisticaProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadisticaProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadisticaProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadisticaProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadisticaProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadisticaProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadisticaProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadisticaProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=estadisticaproductosLogic.getEstadisticaProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadisticaproductoss.size()-1;
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
		//this.jTableDatosEstadisticaProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadisticaProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadisticaProductos();
			
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
				
				//this.isEsNuevoEstadisticaProductos=false;
					
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
				if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadisticaProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadisticaProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadisticaProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadisticaproductos.getsType().equals("DUPLICADO")
				   || this.estadisticaproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadisticaProductos=true;
				
				} else {
					this.isEsNuevoEstadisticaProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.estadisticaproductos.getId()>=0 && !this.estadisticaproductos.getIsNew()) {						
						this.isEsNuevoEstadisticaProductos=false;
						
					} else {
						this.isEsNuevoEstadisticaProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadisticaProductos(esRelaciones);						
				
				this.seleccionarEstadisticaProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadisticaproductos.getId()<0) {
					this.isEsNuevoEstadisticaProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadisticaProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadisticaProductos(evt,rowIndex);
				}	
				
				if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadisticaProductos: " + this.dDif); 
					}
				}								
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadisticaProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadisticaproductos)) {
					if(this.estadisticaproductos.getId()>0) {
						this.estadisticaproductos.setIsDeleted(true);
						
						this.estadisticaproductossEliminados.add(this.estadisticaproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadisticaproductosLogic.getEstadisticaProductoss().remove(this.estadisticaproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadisticaproductoss.remove(this.estadisticaproductos);				
					}
					
					
					((EstadisticaProductosModel) this.jTableDatosEstadisticaProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadisticaProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadisticaProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadisticaProductos) {
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadisticaProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadisticaProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadisticaProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadisticaProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadisticaProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadisticaProductos(EstadisticaProductos estadisticaproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadisticaProductos(estadisticaproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadisticaProductos(EstadisticaProductos estadisticaproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadisticaProductos(estadisticaproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadisticaProductos(estadisticaproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadisticaProductos(estadisticaproductos);
	}
	
	public void setVariablesObjetoActualToFormularioEstadisticaProductos(EstadisticaProductos estadisticaproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setText(estadisticaproductos.getId().toString());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setText(estadisticaproductos.getcodigo_producto());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setText(estadisticaproductos.getnombre_producto());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setText(estadisticaproductos.getcantidad_precio().toString());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setText(estadisticaproductos.getcantidad().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadisticaProductos estadisticaproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadisticaproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadisticaProductos estadisticaproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadisticaproductosLocal=this.estadisticaproductos;
			} else {
				estadisticaproductosLocal=this.estadisticaproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadisticaproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadisticaProductos(estadisticaproductosLocal,true);
					
					if(estadisticaproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadisticaproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadisticaproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadisticaProductos(EstadisticaProductos estadisticaproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadisticaProductos(estadisticaproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(estadisticaproductos);
	}
	
	public void setVariablesFormularioToObjetoActualEstadisticaProductos(EstadisticaProductos estadisticaproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadisticaProductos(estadisticaproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadisticaProductos(EstadisticaProductos estadisticaproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.getText()==null || this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.getText()=="" || this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setText("0");
			}

			if(conColumnasBase) {estadisticaproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadisticaProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelIdEstadisticaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadisticaproductos.setcodigo_producto(this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcodigo_productoEstadisticaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadisticaproductos.setnombre_producto(this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelnombre_productoEstadisticaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadisticaproductos.setcantidad_precio(Double.parseDouble(this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcantidad_precioEstadisticaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadisticaproductos.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadisticaProductos.jLabelcantidadEstadisticaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadisticaProductos(EstadisticaProductos estadisticaproductosBean,EstadisticaProductos estadisticaproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadisticaProductos(EstadisticaProductos estadisticaproductosOrigen,EstadisticaProductos estadisticaproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadisticaproductosOrigen.getId()!=null && !estadisticaproductosOrigen.getId().equals(0L))) {estadisticaproductos.setId(estadisticaproductosOrigen.getId());}}
			if(conDefault || (!conDefault && estadisticaproductosOrigen.getfecha_inicio()!=null && !estadisticaproductosOrigen.getfecha_inicio().equals(new Date()))) {estadisticaproductos.setfecha_inicio(estadisticaproductosOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && estadisticaproductosOrigen.getfecha_fin()!=null && !estadisticaproductosOrigen.getfecha_fin().equals(new Date()))) {estadisticaproductos.setfecha_fin(estadisticaproductosOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && estadisticaproductosOrigen.getcodigo_producto()!=null && !estadisticaproductosOrigen.getcodigo_producto().equals(""))) {estadisticaproductos.setcodigo_producto(estadisticaproductosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && estadisticaproductosOrigen.getnombre_producto()!=null && !estadisticaproductosOrigen.getnombre_producto().equals(""))) {estadisticaproductos.setnombre_producto(estadisticaproductosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && estadisticaproductosOrigen.getcantidad_precio()!=null && !estadisticaproductosOrigen.getcantidad_precio().equals(0.0))) {estadisticaproductos.setcantidad_precio(estadisticaproductosOrigen.getcantidad_precio());}
			if(conDefault || (!conDefault && estadisticaproductosOrigen.getcantidad()!=null && !estadisticaproductosOrigen.getcantidad().equals(0))) {estadisticaproductos.setcantidad(estadisticaproductosOrigen.getcantidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadisticaProductos(EstadisticaProductos estadisticaproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setText(estadisticaproductos.getId().toString());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setText(estadisticaproductos.getcodigo_producto());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setText(estadisticaproductos.getnombre_producto());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setText(estadisticaproductos.getcantidad_precio().toString());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setText(estadisticaproductos.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadisticaProductos(EstadisticaProductosBean estadisticaproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setText(estadisticaproductosBean.getId().toString());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setText(estadisticaproductosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setText(estadisticaproductosBean.getnombre_producto());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setText(estadisticaproductosBean.getcantidad_precio().toString());
			this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setText(estadisticaproductosBean.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadisticaProductos(EstadisticaProductosParameterReturnGeneral estadisticaproductosReturnGeneral,EstadisticaProductosBean estadisticaproductosBean,Boolean conDefault) throws Exception { 
		try {
			EstadisticaProductos estadisticaproductosLocal=new EstadisticaProductos();
			
			estadisticaproductosLocal=estadisticaproductosReturnGeneral.getEstadisticaProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadisticaproductosLocal.getId()!=null && !estadisticaproductosLocal.getId().equals(0L))) {estadisticaproductosBean.setId(estadisticaproductosLocal.getId());}}
			if(conDefault || (!conDefault && estadisticaproductosLocal.getcodigo_producto()!=null && !estadisticaproductosLocal.getcodigo_producto().equals(""))) {estadisticaproductosBean.setcodigo_producto(estadisticaproductosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && estadisticaproductosLocal.getnombre_producto()!=null && !estadisticaproductosLocal.getnombre_producto().equals(""))) {estadisticaproductosBean.setnombre_producto(estadisticaproductosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && estadisticaproductosLocal.getcantidad_precio()!=null && !estadisticaproductosLocal.getcantidad_precio().equals(0.0))) {estadisticaproductosBean.setcantidad_precio(estadisticaproductosLocal.getcantidad_precio());}
			if(conDefault || (!conDefault && estadisticaproductosLocal.getcantidad()!=null && !estadisticaproductosLocal.getcantidad().equals(0))) {estadisticaproductosBean.setcantidad(estadisticaproductosLocal.getcantidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadisticaProductosGenerico(Long idEstadisticaProductosSeleccionado,JComboBox jComboBoxEstadisticaProductos,List<EstadisticaProductos> estadisticaproductossLocal)throws Exception {
		try {
			EstadisticaProductos  estadisticaproductosTemp=null;

			for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossLocal) {
				if(estadisticaproductosAux.getId()!=null && estadisticaproductosAux.getId().equals(idEstadisticaProductosSeleccionado)) {
					estadisticaproductosTemp=estadisticaproductosAux;
					break;
				}
			}

			jComboBoxEstadisticaProductos.setSelectedItem(estadisticaproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadisticaProductosGenerico(JComboBox jComboBoxEstadisticaProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadisticaProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadisticaProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadisticaProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadisticaProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadisticaProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadisticaProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadisticaproductos=(EstadisticaProductos) estadisticaproductosLogic.getEstadisticaProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadisticaproductos =(EstadisticaProductos) estadisticaproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!estadisticaproductos.getIsNew() && !estadisticaproductos.getIsChanged() && !estadisticaproductos.getIsDeleted()) {
				sDescripcion=estadisticaproductos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=estadisticaproductos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!estadisticaproductos.getIsNew() && !estadisticaproductos.getIsChanged() && !estadisticaproductos.getIsDeleted()) {
				sDescripcion=estadisticaproductos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=estadisticaproductos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!estadisticaproductos.getIsNew() && !estadisticaproductos.getIsChanged() && !estadisticaproductos.getIsDeleted()) {
				sDescripcion=estadisticaproductos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=estadisticaproductos.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadisticaProductos estadisticaproductosRow=new EstadisticaProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadisticaproductosRow=(EstadisticaProductos) estadisticaproductosLogic.getEstadisticaProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadisticaproductosRow=(EstadisticaProductos) estadisticaproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadisticaProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos));			
			this.jButtonDuplicarEstadisticaProductos.setVisible((this.isVisibilidadCeldaDuplicarEstadisticaProductos && this.isPermisoDuplicarEstadisticaProductos));			
			this.jButtonCopiarEstadisticaProductos.setVisible((this.isVisibilidadCeldaCopiarEstadisticaProductos && this.isPermisoCopiarEstadisticaProductos));
			this.jButtonVerFormEstadisticaProductos.setVisible((this.isVisibilidadCeldaVerFormEstadisticaProductos && this.isPermisoVerFormEstadisticaProductos));
			
			this.jButtonAbrirOrderByEstadisticaProductos.setVisible((this.isVisibilidadCeldaOrdenEstadisticaProductos && this.isPermisoOrdenEstadisticaProductos));			
			
			this.jButtonNuevoRelacionesEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos));			
			this.jButtonNuevoGuardarCambiosEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarEstadisticaProductos.setVisible((this.isVisibilidadCeldaModificarEstadisticaProductos && this.isPermisoActualizarEstadisticaProductos));	
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarEstadisticaProductos.setVisible((this.isVisibilidadCeldaActualizarEstadisticaProductos && this.isPermisoActualizarEstadisticaProductos));	
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarEstadisticaProductos.setVisible((this.isVisibilidadCeldaEliminarEstadisticaProductos && this.isPermisoEliminarEstadisticaProductos));
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarEstadisticaProductos.setVisible(this.isVisibilidadCeldaCancelarEstadisticaProductos);							
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos));						
			this.jButtonDuplicarToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaDuplicarEstadisticaProductos && this.isPermisoDuplicarEstadisticaProductos));						
			this.jButtonCopiarToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaCopiarEstadisticaProductos && this.isPermisoCopiarEstadisticaProductos));			
			this.jButtonVerFormToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaVerFormEstadisticaProductos && this.isPermisoVerFormEstadisticaProductos));			
			this.jButtonAbrirOrderByToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaOrdenEstadisticaProductos && this.isPermisoOrdenEstadisticaProductos));
			this.jButtonNuevoRelacionesToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos));			
			this.jButtonNuevoGuardarCambiosToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));			
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaModificarEstadisticaProductos && this.isPermisoActualizarEstadisticaProductos));	
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaActualizarEstadisticaProductos  && this.isPermisoActualizarEstadisticaProductos));	
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaEliminarEstadisticaProductos && this.isPermisoEliminarEstadisticaProductos));
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarToolBarEstadisticaProductos.setVisible(this.isVisibilidadCeldaCancelarEstadisticaProductos);				
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos));			
			this.jMenuItemDuplicarEstadisticaProductos.setVisible((this.isVisibilidadCeldaDuplicarEstadisticaProductos && this.isPermisoDuplicarEstadisticaProductos));			
			this.jMenuItemCopiarEstadisticaProductos.setVisible((this.isVisibilidadCeldaCopiarEstadisticaProductos && this.isPermisoCopiarEstadisticaProductos));			
			this.jMenuItemVerFormEstadisticaProductos.setVisible((this.isVisibilidadCeldaVerFormEstadisticaProductos && this.isPermisoVerFormEstadisticaProductos));			
			this.jMenuItemAbrirOrderByEstadisticaProductos.setVisible((this.isVisibilidadCeldaOrdenEstadisticaProductos && this.isPermisoOrdenEstadisticaProductos));			
			//this.jMenuItemMostrarOcultarEstadisticaProductos.setVisible((this.isVisibilidadCeldaOrdenEstadisticaProductos && this.isPermisoOrdenEstadisticaProductos));
			this.jMenuItemDetalleAbrirOrderByEstadisticaProductos.setVisible((this.isVisibilidadCeldaOrdenEstadisticaProductos && this.isPermisoOrdenEstadisticaProductos));			
			//this.jMenuItemDetalleMostrarOcultarEstadisticaProductos.setVisible((this.isVisibilidadCeldaOrdenEstadisticaProductos && this.isPermisoOrdenEstadisticaProductos));			
			this.jMenuItemNuevoRelacionesEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos));			
			this.jMenuItemNuevoGuardarCambiosEstadisticaProductos.setVisible((this.isVisibilidadCeldaNuevoEstadisticaProductos && this.isPermisoNuevoEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));									
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemModificarEstadisticaProductos.setVisible((this.isVisibilidadCeldaModificarEstadisticaProductos && this.isPermisoActualizarEstadisticaProductos));	
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemActualizarEstadisticaProductos.setVisible((this.isVisibilidadCeldaActualizarEstadisticaProductos && this.isPermisoActualizarEstadisticaProductos));	
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemEliminarEstadisticaProductos.setVisible((this.isVisibilidadCeldaEliminarEstadisticaProductos && this.isPermisoEliminarEstadisticaProductos));
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemCancelarEstadisticaProductos.setVisible(this.isVisibilidadCeldaCancelarEstadisticaProductos);				
			}
			
			this.jMenuItemGuardarCambiosEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));						
			this.jMenuItemGuardarCambiosTablaEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=this.jButtonNuevoEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaDuplicarEstadisticaProductos=this.jButtonDuplicarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaCopiarEstadisticaProductos=this.jButtonCopiarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaVerFormEstadisticaProductos=this.jButtonVerFormEstadisticaProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadisticaProductos=this.jButtonAbrirOrderByEstadisticaProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=this.jButtonNuevoRelacionesEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaModificarEstadisticaProductos=this.jButtonModificarEstadisticaProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.isVisibilidadCeldaActualizarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaEliminarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaCancelarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaGuardarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=this.jButtonGuardarCambiosTablaEstadisticaProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadisticaProductos=this.jButtonNuevoToolBarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=this.jButtonNuevoRelacionesToolBarEstadisticaProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.isVisibilidadCeldaModificarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarToolBarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaActualizarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarToolBarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaEliminarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarToolBarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaCancelarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarToolBarEstadisticaProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadisticaProductos=this.jButtonGuardarCambiosToolBarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=this.jButtonGuardarCambiosTablaToolBarEstadisticaProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadisticaProductos=this.jMenuItemNuevoEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=this.jMenuItemNuevoRelacionesEstadisticaProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.isVisibilidadCeldaModificarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemModificarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaActualizarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemActualizarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaEliminarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemEliminarEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaCancelarEstadisticaProductos=this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemCancelarEstadisticaProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadisticaProductos=this.jMenuItemGuardarCambiosEstadisticaProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=this.jMenuItemGuardarCambiosTablaEstadisticaProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadisticaProductos(Boolean esInicializar) {
		if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadisticaProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadisticaProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadisticaProductos() {
		this.jButtonNuevoEstadisticaProductos.setVisible(this.isPermisoNuevoEstadisticaProductos);			
		this.jButtonDuplicarEstadisticaProductos.setVisible(this.isPermisoDuplicarEstadisticaProductos);			
		this.jButtonCopiarEstadisticaProductos.setVisible(this.isPermisoCopiarEstadisticaProductos);			
		this.jButtonVerFormEstadisticaProductos.setVisible(this.isPermisoVerFormEstadisticaProductos);			
		
		this.jButtonAbrirOrderByEstadisticaProductos.setVisible(this.isPermisoOrdenEstadisticaProductos);					
		
		this.jButtonNuevoRelacionesEstadisticaProductos.setVisible(this.isPermisoNuevoEstadisticaProductos);			
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarEstadisticaProductos.setVisible(this.isPermisoActualizarEstadisticaProductos);	
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarEstadisticaProductos.setVisible(this.isPermisoActualizarEstadisticaProductos);	
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarEstadisticaProductos.setVisible(this.isPermisoEliminarEstadisticaProductos);
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarEstadisticaProductos.setVisible(this.isVisibilidadCeldaCancelarEstadisticaProductos);						
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.setVisible(this.isPermisoGuardarCambiosEstadisticaProductos);							
		}
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.setVisible(this.isPermisoActualizarEstadisticaProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadisticaProductos() {
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarEstadisticaProductos.setVisible(this.isPermisoActualizarEstadisticaProductos);	
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarEstadisticaProductos.setVisible(this.isPermisoActualizarEstadisticaProductos);	
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarEstadisticaProductos.setVisible(this.isPermisoEliminarEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarEstadisticaProductos.setVisible(this.isVisibilidadCeldaCancelarEstadisticaProductos);							
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.setVisible((this.isVisibilidadCeldaGuardarEstadisticaProductos && this.isPermisoGuardarCambiosEstadisticaProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadisticaProductos() {
		if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadisticaProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadisticaProductos() {
	}
	
	public void jTableDatosEstadisticaProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadisticaProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadisticaproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEstadisticaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEstadisticaProductos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadisticaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadisticaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.estadisticaproductosLogic.getConnexion());

				if(this.estadisticaproductos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.estadisticaproductos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadisticaProductos=(TitledBorder)this.jScrollPanelDatosEstadisticaProductos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEstadisticaProductos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.estadisticaproductos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalEstadisticaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebEstadisticaProductos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadisticaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadisticaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.estadisticaproductosLogic.getConnexion());

				if(this.estadisticaproductos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.estadisticaproductos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadisticaProductos=(TitledBorder)this.jScrollPanelDatosEstadisticaProductos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderEstadisticaProductos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.estadisticaproductos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoEstadisticaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebEstadisticaProductos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEstadisticaProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEstadisticaProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.estadisticaproductosLogic.getConnexion());

				if(this.estadisticaproductos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.estadisticaproductos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEstadisticaProductos=(TitledBorder)this.jScrollPanelDatosEstadisticaProductos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderEstadisticaProductos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.estadisticaproductos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.estadisticaproductos.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.estadisticaproductos.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.estadisticaproductos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.estadisticaproductos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_precioEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getcantidad_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_precio = "+this.estadisticaproductos.getcantidad_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadEstadisticaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.getestadisticaproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadisticaproductos==null) {
						this.estadisticaproductos = new EstadisticaProductos();
					}

					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);
				}

				if(this.estadisticaproductos.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.estadisticaproductos.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadisticaProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaEstadisticaProductosEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadisticaProductos(false,false);

			this.getEstadisticaProductossBusquedaEstadisticaProductos();

			this.inicializarActualizarBindingEstadisticaProductos(false);

			//if(EstadisticaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadisticaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadisticaProductos(false,false);

			this.getEstadisticaProductossFK_IdEmpresa();

			this.inicializarActualizarBindingEstadisticaProductos(false);

			//if(EstadisticaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadisticaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadisticaProductos(false,false);

			this.getEstadisticaProductossFK_IdProducto();

			this.inicializarActualizarBindingEstadisticaProductos(false);

			//if(EstadisticaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadisticaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEstadisticaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEstadisticaProductos(false,false);

			this.getEstadisticaProductossFK_IdSucursal();

			this.inicializarActualizarBindingEstadisticaProductos(false);

			//if(EstadisticaProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEstadisticaProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadisticaproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEstadisticaProductos() {
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
			this.jInternalFrameDetalleFormEstadisticaProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadisticaProductos.dispose();
			this.jInternalFrameDetalleFormEstadisticaProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
			this.jInternalFrameReporteDinamicoEstadisticaProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadisticaProductos.dispose();
			this.jInternalFrameReporteDinamicoEstadisticaProductos=null;
		}
		
		if(this.jInternalFrameImportacionEstadisticaProductos!=null) {
			this.jInternalFrameImportacionEstadisticaProductos.setVisible(false);	    			
			this.jInternalFrameImportacionEstadisticaProductos.dispose();
			this.jInternalFrameImportacionEstadisticaProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadisticaProductos();
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadisticaProductos")) {
				jButtonDuplicarEstadisticaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadisticaProductos")) {
				jButtonCopiarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadisticaProductos")) {
				jButtonVerFormEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadisticaProductos")) {
				jButtonDuplicarEstadisticaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadisticaProductos")) {
				jButtonDuplicarEstadisticaProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadisticaProductos")) {
				jButtonModificarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadisticaProductos")) {
				jButtonModificarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadisticaProductos")) {
				jButtonModificarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadisticaProductos")) {
				jButtonActualizarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadisticaProductos")) {
				jButtonActualizarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadisticaProductos")) {
				jButtonActualizarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadisticaProductos")) {
				jButtonEliminarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadisticaProductos")) {
				jButtonEliminarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadisticaProductos")) {
				jButtonEliminarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadisticaProductos")) {
				jButtonCancelarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadisticaProductos")) {
				jButtonCancelarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadisticaProductos")) {
				jButtonCancelarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadisticaProductos")) {
				jButtonCerrarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadisticaProductos")) {
				jButtonCerrarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadisticaProductos")) {
				jButtonCerrarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadisticaProductos")) {
				jButtonMostrarOcultarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadisticaProductos")) {
				jButtonCancelarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadisticaProductos")) {
				jButtonCopiarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadisticaProductos")) {
				jButtonVerFormEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadisticaProductos")) {
				jButtonCopiarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadisticaProductos")) {
				jButtonVerFormEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadisticaProductos")) {
				jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadisticaProductos")) {
				jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadisticaProductos")) {
				jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadisticaProductos")) {
				jButtonAnterioresEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadisticaProductos")) {
				jButtonAnterioresEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadisticaProductos")) {
				jButtonAnterioresEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadisticaProductos")) {
				jButtonSiguientesEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadisticaProductos")) {
				jButtonSiguientesEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadisticaProductos")) {
				jButtonSiguientesEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadisticaProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadisticaProductos")) {
				jButtonAbrirOrderByEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadisticaProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadisticaProductos")) {
				jButtonMostrarOcultarEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadisticaProductos")) {
				jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadisticaProductos")) {
				jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadisticaProductos")) {
				jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadisticaProductos")) {
				jButtonCerrarReporteDinamicoEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadisticaProductos")) {
				jButtonGenerarReporteDinamicoEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadisticaProductos")) {
				
				jButtonGenerarExcelReporteDinamicoEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadisticaProductos")) {
				jButtonCerrarImportacionEstadisticaProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadisticaProductos")) {
				
				jButtonGenerarImportacionEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadisticaProductos")) {
				
				jButtonAbrirImportacionEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadisticaProductos")) {
				jComboBoxTiposAccionesEstadisticaProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadisticaProductos")) {
				jComboBoxTiposRelacionesEstadisticaProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadisticaProductos")) {
				jComboBoxTiposAccionesEstadisticaProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadisticaProductos")) {
				
				jComboBoxTiposSeleccionarEstadisticaProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadisticaProductos")) {
				jTextFieldValorCampoGeneralEstadisticaProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadisticaProductos")) {
				jButtonAbrirOrderByEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadisticaProductos")) {
				jButtonAbrirOrderByEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadisticaProductos")) {
				jButtonCerrarOrderByEstadisticaProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadisticaProductosBusqueda")) {
				this.jButtonidEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadisticaProductosUpdate")) {
				this.jButtonid_empresaEstadisticaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadisticaProductosBusqueda")) {
				this.jButtonid_empresaEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEstadisticaProductosUpdate")) {
				this.jButtonid_sucursalEstadisticaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEstadisticaProductosBusqueda")) {
				this.jButtonid_sucursalEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoEstadisticaProductosUpdate")) {
				this.jButtonid_productoEstadisticaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoEstadisticaProductosBusqueda")) {
				this.jButtonid_productoEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioEstadisticaProductosBusqueda")) {
				this.jButtonfecha_inicioEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finEstadisticaProductosBusqueda")) {
				this.jButtonfecha_finEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoEstadisticaProductosBusqueda")) {
				this.jButtoncodigo_productoEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoEstadisticaProductosBusqueda")) {
				this.jButtonnombre_productoEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_precioEstadisticaProductosBusqueda")) {
				this.jButtoncantidad_precioEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadEstadisticaProductosBusqueda")) {
				this.jButtoncantidadEstadisticaProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaEstadisticaProductosEstadisticaProductos")) {
				this.jButtonBusquedaEstadisticaProductosEstadisticaProductosActionPerformed(evt);
			}
			
			;
			
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadisticaProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadisticaProductos estadisticaproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadisticaproductosLocal=this.estadisticaproductos;
			} else {
				estadisticaproductosLocal=this.estadisticaproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
							
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
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
			
			


			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
								
						
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
								
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
							
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
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
			
			


			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
								
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadisticaProductos")) {
					jCheckBoxSeleccionarTodosEstadisticaProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadisticaProductos")) {
					jCheckBoxSeleccionadosEstadisticaProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadisticaProductos")) {
					
				}
				
				


				
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
												
				
				


				
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
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
			
			


			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadisticaProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadisticaproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadisticaproductos);
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
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
				
				


				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadisticaProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadisticaProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadisticaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadisticaproductosAnterior =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadisticaProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadisticaProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadisticaProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadisticaproductos =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadisticaproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadisticaProductos")) {
				
				}
				
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadisticaProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadisticaProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadisticaProductos")) {
			
			}
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadisticaProductos();
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			if(sTipo.equals("NuevoEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadisticaProductos")) {
				jButtonDuplicarEstadisticaProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadisticaProductos")) {
				jButtonCopiarEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadisticaProductos")) {
				jButtonVerFormEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadisticaProductos")) {
				jButtonNuevoEstadisticaProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadisticaProductos")) {
				jButtonModificarEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadisticaProductos")) {
				jButtonActualizarEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadisticaProductos")) {
				jButtonEliminarEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadisticaProductos")) {
				jButtonCancelarEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadisticaProductos")) {
				jButtonCerrarEstadisticaProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadisticaProductos")) {
				jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadisticaProductos")) {
				jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadisticaProductos")) {
				jButtonAbrirOrderByEstadisticaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadisticaProductos")) {
				jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadisticaProductos")) {
				jButtonAnterioresEstadisticaProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadisticaProductos")) {
				jButtonSiguientesEstadisticaProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadisticaProductosBusqueda")) {
				this.jButtonidEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEstadisticaProductosUpdate")) {
				this.jButtonid_empresaEstadisticaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEstadisticaProductosBusqueda")) {
				this.jButtonid_empresaEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalEstadisticaProductosUpdate")) {
				this.jButtonid_sucursalEstadisticaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalEstadisticaProductosBusqueda")) {
				this.jButtonid_sucursalEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoEstadisticaProductosUpdate")) {
				this.jButtonid_productoEstadisticaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoEstadisticaProductosBusqueda")) {
				this.jButtonid_productoEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioEstadisticaProductosBusqueda")) {
				this.jButtonfecha_inicioEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finEstadisticaProductosBusqueda")) {
				this.jButtonfecha_finEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoEstadisticaProductosBusqueda")) {
				this.jButtoncodigo_productoEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoEstadisticaProductosBusqueda")) {
				this.jButtonnombre_productoEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_precioEstadisticaProductosBusqueda")) {
				this.jButtoncantidad_precioEstadisticaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadEstadisticaProductosBusqueda")) {
				this.jButtoncantidadEstadisticaProductosBusquedaActionPerformed(evt);
			}
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadisticaProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadisticaProductos")) {
				closingInternalFrameEstadisticaProductos();
				
			} else if(sTipo.equals("jButtonCancelarEstadisticaProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadisticaProductos = (JInternalFrameBase)evt.getSource();
	            	
	            EstadisticaProductosBeanSwingJInternalFrame jInternalFrameParent=(EstadisticaProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadisticaProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadisticaProductosActionPerformed(null);
			}
			
			EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadisticaproductos,new Object(),this.estadisticaproductosParameterGeneral,this.estadisticaproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadisticaProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadisticaProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadisticaProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadisticaproductos)) {
			if(!esControlTabla) {
				if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);			
				}
				
				if(this.estadisticaproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadisticaProductos(this.estadisticaproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadisticaProductos(this.estadisticaproductosReturnGeneral,this.estadisticaproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadisticaproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadisticaProductos(classes,this.estadisticaproductosReturnGeneral,this.estadisticaproductosBean,false);
					}
						
					if(this.estadisticaproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadisticaProductos(this.estadisticaproductosReturnGeneral.getEstadisticaProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductosReturnGeneral.getEstadisticaProductos());	
					}
						
					if(this.estadisticaproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductosReturnGeneral.getEstadisticaProductos(),classes);//this.estadisticaproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadisticaProductos(this.estadisticaproductos,classes);//this.estadisticaproductosBean);									
				}
			
				if(EstadisticaProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadisticaProductos(this.estadisticaproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadisticaProductos(this.estadisticaproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadisticaproductosAnterior!=null) {
						this.estadisticaproductos=this.estadisticaproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadisticaproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadisticaproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadisticaproductosReturnGeneral.getEstadisticaProductos(),estadisticaproductosLogic.getEstadisticaProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadisticaproductosReturnGeneral.getEstadisticaProductos(),this.estadisticaproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadisticaProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadisticaProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadisticaProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadisticaProductos() throws Exception {
		
		EstadisticaProductosModel estadisticaproductosModel=(EstadisticaProductosModel)this.jTableDatosEstadisticaProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadisticaproductosModel.estadisticaproductoss=this.estadisticaproductosLogic.getEstadisticaProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadisticaproductosModel.estadisticaproductoss=this.estadisticaproductoss;
		}
		
		
		((EstadisticaProductosModel) this.jTableDatosEstadisticaProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadisticaProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadisticaproductosAnterior(),this.estadisticaproductosLogic.getEstadisticaProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadisticaproductosAnterior(),this.estadisticaproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadisticaProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadisticaProductos(EstadisticaProductos estadisticaproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
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
										
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadisticaproductos,new Object(),generalEntityParameterGeneral,this.estadisticaproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadisticaproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadisticaProductosConstantesFunciones.getClassesRelationshipsOfEstadisticaProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadisticaProductosConstantesFunciones.getClassesRelationshipsFromStringsOfEstadisticaProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadisticaProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadisticaProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadisticaproductos,new Object(),generalEntityParameterGeneral,this.estadisticaproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadisticaProductos(EstadisticaProductosBean estadisticaproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadisticaProductos(ArrayList<Classe> classes,EstadisticaProductosReturnGeneral estadisticaproductosReturnGeneral,EstadisticaProductosBean estadisticaproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadisticaProductos(EstadisticaProductos estadisticaproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadisticaproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadisticaProductos = new EstadisticaProductosDetalleFormJInternalFrame(jDesktopPane,this.estadisticaproductosSessionBean.getConGuardarRelaciones(),this.estadisticaproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.setVisible(false);
		this.jInternalFrameDetalleFormEstadisticaProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadisticaProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadisticaProductos.estadisticaproductosLogic=this.estadisticaproductosLogic;
		
		this.cargarCombosFrameForeignKeyEstadisticaProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadisticaProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadisticaProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadisticaProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadisticaProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadisticaProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadisticaProductos"));
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"ModificarEstadisticaProductos"));

		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadisticaProductos"));
					
		this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemModificarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadisticaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"ActualizarEstadisticaProductos"));
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadisticaProductos"));
						
		this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemActualizarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadisticaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"EliminarEstadisticaProductos"));
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadisticaProductos"));
								
		this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemEliminarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadisticaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CancelarEstadisticaProductos"));
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadisticaProductos"));
					
		this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemCancelarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadisticaProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemDetalleCerrarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadisticaProductos"));		
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadisticaProductos"));
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadisticaProductos"));
		
		
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadisticaProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonidEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"idEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_empresaEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_empresaEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_sucursalEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_sucursalEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_productoEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonfecha_inicioEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonfecha_finEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncodigo_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonnombre_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncantidad_precioEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_precioEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncantidadEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadEstadisticaProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadisticaProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadisticaProductos"));
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadisticaProductos"));
		}
		
		this.jTableDatosEstadisticaProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadisticaProductos"));
		
		this.jTableDatosEstadisticaProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadisticaProductos"));
		
		this.jButtonNuevoEstadisticaProductos.addActionListener(new ButtonActionListener(this,"NuevoEstadisticaProductos"));
		
		this.jButtonDuplicarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"DuplicarEstadisticaProductos"));
		
		this.jButtonCopiarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"CopiarEstadisticaProductos"));
		
		this.jButtonVerFormEstadisticaProductos.addActionListener(new ButtonActionListener(this,"VerFormEstadisticaProductos"));
		
		
		this.jButtonNuevoToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadisticaProductos"));
			
		this.jButtonDuplicarToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadisticaProductos"));
			
		this.jMenuItemNuevoEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadisticaProductos"));
			
		this.jMenuItemDuplicarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadisticaProductos"));		
		
		
		this.jButtonNuevoRelacionesEstadisticaProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadisticaProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadisticaProductos"));
			
		this.jMenuItemNuevoRelacionesEstadisticaProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadisticaProductos"));		
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"ModificarEstadisticaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonModificarToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadisticaProductos"));
			
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemModificarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadisticaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"ActualizarEstadisticaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonActualizarToolBarEstadisticaProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadisticaProductos"));
				
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemActualizarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadisticaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"EliminarEstadisticaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonEliminarToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadisticaProductos"));
						
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemEliminarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadisticaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CancelarEstadisticaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonCancelarToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadisticaProductos"));
			
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemCancelarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadisticaProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadisticaProductos"));		
		
		
		this.jButtonCerrarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CerrarEstadisticaProductos"));
		
		
		this.jButtonCerrarToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadisticaProductos"));
			
		this.jMenuItemCerrarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadisticaProductos"));
			
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jMenuItemDetalleCerrarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadisticaProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadisticaProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadisticaProductos"));
		}
		
		this.jButtonCopiarToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadisticaProductos"));
			
		this.jButtonVerFormToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadisticaProductos"));
		
		this.jMenuItemGuardarCambiosEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadisticaProductos"));
			
		this.jMenuItemCopiarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadisticaProductos"));		
		
		this.jMenuItemVerFormEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadisticaProductos"));		
		
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadisticaProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadisticaProductos"));
			
		this.jMenuItemGuardarCambiosTablaEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadisticaProductos"));		
		
		
		
		this.jButtonRecargarInformacionEstadisticaProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadisticaProductos"));
					
		this.jButtonRecargarInformacionToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadisticaProductos"));
		
		this.jMenuItemRecargarInformacionEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadisticaProductos"));		
		
		
		
		this.jButtonAnterioresEstadisticaProductos.addActionListener (new ButtonActionListener(this,"AnterioresEstadisticaProductos"));
		
		
		this.jButtonAnterioresToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadisticaProductos"));
		
		this.jMenuItemAnterioresEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadisticaProductos"));		
		
		
		this.jButtonSiguientesEstadisticaProductos.addActionListener (new ButtonActionListener(this,"SiguientesEstadisticaProductos"));
		
		
		this.jButtonSiguientesToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadisticaProductos"));
			
		this.jMenuItemSiguientesEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadisticaProductos"));
			
		this.jMenuItemAbrirOrderByEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadisticaProductos"));
			
		this.jMenuItemMostrarOcultarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadisticaProductos"));
			
		this.jMenuItemDetalleAbrirOrderByEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadisticaProductos"));
			
		this.jMenuItemDetalleMostarOcultarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadisticaProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadisticaProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadisticaProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadisticaProductos"));
			
		this.jMenuItemNuevoGuardarCambiosEstadisticaProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadisticaProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadisticaProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadisticaProductos"));

		this.jCheckBoxSeleccionadosEstadisticaProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadisticaProductos"));
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadisticaProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadisticaProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadisticaProductos"));
			
		this.jComboBoxTiposAccionesEstadisticaProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadisticaProductos"));
					
		this.jComboBoxTiposSeleccionarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadisticaProductos"));
			
		this.jTextFieldValorCampoGeneralEstadisticaProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadisticaProductos"));		
		
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonidEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"idEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_empresaEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_empresaEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_sucursalEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_sucursalEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_productoEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonfecha_inicioEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonfecha_finEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncodigo_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonnombre_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncantidad_precioEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_precioEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncantidadEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadEstadisticaProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaEstadisticaProductosEstadisticaProductos.addActionListener(new ButtonActionListener(this,"BusquedaEstadisticaProductosEstadisticaProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadisticaProductos!=null) {
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadisticaProductos"));
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadisticaProductos"));
				this.jInternalFrameReporteDinamicoEstadisticaProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadisticaProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadisticaProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadisticaProductos"));				
			//this.jButtonGenerarReporteDinamicoEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadisticaProductos"));
			//this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadisticaProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadisticaProductos!=null) {
				this.jInternalFrameImportacionEstadisticaProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadisticaProductos"));
				this.jInternalFrameImportacionEstadisticaProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadisticaProductos"));
				this.jInternalFrameImportacionEstadisticaProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadisticaProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadisticaProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadisticaProductos"));
			
			this.jButtonAbrirOrderByToolBarEstadisticaProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadisticaProductos"));			
			
			if(this.jInternalFrameOrderByEstadisticaProductos!=null) {
				this.jInternalFrameOrderByEstadisticaProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadisticaProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadisticaProductos.jTabbedPaneRelacionesEstadisticaProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadisticaProductos"));
		
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
            		closingInternalFrameEstadisticaProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadisticaProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadisticaProductos = (JInternalFrameBase)event.getSource();
	            	
	            EstadisticaProductosBeanSwingJInternalFrame jInternalFrameParent=(EstadisticaProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadisticaProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadisticaProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadisticaProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadisticaProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadisticaProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadisticaProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadisticaProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadisticaProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadisticaProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadisticaProductos";
		inputMap = this.jButtonNuevoEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadisticaProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadisticaProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadisticaProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadisticaProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadisticaProductos";
		inputMap = this.jButtonNuevoRelacionesEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadisticaProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadisticaProductos";
		inputMap = this.jButtonModificarEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadisticaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadisticaProductos";
		inputMap = this.jButtonActualizarEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadisticaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadisticaProductos";
		inputMap = this.jButtonEliminarEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadisticaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadisticaProductos";
		inputMap = this.jButtonCancelarEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadisticaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadisticaProductos";
		inputMap = this.jButtonCerrarEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadisticaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadisticaProductos";
		inputMap = this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonGuardarCambiosEstadisticaProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadisticaProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadisticaProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadisticaProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadisticaProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadisticaProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadisticaProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadisticaProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadisticaProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadisticaProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonidEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"idEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_empresaEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_empresaEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_sucursalEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_sucursalEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalEstadisticaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_productoEstadisticaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoEstadisticaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonid_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonfecha_inicioEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonfecha_finEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncodigo_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtonnombre_productoEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncantidad_precioEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_precioEstadisticaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadisticaProductos.jButtoncantidadEstadisticaProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadEstadisticaProductosBusqueda"));
		
		
		this.jButtonBusquedaEstadisticaProductosEstadisticaProductos.addActionListener(new ButtonActionListener(this,"BusquedaEstadisticaProductosEstadisticaProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadisticaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadisticaProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadisticaProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadisticaProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadisticaProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
					estadisticaproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadisticaProductos estadisticaproductosAux:estadisticaproductoss) {
					estadisticaproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadisticaProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadisticaProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
						estadisticaproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadisticaProductos estadisticaproductosAux:estadisticaproductoss) {
						estadisticaproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadisticaProductos estadisticaproductosAux:estadisticaproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadisticaProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadisticaProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadisticaProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadisticaProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadisticaProductos.getSelectedRows();
			
			EstadisticaProductos estadisticaproductosLocal=new EstadisticaProductos();
			
			//this.seleccionarTodosEstadisticaProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadisticaproductosLocal =(EstadisticaProductos) this.estadisticaproductosLogic.getEstadisticaProductoss().toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadisticaproductosLocal =(EstadisticaProductos) this.estadisticaproductoss.toArray()[this.jTableDatosEstadisticaProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadisticaproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
						estadisticaproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadisticaProductos estadisticaproductosAux:estadisticaproductoss) {
						estadisticaproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadisticaProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadisticaProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadisticaProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadisticaProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadisticaProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadisticaProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadisticaProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadisticaProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductosLogic.getEstadisticaProductoss()) {
				
						if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							estadisticaproductosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							estadisticaproductosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							estadisticaproductosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							estadisticaproductosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO)) {
							existe=true;
							estadisticaproductosAux.setcantidad_precio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							estadisticaproductosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadisticaProductos estadisticaproductosAux:estadisticaproductoss) {
					
						if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							estadisticaproductosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							estadisticaproductosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							estadisticaproductosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							estadisticaproductosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO)) {
							existe=true;
							estadisticaproductosAux.setcantidad_precio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							estadisticaproductosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadisticaProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadisticaProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadisticaProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadisticaProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadisticaProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadisticaProductos(conSplash);
				
					this.generarReporteEstadisticaProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadisticaProductossSeleccionados();
				//this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadisticaProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadisticaProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadisticaProductos();
				
				this.exportarEstadisticaProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadisticaProductoss();
				//this.importarEstadisticaProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadisticaProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadisticaProductossSeleccionados();
				//this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estadistica Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadisticaProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadisticaProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadisticaProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadisticaProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadisticaProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadisticaProductos(conSplash);
					
						//this.actualizarParametrosGeneralEstadisticaProductos();
						
						this.generarReporteProcesoAccionEstadisticaProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadisticaProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estadistica ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Estadistica Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadisticaProductos();
				
						this.actualizarParametrosGeneralEstadisticaProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadisticaproductosReturnGeneral=estadisticaproductosLogic.procesarAccionEstadisticaProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadisticaproductosLogic.getEstadisticaProductoss(),this.estadisticaproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadisticaProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadisticaProductos();
					
					EstadisticaProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadisticaProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadisticaProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxTiposAccionesFormularioEstadisticaProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadisticaProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadisticaProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadisticaProductos();
			
			if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
			EstadisticaProductos estadisticaproductos=new EstadisticaProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadisticaProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadisticaProductos.getSelectedItem();
			
			
			
			
			estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadisticaproductossSeleccionados.size()==1) {
				for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossSeleccionados) {
					estadisticaproductos=estadisticaproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadisticaProductos();
			
      		//this.finishProcessEstadisticaProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadisticaProductosReturnGeneral() throws Exception {
		if(this.estadisticaproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadisticaproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadisticaproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadisticaproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadisticaproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadisticaproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadisticaProductos(false);
		}
		
		if(this.estadisticaproductosReturnGeneral.getConRetornoLista() || this.estadisticaproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.estadisticaproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadisticaproductosLogic.setEstadisticaProductoss(this.estadisticaproductosReturnGeneral.getEstadisticaProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingEstadisticaProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadisticaProductos() throws Exception {
		
		
	}
	
	public ArrayList<EstadisticaProductos> getEstadisticaProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadisticaProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadisticaProductos estadisticaproductosAux:estadisticaproductosLogic.getEstadisticaProductoss()) {
					if(estadisticaproductosAux.getIsSelected()) {
						estadisticaproductossSeleccionados.add(estadisticaproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadisticaProductos estadisticaproductosAux:this.estadisticaproductoss) {
					if(estadisticaproductosAux.getIsSelected()) {
						estadisticaproductossSeleccionados.add(estadisticaproductosAux);				
					}
				}
			}
			
			if(estadisticaproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadisticaproductossSeleccionados.addAll(this.estadisticaproductosLogic.getEstadisticaProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadisticaproductossSeleccionados.addAll(this.estadisticaproductoss);				
					}
				}
			}
		} else {
			estadisticaproductossSeleccionados.add(this.estadisticaproductos);
		}
		
		return estadisticaproductossSeleccionados;
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
	
	public void generarReporteEstadisticaProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadisticaProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadisticaProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadisticaProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadisticaProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estadistica Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadisticaProductossSeleccionados() throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadisticaProductossSeleccionados() throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadisticaProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadisticaProductossSeleccionados() throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadisticaProductos();
		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadisticaProductos();
		
		
		//this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados ,estadisticaproductosImplementable,estadisticaproductosImplementableHome);
	}
	
	public void mostrarImportacionEstadisticaProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadisticaProductos();
		
		this.abrirFrameImportacionEstadisticaProductos();		
		
			
		//this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados ,estadisticaproductosImplementable,estadisticaproductosImplementableHome);
	}
	
	public void importarEstadisticaProductoss() throws Exception {		
	
	}
	
	public void exportarEstadisticaProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadisticaProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadisticaProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadisticaProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estadistica Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadisticaProductossSeleccionados() throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadisticaProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadisticaProductos(estadisticaproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadisticaproductosAux.setsDetalleGeneralEntityReporte(estadisticaproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadisticaProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadisticaProductos(EstadisticaProductos estadisticaproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadisticaproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getcantidad_precio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadisticaproductos.getcantidad().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadisticaProductossSeleccionados() throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadisticaProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadisticaProductos(row);				
				iRow++;
			}				
			
			for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadisticaProductos(estadisticaproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadisticaProductossSeleccionados() throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();		
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadisticaproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadisticaproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadisticaproductos");
			//elementRoot.appendChild(element);
		
			for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossSeleccionados) {
				element = document.createElement("estadisticaproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadisticaProductos(estadisticaproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estadistica Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadisticaProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CANTIDADPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadisticaProductos(EstadisticaProductos estadisticaproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getcantidad_precio());
		cell = row.createCell(iColumn++);cell.setCellValue(estadisticaproductos.getcantidad());				
	}
	
	public void setFilaDatosExportarXmlEstadisticaProductos(EstadisticaProductos estadisticaproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadisticaProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadisticaproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadisticaProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadisticaproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EstadisticaProductosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(estadisticaproductos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(EstadisticaProductosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(estadisticaproductos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(EstadisticaProductosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(estadisticaproductos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementfecha_inicio = document.createElement(EstadisticaProductosConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(estadisticaproductos.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(EstadisticaProductosConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(estadisticaproductos.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementcodigo_producto = document.createElement(EstadisticaProductosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(estadisticaproductos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre_producto = document.createElement(EstadisticaProductosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(estadisticaproductos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad_precio = document.createElement(EstadisticaProductosConstantesFunciones.CANTIDADPRECIO);
		elementcantidad_precio.appendChild(document.createTextNode(estadisticaproductos.getcantidad_precio().toString().trim()));
		element.appendChild(elementcantidad_precio);

		Element elementcantidad = document.createElement(EstadisticaProductosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(estadisticaproductos.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);
	}
	
	public void generarReporteGroupGenericoEstadisticaProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados=new ArrayList<EstadisticaProductos>();
		
		estadisticaproductossSeleccionados=this.getEstadisticaProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadisticaProductos(estadisticaproductossSeleccionados);
		
		this.generarReporteEstadisticaProductoss("Todos",estadisticaproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadisticaProductos(ArrayList<EstadisticaProductos> estadisticaproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadisticaProductos estadisticaproductosAux:estadisticaproductossSeleccionados) {
				estadisticaproductosAux.setsDetalleGeneralEntityReporte(estadisticaproductosAux.toString());
			
				if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(estadisticaproductosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(estadisticaproductosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(estadisticaproductosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(estadisticaproductosAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(estadisticaproductosAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(estadisticaproductosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(estadisticaproductosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(EstadisticaProductosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					estadisticaproductosAux.setsDescripcionGeneralEntityReporte1(estadisticaproductosAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadisticaProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadisticaProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadisticaProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=true;
				this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=true;
			}
			
			this.isVisibilidadCeldaModificarEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
			this.isVisibilidadCeldaModificarEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=true;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
			this.isVisibilidadCeldaModificarEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=true;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=true;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
			this.isVisibilidadCeldaModificarEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=true;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=true;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=true;
			this.isVisibilidadCeldaModificarEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
			this.isVisibilidadCeldaModificarEstadisticaProductos=true;
			this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
			this.isVisibilidadCeldaCancelarEstadisticaProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadisticaProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadisticaProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=true;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=true;
		} else {
			this.actualizarEstadoPanelsEstadisticaProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadisticaProductos=false;
			//this.isVisibilidadCeldaVerFormEstadisticaProductos=false;
			this.isVisibilidadCeldaDuplicarEstadisticaProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadisticaproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
			this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			if(!estadisticaproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;												
			}
			
			this.jButtonCerrarEstadisticaProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.estadisticaproductos)) {
			this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
			this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoEstadisticaProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesEstadisticaProductos=false;
		this.isVisibilidadCeldaGuardarCambiosEstadisticaProductos=false;
		//this.isVisibilidadCeldaModificarEstadisticaProductos=true;
		this.isVisibilidadCeldaActualizarEstadisticaProductos=false;
		this.isVisibilidadCeldaEliminarEstadisticaProductos=false;
		//this.isVisibilidadCeldaCancelarEstadisticaProductos=true;			
		this.isVisibilidadCeldaGuardarEstadisticaProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadisticaProductos() {
	}
	
	public void actualizarEstadoPanelsEstadisticaProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadisticaProductos!=null) {
				this.jScrollPanelDatosEdicionEstadisticaProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadisticaProductos!=null) {
				this.jScrollPanelDatosEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadisticaProductos!=null) {
				this.jPanelPaginacionEstadisticaProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
					this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.estadisticaproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEstadisticaProductos!=null) {
				this.jTabbedPaneBusquedasEstadisticaProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEstadisticaProductos!=null) {
				this.jPanelParametrosReportesEstadisticaProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaEstadisticaProductos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaEstadisticaProductos) {this.jTabbedPaneBusquedasEstadisticaProductos.remove(jPanelBusquedaEstadisticaProductosEstadisticaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaEstadisticaProductos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaEstadisticaProductos) {this.jTabbedPaneBusquedasEstadisticaProductos.remove(jPanelBusquedaEstadisticaProductosEstadisticaProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaEstadisticaProductos=isParaProducto;
			if(!this.isVisibilidadBusquedaEstadisticaProductos) {this.jTabbedPaneBusquedasEstadisticaProductos.remove(jPanelBusquedaEstadisticaProductosEstadisticaProductos);}
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
			
			this.inicializarActualizarBindingTablaEstadisticaProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadisticaProductos() {
		this.updateBorderResaltarBusquedasFormularioEstadisticaProductos();
		this.updateVisibilidadBusquedasFormularioEstadisticaProductos();
		this.updateHabilitarBusquedasFormularioEstadisticaProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadisticaProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEstadisticaProductos.getComponents().length>0) {
	

		if(this.estadisticaproductosConstantesFunciones.resaltarBusquedaEstadisticaProductosEstadisticaProductos!=null) {
			index= this.jTabbedPaneBusquedasEstadisticaProductos.indexOfComponent(this.jPanelBusquedaEstadisticaProductosEstadisticaProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadisticaProductos.getComponent(index);
				jPanel.setBorder(this.estadisticaproductosConstantesFunciones.resaltarBusquedaEstadisticaProductosEstadisticaProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEstadisticaProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEstadisticaProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadisticaProductos.indexOfComponent(this.jPanelBusquedaEstadisticaProductosEstadisticaProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEstadisticaProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.estadisticaproductosConstantesFunciones.mostrarBusquedaEstadisticaProductosEstadisticaProductos);
			if(!this.estadisticaproductosConstantesFunciones.mostrarBusquedaEstadisticaProductosEstadisticaProductos && index>-1) {
				this.jTabbedPaneBusquedasEstadisticaProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEstadisticaProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEstadisticaProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEstadisticaProductos.indexOfComponent(this.jPanelBusquedaEstadisticaProductosEstadisticaProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEstadisticaProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.estadisticaproductosConstantesFunciones.activarBusquedaEstadisticaProductosEstadisticaProductos);
				this.jTabbedPaneBusquedasEstadisticaProductos.setEnabledAt(index,this.estadisticaproductosConstantesFunciones.activarBusquedaEstadisticaProductosEstadisticaProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEstadisticaProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaEstadisticaProductos")) {
			index= this.jTabbedPaneBusquedasEstadisticaProductos.indexOfComponent(this.jPanelBusquedaEstadisticaProductosEstadisticaProductos);

			this.jTabbedPaneBusquedasEstadisticaProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEstadisticaProductos.getComponent(index);

			this.estadisticaproductosConstantesFunciones.setResaltarBusquedaEstadisticaProductosEstadisticaProductos(resaltar);

			jPanel.setBorder(this.estadisticaproductosConstantesFunciones.resaltarBusquedaEstadisticaProductosEstadisticaProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEstadisticaProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEstadisticaProductos() throws Exception {

		if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadisticaProductos();
		this.updateVisibilidadResaltarControlesFormularioEstadisticaProductos();
		this.updateHabilitarResaltarControlesFormularioEstadisticaProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadisticaProductos() throws Exception {
		if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadisticaproductosConstantesFunciones.resaltaridEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltaridEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarid_empresaEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarid_empresaEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarid_sucursalEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarid_sucursalEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarid_productoEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarid_productoEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarfecha_inicioEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_inicioEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarfecha_inicioEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarfecha_finEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_finEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarfecha_finEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarcodigo_productoEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarcodigo_productoEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarnombre_productoEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarnombre_productoEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarcantidad_precioEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarcantidad_precioEstadisticaProductos);}
		if(this.estadisticaproductosConstantesFunciones.resaltarcantidadEstadisticaProductos!=null && this.jInternalFrameDetalleFormEstadisticaProductos!=null) {this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setBorder(this.estadisticaproductosConstantesFunciones.resaltarcantidadEstadisticaProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadisticaProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
	
		//this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostraridEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelidEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostraridEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarid_empresaEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelid_empresaEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarid_empresaEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarid_sucursalEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelid_sucursalEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarid_sucursalEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarid_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelid_productoEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarid_productoEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_inicioEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarfecha_inicioEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelfecha_inicioEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarfecha_inicioEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_finEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarfecha_finEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelfecha_finEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarfecha_finEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarcodigo_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelcodigo_productoEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarcodigo_productoEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarnombre_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelnombre_productoEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarnombre_productoEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarcantidad_precioEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelcantidad_precioEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarcantidad_precioEstadisticaProductos);
		//this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarcantidadEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jPanelcantidadEstadisticaProductos.setVisible(this.estadisticaproductosConstantesFunciones.mostrarcantidadEstadisticaProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadisticaProductos() throws Exception {
		if(this.jInternalFrameDetalleFormEstadisticaProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadisticaProductos!=null) {
	
		this.jInternalFrameDetalleFormEstadisticaProductos.jLabelidEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activaridEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_empresaEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarid_empresaEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_sucursalEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarid_sucursalEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jComboBoxid_productoEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarid_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_inicioEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarfecha_inicioEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jDateChooserfecha_finEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarfecha_finEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcodigo_productoEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarcodigo_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextAreanombre_productoEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarnombre_productoEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidad_precioEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarcantidad_precioEstadisticaProductos);
		this.jInternalFrameDetalleFormEstadisticaProductos.jTextFieldcantidadEstadisticaProductos.setEnabled(this.estadisticaproductosConstantesFunciones.activarcantidadEstadisticaProductos);
		}
	}
	
		
}