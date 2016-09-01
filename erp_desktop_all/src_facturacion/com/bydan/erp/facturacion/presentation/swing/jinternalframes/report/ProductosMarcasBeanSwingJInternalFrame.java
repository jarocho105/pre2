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

//import com.bydan.erp.facturacion.util.ProductosMarcasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProductosMarcasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProductosMarcasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.ProductosMarcasBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductosMarcasBeanSwingJInternalFrame extends ProductosMarcasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosMarcasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosMarcas> productosmarcasValidator = new ClassValidator<ProductosMarcas>(ProductosMarcas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosMarcas productosmarcas;	
	public ProductosMarcas productosmarcasAux;
	public ProductosMarcas productosmarcasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosMarcas productosmarcasTotales;
	public Long idProductosMarcasActual;
	public Long iIdNuevoProductosMarcas=0L;
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
	
	public Boolean isPermisoTodoProductosMarcas;
	public Boolean isPermisoNuevoProductosMarcas;
	public Boolean isPermisoActualizarProductosMarcas;
	public Boolean isPermisoActualizarOriginalProductosMarcas;
	public Boolean isPermisoEliminarProductosMarcas;
	public Boolean isPermisoGuardarCambiosProductosMarcas;
	public Boolean isPermisoConsultaProductosMarcas;
	public Boolean isPermisoBusquedaProductosMarcas;
	public Boolean isPermisoReporteProductosMarcas;
	public Boolean isPermisoPaginacionMedioProductosMarcas;
	public Boolean isPermisoPaginacionAltoProductosMarcas;
	public Boolean isPermisoPaginacionTodoProductosMarcas;
	public Boolean isPermisoCopiarProductosMarcas;
	public Boolean isPermisoVerFormProductosMarcas;
	public Boolean isPermisoDuplicarProductosMarcas;
	public Boolean isPermisoOrdenProductosMarcas;
	
	
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
	
	public ProductosMarcasParameterReturnGeneral productosmarcasReturnGeneral;
	public ProductosMarcasParameterReturnGeneral productosmarcasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosMarcas=false;
	public Boolean esParaAccionDesdeFormularioProductosMarcas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosMarcasSessionBeanAdditional productosmarcasSessionBeanAdditional=null;
	
	public ProductosMarcasSessionBeanAdditional getProductosMarcasSessionBeanAdditional() {
		return this.productosmarcasSessionBeanAdditional;
	}
	
	public void setProductosMarcasSessionBeanAdditional(ProductosMarcasSessionBeanAdditional productosmarcasSessionBeanAdditional) {
		try {
			this.productosmarcasSessionBeanAdditional=productosmarcasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosMarcasBeanSwingJInternalFrameAdditional productosmarcasBeanSwingJInternalFrameAdditional=null;
	//public class ProductosMarcasBeanSwingJInternalFrame
	
	public ProductosMarcasBeanSwingJInternalFrameAdditional getProductosMarcasBeanSwingJInternalFrameAdditional() {
		return this.productosmarcasBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosMarcasBeanSwingJInternalFrameAdditional(ProductosMarcasBeanSwingJInternalFrameAdditional productosmarcasBeanSwingJInternalFrameAdditional) {
		try {
			this.productosmarcasBeanSwingJInternalFrameAdditional=productosmarcasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosMarcasLogic productosmarcasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosMarcas productosmarcasBean;
	public ProductosMarcasConstantesFunciones productosmarcasConstantesFunciones;
	//public ProductosMarcasParameterReturnGeneral productosmarcasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<ProductosMarcas> productosmarcass;	
	//public List<ProductosMarcas> productosmarcassEliminados;
	//public List<ProductosMarcas> productosmarcassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosMarcas=false;
	public Boolean isVisibilidadCeldaDuplicarProductosMarcas=true;
	public Boolean isVisibilidadCeldaCopiarProductosMarcas=true;
	public Boolean isVisibilidadCeldaVerFormProductosMarcas=true;
	public Boolean isVisibilidadCeldaOrdenProductosMarcas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
	public Boolean isVisibilidadCeldaModificarProductosMarcas=false;
	public Boolean isVisibilidadCeldaActualizarProductosMarcas=false;
	public Boolean isVisibilidadCeldaEliminarProductosMarcas=false;
	public Boolean isVisibilidadCeldaCancelarProductosMarcas=false;
	public Boolean isVisibilidadCeldaGuardarProductosMarcas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosMarcas=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosMarcas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductosMarcas() {
		return this.iIdNuevoProductosMarcas;
	}

	public void setiIdNuevoProductosMarcas(Long iIdNuevoProductosMarcas) {
		this.iIdNuevoProductosMarcas = iIdNuevoProductosMarcas;
	}
	
	public Long getidProductosMarcasActual() {
		return this.idProductosMarcasActual;
	}

	public void setidProductosMarcasActual(Long idProductosMarcasActual) {
		this.idProductosMarcasActual = idProductosMarcasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosMarcas getproductosmarcas() {
		return this.productosmarcas;
	}

	public void setproductosmarcas(ProductosMarcas productosmarcas) {
		this.productosmarcas = productosmarcas;
	}
	
	public ProductosMarcas getproductosmarcasAux() {
		return this.productosmarcasAux;
	}

	public void setproductosmarcasAux(ProductosMarcas productosmarcasAux) {
		this.productosmarcasAux = productosmarcasAux;
	}				
	
	public ProductosMarcas getproductosmarcasAnterior() {
		return this.productosmarcasAnterior;
	}

	public void setproductosmarcasAnterior(ProductosMarcas productosmarcasAnterior) {
		this.productosmarcasAnterior = productosmarcasAnterior;
	}	
	
	public ProductosMarcas getproductosmarcasTotales() {
		return this.productosmarcasTotales;
	}

	public void setproductosmarcasTotales(ProductosMarcas productosmarcasTotales) {
		this.productosmarcasTotales = productosmarcasTotales;
	}	
	
	public ProductosMarcas getproductosmarcasBean() {
		return this.productosmarcasBean;
	}

	public void setproductosmarcasBean(ProductosMarcas productosmarcasBean) {
		this.productosmarcasBean = productosmarcasBean;
	}	
	
	public ProductosMarcasParameterReturnGeneral getproductosmarcasReturnGeneral() {
		return this.productosmarcasReturnGeneral;
	}

	public void setproductosmarcasReturnGeneral(ProductosMarcasParameterReturnGeneral productosmarcasReturnGeneral) {
		this.productosmarcasReturnGeneral = productosmarcasReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaProductosMarcas=-1L;

	public Long getid_productoBusquedaProductosMarcas() {
		return this.id_productoBusquedaProductosMarcas;
	}

	public void setid_productoBusquedaProductosMarcas(Long id_productoBusquedaProductosMarcas) {
		this.id_productoBusquedaProductosMarcas = id_productoBusquedaProductosMarcas;
	}

;
	public Date fecha_emision_desdeBusquedaProductosMarcas=new Date();

	public Date getfecha_emision_desdeBusquedaProductosMarcas() {
		return this.fecha_emision_desdeBusquedaProductosMarcas;
	}

	public void setfecha_emision_desdeBusquedaProductosMarcas(Date fecha_emision_desdeBusquedaProductosMarcas) {
		this.fecha_emision_desdeBusquedaProductosMarcas = fecha_emision_desdeBusquedaProductosMarcas;
	}

;
	public Date fecha_emision_hastaBusquedaProductosMarcas=new Date();

	public Date getfecha_emision_hastaBusquedaProductosMarcas() {
		return this.fecha_emision_hastaBusquedaProductosMarcas;
	}

	public void setfecha_emision_hastaBusquedaProductosMarcas(Date fecha_emision_hastaBusquedaProductosMarcas) {
		this.fecha_emision_hastaBusquedaProductosMarcas = fecha_emision_hastaBusquedaProductosMarcas;
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
	
	
	public ProductosMarcasLogic getProductosMarcasLogic()	{		
		return productosmarcasLogic;
	}

	public void setProductosMarcasLogic(ProductosMarcasLogic productosmarcasLogic) {
		this.productosmarcasLogic = productosmarcasLogic;
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
	
	public Boolean getIsEsNuevoProductosMarcas() {
		return isEsNuevoProductosMarcas;
	}

	public void setIsEsNuevoProductosMarcas(Boolean isEsNuevoProductosMarcas) {
		this.isEsNuevoProductosMarcas = isEsNuevoProductosMarcas;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosMarcas() {
		return esParaAccionDesdeFormularioProductosMarcas;
	}
	
	public void setEsParaAccionDesdeFormularioProductosMarcas(Boolean esParaAccionDesdeFormularioProductosMarcas) {
		this.esParaAccionDesdeFormularioProductosMarcas = esParaAccionDesdeFormularioProductosMarcas;
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

			if(this.productosmarcasSessionBean==null) {
				this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
			}

			if(!this.productosmarcasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosmarcasSessionBean.getlidEmpresaActual());
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

			if(this.productosmarcasSessionBean==null) {
				this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
			}

			if(!this.productosmarcasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosmarcasSessionBean.getlidSucursalActual());
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

			if(this.productosmarcasSessionBean==null) {
				this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
			}

			if(!this.productosmarcasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productosmarcasSessionBean.getlidProductoActual());
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

					if(this.productosmarcas!=null) {
						this.productosmarcas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
						this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosMarcas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
						if(this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosMarcasGenerico)throws Exception
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
				jComboBoxid_empresaProductosMarcasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosMarcasGenerico!=null && jComboBoxid_empresaProductosMarcasGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosMarcasGenerico.setSelectedIndex(0);
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

					if(this.productosmarcas!=null) {
						this.productosmarcas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
						this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductosMarcas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
						if(this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosMarcasGenerico)throws Exception
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
				jComboBoxid_sucursalProductosMarcasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosMarcasGenerico!=null && jComboBoxid_sucursalProductosMarcasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosMarcasGenerico.setSelectedIndex(0);
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

					if(this.productosmarcas!=null) {
						this.productosmarcas.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
						this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductosMarcas.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
						if(this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosMarcas") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProductosMarcasProductosMarcas!=null) {
						jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProductosMarcasProductosMarcas!=null) {
							//jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.getItemCount()>0) {
								jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductosMarcasGenerico)throws Exception
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
				jComboBoxid_productoProductosMarcasGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductosMarcasGenerico!=null && jComboBoxid_productoProductosMarcasGenerico.getItemCount()>0) {
					jComboBoxid_productoProductosMarcasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosMarcas productosmarcas,JComboBox jComboBoxid_empresaProductosMarcasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosMarcasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosMarcasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productosmarcas.setid_empresa(empresaAux.getId());
				productosmarcas.setempresa_descripcion(ProductosMarcasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productosmarcas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductosMarcas productosmarcas,JComboBox jComboBoxid_sucursalProductosMarcasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosMarcasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosMarcasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productosmarcas.setid_sucursal(sucursalAux.getId());
				productosmarcas.setsucursal_descripcion(ProductosMarcasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productosmarcas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductosMarcas productosmarcas,JComboBox jComboBoxid_productoProductosMarcasGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductosMarcasGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductosMarcasGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productosmarcas.setid_producto(productoAux.getId());
				productosmarcas.setproducto_descripcion(ProductosMarcasConstantesFunciones.getProductoDescripcion(productoAux));
				productosmarcas.setProducto(productoAux);			}
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

					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) { 
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosMarcas!=null) { 
					}

					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) { 
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosMarcas!=null) { 
					}

					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) { 
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosMarcas!=null) { 
					}

					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosMarcas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.addItem(producto);
							}
						}

						if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductosMarcas() throws Exception {
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
		
	public ProductosMarcasParameterReturnGeneral getProductosMarcasParameterGeneral() {
		return this.productosmarcasParameterGeneral;
	}
	
	public void setProductosMarcasParameterGeneral(ProductosMarcasParameterReturnGeneral productosmarcasParameterGeneral) {
		this.productosmarcasParameterGeneral = productosmarcasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosMarcas() {
		return isPermisoTodoProductosMarcas;
	}

	public void setIsPermisoTodoProductosMarcas(Boolean isPermisoTodoProductosMarcas) {
		this.isPermisoTodoProductosMarcas = isPermisoTodoProductosMarcas;
	}

	public Boolean getIsPermisoNuevoProductosMarcas() {
		return isPermisoNuevoProductosMarcas;
	}

	public void setIsPermisoNuevoProductosMarcas(Boolean isPermisoNuevoProductosMarcas) {
		this.isPermisoNuevoProductosMarcas = isPermisoNuevoProductosMarcas;
	}

	public Boolean getIsPermisoActualizarProductosMarcas() {
		return isPermisoActualizarProductosMarcas;
	}

	public void setIsPermisoActualizarProductosMarcas(Boolean isPermisoActualizarProductosMarcas) {
		this.isPermisoActualizarProductosMarcas = isPermisoActualizarProductosMarcas;
	}

	public Boolean getIsPermisoEliminarProductosMarcas() {
		return isPermisoEliminarProductosMarcas;
	}

	public void setIsPermisoEliminarProductosMarcas(Boolean isPermisoEliminarProductosMarcas) {
		this.isPermisoEliminarProductosMarcas = isPermisoEliminarProductosMarcas;
	}

	public Boolean getIsPermisoGuardarCambiosProductosMarcas() {
		return isPermisoGuardarCambiosProductosMarcas;
	}

	public void setIsPermisoGuardarCambiosProductosMarcas(Boolean isPermisoGuardarCambiosProductosMarcas) {
		this.isPermisoGuardarCambiosProductosMarcas = isPermisoGuardarCambiosProductosMarcas;
	}
	
	public Boolean getIsPermisoConsultaProductosMarcas() {
		return isPermisoConsultaProductosMarcas;
	}

	public void setIsPermisoConsultaProductosMarcas(Boolean isPermisoConsultaProductosMarcas) {
		this.isPermisoConsultaProductosMarcas = isPermisoConsultaProductosMarcas;
	}

	public Boolean getIsPermisoBusquedaProductosMarcas() {
		return isPermisoBusquedaProductosMarcas;
	}

	public void setIsPermisoBusquedaProductosMarcas(Boolean isPermisoBusquedaProductosMarcas) {
		this.isPermisoBusquedaProductosMarcas = isPermisoBusquedaProductosMarcas;
	}

	public Boolean getIsPermisoReporteProductosMarcas() {
		return isPermisoReporteProductosMarcas;
	}

	public void setIsPermisoReporteProductosMarcas(Boolean isPermisoReporteProductosMarcas) {
		this.isPermisoReporteProductosMarcas = isPermisoReporteProductosMarcas;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosMarcas() {
		return isPermisoPaginacionMedioProductosMarcas;
	}

	public void setIsPermisoPaginacionMedioProductosMarcas(Boolean isPermisoPaginacionMedioProductosMarcas) {
		this.isPermisoPaginacionMedioProductosMarcas = isPermisoPaginacionMedioProductosMarcas;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosMarcas() {
		return isPermisoPaginacionTodoProductosMarcas;
	}

	public void setIsPermisoPaginacionTodoProductosMarcas(Boolean isPermisoPaginacionTodoProductosMarcas) {
		this.isPermisoPaginacionTodoProductosMarcas = isPermisoPaginacionTodoProductosMarcas;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosMarcas() {
		return isPermisoPaginacionAltoProductosMarcas;
	}

	public void setIsPermisoPaginacionAltoProductosMarcas(Boolean isPermisoPaginacionAltoProductosMarcas) {
		this.isPermisoPaginacionAltoProductosMarcas = isPermisoPaginacionAltoProductosMarcas;
	}
	
	public Boolean getIsPermisoCopiarProductosMarcas() {
		return isPermisoCopiarProductosMarcas;
	}

	public void setIsPermisoCopiarProductosMarcas(Boolean isPermisoCopiarProductosMarcas) {
		this.isPermisoCopiarProductosMarcas = isPermisoCopiarProductosMarcas;
	}
	
	public Boolean getIsPermisoVerFormProductosMarcas() {
		return isPermisoVerFormProductosMarcas;
	}

	public void setIsPermisoVerFormProductosMarcas(Boolean isPermisoVerFormProductosMarcas) {
		this.isPermisoVerFormProductosMarcas = isPermisoVerFormProductosMarcas;
	}
	
	public Boolean getIsPermisoDuplicarProductosMarcas() {
		return isPermisoDuplicarProductosMarcas;
	}

	public void setIsPermisoDuplicarProductosMarcas(Boolean isPermisoDuplicarProductosMarcas) {
		this.isPermisoDuplicarProductosMarcas = isPermisoDuplicarProductosMarcas;
	}
	
	public Boolean getIsPermisoOrdenProductosMarcas() {
		return isPermisoOrdenProductosMarcas;
	}

	public void setIsPermisoOrdenProductosMarcas(Boolean isPermisoOrdenProductosMarcas) {
		this.isPermisoOrdenProductosMarcas = isPermisoOrdenProductosMarcas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosMarcas() {
		return isVisibilidadCeldaNuevoProductosMarcas;
	}

	public void setIsVisibilidadCeldaNuevoProductosMarcas(Boolean isVisibilidadCeldaNuevoProductosMarcas) {
		this.isVisibilidadCeldaNuevoProductosMarcas = isVisibilidadCeldaNuevoProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosMarcas() {
		return isVisibilidadCeldaDuplicarProductosMarcas;
	}

	public void setIsVisibilidadCeldaDuplicarProductosMarcas(Boolean isVisibilidadCeldaDuplicarProductosMarcas) {
		this.isVisibilidadCeldaDuplicarProductosMarcas = isVisibilidadCeldaDuplicarProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosMarcas() {
		return isVisibilidadCeldaCopiarProductosMarcas;
	}

	public void setIsVisibilidadCeldaCopiarProductosMarcas(Boolean isVisibilidadCeldaCopiarProductosMarcas) {
		this.isVisibilidadCeldaCopiarProductosMarcas = isVisibilidadCeldaCopiarProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosMarcas() {
		return isVisibilidadCeldaVerFormProductosMarcas;
	}

	public void setIsVisibilidadCeldaVerFormProductosMarcas(Boolean isVisibilidadCeldaVerFormProductosMarcas) {
		this.isVisibilidadCeldaVerFormProductosMarcas = isVisibilidadCeldaVerFormProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosMarcas() {
		return isVisibilidadCeldaOrdenProductosMarcas;
	}

	public void setIsVisibilidadCeldaOrdenProductosMarcas(Boolean isVisibilidadCeldaOrdenProductosMarcas) {
		this.isVisibilidadCeldaOrdenProductosMarcas = isVisibilidadCeldaOrdenProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosMarcas() {
		return isVisibilidadCeldaNuevoRelacionesProductosMarcas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosMarcas(Boolean isVisibilidadCeldaNuevoRelacionesProductosMarcas) {
		this.isVisibilidadCeldaNuevoRelacionesProductosMarcas = isVisibilidadCeldaNuevoRelacionesProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosMarcas() {
		return isVisibilidadCeldaModificarProductosMarcas;
	}

	public void setIsVisibilidadCeldaModificarProductosMarcas(Boolean isVisibilidadCeldaModificarProductosMarcas) {
		this.isVisibilidadCeldaModificarProductosMarcas = isVisibilidadCeldaModificarProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosMarcas() {
		return isVisibilidadCeldaActualizarProductosMarcas;
	}

	public void setIsVisibilidadCeldaActualizarProductosMarcas(Boolean isVisibilidadCeldaActualizarProductosMarcas) {
		this.isVisibilidadCeldaActualizarProductosMarcas = isVisibilidadCeldaActualizarProductosMarcas;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosMarcas() {
		return isVisibilidadCeldaEliminarProductosMarcas;
	}

	public void setIsVisibilidadCeldaEliminarProductosMarcas(Boolean isVisibilidadCeldaEliminarProductosMarcas) {
		this.isVisibilidadCeldaEliminarProductosMarcas = isVisibilidadCeldaEliminarProductosMarcas;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosMarcas() {
		return isVisibilidadCeldaCancelarProductosMarcas;
	}

	public void setIsVisibilidadCeldaCancelarProductosMarcas(Boolean isVisibilidadCeldaCancelarProductosMarcas) {
		this.isVisibilidadCeldaCancelarProductosMarcas = isVisibilidadCeldaCancelarProductosMarcas;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosMarcas() {
		return isVisibilidadCeldaGuardarProductosMarcas;
	}

	public void setIsVisibilidadCeldaGuardarProductosMarcas(Boolean isVisibilidadCeldaGuardarProductosMarcas) {
		this.isVisibilidadCeldaGuardarProductosMarcas = isVisibilidadCeldaGuardarProductosMarcas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosMarcas() {
		return isVisibilidadCeldaGuardarCambiosProductosMarcas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosMarcas(Boolean isVisibilidadCeldaGuardarCambiosProductosMarcas) {
		this.isVisibilidadCeldaGuardarCambiosProductosMarcas = isVisibilidadCeldaGuardarCambiosProductosMarcas;
	}
		
	public ProductosMarcasSessionBean getproductosmarcasSessionBean() {
		return this.productosmarcasSessionBean;
	}
	
	public void setproductosmarcasSessionBean(ProductosMarcasSessionBean productosmarcasSessionBean) {
		this.productosmarcasSessionBean=productosmarcasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosMarcas() {
		return this.isVisibilidadBusquedaProductosMarcas;
	}

	public void setisVisibilidadBusquedaProductosMarcas(Boolean isVisibilidadBusquedaProductosMarcas) {
		this.isVisibilidadBusquedaProductosMarcas=isVisibilidadBusquedaProductosMarcas;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(ProductosMarcas productosmarcas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productosmarcas,null);
				this.setActualParaGuardarSucursalForeignKey(productosmarcas,null);
				this.setActualParaGuardarProductoForeignKey(productosmarcas,null);
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
	
	public void bugActualizarReferenciaActual(ProductosMarcas productosmarcas,ProductosMarcas productosmarcasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosMarcas(productosmarcas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosmarcasAux.setId(productosmarcas.getId());
		productosmarcasAux.setVersionRow(productosmarcas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosMarcas productosmarcasLocal) throws Exception {
		
		if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosMarcas productosmarcasLocal) throws Exception {	
		if(this.productosmarcasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosmarcasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosmarcasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productosmarcasLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosMarcasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosmarcasValidator.getInvalidValues(this.productosmarcas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosMarcas productosmarcas,List<ProductosMarcas> productosmarcass) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosMarcas productosmarcas,List<ProductosMarcas> productosmarcass) throws Exception {
		try	{			
			ProductosMarcasConstantesFunciones.actualizarSelectedLista(productosmarcas,productosmarcass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosMarcas> productosmarcassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productosmarcassLocal=this.productosmarcasLogic.getProductosMarcass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productosmarcassLocal=this.productosmarcass;
			}
			//ARCHITECTURE
		
			for(ProductosMarcas productosmarcasLocal:productosmarcassLocal) {
				if(this.permiteMantenimiento(productosmarcasLocal) && productosmarcasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosMarcasConstantesFunciones.getProductosMarcasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_unidadProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_productoProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_lineaProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_grupoProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_categoriaProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_marcaProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelcantidadProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelmontoProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelcodigo_productoProductosMarcas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosMarcasConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabeltipoProductosMarcas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_unidadProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_productoProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_lineaProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_grupoProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_categoriaProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_marcaProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelcantidadProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelmontoProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabelcodigo_productoProductosMarcas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosMarcas.jLabeltipoProductosMarcas,"");
		
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
		this.iIdNuevoProductosMarcas--;	
		
		
		this.productosmarcasAux=new ProductosMarcas();
		
		this.productosmarcasAux.setId(this.iIdNuevoProductosMarcas);
		this.productosmarcasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosmarcasLogic.getProductosMarcass().add(this.productosmarcasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productosmarcass.add(this.productosmarcasAux);
		}
		//ARCHITECTURE
		
		this.productosmarcas=this.productosmarcasAux;
		
		if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosMarcas(this.productosmarcas);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosMarcas(this.productosmarcas);
		}
				
		//this.setDefaultControlesProductosMarcas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosMarcas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosMarcas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosMarcas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosMarcas(this.productosmarcasBean,this.productosmarcas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosMarcas(this.productosmarcasReturnGeneral,this.productosmarcasBean,false);
		
		if(this.productosmarcasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosMarcas(this.productosmarcasReturnGeneral.getProductosMarcas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosMarcas(this.productosmarcasReturnGeneral.getProductosMarcas());
		}
		
		if(this.productosmarcasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosMarcas(this.productosmarcasReturnGeneral.getProductosMarcas(),classes);//this.productosmarcasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosMarcas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosMarcas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.RecargarFormProductosMarcas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosMarcas(false);
						
			if(productosmarcasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosMarcas();
			}
			
			this.actualizarVisualTableDatosProductosMarcas();
			
			this.jTableDatosProductosMarcas.setRowSelectionInterval(this.getIndiceNuevoProductosMarcas(), this.getIndiceNuevoProductosMarcas());
			
			this.seleccionarFilaTablaProductosMarcasActual();
						
			this.actualizarEstadoCeldasBotonesProductosMarcas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosMarcas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_desdeProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarfecha_emision_desdeProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_hastaProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarfecha_emision_hastaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarnombre_unidadProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarnombre_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarnombre_lineaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarnombre_linea_grupoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarnombre_linea_categoriaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarnombre_linea_marcaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarcantidadProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarmontoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarcodigo_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activartipoProductosMarcas);	
		//
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarid_empresaProductosMarcas);//
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarid_sucursalProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setEnabled(isHabilitar && this.productosmarcasConstantesFunciones.activarid_productoProductosMarcas);
	};
	
	public void setDefaultControlesProductosMarcas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosMarcas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosmarcasSessionBean.setConGuardarRelaciones(true);			
			this.productosmarcasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.setVisible(true);
			
					
		} else {
			//this.productosmarcasSessionBean.setConGuardarRelaciones(false);			
			this.productosmarcasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosMarcas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
				if(productosmarcasAux.getId().equals(this.iIdNuevoProductosMarcas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosMarcas productosmarcasAux:this.productosmarcass) {
				if(productosmarcasAux.getId().equals(this.iIdNuevoProductosMarcas)) {
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
	
	public int getIndiceActualProductosMarcas(ProductosMarcas productosmarcas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
				if(productosmarcasAux.getId().equals(productosmarcas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosMarcas productosmarcasAux:this.productosmarcass) {
				if(productosmarcasAux.getId().equals(productosmarcas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosMarcas(ProductosMarcas productosmarcasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
				if(productosmarcasAux.getProductosMarcasOriginal().getId().equals(productosmarcasOriginal.getId())) {
					existe=true;
					productosmarcasOriginal.setId(productosmarcasAux.getId());
					productosmarcasOriginal.setVersionRow(productosmarcasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosMarcas productosmarcasAux:this.productosmarcass) {
				if(productosmarcasAux.getProductosMarcasOriginal().getId().equals(productosmarcasOriginal.getId())) {
					existe=true;
					productosmarcasOriginal.setId(productosmarcasAux.getId());
					productosmarcasOriginal.setVersionRow(productosmarcasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosMarcas(Boolean esParaCancelar) throws Exception {
		productosmarcassAux=new ArrayList<ProductosMarcas>();
		productosmarcasAux=new ProductosMarcas();
		
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
					if(productosmarcasAux.getId()<0) {
						productosmarcassAux.add(productosmarcasAux);
					}		
				}
				this.iIdNuevoProductosMarcas=0L;
				this.productosmarcasLogic.getProductosMarcass().removeAll(productosmarcassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosMarcas productosmarcasAux:this.productosmarcass) {
					if(productosmarcasAux.getId()<0) {
						productosmarcassAux.add(productosmarcasAux);
					}		
				}
				this.iIdNuevoProductosMarcas=0L;
				this.productosmarcass.removeAll(productosmarcassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosMarcas 
					&& this.productosmarcasLogic.getProductosMarcass().size()>0
					) {
					productosmarcasAux=this.productosmarcasLogic.getProductosMarcass().get(this.productosmarcasLogic.getProductosMarcass().size() - 1);
				
					if(productosmarcasAux.getId()<0) {
						this.productosmarcasLogic.getProductosMarcass().remove(productosmarcasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosMarcas && this.productosmarcass.size()>0) {
					productosmarcasAux=this.productosmarcass.get(this.productosmarcass.size() - 1);
				
					if(productosmarcasAux.getId()<0) {
						this.productosmarcass.remove(productosmarcasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosMarcas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productosmarcas.getId()<0) {
				this.productosmarcasLogic.getProductosMarcass().remove(this.productosmarcas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productosmarcas.getId()<0) {
				this.productosmarcass.remove(this.productosmarcas);
			}
		}			
	}
	
	public void setEstadosInicialesProductosMarcas(List<ProductosMarcas> productosmarcassAux) throws Exception {
		ProductosMarcasConstantesFunciones.setEstadosInicialesProductosMarcas(productosmarcassAux);
	}
	
	public void setEstadosInicialesProductosMarcas(ProductosMarcas productosmarcasAux) throws Exception {
		ProductosMarcasConstantesFunciones.setEstadosInicialesProductosMarcas(productosmarcasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosMarcasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosMarcas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosMarcasActual()) {
				if(!this.isEsNuevoProductosMarcas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosMarcas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosMarcas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosMarcasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Marcas ?", "MANTENIMIENTO DE Productos Marcas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosMarcas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosMarcas productosmarcas) throws Exception {
		ProductosMarcasConstantesFunciones.seleccionarAsignar(this.productosmarcas,productosmarcas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosMarcas=this.isPermisoActualizarOriginalProductosMarcas;
			
			
			this.seleccionarAsignar(productosmarcas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosMarcas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosmarcasSessionBean.setsFuncionBusquedaRapida(this.productosmarcasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosMarcas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosMarcas(esParaCancelar);				
				this.cancelarNuevoProductosMarcas(esParaCancelar);								
			}
			
			this.productosmarcas=new ProductosMarcas();
			
			this.inicializarProductosMarcas();
			
			this.actualizarEstadoCeldasBotonesProductosMarcas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosMarcas() throws Exception {
		try {
			ProductosMarcasConstantesFunciones.inicializarProductosMarcas(this.productosmarcas);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosmarcasLogic.getProductosMarcass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosMarcass(String sAccionBusqueda,List<ProductosMarcas> productosmarcassParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosMarcas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosMarcasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosMarcasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosMarcas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Marcases");		
		parameters.put("busquedapor", ProductosMarcasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosMarcas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosMarcasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosMarcasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosMarcas=new JRBeanArrayDataSource(ProductosMarcasJInternalFrame.TraerProductosMarcasBeans(productosmarcassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosMarcas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosMarcasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosMarcasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosMarcasBean.TraerProductosMarcasBeans(productosmarcassParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosMarcass(sAccionBusqueda,sTipoArchivoReporte,productosmarcassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosMarcass(sAccionBusqueda,sTipoArchivoReporte,productosmarcassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosMarcasActionPerformed(null);
					//this.generarExcelReporteProductosMarcass(sAccionBusqueda,sTipoArchivoReporte,productosmarcassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosMarcass(sAccionBusqueda,sTipoArchivoReporte,productosmarcassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosMarcass(sAccionBusqueda,sTipoArchivoReporte,productosmarcassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosMarcass(sAccionBusqueda,sTipoArchivoReporte,productosmarcassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosMarcass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosMarcas> productosmarcassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosMarcass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosMarcas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosMarcas productosmarcas : productosmarcassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosMarcasConstantesFunciones.generarExcelReporteDataProductosMarcas("NORMAL",row,workbook,productosmarcas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosMarcas(String sTipo,Row row,Workbook workbook) {
		
		ProductosMarcasConstantesFunciones.generarExcelReporteHeaderProductosMarcas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosMarcass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosMarcas> productosmarcassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosMarcass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosMarcas productosmarcas : productosmarcassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosMarcasConstantesFunciones.getProductosMarcasDescripcion(productosmarcas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosMarcasConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosmarcas.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosMarcass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosMarcas> productosmarcassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosMarcas> productosmarcassRespaldo=null;
		
		classes=ProductosMarcasConstantesFunciones.getClassesRelationshipsOfProductosMarcas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosmarcasLogic.setDatosCliente(this.datosCliente);
		this.productosmarcasLogic.setDatosDeep(this.datosDeep);
		this.productosmarcasLogic.setIsConDeep(true);
		
		productosmarcassRespaldo=this.productosmarcasLogic.getProductosMarcass();
		
		this.productosmarcasLogic.setProductosMarcass(productosmarcassParaReportes);	
		this.productosmarcasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productosmarcassParaReportes=this.productosmarcasLogic.getProductosMarcass();
		this.productosmarcasLogic.setProductosMarcass(productosmarcassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosMarcass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosMarcas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosMarcas productosmarcas : productosmarcassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosMarcas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosMarcasConstantesFunciones.generarExcelReporteDataProductosMarcas("NORMAL",row,workbook,productosmarcas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosMarcasConstantesFunciones.getProductosMarcasDescripcion(productosmarcas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosMarcas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosMarcas() throws Exception {		
		this.startProcessProductosMarcas(true);
	}
	
	public void startProcessProductosMarcas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosMarcas ,this.jPanelParametrosReportesProductosMarcas, this.jScrollPanelDatosProductosMarcas,this.jPanelPaginacionProductosMarcas, this.jScrollPanelDatosEdicionProductosMarcas, this.jPanelAccionesProductosMarcas,this.jPanelAccionesFormularioProductosMarcas,this.jmenuBarProductosMarcas,this.jmenuBarDetalleProductosMarcas,this.jTtoolBarProductosMarcas,this.jTtoolBarDetalleProductosMarcas);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosMarcas=this.jTabbedPaneBusquedasProductosMarcas; 
		
		final JPanel jPanelParametrosReportesProductosMarcas=this.jPanelParametrosReportesProductosMarcas;
		//final JScrollPane jScrollPanelDatosProductosMarcas=this.jScrollPanelDatosProductosMarcas;
		final JTable jTableDatosProductosMarcas=this.jTableDatosProductosMarcas;		
		final JPanel jPanelPaginacionProductosMarcas=this.jPanelPaginacionProductosMarcas;
		//final JScrollPane jScrollPanelDatosEdicionProductosMarcas=this.jScrollPanelDatosEdicionProductosMarcas;
		final JPanel jPanelAccionesProductosMarcas=this.jPanelAccionesProductosMarcas;
		
		JPanel jPanelCamposAuxiliarProductosMarcas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosMarcas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			jPanelCamposAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jPanelCamposProductosMarcas;
			jPanelAccionesFormularioAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jPanelAccionesFormularioProductosMarcas;
		}
		
		final JPanel jPanelCamposProductosMarcas=jPanelCamposAuxiliarProductosMarcas;
		final JPanel jPanelAccionesFormularioProductosMarcas=jPanelAccionesFormularioAuxiliarProductosMarcas;
		
		
		final JMenuBar jmenuBarProductosMarcas=this.jmenuBarProductosMarcas;
		final JToolBar jTtoolBarProductosMarcas=this.jTtoolBarProductosMarcas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosMarcas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosMarcas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			jmenuBarDetalleAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jmenuBarDetalleProductosMarcas;
			jTtoolBarDetalleAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jTtoolBarDetalleProductosMarcas;
		}
		
		final JMenuBar jmenuBarDetalleProductosMarcas=jmenuBarDetalleAuxiliarProductosMarcas;
		final JToolBar jTtoolBarDetalleProductosMarcas=jTtoolBarDetalleAuxiliarProductosMarcas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosMarcas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosMarcas;
			processRunnable.jTableDatos=jTableDatosProductosMarcas;
			processRunnable.jPanelCampos=jPanelCamposProductosMarcas;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosMarcas;
			processRunnable.jPanelAcciones=jPanelAccionesProductosMarcas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosMarcas;
			
			
			processRunnable.jmenuBar=jmenuBarProductosMarcas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosMarcas;
			processRunnable.jTtoolBar=jTtoolBarProductosMarcas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosMarcas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosMarcas ,jPanelParametrosReportesProductosMarcas,jTableDatosProductosMarcas, /*jScrollPanelDatosProductosMarcas,*/jPanelCamposProductosMarcas,jPanelPaginacionProductosMarcas, /*jScrollPanelDatosEdicionProductosMarcas,*/ jPanelAccionesProductosMarcas,jPanelAccionesFormularioProductosMarcas,jmenuBarProductosMarcas,jmenuBarDetalleProductosMarcas,jTtoolBarProductosMarcas,jTtoolBarDetalleProductosMarcas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosMarcas ,jPanelParametrosReportesProductosMarcas, jScrollPanelDatosProductosMarcas,jPanelPaginacionProductosMarcas, jScrollPanelDatosEdicionProductosMarcas, jPanelAccionesProductosMarcas,jPanelAccionesFormularioProductosMarcas,jmenuBarProductosMarcas,jmenuBarDetalleProductosMarcas,jTtoolBarProductosMarcas,jTtoolBarDetalleProductosMarcas);
						
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
	
	public void finishProcessProductosMarcas() {// throws Exception 
		this.finishProcessProductosMarcas(true);
	}
	
	public void finishProcessProductosMarcas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosMarcas ,this.jPanelParametrosReportesProductosMarcas, this.jScrollPanelDatosProductosMarcas,this.jPanelPaginacionProductosMarcas, this.jScrollPanelDatosEdicionProductosMarcas, this.jPanelAccionesProductosMarcas,this.jPanelAccionesFormularioProductosMarcas,this.jmenuBarProductosMarcas,this.jmenuBarDetalleProductosMarcas,this.jTtoolBarProductosMarcas,this.jTtoolBarDetalleProductosMarcas);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosMarcas=this.jTabbedPaneBusquedasProductosMarcas; 
		
		final JPanel jPanelParametrosReportesProductosMarcas=this.jPanelParametrosReportesProductosMarcas;
		//final JScrollPane jScrollPanelDatosProductosMarcas=this.jScrollPanelDatosProductosMarcas;
		final JTable jTableDatosProductosMarcas=this.jTableDatosProductosMarcas;		
		final JPanel jPanelPaginacionProductosMarcas=this.jPanelPaginacionProductosMarcas;
		//final JScrollPane jScrollPanelDatosEdicionProductosMarcas=this.jScrollPanelDatosEdicionProductosMarcas;
		final JPanel jPanelAccionesProductosMarcas=this.jPanelAccionesProductosMarcas;
		
		JPanel jPanelCamposAuxiliarProductosMarcas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosMarcas=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			jPanelCamposAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jPanelCamposProductosMarcas;
			jPanelAccionesFormularioAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jPanelAccionesFormularioProductosMarcas;
		}
		
		final JPanel jPanelCamposProductosMarcas=jPanelCamposAuxiliarProductosMarcas;
		final JPanel jPanelAccionesFormularioProductosMarcas=jPanelAccionesFormularioAuxiliarProductosMarcas;
		
		
		final JMenuBar jmenuBarProductosMarcas=this.jmenuBarProductosMarcas;		
		final JToolBar jTtoolBarProductosMarcas=this.jTtoolBarProductosMarcas;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosMarcas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosMarcas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			jmenuBarDetalleAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jmenuBarDetalleProductosMarcas;
			jTtoolBarDetalleAuxiliarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jTtoolBarDetalleProductosMarcas;		
		}
		
		final JMenuBar jmenuBarDetalleProductosMarcas=jmenuBarDetalleAuxiliarProductosMarcas;
		final JToolBar jTtoolBarDetalleProductosMarcas=jTtoolBarDetalleAuxiliarProductosMarcas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosMarcas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosMarcas;
			processRunnable.jTableDatos=jTableDatosProductosMarcas;
			processRunnable.jPanelCampos=jPanelCamposProductosMarcas;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosMarcas;
			processRunnable.jPanelAcciones=jPanelAccionesProductosMarcas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosMarcas;
			
			
			processRunnable.jmenuBar=jmenuBarProductosMarcas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosMarcas;
			processRunnable.jTtoolBar=jTtoolBarProductosMarcas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosMarcas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosMarcas ,jPanelParametrosReportesProductosMarcas, jTableDatosProductosMarcas,/*jScrollPanelDatosProductosMarcas,*/jPanelCamposProductosMarcas,jPanelPaginacionProductosMarcas, /*jScrollPanelDatosEdicionProductosMarcas,*/ jPanelAccionesProductosMarcas,jPanelAccionesFormularioProductosMarcas,jmenuBarProductosMarcas,jmenuBarDetalleProductosMarcas,jTtoolBarProductosMarcas,jTtoolBarDetalleProductosMarcas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosMarcas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosMarcas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosMarcas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosMarcas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosMarcas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosMarcas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosMarcas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosMarcas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosMarcas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosmarcasConstantesFunciones.getsFinalQueryProductosMarcas();
		String  finalQueryPaginacionTodos=this.productosmarcasConstantesFunciones.getsFinalQueryProductosMarcas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosMarcasConstantesFunciones.getArrayColumnasGlobalesNoProductosMarcas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosMarcasConstantesFunciones.getArrayColumnasGlobalesProductosMarcas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosMarcasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productosmarcassEliminados= new ArrayList<ProductosMarcas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosMarcas();
		
				///*ProductosMarcasSessionBean*/this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
			
			if(this.productosmarcasSessionBean==null) {
				this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
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
					this.iNumeroPaginacion=ProductosMarcasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosMarcasConstantesFunciones.getClassesForeignKeysOfProductosMarcas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productosmarcas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productosmarcassAux= new ArrayList<ProductosMarcas>();
			
				
			productosmarcasLogic.setDatosCliente(this.datosCliente);
			productosmarcasLogic.setDatosDeep(this.datosDeep);
			productosmarcasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosMarcas")) {
				this.sDetalleReporte=ProductosMarcasConstantesFunciones.getDetalleIndiceBusquedaProductosMarcas(id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosmarcasLogic.getProductosMarcassBusquedaProductosMarcas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosMarcasConstantesFunciones.getDetalleIndiceBusquedaProductosMarcas(id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosMarcasConstantesFunciones.getDetalleIndiceBusquedaProductosMarcas(id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosmarcasLogic.getProductosMarcass()==null||productosmarcasLogic.getProductosMarcass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productosmarcass==null|| productosmarcass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productosmarcassAux=new ArrayList<ProductosMarcas>();
						productosmarcassAux.addAll(productosmarcasLogic.getProductosMarcass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosmarcassAux=new ArrayList<ProductosMarcas>();
							productosmarcassAux.addAll(productosmarcass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosmarcasLogic.getProductosMarcassBusquedaProductosMarcas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosMarcasConstantesFunciones.getDetalleIndiceBusquedaProductosMarcas(id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosMarcasConstantesFunciones.getDetalleIndiceBusquedaProductosMarcas(id_productoBusquedaProductosMarcas,fecha_emision_desdeBusquedaProductosMarcas,fecha_emision_hastaBusquedaProductosMarcas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosMarcass("BusquedaProductosMarcas",productosmarcasLogic.getProductosMarcass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosMarcass("BusquedaProductosMarcas",productosmarcass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosmarcasLogic.setProductosMarcass(new ArrayList<ProductosMarcas>());
						productosmarcasLogic.getProductosMarcass().addAll(productosmarcassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosmarcass=new ArrayList<ProductosMarcas>();
							productosmarcass.addAll(productosmarcassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosMarcas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosMarcas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosmarcasLogic.getProductosMarcass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosmarcass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosmarcasLogic.getProductosMarcass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosmarcass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosMarcas productosmarcas) {
		Boolean permite=true;
		
		if(this.productosmarcas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosMarcasConstantesFunciones.getOrderByListaProductosMarcas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosMarcasConstantesFunciones.getOrderByListaProductosMarcas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosMarcas productosmarcas:productosmarcasLogic.getProductosMarcass()) {
				if(productosmarcas.getsType().equals(Constantes2.S_TOTALES)) {
					productosmarcasTotales=productosmarcas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosMarcas productosmarcas:this.productosmarcass) {
				if(productosmarcas.getsType().equals(Constantes2.S_TOTALES)) {
					productosmarcasTotales=productosmarcas;
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
			this.productosmarcasAux=new ProductosMarcas();
			this.productosmarcasAux.setsType(Constantes2.S_TOTALES);
			this.productosmarcasAux.setIsNew(false);
			this.productosmarcasAux.setIsChanged(false);
			this.productosmarcasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosMarcasConstantesFunciones.TotalizarValoresFilaProductosMarcas(this.productosmarcasLogic.getProductosMarcass(),this.productosmarcasAux);
				
				//this.productosmarcasLogic.getProductosMarcass().add(this.productosmarcasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosMarcasConstantesFunciones.TotalizarValoresFilaProductosMarcas(this.productosmarcass,this.productosmarcasAux);
				
				this.productosmarcass.add(this.productosmarcasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosmarcasTotales=new ProductosMarcas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosmarcasLogic.getProductosMarcass().remove(productosmarcasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosmarcass.remove(productosmarcasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosmarcasTotales=new ProductosMarcas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosMarcas productosmarcas:productosmarcasLogic.getProductosMarcass()) {
				if(productosmarcas.getsType().equals(Constantes2.S_TOTALES)) {
					productosmarcasTotales=productosmarcas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosMarcasConstantesFunciones.TotalizarValoresFilaProductosMarcas(this.productosmarcasLogic.getProductosMarcass(),productosmarcasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosMarcas productosmarcas:this.productosmarcass) {
				if(productosmarcas.getsType().equals(Constantes2.S_TOTALES)) {
					productosmarcasTotales=productosmarcas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosMarcasConstantesFunciones.TotalizarValoresFilaProductosMarcas(this.productosmarcass,productosmarcasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosMarcassBusquedaProductosMarcas()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosMarcas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosMarcassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosMarcassFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosMarcassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosMarcassBusquedaProductosMarcas(String sFinalQuery,Long id_producto,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosmarcasLogic.getProductosMarcassBusquedaProductosMarcas(sFinalQuery,this.pagination,id_producto,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosMarcassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosmarcasLogic.getProductosMarcassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosMarcassFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosmarcasLogic.getProductosMarcassFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosMarcassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosmarcasLogic.getProductosMarcassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductosMarcas() {
		this.isPermisoTodoProductosMarcas=false;
		this.isPermisoNuevoProductosMarcas=false;
		this.isPermisoActualizarProductosMarcas=false;
		this.isPermisoActualizarOriginalProductosMarcas=false;
		this.isPermisoEliminarProductosMarcas=false;
		this.isPermisoGuardarCambiosProductosMarcas=false;
		this.isPermisoConsultaProductosMarcas=true;
		this.isPermisoBusquedaProductosMarcas=true;
		this.isPermisoReporteProductosMarcas=true;
		this.isPermisoOrdenProductosMarcas=false;		
		this.isPermisoPaginacionMedioProductosMarcas=false;		
		this.isPermisoPaginacionAltoProductosMarcas=false;		
		this.isPermisoPaginacionTodoProductosMarcas=false;		
		this.isPermisoCopiarProductosMarcas=false;		
		this.isPermisoVerFormProductosMarcas=false;		
		this.isPermisoDuplicarProductosMarcas=false;
		this.isPermisoOrdenProductosMarcas=false;
	}
	
	public void setPermisosUsuarioProductosMarcas(Boolean isPermiso) {
		this.isPermisoTodoProductosMarcas=isPermiso;
		this.isPermisoNuevoProductosMarcas=isPermiso;
		this.isPermisoActualizarProductosMarcas=isPermiso;
		this.isPermisoActualizarOriginalProductosMarcas=isPermiso;
		this.isPermisoEliminarProductosMarcas=isPermiso;
		this.isPermisoGuardarCambiosProductosMarcas=isPermiso;
		this.isPermisoConsultaProductosMarcas=isPermiso;
		this.isPermisoBusquedaProductosMarcas=isPermiso;
		this.isPermisoReporteProductosMarcas=isPermiso;
		this.isPermisoOrdenProductosMarcas=isPermiso;		
		this.isPermisoPaginacionMedioProductosMarcas=isPermiso;		
		this.isPermisoPaginacionAltoProductosMarcas=isPermiso;		
		this.isPermisoPaginacionTodoProductosMarcas=isPermiso;		
		this.isPermisoCopiarProductosMarcas=isPermiso;		
		this.isPermisoVerFormProductosMarcas=isPermiso;		
		this.isPermisoDuplicarProductosMarcas=isPermiso;
		this.isPermisoOrdenProductosMarcas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosMarcas(Boolean isPermiso) {
		//this.isPermisoTodoProductosMarcas=isPermiso;
		this.isPermisoNuevoProductosMarcas=isPermiso;
		this.isPermisoActualizarProductosMarcas=isPermiso;
		this.isPermisoActualizarOriginalProductosMarcas=isPermiso;
		this.isPermisoEliminarProductosMarcas=isPermiso;
		this.isPermisoGuardarCambiosProductosMarcas=isPermiso;
		//this.isPermisoConsultaProductosMarcas=isPermiso;
		//this.isPermisoBusquedaProductosMarcas=isPermiso;
		//this.isPermisoReporteProductosMarcas=isPermiso;
		//this.isPermisoOrdenProductosMarcas=isPermiso;		
		//this.isPermisoPaginacionMedioProductosMarcas=isPermiso;		
		//this.isPermisoPaginacionAltoProductosMarcas=isPermiso;		
		//this.isPermisoPaginacionTodoProductosMarcas=isPermiso;		
		//this.isPermisoCopiarProductosMarcas=isPermiso;		
		//this.isPermisoDuplicarProductosMarcas=isPermiso;
		//this.isPermisoOrdenProductosMarcas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosMarcasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosMarcasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosMarcas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosMarcasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosMarcasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosMarcasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosMarcasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosMarcas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosMarcasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosMarcasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosMarcas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosMarcas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosMarcas=this.isPermisoActualizarProductosMarcas;
			this.isPermisoEliminarProductosMarcas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosMarcas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosMarcas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosMarcas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosMarcas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosMarcas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosMarcas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosMarcas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosMarcas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosMarcas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosMarcas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosMarcas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosMarcas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosMarcas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosMarcas.setToolTipText(this.jTableDatosProductosMarcas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosMarcas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosMarcas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosMarcasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosMarcasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosMarcas() throws Exception {
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
	public void inicializarCombosForeignKeyProductosMarcasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosMarcasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosMarcasJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosMarcas()throws Exception {
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
			if(this.productosmarcasSessionBean==null) {
				this.productosmarcasSessionBean=new ProductosMarcasSessionBean();
			}

			if(!this.productosmarcasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosmarcasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productosmarcasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyProductosMarcas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosMarcas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosMarcas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosMarcas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosMarcas(ProductosMarcas productosmarcas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosMarcas(ProductosMarcas productosmarcas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosMarcas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosMarcas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosMarcas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosMarcas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosMarcas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosMarcas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductosMarcas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductosMarcas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductosMarcasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosMarcasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosMarcasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosmarcasSessionBean=new ProductosMarcasSessionBean(); 
		this.productosmarcasConstantesFunciones=new ProductosMarcasConstantesFunciones(); 
		this.productosmarcasBean=new ProductosMarcas();//(this.productosmarcasConstantesFunciones); 		
		this.productosmarcasReturnGeneral=new ProductosMarcasParameterReturnGeneral(); 
		
		this.productosmarcasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosmarcasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosMarcasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosMarcasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosMarcasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosMarcas(true);
			
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
			
			this.productosmarcasConstantesFunciones=new ProductosMarcasConstantesFunciones(); 
			this.productosmarcasBean=new ProductosMarcas();//this.productosmarcasConstantesFunciones); 			
			this.productosmarcasReturnGeneral=new ProductosMarcasParameterReturnGeneral(); 
		
			ProductosMarcasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Marcas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productosmarcas=new ProductosMarcas();
			this.productosmarcass = new ArrayList<ProductosMarcas>();
			this.productosmarcassAux = new ArrayList<ProductosMarcas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic=new ProductosMarcasLogic();
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			//this.productosmarcasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosmarcasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosMarcas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosMarcas);	
					}
					
					if(this.jInternalFrameImportacionProductosMarcas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosMarcas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosMarcas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosMarcas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosMarcas);
				this.jInternalFrameDetalleFormProductosMarcas.setVisible(false);
				this.jInternalFrameDetalleFormProductosMarcas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosMarcas);
					this.jInternalFrameReporteDinamicoProductosMarcas.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosMarcas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosMarcas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosMarcas);
					this.jInternalFrameImportacionProductosMarcas.setVisible(false);
					this.jInternalFrameImportacionProductosMarcas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosMarcas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosMarcas);
					this.jInternalFrameOrderByProductosMarcas.setVisible(false);
					this.jInternalFrameOrderByProductosMarcas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosMarcasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosMarcasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosmarcasReturnGeneral=new ProductosMarcasParameterReturnGeneral();
			
			this.productosmarcasParameterGeneral=new ProductosMarcasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosmarcasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosMarcasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosMarcasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosmarcasSessionBean.getEsGuardarRelacionado(),this.productosmarcasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosMarcasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosmarcasSessionBean.getEsGuardarRelacionado(),this.productosmarcasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaDuplicarProductosMarcas=true;
			this.isVisibilidadCeldaCopiarProductosMarcas=true;
			this.isVisibilidadCeldaVerFormProductosMarcas=true;
			this.isVisibilidadCeldaOrdenProductosMarcas=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
			this.isVisibilidadCeldaModificarProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=false;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=false;
			this.isVisibilidadCeldaGuardarProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
			
			
			this.isVisibilidadBusquedaProductosMarcas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductosMarcas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosMarcas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosMarcas(false);
			
			this.setPermisosUsuarioProductosMarcas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosmarcasSessionBean.getEsGuardarRelacionado() 
				|| (this.productosmarcasSessionBean.getEsGuardarRelacionado() && this.productosmarcasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosMarcasClasesRelacionadas();
			}
			
			if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosMarcasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosMarcas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosMarcas();
			}
			
			if(!this.isPermisoBusquedaProductosMarcas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosMarcasConstantesFunciones.getTiposSeleccionarProductosMarcas());
				
				this.tiposColumnasSelect=ProductosMarcasConstantesFunciones.getTiposSeleccionarProductosMarcas(true);
				
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
			//if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosMarcas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProductosMarcas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProductosMarcas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosMarcas() ;
			
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
				productosmarcasImplementable= (ProductosMarcasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosMarcasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosmarcasImplementableHome= (ProductosMarcasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosMarcasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productosmarcass= new ArrayList<ProductosMarcas>();
			this.productosmarcassEliminados= new ArrayList<ProductosMarcas>();
						
			this.isEsNuevoProductosMarcas=false;
			this.esParaAccionDesdeFormularioProductosMarcas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductosMarcas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosMarcas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosMarcasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosMarcasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosMarcas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosMarcas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosMarcas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosMarcas();
			}
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosMarcas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosMarcas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosMarcas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosMarcas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosMarcas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosMarcas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosMarcas")) {
				iIndex=this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosMarcas();	
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
	
	public void cargarCombosForeignKeyProductosMarcas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosMarcas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosMarcas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosMarcasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosMarcas();
		
		this.cargarCombosFrameForeignKeyProductosMarcas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosMarcas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosMarcas();
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
	
	public void jButtonNuevoProductosMarcasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			
			if(jTableDatosProductosMarcas.getRowCount()>=1) {
				jTableDatosProductosMarcas.removeRowSelectionInterval(0, jTableDatosProductosMarcas.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosMarcas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosMarcas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosMarcas(true);			
			//this.productosmarcas=new ProductosMarcas();
			//this.productosmarcas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosMarcas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosMarcas() ;
			
			if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosMarcas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productosmarcas);	
			this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);				
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosMarcas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosMarcasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosMarcas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosMarcas.getSelectedRows().length;			
			}
			
			productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosMarcas--;			
				//ProductosMarcas productosmarcasAux= new ProductosMarcas();			
				//productosmarcasAux.setId(this.iIdNuevoProductosMarcas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosMarcas productosmarcasOrigen=new ProductosMarcas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosMarcas productosmarcasOrigen : productosmarcassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosmarcasOrigen =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosmarcasOrigen =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosMarcas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productosmarcas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosMarcas(productosmarcasOrigen,this.productosmarcas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosmarcasLogic.getProductosMarcass().add(this.productosmarcasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosmarcass.add(this.productosmarcasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosMarcas(false);
				
				this.jTableDatosProductosMarcas.setRowSelectionInterval(this.getIndiceNuevoProductosMarcas(), this.getIndiceNuevoProductosMarcas());
				
				int iLastRow =  this.jTableDatosProductosMarcas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosMarcas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosMarcas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosMarcas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();									
		
			ProductosMarcas productosmarcasOrigen=new ProductosMarcas();
			ProductosMarcas productosmarcasDestino=new ProductosMarcas();
				
			productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosMarcas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productosmarcassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosMarcas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosmarcasOrigen =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosmarcasOrigen =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosmarcasDestino =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosmarcasDestino =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosmarcasOrigen =productosmarcassSeleccionados.get(0);
				productosmarcasDestino =productosmarcassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosMarcas(productosmarcasOrigen,productosmarcasDestino,true,false);
				
				productosmarcasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosmarcasDestino,productosmarcasLogic.getProductosMarcass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosmarcasDestino,productosmarcass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosMarcas(false);
				
				//this.jTableDatosProductosMarcas.setRowSelectionInterval(this.getIndiceNuevoProductosMarcas(), this.getIndiceNuevoProductosMarcas());
				
				int iLastRow =  this.jTableDatosProductosMarcas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosMarcas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosMarcas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosMarcas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosMarcas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosMarcas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosMarcas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosMarcas.setVisible(!isVisible);
			this.jPanelPaginacionProductosMarcas.setVisible(!isVisible);
			this.jPanelAccionesProductosMarcas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosMarcas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosMarcas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosMarcas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosMarcas();
			
			this.abrirFrameOrderByProductosMarcas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosMarcas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosMarcas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosMarcas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosMarcas.isMaximum()) {
					this.jInternalFrameDetalleFormProductosMarcas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosMarcas.setSize(this.jInternalFrameDetalleFormProductosMarcas.iWidthFormulario,this.jInternalFrameDetalleFormProductosMarcas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosMarcas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosMarcas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosMarcas.isMaximum()) {
						this.jInternalFrameDetalleFormProductosMarcas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosMarcas.jContentPaneDetalleProductosMarcas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosMarcas.jContentPaneDetalleProductosMarcas.getWidth(),ProductosMarcasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosMarcas.jContentPaneDetalleProductosMarcas.getWidth(),ProductosMarcasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosMarcas.jContentPaneDetalleProductosMarcas.getWidth(),ProductosMarcasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosMarcas.setVisible(true);
	        this.jInternalFrameDetalleFormProductosMarcas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosMarcas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosMarcas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosMarcas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosMarcas,false,this);
				} else {
					this.jInternalFrameOrderByProductosMarcas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosMarcas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosMarcas);
				this.jInternalFrameOrderByProductosMarcas.setVisible(false);
				this.jInternalFrameOrderByProductosMarcas.setSelected(false);
				
				this.jInternalFrameOrderByProductosMarcas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosMarcas"));
				
				this.inicializarActualizarBindingTablaOrderByProductosMarcas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosMarcas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosMarcas==null) {
				
				this.jInternalFrameImportacionProductosMarcas=new ImportacionJInternalFrame(ProductosMarcasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosMarcas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosMarcas);
				this.jInternalFrameImportacionProductosMarcas.setVisible(false);
				this.jInternalFrameImportacionProductosMarcas.setSelected(false);


				this.jInternalFrameImportacionProductosMarcas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosMarcas"));
				this.jInternalFrameImportacionProductosMarcas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosMarcas"));
				this.jInternalFrameImportacionProductosMarcas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosMarcas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosMarcas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosMarcas==null) {
				this.jInternalFrameReporteDinamicoProductosMarcas=new ReporteDinamicoJInternalFrame(ProductosMarcasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosMarcas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosMarcas);
				this.jInternalFrameReporteDinamicoProductosMarcas.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosMarcas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosMarcas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosMarcas"));
				this.jInternalFrameReporteDinamicoProductosMarcas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosMarcas"));
				this.jInternalFrameReporteDinamicoProductosMarcas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosMarcas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosMarcas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosMarcas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosMarcas);
			
	       	this.jInternalFrameDetalleFormProductosMarcas.setVisible(false);
	        this.jInternalFrameDetalleFormProductosMarcas.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosMarcas.dispose();
			//this.jInternalFrameDetalleFormProductosMarcas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosMarcas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosMarcas.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosMarcas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosMarcas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosMarcas.setVisible(true);
	        this.jInternalFrameImportacionProductosMarcas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosMarcas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosMarcas.setVisible(true);
	        this.jInternalFrameOrderByProductosMarcas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosMarcas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosMarcas.setVisible(false);
	        this.jInternalFrameOrderByProductosMarcas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosMarcas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosMarcas.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosMarcas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosMarcas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosMarcas.setVisible(false);
	        this.jInternalFrameImportacionProductosMarcas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosMarcas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosMarcas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosMarcas(true);
			//this.isEsNuevoProductosMarcas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosMarcas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosMarcas(false) ;
			
			if(productosmarcasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosMarcas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosMarcas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosMarcasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosMarcas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosMarcas(true);
			//this.isEsNuevoProductosMarcas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productosmarcas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosMarcas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosMarcas(false) ;
			
			if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosMarcas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosMarcas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosMarcas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosMarcas(false);
			
			//if(!this.isEsNuevoProductosMarcas) {								
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				
			}
			
			if(this.permiteMantenimiento(this.productosmarcas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosMarcas=true;
					this.inicializarActualizarBindingTablaProductosMarcas(false);
					this.isEsNuevoProductosMarcas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosMarcas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosMarcas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosMarcas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosMarcas(false);
				
				this.habilitarDeshabilitarControlesProductosMarcas(false);
			
												
				
				if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosMarcas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosMarcasActionPerformed(evt,productosmarcasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosMarcas(this.productosmarcas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosMarcas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosmarcasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productosmarcas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				this.productosmarcas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				this.productosmarcas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productosmarcas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosMarcasModel) this.jTableDatosProductosMarcas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosMarcas=true;
				this.inicializarActualizarBindingTablaProductosMarcas(false);
				this.isEsNuevoProductosMarcas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosMarcas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosMarcas(false);
				
				this.habilitarDeshabilitarControlesProductosMarcas(false);
				
				
				
				if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosMarcas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosMarcasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosMarcas.getRowCount()>=1) {
				jTableDatosProductosMarcas.removeRowSelectionInterval(0, jTableDatosProductosMarcas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosMarcas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosMarcas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosMarcas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosMarcas(false) ;
			
			this.isEsNuevoProductosMarcas=false;
			
			if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosMarcas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosMarcas(false);
				
				//SI ES MANUAL
				if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosMarcas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosMarcas--;			
			//ProductosMarcas productosmarcasAux= new ProductosMarcas();			
			//productosmarcasAux.setId(this.iIdNuevoProductosMarcas);
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosMarcas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
			
			this.productosmarcas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosmarcasLogic.getProductosMarcass().add(this.productosmarcasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productosmarcass.add(this.productosmarcasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosMarcas(false);
			
			this.jTableDatosProductosMarcas.setRowSelectionInterval(this.getIndiceNuevoProductosMarcas(), this.getIndiceNuevoProductosMarcas());
			
			int iLastRow =  this.jTableDatosProductosMarcas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosMarcas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosMarcas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosMarcas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosMarcas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosMarcas(false);
			
			//SI ES MANUAL
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosMarcas();
			}
			
			//this.abrirFrameTreeProductosMarcas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosMarcas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosMarcas.setFileImportacion(this.jInternalFrameImportacionProductosMarcas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosMarcas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosMarcas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosMarcas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosMarcas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		

		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosMarcasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosMarcasBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosMarcasConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductosMarcas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ProductosMarcasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ProductosMarcasConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosMarcasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosMarcass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosMarcasConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(ProductosMarcas productosmarcas:productosmarcassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosmarcas.gettipo());
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
			//	this.getFilaCabeceraExportarExcelProductosMarcas(row);				
			//	iRow++;
			//}				
			
			//for(ProductosMarcas productosmarcasAux:productosmarcassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosMarcas(productosmarcasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosMarcas(false);
			
			//SI ES MANUAL
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosMarcas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosMarcas(false);
			
			//SI ES MANUAL
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosMarcas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosMarcasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosMarcas(false);
			
			//SI ES MANUAL
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosMarcas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosMarcas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosMarcas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosMarcas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosMarcas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosMarcas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosMarcas.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosMarcas.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosMarcas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosMarcas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosMarcas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosMarcas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosMarcas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosMarcas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosMarcas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosMarcas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosMarcas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosMarcas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosMarcas();
		
		this.inicializarActualizarBindingBotonesManualProductosMarcas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosMarcas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosMarcas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosMarcas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosMarcas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosMarcas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosMarcas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosMarcas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosMarcas.jCheckBoxPostAccionNuevoProductosMarcas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosMarcas.jCheckBoxPostAccionSinCerrarProductosMarcas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosMarcas.jCheckBoxPostAccionSinMensajeProductosMarcas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosMarcas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosMarcas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosMarcas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
				this.jInternalFrameDetalleFormProductosMarcas.jCheckBoxPostAccionNuevoProductosMarcas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosMarcas.jCheckBoxPostAccionSinCerrarProductosMarcas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosMarcas.jCheckBoxPostAccionSinMensajeProductosMarcas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosMarcas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosMarcas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosMarcas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosMarcas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosMarcas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosMarcas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosMarcas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosMarcas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosMarcas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosMarcas(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosMarcas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosMarcas() throws Exception {
		try	{
			if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosMarcas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosMarcas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosMarcas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosMarcas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosMarcas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosMarcas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosMarcas.addItem(reporte);
			}
			
			
			if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosMarcas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosMarcas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosMarcas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosMarcas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosMarcas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosMarcas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosMarcas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosMarcas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosMarcas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
				this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
				this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosMarcas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosMarcas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductosMarcasConstantesFunciones.getTiposSeleccionarProductosMarcas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductosMarcasConstantesFunciones.getTiposSeleccionarProductosMarcas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductosMarcasConstantesFunciones.getTiposSeleccionarProductosMarcas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosMarcas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductosMarcas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosMarcas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.getSelectedItem()!=null){this.id_productoBusquedaProductosMarcas=((Producto)this.jComboBoxid_productoBusquedaProductosMarcasProductosMarcas.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaProductosMarcas=new Date(this.jDateChooserfecha_emision_desdeBusquedaProductosMarcasProductosMarcas.getDate().getTime());
		this.fecha_emision_hastaBusquedaProductosMarcas=new Date(this.jDateChooserfecha_emision_hastaBusquedaProductosMarcasProductosMarcas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosMarcas(Boolean esInicializar) throws Exception {				
		if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosMarcas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosMarcas() throws Exception {
		this.inicializarActualizarBindingTablaProductosMarcas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosMarcas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosMarcasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosMarcas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosmarcasLogic.getProductosMarcass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productosmarcass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosMarcas.setModel(new ProductosMarcasModel(this.productosmarcasLogic.getProductosMarcass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosMarcas.setModel(new ProductosMarcasModel(this.productosmarcass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosMarcas!=null && this.jInternalFrameOrderByProductosMarcas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosMarcas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO,productosmarcasConstantesFunciones.resaltarSeleccionarProductosMarcas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosMarcasConstantesFunciones.SCLASSWEBTITULO,productosmarcasConstantesFunciones.resaltarSeleccionarProductosMarcas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_ID));

		if(this.productosmarcasConstantesFunciones.mostraridProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosmarcasConstantesFunciones.resaltaridProductosMarcas,this.productosmarcasConstantesFunciones.activaridProductosMarcas,iSizeTabla,this,true,"idProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltaridProductosMarcas,this.productosmarcasConstantesFunciones.activaridProductosMarcas,this,true,"idProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.productosmarcasConstantesFunciones.mostrarnombre_unidadProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_unidadProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_unidadProductosMarcas,iSizeTabla,this,true,"nombre_unidadProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_unidadProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_unidadProductosMarcas,this,true,"nombre_unidadProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.productosmarcasConstantesFunciones.mostrarnombre_productoProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_productoProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_productoProductosMarcas,iSizeTabla,this,true,"nombre_productoProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_productoProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_productoProductosMarcas,this,true,"nombre_productoProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.productosmarcasConstantesFunciones.mostrarnombre_lineaProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_lineaProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_lineaProductosMarcas,iSizeTabla,this,true,"nombre_lineaProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_lineaProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_lineaProductosMarcas,this,true,"nombre_lineaProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.productosmarcasConstantesFunciones.mostrarnombre_linea_grupoProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_linea_grupoProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_linea_grupoProductosMarcas,iSizeTabla,this,true,"nombre_linea_grupoProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_linea_grupoProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_linea_grupoProductosMarcas,this,true,"nombre_linea_grupoProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.productosmarcasConstantesFunciones.mostrarnombre_linea_categoriaProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_linea_categoriaProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_linea_categoriaProductosMarcas,iSizeTabla,this,true,"nombre_linea_categoriaProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_linea_categoriaProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_linea_categoriaProductosMarcas,this,true,"nombre_linea_categoriaProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.productosmarcasConstantesFunciones.mostrarnombre_linea_marcaProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_linea_marcaProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_linea_marcaProductosMarcas,iSizeTabla,this,true,"nombre_linea_marcaProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarnombre_linea_marcaProductosMarcas,this.productosmarcasConstantesFunciones.activarnombre_linea_marcaProductosMarcas,this,true,"nombre_linea_marcaProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_CANTIDAD));

		if(this.productosmarcasConstantesFunciones.mostrarcantidadProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosmarcasConstantesFunciones.resaltarcantidadProductosMarcas,this.productosmarcasConstantesFunciones.activarcantidadProductosMarcas,iSizeTabla,this,true,"cantidadProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarcantidadProductosMarcas,this.productosmarcasConstantesFunciones.activarcantidadProductosMarcas,this,true,"cantidadProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_MONTO));

		if(this.productosmarcasConstantesFunciones.mostrarmontoProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosmarcasConstantesFunciones.resaltarmontoProductosMarcas,this.productosmarcasConstantesFunciones.activarmontoProductosMarcas,iSizeTabla,this,true,"montoProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarmontoProductosMarcas,this.productosmarcasConstantesFunciones.activarmontoProductosMarcas,this,true,"montoProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.productosmarcasConstantesFunciones.mostrarcodigo_productoProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltarcodigo_productoProductosMarcas,this.productosmarcasConstantesFunciones.activarcodigo_productoProductosMarcas,iSizeTabla,this,true,"codigo_productoProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltarcodigo_productoProductosMarcas,this.productosmarcasConstantesFunciones.activarcodigo_productoProductosMarcas,this,true,"codigo_productoProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,ProductosMarcasConstantesFunciones.LABEL_TIPO));

		if(this.productosmarcasConstantesFunciones.mostrartipoProductosMarcas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosMarcasConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosmarcasConstantesFunciones.resaltartipoProductosMarcas,this.productosmarcasConstantesFunciones.activartipoProductosMarcas,iSizeTabla,this,true,"tipoProductosMarcas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosmarcasConstantesFunciones.resaltartipoProductosMarcas,this.productosmarcasConstantesFunciones.activartipoProductosMarcas,this,true,"tipoProductosMarcas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosMarcasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosmarcasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosmarcasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosMarcas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosmarcasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosmarcasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosMarcas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosmarcasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosmarcasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosMarcas.addColumn(tableColumn);
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
			
			this.jTableDatosProductosMarcas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosMarcas.moveColumn(this.jTableDatosProductosMarcas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosMarcas.moveColumn(this.jTableDatosProductosMarcas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosMarcas.moveColumn(this.jTableDatosProductosMarcas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosMarcas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosMarcas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosMarcas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosMarcas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosMarcas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosMarcas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosMarcas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosMarcas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosmarcasLogic.getProductosMarcass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productosmarcass.size()-1;
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
		//this.jTableDatosProductosMarcas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosMarcas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosMarcas();
			
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
				
				//this.isEsNuevoProductosMarcas=false;
					
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
				if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosMarcas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosMarcas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosMarcas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productosmarcas.getsType().equals("DUPLICADO")
				   || this.productosmarcas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosMarcas=true;
				
				} else {
					this.isEsNuevoProductosMarcas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
					if(this.productosmarcas.getId()>=0 && !this.productosmarcas.getIsNew()) {						
						this.isEsNuevoProductosMarcas=false;
						
					} else {
						this.isEsNuevoProductosMarcas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosMarcas(esRelaciones);						
				
				this.seleccionarProductosMarcas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productosmarcas.getId()<0) {
					this.isEsNuevoProductosMarcas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosMarcas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosMarcas(evt,rowIndex);
				}	
				
				if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosMarcas: " + this.dDif); 
					}
				}								
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosMarcas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productosmarcas)) {
					if(this.productosmarcas.getId()>0) {
						this.productosmarcas.setIsDeleted(true);
						
						this.productosmarcassEliminados.add(this.productosmarcas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosmarcasLogic.getProductosMarcass().remove(this.productosmarcas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosmarcass.remove(this.productosmarcas);				
					}
					
					
					((ProductosMarcasModel) this.jTableDatosProductosMarcas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosMarcas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosMarcas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosMarcas) {
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosMarcas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosMarcas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosMarcas(this.productosmarcas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosMarcas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosMarcas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosMarcas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosMarcas(ProductosMarcas productosmarcas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosMarcas(productosmarcas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosMarcas(ProductosMarcas productosmarcas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosMarcas(productosmarcas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosMarcas(productosmarcas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosMarcas(productosmarcas);
	}
	
	public void setVariablesObjetoActualToFormularioProductosMarcas(ProductosMarcas productosmarcas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setText(productosmarcas.getId().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setText(productosmarcas.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setText(productosmarcas.getnombre_producto());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setText(productosmarcas.getnombre_linea());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setText(productosmarcas.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setText(productosmarcas.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setText(productosmarcas.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setText(productosmarcas.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setText(productosmarcas.getmonto().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setText(productosmarcas.getcodigo_producto());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setText(productosmarcas.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosMarcas productosmarcasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosmarcasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosMarcas productosmarcasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosmarcasLocal=this.productosmarcas;
			} else {
				productosmarcasLocal=this.productosmarcasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosmarcasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosMarcas(productosmarcasLocal,true);
					
					if(productosmarcasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosmarcasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosmarcasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosMarcas(ProductosMarcas productosmarcas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosMarcas(productosmarcas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(productosmarcas);
	}
	
	public void setVariablesFormularioToObjetoActualProductosMarcas(ProductosMarcas productosmarcas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosMarcas(productosmarcas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosMarcas(ProductosMarcas productosmarcas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.getText()==null || this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.getText()=="" || this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setText("0");
			}

			if(conColumnasBase) {productosmarcas.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelIdProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setnombre_unidad(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_unidadProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setnombre_producto(this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_productoProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setnombre_linea(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_lineaProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setnombre_linea_grupo(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_grupoProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setnombre_linea_categoria(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_categoriaProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setnombre_linea_marca(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelnombre_linea_marcaProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelcantidadProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelmontoProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.setcodigo_producto(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabelcodigo_productoProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosmarcas.settipo(this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosMarcasConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosMarcas.jLabeltipoProductosMarcas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosMarcas(ProductosMarcas productosmarcasBean,ProductosMarcas productosmarcas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosMarcas(ProductosMarcas productosmarcasOrigen,ProductosMarcas productosmarcas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosmarcasOrigen.getId()!=null && !productosmarcasOrigen.getId().equals(0L))) {productosmarcas.setId(productosmarcasOrigen.getId());}}
			if(conDefault || (!conDefault && productosmarcasOrigen.getfecha_emision_desde()!=null && !productosmarcasOrigen.getfecha_emision_desde().equals(new Date()))) {productosmarcas.setfecha_emision_desde(productosmarcasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getfecha_emision_hasta()!=null && !productosmarcasOrigen.getfecha_emision_hasta().equals(new Date()))) {productosmarcas.setfecha_emision_hasta(productosmarcasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getnombre_unidad()!=null && !productosmarcasOrigen.getnombre_unidad().equals(""))) {productosmarcas.setnombre_unidad(productosmarcasOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getnombre_producto()!=null && !productosmarcasOrigen.getnombre_producto().equals(""))) {productosmarcas.setnombre_producto(productosmarcasOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getnombre_linea()!=null && !productosmarcasOrigen.getnombre_linea().equals(""))) {productosmarcas.setnombre_linea(productosmarcasOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getnombre_linea_grupo()!=null && !productosmarcasOrigen.getnombre_linea_grupo().equals(""))) {productosmarcas.setnombre_linea_grupo(productosmarcasOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getnombre_linea_categoria()!=null && !productosmarcasOrigen.getnombre_linea_categoria().equals(""))) {productosmarcas.setnombre_linea_categoria(productosmarcasOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getnombre_linea_marca()!=null && !productosmarcasOrigen.getnombre_linea_marca().equals(""))) {productosmarcas.setnombre_linea_marca(productosmarcasOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getcantidad()!=null && !productosmarcasOrigen.getcantidad().equals(0))) {productosmarcas.setcantidad(productosmarcasOrigen.getcantidad());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getmonto()!=null && !productosmarcasOrigen.getmonto().equals(0.0))) {productosmarcas.setmonto(productosmarcasOrigen.getmonto());}
			if(conDefault || (!conDefault && productosmarcasOrigen.getcodigo_producto()!=null && !productosmarcasOrigen.getcodigo_producto().equals(""))) {productosmarcas.setcodigo_producto(productosmarcasOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && productosmarcasOrigen.gettipo()!=null && !productosmarcasOrigen.gettipo().equals(""))) {productosmarcas.settipo(productosmarcasOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosMarcas(ProductosMarcas productosmarcas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setText(productosmarcas.getId().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setText(productosmarcas.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setText(productosmarcas.getnombre_producto());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setText(productosmarcas.getnombre_linea());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setText(productosmarcas.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setText(productosmarcas.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setText(productosmarcas.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setText(productosmarcas.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setText(productosmarcas.getmonto().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setText(productosmarcas.getcodigo_producto());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setText(productosmarcas.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosMarcas(ProductosMarcasBean productosmarcasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setText(productosmarcasBean.getId().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setText(productosmarcasBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setText(productosmarcasBean.getnombre_producto());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setText(productosmarcasBean.getnombre_linea());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setText(productosmarcasBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setText(productosmarcasBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setText(productosmarcasBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setText(productosmarcasBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setText(productosmarcasBean.getmonto().toString());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setText(productosmarcasBean.getcodigo_producto());
			this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setText(productosmarcasBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosMarcas(ProductosMarcasParameterReturnGeneral productosmarcasReturnGeneral,ProductosMarcasBean productosmarcasBean,Boolean conDefault) throws Exception { 
		try {
			ProductosMarcas productosmarcasLocal=new ProductosMarcas();
			
			productosmarcasLocal=productosmarcasReturnGeneral.getProductosMarcas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosmarcasLocal.getId()!=null && !productosmarcasLocal.getId().equals(0L))) {productosmarcasBean.setId(productosmarcasLocal.getId());}}
			if(conDefault || (!conDefault && productosmarcasLocal.getnombre_unidad()!=null && !productosmarcasLocal.getnombre_unidad().equals(""))) {productosmarcasBean.setnombre_unidad(productosmarcasLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && productosmarcasLocal.getnombre_producto()!=null && !productosmarcasLocal.getnombre_producto().equals(""))) {productosmarcasBean.setnombre_producto(productosmarcasLocal.getnombre_producto());}
			if(conDefault || (!conDefault && productosmarcasLocal.getnombre_linea()!=null && !productosmarcasLocal.getnombre_linea().equals(""))) {productosmarcasBean.setnombre_linea(productosmarcasLocal.getnombre_linea());}
			if(conDefault || (!conDefault && productosmarcasLocal.getnombre_linea_grupo()!=null && !productosmarcasLocal.getnombre_linea_grupo().equals(""))) {productosmarcasBean.setnombre_linea_grupo(productosmarcasLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosmarcasLocal.getnombre_linea_categoria()!=null && !productosmarcasLocal.getnombre_linea_categoria().equals(""))) {productosmarcasBean.setnombre_linea_categoria(productosmarcasLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosmarcasLocal.getnombre_linea_marca()!=null && !productosmarcasLocal.getnombre_linea_marca().equals(""))) {productosmarcasBean.setnombre_linea_marca(productosmarcasLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosmarcasLocal.getcantidad()!=null && !productosmarcasLocal.getcantidad().equals(0))) {productosmarcasBean.setcantidad(productosmarcasLocal.getcantidad());}
			if(conDefault || (!conDefault && productosmarcasLocal.getmonto()!=null && !productosmarcasLocal.getmonto().equals(0.0))) {productosmarcasBean.setmonto(productosmarcasLocal.getmonto());}
			if(conDefault || (!conDefault && productosmarcasLocal.getcodigo_producto()!=null && !productosmarcasLocal.getcodigo_producto().equals(""))) {productosmarcasBean.setcodigo_producto(productosmarcasLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && productosmarcasLocal.gettipo()!=null && !productosmarcasLocal.gettipo().equals(""))) {productosmarcasBean.settipo(productosmarcasLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosMarcasGenerico(Long idProductosMarcasSeleccionado,JComboBox jComboBoxProductosMarcas,List<ProductosMarcas> productosmarcassLocal)throws Exception {
		try {
			ProductosMarcas  productosmarcasTemp=null;

			for(ProductosMarcas productosmarcasAux:productosmarcassLocal) {
				if(productosmarcasAux.getId()!=null && productosmarcasAux.getId().equals(idProductosMarcasSeleccionado)) {
					productosmarcasTemp=productosmarcasAux;
					break;
				}
			}

			jComboBoxProductosMarcas.setSelectedItem(productosmarcasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosMarcasGenerico(JComboBox jComboBoxProductosMarcas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosMarcas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosMarcas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosMarcas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosMarcas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosMarcas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosMarcas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosmarcas=(ProductosMarcas) productosmarcasLogic.getProductosMarcass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosmarcas =(ProductosMarcas) productosmarcass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productosmarcas.getIsNew() && !productosmarcas.getIsChanged() && !productosmarcas.getIsDeleted()) {
				sDescripcion=productosmarcas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productosmarcas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productosmarcas.getIsNew() && !productosmarcas.getIsChanged() && !productosmarcas.getIsDeleted()) {
				sDescripcion=productosmarcas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productosmarcas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productosmarcas.getIsNew() && !productosmarcas.getIsChanged() && !productosmarcas.getIsDeleted()) {
				sDescripcion=productosmarcas.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productosmarcas.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosMarcas productosmarcasRow=new ProductosMarcas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosmarcasRow=(ProductosMarcas) productosmarcasLogic.getProductosMarcass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosmarcasRow=(ProductosMarcas) productosmarcass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosMarcas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoProductosMarcas && this.isPermisoNuevoProductosMarcas));			
			this.jButtonDuplicarProductosMarcas.setVisible((this.isVisibilidadCeldaDuplicarProductosMarcas && this.isPermisoDuplicarProductosMarcas));			
			this.jButtonCopiarProductosMarcas.setVisible((this.isVisibilidadCeldaCopiarProductosMarcas && this.isPermisoCopiarProductosMarcas));
			this.jButtonVerFormProductosMarcas.setVisible((this.isVisibilidadCeldaVerFormProductosMarcas && this.isPermisoVerFormProductosMarcas));
			
			this.jButtonAbrirOrderByProductosMarcas.setVisible((this.isVisibilidadCeldaOrdenProductosMarcas && this.isPermisoOrdenProductosMarcas));			
			
			this.jButtonNuevoRelacionesProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosMarcas && this.isPermisoNuevoProductosMarcas));			
			this.jButtonNuevoGuardarCambiosProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoProductosMarcas && this.isPermisoNuevoProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarProductosMarcas.setVisible((this.isVisibilidadCeldaModificarProductosMarcas && this.isPermisoActualizarProductosMarcas));	
			this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarProductosMarcas.setVisible((this.isVisibilidadCeldaActualizarProductosMarcas && this.isPermisoActualizarProductosMarcas));	
			this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarProductosMarcas.setVisible((this.isVisibilidadCeldaEliminarProductosMarcas && this.isPermisoEliminarProductosMarcas));
			this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarProductosMarcas.setVisible(this.isVisibilidadCeldaCancelarProductosMarcas);							
			this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoProductosMarcas && this.isPermisoNuevoProductosMarcas));						
			this.jButtonDuplicarToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaDuplicarProductosMarcas && this.isPermisoDuplicarProductosMarcas));						
			this.jButtonCopiarToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaCopiarProductosMarcas && this.isPermisoCopiarProductosMarcas));			
			this.jButtonVerFormToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaVerFormProductosMarcas && this.isPermisoVerFormProductosMarcas));			
			this.jButtonAbrirOrderByToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaOrdenProductosMarcas && this.isPermisoOrdenProductosMarcas));
			this.jButtonNuevoRelacionesToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosMarcas && this.isPermisoNuevoProductosMarcas));			
			this.jButtonNuevoGuardarCambiosToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoProductosMarcas && this.isPermisoNuevoProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));			
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaModificarProductosMarcas && this.isPermisoActualizarProductosMarcas));	
			this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaActualizarProductosMarcas  && this.isPermisoActualizarProductosMarcas));	
			this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaEliminarProductosMarcas && this.isPermisoEliminarProductosMarcas));
			this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarToolBarProductosMarcas.setVisible(this.isVisibilidadCeldaCancelarProductosMarcas);				
			this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoProductosMarcas && this.isPermisoNuevoProductosMarcas));			
			this.jMenuItemDuplicarProductosMarcas.setVisible((this.isVisibilidadCeldaDuplicarProductosMarcas && this.isPermisoDuplicarProductosMarcas));			
			this.jMenuItemCopiarProductosMarcas.setVisible((this.isVisibilidadCeldaCopiarProductosMarcas && this.isPermisoCopiarProductosMarcas));			
			this.jMenuItemVerFormProductosMarcas.setVisible((this.isVisibilidadCeldaVerFormProductosMarcas && this.isPermisoVerFormProductosMarcas));			
			this.jMenuItemAbrirOrderByProductosMarcas.setVisible((this.isVisibilidadCeldaOrdenProductosMarcas && this.isPermisoOrdenProductosMarcas));			
			//this.jMenuItemMostrarOcultarProductosMarcas.setVisible((this.isVisibilidadCeldaOrdenProductosMarcas && this.isPermisoOrdenProductosMarcas));
			this.jMenuItemDetalleAbrirOrderByProductosMarcas.setVisible((this.isVisibilidadCeldaOrdenProductosMarcas && this.isPermisoOrdenProductosMarcas));			
			//this.jMenuItemDetalleMostrarOcultarProductosMarcas.setVisible((this.isVisibilidadCeldaOrdenProductosMarcas && this.isPermisoOrdenProductosMarcas));			
			this.jMenuItemNuevoRelacionesProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosMarcas && this.isPermisoNuevoProductosMarcas));			
			this.jMenuItemNuevoGuardarCambiosProductosMarcas.setVisible((this.isVisibilidadCeldaNuevoProductosMarcas && this.isPermisoNuevoProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));									
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemModificarProductosMarcas.setVisible((this.isVisibilidadCeldaModificarProductosMarcas && this.isPermisoActualizarProductosMarcas));	
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemActualizarProductosMarcas.setVisible((this.isVisibilidadCeldaActualizarProductosMarcas && this.isPermisoActualizarProductosMarcas));	
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemEliminarProductosMarcas.setVisible((this.isVisibilidadCeldaEliminarProductosMarcas && this.isPermisoEliminarProductosMarcas));
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemCancelarProductosMarcas.setVisible(this.isVisibilidadCeldaCancelarProductosMarcas);				
			}
			
			this.jMenuItemGuardarCambiosProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));						
			this.jMenuItemGuardarCambiosTablaProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosMarcas=this.jButtonNuevoProductosMarcas.isVisible();
			this.isVisibilidadCeldaDuplicarProductosMarcas=this.jButtonDuplicarProductosMarcas.isVisible();
			this.isVisibilidadCeldaCopiarProductosMarcas=this.jButtonCopiarProductosMarcas.isVisible();
			this.isVisibilidadCeldaVerFormProductosMarcas=this.jButtonVerFormProductosMarcas.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosMarcas=this.jButtonAbrirOrderByProductosMarcas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=this.jButtonNuevoRelacionesProductosMarcas.isVisible();
			this.isVisibilidadCeldaModificarProductosMarcas=this.jButtonModificarProductosMarcas.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.isVisibilidadCeldaActualizarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarProductosMarcas.isVisible();
			this.isVisibilidadCeldaEliminarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarProductosMarcas.isVisible();
			this.isVisibilidadCeldaCancelarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarProductosMarcas.isVisible();
			this.isVisibilidadCeldaGuardarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=this.jButtonGuardarCambiosTablaProductosMarcas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosMarcas=this.jButtonNuevoToolBarProductosMarcas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=this.jButtonNuevoRelacionesToolBarProductosMarcas.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.isVisibilidadCeldaModificarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarToolBarProductosMarcas.isVisible();
			this.isVisibilidadCeldaActualizarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarToolBarProductosMarcas.isVisible();
			this.isVisibilidadCeldaEliminarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarToolBarProductosMarcas.isVisible();
			this.isVisibilidadCeldaCancelarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarToolBarProductosMarcas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosMarcas=this.jButtonGuardarCambiosToolBarProductosMarcas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=this.jButtonGuardarCambiosTablaToolBarProductosMarcas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosMarcas=this.jMenuItemNuevoProductosMarcas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=this.jMenuItemNuevoRelacionesProductosMarcas.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.isVisibilidadCeldaModificarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jMenuItemModificarProductosMarcas.isVisible();
			this.isVisibilidadCeldaActualizarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jMenuItemActualizarProductosMarcas.isVisible();
			this.isVisibilidadCeldaEliminarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jMenuItemEliminarProductosMarcas.isVisible();
			this.isVisibilidadCeldaCancelarProductosMarcas=this.jInternalFrameDetalleFormProductosMarcas.jMenuItemCancelarProductosMarcas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosMarcas=this.jMenuItemGuardarCambiosProductosMarcas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=this.jMenuItemGuardarCambiosTablaProductosMarcas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosMarcas(Boolean esInicializar) {
		if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
				//if(this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosMarcas();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosMarcas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosMarcas() {
		this.jButtonNuevoProductosMarcas.setVisible(this.isPermisoNuevoProductosMarcas);			
		this.jButtonDuplicarProductosMarcas.setVisible(this.isPermisoDuplicarProductosMarcas);			
		this.jButtonCopiarProductosMarcas.setVisible(this.isPermisoCopiarProductosMarcas);			
		this.jButtonVerFormProductosMarcas.setVisible(this.isPermisoVerFormProductosMarcas);			
		
		this.jButtonAbrirOrderByProductosMarcas.setVisible(this.isPermisoOrdenProductosMarcas);					
		
		this.jButtonNuevoRelacionesProductosMarcas.setVisible(this.isPermisoNuevoProductosMarcas);			
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarProductosMarcas.setVisible(this.isPermisoActualizarProductosMarcas);	
			this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarProductosMarcas.setVisible(this.isPermisoActualizarProductosMarcas);	
			this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarProductosMarcas.setVisible(this.isPermisoEliminarProductosMarcas);
			this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarProductosMarcas.setVisible(this.isVisibilidadCeldaCancelarProductosMarcas);						
			this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.setVisible(this.isPermisoGuardarCambiosProductosMarcas);							
		}
		
		this.jButtonGuardarCambiosTablaProductosMarcas.setVisible(this.isPermisoActualizarProductosMarcas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosMarcas() {
		this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarProductosMarcas.setVisible(this.isPermisoActualizarProductosMarcas);	
		this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarProductosMarcas.setVisible(this.isPermisoActualizarProductosMarcas);	
		this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarProductosMarcas.setVisible(this.isPermisoEliminarProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarProductosMarcas.setVisible(this.isVisibilidadCeldaCancelarProductosMarcas);							
		this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.setVisible((this.isVisibilidadCeldaGuardarProductosMarcas && this.isPermisoGuardarCambiosProductosMarcas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosMarcas() {
		if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosMarcas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosMarcas() {
	}
	
	public void jTableDatosProductosMarcasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosMarcas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productosmarcas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosMarcasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosMarcas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosMarcas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosMarcas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosmarcasLogic.getConnexion());

				if(this.productosmarcas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productosmarcas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosMarcas=(TitledBorder)this.jScrollPanelDatosProductosMarcas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosMarcas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productosmarcas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosMarcasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductosMarcas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosMarcas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosMarcas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosmarcasLogic.getConnexion());

				if(this.productosmarcas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productosmarcas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosMarcas=(TitledBorder)this.jScrollPanelDatosProductosMarcas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductosMarcas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productosmarcas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductosMarcasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductosMarcas(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosMarcas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosMarcas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productosmarcasLogic.getConnexion());

				if(this.productosmarcas.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productosmarcas.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosMarcas=(TitledBorder)this.jScrollPanelDatosProductosMarcas.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductosMarcas.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productosmarcas.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.productosmarcas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.productosmarcas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.productosmarcas.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.productosmarcas.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.productosmarcas.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.productosmarcas.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.productosmarcas.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.productosmarcas.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productosmarcas.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.productosmarcas.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.productosmarcas.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoProductosMarcasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.getproductosmarcas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosmarcas==null) {
						this.productosmarcas = new ProductosMarcas();
					}

					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);
				}

				if(this.productosmarcas.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.productosmarcas.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosMarcas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosMarcasProductosMarcasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosMarcas(false,false);

			this.getProductosMarcassBusquedaProductosMarcas();

			this.inicializarActualizarBindingProductosMarcas(false);

			//if(ProductosMarcasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosMarcas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosMarcasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosMarcas(false,false);

			this.getProductosMarcassFK_IdEmpresa();

			this.inicializarActualizarBindingProductosMarcas(false);

			//if(ProductosMarcasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosMarcas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductosMarcasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosMarcas(false,false);

			this.getProductosMarcassFK_IdProducto();

			this.inicializarActualizarBindingProductosMarcas(false);

			//if(ProductosMarcasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosMarcas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosMarcasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosMarcas(false,false);

			this.getProductosMarcassFK_IdSucursal();

			this.inicializarActualizarBindingProductosMarcas(false);

			//if(ProductosMarcasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosMarcas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosmarcasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosMarcas() {
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
			this.jInternalFrameDetalleFormProductosMarcas.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosMarcas.dispose();
			this.jInternalFrameDetalleFormProductosMarcas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
			this.jInternalFrameReporteDinamicoProductosMarcas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosMarcas.dispose();
			this.jInternalFrameReporteDinamicoProductosMarcas=null;
		}
		
		if(this.jInternalFrameImportacionProductosMarcas!=null) {
			this.jInternalFrameImportacionProductosMarcas.setVisible(false);	    			
			this.jInternalFrameImportacionProductosMarcas.dispose();
			this.jInternalFrameImportacionProductosMarcas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosMarcas();
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosMarcas")) {
				jButtonDuplicarProductosMarcasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosMarcas")) {
				jButtonCopiarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosMarcas")) {
				jButtonVerFormProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosMarcas")) {
				jButtonDuplicarProductosMarcasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosMarcas")) {
				jButtonDuplicarProductosMarcasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosMarcas")) {
				jButtonModificarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosMarcas")) {
				jButtonModificarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosMarcas")) {
				jButtonModificarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosMarcas")) {
				jButtonActualizarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosMarcas")) {
				jButtonActualizarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosMarcas")) {
				jButtonActualizarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosMarcas")) {
				jButtonEliminarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosMarcas")) {
				jButtonEliminarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosMarcas")) {
				jButtonEliminarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosMarcas")) {
				jButtonCancelarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosMarcas")) {
				jButtonCancelarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosMarcas")) {
				jButtonCancelarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosMarcas")) {
				jButtonCerrarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosMarcas")) {
				jButtonCerrarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosMarcas")) {
				jButtonCerrarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosMarcas")) {
				jButtonMostrarOcultarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosMarcas")) {
				jButtonCancelarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosMarcas")) {
				jButtonCopiarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosMarcas")) {
				jButtonVerFormProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosMarcas")) {
				jButtonCopiarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosMarcas")) {
				jButtonVerFormProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosMarcas")) {
				jButtonRecargarInformacionProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosMarcas")) {
				jButtonRecargarInformacionProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosMarcas")) {
				jButtonRecargarInformacionProductosMarcasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosMarcas")) {
				jButtonAnterioresProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosMarcas")) {
				jButtonAnterioresProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosMarcas")) {
				jButtonAnterioresProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosMarcas")) {
				jButtonSiguientesProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosMarcas")) {
				jButtonSiguientesProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosMarcas")) {
				jButtonSiguientesProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosMarcas") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosMarcas")) {
				jButtonAbrirOrderByProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosMarcas") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosMarcas")) {
				jButtonMostrarOcultarProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosMarcas")) {
				jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosMarcas")) {
				jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosMarcas")) {
				jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosMarcas")) {
				jButtonCerrarReporteDinamicoProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosMarcas")) {
				jButtonGenerarReporteDinamicoProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosMarcas")) {
				
				jButtonGenerarExcelReporteDinamicoProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosMarcas")) {
				jButtonCerrarImportacionProductosMarcasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosMarcas")) {
				
				jButtonGenerarImportacionProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosMarcas")) {
				
				jButtonAbrirImportacionProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosMarcas")) {
				jComboBoxTiposAccionesProductosMarcasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosMarcas")) {
				jComboBoxTiposRelacionesProductosMarcasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosMarcas")) {
				jComboBoxTiposAccionesProductosMarcasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosMarcas")) {
				
				jComboBoxTiposSeleccionarProductosMarcasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosMarcas")) {
				jTextFieldValorCampoGeneralProductosMarcasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosMarcas")) {
				jButtonAbrirOrderByProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosMarcas")) {
				jButtonAbrirOrderByProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosMarcas")) {
				jButtonCerrarOrderByProductosMarcasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosMarcasBusqueda")) {
				this.jButtonidProductosMarcasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosMarcasUpdate")) {
				this.jButtonid_empresaProductosMarcasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosMarcasBusqueda")) {
				this.jButtonid_empresaProductosMarcasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosMarcasUpdate")) {
				this.jButtonid_sucursalProductosMarcasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosMarcasBusqueda")) {
				this.jButtonid_sucursalProductosMarcasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductosMarcasUpdate")) {
				this.jButtonid_productoProductosMarcasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductosMarcasBusqueda")) {
				this.jButtonid_productoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProductosMarcasBusqueda")) {
				this.jButtonfecha_emision_desdeProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProductosMarcasBusqueda")) {
				this.jButtonfecha_emision_hastaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosMarcasBusqueda")) {
				this.jButtonnombre_unidadProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosMarcasBusqueda")) {
				this.jButtonnombre_productoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosMarcasBusqueda")) {
				this.jButtonnombre_lineaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosMarcasBusqueda")) {
				this.jButtonnombre_linea_grupoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosMarcasBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosMarcasBusqueda")) {
				this.jButtonnombre_linea_marcaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosMarcasBusqueda")) {
				this.jButtoncantidadProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoProductosMarcasBusqueda")) {
				this.jButtonmontoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProductosMarcasBusqueda")) {
				this.jButtoncodigo_productoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoProductosMarcasBusqueda")) {
				this.jButtontipoProductosMarcasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosMarcasProductosMarcas")) {
				this.jButtonBusquedaProductosMarcasProductosMarcasActionPerformed(evt);
			}
			
			;
			
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosMarcas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosMarcas productosmarcasLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosmarcasLocal=this.productosmarcas;
			} else {
				productosmarcasLocal=this.productosmarcasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
							
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
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
			
			


			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
								
						
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
								
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
							
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
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
			
			


			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
								
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosMarcas")) {
					jCheckBoxSeleccionarTodosProductosMarcasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosMarcas")) {
					jCheckBoxSeleccionadosProductosMarcasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosMarcas")) {
					
				}
				
				


				
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
												
				
				


				
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
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
			
			


			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosMarcasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosmarcas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosmarcas);
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
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
				
				


				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosMarcas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosMarcas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosMarcasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosmarcasAnterior =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosMarcas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosMarcasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosMarcas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productosmarcas =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productosmarcas =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productosmarcas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosMarcas")) {
				
				}
				
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosMarcas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosMarcas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosMarcas")) {
			
			}
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosMarcas();
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			if(sTipo.equals("NuevoProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosMarcas")) {
				jButtonDuplicarProductosMarcasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosMarcas")) {
				jButtonCopiarProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosMarcas")) {
				jButtonVerFormProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosMarcas")) {
				jButtonNuevoProductosMarcasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosMarcas")) {
				jButtonModificarProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosMarcas")) {
				jButtonActualizarProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosMarcas")) {
				jButtonEliminarProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosMarcas")) {
				jButtonCancelarProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosMarcas")) {
				jButtonCerrarProductosMarcasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosMarcas")) {
				jButtonGuardarCambiosProductosMarcasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosMarcas")) {
				jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosMarcas")) {
				jButtonAbrirOrderByProductosMarcasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosMarcas")) {
				jButtonRecargarInformacionProductosMarcasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosMarcas")) {
				jButtonAnterioresProductosMarcasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosMarcas")) {
				jButtonSiguientesProductosMarcasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosMarcasBusqueda")) {
				this.jButtonidProductosMarcasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosMarcasUpdate")) {
				this.jButtonid_empresaProductosMarcasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosMarcasBusqueda")) {
				this.jButtonid_empresaProductosMarcasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosMarcasUpdate")) {
				this.jButtonid_sucursalProductosMarcasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosMarcasBusqueda")) {
				this.jButtonid_sucursalProductosMarcasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductosMarcasUpdate")) {
				this.jButtonid_productoProductosMarcasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductosMarcasBusqueda")) {
				this.jButtonid_productoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProductosMarcasBusqueda")) {
				this.jButtonfecha_emision_desdeProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProductosMarcasBusqueda")) {
				this.jButtonfecha_emision_hastaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosMarcasBusqueda")) {
				this.jButtonnombre_unidadProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosMarcasBusqueda")) {
				this.jButtonnombre_productoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosMarcasBusqueda")) {
				this.jButtonnombre_lineaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosMarcasBusqueda")) {
				this.jButtonnombre_linea_grupoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosMarcasBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosMarcasBusqueda")) {
				this.jButtonnombre_linea_marcaProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosMarcasBusqueda")) {
				this.jButtoncantidadProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoProductosMarcasBusqueda")) {
				this.jButtonmontoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProductosMarcasBusqueda")) {
				this.jButtoncodigo_productoProductosMarcasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoProductosMarcasBusqueda")) {
				this.jButtontipoProductosMarcasBusquedaActionPerformed(evt);
			}
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosMarcas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosMarcas")) {
				closingInternalFrameProductosMarcas();
				
			} else if(sTipo.equals("jButtonCancelarProductosMarcas")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosMarcas = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosMarcasBeanSwingJInternalFrame jInternalFrameParent=(ProductosMarcasBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosMarcas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosMarcasActionPerformed(null);
			}
			
			ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosmarcas,new Object(),this.productosmarcasParameterGeneral,this.productosmarcasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosMarcas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosMarcas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosMarcas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productosmarcas)) {
			if(!esControlTabla) {
				if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);			
				}
				
				if(this.productosmarcasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosMarcas(this.productosmarcas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosMarcas(this.productosmarcasReturnGeneral,this.productosmarcasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosmarcasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosMarcas(classes,this.productosmarcasReturnGeneral,this.productosmarcasBean,false);
					}
						
					if(this.productosmarcasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosMarcas(this.productosmarcasReturnGeneral.getProductosMarcas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosMarcas(this.productosmarcasReturnGeneral.getProductosMarcas());	
					}
						
					if(this.productosmarcasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosMarcas(this.productosmarcasReturnGeneral.getProductosMarcas(),classes);//this.productosmarcasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosMarcas(this.productosmarcas,classes);//this.productosmarcasBean);									
				}
			
				if(ProductosMarcasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosMarcas(this.productosmarcas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosMarcas(this.productosmarcas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosmarcasAnterior!=null) {
						this.productosmarcas=this.productosmarcasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosmarcasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosmarcasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosmarcasReturnGeneral.getProductosMarcas(),productosmarcasLogic.getProductosMarcass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosmarcasReturnGeneral.getProductosMarcas(),this.productosmarcass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosMarcas.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosMarcas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosMarcas();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosMarcas() throws Exception {
		
		ProductosMarcasModel productosmarcasModel=(ProductosMarcasModel)this.jTableDatosProductosMarcas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosmarcasModel.productosmarcass=this.productosmarcasLogic.getProductosMarcass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosmarcasModel.productosmarcass=this.productosmarcass;
		}
		
		
		((ProductosMarcasModel) this.jTableDatosProductosMarcas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosMarcas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosmarcasAnterior(),this.productosmarcasLogic.getProductosMarcass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosmarcasAnterior(),this.productosmarcass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosMarcas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosMarcas(ProductosMarcas productosmarcas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
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
										
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosmarcas,new Object(),generalEntityParameterGeneral,this.productosmarcasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosmarcasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosMarcasConstantesFunciones.getClassesRelationshipsOfProductosMarcas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosMarcasConstantesFunciones.getClassesRelationshipsFromStringsOfProductosMarcas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosMarcas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosMarcasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosmarcas,new Object(),generalEntityParameterGeneral,this.productosmarcasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosMarcas(ProductosMarcasBean productosmarcasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosMarcas(ArrayList<Classe> classes,ProductosMarcasReturnGeneral productosmarcasReturnGeneral,ProductosMarcasBean productosmarcasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosMarcas(ProductosMarcas productosmarcas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productosmarcas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosMarcas = new ProductosMarcasDetalleFormJInternalFrame(jDesktopPane,this.productosmarcasSessionBean.getConGuardarRelaciones(),this.productosmarcasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.setVisible(false);
		this.jInternalFrameDetalleFormProductosMarcas.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosMarcas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosMarcas.productosmarcasLogic=this.productosmarcasLogic;
		
		this.cargarCombosFrameForeignKeyProductosMarcas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosMarcas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosMarcas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosMarcas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosMarcas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosMarcas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosMarcas"));
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarProductosMarcas.addActionListener(new ButtonActionListener(this,"ModificarProductosMarcas"));

		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosMarcas"));
					
		this.jInternalFrameDetalleFormProductosMarcas.jMenuItemModificarProductosMarcas.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosMarcas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarProductosMarcas.addActionListener (new ButtonActionListener(this,"ActualizarProductosMarcas"));
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosMarcas"));
						
		this.jInternalFrameDetalleFormProductosMarcas.jMenuItemActualizarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosMarcas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarProductosMarcas.addActionListener (new ButtonActionListener(this,"EliminarProductosMarcas"));
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosMarcas"));
								
		this.jInternalFrameDetalleFormProductosMarcas.jMenuItemEliminarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosMarcas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarProductosMarcas.addActionListener (new ButtonActionListener(this,"CancelarProductosMarcas"));
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosMarcas"));
					
		this.jInternalFrameDetalleFormProductosMarcas.jMenuItemCancelarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosMarcas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jMenuItemDetalleCerrarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosMarcas"));		
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosMarcas"));
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosMarcas"));
		
		
		
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosMarcas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonidProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"idProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_empresaProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_empresaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_sucursalProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_sucursalProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_productoProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonfecha_emision_desdeProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonfecha_emision_hastaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_unidadProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_lineaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_grupoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_categoriaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_marcaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtoncantidadProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonmontoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"montoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtoncodigo_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtontipoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"tipoProductosMarcasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosMarcas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosMarcas"));
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosMarcas"));
		}
		
		this.jTableDatosProductosMarcas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosMarcas"));
		
		this.jTableDatosProductosMarcas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosMarcas"));
		
		this.jButtonNuevoProductosMarcas.addActionListener(new ButtonActionListener(this,"NuevoProductosMarcas"));
		
		this.jButtonDuplicarProductosMarcas.addActionListener(new ButtonActionListener(this,"DuplicarProductosMarcas"));
		
		this.jButtonCopiarProductosMarcas.addActionListener(new ButtonActionListener(this,"CopiarProductosMarcas"));
		
		this.jButtonVerFormProductosMarcas.addActionListener(new ButtonActionListener(this,"VerFormProductosMarcas"));
		
		
		this.jButtonNuevoToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosMarcas"));
			
		this.jButtonDuplicarToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosMarcas"));
			
		this.jMenuItemNuevoProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosMarcas"));
			
		this.jMenuItemDuplicarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosMarcas"));		
		
		
		this.jButtonNuevoRelacionesProductosMarcas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosMarcas"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosMarcas"));
			
		this.jMenuItemNuevoRelacionesProductosMarcas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosMarcas"));		
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarProductosMarcas.addActionListener(new ButtonActionListener(this,"ModificarProductosMarcas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonModificarToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosMarcas"));
			
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemModificarProductosMarcas.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosMarcas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarProductosMarcas.addActionListener (new ButtonActionListener(this,"ActualizarProductosMarcas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonActualizarToolBarProductosMarcas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosMarcas"));
				
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemActualizarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosMarcas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarProductosMarcas.addActionListener (new ButtonActionListener(this,"EliminarProductosMarcas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonEliminarToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosMarcas"));
						
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemEliminarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosMarcas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarProductosMarcas.addActionListener (new ButtonActionListener(this,"CancelarProductosMarcas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonCancelarToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosMarcas"));
			
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemCancelarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosMarcas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosMarcas"));		
		
		
		this.jButtonCerrarProductosMarcas.addActionListener (new ButtonActionListener(this,"CerrarProductosMarcas"));
		
		
		this.jButtonCerrarToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosMarcas"));
			
		this.jMenuItemCerrarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosMarcas"));
			
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jMenuItemDetalleCerrarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosMarcas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosMarcas"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosMarcas"));
		}
		
		this.jButtonCopiarToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosMarcas"));
			
		this.jButtonVerFormToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosMarcas"));
		
		this.jMenuItemGuardarCambiosProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosMarcas"));
			
		this.jMenuItemCopiarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosMarcas"));		
		
		this.jMenuItemVerFormProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosMarcas"));		
		
		
		this.jButtonGuardarCambiosTablaProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosMarcas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosMarcas"));
			
		this.jMenuItemGuardarCambiosTablaProductosMarcas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosMarcas"));		
		
		
		
		this.jButtonRecargarInformacionProductosMarcas.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosMarcas"));
					
		this.jButtonRecargarInformacionToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosMarcas"));
		
		this.jMenuItemRecargarInformacionProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosMarcas"));		
		
		
		
		this.jButtonAnterioresProductosMarcas.addActionListener (new ButtonActionListener(this,"AnterioresProductosMarcas"));
		
		
		this.jButtonAnterioresToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosMarcas"));
		
		this.jMenuItemAnterioresProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosMarcas"));		
		
		
		this.jButtonSiguientesProductosMarcas.addActionListener (new ButtonActionListener(this,"SiguientesProductosMarcas"));
		
		
		this.jButtonSiguientesToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosMarcas"));
			
		this.jMenuItemSiguientesProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosMarcas"));
			
		this.jMenuItemAbrirOrderByProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosMarcas"));
			
		this.jMenuItemMostrarOcultarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosMarcas"));
			
		this.jMenuItemDetalleAbrirOrderByProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosMarcas"));
			
		this.jMenuItemDetalleMostarOcultarProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosMarcas"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosMarcas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosMarcas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosMarcas"));
			
		this.jMenuItemNuevoGuardarCambiosProductosMarcas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosMarcas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosMarcas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosMarcas"));

		this.jCheckBoxSeleccionadosProductosMarcas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosMarcas"));
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosMarcas"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosMarcas.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosMarcas"));
			
		this.jComboBoxTiposAccionesProductosMarcas.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosMarcas"));
					
		this.jComboBoxTiposSeleccionarProductosMarcas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosMarcas"));
			
		this.jTextFieldValorCampoGeneralProductosMarcas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosMarcas"));		
		
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonidProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"idProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_empresaProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_empresaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_sucursalProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_sucursalProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_productoProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonfecha_emision_desdeProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonfecha_emision_hastaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_unidadProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_lineaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_grupoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_categoriaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_marcaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtoncantidadProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonmontoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"montoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtoncodigo_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtontipoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"tipoProductosMarcasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosMarcasProductosMarcas.addActionListener(new ButtonActionListener(this,"BusquedaProductosMarcasProductosMarcas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosMarcas!=null) {
				this.jInternalFrameReporteDinamicoProductosMarcas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosMarcas"));
				this.jInternalFrameReporteDinamicoProductosMarcas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosMarcas"));
				this.jInternalFrameReporteDinamicoProductosMarcas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosMarcas"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosMarcas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosMarcas"));				
			//this.jButtonGenerarReporteDinamicoProductosMarcas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosMarcas"));
			//this.jButtonGenerarExcelReporteDinamicoProductosMarcas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosMarcas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosMarcas!=null) {
				this.jInternalFrameImportacionProductosMarcas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosMarcas"));
				this.jInternalFrameImportacionProductosMarcas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosMarcas"));
				this.jInternalFrameImportacionProductosMarcas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosMarcas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosMarcas.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosMarcas"));
			
			this.jButtonAbrirOrderByToolBarProductosMarcas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosMarcas"));			
			
			if(this.jInternalFrameOrderByProductosMarcas!=null) {
				this.jInternalFrameOrderByProductosMarcas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosMarcas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosMarcas.jTabbedPaneRelacionesProductosMarcas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosMarcas"));
		
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
            		closingInternalFrameProductosMarcas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosMarcas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosMarcas = (JInternalFrameBase)event.getSource();
	            	
	            ProductosMarcasBeanSwingJInternalFrame jInternalFrameParent=(ProductosMarcasBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosMarcas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosMarcasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosMarcas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosMarcasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosMarcas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosMarcas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosMarcasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosMarcasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosMarcasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosMarcas";
		inputMap = this.jButtonNuevoProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosMarcasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosMarcasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosMarcasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosMarcasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosMarcas";
		inputMap = this.jButtonNuevoRelacionesProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosMarcasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosMarcas";
		inputMap = this.jButtonModificarProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosMarcasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosMarcas";
		inputMap = this.jButtonActualizarProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosMarcasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosMarcas";
		inputMap = this.jButtonEliminarProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosMarcasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosMarcas";
		inputMap = this.jButtonCancelarProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosMarcasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosMarcas";
		inputMap = this.jButtonCerrarProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosMarcasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosMarcas";
		inputMap = this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosMarcas.jButtonGuardarCambiosProductosMarcas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosMarcasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosMarcas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosMarcasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosMarcas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosMarcasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosMarcas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosMarcasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosMarcas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosMarcasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonidProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"idProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_empresaProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_empresaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_sucursalProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_sucursalProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosMarcasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_productoProductosMarcasUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosMarcasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonid_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonfecha_emision_desdeProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonfecha_emision_hastaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_unidadProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_lineaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_grupoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_categoriaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonnombre_linea_marcaProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtoncantidadProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtonmontoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"montoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtoncodigo_productoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosMarcasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosMarcas.jButtontipoProductosMarcasBusqueda.addActionListener(new ButtonActionListener(this,"tipoProductosMarcasBusqueda"));
		
		
		this.jButtonBusquedaProductosMarcasProductosMarcas.addActionListener(new ButtonActionListener(this,"BusquedaProductosMarcasProductosMarcas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosMarcas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosMarcasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosMarcasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosMarcas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosMarcas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
					productosmarcasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosMarcas productosmarcasAux:productosmarcass) {
					productosmarcasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosMarcasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosMarcas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
						productosmarcasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosMarcas productosmarcasAux:productosmarcass) {
						productosmarcasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosMarcas productosmarcasAux:productosmarcass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosMarcas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosMarcas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosMarcas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosMarcasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosMarcas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosMarcas.getSelectedRows();
			
			ProductosMarcas productosmarcasLocal=new ProductosMarcas();
			
			//this.seleccionarTodosProductosMarcas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosmarcasLocal =(ProductosMarcas) this.productosmarcasLogic.getProductosMarcass().toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosmarcasLocal =(ProductosMarcas) this.productosmarcass.toArray()[this.jTableDatosProductosMarcas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosmarcasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
						productosmarcasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosMarcas productosmarcasAux:productosmarcass) {
						productosmarcasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosMarcas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosMarcas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosMarcas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosMarcas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosMarcasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosMarcasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosMarcasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosMarcas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosMarcas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosMarcas productosmarcasAux:this.productosmarcasLogic.getProductosMarcass()) {
				
						if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							productosmarcasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							productosmarcasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosmarcasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productosmarcasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosmarcasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosmarcasAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosmarcasAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosmarcasAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productosmarcasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							productosmarcasAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							productosmarcasAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							productosmarcasAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosMarcas productosmarcasAux:productosmarcass) {
					
						if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							productosmarcasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							productosmarcasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosmarcasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productosmarcasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosmarcasAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosmarcasAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosmarcasAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosmarcasAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productosmarcasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							productosmarcasAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							productosmarcasAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							productosmarcasAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosMarcas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosMarcasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosMarcas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosMarcas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosMarcas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosMarcas) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosMarcas(conSplash);
				
					this.generarReporteProductosMarcassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosMarcassSeleccionados();
				//this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosMarcassSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosMarcassSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosMarcas();
				
				this.exportarProductosMarcassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosMarcass();
				//this.importarProductosMarcass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosMarcas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosMarcassSeleccionados();
				//this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Marcas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosMarcas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosMarcas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosMarcas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosMarcasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosMarcas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosMarcas(conSplash);
					
						//this.actualizarParametrosGeneralProductosMarcas();
						
						this.generarReporteProcesoAccionProductosMarcassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosMarcasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos MarcasES SELECCIONADOS?", "MANTENIMIENTO DE Productos Marcas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosMarcas();
				
						this.actualizarParametrosGeneralProductosMarcas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosmarcasReturnGeneral=productosmarcasLogic.procesarAccionProductosMarcassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosmarcasLogic.getProductosMarcass(),this.productosmarcasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosMarcasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosMarcas();
					
					ProductosMarcasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosMarcasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosMarcas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosMarcas.jComboBoxTiposAccionesFormularioProductosMarcas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosMarcas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosMarcasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosMarcas();
			
			if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
			ProductosMarcas productosmarcas=new ProductosMarcas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosMarcas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosMarcas.getSelectedItem();
			
			
			
			
			productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
			//this.sTipoAccion;
			
			if(productosmarcassSeleccionados.size()==1) {
				for(ProductosMarcas productosmarcasAux:productosmarcassSeleccionados) {
					productosmarcas=productosmarcasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosMarcas();
			
      		//this.finishProcessProductosMarcas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosMarcasReturnGeneral() throws Exception {
		if(this.productosmarcasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosmarcasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosmarcasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosmarcasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosmarcasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosmarcasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosMarcas(false);
		}
		
		if(this.productosmarcasReturnGeneral.getConRetornoLista() || this.productosmarcasReturnGeneral.getConRetornoObjeto()) {
			if(this.productosmarcasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosmarcasLogic.setProductosMarcass(this.productosmarcasReturnGeneral.getProductosMarcass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosMarcas(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosMarcas() throws Exception {
		
		
	}
	
	public ArrayList<ProductosMarcas> getProductosMarcassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosMarcas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosMarcas productosmarcasAux:productosmarcasLogic.getProductosMarcass()) {
					if(productosmarcasAux.getIsSelected()) {
						productosmarcassSeleccionados.add(productosmarcasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosMarcas productosmarcasAux:this.productosmarcass) {
					if(productosmarcasAux.getIsSelected()) {
						productosmarcassSeleccionados.add(productosmarcasAux);				
					}
				}
			}
			
			if(productosmarcassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productosmarcassSeleccionados.addAll(this.productosmarcasLogic.getProductosMarcass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productosmarcassSeleccionados.addAll(this.productosmarcass);				
					}
				}
			}
		} else {
			productosmarcassSeleccionados.add(this.productosmarcas);
		}
		
		return productosmarcassSeleccionados;
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
	
	public void generarReporteProductosMarcassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosMarcassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosMarcassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosMarcassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosMarcassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Marcas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosMarcassSeleccionados() throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosMarcassSeleccionados() throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosMarcassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosMarcassSeleccionados() throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosMarcas();
		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosMarcas();
		
		
		//this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados ,productosmarcasImplementable,productosmarcasImplementableHome);
	}
	
	public void mostrarImportacionProductosMarcass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosMarcas();
		
		this.abrirFrameImportacionProductosMarcas();		
		
			
		//this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados ,productosmarcasImplementable,productosmarcasImplementableHome);
	}
	
	public void importarProductosMarcass() throws Exception {		
	
	}
	
	public void exportarProductosMarcassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosMarcassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosMarcassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosMarcassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Marcas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosMarcassSeleccionados() throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosMarcas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosMarcas productosmarcasAux:productosmarcassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosMarcas(productosmarcasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosmarcasAux.setsDetalleGeneralEntityReporte(productosmarcasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosMarcas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosMarcasConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosMarcas(ProductosMarcas productosmarcas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productosmarcas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosmarcas.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosMarcassSeleccionados() throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosMarcass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosMarcas(row);				
				iRow++;
			}				
			
			for(ProductosMarcas productosmarcasAux:productosmarcassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosMarcas(productosmarcasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosMarcassSeleccionados() throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();		
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosmarcas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productosmarcass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productosmarcas");
			//elementRoot.appendChild(element);
		
			for(ProductosMarcas productosmarcasAux:productosmarcassSeleccionados) {
				element = document.createElement("productosmarcas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosMarcas(productosmarcasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Marcas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosMarcas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosMarcasConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosMarcas(ProductosMarcas productosmarcas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(productosmarcas.gettipo());				
	}
	
	public void setFilaDatosExportarXmlProductosMarcas(ProductosMarcas productosmarcas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosMarcasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productosmarcas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosMarcasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productosmarcas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosMarcasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productosmarcas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosMarcasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productosmarcas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductosMarcasConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productosmarcas.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementfecha_emision_desde = document.createElement(ProductosMarcasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(productosmarcas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ProductosMarcasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(productosmarcas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_unidad = document.createElement(ProductosMarcasConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(productosmarcas.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementnombre_producto = document.createElement(ProductosMarcasConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(productosmarcas.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_linea = document.createElement(ProductosMarcasConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(productosmarcas.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ProductosMarcasConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(productosmarcas.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ProductosMarcasConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(productosmarcas.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ProductosMarcasConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(productosmarcas.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcantidad = document.createElement(ProductosMarcasConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productosmarcas.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementmonto = document.createElement(ProductosMarcasConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(productosmarcas.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementcodigo_producto = document.createElement(ProductosMarcasConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(productosmarcas.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementtipo = document.createElement(ProductosMarcasConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(productosmarcas.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoProductosMarcassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosMarcas> productosmarcassSeleccionados=new ArrayList<ProductosMarcas>();
		
		productosmarcassSeleccionados=this.getProductosMarcassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosMarcas(productosmarcassSeleccionados);
		
		this.generarReporteProductosMarcass("Todos",productosmarcassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosMarcas(ArrayList<ProductosMarcas> productosmarcassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosMarcas productosmarcasAux:productosmarcassSeleccionados) {
				productosmarcasAux.setsDetalleGeneralEntityReporte(productosmarcasAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosmarcasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosmarcasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ProductosMarcasConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					productosmarcasAux.setsDescripcionGeneralEntityReporte1(productosmarcasAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosMarcasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosMarcas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosMarcas=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=true;
				this.isVisibilidadCeldaGuardarCambiosProductosMarcas=true;
			}
			
			this.isVisibilidadCeldaModificarProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=false;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
			this.isVisibilidadCeldaModificarProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=true;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
			this.isVisibilidadCeldaModificarProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=true;
			this.isVisibilidadCeldaEliminarProductosMarcas=true;
			this.isVisibilidadCeldaCancelarProductosMarcas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
			this.isVisibilidadCeldaModificarProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=true;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosMarcas=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=true;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=true;
			this.isVisibilidadCeldaModificarProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=false;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
			this.isVisibilidadCeldaActualizarProductosMarcas=false;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
			this.isVisibilidadCeldaModificarProductosMarcas=true;
			this.isVisibilidadCeldaActualizarProductosMarcas=false;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
			this.isVisibilidadCeldaCancelarProductosMarcas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosMarcas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosMarcasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosMarcas=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=true;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=true;
		} else {
			this.actualizarEstadoPanelsProductosMarcas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosMarcas=false;
			//this.isVisibilidadCeldaVerFormProductosMarcas=false;
			this.isVisibilidadCeldaDuplicarProductosMarcas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosmarcasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosMarcas=false;
			this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosmarcasSessionBean.getEsGuardarRelacionado()) {
			if(!productosmarcasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;												
			}
			
			this.jButtonCerrarProductosMarcas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
		}
		
		if(!this.permiteMantenimiento(this.productosmarcas)) {
			this.isVisibilidadCeldaActualizarProductosMarcas=false;
			this.isVisibilidadCeldaEliminarProductosMarcas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosMarcas=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosMarcas=false;
		this.isVisibilidadCeldaGuardarCambiosProductosMarcas=false;
		//this.isVisibilidadCeldaModificarProductosMarcas=true;
		this.isVisibilidadCeldaActualizarProductosMarcas=false;
		this.isVisibilidadCeldaEliminarProductosMarcas=false;
		//this.isVisibilidadCeldaCancelarProductosMarcas=true;			
		this.isVisibilidadCeldaGuardarProductosMarcas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosMarcas() {
	}
	
	public void actualizarEstadoPanelsProductosMarcas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosMarcas!=null) {
				this.jScrollPanelDatosEdicionProductosMarcas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosMarcas!=null) {
				this.jScrollPanelDatosProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosMarcas!=null) {
				this.jPanelPaginacionProductosMarcas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
					this.jTabbedPaneBusquedasProductosMarcas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosmarcasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosMarcas!=null) {
				this.jTabbedPaneBusquedasProductosMarcas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosMarcas!=null) {
				this.jPanelParametrosReportesProductosMarcas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosMarcas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosMarcas) {this.jTabbedPaneBusquedasProductosMarcas.remove(jPanelBusquedaProductosMarcasProductosMarcas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductosMarcas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductosMarcas) {this.jTabbedPaneBusquedasProductosMarcas.remove(jPanelBusquedaProductosMarcasProductosMarcas);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProductosMarcas=isParaProducto;
			if(!this.isVisibilidadBusquedaProductosMarcas) {this.jTabbedPaneBusquedasProductosMarcas.remove(jPanelBusquedaProductosMarcasProductosMarcas);}
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
			
			this.inicializarActualizarBindingTablaProductosMarcas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosMarcas() {
		this.updateBorderResaltarBusquedasFormularioProductosMarcas();
		this.updateVisibilidadBusquedasFormularioProductosMarcas();
		this.updateHabilitarBusquedasFormularioProductosMarcas();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosMarcas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosMarcas.getComponents().length>0) {
	

		if(this.productosmarcasConstantesFunciones.resaltarBusquedaProductosMarcasProductosMarcas!=null) {
			index= this.jTabbedPaneBusquedasProductosMarcas.indexOfComponent(this.jPanelBusquedaProductosMarcasProductosMarcas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosMarcas.getComponent(index);
				jPanel.setBorder(this.productosmarcasConstantesFunciones.resaltarBusquedaProductosMarcasProductosMarcas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosMarcas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosMarcas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosMarcas.indexOfComponent(this.jPanelBusquedaProductosMarcasProductosMarcas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosMarcas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosmarcasConstantesFunciones.mostrarBusquedaProductosMarcasProductosMarcas);
			if(!this.productosmarcasConstantesFunciones.mostrarBusquedaProductosMarcasProductosMarcas && index>-1) {
				this.jTabbedPaneBusquedasProductosMarcas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosMarcas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosMarcas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosMarcas.indexOfComponent(this.jPanelBusquedaProductosMarcasProductosMarcas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosMarcas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosmarcasConstantesFunciones.activarBusquedaProductosMarcasProductosMarcas);
				this.jTabbedPaneBusquedasProductosMarcas.setEnabledAt(index,this.productosmarcasConstantesFunciones.activarBusquedaProductosMarcasProductosMarcas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosMarcas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosMarcas")) {
			index= this.jTabbedPaneBusquedasProductosMarcas.indexOfComponent(this.jPanelBusquedaProductosMarcasProductosMarcas);

			this.jTabbedPaneBusquedasProductosMarcas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosMarcas.getComponent(index);

			this.productosmarcasConstantesFunciones.setResaltarBusquedaProductosMarcasProductosMarcas(resaltar);

			jPanel.setBorder(this.productosmarcasConstantesFunciones.resaltarBusquedaProductosMarcasProductosMarcas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosMarcas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosMarcas() throws Exception {

		if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosMarcas();
		this.updateVisibilidadResaltarControlesFormularioProductosMarcas();
		this.updateHabilitarResaltarControlesFormularioProductosMarcas();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosMarcas() throws Exception {
		if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosmarcasConstantesFunciones.resaltaridProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltaridProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarid_empresaProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarid_empresaProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarid_sucursalProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarid_sucursalProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarid_productoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarid_productoProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarfecha_emision_desdeProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_desdeProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarfecha_emision_desdeProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarfecha_emision_hastaProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_hastaProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarfecha_emision_hastaProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarnombre_unidadProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarnombre_unidadProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarnombre_productoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarnombre_productoProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarnombre_lineaProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarnombre_lineaProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarnombre_linea_grupoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarnombre_linea_grupoProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarnombre_linea_categoriaProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarnombre_linea_categoriaProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarnombre_linea_marcaProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarnombre_linea_marcaProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarcantidadProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarcantidadProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarmontoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarmontoProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltarcodigo_productoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltarcodigo_productoProductosMarcas);}
		if(this.productosmarcasConstantesFunciones.resaltartipoProductosMarcas!=null && this.jInternalFrameDetalleFormProductosMarcas!=null) {this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setBorder(this.productosmarcasConstantesFunciones.resaltartipoProductosMarcas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosMarcas() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
	
		//this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostraridProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelidProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostraridProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarid_empresaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelid_empresaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarid_empresaProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarid_sucursalProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelid_sucursalProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarid_sucursalProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarid_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelid_productoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarid_productoProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_desdeProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarfecha_emision_desdeProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelfecha_emision_desdeProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarfecha_emision_desdeProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_hastaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarfecha_emision_hastaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelfecha_emision_hastaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarfecha_emision_hastaProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_unidadProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelnombre_unidadProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_unidadProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelnombre_productoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_productoProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_lineaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelnombre_lineaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_lineaProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_linea_grupoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelnombre_linea_grupoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_linea_grupoProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_linea_categoriaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelnombre_linea_categoriaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_linea_categoriaProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_linea_marcaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelnombre_linea_marcaProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarnombre_linea_marcaProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarcantidadProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelcantidadProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarcantidadProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarmontoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelmontoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarmontoProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarcodigo_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPanelcodigo_productoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrarcodigo_productoProductosMarcas);
		//this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrartipoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jPaneltipoProductosMarcas.setVisible(this.productosmarcasConstantesFunciones.mostrartipoProductosMarcas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosMarcas() throws Exception {
		if(this.jInternalFrameDetalleFormProductosMarcas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosMarcas!=null) {
	
		this.jInternalFrameDetalleFormProductosMarcas.jLabelidProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activaridProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_empresaProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarid_empresaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_sucursalProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarid_sucursalProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jComboBoxid_productoProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarid_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_desdeProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarfecha_emision_desdeProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jDateChooserfecha_emision_hastaProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarfecha_emision_hastaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_unidadProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarnombre_unidadProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextAreanombre_productoProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarnombre_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_lineaProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarnombre_lineaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_grupoProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarnombre_linea_grupoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_categoriaProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarnombre_linea_categoriaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldnombre_linea_marcaProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarnombre_linea_marcaProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcantidadProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarcantidadProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldmontoProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarmontoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldcodigo_productoProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activarcodigo_productoProductosMarcas);
		this.jInternalFrameDetalleFormProductosMarcas.jTextFieldtipoProductosMarcas.setEnabled(this.productosmarcasConstantesFunciones.activartipoProductosMarcas);
		}
	}
	
		
}