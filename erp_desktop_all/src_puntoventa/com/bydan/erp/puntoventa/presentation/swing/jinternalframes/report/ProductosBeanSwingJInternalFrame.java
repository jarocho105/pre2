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

//import com.bydan.erp.puntoventa.util.ProductosConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ProductosParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ProductosParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ProductosBean;
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
public class ProductosBeanSwingJInternalFrame extends ProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Productos> productosValidator = new ClassValidator<Productos>(Productos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Productos productos;	
	public Productos productosAux;
	public Productos productosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Productos productosTotales;
	public Long idProductosActual;
	public Long iIdNuevoProductos=0L;
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
	
	public Boolean isPermisoTodoProductos;
	public Boolean isPermisoNuevoProductos;
	public Boolean isPermisoActualizarProductos;
	public Boolean isPermisoActualizarOriginalProductos;
	public Boolean isPermisoEliminarProductos;
	public Boolean isPermisoGuardarCambiosProductos;
	public Boolean isPermisoConsultaProductos;
	public Boolean isPermisoBusquedaProductos;
	public Boolean isPermisoReporteProductos;
	public Boolean isPermisoPaginacionMedioProductos;
	public Boolean isPermisoPaginacionAltoProductos;
	public Boolean isPermisoPaginacionTodoProductos;
	public Boolean isPermisoCopiarProductos;
	public Boolean isPermisoVerFormProductos;
	public Boolean isPermisoDuplicarProductos;
	public Boolean isPermisoOrdenProductos;
	
	
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
	
	public ProductosParameterReturnGeneral productosReturnGeneral;
	public ProductosParameterReturnGeneral productosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductos=false;
	public Boolean esParaAccionDesdeFormularioProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosSessionBeanAdditional productosSessionBeanAdditional=null;
	
	public ProductosSessionBeanAdditional getProductosSessionBeanAdditional() {
		return this.productosSessionBeanAdditional;
	}
	
	public void setProductosSessionBeanAdditional(ProductosSessionBeanAdditional productosSessionBeanAdditional) {
		try {
			this.productosSessionBeanAdditional=productosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosBeanSwingJInternalFrameAdditional productosBeanSwingJInternalFrameAdditional=null;
	//public class ProductosBeanSwingJInternalFrame
	
	public ProductosBeanSwingJInternalFrameAdditional getProductosBeanSwingJInternalFrameAdditional() {
		return this.productosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosBeanSwingJInternalFrameAdditional(ProductosBeanSwingJInternalFrameAdditional productosBeanSwingJInternalFrameAdditional) {
		try {
			this.productosBeanSwingJInternalFrameAdditional=productosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosLogic productosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Productos productosBean;
	public ProductosConstantesFunciones productosConstantesFunciones;
	//public ProductosParameterReturnGeneral productosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<Productos> productoss;	
	//public List<Productos> productossEliminados;
	//public List<Productos> productossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductos=false;
	public Boolean isVisibilidadCeldaDuplicarProductos=true;
	public Boolean isVisibilidadCeldaCopiarProductos=true;
	public Boolean isVisibilidadCeldaVerFormProductos=true;
	public Boolean isVisibilidadCeldaOrdenProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductos=false;
	public Boolean isVisibilidadCeldaModificarProductos=false;
	public Boolean isVisibilidadCeldaActualizarProductos=false;
	public Boolean isVisibilidadCeldaEliminarProductos=false;
	public Boolean isVisibilidadCeldaCancelarProductos=false;
	public Boolean isVisibilidadCeldaGuardarProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaProductos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductos() {
		return this.iIdNuevoProductos;
	}

	public void setiIdNuevoProductos(Long iIdNuevoProductos) {
		this.iIdNuevoProductos = iIdNuevoProductos;
	}
	
	public Long getidProductosActual() {
		return this.idProductosActual;
	}

	public void setidProductosActual(Long idProductosActual) {
		this.idProductosActual = idProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Productos getproductos() {
		return this.productos;
	}

	public void setproductos(Productos productos) {
		this.productos = productos;
	}
	
	public Productos getproductosAux() {
		return this.productosAux;
	}

	public void setproductosAux(Productos productosAux) {
		this.productosAux = productosAux;
	}				
	
	public Productos getproductosAnterior() {
		return this.productosAnterior;
	}

	public void setproductosAnterior(Productos productosAnterior) {
		this.productosAnterior = productosAnterior;
	}	
	
	public Productos getproductosTotales() {
		return this.productosTotales;
	}

	public void setproductosTotales(Productos productosTotales) {
		this.productosTotales = productosTotales;
	}	
	
	public Productos getproductosBean() {
		return this.productosBean;
	}

	public void setproductosBean(Productos productosBean) {
		this.productosBean = productosBean;
	}	
	
	public ProductosParameterReturnGeneral getproductosReturnGeneral() {
		return this.productosReturnGeneral;
	}

	public void setproductosReturnGeneral(ProductosParameterReturnGeneral productosReturnGeneral) {
		this.productosReturnGeneral = productosReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaProductos=new Date();

	public Date getfecha_inicioBusquedaProductos() {
		return this.fecha_inicioBusquedaProductos;
	}

	public void setfecha_inicioBusquedaProductos(Date fecha_inicioBusquedaProductos) {
		this.fecha_inicioBusquedaProductos = fecha_inicioBusquedaProductos;
	}

;
	public Date fecha_finBusquedaProductos=new Date();

	public Date getfecha_finBusquedaProductos() {
		return this.fecha_finBusquedaProductos;
	}

	public void setfecha_finBusquedaProductos(Date fecha_finBusquedaProductos) {
		this.fecha_finBusquedaProductos = fecha_finBusquedaProductos;
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
	
	
	public ProductosLogic getProductosLogic()	{		
		return productosLogic;
	}

	public void setProductosLogic(ProductosLogic productosLogic) {
		this.productosLogic = productosLogic;
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
	
	public Boolean getIsEsNuevoProductos() {
		return isEsNuevoProductos;
	}

	public void setIsEsNuevoProductos(Boolean isEsNuevoProductos) {
		this.isEsNuevoProductos = isEsNuevoProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioProductos() {
		return esParaAccionDesdeFormularioProductos;
	}
	
	public void setEsParaAccionDesdeFormularioProductos(Boolean esParaAccionDesdeFormularioProductos) {
		this.esParaAccionDesdeFormularioProductos = esParaAccionDesdeFormularioProductos;
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

			if(this.productosSessionBean==null) {
				this.productosSessionBean=new ProductosSessionBean();
			}

			if(!this.productosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosSessionBean.getlidEmpresaActual());
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

			if(this.productosSessionBean==null) {
				this.productosSessionBean=new ProductosSessionBean();
			}

			if(!this.productosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosSessionBean.getlidSucursalActual());
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

			if(this.productosSessionBean==null) {
				this.productosSessionBean=new ProductosSessionBean();
			}

			if(!this.productosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productosSessionBean.getlidProductoActual());
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

					if(this.productos!=null) {
						this.productos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductos!=null) {
						this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductos!=null) {
						if(this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosGenerico)throws Exception
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
				jComboBoxid_empresaProductosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosGenerico!=null && jComboBoxid_empresaProductosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosGenerico.setSelectedIndex(0);
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

					if(this.productos!=null) {
						this.productos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductos!=null) {
						this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductos!=null) {
						if(this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosGenerico)throws Exception
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
				jComboBoxid_sucursalProductosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosGenerico!=null && jComboBoxid_sucursalProductosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosGenerico.setSelectedIndex(0);
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

					if(this.productos!=null) {
						this.productos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductos!=null) {
						this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductos!=null) {
						if(this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductosGenerico)throws Exception
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
				jComboBoxid_productoProductosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductosGenerico!=null && jComboBoxid_productoProductosGenerico.getItemCount()>0) {
					jComboBoxid_productoProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Productos productos,JComboBox jComboBoxid_empresaProductosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productos.setid_empresa(empresaAux.getId());
				productos.setempresa_descripcion(ProductosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Productos productos,JComboBox jComboBoxid_sucursalProductosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productos.setid_sucursal(sucursalAux.getId());
				productos.setsucursal_descripcion(ProductosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(Productos productos,JComboBox jComboBoxid_productoProductosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productos.setid_producto(productoAux.getId());
				productos.setproducto_descripcion(ProductosConstantesFunciones.getProductoDescripcion(productoAux));
				productos.setProducto(productoAux);			}
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

					if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductos!=null) { 
							this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductos!=null) { 
					}

					if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductos!=null) { 
							this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductos!=null) { 
					}

					if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductos!=null) { 
							this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductos!=null) { 
					}

					if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductos!=null) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductos!=null) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductos!=null) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductos!=null) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductos!=null) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductos!=null) {
							this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesProductos() throws Exception {
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
		
	public ProductosParameterReturnGeneral getProductosParameterGeneral() {
		return this.productosParameterGeneral;
	}
	
	public void setProductosParameterGeneral(ProductosParameterReturnGeneral productosParameterGeneral) {
		this.productosParameterGeneral = productosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductos() {
		return isPermisoTodoProductos;
	}

	public void setIsPermisoTodoProductos(Boolean isPermisoTodoProductos) {
		this.isPermisoTodoProductos = isPermisoTodoProductos;
	}

	public Boolean getIsPermisoNuevoProductos() {
		return isPermisoNuevoProductos;
	}

	public void setIsPermisoNuevoProductos(Boolean isPermisoNuevoProductos) {
		this.isPermisoNuevoProductos = isPermisoNuevoProductos;
	}

	public Boolean getIsPermisoActualizarProductos() {
		return isPermisoActualizarProductos;
	}

	public void setIsPermisoActualizarProductos(Boolean isPermisoActualizarProductos) {
		this.isPermisoActualizarProductos = isPermisoActualizarProductos;
	}

	public Boolean getIsPermisoEliminarProductos() {
		return isPermisoEliminarProductos;
	}

	public void setIsPermisoEliminarProductos(Boolean isPermisoEliminarProductos) {
		this.isPermisoEliminarProductos = isPermisoEliminarProductos;
	}

	public Boolean getIsPermisoGuardarCambiosProductos() {
		return isPermisoGuardarCambiosProductos;
	}

	public void setIsPermisoGuardarCambiosProductos(Boolean isPermisoGuardarCambiosProductos) {
		this.isPermisoGuardarCambiosProductos = isPermisoGuardarCambiosProductos;
	}
	
	public Boolean getIsPermisoConsultaProductos() {
		return isPermisoConsultaProductos;
	}

	public void setIsPermisoConsultaProductos(Boolean isPermisoConsultaProductos) {
		this.isPermisoConsultaProductos = isPermisoConsultaProductos;
	}

	public Boolean getIsPermisoBusquedaProductos() {
		return isPermisoBusquedaProductos;
	}

	public void setIsPermisoBusquedaProductos(Boolean isPermisoBusquedaProductos) {
		this.isPermisoBusquedaProductos = isPermisoBusquedaProductos;
	}

	public Boolean getIsPermisoReporteProductos() {
		return isPermisoReporteProductos;
	}

	public void setIsPermisoReporteProductos(Boolean isPermisoReporteProductos) {
		this.isPermisoReporteProductos = isPermisoReporteProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductos() {
		return isPermisoPaginacionMedioProductos;
	}

	public void setIsPermisoPaginacionMedioProductos(Boolean isPermisoPaginacionMedioProductos) {
		this.isPermisoPaginacionMedioProductos = isPermisoPaginacionMedioProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductos() {
		return isPermisoPaginacionTodoProductos;
	}

	public void setIsPermisoPaginacionTodoProductos(Boolean isPermisoPaginacionTodoProductos) {
		this.isPermisoPaginacionTodoProductos = isPermisoPaginacionTodoProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductos() {
		return isPermisoPaginacionAltoProductos;
	}

	public void setIsPermisoPaginacionAltoProductos(Boolean isPermisoPaginacionAltoProductos) {
		this.isPermisoPaginacionAltoProductos = isPermisoPaginacionAltoProductos;
	}
	
	public Boolean getIsPermisoCopiarProductos() {
		return isPermisoCopiarProductos;
	}

	public void setIsPermisoCopiarProductos(Boolean isPermisoCopiarProductos) {
		this.isPermisoCopiarProductos = isPermisoCopiarProductos;
	}
	
	public Boolean getIsPermisoVerFormProductos() {
		return isPermisoVerFormProductos;
	}

	public void setIsPermisoVerFormProductos(Boolean isPermisoVerFormProductos) {
		this.isPermisoVerFormProductos = isPermisoVerFormProductos;
	}
	
	public Boolean getIsPermisoDuplicarProductos() {
		return isPermisoDuplicarProductos;
	}

	public void setIsPermisoDuplicarProductos(Boolean isPermisoDuplicarProductos) {
		this.isPermisoDuplicarProductos = isPermisoDuplicarProductos;
	}
	
	public Boolean getIsPermisoOrdenProductos() {
		return isPermisoOrdenProductos;
	}

	public void setIsPermisoOrdenProductos(Boolean isPermisoOrdenProductos) {
		this.isPermisoOrdenProductos = isPermisoOrdenProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductos() {
		return isVisibilidadCeldaNuevoProductos;
	}

	public void setIsVisibilidadCeldaNuevoProductos(Boolean isVisibilidadCeldaNuevoProductos) {
		this.isVisibilidadCeldaNuevoProductos = isVisibilidadCeldaNuevoProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductos() {
		return isVisibilidadCeldaDuplicarProductos;
	}

	public void setIsVisibilidadCeldaDuplicarProductos(Boolean isVisibilidadCeldaDuplicarProductos) {
		this.isVisibilidadCeldaDuplicarProductos = isVisibilidadCeldaDuplicarProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductos() {
		return isVisibilidadCeldaCopiarProductos;
	}

	public void setIsVisibilidadCeldaCopiarProductos(Boolean isVisibilidadCeldaCopiarProductos) {
		this.isVisibilidadCeldaCopiarProductos = isVisibilidadCeldaCopiarProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductos() {
		return isVisibilidadCeldaVerFormProductos;
	}

	public void setIsVisibilidadCeldaVerFormProductos(Boolean isVisibilidadCeldaVerFormProductos) {
		this.isVisibilidadCeldaVerFormProductos = isVisibilidadCeldaVerFormProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductos() {
		return isVisibilidadCeldaOrdenProductos;
	}

	public void setIsVisibilidadCeldaOrdenProductos(Boolean isVisibilidadCeldaOrdenProductos) {
		this.isVisibilidadCeldaOrdenProductos = isVisibilidadCeldaOrdenProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductos() {
		return isVisibilidadCeldaNuevoRelacionesProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductos(Boolean isVisibilidadCeldaNuevoRelacionesProductos) {
		this.isVisibilidadCeldaNuevoRelacionesProductos = isVisibilidadCeldaNuevoRelacionesProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductos() {
		return isVisibilidadCeldaModificarProductos;
	}

	public void setIsVisibilidadCeldaModificarProductos(Boolean isVisibilidadCeldaModificarProductos) {
		this.isVisibilidadCeldaModificarProductos = isVisibilidadCeldaModificarProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductos() {
		return isVisibilidadCeldaActualizarProductos;
	}

	public void setIsVisibilidadCeldaActualizarProductos(Boolean isVisibilidadCeldaActualizarProductos) {
		this.isVisibilidadCeldaActualizarProductos = isVisibilidadCeldaActualizarProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductos() {
		return isVisibilidadCeldaEliminarProductos;
	}

	public void setIsVisibilidadCeldaEliminarProductos(Boolean isVisibilidadCeldaEliminarProductos) {
		this.isVisibilidadCeldaEliminarProductos = isVisibilidadCeldaEliminarProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductos() {
		return isVisibilidadCeldaCancelarProductos;
	}

	public void setIsVisibilidadCeldaCancelarProductos(Boolean isVisibilidadCeldaCancelarProductos) {
		this.isVisibilidadCeldaCancelarProductos = isVisibilidadCeldaCancelarProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductos() {
		return isVisibilidadCeldaGuardarProductos;
	}

	public void setIsVisibilidadCeldaGuardarProductos(Boolean isVisibilidadCeldaGuardarProductos) {
		this.isVisibilidadCeldaGuardarProductos = isVisibilidadCeldaGuardarProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductos() {
		return isVisibilidadCeldaGuardarCambiosProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductos(Boolean isVisibilidadCeldaGuardarCambiosProductos) {
		this.isVisibilidadCeldaGuardarCambiosProductos = isVisibilidadCeldaGuardarCambiosProductos;
	}
		
	public ProductosSessionBean getproductosSessionBean() {
		return this.productosSessionBean;
	}
	
	public void setproductosSessionBean(ProductosSessionBean productosSessionBean) {
		this.productosSessionBean=productosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductos() {
		return this.isVisibilidadBusquedaProductos;
	}

	public void setisVisibilidadBusquedaProductos(Boolean isVisibilidadBusquedaProductos) {
		this.isVisibilidadBusquedaProductos=isVisibilidadBusquedaProductos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductos(Productos productos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productos,null);
				this.setActualParaGuardarSucursalForeignKey(productos,null);
				this.setActualParaGuardarProductoForeignKey(productos,null);
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
	
	public void bugActualizarReferenciaActual(Productos productos,Productos productosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductos(productos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosAux.setId(productos.getId());
		productosAux.setVersionRow(productos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Productos productosLocal) throws Exception {
		
		if(this.productosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Productos productosLocal) throws Exception {	
		if(this.productosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosValidator.getInvalidValues(this.productos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Productos productos,List<Productos> productoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(Productos productos,List<Productos> productoss) throws Exception {
		try	{			
			ProductosConstantesFunciones.actualizarSelectedLista(productos,productoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Productos> productossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productossLocal=this.productosLogic.getProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productossLocal=this.productoss;
			}
			//ARCHITECTURE
		
			for(Productos productosLocal:productossLocal) {
				if(this.permiteMantenimiento(productosLocal) && productosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosConstantesFunciones.getProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelid_productoProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelnombre_productoProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelfechaProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelcantidadProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductos.jLabelid_productoProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductos.jLabelnombre_productoProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductos.jLabelfechaProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductos.jLabelcantidadProductos,"");
		
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
		this.iIdNuevoProductos--;	
		
		
		this.productosAux=new Productos();
		
		this.productosAux.setId(this.iIdNuevoProductos);
		this.productosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosLogic.getProductoss().add(this.productosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoss.add(this.productosAux);
		}
		//ARCHITECTURE
		
		this.productos=this.productosAux;
		
		if(ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductos(this.productos);
			this.setVariablesObjetoActualToFormularioForeignKeyProductos(this.productos);
		}
				
		//this.setDefaultControlesProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductos(this.productosBean,this.productos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductos(this.productosReturnGeneral,this.productosBean,false);
		
		if(this.productosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductos(this.productosReturnGeneral.getProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductos(this.productosReturnGeneral.getProductos());
		}
		
		if(this.productosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductos(this.productosReturnGeneral.getProductos(),classes);//this.productosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductos(this.productos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosBeanSwingJInternalFrameAdditional.RecargarFormProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductos(false);
						
			if(productosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductos();
			}
			
			this.actualizarVisualTableDatosProductos();
			
			this.jTableDatosProductos.setRowSelectionInterval(this.getIndiceNuevoProductos(), this.getIndiceNuevoProductos());
			
			this.seleccionarFilaTablaProductosActual();
						
			this.actualizarEstadoCeldasBotonesProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductos.jDateChooserfecha_inicioProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarfecha_inicioProductos);
		this.jInternalFrameDetalleFormProductos.jDateChooserfecha_finProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarfecha_finProductos);
		this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarnombre_productoProductos);
		this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarfechaProductos);
		this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarcantidadProductos);	
		//
		this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarid_empresaProductos);//
		this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarid_sucursalProductos);//
		this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setEnabled(isHabilitar && this.productosConstantesFunciones.activarid_productoProductos);
	};
	
	public void setDefaultControlesProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosSessionBean.setConGuardarRelaciones(true);			
			this.productosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.setVisible(true);
			
					
		} else {
			//this.productosSessionBean.setConGuardarRelaciones(false);			
			this.productosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Productos productosAux:this.productosLogic.getProductoss()) {
				if(productosAux.getId().equals(this.iIdNuevoProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Productos productosAux:this.productoss) {
				if(productosAux.getId().equals(this.iIdNuevoProductos)) {
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
	
	public int getIndiceActualProductos(Productos productos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Productos productosAux:this.productosLogic.getProductoss()) {
				if(productosAux.getId().equals(productos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Productos productosAux:this.productoss) {
				if(productosAux.getId().equals(productos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductos(Productos productosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Productos productosAux:this.productosLogic.getProductoss()) {
				if(productosAux.getProductosOriginal().getId().equals(productosOriginal.getId())) {
					existe=true;
					productosOriginal.setId(productosAux.getId());
					productosOriginal.setVersionRow(productosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Productos productosAux:this.productoss) {
				if(productosAux.getProductosOriginal().getId().equals(productosOriginal.getId())) {
					existe=true;
					productosOriginal.setId(productosAux.getId());
					productosOriginal.setVersionRow(productosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductos(Boolean esParaCancelar) throws Exception {
		productossAux=new ArrayList<Productos>();
		productosAux=new Productos();
		
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Productos productosAux:this.productosLogic.getProductoss()) {
					if(productosAux.getId()<0) {
						productossAux.add(productosAux);
					}		
				}
				this.iIdNuevoProductos=0L;
				this.productosLogic.getProductoss().removeAll(productossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Productos productosAux:this.productoss) {
					if(productosAux.getId()<0) {
						productossAux.add(productosAux);
					}		
				}
				this.iIdNuevoProductos=0L;
				this.productoss.removeAll(productossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductos 
					&& this.productosLogic.getProductoss().size()>0
					) {
					productosAux=this.productosLogic.getProductoss().get(this.productosLogic.getProductoss().size() - 1);
				
					if(productosAux.getId()<0) {
						this.productosLogic.getProductoss().remove(productosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductos && this.productoss.size()>0) {
					productosAux=this.productoss.get(this.productoss.size() - 1);
				
					if(productosAux.getId()<0) {
						this.productoss.remove(productosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productos.getId()<0) {
				this.productosLogic.getProductoss().remove(this.productos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productos.getId()<0) {
				this.productoss.remove(this.productos);
			}
		}			
	}
	
	public void setEstadosInicialesProductos(List<Productos> productossAux) throws Exception {
		ProductosConstantesFunciones.setEstadosInicialesProductos(productossAux);
	}
	
	public void setEstadosInicialesProductos(Productos productosAux) throws Exception {
		ProductosConstantesFunciones.setEstadosInicialesProductos(productosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosActual()) {
				if(!this.isEsNuevoProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos ?", "MANTENIMIENTO DE Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Productos productos) throws Exception {
		ProductosConstantesFunciones.seleccionarAsignar(this.productos,productos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductos=this.isPermisoActualizarOriginalProductos;
			
			
			this.seleccionarAsignar(productos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosSessionBean.setsFuncionBusquedaRapida(this.productosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductos(esParaCancelar);				
				this.cancelarNuevoProductos(esParaCancelar);								
			}
			
			this.productos=new Productos();
			
			this.inicializarProductos();
			
			this.actualizarEstadoCeldasBotonesProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductos() throws Exception {
		try {
			ProductosConstantesFunciones.inicializarProductos(this.productos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosLogic.getProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoss(String sAccionBusqueda,List<Productos> productossParaReportes) throws Exception {
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
					sPathReporteFinal="Productos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Productos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productoses");		
		parameters.put("busquedapor", ProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductos=new JRBeanArrayDataSource(ProductosJInternalFrame.TraerProductosBeans(productossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosBean.TraerProductosBeans(productossParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoss(sAccionBusqueda,sTipoArchivoReporte,productossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoss(sAccionBusqueda,sTipoArchivoReporte,productossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosActionPerformed(null);
					//this.generarExcelReporteProductoss(sAccionBusqueda,sTipoArchivoReporte,productossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoss(sAccionBusqueda,sTipoArchivoReporte,productossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoss(sAccionBusqueda,sTipoArchivoReporte,productossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoss(sAccionBusqueda,sTipoArchivoReporte,productossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<Productos> productossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Productoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Productos productos : productossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosConstantesFunciones.generarExcelReporteDataProductos("NORMAL",row,workbook,productos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductos(String sTipo,Row row,Workbook workbook) {
		
		ProductosConstantesFunciones.generarExcelReporteHeaderProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<Productos> productossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Productoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Productos productos : productossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosConstantesFunciones.getProductosDescripcion(productos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productos.getcantidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<Productos> productossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Productos> productossRespaldo=null;
		
		classes=ProductosConstantesFunciones.getClassesRelationshipsOfProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosLogic.setDatosCliente(this.datosCliente);
		this.productosLogic.setDatosDeep(this.datosDeep);
		this.productosLogic.setIsConDeep(true);
		
		productossRespaldo=this.productosLogic.getProductoss();
		
		this.productosLogic.setProductoss(productossParaReportes);	
		this.productosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productossParaReportes=this.productosLogic.getProductoss();
		this.productosLogic.setProductoss(productossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Productoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Productos productos : productossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosConstantesFunciones.generarExcelReporteDataProductos("NORMAL",row,workbook,productos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosConstantesFunciones.getProductosDescripcion(productos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductos() throws Exception {		
		this.startProcessProductos(true);
	}
	
	public void startProcessProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductos ,this.jPanelParametrosReportesProductos, this.jScrollPanelDatosProductos,this.jPanelPaginacionProductos, this.jScrollPanelDatosEdicionProductos, this.jPanelAccionesProductos,this.jPanelAccionesFormularioProductos,this.jmenuBarProductos,this.jmenuBarDetalleProductos,this.jTtoolBarProductos,this.jTtoolBarDetalleProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductos=this.jTabbedPaneBusquedasProductos; 
		
		final JPanel jPanelParametrosReportesProductos=this.jPanelParametrosReportesProductos;
		//final JScrollPane jScrollPanelDatosProductos=this.jScrollPanelDatosProductos;
		final JTable jTableDatosProductos=this.jTableDatosProductos;		
		final JPanel jPanelPaginacionProductos=this.jPanelPaginacionProductos;
		//final JScrollPane jScrollPanelDatosEdicionProductos=this.jScrollPanelDatosEdicionProductos;
		final JPanel jPanelAccionesProductos=this.jPanelAccionesProductos;
		
		JPanel jPanelCamposAuxiliarProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
			jPanelCamposAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jPanelCamposProductos;
			jPanelAccionesFormularioAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jPanelAccionesFormularioProductos;
		}
		
		final JPanel jPanelCamposProductos=jPanelCamposAuxiliarProductos;
		final JPanel jPanelAccionesFormularioProductos=jPanelAccionesFormularioAuxiliarProductos;
		
		
		final JMenuBar jmenuBarProductos=this.jmenuBarProductos;
		final JToolBar jTtoolBarProductos=this.jTtoolBarProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
			jmenuBarDetalleAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jmenuBarDetalleProductos;
			jTtoolBarDetalleAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jTtoolBarDetalleProductos;
		}
		
		final JMenuBar jmenuBarDetalleProductos=jmenuBarDetalleAuxiliarProductos;
		final JToolBar jTtoolBarDetalleProductos=jTtoolBarDetalleAuxiliarProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductos;
			processRunnable.jTableDatos=jTableDatosProductos;
			processRunnable.jPanelCampos=jPanelCamposProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductos;
			processRunnable.jTtoolBar=jTtoolBarProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductos ,jPanelParametrosReportesProductos,jTableDatosProductos, /*jScrollPanelDatosProductos,*/jPanelCamposProductos,jPanelPaginacionProductos, /*jScrollPanelDatosEdicionProductos,*/ jPanelAccionesProductos,jPanelAccionesFormularioProductos,jmenuBarProductos,jmenuBarDetalleProductos,jTtoolBarProductos,jTtoolBarDetalleProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductos ,jPanelParametrosReportesProductos, jScrollPanelDatosProductos,jPanelPaginacionProductos, jScrollPanelDatosEdicionProductos, jPanelAccionesProductos,jPanelAccionesFormularioProductos,jmenuBarProductos,jmenuBarDetalleProductos,jTtoolBarProductos,jTtoolBarDetalleProductos);
						
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
	
	public void finishProcessProductos() {// throws Exception 
		this.finishProcessProductos(true);
	}
	
	public void finishProcessProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductos ,this.jPanelParametrosReportesProductos, this.jScrollPanelDatosProductos,this.jPanelPaginacionProductos, this.jScrollPanelDatosEdicionProductos, this.jPanelAccionesProductos,this.jPanelAccionesFormularioProductos,this.jmenuBarProductos,this.jmenuBarDetalleProductos,this.jTtoolBarProductos,this.jTtoolBarDetalleProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductos=this.jTabbedPaneBusquedasProductos; 
		
		final JPanel jPanelParametrosReportesProductos=this.jPanelParametrosReportesProductos;
		//final JScrollPane jScrollPanelDatosProductos=this.jScrollPanelDatosProductos;
		final JTable jTableDatosProductos=this.jTableDatosProductos;		
		final JPanel jPanelPaginacionProductos=this.jPanelPaginacionProductos;
		//final JScrollPane jScrollPanelDatosEdicionProductos=this.jScrollPanelDatosEdicionProductos;
		final JPanel jPanelAccionesProductos=this.jPanelAccionesProductos;
		
		JPanel jPanelCamposAuxiliarProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
			jPanelCamposAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jPanelCamposProductos;
			jPanelAccionesFormularioAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jPanelAccionesFormularioProductos;
		}
		
		final JPanel jPanelCamposProductos=jPanelCamposAuxiliarProductos;
		final JPanel jPanelAccionesFormularioProductos=jPanelAccionesFormularioAuxiliarProductos;
		
		
		final JMenuBar jmenuBarProductos=this.jmenuBarProductos;		
		final JToolBar jTtoolBarProductos=this.jTtoolBarProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
			jmenuBarDetalleAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jmenuBarDetalleProductos;
			jTtoolBarDetalleAuxiliarProductos=this.jInternalFrameDetalleFormProductos.jTtoolBarDetalleProductos;		
		}
		
		final JMenuBar jmenuBarDetalleProductos=jmenuBarDetalleAuxiliarProductos;
		final JToolBar jTtoolBarDetalleProductos=jTtoolBarDetalleAuxiliarProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductos;
			processRunnable.jTableDatos=jTableDatosProductos;
			processRunnable.jPanelCampos=jPanelCamposProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductos;
			processRunnable.jTtoolBar=jTtoolBarProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductos ,jPanelParametrosReportesProductos, jTableDatosProductos,/*jScrollPanelDatosProductos,*/jPanelCamposProductos,jPanelPaginacionProductos, /*jScrollPanelDatosEdicionProductos,*/ jPanelAccionesProductos,jPanelAccionesFormularioProductos,jmenuBarProductos,jmenuBarDetalleProductos,jTtoolBarProductos,jTtoolBarDetalleProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosConstantesFunciones.getsFinalQueryProductos();
		String  finalQueryPaginacionTodos=this.productosConstantesFunciones.getsFinalQueryProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosConstantesFunciones.getArrayColumnasGlobalesNoProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosConstantesFunciones.getArrayColumnasGlobalesProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productossEliminados= new ArrayList<Productos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductos();
		
				///*ProductosSessionBean*/this.productosSessionBean=new ProductosSessionBean();
			
			if(this.productosSessionBean==null) {
				this.productosSessionBean=new ProductosSessionBean();
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
					this.iNumeroPaginacion=ProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosConstantesFunciones.getClassesForeignKeysOfProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productossAux= new ArrayList<Productos>();
			
				
			productosLogic.setDatosCliente(this.datosCliente);
			productosLogic.setDatosDeep(this.datosDeep);
			productosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductos")) {
				this.sDetalleReporte=ProductosConstantesFunciones.getDetalleIndiceBusquedaProductos(fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosLogic.getProductossBusquedaProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosConstantesFunciones.getDetalleIndiceBusquedaProductos(fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosConstantesFunciones.getDetalleIndiceBusquedaProductos(fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosLogic.getProductoss()==null||productosLogic.getProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoss==null|| productoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productossAux=new ArrayList<Productos>();
						productossAux.addAll(productosLogic.getProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productossAux=new ArrayList<Productos>();
							productossAux.addAll(productoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosLogic.getProductossBusquedaProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosConstantesFunciones.getDetalleIndiceBusquedaProductos(fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosConstantesFunciones.getDetalleIndiceBusquedaProductos(fecha_inicioBusquedaProductos,fecha_finBusquedaProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoss("BusquedaProductos",productosLogic.getProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoss("BusquedaProductos",productoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosLogic.setProductoss(new ArrayList<Productos>());
						productosLogic.getProductoss().addAll(productossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoss=new ArrayList<Productos>();
							productoss.addAll(productossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosLogic.getProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosLogic.getProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Productos productos) {
		Boolean permite=true;
		
		if(this.productos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosConstantesFunciones.getOrderByListaProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosConstantesFunciones.getOrderByListaProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Productos productos:productosLogic.getProductoss()) {
				if(productos.getsType().equals(Constantes2.S_TOTALES)) {
					productosTotales=productos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Productos productos:this.productoss) {
				if(productos.getsType().equals(Constantes2.S_TOTALES)) {
					productosTotales=productos;
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
			this.productosAux=new Productos();
			this.productosAux.setsType(Constantes2.S_TOTALES);
			this.productosAux.setIsNew(false);
			this.productosAux.setIsChanged(false);
			this.productosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosConstantesFunciones.TotalizarValoresFilaProductos(this.productosLogic.getProductoss(),this.productosAux);
				
				//this.productosLogic.getProductoss().add(this.productosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosConstantesFunciones.TotalizarValoresFilaProductos(this.productoss,this.productosAux);
				
				this.productoss.add(this.productosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosTotales=new Productos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosLogic.getProductoss().remove(productosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoss.remove(productosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosTotales=new Productos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Productos productos:productosLogic.getProductoss()) {
				if(productos.getsType().equals(Constantes2.S_TOTALES)) {
					productosTotales=productos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosConstantesFunciones.TotalizarValoresFilaProductos(this.productosLogic.getProductoss(),productosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Productos productos:this.productoss) {
				if(productos.getsType().equals(Constantes2.S_TOTALES)) {
					productosTotales=productos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosConstantesFunciones.TotalizarValoresFilaProductos(this.productoss,productosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductossBusquedaProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductossBusquedaProductos(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosLogic.getProductossBusquedaProductos(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosLogic.getProductossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosLogic.getProductossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosLogic.getProductossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductos() {
		this.isPermisoTodoProductos=false;
		this.isPermisoNuevoProductos=false;
		this.isPermisoActualizarProductos=false;
		this.isPermisoActualizarOriginalProductos=false;
		this.isPermisoEliminarProductos=false;
		this.isPermisoGuardarCambiosProductos=false;
		this.isPermisoConsultaProductos=true;
		this.isPermisoBusquedaProductos=true;
		this.isPermisoReporteProductos=true;
		this.isPermisoOrdenProductos=false;		
		this.isPermisoPaginacionMedioProductos=false;		
		this.isPermisoPaginacionAltoProductos=false;		
		this.isPermisoPaginacionTodoProductos=false;		
		this.isPermisoCopiarProductos=false;		
		this.isPermisoVerFormProductos=false;		
		this.isPermisoDuplicarProductos=false;
		this.isPermisoOrdenProductos=false;
	}
	
	public void setPermisosUsuarioProductos(Boolean isPermiso) {
		this.isPermisoTodoProductos=isPermiso;
		this.isPermisoNuevoProductos=isPermiso;
		this.isPermisoActualizarProductos=isPermiso;
		this.isPermisoActualizarOriginalProductos=isPermiso;
		this.isPermisoEliminarProductos=isPermiso;
		this.isPermisoGuardarCambiosProductos=isPermiso;
		this.isPermisoConsultaProductos=isPermiso;
		this.isPermisoBusquedaProductos=isPermiso;
		this.isPermisoReporteProductos=isPermiso;
		this.isPermisoOrdenProductos=isPermiso;		
		this.isPermisoPaginacionMedioProductos=isPermiso;		
		this.isPermisoPaginacionAltoProductos=isPermiso;		
		this.isPermisoPaginacionTodoProductos=isPermiso;		
		this.isPermisoCopiarProductos=isPermiso;		
		this.isPermisoVerFormProductos=isPermiso;		
		this.isPermisoDuplicarProductos=isPermiso;
		this.isPermisoOrdenProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductos(Boolean isPermiso) {
		//this.isPermisoTodoProductos=isPermiso;
		this.isPermisoNuevoProductos=isPermiso;
		this.isPermisoActualizarProductos=isPermiso;
		this.isPermisoActualizarOriginalProductos=isPermiso;
		this.isPermisoEliminarProductos=isPermiso;
		this.isPermisoGuardarCambiosProductos=isPermiso;
		//this.isPermisoConsultaProductos=isPermiso;
		//this.isPermisoBusquedaProductos=isPermiso;
		//this.isPermisoReporteProductos=isPermiso;
		//this.isPermisoOrdenProductos=isPermiso;		
		//this.isPermisoPaginacionMedioProductos=isPermiso;		
		//this.isPermisoPaginacionAltoProductos=isPermiso;		
		//this.isPermisoPaginacionTodoProductos=isPermiso;		
		//this.isPermisoCopiarProductos=isPermiso;		
		//this.isPermisoDuplicarProductos=isPermiso;
		//this.isPermisoOrdenProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductos=this.isPermisoActualizarProductos;
			this.isPermisoEliminarProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductos.setToolTipText(this.jTableDatosProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductos() throws Exception {
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
	public void inicializarCombosForeignKeyProductosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProductos()throws Exception {
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
			if(this.productosSessionBean==null) {
				this.productosSessionBean=new ProductosSessionBean();
			}

			if(!this.productosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductos(Productos productos)throws Exception {	
		try {
			
			this.setActualProductoForeignKey(productos.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductos(Productos productos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductos()throws Exception {	
		try {
			
			this.setActualProductoForeignKey(this.productosConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos!=null && this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos!=null && this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos!=null && this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosSessionBean=new ProductosSessionBean(); 
		this.productosConstantesFunciones=new ProductosConstantesFunciones(); 
		this.productosBean=new Productos();//(this.productosConstantesFunciones); 		
		this.productosReturnGeneral=new ProductosParameterReturnGeneral(); 
		
		this.productosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductos(true);
			
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
			
			this.productosConstantesFunciones=new ProductosConstantesFunciones(); 
			this.productosBean=new Productos();//this.productosConstantesFunciones); 			
			this.productosReturnGeneral=new ProductosParameterReturnGeneral(); 
		
			ProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productos=new Productos();
			this.productoss = new ArrayList<Productos>();
			this.productossAux = new ArrayList<Productos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic=new ProductosLogic();
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			//this.productosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductos);	
					}
					
					if(this.jInternalFrameImportacionProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductos);
				this.jInternalFrameDetalleFormProductos.setVisible(false);
				this.jInternalFrameDetalleFormProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductos);
					this.jInternalFrameReporteDinamicoProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductos);
					this.jInternalFrameImportacionProductos.setVisible(false);
					this.jInternalFrameImportacionProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductos);
					this.jInternalFrameOrderByProductos.setVisible(false);
					this.jInternalFrameOrderByProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosReturnGeneral=new ProductosParameterReturnGeneral();
			
			this.productosParameterGeneral=new ProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosSessionBean.getEsGuardarRelacionado(),this.productosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosSessionBean.getEsGuardarRelacionado(),this.productosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaDuplicarProductos=true;
			this.isVisibilidadCeldaCopiarProductos=true;
			this.isVisibilidadCeldaVerFormProductos=true;
			this.isVisibilidadCeldaOrdenProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
			this.isVisibilidadCeldaModificarProductos=false;
			this.isVisibilidadCeldaActualizarProductos=false;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=false;
			this.isVisibilidadCeldaGuardarProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
			
			
			this.isVisibilidadBusquedaProductos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductos(false);
			
			this.setPermisosUsuarioProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosSessionBean.getEsGuardarRelacionado() 
				|| (this.productosSessionBean.getEsGuardarRelacionado() && this.productosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosClasesRelacionadas();
			}
			
			if(this.productosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductos();
			}
			
			if(!this.isPermisoBusquedaProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosConstantesFunciones.getTiposSeleccionarProductos());
				
				this.tiposColumnasSelect=ProductosConstantesFunciones.getTiposSeleccionarProductos(true);
				
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
			//if(!this.productosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductos() ;
			
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
				productosImplementable= (ProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosImplementableHome= (ProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoss= new ArrayList<Productos>();
			this.productossEliminados= new ArrayList<Productos>();
						
			this.isEsNuevoProductos=false;
			this.esParaAccionDesdeFormularioProductos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductos();
			}
			
			ProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Productos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductos")) {
				iIndex=this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductos();	
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
	
	public void cargarCombosForeignKeyProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductos();
		
		this.cargarCombosFrameForeignKeyProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductos();
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
	
	public void jButtonNuevoProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			
			if(jTableDatosProductos.getRowCount()>=1) {
				jTableDatosProductos.removeRowSelectionInterval(0, jTableDatosProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductos(true);			
			//this.productos=new Productos();
			//this.productos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductos() ;
			
			if(ProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productos);	
			this.actualizarInformacion("INFO_PADRE",false,this.productos);				
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			if(this.productosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Productos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductos.getSelectedRows().length;			
			}
			
			productossSeleccionados=this.getProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductos--;			
				//Productos productosAux= new Productos();			
				//productosAux.setId(this.iIdNuevoProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Productos productosOrigen=new Productos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Productos productosOrigen : productossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosOrigen =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosOrigen =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductos(productosOrigen,this.productos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosLogic.getProductoss().add(this.productosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoss.add(this.productosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductos(false);
				
				this.jTableDatosProductos.setRowSelectionInterval(this.getIndiceNuevoProductos(), this.getIndiceNuevoProductos());
				
				int iLastRow =  this.jTableDatosProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();									
		
			Productos productosOrigen=new Productos();
			Productos productosDestino=new Productos();
				
			productossSeleccionados=this.getProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosOrigen =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosOrigen =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosDestino =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosDestino =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosOrigen =productossSeleccionados.get(0);
				productosDestino =productossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductos(productosOrigen,productosDestino,true,false);
				
				productosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosDestino,productosLogic.getProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosDestino,productoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductos(false);
				
				//this.jTableDatosProductos.setRowSelectionInterval(this.getIndiceNuevoProductos(), this.getIndiceNuevoProductos());
				
				int iLastRow =  this.jTableDatosProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductos.setVisible(!isVisible);
			this.jPanelPaginacionProductos.setVisible(!isVisible);
			this.jPanelAccionesProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductos();
			
			this.abrirFrameOrderByProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductos.isMaximum()) {
					this.jInternalFrameDetalleFormProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductos.setSize(this.jInternalFrameDetalleFormProductos.iWidthFormulario,this.jInternalFrameDetalleFormProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductos.isMaximum()) {
						this.jInternalFrameDetalleFormProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductos.jContentPaneDetalleProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductos.jContentPaneDetalleProductos.getWidth(),ProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductos.jContentPaneDetalleProductos.getWidth(),ProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductos.jContentPaneDetalleProductos.getWidth(),ProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductos.setVisible(true);
	        this.jInternalFrameDetalleFormProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductos,false,this);
				} else {
					this.jInternalFrameOrderByProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductos);
				this.jInternalFrameOrderByProductos.setVisible(false);
				this.jInternalFrameOrderByProductos.setSelected(false);
				
				this.jInternalFrameOrderByProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductos"));
				
				this.inicializarActualizarBindingTablaOrderByProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductos==null) {
				
				this.jInternalFrameImportacionProductos=new ImportacionJInternalFrame(ProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductos);
				this.jInternalFrameImportacionProductos.setVisible(false);
				this.jInternalFrameImportacionProductos.setSelected(false);


				this.jInternalFrameImportacionProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductos"));
				this.jInternalFrameImportacionProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductos"));
				this.jInternalFrameImportacionProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductos==null) {
				this.jInternalFrameReporteDinamicoProductos=new ReporteDinamicoJInternalFrame(ProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductos);
				this.jInternalFrameReporteDinamicoProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductos"));
				this.jInternalFrameReporteDinamicoProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductos"));
				this.jInternalFrameReporteDinamicoProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductos);
			
	       	this.jInternalFrameDetalleFormProductos.setVisible(false);
	        this.jInternalFrameDetalleFormProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductos.dispose();
			//this.jInternalFrameDetalleFormProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductos.setVisible(true);
	        this.jInternalFrameImportacionProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductos.setVisible(true);
	        this.jInternalFrameOrderByProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductos.setVisible(false);
	        this.jInternalFrameOrderByProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductos.setVisible(false);
	        this.jInternalFrameImportacionProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductos(true);
			//this.isEsNuevoProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductos(false) ;
			
			if(productosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductos(true);
			//this.isEsNuevoProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductos(false) ;
			
			if(ProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductos,ProductosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductos(false);
			
			//if(!this.isEsNuevoProductos) {								
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				
			}
			
			if(this.permiteMantenimiento(this.productos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductos=true;
					this.inicializarActualizarBindingTablaProductos(false);
					this.isEsNuevoProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductos(false);
				
				this.habilitarDeshabilitarControlesProductos(false);
			
												
				
				if(ProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosActionPerformed(evt,productosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductos(this.productos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				this.productos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				this.productos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosModel) this.jTableDatosProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductos=true;
				this.inicializarActualizarBindingTablaProductos(false);
				this.isEsNuevoProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductos(false);
				
				this.habilitarDeshabilitarControlesProductos(false);
				
				
				
				if(ProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductos.getRowCount()>=1) {
				jTableDatosProductos.removeRowSelectionInterval(0, jTableDatosProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductos(false) ;
			
			this.isEsNuevoProductos=false;
			
			if(ProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductos(false);
				
				//SI ES MANUAL
				if(ProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductos--;			
			//Productos productosAux= new Productos();			
			//productosAux.setId(this.iIdNuevoProductos);
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
			
			this.productos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosLogic.getProductoss().add(this.productosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoss.add(this.productosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductos(false);
			
			this.jTableDatosProductos.setRowSelectionInterval(this.getIndiceNuevoProductos(), this.getIndiceNuevoProductos());
			
			int iLastRow =  this.jTableDatosProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductos(false);
			
			//SI ES MANUAL
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductos();
			}
			
			//this.abrirFrameTreeProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductos.setFileImportacion(this.jInternalFrameImportacionProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		

		productossSeleccionados=this.getProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoss("Todos",productossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosConstantesFunciones.LABEL_CANTIDAD:
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
		
		if(this.jInternalFrameReporteDinamicoProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProductosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ProductosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProductosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ProductosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProductosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ProductosConstantesFunciones.LABEL_CANTIDAD:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Productoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(Productos productos:productossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productos.getcantidad());
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
			//	this.getFilaCabeceraExportarExcelProductos(row);				
			//	iRow++;
			//}				
			
			//for(Productos productosAux:productossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductos(productosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductos(false);
			
			//SI ES MANUAL
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductos(false);
			
			//SI ES MANUAL
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductos(false);
			
			//SI ES MANUAL
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductos();
		
		this.inicializarActualizarBindingBotonesManualProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductos.jCheckBoxPostAccionNuevoProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductos.jCheckBoxPostAccionSinCerrarProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductos.jCheckBoxPostAccionSinMensajeProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductos!=null) {
				this.jInternalFrameDetalleFormProductos.jCheckBoxPostAccionNuevoProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductos.jCheckBoxPostAccionSinCerrarProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductos.jCheckBoxPostAccionSinMensajeProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductos() throws Exception {
		try	{
			if(ProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductos.addItem(reporte);
			}
			
			
			if(!this.productosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductos!=null) {
				this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductos!=null) {
				this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaProductos=new Date(this.jDateChooserfecha_inicioBusquedaProductosProductos.getDate().getTime());
		this.fecha_finBusquedaProductos=new Date(this.jDateChooserfecha_finBusquedaProductosProductos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductos(Boolean esInicializar) throws Exception {				
		if(ProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductos() throws Exception {
		this.inicializarActualizarBindingTablaProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosLogic.getProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductos.setModel(new ProductosModel(this.productosLogic.getProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductos.setModel(new ProductosModel(this.productoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductos!=null && this.jInternalFrameOrderByProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosConstantesFunciones.SCLASSWEBTITULO,productosConstantesFunciones.resaltarSeleccionarProductos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosConstantesFunciones.SCLASSWEBTITULO,productosConstantesFunciones.resaltarSeleccionarProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductos,ProductosConstantesFunciones.LABEL_ID));

		if(this.productosConstantesFunciones.mostraridProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosConstantesFunciones.resaltaridProductos,this.productosConstantesFunciones.activaridProductos,this,true,"idProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosConstantesFunciones.resaltaridProductos,this.productosConstantesFunciones.activaridProductos,this,true,"idProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductos,ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.productosConstantesFunciones.mostrarnombre_productoProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosConstantesFunciones.resaltarnombre_productoProductos,this.productosConstantesFunciones.activarnombre_productoProductos,this,true,"nombre_productoProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosConstantesFunciones.resaltarnombre_productoProductos,this.productosConstantesFunciones.activarnombre_productoProductos,this,true,"nombre_productoProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductos,ProductosConstantesFunciones.LABEL_FECHA));

		if(this.productosConstantesFunciones.mostrarfechaProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.productosConstantesFunciones.resaltarfechaProductos,this.productosConstantesFunciones.activarfechaProductos,this,true,"fechaProductos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.productosConstantesFunciones.resaltarfechaProductos,this.productosConstantesFunciones.activarfechaProductos,this,true,"fechaProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductos,ProductosConstantesFunciones.LABEL_CANTIDAD));

		if(this.productosConstantesFunciones.mostrarcantidadProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosConstantesFunciones.resaltarcantidadProductos,this.productosConstantesFunciones.activarcantidadProductos,this,true,"cantidadProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosConstantesFunciones.resaltarcantidadProductos,this.productosConstantesFunciones.activarcantidadProductos,this,true,"cantidadProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductos && this.isPermisoGuardarCambiosProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductos.addColumn(tableColumn);
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
			
			this.jTableDatosProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductos && this.isPermisoGuardarCambiosProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductos && this.isPermisoGuardarCambiosProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductos.moveColumn(this.jTableDatosProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductos.moveColumn(this.jTableDatosProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductos.moveColumn(this.jTableDatosProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosLogic.getProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoss.size()-1;
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
		//this.jTableDatosProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductos();
			
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
				
				//this.isEsNuevoProductos=false;
					
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
				if(this.productosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productos.getsType().equals("DUPLICADO")
				   || this.productos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductos=true;
				
				} else {
					this.isEsNuevoProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosSessionBean.getEsGuardarRelacionado()) {
					if(this.productos.getId()>=0 && !this.productos.getIsNew()) {						
						this.isEsNuevoProductos=false;
						
					} else {
						this.isEsNuevoProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductos(esRelaciones);						
				
				this.seleccionarProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productos.getId()<0) {
					this.isEsNuevoProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductos(evt,rowIndex);
				}	
				
				if(this.productosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Productos: " + this.dDif); 
					}
				}								
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productos)) {
					if(this.productos.getId()>0) {
						this.productos.setIsDeleted(true);
						
						this.productossEliminados.add(this.productos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosLogic.getProductoss().remove(this.productos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoss.remove(this.productos);				
					}
					
					
					((ProductosModel) this.jTableDatosProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductos) {
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductos(this.productos);
				}
				
				//ARCHITECTURE
				try {
					

					//Producto
					if(!this.productosConstantesFunciones.cargarid_productoProductos || this.productosConstantesFunciones.event_dependid_productoProductos) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productos.getid_producto());
									//this.inicializarActualizarBindingProductos(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productos.getProducto()!=null) {
							this.productosForeignKey.add(productos.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productos.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductos(Productos productos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductos(productos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductos(Productos productos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductos(productos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductos(productos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductos(productos);
	}
	
	public void setVariablesObjetoActualToFormularioProductos(Productos productos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductos.jLabelidProductos.setText(productos.getId().toString());
			this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setText(productos.getnombre_producto());
			this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setDate(productos.getfecha());
			this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setText(productos.getcantidad().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Productos productosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Productos productosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosLocal=this.productos;
			} else {
				productosLocal=this.productosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductos(productosLocal,true);
					
					if(productosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductos(Productos productos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductos(productos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductos(productos);
	}
	
	public void setVariablesFormularioToObjetoActualProductos(Productos productos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductos(productos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductos(Productos productos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductos.jLabelidProductos.getText()==null || this.jInternalFrameDetalleFormProductos.jLabelidProductos.getText()=="" || this.jInternalFrameDetalleFormProductos.jLabelidProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormProductos.jLabelidProductos.setText("0");
			}

			if(conColumnasBase) {productos.setId(Long.parseLong(this.jInternalFrameDetalleFormProductos.jLabelidProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelIdProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productos.setnombre_producto(this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelnombre_productoProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productos.setfecha(this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelfechaProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productos.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductos.jLabelcantidadProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductos(Productos productosBean,Productos productos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductos(Productos productosOrigen,Productos productos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosOrigen.getId()!=null && !productosOrigen.getId().equals(0L))) {productos.setId(productosOrigen.getId());}}
			if(conDefault || (!conDefault && productosOrigen.getid_producto()!=null && !productosOrigen.getid_producto().equals(-1L))) {productos.setid_producto(productosOrigen.getid_producto());}
			if(conDefault || (!conDefault && productosOrigen.getfecha_inicio()!=null && !productosOrigen.getfecha_inicio().equals(new Date()))) {productos.setfecha_inicio(productosOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && productosOrigen.getfecha_fin()!=null && !productosOrigen.getfecha_fin().equals(new Date()))) {productos.setfecha_fin(productosOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && productosOrigen.getnombre_producto()!=null && !productosOrigen.getnombre_producto().equals(""))) {productos.setnombre_producto(productosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && productosOrigen.getfecha()!=null && !productosOrigen.getfecha().equals(new Date()))) {productos.setfecha(productosOrigen.getfecha());}
			if(conDefault || (!conDefault && productosOrigen.getcantidad()!=null && !productosOrigen.getcantidad().equals(0))) {productos.setcantidad(productosOrigen.getcantidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductos(Productos productos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductos.jLabelidProductos.setText(productos.getId().toString());
			this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setText(productos.getnombre_producto());
			this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setDate(productos.getfecha());
			this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setText(productos.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductos(ProductosBean productosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductos.jLabelidProductos.setText(productosBean.getId().toString());
			this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setText(productosBean.getnombre_producto());
			this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setDate(productosBean.getfecha());
			this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setText(productosBean.getcantidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductos(ProductosParameterReturnGeneral productosReturnGeneral,ProductosBean productosBean,Boolean conDefault) throws Exception { 
		try {
			Productos productosLocal=new Productos();
			
			productosLocal=productosReturnGeneral.getProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosLocal.getId()!=null && !productosLocal.getId().equals(0L))) {productosBean.setId(productosLocal.getId());}}
			if(conDefault || (!conDefault && productosLocal.getnombre_producto()!=null && !productosLocal.getnombre_producto().equals(""))) {productosBean.setnombre_producto(productosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && productosLocal.getfecha()!=null && !productosLocal.getfecha().equals(new Date()))) {productosBean.setfecha(productosLocal.getfecha());}
			if(conDefault || (!conDefault && productosLocal.getcantidad()!=null && !productosLocal.getcantidad().equals(0))) {productosBean.setcantidad(productosLocal.getcantidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosGenerico(Long idProductosSeleccionado,JComboBox jComboBoxProductos,List<Productos> productossLocal)throws Exception {
		try {
			Productos  productosTemp=null;

			for(Productos productosAux:productossLocal) {
				if(productosAux.getId()!=null && productosAux.getId().equals(idProductosSeleccionado)) {
					productosTemp=productosAux;
					break;
				}
			}

			jComboBoxProductos.setSelectedItem(productosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosGenerico(JComboBox jComboBoxProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productos=(Productos) productosLogic.getProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productos =(Productos) productoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productos.getIsNew() && !productos.getIsChanged() && !productos.getIsDeleted()) {
				sDescripcion=productos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productos.getIsNew() && !productos.getIsChanged() && !productos.getIsDeleted()) {
				sDescripcion=productos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productos.getIsNew() && !productos.getIsChanged() && !productos.getIsDeleted()) {
				sDescripcion=productos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productos.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Productos productosRow=new Productos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosRow=(Productos) productosLogic.getProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosRow=(Productos) productoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductos.setVisible((this.isVisibilidadCeldaNuevoProductos && this.isPermisoNuevoProductos));			
			this.jButtonDuplicarProductos.setVisible((this.isVisibilidadCeldaDuplicarProductos && this.isPermisoDuplicarProductos));			
			this.jButtonCopiarProductos.setVisible((this.isVisibilidadCeldaCopiarProductos && this.isPermisoCopiarProductos));
			this.jButtonVerFormProductos.setVisible((this.isVisibilidadCeldaVerFormProductos && this.isPermisoVerFormProductos));
			
			this.jButtonAbrirOrderByProductos.setVisible((this.isVisibilidadCeldaOrdenProductos && this.isPermisoOrdenProductos));			
			
			this.jButtonNuevoRelacionesProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductos && this.isPermisoNuevoProductos));			
			this.jButtonNuevoGuardarCambiosProductos.setVisible((this.isVisibilidadCeldaNuevoProductos && this.isPermisoNuevoProductos && this.isPermisoGuardarCambiosProductos));
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.jInternalFrameDetalleFormProductos.jButtonModificarProductos.setVisible((this.isVisibilidadCeldaModificarProductos && this.isPermisoActualizarProductos));	
			this.jInternalFrameDetalleFormProductos.jButtonActualizarProductos.setVisible((this.isVisibilidadCeldaActualizarProductos && this.isPermisoActualizarProductos));	
			this.jInternalFrameDetalleFormProductos.jButtonEliminarProductos.setVisible((this.isVisibilidadCeldaEliminarProductos && this.isPermisoEliminarProductos));
			this.jInternalFrameDetalleFormProductos.jButtonCancelarProductos.setVisible(this.isVisibilidadCeldaCancelarProductos);							
			this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.setVisible((this.isVisibilidadCeldaGuardarProductos && this.isPermisoGuardarCambiosProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductos && this.isPermisoGuardarCambiosProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductos.setVisible((this.isVisibilidadCeldaNuevoProductos && this.isPermisoNuevoProductos));						
			this.jButtonDuplicarToolBarProductos.setVisible((this.isVisibilidadCeldaDuplicarProductos && this.isPermisoDuplicarProductos));						
			this.jButtonCopiarToolBarProductos.setVisible((this.isVisibilidadCeldaCopiarProductos && this.isPermisoCopiarProductos));			
			this.jButtonVerFormToolBarProductos.setVisible((this.isVisibilidadCeldaVerFormProductos && this.isPermisoVerFormProductos));			
			this.jButtonAbrirOrderByToolBarProductos.setVisible((this.isVisibilidadCeldaOrdenProductos && this.isPermisoOrdenProductos));
			this.jButtonNuevoRelacionesToolBarProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductos && this.isPermisoNuevoProductos));			
			this.jButtonNuevoGuardarCambiosToolBarProductos.setVisible((this.isVisibilidadCeldaNuevoProductos && this.isPermisoNuevoProductos && this.isPermisoGuardarCambiosProductos));			
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.jInternalFrameDetalleFormProductos.jButtonModificarToolBarProductos.setVisible((this.isVisibilidadCeldaModificarProductos && this.isPermisoActualizarProductos));	
			this.jInternalFrameDetalleFormProductos.jButtonActualizarToolBarProductos.setVisible((this.isVisibilidadCeldaActualizarProductos  && this.isPermisoActualizarProductos));	
			this.jInternalFrameDetalleFormProductos.jButtonEliminarToolBarProductos.setVisible((this.isVisibilidadCeldaEliminarProductos && this.isPermisoEliminarProductos));
			this.jInternalFrameDetalleFormProductos.jButtonCancelarToolBarProductos.setVisible(this.isVisibilidadCeldaCancelarProductos);				
			this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosToolBarProductos.setVisible((this.isVisibilidadCeldaGuardarProductos && this.isPermisoGuardarCambiosProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductos && this.isPermisoGuardarCambiosProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductos.setVisible((this.isVisibilidadCeldaNuevoProductos && this.isPermisoNuevoProductos));			
			this.jMenuItemDuplicarProductos.setVisible((this.isVisibilidadCeldaDuplicarProductos && this.isPermisoDuplicarProductos));			
			this.jMenuItemCopiarProductos.setVisible((this.isVisibilidadCeldaCopiarProductos && this.isPermisoCopiarProductos));			
			this.jMenuItemVerFormProductos.setVisible((this.isVisibilidadCeldaVerFormProductos && this.isPermisoVerFormProductos));			
			this.jMenuItemAbrirOrderByProductos.setVisible((this.isVisibilidadCeldaOrdenProductos && this.isPermisoOrdenProductos));			
			//this.jMenuItemMostrarOcultarProductos.setVisible((this.isVisibilidadCeldaOrdenProductos && this.isPermisoOrdenProductos));
			this.jMenuItemDetalleAbrirOrderByProductos.setVisible((this.isVisibilidadCeldaOrdenProductos && this.isPermisoOrdenProductos));			
			//this.jMenuItemDetalleMostrarOcultarProductos.setVisible((this.isVisibilidadCeldaOrdenProductos && this.isPermisoOrdenProductos));			
			this.jMenuItemNuevoRelacionesProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductos && this.isPermisoNuevoProductos));			
			this.jMenuItemNuevoGuardarCambiosProductos.setVisible((this.isVisibilidadCeldaNuevoProductos && this.isPermisoNuevoProductos && this.isPermisoGuardarCambiosProductos));									
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.jInternalFrameDetalleFormProductos.jMenuItemModificarProductos.setVisible((this.isVisibilidadCeldaModificarProductos && this.isPermisoActualizarProductos));	
			this.jInternalFrameDetalleFormProductos.jMenuItemActualizarProductos.setVisible((this.isVisibilidadCeldaActualizarProductos && this.isPermisoActualizarProductos));	
			this.jInternalFrameDetalleFormProductos.jMenuItemEliminarProductos.setVisible((this.isVisibilidadCeldaEliminarProductos && this.isPermisoEliminarProductos));
			this.jInternalFrameDetalleFormProductos.jMenuItemCancelarProductos.setVisible(this.isVisibilidadCeldaCancelarProductos);				
			}
			
			this.jMenuItemGuardarCambiosProductos.setVisible((this.isVisibilidadCeldaGuardarProductos && this.isPermisoGuardarCambiosProductos));						
			this.jMenuItemGuardarCambiosTablaProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductos && this.isPermisoGuardarCambiosProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductos=this.jButtonNuevoProductos.isVisible();
			this.isVisibilidadCeldaDuplicarProductos=this.jButtonDuplicarProductos.isVisible();
			this.isVisibilidadCeldaCopiarProductos=this.jButtonCopiarProductos.isVisible();
			this.isVisibilidadCeldaVerFormProductos=this.jButtonVerFormProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenProductos=this.jButtonAbrirOrderByProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductos=this.jButtonNuevoRelacionesProductos.isVisible();
			this.isVisibilidadCeldaModificarProductos=this.jButtonModificarProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.isVisibilidadCeldaActualizarProductos=this.jInternalFrameDetalleFormProductos.jButtonActualizarProductos.isVisible();
			this.isVisibilidadCeldaEliminarProductos=this.jInternalFrameDetalleFormProductos.jButtonEliminarProductos.isVisible();
			this.isVisibilidadCeldaCancelarProductos=this.jInternalFrameDetalleFormProductos.jButtonCancelarProductos.isVisible();
			this.isVisibilidadCeldaGuardarProductos=this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductos=this.jButtonGuardarCambiosTablaProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductos=this.jButtonNuevoToolBarProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductos=this.jButtonNuevoRelacionesToolBarProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.isVisibilidadCeldaModificarProductos=this.jInternalFrameDetalleFormProductos.jButtonModificarToolBarProductos.isVisible();
			this.isVisibilidadCeldaActualizarProductos=this.jInternalFrameDetalleFormProductos.jButtonActualizarToolBarProductos.isVisible();
			this.isVisibilidadCeldaEliminarProductos=this.jInternalFrameDetalleFormProductos.jButtonEliminarToolBarProductos.isVisible();
			this.isVisibilidadCeldaCancelarProductos=this.jInternalFrameDetalleFormProductos.jButtonCancelarToolBarProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductos=this.jButtonGuardarCambiosToolBarProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductos=this.jButtonGuardarCambiosTablaToolBarProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductos=this.jMenuItemNuevoProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductos=this.jMenuItemNuevoRelacionesProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductos!=null) {
			this.isVisibilidadCeldaModificarProductos=this.jInternalFrameDetalleFormProductos.jMenuItemModificarProductos.isVisible();
			this.isVisibilidadCeldaActualizarProductos=this.jInternalFrameDetalleFormProductos.jMenuItemActualizarProductos.isVisible();
			this.isVisibilidadCeldaEliminarProductos=this.jInternalFrameDetalleFormProductos.jMenuItemEliminarProductos.isVisible();
			this.isVisibilidadCeldaCancelarProductos=this.jInternalFrameDetalleFormProductos.jMenuItemCancelarProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductos=this.jMenuItemGuardarCambiosProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductos=this.jMenuItemGuardarCambiosTablaProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductos(Boolean esInicializar) {
		if(ProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosSessionBean.getConGuardarRelaciones()) {
				//if(this.productosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductos() {
		this.jButtonNuevoProductos.setVisible(this.isPermisoNuevoProductos);			
		this.jButtonDuplicarProductos.setVisible(this.isPermisoDuplicarProductos);			
		this.jButtonCopiarProductos.setVisible(this.isPermisoCopiarProductos);			
		this.jButtonVerFormProductos.setVisible(this.isPermisoVerFormProductos);			
		
		this.jButtonAbrirOrderByProductos.setVisible(this.isPermisoOrdenProductos);					
		
		this.jButtonNuevoRelacionesProductos.setVisible(this.isPermisoNuevoProductos);			
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonModificarProductos.setVisible(this.isPermisoActualizarProductos);	
			this.jInternalFrameDetalleFormProductos.jButtonActualizarProductos.setVisible(this.isPermisoActualizarProductos);	
			this.jInternalFrameDetalleFormProductos.jButtonEliminarProductos.setVisible(this.isPermisoEliminarProductos);
			this.jInternalFrameDetalleFormProductos.jButtonCancelarProductos.setVisible(this.isVisibilidadCeldaCancelarProductos);						
			this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.setVisible(this.isPermisoGuardarCambiosProductos);							
		}
		
		this.jButtonGuardarCambiosTablaProductos.setVisible(this.isPermisoActualizarProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductos() {
		this.jInternalFrameDetalleFormProductos.jButtonModificarProductos.setVisible(this.isPermisoActualizarProductos);	
		this.jInternalFrameDetalleFormProductos.jButtonActualizarProductos.setVisible(this.isPermisoActualizarProductos);	
		this.jInternalFrameDetalleFormProductos.jButtonEliminarProductos.setVisible(this.isPermisoEliminarProductos);
		this.jInternalFrameDetalleFormProductos.jButtonCancelarProductos.setVisible(this.isVisibilidadCeldaCancelarProductos);							
		this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.setVisible((this.isVisibilidadCeldaGuardarProductos && this.isPermisoGuardarCambiosProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductos() {
		if(ProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductos() {
	}
	
	public void jTableDatosProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosLogic.getConnexion());

				if(this.productos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductos=(TitledBorder)this.jScrollPanelDatosProductos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosLogic.getConnexion());

				if(this.productos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductos=(TitledBorder)this.jScrollPanelDatosProductos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productosLogic.getConnexion());

				if(this.productos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductos=(TitledBorder)this.jScrollPanelDatosProductos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.productos.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.productos.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.productos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.productos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductos(this.getproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productos==null) {
						this.productos = new Productos();
					}

					this.setVariablesFormularioToObjetoActualProductos(this.productos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);
				}

				if(this.productos.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productos.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductos(false,false);

			this.getProductossBusquedaProductos();

			this.inicializarActualizarBindingProductos(false);

			//if(ProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductos(false,false);

			this.getProductossFK_IdEmpresa();

			this.inicializarActualizarBindingProductos(false);

			//if(ProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductos(false,false);

			this.getProductossFK_IdProducto();

			this.inicializarActualizarBindingProductos(false);

			//if(ProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductos(false,false);

			this.getProductossFK_IdSucursal();

			this.inicializarActualizarBindingProductos(false);

			//if(ProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductos() {
		if(this.jInternalFrameDetalleFormProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
			this.jInternalFrameDetalleFormProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductos.dispose();
			this.jInternalFrameDetalleFormProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductos!=null) {
			this.jInternalFrameReporteDinamicoProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductos.dispose();
			this.jInternalFrameReporteDinamicoProductos=null;
		}
		
		if(this.jInternalFrameImportacionProductos!=null) {
			this.jInternalFrameImportacionProductos.setVisible(false);	    			
			this.jInternalFrameImportacionProductos.dispose();
			this.jInternalFrameImportacionProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductos();
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductos")) {
				jButtonNuevoProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductos")) {
				jButtonDuplicarProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductos")) {
				jButtonCopiarProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductos")) {
				jButtonVerFormProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductos")) {
				jButtonNuevoProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductos")) {
				jButtonDuplicarProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductos")) {
				jButtonNuevoProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductos")) {
				jButtonDuplicarProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductos")) {
				jButtonNuevoProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductos")) {
				jButtonNuevoProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductos")) {
				jButtonNuevoProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductos")) {
				jButtonModificarProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductos")) {
				jButtonModificarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductos")) {
				jButtonModificarProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductos")) {
				jButtonActualizarProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductos")) {
				jButtonActualizarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductos")) {
				jButtonActualizarProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductos")) {
				jButtonEliminarProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductos")) {
				jButtonEliminarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductos")) {
				jButtonEliminarProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductos")) {
				jButtonCancelarProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductos")) {
				jButtonCancelarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductos")) {
				jButtonCancelarProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductos")) {
				jButtonCerrarProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductos")) {
				jButtonCerrarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductos")) {
				jButtonCerrarProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductos")) {
				jButtonMostrarOcultarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductos")) {
				jButtonCancelarProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductos")) {
				jButtonCopiarProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductos")) {
				jButtonVerFormProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductos")) {
				jButtonCopiarProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductos")) {
				jButtonVerFormProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductos")) {
				jButtonRecargarInformacionProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductos")) {
				jButtonRecargarInformacionProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductos")) {
				jButtonRecargarInformacionProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductos")) {
				jButtonAnterioresProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductos")) {
				jButtonAnterioresProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductos")) {
				jButtonAnterioresProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductos")) {
				jButtonSiguientesProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductos")) {
				jButtonSiguientesProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductos")) {
				jButtonSiguientesProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByProductos")) {
				jButtonAbrirOrderByProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarProductos")) {
				jButtonMostrarOcultarProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductos")) {
				jButtonNuevoGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductos")) {
				jButtonNuevoGuardarCambiosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductos")) {
				jButtonNuevoGuardarCambiosProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductos")) {
				jButtonCerrarReporteDinamicoProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductos")) {
				jButtonGenerarReporteDinamicoProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductos")) {
				
				jButtonGenerarExcelReporteDinamicoProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductos")) {
				jButtonCerrarImportacionProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductos")) {
				
				jButtonGenerarImportacionProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductos")) {
				
				jButtonAbrirImportacionProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductos")) {
				jComboBoxTiposAccionesProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductos")) {
				jComboBoxTiposRelacionesProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductos")) {
				jComboBoxTiposAccionesProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductos")) {
				
				jComboBoxTiposSeleccionarProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductos")) {
				jTextFieldValorCampoGeneralProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductos")) {
				jButtonAbrirOrderByProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductos")) {
				jButtonAbrirOrderByProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductos")) {
				jButtonCerrarOrderByProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosBusqueda")) {
				this.jButtonidProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosUpdate")) {
				this.jButtonid_empresaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosBusqueda")) {
				this.jButtonid_empresaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosUpdate")) {
				this.jButtonid_sucursalProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosBusqueda")) {
				this.jButtonid_sucursalProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductosUpdate")) {
				this.jButtonid_productoProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductosBusqueda")) {
				this.jButtonid_productoProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioProductosBusqueda")) {
				this.jButtonfecha_inicioProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finProductosBusqueda")) {
				this.jButtonfecha_finProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosBusqueda")) {
				this.jButtonnombre_productoProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProductosBusqueda")) {
				this.jButtonfechaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosBusqueda")) {
				this.jButtoncantidadProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosProductos")) {
				this.jButtonBusquedaProductosProductosActionPerformed(evt);
			}
			
			;
			
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Productos productosLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosLocal=this.productos;
			} else {
				productosLocal=this.productosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
							
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
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
			
			


			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
								
						
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
								
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
							
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
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
			
			


			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
								
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductos")) {
					jCheckBoxSeleccionarTodosProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductos")) {
					jCheckBoxSeleccionadosProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductos")) {
					
				}
				
				


				
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
												
				
				


				
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
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
			
			


			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productos);
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
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
				
				


				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Productos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Productos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosAnterior =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosAnterior =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productos =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productos =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductos")) {
				
				}
				
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductos")) {
			
			}
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductos();
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			if(sTipo.equals("NuevoProductos")) {
				jButtonNuevoProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductos")) {
				jButtonDuplicarProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductos")) {
				jButtonCopiarProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductos")) {
				jButtonVerFormProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductos")) {
				jButtonNuevoProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductos")) {
				jButtonModificarProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductos")) {
				jButtonActualizarProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductos")) {
				jButtonEliminarProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductos")) {
				jButtonCancelarProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductos")) {
				jButtonCerrarProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductos")) {
				jButtonGuardarCambiosProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductos")) {
				jButtonNuevoGuardarCambiosProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductos")) {
				jButtonAbrirOrderByProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductos")) {
				jButtonRecargarInformacionProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductos")) {
				jButtonAnterioresProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductos")) {
				jButtonSiguientesProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosBusqueda")) {
				this.jButtonidProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosUpdate")) {
				this.jButtonid_empresaProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosBusqueda")) {
				this.jButtonid_empresaProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosUpdate")) {
				this.jButtonid_sucursalProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosBusqueda")) {
				this.jButtonid_sucursalProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductosUpdate")) {
				this.jButtonid_productoProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductosBusqueda")) {
				this.jButtonid_productoProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioProductosBusqueda")) {
				this.jButtonfecha_inicioProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finProductosBusqueda")) {
				this.jButtonfecha_finProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosBusqueda")) {
				this.jButtonnombre_productoProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaProductosBusqueda")) {
				this.jButtonfechaProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosBusqueda")) {
				this.jButtoncantidadProductosBusquedaActionPerformed(evt);
			}
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductos")) {
				closingInternalFrameProductos();
				
			} else if(sTipo.equals("jButtonCancelarProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormProductos = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosBeanSwingJInternalFrame jInternalFrameParent=(ProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosActionPerformed(null);
			}
			
			ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productos,new Object(),this.productosParameterGeneral,this.productosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productos)) {
			if(!esControlTabla) {
				if(ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductos(this.productos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);			
				}
				
				if(this.productosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductos(this.productos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductos(this.productosReturnGeneral,this.productosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductos(classes,this.productosReturnGeneral,this.productosBean,false);
					}
						
					if(this.productosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductos(this.productosReturnGeneral.getProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductos(this.productosReturnGeneral.getProductos());	
					}
						
					if(this.productosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductos(this.productosReturnGeneral.getProductos(),classes);//this.productosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductos(this.productos,classes);//this.productosBean);									
				}
			
				if(ProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductos(this.productos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductos(this.productos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosAnterior!=null) {
						this.productos=this.productosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosReturnGeneral.getProductos(),productosLogic.getProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosReturnGeneral.getProductos(),this.productoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductos() throws Exception {
		
		ProductosModel productosModel=(ProductosModel)this.jTableDatosProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosModel.productoss=this.productosLogic.getProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosModel.productoss=this.productoss;
		}
		
		
		((ProductosModel) this.jTableDatosProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosAnterior(),this.productosLogic.getProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosAnterior(),this.productoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductos(Productos productos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
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
										
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productos,new Object(),generalEntityParameterGeneral,this.productosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosConstantesFunciones.getClassesRelationshipsOfProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosConstantesFunciones.getClassesRelationshipsFromStringsOfProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productos,new Object(),generalEntityParameterGeneral,this.productosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductos(ProductosBean productosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductos(ArrayList<Classe> classes,ProductosReturnGeneral productosReturnGeneral,ProductosBean productosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductos(Productos productos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductos = new ProductosDetalleFormJInternalFrame(jDesktopPane,this.productosSessionBean.getConGuardarRelaciones(),this.productosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductos);
		this.jInternalFrameDetalleFormProductos.setVisible(false);
		this.jInternalFrameDetalleFormProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductos.productosLogic=this.productosLogic;
		
		this.cargarCombosFrameForeignKeyProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductos"));
		
		this.jInternalFrameDetalleFormProductos.jButtonModificarProductos.addActionListener(new ButtonActionListener(this,"ModificarProductos"));

		
		this.jInternalFrameDetalleFormProductos.jButtonModificarToolBarProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductos"));
					
		this.jInternalFrameDetalleFormProductos.jMenuItemModificarProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductos.jButtonActualizarProductos.addActionListener (new ButtonActionListener(this,"ActualizarProductos"));
		
		
		this.jInternalFrameDetalleFormProductos.jButtonActualizarToolBarProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductos"));
						
		this.jInternalFrameDetalleFormProductos.jMenuItemActualizarProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductos.jButtonEliminarProductos.addActionListener (new ButtonActionListener(this,"EliminarProductos"));
		
		
		this.jInternalFrameDetalleFormProductos.jButtonEliminarToolBarProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductos"));
								
		this.jInternalFrameDetalleFormProductos.jMenuItemEliminarProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductos.jButtonCancelarProductos.addActionListener (new ButtonActionListener(this,"CancelarProductos"));
		
		
		this.jInternalFrameDetalleFormProductos.jButtonCancelarToolBarProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductos"));
					
		this.jInternalFrameDetalleFormProductos.jMenuItemCancelarProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductos.jMenuItemDetalleCerrarProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosToolBarProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductos"));
		
		
		
		this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosToolBarProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductos"));
		
		
		
		this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonidProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_empresaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_empresaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_sucursalProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_sucursalProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_productoProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_productoProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfecha_inicioProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfecha_finProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonnombre_productoProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfechaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fechaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtoncantidadProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductos"));
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductos"));
		}
		
		this.jTableDatosProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductos"));
		
		this.jTableDatosProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductos"));
		
		this.jButtonNuevoProductos.addActionListener(new ButtonActionListener(this,"NuevoProductos"));
		
		this.jButtonDuplicarProductos.addActionListener(new ButtonActionListener(this,"DuplicarProductos"));
		
		this.jButtonCopiarProductos.addActionListener(new ButtonActionListener(this,"CopiarProductos"));
		
		this.jButtonVerFormProductos.addActionListener(new ButtonActionListener(this,"VerFormProductos"));
		
		
		this.jButtonNuevoToolBarProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductos"));
			
		this.jButtonDuplicarToolBarProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductos"));
			
		this.jMenuItemNuevoProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductos"));
			
		this.jMenuItemDuplicarProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductos"));		
		
		
		this.jButtonNuevoRelacionesProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductos"));
			
		this.jMenuItemNuevoRelacionesProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonModificarProductos.addActionListener(new ButtonActionListener(this,"ModificarProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonModificarToolBarProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductos"));
			
			this.jInternalFrameDetalleFormProductos.jMenuItemModificarProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductos.jButtonActualizarProductos.addActionListener (new ButtonActionListener(this,"ActualizarProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonActualizarToolBarProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductos"));
				
			this.jInternalFrameDetalleFormProductos.jMenuItemActualizarProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonEliminarProductos.addActionListener (new ButtonActionListener(this,"EliminarProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonEliminarToolBarProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductos"));
						
			this.jInternalFrameDetalleFormProductos.jMenuItemEliminarProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonCancelarProductos.addActionListener (new ButtonActionListener(this,"CancelarProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonCancelarToolBarProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductos"));
			
			this.jInternalFrameDetalleFormProductos.jMenuItemCancelarProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductos"));		
		
		
		this.jButtonCerrarProductos.addActionListener (new ButtonActionListener(this,"CerrarProductos"));
		
		
		this.jButtonCerrarToolBarProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductos"));
			
		this.jMenuItemCerrarProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductos"));
			
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jMenuItemDetalleCerrarProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosToolBarProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductos"));
		}
		
		this.jButtonCopiarToolBarProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductos"));
			
		this.jButtonVerFormToolBarProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductos"));
		
		this.jMenuItemGuardarCambiosProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductos"));
			
		this.jMenuItemCopiarProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductos"));		
		
		this.jMenuItemVerFormProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductos"));		
		
		
		this.jButtonGuardarCambiosTablaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductos"));
			
		this.jMenuItemGuardarCambiosTablaProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductos"));		
		
		
		
		this.jButtonRecargarInformacionProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductos"));
					
		this.jButtonRecargarInformacionToolBarProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductos"));
		
		this.jMenuItemRecargarInformacionProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductos"));		
		
		
		
		this.jButtonAnterioresProductos.addActionListener (new ButtonActionListener(this,"AnterioresProductos"));
		
		
		this.jButtonAnterioresToolBarProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductos"));
		
		this.jMenuItemAnterioresProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductos"));		
		
		
		this.jButtonSiguientesProductos.addActionListener (new ButtonActionListener(this,"SiguientesProductos"));
		
		
		this.jButtonSiguientesToolBarProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductos"));
			
		this.jMenuItemSiguientesProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductos"));
			
		this.jMenuItemAbrirOrderByProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductos"));
			
		this.jMenuItemMostrarOcultarProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductos"));
			
		this.jMenuItemDetalleAbrirOrderByProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductos"));
			
		this.jMenuItemDetalleMostarOcultarProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductos"));
			
		this.jMenuItemNuevoGuardarCambiosProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductos"));

		this.jCheckBoxSeleccionadosProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductos"));
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductos"));
			
		this.jComboBoxTiposAccionesProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesProductos"));
					
		this.jComboBoxTiposSeleccionarProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductos"));
			
		this.jTextFieldValorCampoGeneralProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonidProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_empresaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_empresaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_sucursalProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_sucursalProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_productoProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_productoProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfecha_inicioProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfecha_finProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonnombre_productoProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfechaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fechaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtoncantidadProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosProductos.addActionListener(new ButtonActionListener(this,"BusquedaProductosProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductos!=null) {
				this.jInternalFrameReporteDinamicoProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductos"));
				this.jInternalFrameReporteDinamicoProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductos"));
				this.jInternalFrameReporteDinamicoProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductos"));				
			//this.jButtonGenerarReporteDinamicoProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductos"));
			//this.jButtonGenerarExcelReporteDinamicoProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductos!=null) {
				this.jInternalFrameImportacionProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductos"));
				this.jInternalFrameImportacionProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductos"));
				this.jInternalFrameImportacionProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductos"));
			
			this.jButtonAbrirOrderByToolBarProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductos"));			
			
			if(this.jInternalFrameOrderByProductos!=null) {
				this.jInternalFrameOrderByProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductos.jTabbedPaneRelacionesProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductos"));
		
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
            		closingInternalFrameProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductos = (JInternalFrameBase)event.getSource();
	            	
	            ProductosBeanSwingJInternalFrame jInternalFrameParent=(ProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductos";
		inputMap = this.jButtonNuevoProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductos";
		inputMap = this.jButtonNuevoRelacionesProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductos";
		inputMap = this.jButtonModificarProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductos";
		inputMap = this.jButtonActualizarProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductos";
		inputMap = this.jButtonEliminarProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductos";
		inputMap = this.jButtonCancelarProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductos";
		inputMap = this.jButtonCerrarProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductos";
		inputMap = this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductos.jButtonGuardarCambiosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonidProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_empresaProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_empresaProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_sucursalProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_sucursalProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductos.jButtonid_productoProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonid_productoProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfecha_inicioProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfecha_finProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonnombre_productoProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtonfechaProductosBusqueda.addActionListener(new ButtonActionListener(this,"fechaProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductos.jButtoncantidadProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosBusqueda"));
		
		
		this.jButtonBusquedaProductosProductos.addActionListener(new ButtonActionListener(this,"BusquedaProductosProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Productos productosAux:this.productosLogic.getProductoss()) {
					productosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Productos productosAux:productoss) {
					productosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Productos productosAux:this.productosLogic.getProductoss()) {
						productosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Productos productosAux:productoss) {
						productosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Productos productosAux:this.productosLogic.getProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Productos productosAux:productoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductos.getSelectedRows();
			
			Productos productosLocal=new Productos();
			
			//this.seleccionarTodosProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosLocal =(Productos) this.productosLogic.getProductoss().toArray()[this.jTableDatosProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosLocal =(Productos) this.productoss.toArray()[this.jTableDatosProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Productos productosAux:this.productosLogic.getProductoss()) {
						productosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Productos productosAux:productoss) {
						productosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Productos productosAux:this.productosLogic.getProductoss()) {
				
						if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							productosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							productosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							productosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Productos productosAux:productoss) {
					
						if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							productosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							productosAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							productosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessProductos(conSplash);
				
					this.generarReporteProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductossSeleccionados();
				//this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductos();
				
				this.exportarProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoss();
				//this.importarProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductossSeleccionados();
				//this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductos(conSplash);
					
						//this.actualizarParametrosGeneralProductos();
						
						this.generarReporteProcesoAccionProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductos();
				
						this.actualizarParametrosGeneralProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosReturnGeneral=productosLogic.procesarAccionProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosLogic.getProductoss(),this.productosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductos();
					
					ProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductos.jComboBoxTiposAccionesFormularioProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductos();
			
			if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
			Productos productos=new Productos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductos.getSelectedItem();
			
			
			
			
			productossSeleccionados=this.getProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(productossSeleccionados.size()==1) {
				for(Productos productosAux:productossSeleccionados) {
					productos=productosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductos();
			
      		//this.finishProcessProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosReturnGeneral() throws Exception {
		if(this.productosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductos(false);
		}
		
		if(this.productosReturnGeneral.getConRetornoLista() || this.productosReturnGeneral.getConRetornoObjeto()) {
			if(this.productosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosLogic.setProductoss(this.productosReturnGeneral.getProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralProductos() throws Exception {
		
		
	}
	
	public ArrayList<Productos> getProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Productos productosAux:productosLogic.getProductoss()) {
					if(productosAux.getIsSelected()) {
						productossSeleccionados.add(productosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Productos productosAux:this.productoss) {
					if(productosAux.getIsSelected()) {
						productossSeleccionados.add(productosAux);				
					}
				}
			}
			
			if(productossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productossSeleccionados.addAll(this.productosLogic.getProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productossSeleccionados.addAll(this.productoss);				
					}
				}
			}
		} else {
			productossSeleccionados.add(this.productos);
		}
		
		return productossSeleccionados;
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
	
	public void generarReporteProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductossSeleccionados() throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoss("Todos",productossSeleccionados);
		
	}	
	
	public void generarReporteNormalProductossSeleccionados() throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoss("Todos",productossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoss("Todos",productossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductossSeleccionados() throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductos();
		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductos();
		
		
		//this.generarReporteProductoss("Todos",productossSeleccionados ,productosImplementable,productosImplementableHome);
	}
	
	public void mostrarImportacionProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductos();
		
		this.abrirFrameImportacionProductos();		
		
			
		//this.generarReporteProductoss("Todos",productossSeleccionados ,productosImplementable,productosImplementableHome);
	}
	
	public void importarProductoss() throws Exception {		
	
	}
	
	public void exportarProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductossSeleccionados() throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Productos productosAux:productossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductos(productosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosAux.setsDetalleGeneralEntityReporte(productosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosConstantesFunciones.LABEL_CANTIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductos(Productos productos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productos.getcantidad().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductossSeleccionados() throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Productoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductos(row);				
				iRow++;
			}				
			
			for(Productos productosAux:productossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductos(productosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductossSeleccionados() throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();		
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productos");
			//elementRoot.appendChild(element);
		
			for(Productos productosAux:productossSeleccionados) {
				element = document.createElement("productos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductos(productosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosConstantesFunciones.LABEL_CANTIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductos(Productos productos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(productos.getcantidad());				
	}
	
	public void setFilaDatosExportarXmlProductos(Productos productos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementfecha_inicio = document.createElement(ProductosConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(productos.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ProductosConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(productos.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_producto = document.createElement(ProductosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(productos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementfecha = document.createElement(ProductosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(productos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcantidad = document.createElement(ProductosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productos.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);
	}
	
	public void generarReporteGroupGenericoProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Productos> productossSeleccionados=new ArrayList<Productos>();
		
		productossSeleccionados=this.getProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductos(productossSeleccionados);
		
		this.generarReporteProductoss("Todos",productossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductos(ArrayList<Productos> productossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Productos productosAux:productossSeleccionados) {
				productosAux.setsDetalleGeneralEntityReporte(productosAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(productosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(productosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(productosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(productosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ProductosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productosAux.setsDescripcionGeneralEntityReporte1(productosAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesProductos=true;
				this.isVisibilidadCeldaGuardarCambiosProductos=true;
			}
			
			this.isVisibilidadCeldaModificarProductos=false;
			this.isVisibilidadCeldaActualizarProductos=false;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
			this.isVisibilidadCeldaModificarProductos=false;
			this.isVisibilidadCeldaActualizarProductos=true;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
			this.isVisibilidadCeldaModificarProductos=false;
			this.isVisibilidadCeldaActualizarProductos=true;
			this.isVisibilidadCeldaEliminarProductos=true;
			this.isVisibilidadCeldaCancelarProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
			this.isVisibilidadCeldaModificarProductos=false;
			this.isVisibilidadCeldaActualizarProductos=true;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProductos=true;
			this.isVisibilidadCeldaModificarProductos=false;
			this.isVisibilidadCeldaActualizarProductos=false;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
			this.isVisibilidadCeldaActualizarProductos=false;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
			this.isVisibilidadCeldaModificarProductos=true;
			this.isVisibilidadCeldaActualizarProductos=false;
			this.isVisibilidadCeldaEliminarProductos=false;
			this.isVisibilidadCeldaCancelarProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProductos=true;
		} else {
			this.actualizarEstadoPanelsProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductos=false;
			//this.isVisibilidadCeldaVerFormProductos=false;
			this.isVisibilidadCeldaDuplicarProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosSessionBean.getEsGuardarRelacionado()) {
			if(!productosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductos=false;												
			}
			
			this.jButtonCerrarProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.productos)) {
			this.isVisibilidadCeldaActualizarProductos=false;
			this.isVisibilidadCeldaEliminarProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesProductos=false;
		this.isVisibilidadCeldaGuardarCambiosProductos=false;
		//this.isVisibilidadCeldaModificarProductos=true;
		this.isVisibilidadCeldaActualizarProductos=false;
		this.isVisibilidadCeldaEliminarProductos=false;
		//this.isVisibilidadCeldaCancelarProductos=true;			
		this.isVisibilidadCeldaGuardarProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductos() {
	}
	
	public void actualizarEstadoPanelsProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductos!=null) {
				this.jScrollPanelDatosEdicionProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductos!=null) {
				this.jScrollPanelDatosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductos!=null) {
				this.jPanelPaginacionProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductos!=null) {
					this.jTabbedPaneBusquedasProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductos!=null) {
				this.jTabbedPaneBusquedasProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductos!=null) {
				this.jPanelParametrosReportesProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductos) {this.jTabbedPaneBusquedasProductos.remove(jPanelBusquedaProductosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductos) {this.jTabbedPaneBusquedasProductos.remove(jPanelBusquedaProductosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProductos=isParaProductoNegation;
			if(!this.isVisibilidadBusquedaProductos) {this.jTabbedPaneBusquedasProductos.remove(jPanelBusquedaProductosProductos);}
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
			
			this.inicializarActualizarBindingTablaProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductos() {
		this.updateBorderResaltarBusquedasFormularioProductos();
		this.updateVisibilidadBusquedasFormularioProductos();
		this.updateHabilitarBusquedasFormularioProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductos.getComponents().length>0) {
	

		if(this.productosConstantesFunciones.resaltarBusquedaProductosProductos!=null) {
			index= this.jTabbedPaneBusquedasProductos.indexOfComponent(this.jPanelBusquedaProductosProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductos.getComponent(index);
				jPanel.setBorder(this.productosConstantesFunciones.resaltarBusquedaProductosProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductos.indexOfComponent(this.jPanelBusquedaProductosProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosConstantesFunciones.mostrarBusquedaProductosProductos);
			if(!this.productosConstantesFunciones.mostrarBusquedaProductosProductos && index>-1) {
				this.jTabbedPaneBusquedasProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductos.indexOfComponent(this.jPanelBusquedaProductosProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosConstantesFunciones.activarBusquedaProductosProductos);
				this.jTabbedPaneBusquedasProductos.setEnabledAt(index,this.productosConstantesFunciones.activarBusquedaProductosProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductos")) {
			index= this.jTabbedPaneBusquedasProductos.indexOfComponent(this.jPanelBusquedaProductosProductos);

			this.jTabbedPaneBusquedasProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductos.getComponent(index);

			this.productosConstantesFunciones.setResaltarBusquedaProductosProductos(resaltar);

			jPanel.setBorder(this.productosConstantesFunciones.resaltarBusquedaProductosProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductos() throws Exception {

		if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductos();
		this.updateVisibilidadResaltarControlesFormularioProductos();
		this.updateHabilitarResaltarControlesFormularioProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosConstantesFunciones.resaltaridProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jLabelidProductos.setBorder(this.productosConstantesFunciones.resaltaridProductos);}
		if(this.productosConstantesFunciones.resaltarid_empresaProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setBorder(this.productosConstantesFunciones.resaltarid_empresaProductos);}
		if(this.productosConstantesFunciones.resaltarid_sucursalProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setBorder(this.productosConstantesFunciones.resaltarid_sucursalProductos);}
		if(this.productosConstantesFunciones.resaltarid_productoProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setBorder(this.productosConstantesFunciones.resaltarid_productoProductos);}
		if(this.productosConstantesFunciones.resaltarfecha_inicioProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jDateChooserfecha_inicioProductos.setBorder(this.productosConstantesFunciones.resaltarfecha_inicioProductos);}
		if(this.productosConstantesFunciones.resaltarfecha_finProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jDateChooserfecha_finProductos.setBorder(this.productosConstantesFunciones.resaltarfecha_finProductos);}
		if(this.productosConstantesFunciones.resaltarnombre_productoProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setBorder(this.productosConstantesFunciones.resaltarnombre_productoProductos);}
		if(this.productosConstantesFunciones.resaltarfechaProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setBorder(this.productosConstantesFunciones.resaltarfechaProductos);}
		if(this.productosConstantesFunciones.resaltarcantidadProductos!=null && this.jInternalFrameDetalleFormProductos!=null) {this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setBorder(this.productosConstantesFunciones.resaltarcantidadProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
	
		//this.jInternalFrameDetalleFormProductos.jLabelidProductos.setVisible(this.productosConstantesFunciones.mostraridProductos);
		this.jInternalFrameDetalleFormProductos.jPanelidProductos.setVisible(this.productosConstantesFunciones.mostraridProductos);
		//this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setVisible(this.productosConstantesFunciones.mostrarid_empresaProductos);
		this.jInternalFrameDetalleFormProductos.jPanelid_empresaProductos.setVisible(this.productosConstantesFunciones.mostrarid_empresaProductos);
		//this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setVisible(this.productosConstantesFunciones.mostrarid_sucursalProductos);
		this.jInternalFrameDetalleFormProductos.jPanelid_sucursalProductos.setVisible(this.productosConstantesFunciones.mostrarid_sucursalProductos);
		//this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setVisible(this.productosConstantesFunciones.mostrarid_productoProductos);
		this.jInternalFrameDetalleFormProductos.jPanelid_productoProductos.setVisible(this.productosConstantesFunciones.mostrarid_productoProductos);
		//this.jInternalFrameDetalleFormProductos.jDateChooserfecha_inicioProductos.setVisible(this.productosConstantesFunciones.mostrarfecha_inicioProductos);
		this.jInternalFrameDetalleFormProductos.jPanelfecha_inicioProductos.setVisible(this.productosConstantesFunciones.mostrarfecha_inicioProductos);
		//this.jInternalFrameDetalleFormProductos.jDateChooserfecha_finProductos.setVisible(this.productosConstantesFunciones.mostrarfecha_finProductos);
		this.jInternalFrameDetalleFormProductos.jPanelfecha_finProductos.setVisible(this.productosConstantesFunciones.mostrarfecha_finProductos);
		//this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setVisible(this.productosConstantesFunciones.mostrarnombre_productoProductos);
		this.jInternalFrameDetalleFormProductos.jPanelnombre_productoProductos.setVisible(this.productosConstantesFunciones.mostrarnombre_productoProductos);
		//this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setVisible(this.productosConstantesFunciones.mostrarfechaProductos);
		this.jInternalFrameDetalleFormProductos.jPanelfechaProductos.setVisible(this.productosConstantesFunciones.mostrarfechaProductos);
		//this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setVisible(this.productosConstantesFunciones.mostrarcantidadProductos);
		this.jInternalFrameDetalleFormProductos.jPanelcantidadProductos.setVisible(this.productosConstantesFunciones.mostrarcantidadProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductos!=null) {
	
		this.jInternalFrameDetalleFormProductos.jLabelidProductos.setEnabled(this.productosConstantesFunciones.activaridProductos);
		this.jInternalFrameDetalleFormProductos.jComboBoxid_empresaProductos.setEnabled(this.productosConstantesFunciones.activarid_empresaProductos);
		this.jInternalFrameDetalleFormProductos.jComboBoxid_sucursalProductos.setEnabled(this.productosConstantesFunciones.activarid_sucursalProductos);
		this.jInternalFrameDetalleFormProductos.jComboBoxid_productoProductos.setEnabled(this.productosConstantesFunciones.activarid_productoProductos);
		this.jInternalFrameDetalleFormProductos.jDateChooserfecha_inicioProductos.setEnabled(this.productosConstantesFunciones.activarfecha_inicioProductos);
		this.jInternalFrameDetalleFormProductos.jDateChooserfecha_finProductos.setEnabled(this.productosConstantesFunciones.activarfecha_finProductos);
		this.jInternalFrameDetalleFormProductos.jTextAreanombre_productoProductos.setEnabled(this.productosConstantesFunciones.activarnombre_productoProductos);
		this.jInternalFrameDetalleFormProductos.jDateChooserfechaProductos.setEnabled(this.productosConstantesFunciones.activarfechaProductos);
		this.jInternalFrameDetalleFormProductos.jTextFieldcantidadProductos.setEnabled(this.productosConstantesFunciones.activarcantidadProductos);
		}
	}
	
		
}