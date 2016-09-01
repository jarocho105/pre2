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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.ProductoPromocionConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoPromocionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoPromocionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoPromocionBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class ProductoPromocionBeanSwingJInternalFrame extends ProductoPromocionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoPromocionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoPromocion> productopromocionValidator = new ClassValidator<ProductoPromocion>(ProductoPromocion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoPromocion productopromocion;	
	public ProductoPromocion productopromocionAux;
	public ProductoPromocion productopromocionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoPromocion productopromocionTotales;
	public Long idProductoPromocionActual;
	public Long iIdNuevoProductoPromocion=0L;
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

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
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

	public String sFinalQueryComboBodegaRelacion="";

	public List<Bodega> bodegarelacionsForeignKey;

	public List<Bodega> getbodegarelacionsForeignKey() {
		return bodegarelacionsForeignKey;
	}

	public void setbodegarelacionsForeignKey(List<Bodega> bodegarelacionsForeignKey) {
		this.bodegarelacionsForeignKey = bodegarelacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegarelacionForeignKey;

	public Bodega getbodegarelacionForeignKey() {
		return bodegarelacionForeignKey;
	}

	public void setbodegarelacionForeignKey(Bodega bodegarelacionForeignKey) {
		this.bodegarelacionForeignKey = bodegarelacionForeignKey;
	}

	public String sFinalQueryComboProductoRelacion="";

	public List<Producto> productorelacionsForeignKey;

	public List<Producto> getproductorelacionsForeignKey() {
		return productorelacionsForeignKey;
	}

	public void setproductorelacionsForeignKey(List<Producto> productorelacionsForeignKey) {
		this.productorelacionsForeignKey = productorelacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productorelacionForeignKey;

	public Producto getproductorelacionForeignKey() {
		return productorelacionForeignKey;
	}

	public void setproductorelacionForeignKey(Producto productorelacionForeignKey) {
		this.productorelacionForeignKey = productorelacionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	public Long idProductoRelacionActual=0L;

	public Long getidProductoRelacionActual() {
		return idProductoRelacionActual;
	}

	public void setidProductoRelacionActual(Long idProductoRelacionActual) {
		this.idProductoRelacionActual= idProductoRelacionActual;
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
	
	public Boolean isPermisoTodoProductoPromocion;
	public Boolean isPermisoNuevoProductoPromocion;
	public Boolean isPermisoActualizarProductoPromocion;
	public Boolean isPermisoActualizarOriginalProductoPromocion;
	public Boolean isPermisoEliminarProductoPromocion;
	public Boolean isPermisoGuardarCambiosProductoPromocion;
	public Boolean isPermisoConsultaProductoPromocion;
	public Boolean isPermisoBusquedaProductoPromocion;
	public Boolean isPermisoReporteProductoPromocion;
	public Boolean isPermisoPaginacionMedioProductoPromocion;
	public Boolean isPermisoPaginacionAltoProductoPromocion;
	public Boolean isPermisoPaginacionTodoProductoPromocion;
	public Boolean isPermisoCopiarProductoPromocion;
	public Boolean isPermisoVerFormProductoPromocion;
	public Boolean isPermisoDuplicarProductoPromocion;
	public Boolean isPermisoOrdenProductoPromocion;
	
	
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
	
	public ProductoPromocionParameterReturnGeneral productopromocionReturnGeneral;
	public ProductoPromocionParameterReturnGeneral productopromocionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoPromocion=false;
	public Boolean esParaAccionDesdeFormularioProductoPromocion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoPromocionSessionBeanAdditional productopromocionSessionBeanAdditional=null;
	
	public ProductoPromocionSessionBeanAdditional getProductoPromocionSessionBeanAdditional() {
		return this.productopromocionSessionBeanAdditional;
	}
	
	public void setProductoPromocionSessionBeanAdditional(ProductoPromocionSessionBeanAdditional productopromocionSessionBeanAdditional) {
		try {
			this.productopromocionSessionBeanAdditional=productopromocionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoPromocionBeanSwingJInternalFrameAdditional productopromocionBeanSwingJInternalFrameAdditional=null;
	//public class ProductoPromocionBeanSwingJInternalFrame
	
	public ProductoPromocionBeanSwingJInternalFrameAdditional getProductoPromocionBeanSwingJInternalFrameAdditional() {
		return this.productopromocionBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoPromocionBeanSwingJInternalFrameAdditional(ProductoPromocionBeanSwingJInternalFrameAdditional productopromocionBeanSwingJInternalFrameAdditional) {
		try {
			this.productopromocionBeanSwingJInternalFrameAdditional=productopromocionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoPromocionLogic productopromocionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoPromocion productopromocionBean;
	public ProductoPromocionConstantesFunciones productopromocionConstantesFunciones;
	//public ProductoPromocionParameterReturnGeneral productopromocionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public BodegaLogic bodegarelacionLogic;
	public ProductoLogic productorelacionLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoPromocion> productopromocions;	
	//public List<ProductoPromocion> productopromocionsEliminados;
	//public List<ProductoPromocion> productopromocionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoPromocion=false;
	public Boolean isVisibilidadCeldaDuplicarProductoPromocion=true;
	public Boolean isVisibilidadCeldaCopiarProductoPromocion=true;
	public Boolean isVisibilidadCeldaVerFormProductoPromocion=true;
	public Boolean isVisibilidadCeldaOrdenProductoPromocion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
	public Boolean isVisibilidadCeldaModificarProductoPromocion=false;
	public Boolean isVisibilidadCeldaActualizarProductoPromocion=false;
	public Boolean isVisibilidadCeldaEliminarProductoPromocion=false;
	public Boolean isVisibilidadCeldaCancelarProductoPromocion=false;
	public Boolean isVisibilidadCeldaGuardarProductoPromocion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoPromocion=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdBodegaRelacion=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdProductoRelacion=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductoPromocion() {
		return this.iIdNuevoProductoPromocion;
	}

	public void setiIdNuevoProductoPromocion(Long iIdNuevoProductoPromocion) {
		this.iIdNuevoProductoPromocion = iIdNuevoProductoPromocion;
	}
	
	public Long getidProductoPromocionActual() {
		return this.idProductoPromocionActual;
	}

	public void setidProductoPromocionActual(Long idProductoPromocionActual) {
		this.idProductoPromocionActual = idProductoPromocionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoPromocion getproductopromocion() {
		return this.productopromocion;
	}

	public void setproductopromocion(ProductoPromocion productopromocion) {
		this.productopromocion = productopromocion;
	}
	
	public ProductoPromocion getproductopromocionAux() {
		return this.productopromocionAux;
	}

	public void setproductopromocionAux(ProductoPromocion productopromocionAux) {
		this.productopromocionAux = productopromocionAux;
	}				
	
	public ProductoPromocion getproductopromocionAnterior() {
		return this.productopromocionAnterior;
	}

	public void setproductopromocionAnterior(ProductoPromocion productopromocionAnterior) {
		this.productopromocionAnterior = productopromocionAnterior;
	}	
	
	public ProductoPromocion getproductopromocionTotales() {
		return this.productopromocionTotales;
	}

	public void setproductopromocionTotales(ProductoPromocion productopromocionTotales) {
		this.productopromocionTotales = productopromocionTotales;
	}	
	
	public ProductoPromocion getproductopromocionBean() {
		return this.productopromocionBean;
	}

	public void setproductopromocionBean(ProductoPromocion productopromocionBean) {
		this.productopromocionBean = productopromocionBean;
	}	
	
	public ProductoPromocionParameterReturnGeneral getproductopromocionReturnGeneral() {
		return this.productopromocionReturnGeneral;
	}

	public void setproductopromocionReturnGeneral(ProductoPromocionParameterReturnGeneral productopromocionReturnGeneral) {
		this.productopromocionReturnGeneral = productopromocionReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_bodega_relacionFK_IdBodegaRelacion=-1L;

	public Long getid_bodega_relacionFK_IdBodegaRelacion() {
		return this.id_bodega_relacionFK_IdBodegaRelacion;
	}

	public void setid_bodega_relacionFK_IdBodegaRelacion(Long id_bodega_relacionFK_IdBodegaRelacion) {
		this.id_bodega_relacionFK_IdBodegaRelacion = id_bodega_relacionFK_IdBodegaRelacion;
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

	public Long id_producto_relacionFK_IdProductoRelacion=-1L;

	public Long getid_producto_relacionFK_IdProductoRelacion() {
		return this.id_producto_relacionFK_IdProductoRelacion;
	}

	public void setid_producto_relacionFK_IdProductoRelacion(Long id_producto_relacionFK_IdProductoRelacion) {
		this.id_producto_relacionFK_IdProductoRelacion = id_producto_relacionFK_IdProductoRelacion;
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
	
	
	public ProductoPromocionLogic getProductoPromocionLogic()	{		
		return productopromocionLogic;
	}

	public void setProductoPromocionLogic(ProductoPromocionLogic productopromocionLogic) {
		this.productopromocionLogic = productopromocionLogic;
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
	
	public Boolean getIsEsNuevoProductoPromocion() {
		return isEsNuevoProductoPromocion;
	}

	public void setIsEsNuevoProductoPromocion(Boolean isEsNuevoProductoPromocion) {
		this.isEsNuevoProductoPromocion = isEsNuevoProductoPromocion;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoPromocion() {
		return esParaAccionDesdeFormularioProductoPromocion;
	}
	
	public void setEsParaAccionDesdeFormularioProductoPromocion(Boolean esParaAccionDesdeFormularioProductoPromocion) {
		this.esParaAccionDesdeFormularioProductoPromocion = esParaAccionDesdeFormularioProductoPromocion;
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

			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productopromocionSessionBean.getlidEmpresaActual());
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

			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productopromocionSessionBean.getlidSucursalActual());
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

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(productopromocionSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productopromocionSessionBean.getlidProductoActual());
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

	public void cargarCombosBodegaRelacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegarelacionsForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaRelacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegarelacionLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegarelacionsForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodegaRelacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(productopromocionSessionBean.getlidBodegaRelacionActual());
					this.bodegarelacionsForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosProductoRelacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productorelacionsForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionProductoRelacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productorelacionLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productorelacionsForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProductoRelacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(productopromocionSessionBean.getlidProductoRelacionActual());
					this.productorelacionsForeignKey.add(productoLogic.getProducto());
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

					if(this.productopromocion!=null) {
						this.productopromocion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoPromocion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoPromocionGenerico)throws Exception
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
				jComboBoxid_empresaProductoPromocionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoPromocionGenerico!=null && jComboBoxid_empresaProductoPromocionGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoPromocionGenerico.setSelectedIndex(0);
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

					if(this.productopromocion!=null) {
						this.productopromocion.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoPromocion.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoPromocionGenerico)throws Exception
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
				jComboBoxid_sucursalProductoPromocionGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoPromocionGenerico!=null && jComboBoxid_sucursalProductoPromocionGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoPromocionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.productopromocion!=null) {
						this.productopromocion.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoPromocion.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoPromocion!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoPromocion!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoPromocion.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoPromocionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaProductoPromocionGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoPromocionGenerico!=null && jComboBoxid_bodegaProductoPromocionGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoPromocionGenerico.setSelectedIndex(0);
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

					if(this.productopromocion!=null) {
						this.productopromocion.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoPromocion.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoPromocion!=null) {
						jComboBoxid_productoFK_IdProductoProductoPromocion.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoPromocion!=null) {
							//jComboBoxid_productoFK_IdProductoProductoPromocion.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoPromocion.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoPromocion.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoPromocionGenerico)throws Exception
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
				jComboBoxid_productoProductoPromocionGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoPromocionGenerico!=null && jComboBoxid_productoProductoPromocionGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoPromocionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaRelacionForeignKey(Long idBodegaRelacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegarelacionTemp=null;

			for(Bodega bodegarelacionAux:bodegarelacionsForeignKey) {
				if(bodegarelacionAux.getId()!=null && bodegarelacionAux.getId().equals(idBodegaRelacionSeleccionado)) {
					bodegarelacionTemp=bodegarelacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegarelacionTemp!=null) {

					if(this.productopromocion!=null) {
						this.productopromocion.setBodegaRelacion(bodegarelacionTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setSelectedItem(bodegarelacionTemp);
					}
				} else {
					//jComboBoxid_bodega_relacionProductoPromocion.setSelectedItem(bodegarelacionTemp);
					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodegaRelacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegarelacionTemp!=null && jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion!=null) {
						jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setSelectedItem(bodegarelacionTemp);
					} else {
						if(jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion!=null) {
							//jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setSelectedItem(bodegarelacionTemp);
							if(jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.getItemCount()>0) {
								jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setSelectedIndex(0);
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

	public String getActualBodegaRelacionForeignKeyDescripcion(Long idBodegaRelacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegarelacionTemp=null;

			for(Bodega bodegarelacionAux:bodegarelacionsForeignKey) {
				if(bodegarelacionAux.getId()!=null && bodegarelacionAux.getId().equals(idBodegaRelacionSeleccionado)) {
					bodegarelacionTemp=bodegarelacionAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegarelacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaRelacionForeignKeyGenerico(Long idBodegaRelacionSeleccionado,JComboBox jComboBoxid_bodega_relacionProductoPromocionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegarelacionTemp=null;

			for(Bodega bodegarelacionAux:bodegarelacionsForeignKey) {
				if(bodegarelacionAux.getId()!=null && bodegarelacionAux.getId().equals(idBodegaRelacionSeleccionado)) {
					bodegarelacionTemp=bodegarelacionAux;
					break;
				}
			}

			if(bodegarelacionTemp!=null) {
				jComboBoxid_bodega_relacionProductoPromocionGenerico.setSelectedItem(bodegarelacionTemp);
			} else {
				if(jComboBoxid_bodega_relacionProductoPromocionGenerico!=null && jComboBoxid_bodega_relacionProductoPromocionGenerico.getItemCount()>0) {
					jComboBoxid_bodega_relacionProductoPromocionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoRelacionForeignKey(Long idProductoRelacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productorelacionTemp=null;

			for(Producto productorelacionAux:productorelacionsForeignKey) {
				if(productorelacionAux.getId()!=null && productorelacionAux.getId().equals(idProductoRelacionSeleccionado)) {
					productorelacionTemp=productorelacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productorelacionTemp!=null) {

					if(this.productopromocion!=null) {
						this.productopromocion.setProductoRelacion(productorelacionTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setSelectedItem(productorelacionTemp);
					}
				} else {
					//jComboBoxid_producto_relacionProductoPromocion.setSelectedItem(productorelacionTemp);
					if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
						if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoRelacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(productorelacionTemp!=null && jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion!=null) {
						jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setSelectedItem(productorelacionTemp);
					} else {
						if(jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion!=null) {
							//jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setSelectedItem(productorelacionTemp);
							if(jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.getItemCount()>0) {
								jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setSelectedIndex(0);
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

	public String getActualProductoRelacionForeignKeyDescripcion(Long idProductoRelacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productorelacionTemp=null;

			for(Producto productorelacionAux:productorelacionsForeignKey) {
				if(productorelacionAux.getId()!=null && productorelacionAux.getId().equals(idProductoRelacionSeleccionado)) {
					productorelacionTemp=productorelacionAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productorelacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoRelacionForeignKeyGenerico(Long idProductoRelacionSeleccionado,JComboBox jComboBoxid_producto_relacionProductoPromocionGenerico)throws Exception
	{
		try
		{
			Producto  productorelacionTemp=null;

			for(Producto productorelacionAux:productorelacionsForeignKey) {
				if(productorelacionAux.getId()!=null && productorelacionAux.getId().equals(idProductoRelacionSeleccionado)) {
					productorelacionTemp=productorelacionAux;
					break;
				}
			}

			if(productorelacionTemp!=null) {
				jComboBoxid_producto_relacionProductoPromocionGenerico.setSelectedItem(productorelacionTemp);
			} else {
				if(jComboBoxid_producto_relacionProductoPromocionGenerico!=null && jComboBoxid_producto_relacionProductoPromocionGenerico.getItemCount()>0) {
					jComboBoxid_producto_relacionProductoPromocionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoPromocion productopromocion,JComboBox jComboBoxid_empresaProductoPromocionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoPromocionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoPromocionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productopromocion.setid_empresa(empresaAux.getId());
				productopromocion.setempresa_descripcion(ProductoPromocionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productopromocion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoPromocion productopromocion,JComboBox jComboBoxid_sucursalProductoPromocionGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoPromocionGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoPromocionGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productopromocion.setid_sucursal(sucursalAux.getId());
				productopromocion.setsucursal_descripcion(ProductoPromocionConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productopromocion.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoPromocion productopromocion,JComboBox jComboBoxid_bodegaProductoPromocionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoPromocionGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoPromocionGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productopromocion.setid_bodega(bodegaAux.getId());
				productopromocion.setbodega_descripcion(ProductoPromocionConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productopromocion.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoPromocion productopromocion,JComboBox jComboBoxid_productoProductoPromocionGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoPromocionGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoPromocionGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productopromocion.setid_producto(productoAux.getId());
				productopromocion.setproducto_descripcion(ProductoPromocionConstantesFunciones.getProductoDescripcion(productoAux));
				productopromocion.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaRelacionForeignKey(ProductoPromocion productopromocion,JComboBox jComboBoxid_bodega_relacionProductoPromocionGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodega_relacionProductoPromocionGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodega_relacionProductoPromocionGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productopromocion.setid_bodega_relacion(bodegaAux.getId());
				productopromocion.setbodegarelacion_descripcion(ProductoPromocionConstantesFunciones.getBodegaRelacionDescripcion(bodegaAux));
				productopromocion.setBodegaRelacion(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoRelacionForeignKey(ProductoPromocion productopromocion,JComboBox jComboBoxid_producto_relacionProductoPromocionGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_producto_relacionProductoPromocionGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_producto_relacionProductoPromocionGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productopromocion.setid_producto_relacion(productoAux.getId());
				productopromocion.setproductorelacion_descripcion(ProductoPromocionConstantesFunciones.getProductoRelacionDescripcion(productoAux));
				productopromocion.setProductoRelacion(productoAux);			}
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

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
					}

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
					}

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
					}

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoPromocion.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoPromocion.addItem(bodega);
							}
						}

						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
					}

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoPromocion.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoPromocion.addItem(producto);
							}
						}

						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegaRelacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.removeAllItems();

							for(Bodega bodegarelacion:this.bodegarelacionsForeignKey) {
								this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.addItem(bodegarelacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
					}

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodegaRelacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.removeAllItems();

							for(Bodega bodegarelacion:this.bodegarelacionsForeignKey) {
								this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.addItem(bodegarelacion);
							}
						}

						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductoRelacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.removeAllItems();

							for(Producto productorelacion:this.productorelacionsForeignKey) {
								this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.addItem(productorelacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPromocion!=null) { 
					}

					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoRelacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.removeAllItems();

							for(Producto productorelacion:this.productorelacionsForeignKey) {
								this.jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.addItem(productorelacion);
							}
						}

						if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoPromocion.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoPromocion.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoPromocion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaRelacionForeignKey(Bodega bodegarelacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setSelectedItem(bodegarelacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setSelectedItem(bodegarelacion);
						} else {
							this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoRelacionForeignKey(Producto productorelacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setSelectedItem(productorelacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setSelectedItem(productorelacion);
						} else {
							this.jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoPromocion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoPromocionConstantesFunciones.refrescarForeignKeysDescripcionesProductoPromocion(this.productopromocionLogic.getProductoPromocions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoPromocionConstantesFunciones.refrescarForeignKeysDescripcionesProductoPromocion(this.productopromocions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productopromocionLogic.setProductoPromocions(this.productopromocions);
			productopromocionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoPromocionParameterReturnGeneral getProductoPromocionParameterGeneral() {
		return this.productopromocionParameterGeneral;
	}
	
	public void setProductoPromocionParameterGeneral(ProductoPromocionParameterReturnGeneral productopromocionParameterGeneral) {
		this.productopromocionParameterGeneral = productopromocionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoPromocion() {
		return isPermisoTodoProductoPromocion;
	}

	public void setIsPermisoTodoProductoPromocion(Boolean isPermisoTodoProductoPromocion) {
		this.isPermisoTodoProductoPromocion = isPermisoTodoProductoPromocion;
	}

	public Boolean getIsPermisoNuevoProductoPromocion() {
		return isPermisoNuevoProductoPromocion;
	}

	public void setIsPermisoNuevoProductoPromocion(Boolean isPermisoNuevoProductoPromocion) {
		this.isPermisoNuevoProductoPromocion = isPermisoNuevoProductoPromocion;
	}

	public Boolean getIsPermisoActualizarProductoPromocion() {
		return isPermisoActualizarProductoPromocion;
	}

	public void setIsPermisoActualizarProductoPromocion(Boolean isPermisoActualizarProductoPromocion) {
		this.isPermisoActualizarProductoPromocion = isPermisoActualizarProductoPromocion;
	}

	public Boolean getIsPermisoEliminarProductoPromocion() {
		return isPermisoEliminarProductoPromocion;
	}

	public void setIsPermisoEliminarProductoPromocion(Boolean isPermisoEliminarProductoPromocion) {
		this.isPermisoEliminarProductoPromocion = isPermisoEliminarProductoPromocion;
	}

	public Boolean getIsPermisoGuardarCambiosProductoPromocion() {
		return isPermisoGuardarCambiosProductoPromocion;
	}

	public void setIsPermisoGuardarCambiosProductoPromocion(Boolean isPermisoGuardarCambiosProductoPromocion) {
		this.isPermisoGuardarCambiosProductoPromocion = isPermisoGuardarCambiosProductoPromocion;
	}
	
	public Boolean getIsPermisoConsultaProductoPromocion() {
		return isPermisoConsultaProductoPromocion;
	}

	public void setIsPermisoConsultaProductoPromocion(Boolean isPermisoConsultaProductoPromocion) {
		this.isPermisoConsultaProductoPromocion = isPermisoConsultaProductoPromocion;
	}

	public Boolean getIsPermisoBusquedaProductoPromocion() {
		return isPermisoBusquedaProductoPromocion;
	}

	public void setIsPermisoBusquedaProductoPromocion(Boolean isPermisoBusquedaProductoPromocion) {
		this.isPermisoBusquedaProductoPromocion = isPermisoBusquedaProductoPromocion;
	}

	public Boolean getIsPermisoReporteProductoPromocion() {
		return isPermisoReporteProductoPromocion;
	}

	public void setIsPermisoReporteProductoPromocion(Boolean isPermisoReporteProductoPromocion) {
		this.isPermisoReporteProductoPromocion = isPermisoReporteProductoPromocion;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoPromocion() {
		return isPermisoPaginacionMedioProductoPromocion;
	}

	public void setIsPermisoPaginacionMedioProductoPromocion(Boolean isPermisoPaginacionMedioProductoPromocion) {
		this.isPermisoPaginacionMedioProductoPromocion = isPermisoPaginacionMedioProductoPromocion;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoPromocion() {
		return isPermisoPaginacionTodoProductoPromocion;
	}

	public void setIsPermisoPaginacionTodoProductoPromocion(Boolean isPermisoPaginacionTodoProductoPromocion) {
		this.isPermisoPaginacionTodoProductoPromocion = isPermisoPaginacionTodoProductoPromocion;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoPromocion() {
		return isPermisoPaginacionAltoProductoPromocion;
	}

	public void setIsPermisoPaginacionAltoProductoPromocion(Boolean isPermisoPaginacionAltoProductoPromocion) {
		this.isPermisoPaginacionAltoProductoPromocion = isPermisoPaginacionAltoProductoPromocion;
	}
	
	public Boolean getIsPermisoCopiarProductoPromocion() {
		return isPermisoCopiarProductoPromocion;
	}

	public void setIsPermisoCopiarProductoPromocion(Boolean isPermisoCopiarProductoPromocion) {
		this.isPermisoCopiarProductoPromocion = isPermisoCopiarProductoPromocion;
	}
	
	public Boolean getIsPermisoVerFormProductoPromocion() {
		return isPermisoVerFormProductoPromocion;
	}

	public void setIsPermisoVerFormProductoPromocion(Boolean isPermisoVerFormProductoPromocion) {
		this.isPermisoVerFormProductoPromocion = isPermisoVerFormProductoPromocion;
	}
	
	public Boolean getIsPermisoDuplicarProductoPromocion() {
		return isPermisoDuplicarProductoPromocion;
	}

	public void setIsPermisoDuplicarProductoPromocion(Boolean isPermisoDuplicarProductoPromocion) {
		this.isPermisoDuplicarProductoPromocion = isPermisoDuplicarProductoPromocion;
	}
	
	public Boolean getIsPermisoOrdenProductoPromocion() {
		return isPermisoOrdenProductoPromocion;
	}

	public void setIsPermisoOrdenProductoPromocion(Boolean isPermisoOrdenProductoPromocion) {
		this.isPermisoOrdenProductoPromocion = isPermisoOrdenProductoPromocion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoPromocion() {
		return isVisibilidadCeldaNuevoProductoPromocion;
	}

	public void setIsVisibilidadCeldaNuevoProductoPromocion(Boolean isVisibilidadCeldaNuevoProductoPromocion) {
		this.isVisibilidadCeldaNuevoProductoPromocion = isVisibilidadCeldaNuevoProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoPromocion() {
		return isVisibilidadCeldaDuplicarProductoPromocion;
	}

	public void setIsVisibilidadCeldaDuplicarProductoPromocion(Boolean isVisibilidadCeldaDuplicarProductoPromocion) {
		this.isVisibilidadCeldaDuplicarProductoPromocion = isVisibilidadCeldaDuplicarProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoPromocion() {
		return isVisibilidadCeldaCopiarProductoPromocion;
	}

	public void setIsVisibilidadCeldaCopiarProductoPromocion(Boolean isVisibilidadCeldaCopiarProductoPromocion) {
		this.isVisibilidadCeldaCopiarProductoPromocion = isVisibilidadCeldaCopiarProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoPromocion() {
		return isVisibilidadCeldaVerFormProductoPromocion;
	}

	public void setIsVisibilidadCeldaVerFormProductoPromocion(Boolean isVisibilidadCeldaVerFormProductoPromocion) {
		this.isVisibilidadCeldaVerFormProductoPromocion = isVisibilidadCeldaVerFormProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoPromocion() {
		return isVisibilidadCeldaOrdenProductoPromocion;
	}

	public void setIsVisibilidadCeldaOrdenProductoPromocion(Boolean isVisibilidadCeldaOrdenProductoPromocion) {
		this.isVisibilidadCeldaOrdenProductoPromocion = isVisibilidadCeldaOrdenProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoPromocion() {
		return isVisibilidadCeldaNuevoRelacionesProductoPromocion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoPromocion(Boolean isVisibilidadCeldaNuevoRelacionesProductoPromocion) {
		this.isVisibilidadCeldaNuevoRelacionesProductoPromocion = isVisibilidadCeldaNuevoRelacionesProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoPromocion() {
		return isVisibilidadCeldaModificarProductoPromocion;
	}

	public void setIsVisibilidadCeldaModificarProductoPromocion(Boolean isVisibilidadCeldaModificarProductoPromocion) {
		this.isVisibilidadCeldaModificarProductoPromocion = isVisibilidadCeldaModificarProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoPromocion() {
		return isVisibilidadCeldaActualizarProductoPromocion;
	}

	public void setIsVisibilidadCeldaActualizarProductoPromocion(Boolean isVisibilidadCeldaActualizarProductoPromocion) {
		this.isVisibilidadCeldaActualizarProductoPromocion = isVisibilidadCeldaActualizarProductoPromocion;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoPromocion() {
		return isVisibilidadCeldaEliminarProductoPromocion;
	}

	public void setIsVisibilidadCeldaEliminarProductoPromocion(Boolean isVisibilidadCeldaEliminarProductoPromocion) {
		this.isVisibilidadCeldaEliminarProductoPromocion = isVisibilidadCeldaEliminarProductoPromocion;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoPromocion() {
		return isVisibilidadCeldaCancelarProductoPromocion;
	}

	public void setIsVisibilidadCeldaCancelarProductoPromocion(Boolean isVisibilidadCeldaCancelarProductoPromocion) {
		this.isVisibilidadCeldaCancelarProductoPromocion = isVisibilidadCeldaCancelarProductoPromocion;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoPromocion() {
		return isVisibilidadCeldaGuardarProductoPromocion;
	}

	public void setIsVisibilidadCeldaGuardarProductoPromocion(Boolean isVisibilidadCeldaGuardarProductoPromocion) {
		this.isVisibilidadCeldaGuardarProductoPromocion = isVisibilidadCeldaGuardarProductoPromocion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoPromocion() {
		return isVisibilidadCeldaGuardarCambiosProductoPromocion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoPromocion(Boolean isVisibilidadCeldaGuardarCambiosProductoPromocion) {
		this.isVisibilidadCeldaGuardarCambiosProductoPromocion = isVisibilidadCeldaGuardarCambiosProductoPromocion;
	}
		
	public ProductoPromocionSessionBean getproductopromocionSessionBean() {
		return this.productopromocionSessionBean;
	}
	
	public void setproductopromocionSessionBean(ProductoPromocionSessionBean productopromocionSessionBean) {
		this.productopromocionSessionBean=productopromocionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdBodegaRelacion() {
		return this.isVisibilidadFK_IdBodegaRelacion;
	}

	public void setisVisibilidadFK_IdBodegaRelacion(Boolean isVisibilidadFK_IdBodegaRelacion) {
		this.isVisibilidadFK_IdBodegaRelacion=isVisibilidadFK_IdBodegaRelacion;
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

	public Boolean getisVisibilidadFK_IdProductoRelacion() {
		return this.isVisibilidadFK_IdProductoRelacion;
	}

	public void setisVisibilidadFK_IdProductoRelacion(Boolean isVisibilidadFK_IdProductoRelacion) {
		this.isVisibilidadFK_IdProductoRelacion=isVisibilidadFK_IdProductoRelacion;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(ProductoPromocion productopromocion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productopromocion,null);
				this.setActualParaGuardarSucursalForeignKey(productopromocion,null);
				this.setActualParaGuardarBodegaForeignKey(productopromocion,null);
				this.setActualParaGuardarProductoForeignKey(productopromocion,null);
				this.setActualParaGuardarBodegaRelacionForeignKey(productopromocion,null);
				this.setActualParaGuardarProductoRelacionForeignKey(productopromocion,null);
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
	
	public void bugActualizarReferenciaActual(ProductoPromocion productopromocion,ProductoPromocion productopromocionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoPromocion(productopromocion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productopromocionAux.setId(productopromocion.getId());
		productopromocionAux.setVersionRow(productopromocion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoPromocion();
		
			int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productopromocionValidator.getInvalidValues(this.productopromocion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productopromocionLogic.setDatosCliente(datosCliente);
			productopromocionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productopromocionAux=new  ProductoPromocion();
				
				productopromocionAux.setIsNew(true);
				productopromocionAux.setIsChanged(true);
				
				productopromocionAux.setProductoPromocionOriginal(this.productopromocion);
				
				productopromocionAux.setId(this.productopromocion.getId());	
				productopromocionAux.setVersionRow(this.productopromocion.getVersionRow());	
				productopromocionAux.setid_empresa(this.productopromocion.getid_empresa());	
				productopromocionAux.setid_sucursal(this.productopromocion.getid_sucursal());	
				productopromocionAux.setid_bodega(this.productopromocion.getid_bodega());	
				productopromocionAux.setid_producto(this.productopromocion.getid_producto());	
				productopromocionAux.setid_bodega_relacion(this.productopromocion.getid_bodega_relacion());	
				productopromocionAux.setid_producto_relacion(this.productopromocion.getid_producto_relacion());	
				productopromocionAux.setcantidad(this.productopromocion.getcantidad());	
				productopromocionAux.setprecio(this.productopromocion.getprecio());	
				productopromocionAux.setporcentaje(this.productopromocion.getporcentaje());	
				productopromocionAux.setdescripcion(this.productopromocion.getdescripcion());	
				productopromocionAux.setdescripcion2(this.productopromocion.getdescripcion2());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productopromocionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productopromocionAux,productopromocionLogic.getProductoPromocions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopromocionAux,productopromocions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productopromocionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.saveProductoPromocions();//WithConnection
						//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productopromocion,productopromocionAux);
					
					this.refrescarForeignKeysDescripcionesProductoPromocion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productopromocionLogic.saveProductoPromocionRelaciones(productopromocionAux);//WithConnection
								//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productopromocion,productopromocionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productopromocionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productopromocionAux,productopromocionLogic.getProductoPromocions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productopromocionAux,productopromocions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productopromocion,productopromocionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productopromocionAux=new  ProductoPromocion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productopromocionSessionBean.getEsGuardarRelacionado() 
					|| (this.productopromocionSessionBean.getEsGuardarRelacionado() && this.productopromocion.getId()>=0)) {
						
					productopromocionAux.setIsNew(false);
				}
				
				productopromocionAux.setIsDeleted(false);
			
				productopromocionAux.setId(this.productopromocion.getId());	
				productopromocionAux.setVersionRow(this.productopromocion.getVersionRow());	
				productopromocionAux.setid_empresa(this.productopromocion.getid_empresa());	
				productopromocionAux.setid_sucursal(this.productopromocion.getid_sucursal());	
				productopromocionAux.setid_bodega(this.productopromocion.getid_bodega());	
				productopromocionAux.setid_producto(this.productopromocion.getid_producto());	
				productopromocionAux.setid_bodega_relacion(this.productopromocion.getid_bodega_relacion());	
				productopromocionAux.setid_producto_relacion(this.productopromocion.getid_producto_relacion());	
				productopromocionAux.setcantidad(this.productopromocion.getcantidad());	
				productopromocionAux.setprecio(this.productopromocion.getprecio());	
				productopromocionAux.setporcentaje(this.productopromocion.getporcentaje());	
				productopromocionAux.setdescripcion(this.productopromocion.getdescripcion());	
				productopromocionAux.setdescripcion2(this.productopromocion.getdescripcion2());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productopromocionAux,productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopromocionAux,productopromocions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productopromocionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.saveProductoPromocions();//WithConnection
						//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productopromocion,productopromocionAux);
					
					this.refrescarForeignKeysDescripcionesProductoPromocion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productopromocionLogic.saveProductoPromocionRelaciones(productopromocionAux);//WithConnection
								//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productopromocion,productopromocionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productopromocionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productopromocionAux,productopromocionLogic.getProductoPromocions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productopromocionAux,productopromocions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productopromocion,productopromocionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productopromocionAux=new  ProductoPromocion();
				
				productopromocionAux.setIsNew(false);
				productopromocionAux.setIsChanged(false);
				
				productopromocionAux.setIsDeleted(true);
				
				productopromocionAux.setId(this.productopromocion.getId());	
				productopromocionAux.setVersionRow(this.productopromocion.getVersionRow());	
				productopromocionAux.setid_empresa(this.productopromocion.getid_empresa());	
				productopromocionAux.setid_sucursal(this.productopromocion.getid_sucursal());	
				productopromocionAux.setid_bodega(this.productopromocion.getid_bodega());	
				productopromocionAux.setid_producto(this.productopromocion.getid_producto());	
				productopromocionAux.setid_bodega_relacion(this.productopromocion.getid_bodega_relacion());	
				productopromocionAux.setid_producto_relacion(this.productopromocion.getid_producto_relacion());	
				productopromocionAux.setcantidad(this.productopromocion.getcantidad());	
				productopromocionAux.setprecio(this.productopromocion.getprecio());	
				productopromocionAux.setporcentaje(this.productopromocion.getporcentaje());	
				productopromocionAux.setdescripcion(this.productopromocion.getdescripcion());	
				productopromocionAux.setdescripcion2(this.productopromocion.getdescripcion2());	
				
				if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productopromocionAux.getId()>=0) {	
						this.productopromocionsEliminados.add(productopromocionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productopromocionAux,productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopromocionAux,productopromocions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productopromocionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.saveProductoPromocions();//WithConnection
						//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productopromocionLogic.saveProductoPromocionRelaciones(productopromocionAux);//WithConnection
								//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
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
							if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productopromocionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productopromocionAux,productopromocionLogic.getProductoPromocions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productopromocionAux,productopromocions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getProductoPromocions().addAll(this.productopromocionsEliminados);
					
					productopromocionLogic.saveProductoPromocions();//WithConnection
					//productopromocionLogic.getSetVersionRowProductoPromocions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoPromocion();
				
				this.productopromocionsEliminados= new ArrayList<ProductoPromocion>();		
			}
			
			if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Promocion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productopromocion=productopromocionAux;
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
      		//this.finishProcessProductoPromocion();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoPromocion productopromocionLocal) throws Exception {
		
		if(this.productopromocionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoPromocion productopromocionLocal) throws Exception {	
		if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productopromocionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productopromocionLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productopromocionLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productopromocionLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegarelacionBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegarelacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegarelacionBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegarelacionBeanSwingJInternalFrameLocal.actualizarLista(bodegarelacionBeanSwingJInternalFrameLocal.bodega,this.bodegarelacionsForeignKey);

				bodegarelacionBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegarelacionBeanSwingJInternalFrameLocal.bodega);

				productopromocionLocal.setBodegaRelacion(bodegarelacionBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodegaRelacion();
				this.cargarCombosFrameBodegaRelacionsForeignKey("Formulario");
				this.setActualBodegaRelacionForeignKey(bodegarelacionBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productorelacionBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productorelacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productorelacionBeanSwingJInternalFrameLocal.getproducto(),true);
				productorelacionBeanSwingJInternalFrameLocal.actualizarLista(productorelacionBeanSwingJInternalFrameLocal.producto,this.productorelacionsForeignKey);

				productorelacionBeanSwingJInternalFrameLocal.actualizarRelaciones(productorelacionBeanSwingJInternalFrameLocal.producto);

				productopromocionLocal.setProductoRelacion(productorelacionBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProductoRelacion();
				this.cargarCombosFrameProductoRelacionsForeignKey("Formulario");
				this.setActualProductoRelacionForeignKey(productorelacionBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoPromocionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productopromocionValidator.getInvalidValues(this.productopromocion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoPromocion productopromocion,List<ProductoPromocion> productopromocions) throws Exception {
		try	{		
			ProductoPromocionConstantesFunciones.actualizarLista(productopromocion,productopromocions,this.productopromocionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoPromocion productopromocion,List<ProductoPromocion> productopromocions) throws Exception {
		try	{			
			ProductoPromocionConstantesFunciones.actualizarSelectedLista(productopromocion,productopromocions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoPromocion> productopromocionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productopromocionsLocal=this.productopromocionLogic.getProductoPromocions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productopromocionsLocal=this.productopromocions;
			}
			//ARCHITECTURE
		
			for(ProductoPromocion productopromocionLocal:productopromocionsLocal) {
				if(this.permiteMantenimiento(productopromocionLocal) && productopromocionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoPromocionConstantesFunciones.getProductoPromocionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_empresaProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_sucursalProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_bodegaProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_productoProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.IDBODEGARELACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_bodega_relacionProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.IDPRODUCTORELACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_producto_relacionProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelcantidadProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelprecioProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelporcentajeProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabeldescripcionProductoPromocion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPromocionConstantesFunciones.DESCRIPCION2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabeldescripcion2ProductoPromocion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_empresaProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_sucursalProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_bodegaProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_productoProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_bodega_relacionProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelid_producto_relacionProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelcantidadProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelprecioProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabelporcentajeProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabeldescripcionProductoPromocion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPromocion.jLabeldescripcion2ProductoPromocion,"");
		
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
		this.iIdNuevoProductoPromocion--;	
		
		
		this.productopromocionAux=new ProductoPromocion();
		
		this.productopromocionAux.setId(this.iIdNuevoProductoPromocion);
		this.productopromocionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productopromocionLogic.getProductoPromocions().add(this.productopromocionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productopromocions.add(this.productopromocionAux);
		}
		//ARCHITECTURE
		
		this.productopromocion=this.productopromocionAux;
		
		if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoPromocion(this.productopromocion);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoPromocion(this.productopromocion);
		}
				
		//this.setDefaultControlesProductoPromocion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoPromocion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoPromocion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoPromocion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoPromocion(this.productopromocionBean,this.productopromocion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoPromocionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
			classes=ProductoPromocionConstantesFunciones.getClassesRelationshipsOfProductoPromocion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productopromocionReturnGeneral=productopromocionLogic.procesarEventosProductoPromocionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productopromocionLogic.getProductoPromocions(),this.productopromocion,this.productopromocionParameterGeneral,this.isEsNuevoProductoPromocion,classes);//this.productopromocionLogic.getProductoPromocion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoPromocion(this.productopromocionReturnGeneral,this.productopromocionBean,false);
		
		if(this.productopromocionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion());
		}
		
		if(this.productopromocionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion(),classes);//this.productopromocionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoPromocion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoPromocion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.RecargarFormProductoPromocion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoPromocion(false);
						
			if(productopromocionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoPromocion();
			}
			
			this.actualizarVisualTableDatosProductoPromocion();
			
			this.jTableDatosProductoPromocion.setRowSelectionInterval(this.getIndiceNuevoProductoPromocion(), this.getIndiceNuevoProductoPromocion());
			
			this.seleccionarFilaTablaProductoPromocionActual();
						
			this.actualizarEstadoCeldasBotonesProductoPromocion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoPromocion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarcantidadProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarprecioProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarporcentajeProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activardescripcionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activardescripcion2ProductoPromocion);	
		//
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarid_empresaProductoPromocion);//
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarid_sucursalProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarid_bodegaProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarid_productoProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarid_bodega_relacionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setEnabled(isHabilitar && this.productopromocionConstantesFunciones.activarid_producto_relacionProductoPromocion);
	};
	
	public void setDefaultControlesProductoPromocion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoPromocion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productopromocionSessionBean.setConGuardarRelaciones(true);			
			this.productopromocionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.setVisible(true);
			
					
		} else {
			//this.productopromocionSessionBean.setConGuardarRelaciones(false);			
			this.productopromocionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoPromocion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
				if(productopromocionAux.getId().equals(this.iIdNuevoProductoPromocion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPromocion productopromocionAux:this.productopromocions) {
				if(productopromocionAux.getId().equals(this.iIdNuevoProductoPromocion)) {
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
	
	public int getIndiceActualProductoPromocion(ProductoPromocion productopromocion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
				if(productopromocionAux.getId().equals(productopromocion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPromocion productopromocionAux:this.productopromocions) {
				if(productopromocionAux.getId().equals(productopromocion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoPromocion(ProductoPromocion productopromocionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
				if(productopromocionAux.getProductoPromocionOriginal().getId().equals(productopromocionOriginal.getId())) {
					existe=true;
					productopromocionOriginal.setId(productopromocionAux.getId());
					productopromocionOriginal.setVersionRow(productopromocionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPromocion productopromocionAux:this.productopromocions) {
				if(productopromocionAux.getProductoPromocionOriginal().getId().equals(productopromocionOriginal.getId())) {
					existe=true;
					productopromocionOriginal.setId(productopromocionAux.getId());
					productopromocionOriginal.setVersionRow(productopromocionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoPromocion(Boolean esParaCancelar) throws Exception {
		productopromocionsAux=new ArrayList<ProductoPromocion>();
		productopromocionAux=new ProductoPromocion();
		
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
					if(productopromocionAux.getId()<0) {
						productopromocionsAux.add(productopromocionAux);
					}		
				}
				this.iIdNuevoProductoPromocion=0L;
				this.productopromocionLogic.getProductoPromocions().removeAll(productopromocionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPromocion productopromocionAux:this.productopromocions) {
					if(productopromocionAux.getId()<0) {
						productopromocionsAux.add(productopromocionAux);
					}		
				}
				this.iIdNuevoProductoPromocion=0L;
				this.productopromocions.removeAll(productopromocionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoPromocion 
					&& this.productopromocionLogic.getProductoPromocions().size()>0
					) {
					productopromocionAux=this.productopromocionLogic.getProductoPromocions().get(this.productopromocionLogic.getProductoPromocions().size() - 1);
				
					if(productopromocionAux.getId()<0) {
						this.productopromocionLogic.getProductoPromocions().remove(productopromocionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoPromocion && this.productopromocions.size()>0) {
					productopromocionAux=this.productopromocions.get(this.productopromocions.size() - 1);
				
					if(productopromocionAux.getId()<0) {
						this.productopromocions.remove(productopromocionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoPromocion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productopromocion.getId()<0) {
				this.productopromocionLogic.getProductoPromocions().remove(this.productopromocion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productopromocion.getId()<0) {
				this.productopromocions.remove(this.productopromocion);
			}
		}			
	}
	
	public void setEstadosInicialesProductoPromocion(List<ProductoPromocion> productopromocionsAux) throws Exception {
		ProductoPromocionConstantesFunciones.setEstadosInicialesProductoPromocion(productopromocionsAux);
	}
	
	public void setEstadosInicialesProductoPromocion(ProductoPromocion productopromocionAux) throws Exception {
		ProductoPromocionConstantesFunciones.setEstadosInicialesProductoPromocion(productopromocionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoPromocionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoPromocion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoPromocionActual()) {
				if(!this.isEsNuevoProductoPromocion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoPromocion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoPromocion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoPromocionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Promocion ?", "MANTENIMIENTO DE Promocion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoPromocion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoPromocion productopromocion) throws Exception {
		ProductoPromocionConstantesFunciones.seleccionarAsignar(this.productopromocion,productopromocion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoPromocion=this.isPermisoActualizarOriginalProductoPromocion;
			
			
			this.seleccionarAsignar(productopromocion);
			
			

			idProductoActual=productopromocion.getid_producto();
			this.seleccionarProductoActual();

			idProductoRelacionActual=productopromocion.getid_producto_relacion();
			this.seleccionarProductoRelacionActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoPromocionConstantesFunciones.quitarEspaciosProductoPromocion(this.productopromocion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoPromocion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productopromocionSessionBean.setsFuncionBusquedaRapida(this.productopromocionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarProductoRelacionActual() throws Exception {
		try	{
			Producto productorelacionAux=new Producto();

			if(this.idProductoRelacionActual != null && this.idProductoRelacionActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productorelacionLogic.getEntityWithConnection(this.idProductoRelacionActual);
					productorelacionAux= productorelacionLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productorelacionsForeignKey=new ArrayList<Producto>();
				productorelacionsForeignKey.add(productorelacionAux);
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
			if(this.isEsNuevoProductoPromocion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoPromocion(esParaCancelar);				
				this.cancelarNuevoProductoPromocion(esParaCancelar);								
			}
			
			this.productopromocion=new ProductoPromocion();
			
			this.inicializarProductoPromocion();
			
			this.actualizarEstadoCeldasBotonesProductoPromocion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoPromocion() throws Exception {
		try {
			ProductoPromocionConstantesFunciones.inicializarProductoPromocion(this.productopromocion);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productopromocionLogic.getProductoPromocions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoPromocions(String sAccionBusqueda,List<ProductoPromocion> productopromocionsParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoPromocion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoPromocionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoPromocionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoPromocion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Promocions");		
		parameters.put("busquedapor", ProductoPromocionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoPromocion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoPromocionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoPromocionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoPromocion=new JRBeanArrayDataSource(ProductoPromocionJInternalFrame.TraerProductoPromocionBeans(productopromocionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoPromocion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoPromocionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoPromocionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoPromocionBean.TraerProductoPromocionBeans(productopromocionsParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoPromocions(sAccionBusqueda,sTipoArchivoReporte,productopromocionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoPromocions(sAccionBusqueda,sTipoArchivoReporte,productopromocionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoPromocionActionPerformed(null);
					//this.generarExcelReporteProductoPromocions(sAccionBusqueda,sTipoArchivoReporte,productopromocionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoPromocions(sAccionBusqueda,sTipoArchivoReporte,productopromocionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoPromocions(sAccionBusqueda,sTipoArchivoReporte,productopromocionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoPromocions(sAccionBusqueda,sTipoArchivoReporte,productopromocionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoPromocions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoPromocion> productopromocionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoPromocions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoPromocion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoPromocion productopromocion : productopromocionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoPromocionConstantesFunciones.generarExcelReporteDataProductoPromocion("NORMAL",row,workbook,productopromocion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoPromocion(String sTipo,Row row,Workbook workbook) {
		
		ProductoPromocionConstantesFunciones.generarExcelReporteHeaderProductoPromocion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoPromocions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoPromocion> productopromocionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoPromocions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoPromocion productopromocion : productopromocionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoPromocionConstantesFunciones.getProductoPromocionDescripcion(productopromocion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getbodegarelacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getproductorelacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopromocion.getdescripcion2());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoPromocions(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoPromocion> productopromocionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoPromocion> productopromocionsRespaldo=null;
		
		classes=ProductoPromocionConstantesFunciones.getClassesRelationshipsOfProductoPromocion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productopromocionLogic.setDatosCliente(this.datosCliente);
		this.productopromocionLogic.setDatosDeep(this.datosDeep);
		this.productopromocionLogic.setIsConDeep(true);
		
		productopromocionsRespaldo=this.productopromocionLogic.getProductoPromocions();
		
		this.productopromocionLogic.setProductoPromocions(productopromocionsParaReportes);	
		this.productopromocionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productopromocionsParaReportes=this.productopromocionLogic.getProductoPromocions();
		this.productopromocionLogic.setProductoPromocions(productopromocionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoPromocions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoPromocion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoPromocion productopromocion : productopromocionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoPromocion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoPromocionConstantesFunciones.generarExcelReporteDataProductoPromocion("NORMAL",row,workbook,productopromocion,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoPromocionConstantesFunciones.getProductoPromocionDescripcion(productopromocion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoPromocion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoPromocion() throws Exception {		
		this.startProcessProductoPromocion(true);
	}
	
	public void startProcessProductoPromocion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoPromocion ,this.jPanelParametrosReportesProductoPromocion, this.jScrollPanelDatosProductoPromocion,this.jPanelPaginacionProductoPromocion, this.jScrollPanelDatosEdicionProductoPromocion, this.jPanelAccionesProductoPromocion,this.jPanelAccionesFormularioProductoPromocion,this.jmenuBarProductoPromocion,this.jmenuBarDetalleProductoPromocion,this.jTtoolBarProductoPromocion,this.jTtoolBarDetalleProductoPromocion);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoPromocion=this.jTabbedPaneBusquedasProductoPromocion; 
		
		final JPanel jPanelParametrosReportesProductoPromocion=this.jPanelParametrosReportesProductoPromocion;
		//final JScrollPane jScrollPanelDatosProductoPromocion=this.jScrollPanelDatosProductoPromocion;
		final JTable jTableDatosProductoPromocion=this.jTableDatosProductoPromocion;		
		final JPanel jPanelPaginacionProductoPromocion=this.jPanelPaginacionProductoPromocion;
		//final JScrollPane jScrollPanelDatosEdicionProductoPromocion=this.jScrollPanelDatosEdicionProductoPromocion;
		final JPanel jPanelAccionesProductoPromocion=this.jPanelAccionesProductoPromocion;
		
		JPanel jPanelCamposAuxiliarProductoPromocion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoPromocion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			jPanelCamposAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jPanelCamposProductoPromocion;
			jPanelAccionesFormularioAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jPanelAccionesFormularioProductoPromocion;
		}
		
		final JPanel jPanelCamposProductoPromocion=jPanelCamposAuxiliarProductoPromocion;
		final JPanel jPanelAccionesFormularioProductoPromocion=jPanelAccionesFormularioAuxiliarProductoPromocion;
		
		
		final JMenuBar jmenuBarProductoPromocion=this.jmenuBarProductoPromocion;
		final JToolBar jTtoolBarProductoPromocion=this.jTtoolBarProductoPromocion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoPromocion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoPromocion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			jmenuBarDetalleAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jmenuBarDetalleProductoPromocion;
			jTtoolBarDetalleAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jTtoolBarDetalleProductoPromocion;
		}
		
		final JMenuBar jmenuBarDetalleProductoPromocion=jmenuBarDetalleAuxiliarProductoPromocion;
		final JToolBar jTtoolBarDetalleProductoPromocion=jTtoolBarDetalleAuxiliarProductoPromocion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoPromocion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoPromocion;
			processRunnable.jTableDatos=jTableDatosProductoPromocion;
			processRunnable.jPanelCampos=jPanelCamposProductoPromocion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoPromocion;
			processRunnable.jPanelAcciones=jPanelAccionesProductoPromocion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoPromocion;
			
			
			processRunnable.jmenuBar=jmenuBarProductoPromocion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoPromocion;
			processRunnable.jTtoolBar=jTtoolBarProductoPromocion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoPromocion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoPromocion ,jPanelParametrosReportesProductoPromocion,jTableDatosProductoPromocion, /*jScrollPanelDatosProductoPromocion,*/jPanelCamposProductoPromocion,jPanelPaginacionProductoPromocion, /*jScrollPanelDatosEdicionProductoPromocion,*/ jPanelAccionesProductoPromocion,jPanelAccionesFormularioProductoPromocion,jmenuBarProductoPromocion,jmenuBarDetalleProductoPromocion,jTtoolBarProductoPromocion,jTtoolBarDetalleProductoPromocion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoPromocion ,jPanelParametrosReportesProductoPromocion, jScrollPanelDatosProductoPromocion,jPanelPaginacionProductoPromocion, jScrollPanelDatosEdicionProductoPromocion, jPanelAccionesProductoPromocion,jPanelAccionesFormularioProductoPromocion,jmenuBarProductoPromocion,jmenuBarDetalleProductoPromocion,jTtoolBarProductoPromocion,jTtoolBarDetalleProductoPromocion);
						
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
	
	public void finishProcessProductoPromocion() {// throws Exception 
		this.finishProcessProductoPromocion(true);
	}
	
	public void finishProcessProductoPromocion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoPromocion ,this.jPanelParametrosReportesProductoPromocion, this.jScrollPanelDatosProductoPromocion,this.jPanelPaginacionProductoPromocion, this.jScrollPanelDatosEdicionProductoPromocion, this.jPanelAccionesProductoPromocion,this.jPanelAccionesFormularioProductoPromocion,this.jmenuBarProductoPromocion,this.jmenuBarDetalleProductoPromocion,this.jTtoolBarProductoPromocion,this.jTtoolBarDetalleProductoPromocion);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoPromocion=this.jTabbedPaneBusquedasProductoPromocion; 
		
		final JPanel jPanelParametrosReportesProductoPromocion=this.jPanelParametrosReportesProductoPromocion;
		//final JScrollPane jScrollPanelDatosProductoPromocion=this.jScrollPanelDatosProductoPromocion;
		final JTable jTableDatosProductoPromocion=this.jTableDatosProductoPromocion;		
		final JPanel jPanelPaginacionProductoPromocion=this.jPanelPaginacionProductoPromocion;
		//final JScrollPane jScrollPanelDatosEdicionProductoPromocion=this.jScrollPanelDatosEdicionProductoPromocion;
		final JPanel jPanelAccionesProductoPromocion=this.jPanelAccionesProductoPromocion;
		
		JPanel jPanelCamposAuxiliarProductoPromocion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoPromocion=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			jPanelCamposAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jPanelCamposProductoPromocion;
			jPanelAccionesFormularioAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jPanelAccionesFormularioProductoPromocion;
		}
		
		final JPanel jPanelCamposProductoPromocion=jPanelCamposAuxiliarProductoPromocion;
		final JPanel jPanelAccionesFormularioProductoPromocion=jPanelAccionesFormularioAuxiliarProductoPromocion;
		
		
		final JMenuBar jmenuBarProductoPromocion=this.jmenuBarProductoPromocion;		
		final JToolBar jTtoolBarProductoPromocion=this.jTtoolBarProductoPromocion;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoPromocion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoPromocion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			jmenuBarDetalleAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jmenuBarDetalleProductoPromocion;
			jTtoolBarDetalleAuxiliarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jTtoolBarDetalleProductoPromocion;		
		}
		
		final JMenuBar jmenuBarDetalleProductoPromocion=jmenuBarDetalleAuxiliarProductoPromocion;
		final JToolBar jTtoolBarDetalleProductoPromocion=jTtoolBarDetalleAuxiliarProductoPromocion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoPromocion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoPromocion;
			processRunnable.jTableDatos=jTableDatosProductoPromocion;
			processRunnable.jPanelCampos=jPanelCamposProductoPromocion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoPromocion;
			processRunnable.jPanelAcciones=jPanelAccionesProductoPromocion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoPromocion;
			
			
			processRunnable.jmenuBar=jmenuBarProductoPromocion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoPromocion;
			processRunnable.jTtoolBar=jTtoolBarProductoPromocion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoPromocion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoPromocion ,jPanelParametrosReportesProductoPromocion, jTableDatosProductoPromocion,/*jScrollPanelDatosProductoPromocion,*/jPanelCamposProductoPromocion,jPanelPaginacionProductoPromocion, /*jScrollPanelDatosEdicionProductoPromocion,*/ jPanelAccionesProductoPromocion,jPanelAccionesFormularioProductoPromocion,jmenuBarProductoPromocion,jmenuBarDetalleProductoPromocion,jTtoolBarProductoPromocion,jTtoolBarDetalleProductoPromocion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoPromocion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoPromocion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoPromocion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoPromocion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoPromocion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoPromocion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoPromocion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoPromocion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoPromocion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productopromocionConstantesFunciones.getsFinalQueryProductoPromocion();
		String  finalQueryPaginacionTodos=this.productopromocionConstantesFunciones.getsFinalQueryProductoPromocion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoPromocionConstantesFunciones.getArrayColumnasGlobalesNoProductoPromocion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoPromocionConstantesFunciones.getArrayColumnasGlobalesProductoPromocion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoPromocionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productopromocionsEliminados= new ArrayList<ProductoPromocion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoPromocion();
		
				///*ProductoPromocionSessionBean*/this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			
			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
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
					this.iNumeroPaginacion=ProductoPromocionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoPromocionConstantesFunciones.getClassesForeignKeysOfProductoPromocion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productopromocion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productopromocionsAux= new ArrayList<ProductoPromocion>();
			
				
			productopromocionLogic.setDatosCliente(this.datosCliente);
			productopromocionLogic.setDatosDeep(this.datosDeep);
			productopromocionLogic.setIsConDeep(true);
			
			
			productopromocionLogic.getProductoPromocionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productopromocionLogic.getTodosProductoPromocions(finalQueryGlobal,pagination);
					
					//productopromocionLogic.getTodosProductoPromocionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productopromocionLogic.getProductoPromocions()==null|| productopromocionLogic.getProductoPromocions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productopromocionsAux= new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux= new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productopromocionLogic.getTodosProductoPromocions(finalQueryGlobal+"",this.pagination);												
							
							//productopromocionLogic.getTodosProductoPromocionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoPromocions("Todos",productopromocionLogic.getProductoPromocions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());					
							productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoPromocion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoPromocion=this.idActual;
				
				} else if(this.idProductoPromocionActual!=null && this.idProductoPromocionActual!=0L) {
					idProductoPromocion=idProductoPromocionActual;
				}
				
					
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndicePorId(idProductoPromocion);
				
				this.productopromocions=new ArrayList<ProductoPromocion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productopromocionLogic.getEntity(idProductoPromocion);
					
					//productopromocionLogic.getEntityWithConnection(idProductoPromocion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
					productopromocionLogic.getProductoPromocions().add(productopromocionLogic.getProductoPromocion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocions=new ArrayList<ProductoPromocion>();
					this.productopromocions.add(productopromocion);
				}
				
				if(productopromocionLogic.getProductoPromocion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopromocionLogic.getProductoPromocionsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopromocionLogic.getProductoPromocions()==null||productopromocionLogic.getProductoPromocions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopromocions==null|| productopromocions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionsAux=new ArrayList<ProductoPromocion>();
						productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux=new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopromocionLogic.getProductoPromocionsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPromocions("FK_IdBodega",productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPromocions("FK_IdBodega",productopromocions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
						productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodegaRelacion")) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopromocionLogic.getProductoPromocionsFK_IdBodegaRelacion(finalQueryGlobal,pagination,id_bodega_relacionFK_IdBodegaRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopromocionLogic.getProductoPromocions()==null||productopromocionLogic.getProductoPromocions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopromocions==null|| productopromocions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionsAux=new ArrayList<ProductoPromocion>();
						productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux=new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopromocionLogic.getProductoPromocionsFK_IdBodegaRelacion(finalQueryGlobal,pagination,id_bodega_relacionFK_IdBodegaRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdBodegaRelacion(id_bodega_relacionFK_IdBodegaRelacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPromocions("FK_IdBodegaRelacion",productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPromocions("FK_IdBodegaRelacion",productopromocions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
						productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopromocionLogic.getProductoPromocionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopromocionLogic.getProductoPromocions()==null||productopromocionLogic.getProductoPromocions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopromocions==null|| productopromocions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionsAux=new ArrayList<ProductoPromocion>();
						productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux=new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopromocionLogic.getProductoPromocionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPromocions("FK_IdEmpresa",productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPromocions("FK_IdEmpresa",productopromocions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
						productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopromocionLogic.getProductoPromocionsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopromocionLogic.getProductoPromocions()==null||productopromocionLogic.getProductoPromocions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopromocions==null|| productopromocions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionsAux=new ArrayList<ProductoPromocion>();
						productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux=new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopromocionLogic.getProductoPromocionsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPromocions("FK_IdProducto",productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPromocions("FK_IdProducto",productopromocions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
						productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProductoRelacion")) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopromocionLogic.getProductoPromocionsFK_IdProductoRelacion(finalQueryGlobal,pagination,id_producto_relacionFK_IdProductoRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopromocionLogic.getProductoPromocions()==null||productopromocionLogic.getProductoPromocions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopromocions==null|| productopromocions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionsAux=new ArrayList<ProductoPromocion>();
						productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux=new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopromocionLogic.getProductoPromocionsFK_IdProductoRelacion(finalQueryGlobal,pagination,id_producto_relacionFK_IdProductoRelacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdProductoRelacion(id_producto_relacionFK_IdProductoRelacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPromocions("FK_IdProductoRelacion",productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPromocions("FK_IdProductoRelacion",productopromocions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
						productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopromocionLogic.getProductoPromocionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopromocionLogic.getProductoPromocions()==null||productopromocionLogic.getProductoPromocions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopromocions==null|| productopromocions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionsAux=new ArrayList<ProductoPromocion>();
						productopromocionsAux.addAll(productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionsAux=new ArrayList<ProductoPromocion>();
							productopromocionsAux.addAll(productopromocions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopromocionLogic.getProductoPromocionsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPromocionConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPromocions("FK_IdSucursal",productopromocionLogic.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPromocions("FK_IdSucursal",productopromocions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionLogic.setProductoPromocions(new ArrayList<ProductoPromocion>());
						productopromocionLogic.getProductoPromocions().addAll(productopromocionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocions=new ArrayList<ProductoPromocion>();
							productopromocions.addAll(productopromocionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoPromocion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoPromocion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productopromocionLogic.getProductoPromocions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productopromocions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productopromocionLogic.getProductoPromocions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productopromocions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoPromocion productopromocion) {
		Boolean permite=true;
		
		if(this.productopromocion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoPromocionConstantesFunciones.getOrderByListaProductoPromocion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoPromocionConstantesFunciones.getOrderByListaProductoPromocion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPromocion productopromocion:productopromocionLogic.getProductoPromocions()) {
				if(productopromocion.getsType().equals(Constantes2.S_TOTALES)) {
					productopromocionTotales=productopromocion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPromocion productopromocion:this.productopromocions) {
				if(productopromocion.getsType().equals(Constantes2.S_TOTALES)) {
					productopromocionTotales=productopromocion;
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
			this.productopromocionAux=new ProductoPromocion();
			this.productopromocionAux.setsType(Constantes2.S_TOTALES);
			this.productopromocionAux.setIsNew(false);
			this.productopromocionAux.setIsChanged(false);
			this.productopromocionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoPromocionConstantesFunciones.TotalizarValoresFilaProductoPromocion(this.productopromocionLogic.getProductoPromocions(),this.productopromocionAux);
				
				this.productopromocionLogic.getProductoPromocions().add(this.productopromocionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoPromocionConstantesFunciones.TotalizarValoresFilaProductoPromocion(this.productopromocions,this.productopromocionAux);
				
				this.productopromocions.add(this.productopromocionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productopromocionTotales=new ProductoPromocion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productopromocionLogic.getProductoPromocions().remove(productopromocionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productopromocions.remove(productopromocionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productopromocionTotales=new ProductoPromocion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPromocion productopromocion:productopromocionLogic.getProductoPromocions()) {
				if(productopromocion.getsType().equals(Constantes2.S_TOTALES)) {
					productopromocionTotales=productopromocion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoPromocionConstantesFunciones.TotalizarValoresFilaProductoPromocion(this.productopromocionLogic.getProductoPromocions(),productopromocionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPromocion productopromocion:this.productopromocions) {
				if(productopromocion.getsType().equals(Constantes2.S_TOTALES)) {
					productopromocionTotales=productopromocion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoPromocionConstantesFunciones.TotalizarValoresFilaProductoPromocion(this.productopromocions,productopromocionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoPromocionsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPromocionsFK_IdBodegaRelacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodegaRelacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPromocionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPromocionsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPromocionsFK_IdProductoRelacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoRelacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPromocionsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoPromocionsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.getProductoPromocionsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPromocionsFK_IdBodegaRelacion(String sFinalQuery,Long id_bodega_relacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.getProductoPromocionsFK_IdBodegaRelacion(sFinalQuery,this.pagination,id_bodega_relacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPromocionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.getProductoPromocionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPromocionsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.getProductoPromocionsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPromocionsFK_IdProductoRelacion(String sFinalQuery,Long id_producto_relacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.getProductoPromocionsFK_IdProductoRelacion(sFinalQuery,this.pagination,id_producto_relacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPromocionsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLogic.getProductoPromocionsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductoPromocion() {
		this.isPermisoTodoProductoPromocion=false;
		this.isPermisoNuevoProductoPromocion=false;
		this.isPermisoActualizarProductoPromocion=false;
		this.isPermisoActualizarOriginalProductoPromocion=false;
		this.isPermisoEliminarProductoPromocion=false;
		this.isPermisoGuardarCambiosProductoPromocion=false;
		this.isPermisoConsultaProductoPromocion=false;
		this.isPermisoBusquedaProductoPromocion=false;
		this.isPermisoReporteProductoPromocion=false;		
		this.isPermisoOrdenProductoPromocion=false;		
		this.isPermisoPaginacionMedioProductoPromocion=false;		
		this.isPermisoPaginacionAltoProductoPromocion=false;
		this.isPermisoPaginacionTodoProductoPromocion=false;
		this.isPermisoCopiarProductoPromocion=false;		
		this.isPermisoVerFormProductoPromocion=false;		
		this.isPermisoDuplicarProductoPromocion=false;		
		this.isPermisoOrdenProductoPromocion=false;		
	}
	
	public void setPermisosUsuarioProductoPromocion(Boolean isPermiso) {
		this.isPermisoTodoProductoPromocion=isPermiso;
		this.isPermisoNuevoProductoPromocion=isPermiso;
		this.isPermisoActualizarProductoPromocion=isPermiso;
		this.isPermisoActualizarOriginalProductoPromocion=isPermiso;
		this.isPermisoEliminarProductoPromocion=isPermiso;
		this.isPermisoGuardarCambiosProductoPromocion=isPermiso;
		this.isPermisoConsultaProductoPromocion=isPermiso;
		this.isPermisoBusquedaProductoPromocion=isPermiso;
		this.isPermisoReporteProductoPromocion=isPermiso;
		this.isPermisoOrdenProductoPromocion=isPermiso;		
		this.isPermisoPaginacionMedioProductoPromocion=isPermiso;		
		this.isPermisoPaginacionAltoProductoPromocion=isPermiso;		
		this.isPermisoPaginacionTodoProductoPromocion=isPermiso;		
		this.isPermisoCopiarProductoPromocion=isPermiso;		
		this.isPermisoVerFormProductoPromocion=isPermiso;		
		this.isPermisoDuplicarProductoPromocion=isPermiso;
		this.isPermisoOrdenProductoPromocion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoPromocion(Boolean isPermiso) {
		//this.isPermisoTodoProductoPromocion=isPermiso;
		this.isPermisoNuevoProductoPromocion=isPermiso;
		this.isPermisoActualizarProductoPromocion=isPermiso;
		this.isPermisoActualizarOriginalProductoPromocion=isPermiso;
		this.isPermisoEliminarProductoPromocion=isPermiso;
		this.isPermisoGuardarCambiosProductoPromocion=isPermiso;
		//this.isPermisoConsultaProductoPromocion=isPermiso;
		//this.isPermisoBusquedaProductoPromocion=isPermiso;
		//this.isPermisoReporteProductoPromocion=isPermiso;
		//this.isPermisoOrdenProductoPromocion=isPermiso;		
		//this.isPermisoPaginacionMedioProductoPromocion=isPermiso;		
		//this.isPermisoPaginacionAltoProductoPromocion=isPermiso;		
		//this.isPermisoPaginacionTodoProductoPromocion=isPermiso;		
		//this.isPermisoCopiarProductoPromocion=isPermiso;		
		//this.isPermisoDuplicarProductoPromocion=isPermiso;
		//this.isPermisoOrdenProductoPromocion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoPromocionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoPromocionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoPromocion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoPromocionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoPromocionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoPromocionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoPromocionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoPromocion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoPromocionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoPromocionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoPromocion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoPromocion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoPromocion=this.isPermisoActualizarProductoPromocion;
			this.isPermisoEliminarProductoPromocion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoPromocion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoPromocion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoPromocion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoPromocion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoPromocion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoPromocion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoPromocion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoPromocion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoPromocion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoPromocion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoPromocion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoPromocion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoPromocion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoPromocion.setToolTipText(this.jTableDatosProductoPromocion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoPromocion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoPromocion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoPromocionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoPromocionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoPromocion() throws Exception {
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
	public void inicializarCombosForeignKeyProductoPromocionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.bodegarelacionsForeignKey=new ArrayList();
				this.productorelacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoPromocionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoPromocionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoPromocionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyBodegaRelacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegarelacionsForeignKey==null||this.bodegarelacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegaRelacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProductoRelacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productorelacionsForeignKey==null||this.productorelacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductoRelacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProductoPromocionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoPromocionParameterReturnGeneral productopromocionReturnGeneral=new ProductoPromocionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productopromocionConstantesFunciones.cargarid_empresaProductoPromocion)
					 || (this.esRecargarFks && this.productopromocionConstantesFunciones.cargarid_empresaProductoPromocion)) {

					if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productopromocionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productopromocionConstantesFunciones.cargarid_sucursalProductoPromocion)
					 || (this.esRecargarFks && this.productopromocionConstantesFunciones.cargarid_sucursalProductoPromocion)) {

					if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productopromocionSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productopromocionConstantesFunciones.cargarid_bodegaProductoPromocion)
					 || (this.esRecargarFks && this.productopromocionConstantesFunciones.cargarid_bodegaProductoPromocion)) {

					if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productopromocionSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productopromocionConstantesFunciones.cargarid_productoProductoPromocion)
					 || (this.esRecargarFks && this.productopromocionConstantesFunciones.cargarid_productoProductoPromocion)) {

					if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productopromocionSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalBodegaRelacion="";

				if(((this.bodegarelacionsForeignKey==null||this.bodegarelacionsForeignKey.size()<=0) && this.productopromocionConstantesFunciones.cargarid_bodega_relacionProductoPromocion)
					 || (this.esRecargarFks && this.productopromocionConstantesFunciones.cargarid_bodega_relacionProductoPromocion)) {

					if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaRelacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodegaRelacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodegaRelacion=Funciones.GetFinalQueryAppend(finalQueryGlobalBodegaRelacion, "");
						finalQueryGlobalBodegaRelacion+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegaRelacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodegaRelacion=" WHERE " + ConstantesSql.ID + "="+productopromocionSessionBean.getlidBodegaRelacionActual();
					}
				} else {
					finalQueryGlobalBodegaRelacion="NONE";
				}


				String finalQueryGlobalProductoRelacion="";

				if(((this.productorelacionsForeignKey==null||this.productorelacionsForeignKey.size()<=0) && this.productopromocionConstantesFunciones.cargarid_producto_relacionProductoPromocion)
					 || (this.esRecargarFks && this.productopromocionConstantesFunciones.cargarid_producto_relacionProductoPromocion)) {

					if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionProductoRelacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoRelacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoRelacion=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoRelacion, "");
						finalQueryGlobalProductoRelacion+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoRelacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoRelacion=" WHERE " + ConstantesSql.ID + "="+productopromocionSessionBean.getlidProductoRelacionActual();
					}
				} else {
					finalQueryGlobalProductoRelacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productopromocionReturnGeneral=productopromocionLogic.cargarCombosLoteForeignKeyProductoPromocion(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalBodegaRelacion,finalQueryGlobalProductoRelacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productopromocionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productopromocionReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productopromocionReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productopromocionReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalBodegaRelacion.equals("NONE")) {
				this.bodegarelacionsForeignKey=productopromocionReturnGeneral.getbodegarelacionsForeignKey();
			}

			if(!finalQueryGlobalProductoRelacion.equals("NONE")) {
				this.productorelacionsForeignKey=productopromocionReturnGeneral.getproductorelacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoPromocion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyBodegaRelacion();
			this.addItemDefectoCombosForeignKeyProductoRelacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productopromocionSessionBean==null) {
				this.productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyBodegaRelacion()throws Exception {
		try {

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionBodegaRelacion()) {
				Bodega bodegarelacion=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodegarelacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodegarelacion.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegarelacionsForeignKey,bodegarelacion,true)) {

					this.bodegarelacionsForeignKey.add(0,bodegarelacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProductoRelacion()throws Exception {
		try {

			if(!this.productopromocionSessionBean.getisBusquedaDesdeForeignKeySesionProductoRelacion()) {
				Producto productorelacion=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(productorelacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				productorelacion.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productorelacionsForeignKey,productorelacion,true)) {

					this.productorelacionsForeignKey.add(0,productorelacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductoPromocion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoPromocion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoPromocion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoPromocion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoPromocion(ProductoPromocion productopromocion)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(productopromocion.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productopromocion.getid_producto(),false,"Formulario");
			this.setActualBodegaRelacionForeignKey(productopromocion.getid_bodega_relacion(),false,"Formulario");
			this.setActualProductoRelacionForeignKey(productopromocion.getid_producto_relacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoPromocion(ProductoPromocion productopromocion,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productopromocion.getProducto()!=null && !sTipoEvento.equals("id_productoProductoPromocion")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productopromocion.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				if(productopromocion.getProductoRelacion()!=null && !sTipoEvento.equals("id_producto_relacionProductoPromocion")) { //sTipoEvento Evita Bucle Infinito

					this.productorelacionsForeignKey=new ArrayList<Producto>();
					this.productorelacionsForeignKey.add(productopromocion.getProductoRelacion());

					this.addItemDefectoCombosForeignKeyProductoRelacion();
					this.cargarCombosFrameProductoRelacionsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoPromocion()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.productopromocionConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productopromocionConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualBodegaRelacionForeignKey(this.productopromocionConstantesFunciones.getid_bodega_relacion(),false,"Formulario");
			this.setActualProductoRelacionForeignKey(this.productopromocionConstantesFunciones.getid_producto_relacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoPromocion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoPromocion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoPromocion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoPromocion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoPromocion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameBodegaRelacionsForeignKey("Todos");
			this.cargarCombosFrameProductoRelacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoPromocion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegaRelacionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductoRelacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoPromocion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public ProductoPromocionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoPromocionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoPromocionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productopromocionSessionBean=new ProductoPromocionSessionBean(); 
		this.productopromocionConstantesFunciones=new ProductoPromocionConstantesFunciones(); 
		this.productopromocionBean=new ProductoPromocion();//(this.productopromocionConstantesFunciones); 		
		this.productopromocionReturnGeneral=new ProductoPromocionParameterReturnGeneral(); 
		
		this.productopromocionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productopromocionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoPromocionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoPromocionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoPromocionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoPromocion(true);
			
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
			
			this.productopromocionConstantesFunciones=new ProductoPromocionConstantesFunciones(); 
			this.productopromocionBean=new ProductoPromocion();//this.productopromocionConstantesFunciones); 			
			this.productopromocionReturnGeneral=new ProductoPromocionParameterReturnGeneral(); 
		
			ProductoPromocionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Promocion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productopromocion=new ProductoPromocion();
			this.productopromocions = new ArrayList<ProductoPromocion>();
			this.productopromocionsAux = new ArrayList<ProductoPromocion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic=new ProductoPromocionLogic();
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			//this.productopromocionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productopromocionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoPromocion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoPromocion);	
					}
					
					if(this.jInternalFrameImportacionProductoPromocion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoPromocion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoPromocion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoPromocion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoPromocion);
				this.jInternalFrameDetalleFormProductoPromocion.setVisible(false);
				this.jInternalFrameDetalleFormProductoPromocion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoPromocion);
					this.jInternalFrameReporteDinamicoProductoPromocion.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoPromocion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoPromocion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoPromocion);
					this.jInternalFrameImportacionProductoPromocion.setVisible(false);
					this.jInternalFrameImportacionProductoPromocion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoPromocion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoPromocion);
					this.jInternalFrameOrderByProductoPromocion.setVisible(false);
					this.jInternalFrameOrderByProductoPromocion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoPromocionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoPromocionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productopromocionReturnGeneral=new ProductoPromocionParameterReturnGeneral();
			
			this.productopromocionParameterGeneral=new ProductoPromocionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productopromocionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoPromocionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoPromocionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productopromocionSessionBean.getEsGuardarRelacionado(),this.productopromocionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoPromocionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productopromocionSessionBean.getEsGuardarRelacionado(),this.productopromocionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaDuplicarProductoPromocion=true;
			this.isVisibilidadCeldaCopiarProductoPromocion=true;
			this.isVisibilidadCeldaVerFormProductoPromocion=true;
			this.isVisibilidadCeldaOrdenProductoPromocion=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
			this.isVisibilidadCeldaModificarProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=false;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=false;
			this.isVisibilidadCeldaGuardarProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdBodegaRelacion=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdProductoRelacion=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoPromocion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoPromocion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoPromocion(false);
			
			this.setPermisosUsuarioProductoPromocion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productopromocionSessionBean.getEsGuardarRelacionado() 
				|| (this.productopromocionSessionBean.getEsGuardarRelacionado() && this.productopromocionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoPromocionClasesRelacionadas();
			}
			
			if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoPromocionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoPromocion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoPromocion();
			}
			
			if(!this.isPermisoBusquedaProductoPromocion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoPromocion,this.isPermisoPaginacionMedioProductoPromocion,this.isPermisoPaginacionTodoProductoPromocion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoPromocionConstantesFunciones.getTiposSeleccionarProductoPromocion());
				
				this.tiposColumnasSelect=ProductoPromocionConstantesFunciones.getTiposSeleccionarProductoPromocion(true);
				
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
			//if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoPromocion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoPromocion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoPromocion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoPromocion() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.bodegarelacionLogic=new BodegaLogic();
			this.productorelacionLogic=new ProductoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productopromocionImplementable= (ProductoPromocionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoPromocionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productopromocionImplementableHome= (ProductoPromocionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoPromocionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productopromocions= new ArrayList<ProductoPromocion>();
			this.productopromocionsEliminados= new ArrayList<ProductoPromocion>();
						
			this.isEsNuevoProductoPromocion=false;
			this.esParaAccionDesdeFormularioProductoPromocion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			this.idProductoRelacionActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.bodegarelacionsForeignKey=new ArrayList<Bodega>() ;
			this.productorelacionsForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoPromocion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoPromocion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoPromocionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoPromocionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoPromocion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoPromocion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoPromocion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoPromocion();
			}
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoPromocion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoPromocion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoPromocion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoPromocion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoPromocion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoPromocion() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoPromocion")) {
				iIndex=this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoPromocion();	
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
	
	public void cargarCombosForeignKeyProductoPromocion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoPromocion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoPromocion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoPromocionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoPromocion();
		
		this.cargarCombosFrameForeignKeyProductoPromocion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoPromocion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoPromocion();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
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

	public void cargarCombosForeignKeyBodegaRelacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodegaRelacion();
				this.cargarCombosFrameBodegaRelacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodegaRelacion(this.bodegarelacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProductoRelacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoRelacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProductoRelacion();
				this.cargarCombosFrameProductoRelacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProductoRelacion(this.productorelacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoPromocionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			
			if(jTableDatosProductoPromocion.getRowCount()>=1) {
				jTableDatosProductoPromocion.removeRowSelectionInterval(0, jTableDatosProductoPromocion.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoPromocion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoPromocion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoPromocion(true);			
			//this.productopromocion=new ProductoPromocion();
			//this.productopromocion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoPromocion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPromocion() ;
			
			if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoPromocion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productopromocion);	
			this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);				
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoPromocion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoPromocionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoPromocion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoPromocion.getSelectedRows().length;			
			}
			
			productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoPromocion--;			
				//ProductoPromocion productopromocionAux= new ProductoPromocion();			
				//productopromocionAux.setId(this.iIdNuevoProductoPromocion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoPromocion productopromocionOrigen=new ProductoPromocion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoPromocion productopromocionOrigen : productopromocionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productopromocionOrigen =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopromocionOrigen =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoPromocion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productopromocion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoPromocion(productopromocionOrigen,this.productopromocion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productopromocionLogic.getProductoPromocions().add(this.productopromocionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productopromocions.add(this.productopromocionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoPromocion(false);
				
				this.jTableDatosProductoPromocion.setRowSelectionInterval(this.getIndiceNuevoProductoPromocion(), this.getIndiceNuevoProductoPromocion());
				
				int iLastRow =  this.jTableDatosProductoPromocion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoPromocion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoPromocion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoPromocion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();									
		
			ProductoPromocion productopromocionOrigen=new ProductoPromocion();
			ProductoPromocion productopromocionDestino=new ProductoPromocion();
				
			productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoPromocion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productopromocionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoPromocion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionOrigen =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productopromocionOrigen =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopromocionDestino =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productopromocionDestino =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productopromocionOrigen =productopromocionsSeleccionados.get(0);
				productopromocionDestino =productopromocionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoPromocion(productopromocionOrigen,productopromocionDestino,true,false);
				
				productopromocionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productopromocionDestino,productopromocionLogic.getProductoPromocions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopromocionDestino,productopromocions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoPromocion(false);
				
				//this.jTableDatosProductoPromocion.setRowSelectionInterval(this.getIndiceNuevoProductoPromocion(), this.getIndiceNuevoProductoPromocion());
				
				int iLastRow =  this.jTableDatosProductoPromocion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoPromocion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoPromocion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoPromocion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoPromocion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoPromocion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoPromocion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoPromocion.setVisible(!isVisible);
			this.jPanelPaginacionProductoPromocion.setVisible(!isVisible);
			this.jPanelAccionesProductoPromocion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoPromocion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoPromocion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoPromocion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoPromocion();
			
			this.abrirFrameOrderByProductoPromocion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoPromocion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoPromocion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoPromocion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoPromocion.isMaximum()) {
					this.jInternalFrameDetalleFormProductoPromocion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoPromocion.setSize(this.jInternalFrameDetalleFormProductoPromocion.iWidthFormulario,this.jInternalFrameDetalleFormProductoPromocion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoPromocion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoPromocion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoPromocion.isMaximum()) {
						this.jInternalFrameDetalleFormProductoPromocion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoPromocion.jContentPaneDetalleProductoPromocion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoPromocion.jContentPaneDetalleProductoPromocion.getWidth(),ProductoPromocionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoPromocion.jContentPaneDetalleProductoPromocion.getWidth(),ProductoPromocionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoPromocion.jContentPaneDetalleProductoPromocion.getWidth(),ProductoPromocionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoPromocion.setVisible(true);
	        this.jInternalFrameDetalleFormProductoPromocion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoPromocion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoPromocion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoPromocion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPromocion,false,this);
				} else {
					this.jInternalFrameOrderByProductoPromocion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPromocion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoPromocion);
				this.jInternalFrameOrderByProductoPromocion.setVisible(false);
				this.jInternalFrameOrderByProductoPromocion.setSelected(false);
				
				this.jInternalFrameOrderByProductoPromocion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoPromocion"));
				
				this.inicializarActualizarBindingTablaOrderByProductoPromocion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoPromocion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoPromocion==null) {
				
				this.jInternalFrameImportacionProductoPromocion=new ImportacionJInternalFrame(ProductoPromocionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoPromocion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoPromocion);
				this.jInternalFrameImportacionProductoPromocion.setVisible(false);
				this.jInternalFrameImportacionProductoPromocion.setSelected(false);


				this.jInternalFrameImportacionProductoPromocion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoPromocion"));
				this.jInternalFrameImportacionProductoPromocion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoPromocion"));
				this.jInternalFrameImportacionProductoPromocion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoPromocion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoPromocion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoPromocion==null) {
				this.jInternalFrameReporteDinamicoProductoPromocion=new ReporteDinamicoJInternalFrame(ProductoPromocionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoPromocion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoPromocion);
				this.jInternalFrameReporteDinamicoProductoPromocion.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoPromocion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoPromocion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoPromocion"));
				this.jInternalFrameReporteDinamicoProductoPromocion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoPromocion"));
				this.jInternalFrameReporteDinamicoProductoPromocion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoPromocion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoPromocion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoPromocion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoPromocion);
			
	       	this.jInternalFrameDetalleFormProductoPromocion.setVisible(false);
	        this.jInternalFrameDetalleFormProductoPromocion.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoPromocion.dispose();
			//this.jInternalFrameDetalleFormProductoPromocion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoPromocion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoPromocion.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoPromocion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoPromocion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoPromocion.setVisible(true);
	        this.jInternalFrameImportacionProductoPromocion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoPromocion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoPromocion.setVisible(true);
	        this.jInternalFrameOrderByProductoPromocion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoPromocion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoPromocion.setVisible(false);
	        this.jInternalFrameOrderByProductoPromocion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoPromocion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoPromocion.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoPromocion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoPromocion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoPromocion.setVisible(false);
	        this.jInternalFrameImportacionProductoPromocion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoPromocion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoPromocion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoPromocion(true);
			//this.isEsNuevoProductoPromocion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoPromocion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoPromocion(false) ;
			
			if(productopromocionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoPromocion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPromocion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoPromocionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoPromocion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoPromocion(true);
			//this.isEsNuevoProductoPromocion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productopromocion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoPromocion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoPromocion(false) ;
			
			if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoPromocion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPromocion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productopromocionConstantesFunciones.cargarid_productoProductoPromocion) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoPromocion(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
			
			if(sType.equals("ProductoRelacion")) {
				if(!this.productopromocionConstantesFunciones.cargarid_producto_relacionProductoPromocion) {
					this.cargarCombosProductoRelacionsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoPromocion(false,false);
					this.cargarCombosFrameProductoRelacionsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto_relacion (id);

				this.recargarComboTablaProductoRelacion(this.productorelacionsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPromocion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPromocion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodegaRelacion(List<Bodega> bodegarelacionsForeignKey)throws Exception{
		TableColumn tableColumnBodegaRelacion=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION));
		TableCellEditor tableCellEditorBodegaRelacion =tableColumnBodegaRelacion.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodegaRelacion;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegarelacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPromocion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegarelacionsForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProductoRelacion(List<Producto> productorelacionsForeignKey)throws Exception{
		TableColumn tableColumnProductoRelacion=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION));
		TableCellEditor tableCellEditorProductoRelacion =tableColumnProductoRelacion.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProductoRelacion;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productorelacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPromocion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productorelacionsForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_producto_relacion (Long id) throws Exception {
		this.setActualProductoRelacionForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoPromocion(false);
			
			//if(!this.isEsNuevoProductoPromocion) {								
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				
			}
			
			if(this.permiteMantenimiento(this.productopromocion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoPromocion=true;
					this.inicializarActualizarBindingTablaProductoPromocion(false);
					this.isEsNuevoProductoPromocion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoPromocion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoPromocion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoPromocion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoPromocion(false);
				
				this.habilitarDeshabilitarControlesProductoPromocion(false);
			
												
				
				if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoPromocion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoPromocionActionPerformed(evt,productopromocionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoPromocion(this.productopromocion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productopromocionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productopromocion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				this.productopromocion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				this.productopromocion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productopromocion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoPromocionModel) this.jTableDatosProductoPromocion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoPromocion=true;
				this.inicializarActualizarBindingTablaProductoPromocion(false);
				this.isEsNuevoProductoPromocion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoPromocion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoPromocion(false);
				
				this.habilitarDeshabilitarControlesProductoPromocion(false);
				
				
				
				if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoPromocion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoPromocionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoPromocion.getRowCount()>=1) {
				jTableDatosProductoPromocion.removeRowSelectionInterval(0, jTableDatosProductoPromocion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoPromocion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoPromocion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoPromocion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPromocion(false) ;
			
			this.isEsNuevoProductoPromocion=false;
			
			if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoPromocion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoPromocion(false);
				
				//SI ES MANUAL
				if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoPromocion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoPromocion--;			
			//ProductoPromocion productopromocionAux= new ProductoPromocion();			
			//productopromocionAux.setId(this.iIdNuevoProductoPromocion);
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoPromocion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
			
			this.productopromocion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productopromocionLogic.getProductoPromocions().add(this.productopromocionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productopromocions.add(this.productopromocionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoPromocion(false);
			
			this.jTableDatosProductoPromocion.setRowSelectionInterval(this.getIndiceNuevoProductoPromocion(), this.getIndiceNuevoProductoPromocion());
			
			int iLastRow =  this.jTableDatosProductoPromocion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoPromocion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoPromocion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoPromocion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoPromocion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPromocion(false);
			
			//SI ES MANUAL
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoPromocion();
			}
			
			//this.abrirFrameTreeProductoPromocion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE PromocionS ?", "MANTENIMIENTO DE Promocion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoPromocion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoPromocion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productopromocionReturnGeneral=productopromocionLogic.procesarImportacionProductoPromocionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productopromocionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoPromocionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoPromocion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoPromocion.setFileImportacion(this.jInternalFrameImportacionProductoPromocion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoPromocion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoPromocion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoPromocion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoPromocion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		

		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoPromocionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoPromocionBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_BodegaRelacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_BodegaRelacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_BodegaRelacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_BodegaRelacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoRelacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoRelacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoRelacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoRelacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion2_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoPromocion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION:
					sNombreCampoCategoria="id_bodega_relacion";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION:
					sNombreCampoCategoria="id_producto_relacion";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoria="descripcion2";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION:
					sNombreCampoCategoriaValor="id_bodega_relacion";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION:
					sNombreCampoCategoriaValor="id_producto_relacion";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoriaValor="descripcion2";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega Relacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega_relacion");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Relacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_relacion");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion2");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoPromocionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoPromocions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getbodegarelacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getproductorelacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2);
					iRow++;

					for(ProductoPromocion productopromocion:productopromocionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopromocion.getdescripcion2());
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
			//	this.getFilaCabeceraExportarExcelProductoPromocion(row);				
			//	iRow++;
			//}				
			
			//for(ProductoPromocion productopromocionAux:productopromocionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoPromocion(productopromocionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPromocion(false);
			
			//SI ES MANUAL
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoPromocion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPromocion(false);
			
			//SI ES MANUAL
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoPromocion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoPromocionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPromocion(false);
			
			//SI ES MANUAL
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoPromocion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoPromocion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoPromocion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoPromocion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoPromocion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoPromocion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoPromocion.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoPromocion.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoPromocion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoPromocion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoPromocion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoPromocion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoPromocion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoPromocion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoPromocion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoPromocion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoPromocion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoPromocion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoPromocion();
		
		this.inicializarActualizarBindingBotonesManualProductoPromocion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoPromocion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoPromocion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoPromocion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoPromocion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoPromocion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoPromocion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoPromocion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoPromocion.jCheckBoxPostAccionNuevoProductoPromocion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoPromocion.jCheckBoxPostAccionSinCerrarProductoPromocion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoPromocion.jCheckBoxPostAccionSinMensajeProductoPromocion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoPromocion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoPromocion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoPromocion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
				this.jInternalFrameDetalleFormProductoPromocion.jCheckBoxPostAccionNuevoProductoPromocion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoPromocion.jCheckBoxPostAccionSinCerrarProductoPromocion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoPromocion.jCheckBoxPostAccionSinMensajeProductoPromocion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoPromocion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoPromocion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoPromocion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoPromocion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoPromocion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoPromocion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoPromocion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoPromocion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoPromocion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoPromocion(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoPromocion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoPromocion() throws Exception {
		try	{
			if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoPromocion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoPromocion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoPromocion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoPromocion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoPromocion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoPromocion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoPromocion.addItem(reporte);
			}
			
			
			if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoPromocion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoPromocion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoPromocion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoPromocion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoPromocion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoPromocion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoPromocion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoPromocion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoPromocion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
				this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
				this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoPromocion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoPromocion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoPromocionConstantesFunciones.getTiposSeleccionarProductoPromocion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoPromocionConstantesFunciones.getTiposSeleccionarProductoPromocion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoPromocionConstantesFunciones.getTiposSeleccionarProductoPromocion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoPromocion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoPromocion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoPromocion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoPromocion.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoPromocion.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.getSelectedItem()!=null){this.id_bodega_relacionFK_IdBodegaRelacion=((Bodega)this.jComboBoxid_bodega_relacionFK_IdBodegaRelacionProductoPromocion.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoPromocion.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoPromocion.getSelectedItem()).getId();}
		if(this.jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.getSelectedItem()!=null){this.id_producto_relacionFK_IdProductoRelacion=((Producto)this.jComboBoxid_producto_relacionFK_IdProductoRelacionProductoPromocion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoPromocion(Boolean esInicializar) throws Exception {				
		if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoPromocion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoPromocion() throws Exception {
		this.inicializarActualizarBindingTablaProductoPromocion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoPromocion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoPromocionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoPromocion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productopromocionLogic.getProductoPromocions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productopromocions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoPromocion.setModel(new ProductoPromocionModel(this.productopromocionLogic.getProductoPromocions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoPromocion.setModel(new ProductoPromocionModel(this.productopromocions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoPromocion!=null && this.jInternalFrameOrderByProductoPromocion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoPromocion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO,productopromocionConstantesFunciones.resaltarSeleccionarProductoPromocion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoPromocionConstantesFunciones.SCLASSWEBTITULO,productopromocionConstantesFunciones.resaltarSeleccionarProductoPromocion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_ID));

		if(this.productopromocionConstantesFunciones.mostraridProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productopromocionConstantesFunciones.resaltaridProductoPromocion,this.productopromocionConstantesFunciones.activaridProductoPromocion,iSizeTabla,this,true,"idProductoPromocion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopromocionConstantesFunciones.resaltaridProductoPromocion,this.productopromocionConstantesFunciones.activaridProductoPromocion,this,true,"idProductoPromocion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productopromocionConstantesFunciones.mostrarid_empresaProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productopromocionConstantesFunciones.resaltarid_empresaProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_empresaProductoPromocion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productopromocionConstantesFunciones.resaltarid_empresaProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_empresaProductoPromocion,false,"id_empresaProductoPromocion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productopromocionConstantesFunciones.mostrarid_sucursalProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productopromocionConstantesFunciones.resaltarid_sucursalProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_sucursalProductoPromocion,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productopromocionConstantesFunciones.resaltarid_sucursalProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_sucursalProductoPromocion,false,"id_sucursalProductoPromocion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDBODEGA));

		if(this.productopromocionConstantesFunciones.mostrarid_bodegaProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productopromocionConstantesFunciones.resaltarid_bodegaProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_bodegaProductoPromocion,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productopromocionConstantesFunciones.resaltarid_bodegaProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_bodegaProductoPromocion,true,"id_bodegaProductoPromocion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productopromocionConstantesFunciones.mostrarid_productoProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productopromocionConstantesFunciones.resaltarid_productoProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_productoProductoPromocion,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productopromocionConstantesFunciones.resaltarid_productoProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_productoProductoPromocion,true,"id_productoProductoPromocion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION));

		if(this.productopromocionConstantesFunciones.mostrarid_bodega_relacionProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegarelacionsForeignKey,this.productopromocionConstantesFunciones.resaltarid_bodega_relacionProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_bodega_relacionProductoPromocion,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegarelacionsForeignKey,this.productopromocionConstantesFunciones.resaltarid_bodega_relacionProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_bodega_relacionProductoPromocion,true,"id_bodega_relacionProductoPromocion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION));

		if(this.productopromocionConstantesFunciones.mostrarid_producto_relacionProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productorelacionsForeignKey,this.productopromocionConstantesFunciones.resaltarid_producto_relacionProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_producto_relacionProductoPromocion,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productorelacionsForeignKey,this.productopromocionConstantesFunciones.resaltarid_producto_relacionProductoPromocion,this,this.productopromocionConstantesFunciones.activarid_producto_relacionProductoPromocion,true,"id_producto_relacionProductoPromocion","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_CANTIDAD));

		if(this.productopromocionConstantesFunciones.mostrarcantidadProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productopromocionConstantesFunciones.resaltarcantidadProductoPromocion,this.productopromocionConstantesFunciones.activarcantidadProductoPromocion,iSizeTabla,this,true,"cantidadProductoPromocion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopromocionConstantesFunciones.resaltarcantidadProductoPromocion,this.productopromocionConstantesFunciones.activarcantidadProductoPromocion,this,true,"cantidadProductoPromocion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_PRECIO));

		if(this.productopromocionConstantesFunciones.mostrarprecioProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productopromocionConstantesFunciones.resaltarprecioProductoPromocion,this.productopromocionConstantesFunciones.activarprecioProductoPromocion,iSizeTabla,this,true,"precioProductoPromocion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopromocionConstantesFunciones.resaltarprecioProductoPromocion,this.productopromocionConstantesFunciones.activarprecioProductoPromocion,this,true,"precioProductoPromocion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE));

		if(this.productopromocionConstantesFunciones.mostrarporcentajeProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productopromocionConstantesFunciones.resaltarporcentajeProductoPromocion,this.productopromocionConstantesFunciones.activarporcentajeProductoPromocion,iSizeTabla,this,true,"porcentajeProductoPromocion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopromocionConstantesFunciones.resaltarporcentajeProductoPromocion,this.productopromocionConstantesFunciones.activarporcentajeProductoPromocion,this,true,"porcentajeProductoPromocion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productopromocionConstantesFunciones.mostrardescripcionProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productopromocionConstantesFunciones.resaltardescripcionProductoPromocion,this.productopromocionConstantesFunciones.activardescripcionProductoPromocion,iSizeTabla,this,true,"descripcionProductoPromocion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopromocionConstantesFunciones.resaltardescripcionProductoPromocion,this.productopromocionConstantesFunciones.activardescripcionProductoPromocion,this,true,"descripcionProductoPromocion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2));

		if(this.productopromocionConstantesFunciones.mostrardescripcion2ProductoPromocion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productopromocionConstantesFunciones.resaltardescripcion2ProductoPromocion,this.productopromocionConstantesFunciones.activardescripcion2ProductoPromocion,iSizeTabla,this,true,"descripcion2ProductoPromocion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopromocionConstantesFunciones.resaltardescripcion2ProductoPromocion,this.productopromocionConstantesFunciones.activardescripcion2ProductoPromocion,this,true,"descripcion2ProductoPromocion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPromocionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productopromocionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productopromocionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productopromocionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoPromocion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productopromocionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productopromocionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoPromocion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productopromocionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productopromocionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoPromocion.addColumn(tableColumn);
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
			
			this.jTableDatosProductoPromocion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoPromocion.moveColumn(this.jTableDatosProductoPromocion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoPromocion.moveColumn(this.jTableDatosProductoPromocion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoPromocion.moveColumn(this.jTableDatosProductoPromocion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoPromocion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoPromocion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoPromocion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoPromocion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoPromocion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoPromocion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoPromocion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoPromocion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productopromocionLogic.getProductoPromocions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productopromocions.size()-1;
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
		//this.jTableDatosProductoPromocion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoPromocion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoPromocion();
			
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
				
				//this.isEsNuevoProductoPromocion=false;
					
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
				if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoPromocion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoPromocion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoPromocion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productopromocion.getsType().equals("DUPLICADO")
				   || this.productopromocion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoPromocion=true;
				
				} else {
					this.isEsNuevoProductoPromocion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productopromocionSessionBean.getEsGuardarRelacionado()) {
					if(this.productopromocion.getId()>=0 && !this.productopromocion.getIsNew()) {						
						this.isEsNuevoProductoPromocion=false;
						
					} else {
						this.isEsNuevoProductoPromocion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoPromocion(esRelaciones);						
				
				this.seleccionarProductoPromocion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productopromocion.getId()<0) {
					this.isEsNuevoProductoPromocion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoPromocion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoPromocion(evt,rowIndex);
				}	
				
				if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoPromocion: " + this.dDif); 
					}
				}								
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoPromocion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productopromocion)) {
					if(this.productopromocion.getId()>0) {
						this.productopromocion.setIsDeleted(true);
						
						this.productopromocionsEliminados.add(this.productopromocion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productopromocionLogic.getProductoPromocions().remove(this.productopromocion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productopromocions.remove(this.productopromocion);				
					}
					
					
					((ProductoPromocionModel) this.jTableDatosProductoPromocion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoPromocion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoPromocion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoPromocion) {
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoPromocion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoPromocion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoPromocion(this.productopromocion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productopromocionConstantesFunciones.cargarid_empresaProductoPromocion || this.productopromocionConstantesFunciones.event_dependid_empresaProductoPromocion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productopromocion.getid_empresa());
									//this.inicializarActualizarBindingProductoPromocion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productopromocion.getEmpresa()!=null) {
							this.empresasForeignKey.add(productopromocion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productopromocion.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productopromocionConstantesFunciones.cargarid_sucursalProductoPromocion || this.productopromocionConstantesFunciones.event_dependid_sucursalProductoPromocion) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productopromocion.getid_sucursal());
									//this.inicializarActualizarBindingProductoPromocion(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productopromocion.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productopromocion.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productopromocion.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.productopromocionConstantesFunciones.cargarid_bodegaProductoPromocion || this.productopromocionConstantesFunciones.event_dependid_bodegaProductoPromocion) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productopromocion.getid_bodega());
									//this.inicializarActualizarBindingProductoPromocion(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productopromocion.getBodega()!=null) {
							this.bodegasForeignKey.add(productopromocion.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productopromocion.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productopromocionConstantesFunciones.cargarid_productoProductoPromocion || this.productopromocionConstantesFunciones.event_dependid_productoProductoPromocion) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productopromocion.getid_producto());
									//this.inicializarActualizarBindingProductoPromocion(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productopromocion.getProducto()!=null) {
							this.productosForeignKey.add(productopromocion.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productopromocion.getid_producto(),false,"Formulario");

					//BodegaRelacion
					if(!this.productopromocionConstantesFunciones.cargarid_bodega_relacionProductoPromocion || this.productopromocionConstantesFunciones.event_dependid_bodega_relacionProductoPromocion) {
						//this.cargarCombosBodegaRelacionsForeignKeyLista(" where id="+this.productopromocion.getid_bodega_relacion());
									//this.inicializarActualizarBindingProductoPromocion(false,false);
						this.bodegarelacionsForeignKey=new ArrayList<Bodega>();

						if(productopromocion.getBodegaRelacion()!=null) {
							this.bodegarelacionsForeignKey.add(productopromocion.getBodegaRelacion());
						}

						this.addItemDefectoCombosForeignKeyBodegaRelacion();
						this.cargarCombosFrameBodegaRelacionsForeignKey("Todos");
					}
					this.setActualBodegaRelacionForeignKey(this.productopromocion.getid_bodega_relacion(),false,"Formulario");

					//ProductoRelacion
					if(!this.productopromocionConstantesFunciones.cargarid_producto_relacionProductoPromocion || this.productopromocionConstantesFunciones.event_dependid_producto_relacionProductoPromocion) {
						//this.cargarCombosProductoRelacionsForeignKeyLista(" where id="+this.productopromocion.getid_producto_relacion());
									//this.inicializarActualizarBindingProductoPromocion(false,false);
						this.productorelacionsForeignKey=new ArrayList<Producto>();

						if(productopromocion.getProductoRelacion()!=null) {
							this.productorelacionsForeignKey.add(productopromocion.getProductoRelacion());
						}

						this.addItemDefectoCombosForeignKeyProductoRelacion();
						this.cargarCombosFrameProductoRelacionsForeignKey("Todos");
					}
					this.setActualProductoRelacionForeignKey(this.productopromocion.getid_producto_relacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoPromocion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoPromocion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoPromocion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoPromocion(ProductoPromocion productopromocion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoPromocion(productopromocion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoPromocion(ProductoPromocion productopromocion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoPromocion(productopromocion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoPromocion(productopromocion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoPromocion(productopromocion);
	}
	
	public void setVariablesObjetoActualToFormularioProductoPromocion(ProductoPromocion productopromocion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setText(productopromocion.getId().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setText(productopromocion.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setText(productopromocion.getprecio().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setText(productopromocion.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setText(productopromocion.getdescripcion());
			this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setText(productopromocion.getdescripcion2());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoPromocion productopromocionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productopromocionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoPromocion productopromocionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productopromocionLocal=this.productopromocion;
			} else {
				productopromocionLocal=this.productopromocionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productopromocionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoPromocion(productopromocionLocal,true);
					
					if(productopromocionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productopromocionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productopromocionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoPromocion(ProductoPromocion productopromocion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoPromocion(productopromocion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(productopromocion);
	}
	
	public void setVariablesFormularioToObjetoActualProductoPromocion(ProductoPromocion productopromocion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoPromocion(productopromocion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoPromocion(ProductoPromocion productopromocion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.getText()==null || this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.getText()=="" || this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setText("0");
			}

			if(conColumnasBase) {productopromocion.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPromocionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelIdProductoPromocion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productopromocion.setcantidad(Double.parseDouble(this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPromocionConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelcantidadProductoPromocion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productopromocion.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPromocionConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelprecioProductoPromocion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productopromocion.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabelporcentajeProductoPromocion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productopromocion.setdescripcion(this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabeldescripcionProductoPromocion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productopromocion.setdescripcion2(this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPromocion.jLabeldescripcion2ProductoPromocion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoPromocion(ProductoPromocion productopromocionBean,ProductoPromocion productopromocion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productopromocionBean.getid_bodega()!=null && !productopromocionBean.getid_bodega().equals(-1L))) {productopromocion.setid_bodega(productopromocionBean.getid_bodega());}
			if(conDefault || (!conDefault && productopromocionBean.getid_producto()!=null && !productopromocionBean.getid_producto().equals(-1L))) {productopromocion.setid_producto(productopromocionBean.getid_producto());}
			if(conDefault || (!conDefault && productopromocionBean.getid_bodega_relacion()!=null && !productopromocionBean.getid_bodega_relacion().equals(-1L))) {productopromocion.setid_bodega_relacion(productopromocionBean.getid_bodega_relacion());}
			if(conDefault || (!conDefault && productopromocionBean.getid_producto_relacion()!=null && !productopromocionBean.getid_producto_relacion().equals(-1L))) {productopromocion.setid_producto_relacion(productopromocionBean.getid_producto_relacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoPromocion(ProductoPromocion productopromocionOrigen,ProductoPromocion productopromocion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productopromocionOrigen.getId()!=null && !productopromocionOrigen.getId().equals(0L))) {productopromocion.setId(productopromocionOrigen.getId());}}
			if(conDefault || (!conDefault && productopromocionOrigen.getid_bodega()!=null && !productopromocionOrigen.getid_bodega().equals(-1L))) {productopromocion.setid_bodega(productopromocionOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productopromocionOrigen.getid_producto()!=null && !productopromocionOrigen.getid_producto().equals(-1L))) {productopromocion.setid_producto(productopromocionOrigen.getid_producto());}
			if(conDefault || (!conDefault && productopromocionOrigen.getid_bodega_relacion()!=null && !productopromocionOrigen.getid_bodega_relacion().equals(-1L))) {productopromocion.setid_bodega_relacion(productopromocionOrigen.getid_bodega_relacion());}
			if(conDefault || (!conDefault && productopromocionOrigen.getid_producto_relacion()!=null && !productopromocionOrigen.getid_producto_relacion().equals(-1L))) {productopromocion.setid_producto_relacion(productopromocionOrigen.getid_producto_relacion());}
			if(conDefault || (!conDefault && productopromocionOrigen.getcantidad()!=null && !productopromocionOrigen.getcantidad().equals(0.0))) {productopromocion.setcantidad(productopromocionOrigen.getcantidad());}
			if(conDefault || (!conDefault && productopromocionOrigen.getprecio()!=null && !productopromocionOrigen.getprecio().equals(0.0))) {productopromocion.setprecio(productopromocionOrigen.getprecio());}
			if(conDefault || (!conDefault && productopromocionOrigen.getporcentaje()!=null && !productopromocionOrigen.getporcentaje().equals(0.0))) {productopromocion.setporcentaje(productopromocionOrigen.getporcentaje());}
			if(conDefault || (!conDefault && productopromocionOrigen.getdescripcion()!=null && !productopromocionOrigen.getdescripcion().equals(""))) {productopromocion.setdescripcion(productopromocionOrigen.getdescripcion());}
			if(conDefault || (!conDefault && productopromocionOrigen.getdescripcion2()!=null && !productopromocionOrigen.getdescripcion2().equals(""))) {productopromocion.setdescripcion2(productopromocionOrigen.getdescripcion2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoPromocion(ProductoPromocion productopromocion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setText(productopromocion.getId().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setText(productopromocion.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setText(productopromocion.getprecio().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setText(productopromocion.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setText(productopromocion.getdescripcion());
			this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setText(productopromocion.getdescripcion2());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoPromocion(ProductoPromocionBean productopromocionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setText(productopromocionBean.getId().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setText(productopromocionBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setText(productopromocionBean.getprecio().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setText(productopromocionBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setText(productopromocionBean.getdescripcion());
			this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setText(productopromocionBean.getdescripcion2());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoPromocion(ProductoPromocionParameterReturnGeneral productopromocionReturnGeneral,ProductoPromocionBean productopromocionBean,Boolean conDefault) throws Exception { 
		try {
			ProductoPromocion productopromocionLocal=new ProductoPromocion();
			
			productopromocionLocal=productopromocionReturnGeneral.getProductoPromocion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productopromocionLocal.getId()!=null && !productopromocionLocal.getId().equals(0L))) {productopromocionBean.setId(productopromocionLocal.getId());}}
			if(conDefault || (!conDefault && productopromocionLocal.getid_bodega()!=null && !productopromocionLocal.getid_bodega().equals(-1L))) {productopromocionBean.setid_bodega(productopromocionLocal.getid_bodega());}
			if(conDefault || (!conDefault && productopromocionLocal.getid_producto()!=null && !productopromocionLocal.getid_producto().equals(-1L))) {productopromocionBean.setid_producto(productopromocionLocal.getid_producto());}
			if(conDefault || (!conDefault && productopromocionLocal.getid_bodega_relacion()!=null && !productopromocionLocal.getid_bodega_relacion().equals(-1L))) {productopromocionBean.setid_bodega_relacion(productopromocionLocal.getid_bodega_relacion());}
			if(conDefault || (!conDefault && productopromocionLocal.getid_producto_relacion()!=null && !productopromocionLocal.getid_producto_relacion().equals(-1L))) {productopromocionBean.setid_producto_relacion(productopromocionLocal.getid_producto_relacion());}
			if(conDefault || (!conDefault && productopromocionLocal.getcantidad()!=null && !productopromocionLocal.getcantidad().equals(0.0))) {productopromocionBean.setcantidad(productopromocionLocal.getcantidad());}
			if(conDefault || (!conDefault && productopromocionLocal.getprecio()!=null && !productopromocionLocal.getprecio().equals(0.0))) {productopromocionBean.setprecio(productopromocionLocal.getprecio());}
			if(conDefault || (!conDefault && productopromocionLocal.getporcentaje()!=null && !productopromocionLocal.getporcentaje().equals(0.0))) {productopromocionBean.setporcentaje(productopromocionLocal.getporcentaje());}
			if(conDefault || (!conDefault && productopromocionLocal.getdescripcion()!=null && !productopromocionLocal.getdescripcion().equals(""))) {productopromocionBean.setdescripcion(productopromocionLocal.getdescripcion());}
			if(conDefault || (!conDefault && productopromocionLocal.getdescripcion2()!=null && !productopromocionLocal.getdescripcion2().equals(""))) {productopromocionBean.setdescripcion2(productopromocionLocal.getdescripcion2());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoPromocionGenerico(Long idProductoPromocionSeleccionado,JComboBox jComboBoxProductoPromocion,List<ProductoPromocion> productopromocionsLocal)throws Exception {
		try {
			ProductoPromocion  productopromocionTemp=null;

			for(ProductoPromocion productopromocionAux:productopromocionsLocal) {
				if(productopromocionAux.getId()!=null && productopromocionAux.getId().equals(idProductoPromocionSeleccionado)) {
					productopromocionTemp=productopromocionAux;
					break;
				}
			}

			jComboBoxProductoPromocion.setSelectedItem(productopromocionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoPromocionGenerico(JComboBox jComboBoxProductoPromocion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoPromocion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoPromocion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoPromocion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoPromocion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoPromocion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoPromocion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productopromocion=(ProductoPromocion) productopromocionLogic.getProductoPromocions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productopromocion =(ProductoPromocion) productopromocions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productopromocion.getIsNew() && !productopromocion.getIsChanged() && !productopromocion.getIsDeleted()) {
				sDescripcion=productopromocion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productopromocion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productopromocion.getIsNew() && !productopromocion.getIsChanged() && !productopromocion.getIsDeleted()) {
				sDescripcion=productopromocion.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productopromocion.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productopromocion.getIsNew() && !productopromocion.getIsChanged() && !productopromocion.getIsDeleted()) {
				sDescripcion=productopromocion.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productopromocion.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productopromocion.getIsNew() && !productopromocion.getIsChanged() && !productopromocion.getIsDeleted()) {
				sDescripcion=productopromocion.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productopromocion.getproducto_descripcion();
			}
		}

		if(sTipo.equals("BodegaRelacion")) {
			//sDescripcion=this.getActualBodegaRelacionForeignKeyDescripcion((Long)value);
			if(!productopromocion.getIsNew() && !productopromocion.getIsChanged() && !productopromocion.getIsDeleted()) {
				sDescripcion=productopromocion.getbodegarelacion_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaRelacionForeignKeyDescripcion((Long)value);
				sDescripcion=productopromocion.getbodegarelacion_descripcion();
			}
		}

		if(sTipo.equals("ProductoRelacion")) {
			//sDescripcion=this.getActualProductoRelacionForeignKeyDescripcion((Long)value);
			if(!productopromocion.getIsNew() && !productopromocion.getIsChanged() && !productopromocion.getIsDeleted()) {
				sDescripcion=productopromocion.getproductorelacion_descripcion();
			} else {
				//sDescripcion=this.getActualProductoRelacionForeignKeyDescripcion((Long)value);
				sDescripcion=productopromocion.getproductorelacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoPromocion productopromocionRow=new ProductoPromocion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productopromocionRow=(ProductoPromocion) productopromocionLogic.getProductoPromocions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productopromocionRow=(ProductoPromocion) productopromocions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoPromocion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoProductoPromocion && this.isPermisoNuevoProductoPromocion));			
			this.jButtonDuplicarProductoPromocion.setVisible((this.isVisibilidadCeldaDuplicarProductoPromocion && this.isPermisoDuplicarProductoPromocion));			
			this.jButtonCopiarProductoPromocion.setVisible((this.isVisibilidadCeldaCopiarProductoPromocion && this.isPermisoCopiarProductoPromocion));
			this.jButtonVerFormProductoPromocion.setVisible((this.isVisibilidadCeldaVerFormProductoPromocion && this.isPermisoVerFormProductoPromocion));
			
			this.jButtonAbrirOrderByProductoPromocion.setVisible((this.isVisibilidadCeldaOrdenProductoPromocion && this.isPermisoOrdenProductoPromocion));			
			
			this.jButtonNuevoRelacionesProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoPromocion && this.isPermisoNuevoProductoPromocion));			
			this.jButtonNuevoGuardarCambiosProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoProductoPromocion && this.isPermisoNuevoProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarProductoPromocion.setVisible((this.isVisibilidadCeldaModificarProductoPromocion && this.isPermisoActualizarProductoPromocion));	
			this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarProductoPromocion.setVisible((this.isVisibilidadCeldaActualizarProductoPromocion && this.isPermisoActualizarProductoPromocion));	
			this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarProductoPromocion.setVisible((this.isVisibilidadCeldaEliminarProductoPromocion && this.isPermisoEliminarProductoPromocion));
			this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarProductoPromocion.setVisible(this.isVisibilidadCeldaCancelarProductoPromocion);							
			this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoProductoPromocion && this.isPermisoNuevoProductoPromocion));						
			this.jButtonDuplicarToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaDuplicarProductoPromocion && this.isPermisoDuplicarProductoPromocion));						
			this.jButtonCopiarToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaCopiarProductoPromocion && this.isPermisoCopiarProductoPromocion));			
			this.jButtonVerFormToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaVerFormProductoPromocion && this.isPermisoVerFormProductoPromocion));			
			this.jButtonAbrirOrderByToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaOrdenProductoPromocion && this.isPermisoOrdenProductoPromocion));
			this.jButtonNuevoRelacionesToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoPromocion && this.isPermisoNuevoProductoPromocion));			
			this.jButtonNuevoGuardarCambiosToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoProductoPromocion && this.isPermisoNuevoProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));			
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaModificarProductoPromocion && this.isPermisoActualizarProductoPromocion));	
			this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaActualizarProductoPromocion  && this.isPermisoActualizarProductoPromocion));	
			this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaEliminarProductoPromocion && this.isPermisoEliminarProductoPromocion));
			this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarToolBarProductoPromocion.setVisible(this.isVisibilidadCeldaCancelarProductoPromocion);				
			this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoProductoPromocion && this.isPermisoNuevoProductoPromocion));			
			this.jMenuItemDuplicarProductoPromocion.setVisible((this.isVisibilidadCeldaDuplicarProductoPromocion && this.isPermisoDuplicarProductoPromocion));			
			this.jMenuItemCopiarProductoPromocion.setVisible((this.isVisibilidadCeldaCopiarProductoPromocion && this.isPermisoCopiarProductoPromocion));			
			this.jMenuItemVerFormProductoPromocion.setVisible((this.isVisibilidadCeldaVerFormProductoPromocion && this.isPermisoVerFormProductoPromocion));			
			this.jMenuItemAbrirOrderByProductoPromocion.setVisible((this.isVisibilidadCeldaOrdenProductoPromocion && this.isPermisoOrdenProductoPromocion));			
			//this.jMenuItemMostrarOcultarProductoPromocion.setVisible((this.isVisibilidadCeldaOrdenProductoPromocion && this.isPermisoOrdenProductoPromocion));
			this.jMenuItemDetalleAbrirOrderByProductoPromocion.setVisible((this.isVisibilidadCeldaOrdenProductoPromocion && this.isPermisoOrdenProductoPromocion));			
			//this.jMenuItemDetalleMostrarOcultarProductoPromocion.setVisible((this.isVisibilidadCeldaOrdenProductoPromocion && this.isPermisoOrdenProductoPromocion));			
			this.jMenuItemNuevoRelacionesProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoPromocion && this.isPermisoNuevoProductoPromocion));			
			this.jMenuItemNuevoGuardarCambiosProductoPromocion.setVisible((this.isVisibilidadCeldaNuevoProductoPromocion && this.isPermisoNuevoProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));									
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemModificarProductoPromocion.setVisible((this.isVisibilidadCeldaModificarProductoPromocion && this.isPermisoActualizarProductoPromocion));	
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemActualizarProductoPromocion.setVisible((this.isVisibilidadCeldaActualizarProductoPromocion && this.isPermisoActualizarProductoPromocion));	
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemEliminarProductoPromocion.setVisible((this.isVisibilidadCeldaEliminarProductoPromocion && this.isPermisoEliminarProductoPromocion));
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemCancelarProductoPromocion.setVisible(this.isVisibilidadCeldaCancelarProductoPromocion);				
			}
			
			this.jMenuItemGuardarCambiosProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));						
			this.jMenuItemGuardarCambiosTablaProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoPromocion=this.jButtonNuevoProductoPromocion.isVisible();
			this.isVisibilidadCeldaDuplicarProductoPromocion=this.jButtonDuplicarProductoPromocion.isVisible();
			this.isVisibilidadCeldaCopiarProductoPromocion=this.jButtonCopiarProductoPromocion.isVisible();
			this.isVisibilidadCeldaVerFormProductoPromocion=this.jButtonVerFormProductoPromocion.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoPromocion=this.jButtonAbrirOrderByProductoPromocion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=this.jButtonNuevoRelacionesProductoPromocion.isVisible();
			this.isVisibilidadCeldaModificarProductoPromocion=this.jButtonModificarProductoPromocion.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.isVisibilidadCeldaActualizarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarProductoPromocion.isVisible();
			this.isVisibilidadCeldaEliminarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarProductoPromocion.isVisible();
			this.isVisibilidadCeldaCancelarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarProductoPromocion.isVisible();
			this.isVisibilidadCeldaGuardarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=this.jButtonGuardarCambiosTablaProductoPromocion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoPromocion=this.jButtonNuevoToolBarProductoPromocion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=this.jButtonNuevoRelacionesToolBarProductoPromocion.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.isVisibilidadCeldaModificarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarToolBarProductoPromocion.isVisible();
			this.isVisibilidadCeldaActualizarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarToolBarProductoPromocion.isVisible();
			this.isVisibilidadCeldaEliminarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarToolBarProductoPromocion.isVisible();
			this.isVisibilidadCeldaCancelarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarToolBarProductoPromocion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoPromocion=this.jButtonGuardarCambiosToolBarProductoPromocion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=this.jButtonGuardarCambiosTablaToolBarProductoPromocion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoPromocion=this.jMenuItemNuevoProductoPromocion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=this.jMenuItemNuevoRelacionesProductoPromocion.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.isVisibilidadCeldaModificarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jMenuItemModificarProductoPromocion.isVisible();
			this.isVisibilidadCeldaActualizarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jMenuItemActualizarProductoPromocion.isVisible();
			this.isVisibilidadCeldaEliminarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jMenuItemEliminarProductoPromocion.isVisible();
			this.isVisibilidadCeldaCancelarProductoPromocion=this.jInternalFrameDetalleFormProductoPromocion.jMenuItemCancelarProductoPromocion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoPromocion=this.jMenuItemGuardarCambiosProductoPromocion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=this.jMenuItemGuardarCambiosTablaProductoPromocion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoPromocion(Boolean esInicializar) {
		if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
				//if(this.productopromocionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoPromocion();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoPromocion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoPromocion() {
		this.jButtonNuevoProductoPromocion.setVisible(this.isPermisoNuevoProductoPromocion);			
		this.jButtonDuplicarProductoPromocion.setVisible(this.isPermisoDuplicarProductoPromocion);			
		this.jButtonCopiarProductoPromocion.setVisible(this.isPermisoCopiarProductoPromocion);			
		this.jButtonVerFormProductoPromocion.setVisible(this.isPermisoVerFormProductoPromocion);			
		
		this.jButtonAbrirOrderByProductoPromocion.setVisible(this.isPermisoOrdenProductoPromocion);					
		
		this.jButtonNuevoRelacionesProductoPromocion.setVisible(this.isPermisoNuevoProductoPromocion);			
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarProductoPromocion.setVisible(this.isPermisoActualizarProductoPromocion);	
			this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarProductoPromocion.setVisible(this.isPermisoActualizarProductoPromocion);	
			this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarProductoPromocion.setVisible(this.isPermisoEliminarProductoPromocion);
			this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarProductoPromocion.setVisible(this.isVisibilidadCeldaCancelarProductoPromocion);						
			this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.setVisible(this.isPermisoGuardarCambiosProductoPromocion);							
		}
		
		this.jButtonGuardarCambiosTablaProductoPromocion.setVisible(this.isPermisoActualizarProductoPromocion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoPromocion() {
		this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarProductoPromocion.setVisible(this.isPermisoActualizarProductoPromocion);	
		this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarProductoPromocion.setVisible(this.isPermisoActualizarProductoPromocion);	
		this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarProductoPromocion.setVisible(this.isPermisoEliminarProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarProductoPromocion.setVisible(this.isVisibilidadCeldaCancelarProductoPromocion);							
		this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.setVisible((this.isVisibilidadCeldaGuardarProductoPromocion && this.isPermisoGuardarCambiosProductoPromocion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoPromocion() {
		if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoPromocion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoPromocion() {
	}
	
	public void jTableDatosProductoPromocionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoPromocion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productopromocion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoPromocionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoPromocion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPromocion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productopromocionLogic.getConnexion());

				if(this.productopromocion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productopromocion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoPromocion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productopromocion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoPromocionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoPromocion(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPromocion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productopromocionLogic.getConnexion());

				if(this.productopromocion.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productopromocion.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoPromocion.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productopromocion.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoPromocionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoPromocion(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPromocion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productopromocionLogic.getConnexion());

				if(this.productopromocion.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productopromocion.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoPromocion.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productopromocion.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoPromocionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderProductoPromocion=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoPromocion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoPromocion.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoPromocionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoPromocion(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPromocion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productopromocionLogic.getConnexion());

				if(this.productopromocion.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productopromocion.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoPromocion.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productopromocion.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodega_relacionProductoPromocionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodegarelacion=true;

			idTienePermisobodegarelacion=this.tienePermisosUsuarioEnPaginaWebProductoPromocion(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodegarelacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPromocion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);

				this.bodegarelacionBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegarelacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegarelacionBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productopromocionLogic.getConnexion());

				if(this.productopromocion.getid_bodega_relacion()!=null) {
					this.bodegarelacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegarelacionBeanSwingJInternalFrame.setIdActual(this.productopromocion.getid_bodega_relacion());
					this.bodegarelacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegarelacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegarelacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegarelacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				TitledBorder titledBorderbodegarelacion=(TitledBorder)this.bodegarelacionBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodegarelacion.setTitle(titledBorderProductoPromocion.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodega_relacionProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getid_bodega_relacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega_relacion = "+this.productopromocion.getid_bodega_relacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_relacionProductoPromocionActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productorelacionBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productorelacionBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productorelacionBeanSwingJInternalFrame.sTipoBusqueda="ProductoRelacion";

			if(!this.sFinalQueryGeneral_productorelacion.equals("")) {
				this.productorelacionBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_productorelacion);
				this.productorelacionBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productorelacionBeanSwingJInternalFrame.procesarBusqueda(this.productorelacionBeanSwingJInternalFrame.sAccionBusqueda);
				this.productorelacionBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProductoRelacion.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productorelacionBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderProductoPromocion=null;
			TitledBorder titledBorderproductorelacion=null;

			if(!this.jScrollPanelDatosProductoPromocion.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				titledBorderproductorelacion=(TitledBorder)this.productorelacionBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproductorelacion.setTitle(titledBorderProductoPromocion.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_producto_relacionProductoPromocionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductorelacion=true;

			idTienePermisoproductorelacion=this.tienePermisosUsuarioEnPaginaWebProductoPromocion(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductorelacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPromocion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPromocion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);

				this.productorelacionBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productorelacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productorelacionBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productopromocionLogic.getConnexion());

				if(this.productopromocion.getid_producto_relacion()!=null) {
					this.productorelacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productorelacionBeanSwingJInternalFrame.setIdActual(this.productopromocion.getid_producto_relacion());
					this.productorelacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productorelacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productorelacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productorelacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPromocion=(TitledBorder)this.jScrollPanelDatosProductoPromocion.getBorder();
				TitledBorder titledBorderproductorelacion=(TitledBorder)this.productorelacionBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproductorelacion.setTitle(titledBorderProductoPromocion.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_relacionProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getid_producto_relacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_relacion = "+this.productopromocion.getid_producto_relacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productopromocion.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.productopromocion.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.productopromocion.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productopromocion.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion2ProductoPromocionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.getproductopromocion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopromocion==null) {
						this.productopromocion = new ProductoPromocion();
					}

					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);
				}

				if(this.productopromocion.getdescripcion2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion2 like '%"+this.productopromocion.getdescripcion2()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPromocion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoPromocionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPromocion(false,false);

			this.getProductoPromocionsFK_IdBodega();

			this.inicializarActualizarBindingProductoPromocion(false);

			//if(ProductoPromocionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPromocion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaRelacionProductoPromocionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPromocion(false,false);

			this.getProductoPromocionsFK_IdBodegaRelacion();

			this.inicializarActualizarBindingProductoPromocion(false);

			//if(ProductoPromocionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPromocion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductoPromocionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPromocion(false,false);

			this.getProductoPromocionsFK_IdEmpresa();

			this.inicializarActualizarBindingProductoPromocion(false);

			//if(ProductoPromocionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPromocion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoPromocionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPromocion(false,false);

			this.getProductoPromocionsFK_IdProducto();

			this.inicializarActualizarBindingProductoPromocion(false);

			//if(ProductoPromocionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPromocion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoRelacionProductoPromocionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPromocion(false,false);

			this.getProductoPromocionsFK_IdProductoRelacion();

			this.inicializarActualizarBindingProductoPromocion(false);

			//if(ProductoPromocionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPromocion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoPromocionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPromocion(false,false);

			this.getProductoPromocionsFK_IdSucursal();

			this.inicializarActualizarBindingProductoPromocion(false);

			//if(ProductoPromocionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPromocion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopromocionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoPromocion() {
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
			this.jInternalFrameDetalleFormProductoPromocion.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoPromocion.dispose();
			this.jInternalFrameDetalleFormProductoPromocion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
			this.jInternalFrameReporteDinamicoProductoPromocion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoPromocion.dispose();
			this.jInternalFrameReporteDinamicoProductoPromocion=null;
		}
		
		if(this.jInternalFrameImportacionProductoPromocion!=null) {
			this.jInternalFrameImportacionProductoPromocion.setVisible(false);	    			
			this.jInternalFrameImportacionProductoPromocion.dispose();
			this.jInternalFrameImportacionProductoPromocion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoPromocion();
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoPromocion")) {
				jButtonDuplicarProductoPromocionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoPromocion")) {
				jButtonCopiarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoPromocion")) {
				jButtonVerFormProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoPromocion")) {
				jButtonDuplicarProductoPromocionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoPromocion")) {
				jButtonDuplicarProductoPromocionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoPromocion")) {
				jButtonModificarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoPromocion")) {
				jButtonModificarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoPromocion")) {
				jButtonModificarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoPromocion")) {
				jButtonActualizarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoPromocion")) {
				jButtonActualizarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoPromocion")) {
				jButtonActualizarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoPromocion")) {
				jButtonEliminarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoPromocion")) {
				jButtonEliminarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoPromocion")) {
				jButtonEliminarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoPromocion")) {
				jButtonCancelarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoPromocion")) {
				jButtonCancelarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoPromocion")) {
				jButtonCancelarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoPromocion")) {
				jButtonCerrarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoPromocion")) {
				jButtonCerrarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoPromocion")) {
				jButtonCerrarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoPromocion")) {
				jButtonMostrarOcultarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoPromocion")) {
				jButtonCancelarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoPromocion")) {
				jButtonCopiarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoPromocion")) {
				jButtonVerFormProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoPromocion")) {
				jButtonCopiarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoPromocion")) {
				jButtonVerFormProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoPromocion")) {
				jButtonRecargarInformacionProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoPromocion")) {
				jButtonRecargarInformacionProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoPromocion")) {
				jButtonRecargarInformacionProductoPromocionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoPromocion")) {
				jButtonAnterioresProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoPromocion")) {
				jButtonAnterioresProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoPromocion")) {
				jButtonAnterioresProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoPromocion")) {
				jButtonSiguientesProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoPromocion")) {
				jButtonSiguientesProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoPromocion")) {
				jButtonSiguientesProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoPromocion") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoPromocion")) {
				jButtonAbrirOrderByProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoPromocion") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoPromocion")) {
				jButtonMostrarOcultarProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoPromocion")) {
				jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoPromocion")) {
				jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoPromocion")) {
				jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoPromocion")) {
				jButtonCerrarReporteDinamicoProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoPromocion")) {
				jButtonGenerarReporteDinamicoProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoPromocion")) {
				
				jButtonGenerarExcelReporteDinamicoProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoPromocion")) {
				jButtonCerrarImportacionProductoPromocionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoPromocion")) {
				
				jButtonGenerarImportacionProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoPromocion")) {
				
				jButtonAbrirImportacionProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoPromocion")) {
				jComboBoxTiposAccionesProductoPromocionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoPromocion")) {
				jComboBoxTiposRelacionesProductoPromocionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoPromocion")) {
				jComboBoxTiposAccionesProductoPromocionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoPromocion")) {
				
				jComboBoxTiposSeleccionarProductoPromocionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoPromocion")) {
				jTextFieldValorCampoGeneralProductoPromocionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoPromocion")) {
				jButtonAbrirOrderByProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoPromocion")) {
				jButtonAbrirOrderByProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoPromocion")) {
				jButtonCerrarOrderByProductoPromocionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoPromocionBusqueda")) {
				this.jButtonidProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoPromocionUpdate")) {
				this.jButtonid_empresaProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoPromocionBusqueda")) {
				this.jButtonid_empresaProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoPromocionUpdate")) {
				this.jButtonid_sucursalProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoPromocionBusqueda")) {
				this.jButtonid_sucursalProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoPromocionUpdate")) {
				this.jButtonid_bodegaProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoPromocionBusqueda")) {
				this.jButtonid_bodegaProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoPromocion")) {
				this.jButtonid_productoProductoPromocionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoPromocionUpdate")) {
				this.jButtonid_productoProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoPromocionBusqueda")) {
				this.jButtonid_productoProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_relacionProductoPromocionUpdate")) {
				this.jButtonid_bodega_relacionProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_relacionProductoPromocionBusqueda")) {
				this.jButtonid_bodega_relacionProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_producto_relacionProductoPromocion")) {
				this.jButtonid_producto_relacionProductoPromocionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_relacionProductoPromocionUpdate")) {
				this.jButtonid_producto_relacionProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_relacionProductoPromocionBusqueda")) {
				this.jButtonid_producto_relacionProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoPromocionBusqueda")) {
				this.jButtoncantidadProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProductoPromocionBusqueda")) {
				this.jButtonprecioProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoPromocionBusqueda")) {
				this.jButtonporcentajeProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoPromocionBusqueda")) {
				this.jButtondescripcionProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2ProductoPromocionBusqueda")) {
				this.jButtondescripcion2ProductoPromocionBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoPromocion")) {
				this.jButtonid_productoProductoPromocionActionPerformed(evt);
			}
			else if(sTipo.equals("id_producto_relacionProductoPromocion")) {
				this.jButtonid_producto_relacionProductoPromocionActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoPromocion")) {
				this.jButtonFK_IdBodegaProductoPromocionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaRelacionProductoPromocion")) {
				this.jButtonFK_IdBodegaRelacionProductoPromocionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoPromocion")) {
				this.jButtonFK_IdProductoProductoPromocionActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoRelacionProductoPromocion")) {
				this.jButtonFK_IdProductoRelacionProductoPromocionActionPerformed(evt);
			}
			
			;
			
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoPromocion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoPromocion productopromocionLocal=null;
			
			if(!this.getEsControlTabla()) {
				productopromocionLocal=this.productopromocion;
			} else {
				productopromocionLocal=this.productopromocionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
							
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
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
			
			


			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
								
						
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
								
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
							
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
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
			
			


			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
								
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoPromocion")) {
					jCheckBoxSeleccionarTodosProductoPromocionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoPromocion")) {
					jCheckBoxSeleccionadosProductoPromocionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoPromocion")) {
					
				}
				
				


				
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
												
				
				


				
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
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
			
			


			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPromocionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopromocion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopromocion);
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
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
				
				


				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPromocion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPromocion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPromocionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopromocionAnterior =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoPromocion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoPromocionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoPromocion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productopromocion =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productopromocion =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productopromocion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoPromocion")) {
				
				}
				
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoPromocion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoPromocion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoPromocion")) {
			
			}
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoPromocion();
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			if(sTipo.equals("NuevoProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoPromocion")) {
				jButtonDuplicarProductoPromocionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoPromocion")) {
				jButtonCopiarProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoPromocion")) {
				jButtonVerFormProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoPromocion")) {
				jButtonNuevoProductoPromocionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoPromocion")) {
				jButtonModificarProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoPromocion")) {
				jButtonActualizarProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoPromocion")) {
				jButtonEliminarProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoPromocion")) {
				jButtonCancelarProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoPromocion")) {
				jButtonCerrarProductoPromocionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoPromocion")) {
				jButtonGuardarCambiosProductoPromocionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoPromocion")) {
				jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoPromocion")) {
				jButtonAbrirOrderByProductoPromocionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoPromocion")) {
				jButtonRecargarInformacionProductoPromocionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoPromocion")) {
				jButtonAnterioresProductoPromocionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoPromocion")) {
				jButtonSiguientesProductoPromocionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoPromocionBusqueda")) {
				this.jButtonidProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoPromocionUpdate")) {
				this.jButtonid_empresaProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoPromocionBusqueda")) {
				this.jButtonid_empresaProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoPromocionUpdate")) {
				this.jButtonid_sucursalProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoPromocionBusqueda")) {
				this.jButtonid_sucursalProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoPromocionUpdate")) {
				this.jButtonid_bodegaProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoPromocionBusqueda")) {
				this.jButtonid_bodegaProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoPromocion")) {
				this.jButtonid_productoProductoPromocionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoPromocionUpdate")) {
				this.jButtonid_productoProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoPromocionBusqueda")) {
				this.jButtonid_productoProductoPromocionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_relacionProductoPromocionUpdate")) {
				this.jButtonid_bodega_relacionProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_relacionProductoPromocionBusqueda")) {
				this.jButtonid_bodega_relacionProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_producto_relacionProductoPromocion")) {
				this.jButtonid_producto_relacionProductoPromocionActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_relacionProductoPromocionUpdate")) {
				this.jButtonid_producto_relacionProductoPromocionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_relacionProductoPromocionBusqueda")) {
				this.jButtonid_producto_relacionProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoPromocionBusqueda")) {
				this.jButtoncantidadProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProductoPromocionBusqueda")) {
				this.jButtonprecioProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoPromocionBusqueda")) {
				this.jButtonporcentajeProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoPromocionBusqueda")) {
				this.jButtondescripcionProductoPromocionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2ProductoPromocionBusqueda")) {
				this.jButtondescripcion2ProductoPromocionBusquedaActionPerformed(evt);
			}
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoPromocion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoPromocion")) {
				closingInternalFrameProductoPromocion();
				
			} else if(sTipo.equals("jButtonCancelarProductoPromocion")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoPromocion = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoPromocionBeanSwingJInternalFrame jInternalFrameParent=(ProductoPromocionBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoPromocion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoPromocionActionPerformed(null);
			}
			
			ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productopromocion,new Object(),this.productopromocionParameterGeneral,this.productopromocionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoPromocion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoPromocion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoPromocion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productopromocion)) {
			if(!esControlTabla) {
				if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);			
				}
				
				if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoPromocion(this.productopromocion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productopromocionReturnGeneral=productopromocionLogic.procesarEventosProductoPromocionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopromocionLogic.getProductoPromocions(),this.productopromocion,this.productopromocionParameterGeneral,this.isEsNuevoProductoPromocion,classes);//this.productopromocionLogic.getProductoPromocion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoPromocion(this.productopromocionReturnGeneral,this.productopromocionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoPromocion(classes,this.productopromocionReturnGeneral,this.productopromocionBean,false);
					}
						
					if(this.productopromocionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion());	
					}
						
					if(this.productopromocionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion(),classes);//this.productopromocionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoPromocion(this.productopromocion,classes);//this.productopromocionBean);									
				}
			
				if(ProductoPromocionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoPromocion(this.productopromocion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPromocion(this.productopromocion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productopromocionAnterior!=null) {
						this.productopromocion=this.productopromocionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productopromocionReturnGeneral=productopromocionLogic.procesarEventosProductoPromocionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopromocionLogic.getProductoPromocions(),this.productopromocion,this.productopromocionParameterGeneral,this.isEsNuevoProductoPromocion,classes);//this.productopromocionLogic.getProductoPromocion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productopromocionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productopromocionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productopromocionReturnGeneral.getProductoPromocion(),productopromocionLogic.getProductoPromocions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productopromocionReturnGeneral.getProductoPromocion(),this.productopromocions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoPromocion.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoPromocion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoPromocion();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoPromocion() throws Exception {
		
		ProductoPromocionModel productopromocionModel=(ProductoPromocionModel)this.jTableDatosProductoPromocion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productopromocionModel.productopromocions=this.productopromocionLogic.getProductoPromocions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productopromocionModel.productopromocions=this.productopromocions;
		}
		
		
		((ProductoPromocionModel) this.jTableDatosProductoPromocion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoPromocion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductopromocionAnterior(),this.productopromocionLogic.getProductoPromocions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductopromocionAnterior(),this.productopromocions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoPromocion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoPromocion(ProductoPromocion productopromocion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
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
										
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopromocion,new Object(),generalEntityParameterGeneral,this.productopromocionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productopromocionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoPromocionConstantesFunciones.getClassesRelationshipsOfProductoPromocion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoPromocionConstantesFunciones.getClassesRelationshipsFromStringsOfProductoPromocion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoPromocion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoPromocionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopromocion,new Object(),generalEntityParameterGeneral,this.productopromocionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoPromocion(ProductoPromocionBean productopromocionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoPromocion(ArrayList<Classe> classes,ProductoPromocionReturnGeneral productopromocionReturnGeneral,ProductoPromocionBean productopromocionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoPromocion(ProductoPromocion productopromocion,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productopromocion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoPromocion = new ProductoPromocionDetalleFormJInternalFrame(jDesktopPane,this.productopromocionSessionBean.getConGuardarRelaciones(),this.productopromocionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.setVisible(false);
		this.jInternalFrameDetalleFormProductoPromocion.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoPromocion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoPromocion.productopromocionLogic=this.productopromocionLogic;
		
		this.cargarCombosFrameForeignKeyProductoPromocion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoPromocion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoPromocion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoPromocion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoPromocion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoPromocion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoPromocion"));
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarProductoPromocion.addActionListener(new ButtonActionListener(this,"ModificarProductoPromocion"));

		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoPromocion"));
					
		this.jInternalFrameDetalleFormProductoPromocion.jMenuItemModificarProductoPromocion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoPromocion"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarProductoPromocion.addActionListener (new ButtonActionListener(this,"ActualizarProductoPromocion"));
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoPromocion"));
						
		this.jInternalFrameDetalleFormProductoPromocion.jMenuItemActualizarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoPromocion"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarProductoPromocion.addActionListener (new ButtonActionListener(this,"EliminarProductoPromocion"));
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoPromocion"));
								
		this.jInternalFrameDetalleFormProductoPromocion.jMenuItemEliminarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoPromocion"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarProductoPromocion.addActionListener (new ButtonActionListener(this,"CancelarProductoPromocion"));
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoPromocion"));
					
		this.jInternalFrameDetalleFormProductoPromocion.jMenuItemCancelarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoPromocion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jMenuItemDetalleCerrarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoPromocion"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoPromocion"));
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoPromocion"));
		
		
		
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoPromocion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonidProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"idProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_empresaProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_empresaProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_sucursalProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_sucursalProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodegaProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodegaProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoPromocionBusqueda"));
		//jButtonid_productoProductoPromocion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoPromocionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocion.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodega_relacionProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_relacionProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodega_relacionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_relacionProductoPromocionBusqueda"));
		//jButtonid_producto_relacionProductoPromocion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_producto_relacionProductoPromocionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocion.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtoncantidadProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonprecioProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"precioProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonporcentajeProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtondescripcionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtondescripcion2ProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2ProductoPromocionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoPromocion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoPromocion"));
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoPromocion"));
		}
		
		this.jTableDatosProductoPromocion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoPromocion"));
		
		this.jTableDatosProductoPromocion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoPromocion"));
		
		this.jButtonNuevoProductoPromocion.addActionListener(new ButtonActionListener(this,"NuevoProductoPromocion"));
		
		this.jButtonDuplicarProductoPromocion.addActionListener(new ButtonActionListener(this,"DuplicarProductoPromocion"));
		
		this.jButtonCopiarProductoPromocion.addActionListener(new ButtonActionListener(this,"CopiarProductoPromocion"));
		
		this.jButtonVerFormProductoPromocion.addActionListener(new ButtonActionListener(this,"VerFormProductoPromocion"));
		
		
		this.jButtonNuevoToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoPromocion"));
			
		this.jButtonDuplicarToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoPromocion"));
			
		this.jMenuItemNuevoProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoPromocion"));
			
		this.jMenuItemDuplicarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoPromocion"));		
		
		
		this.jButtonNuevoRelacionesProductoPromocion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoPromocion"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoPromocion"));
			
		this.jMenuItemNuevoRelacionesProductoPromocion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoPromocion"));		
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarProductoPromocion.addActionListener(new ButtonActionListener(this,"ModificarProductoPromocion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonModificarToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoPromocion"));
			
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemModificarProductoPromocion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoPromocion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarProductoPromocion.addActionListener (new ButtonActionListener(this,"ActualizarProductoPromocion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonActualizarToolBarProductoPromocion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoPromocion"));
				
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemActualizarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoPromocion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarProductoPromocion.addActionListener (new ButtonActionListener(this,"EliminarProductoPromocion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonEliminarToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoPromocion"));
						
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemEliminarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoPromocion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarProductoPromocion.addActionListener (new ButtonActionListener(this,"CancelarProductoPromocion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonCancelarToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoPromocion"));
			
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemCancelarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoPromocion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoPromocion"));		
		
		
		this.jButtonCerrarProductoPromocion.addActionListener (new ButtonActionListener(this,"CerrarProductoPromocion"));
		
		
		this.jButtonCerrarToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoPromocion"));
			
		this.jMenuItemCerrarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoPromocion"));
			
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jMenuItemDetalleCerrarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoPromocion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoPromocion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoPromocion"));
		}
		
		this.jButtonCopiarToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoPromocion"));
			
		this.jButtonVerFormToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoPromocion"));
		
		this.jMenuItemGuardarCambiosProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoPromocion"));
			
		this.jMenuItemCopiarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoPromocion"));		
		
		this.jMenuItemVerFormProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoPromocion"));		
		
		
		this.jButtonGuardarCambiosTablaProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoPromocion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoPromocion"));
			
		this.jMenuItemGuardarCambiosTablaProductoPromocion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoPromocion"));		
		
		
		
		this.jButtonRecargarInformacionProductoPromocion.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoPromocion"));
					
		this.jButtonRecargarInformacionToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoPromocion"));
		
		this.jMenuItemRecargarInformacionProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoPromocion"));		
		
		
		
		this.jButtonAnterioresProductoPromocion.addActionListener (new ButtonActionListener(this,"AnterioresProductoPromocion"));
		
		
		this.jButtonAnterioresToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoPromocion"));
		
		this.jMenuItemAnterioresProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoPromocion"));		
		
		
		this.jButtonSiguientesProductoPromocion.addActionListener (new ButtonActionListener(this,"SiguientesProductoPromocion"));
		
		
		this.jButtonSiguientesToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoPromocion"));
			
		this.jMenuItemSiguientesProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoPromocion"));
			
		this.jMenuItemAbrirOrderByProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoPromocion"));
			
		this.jMenuItemMostrarOcultarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoPromocion"));
			
		this.jMenuItemDetalleAbrirOrderByProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoPromocion"));
			
		this.jMenuItemDetalleMostarOcultarProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoPromocion"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoPromocion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoPromocion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoPromocion"));
			
		this.jMenuItemNuevoGuardarCambiosProductoPromocion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoPromocion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoPromocion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoPromocion"));

		this.jCheckBoxSeleccionadosProductoPromocion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoPromocion"));
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoPromocion"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoPromocion.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoPromocion"));
			
		this.jComboBoxTiposAccionesProductoPromocion.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoPromocion"));
					
		this.jComboBoxTiposSeleccionarProductoPromocion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoPromocion"));
			
		this.jTextFieldValorCampoGeneralProductoPromocion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoPromocion"));		
		
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonidProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"idProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_empresaProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_empresaProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_sucursalProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_sucursalProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodegaProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodegaProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoPromocionBusqueda"));
		//jButtonid_productoProductoPromocion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoPromocionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocion.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodega_relacionProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_relacionProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodega_relacionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_relacionProductoPromocionBusqueda"));
		//jButtonid_producto_relacionProductoPromocion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_producto_relacionProductoPromocionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocion.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtoncantidadProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonprecioProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"precioProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonporcentajeProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtondescripcionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtondescripcion2ProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2ProductoPromocionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoPromocion"));

			this.jButtonFK_IdBodegaRelacionProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaRelacionProductoPromocion"));

			this.jButtonFK_IdProductoProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoPromocion"));

			this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocion"));

			this.jButtonFK_IdProductoRelacionProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdProductoRelacionProductoPromocion"));

			this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoPromocion!=null) {
				this.jInternalFrameReporteDinamicoProductoPromocion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoPromocion"));
				this.jInternalFrameReporteDinamicoProductoPromocion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoPromocion"));
				this.jInternalFrameReporteDinamicoProductoPromocion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoPromocion"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoPromocion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoPromocion"));				
			//this.jButtonGenerarReporteDinamicoProductoPromocion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoPromocion"));
			//this.jButtonGenerarExcelReporteDinamicoProductoPromocion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoPromocion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoPromocion!=null) {
				this.jInternalFrameImportacionProductoPromocion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoPromocion"));
				this.jInternalFrameImportacionProductoPromocion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoPromocion"));
				this.jInternalFrameImportacionProductoPromocion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoPromocion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoPromocion.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoPromocion"));
			
			this.jButtonAbrirOrderByToolBarProductoPromocion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoPromocion"));			
			
			if(this.jInternalFrameOrderByProductoPromocion!=null) {
				this.jInternalFrameOrderByProductoPromocion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoPromocion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPromocion.jTabbedPaneRelacionesProductoPromocion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoPromocion"));
		
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
            		closingInternalFrameProductoPromocion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoPromocion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoPromocion = (JInternalFrameBase)event.getSource();
	            	
	            ProductoPromocionBeanSwingJInternalFrame jInternalFrameParent=(ProductoPromocionBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoPromocion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoPromocionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoPromocion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoPromocionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoPromocion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoPromocion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPromocionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPromocionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPromocionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoPromocion";
		inputMap = this.jButtonNuevoProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoPromocionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPromocionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPromocionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPromocionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoPromocion";
		inputMap = this.jButtonNuevoRelacionesProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoPromocionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoPromocion";
		inputMap = this.jButtonModificarProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoPromocionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoPromocion";
		inputMap = this.jButtonActualizarProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoPromocionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoPromocion";
		inputMap = this.jButtonEliminarProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoPromocionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoPromocion";
		inputMap = this.jButtonCancelarProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoPromocionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoPromocion";
		inputMap = this.jButtonCerrarProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoPromocionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoPromocion";
		inputMap = this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoPromocion.jButtonGuardarCambiosProductoPromocion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoPromocionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoPromocion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoPromocionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoPromocion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoPromocionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoPromocion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoPromocionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoPromocion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoPromocionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonidProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"idProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_empresaProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_empresaProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_sucursalProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_sucursalProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodegaProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodegaProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoPromocionBusqueda"));
		//jButtonid_productoProductoPromocion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoPromocionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocion.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodega_relacionProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_relacionProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_bodega_relacionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_relacionProductoPromocionBusqueda"));
		//jButtonid_producto_relacionProductoPromocion.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_producto_relacionProductoPromocionActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocion.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocion"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocionUpdate.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtoncantidadProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonprecioProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"precioProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtonporcentajeProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtondescripcionProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoPromocionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPromocion.jButtondescripcion2ProductoPromocionBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2ProductoPromocionBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoPromocion"));

		this.jButtonFK_IdBodegaRelacionProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdBodegaRelacionProductoPromocion"));

		this.jButtonFK_IdProductoProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoPromocion"));

		this.jButtonBuscarFK_IdProductoid_productoProductoPromocion.addActionListener(new ButtonActionListener(this,"id_productoProductoPromocion"));

		this.jButtonFK_IdProductoRelacionProductoPromocion.addActionListener(new ButtonActionListener(this,"FK_IdProductoRelacionProductoPromocion"));

		this.jButtonBuscarFK_IdProductoRelacionid_producto_relacionProductoPromocion.addActionListener(new ButtonActionListener(this,"id_producto_relacionProductoPromocion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoPromocion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoPromocionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoPromocionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoPromocion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoPromocion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
					productopromocionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPromocion productopromocionAux:productopromocions) {
					productopromocionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoPromocionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoPromocion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
						productopromocionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoPromocion productopromocionAux:productopromocions) {
						productopromocionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoPromocion productopromocionAux:productopromocions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoPromocion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoPromocion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoPromocion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoPromocionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoPromocion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoPromocion.getSelectedRows();
			
			ProductoPromocion productopromocionLocal=new ProductoPromocion();
			
			//this.seleccionarTodosProductoPromocion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopromocionLocal =(ProductoPromocion) this.productopromocionLogic.getProductoPromocions().toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productopromocionLocal =(ProductoPromocion) this.productopromocions.toArray()[this.jTableDatosProductoPromocion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productopromocionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
						productopromocionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoPromocion productopromocionAux:productopromocions) {
						productopromocionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoPromocion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoPromocion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoPromocion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoPromocion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoPromocionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoPromocionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoPromocionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoPromocion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoPromocion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoPromocion productopromocionAux:this.productopromocionLogic.getProductoPromocions()) {
				
						if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productopromocionAux.setcantidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							productopromocionAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productopromocionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productopromocionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							productopromocionAux.setdescripcion2(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPromocion productopromocionAux:productopromocions) {
					
						if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productopromocionAux.setcantidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							productopromocionAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productopromocionAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productopromocionAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							productopromocionAux.setdescripcion2(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoPromocion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoPromocionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoPromocion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoPromocion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoPromocion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoPromocion) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoPromocion(conSplash);
				
					this.generarReporteProductoPromocionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoPromocionsSeleccionados();
				//this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoPromocionsSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoPromocionsSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoPromocion();
				
				this.exportarProductoPromocionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoPromocions();
				//this.importarProductoPromocions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoPromocion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoPromocionsSeleccionados();
				//this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Promocion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoPromocion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoPromocion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoPromocion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoPromocionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoPromocion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoPromocion(conSplash);
					
						//this.actualizarParametrosGeneralProductoPromocion();
						
						this.generarReporteProcesoAccionProductoPromocionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoPromocionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO PromocionS SELECCIONADOS?", "MANTENIMIENTO DE Promocion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoPromocion();
				
						this.actualizarParametrosGeneralProductoPromocion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productopromocionReturnGeneral=productopromocionLogic.procesarAccionProductoPromocionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productopromocionLogic.getProductoPromocions(),this.productopromocionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoPromocionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoPromocion();
					
					ProductoPromocionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoPromocionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoPromocion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoPromocion.jComboBoxTiposAccionesFormularioProductoPromocion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoPromocion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoPromocionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoPromocion();
			
			if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
			ProductoPromocion productopromocion=new ProductoPromocion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoPromocion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoPromocion.getSelectedItem();
			
			
			
			
			productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(productopromocionsSeleccionados.size()==1) {
				for(ProductoPromocion productopromocionAux:productopromocionsSeleccionados) {
					productopromocion=productopromocionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoPromocion();
			
      		//this.finishProcessProductoPromocion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoPromocionReturnGeneral() throws Exception {
		if(this.productopromocionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productopromocionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productopromocionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productopromocionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productopromocionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productopromocionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoPromocion(false);
		}
		
		if(this.productopromocionReturnGeneral.getConRetornoLista() || this.productopromocionReturnGeneral.getConRetornoObjeto()) {
			if(this.productopromocionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productopromocionLogic.setProductoPromocions(this.productopromocionReturnGeneral.getProductoPromocions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productopromocionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productopromocionLogic.setProductoPromocion(this.productopromocionReturnGeneral.getProductoPromocion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoPromocion(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoPromocion() throws Exception {
		
		
	}
	
	public ArrayList<ProductoPromocion> getProductoPromocionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoPromocion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoPromocion productopromocionAux:productopromocionLogic.getProductoPromocions()) {
					if(productopromocionAux.getIsSelected()) {
						productopromocionsSeleccionados.add(productopromocionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPromocion productopromocionAux:this.productopromocions) {
					if(productopromocionAux.getIsSelected()) {
						productopromocionsSeleccionados.add(productopromocionAux);				
					}
				}
			}
			
			if(productopromocionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productopromocionsSeleccionados.addAll(this.productopromocionLogic.getProductoPromocions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productopromocionsSeleccionados.addAll(this.productopromocions);				
					}
				}
			}
		} else {
			productopromocionsSeleccionados.add(this.productopromocion);
		}
		
		return productopromocionsSeleccionados;
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
	
	public void generarReporteProductoPromocionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoPromocionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoPromocionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoPromocionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoPromocionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Promocion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoPromocionsSeleccionados() throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoPromocionsSeleccionados() throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoPromocionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoPromocionsSeleccionados() throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoPromocion();
		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoPromocion();
		
		
		//this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados ,productopromocionImplementable,productopromocionImplementableHome);
	}
	
	public void mostrarImportacionProductoPromocions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoPromocion();
		
		this.abrirFrameImportacionProductoPromocion();		
		
			
		//this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados ,productopromocionImplementable,productopromocionImplementableHome);
	}
	
	public void importarProductoPromocions() throws Exception {		
	
	}
	
	public void exportarProductoPromocionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoPromocionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoPromocionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoPromocionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Promocion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoPromocionsSeleccionados() throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoPromocion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoPromocion productopromocionAux:productopromocionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoPromocion(productopromocionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productopromocionAux.setsDetalleGeneralEntityReporte(productopromocionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoPromocion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoPromocion(ProductoPromocion productopromocion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productopromocion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getbodegarelacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getproductorelacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopromocion.getdescripcion2();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoPromocionsSeleccionados() throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoPromocions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoPromocion(row);				
				iRow++;
			}				
			
			for(ProductoPromocion productopromocionAux:productopromocionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoPromocion(productopromocionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoPromocionsSeleccionados() throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();		
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopromocion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productopromocions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productopromocion");
			//elementRoot.appendChild(element);
		
			for(ProductoPromocion productopromocionAux:productopromocionsSeleccionados) {
				element = document.createElement("productopromocion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoPromocion(productopromocionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Promocion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoPromocion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoPromocion(ProductoPromocion productopromocion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getbodegarelacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getproductorelacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopromocion.getdescripcion2());				
	}
	
	public void setFilaDatosExportarXmlProductoPromocion(ProductoPromocion productopromocion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoPromocionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productopromocion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoPromocionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productopromocion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoPromocionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productopromocion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoPromocionConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productopromocion.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoPromocionConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productopromocion.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoPromocionConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productopromocion.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementbodegarelacion_descripcion = document.createElement(ProductoPromocionConstantesFunciones.IDBODEGARELACION);
		elementbodegarelacion_descripcion.appendChild(document.createTextNode(productopromocion.getbodegarelacion_descripcion()));
		element.appendChild(elementbodegarelacion_descripcion);

		Element elementproductorelacion_descripcion = document.createElement(ProductoPromocionConstantesFunciones.IDPRODUCTORELACION);
		elementproductorelacion_descripcion.appendChild(document.createTextNode(productopromocion.getproductorelacion_descripcion()));
		element.appendChild(elementproductorelacion_descripcion);

		Element elementcantidad = document.createElement(ProductoPromocionConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productopromocion.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(ProductoPromocionConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(productopromocion.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementporcentaje = document.createElement(ProductoPromocionConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(productopromocion.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementdescripcion = document.createElement(ProductoPromocionConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productopromocion.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementdescripcion2 = document.createElement(ProductoPromocionConstantesFunciones.DESCRIPCION2);
		elementdescripcion2.appendChild(document.createTextNode(productopromocion.getdescripcion2().trim()));
		element.appendChild(elementdescripcion2);
	}
	
	public void generarReporteGroupGenericoProductoPromocionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoPromocion> productopromocionsSeleccionados=new ArrayList<ProductoPromocion>();
		
		productopromocionsSeleccionados=this.getProductoPromocionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoPromocion(productopromocionsSeleccionados);
		
		this.generarReporteProductoPromocions("Todos",productopromocionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoPromocion(ArrayList<ProductoPromocion> productopromocionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoPromocion productopromocionAux:productopromocionsSeleccionados) {
				productopromocionAux.setsDetalleGeneralEntityReporte(productopromocionAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_IDBODEGARELACION)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getbodegarelacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_IDPRODUCTORELACION)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getproductorelacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPromocionConstantesFunciones.LABEL_DESCRIPCION2)) {
					existe=true;
					productopromocionAux.setsDescripcionGeneralEntityReporte1(productopromocionAux.getdescripcion2());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPromocionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoPromocion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoPromocion=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=true;
				this.isVisibilidadCeldaGuardarCambiosProductoPromocion=true;
			}
			
			this.isVisibilidadCeldaModificarProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=false;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
			this.isVisibilidadCeldaModificarProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=true;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
			this.isVisibilidadCeldaModificarProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=true;
			this.isVisibilidadCeldaEliminarProductoPromocion=true;
			this.isVisibilidadCeldaCancelarProductoPromocion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
			this.isVisibilidadCeldaModificarProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=true;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoPromocion=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=true;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=true;
			this.isVisibilidadCeldaModificarProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=false;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
			this.isVisibilidadCeldaActualizarProductoPromocion=false;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
			this.isVisibilidadCeldaModificarProductoPromocion=true;
			this.isVisibilidadCeldaActualizarProductoPromocion=false;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
			this.isVisibilidadCeldaCancelarProductoPromocion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoPromocion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoPromocionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoPromocion=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=true;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=true;
		} else {
			this.actualizarEstadoPanelsProductoPromocion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoPromocion=false;
			//this.isVisibilidadCeldaVerFormProductoPromocion=false;
			this.isVisibilidadCeldaDuplicarProductoPromocion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productopromocionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoPromocion=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPromocion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productopromocionSessionBean.getEsGuardarRelacionado()) {
			if(!productopromocionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;												
			}
			
			this.jButtonCerrarProductoPromocion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoPromocion=false;
		}
		
		if(!this.permiteMantenimiento(this.productopromocion)) {
			this.isVisibilidadCeldaActualizarProductoPromocion=false;
			this.isVisibilidadCeldaEliminarProductoPromocion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoPromocion() {
	}
	
	public void actualizarEstadoPanelsProductoPromocion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoPromocion!=null) {
				this.jScrollPanelDatosEdicionProductoPromocion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPromocion!=null) {
				this.jScrollPanelDatosProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPromocion!=null) {
				this.jPanelPaginacionProductoPromocion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
					this.jTabbedPaneBusquedasProductoPromocion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productopromocionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPromocion!=null) {
				this.jTabbedPaneBusquedasProductoPromocion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoPromocion!=null) {
				this.jPanelParametrosReportesProductoPromocion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaProductoPromocion);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaRelacionProductoPromocion);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoProductoPromocion);}

			this.isVisibilidadFK_IdProductoRelacion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoRelacionProductoPromocion);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaProductoPromocion);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaRelacionProductoPromocion);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoProductoPromocion);}

			this.isVisibilidadFK_IdProductoRelacion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoRelacionProductoPromocion);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaProductoPromocion);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaRelacionProductoPromocion);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoProductoPromocion);}

			this.isVisibilidadFK_IdProductoRelacion=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoRelacionProductoPromocion);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaProductoPromocion);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaRelacionProductoPromocion);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoProductoPromocion);}

			this.isVisibilidadFK_IdProductoRelacion=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoRelacionProductoPromocion);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodegaRelacion(Boolean isParaBodegaRelacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaRelacionNegation=!isParaBodegaRelacion;

			this.isVisibilidadFK_IdBodega=isParaBodegaRelacionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaProductoPromocion);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaBodegaRelacion;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaRelacionProductoPromocion);}

			this.isVisibilidadFK_IdProducto=isParaBodegaRelacionNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoProductoPromocion);}

			this.isVisibilidadFK_IdProductoRelacion=isParaBodegaRelacionNegation;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoRelacionProductoPromocion);}
		}
		
	}

	public void setVisibilidadBusquedasParaProductoRelacion(Boolean isParaProductoRelacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoRelacionNegation=!isParaProductoRelacion;

			this.isVisibilidadFK_IdBodega=isParaProductoRelacionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaProductoPromocion);}

			this.isVisibilidadFK_IdBodegaRelacion=isParaProductoRelacionNegation;
			if(!this.isVisibilidadFK_IdBodegaRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdBodegaRelacionProductoPromocion);}

			this.isVisibilidadFK_IdProducto=isParaProductoRelacionNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoProductoPromocion);}

			this.isVisibilidadFK_IdProductoRelacion=isParaProductoRelacion;
			if(!this.isVisibilidadFK_IdProductoRelacion) {this.jTabbedPaneBusquedasProductoPromocion.remove(jPanelFK_IdProductoRelacionProductoPromocion);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoPromocionParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productopromocionSessionBean==null) {
				productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productopromocionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productopromocionFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoPromocionConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoPromocion(true);
			//productoSessionBean.setlidProductoPromocionActual(this.idProductoPromocionActual);

			productopromocionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion(true);
			productopromocionSessionBean.setlIdProductoPromocionActualForeignKey(this.idProductoPromocionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionProductoPromocionParaBusquedaProductoRelacions() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productopromocionSessionBean==null) {
				productopromocionSessionBean=new ProductoPromocionSessionBean();
			}

			if(productorelacionSessionBean==null) {
				productorelacionSessionBean=new ProductoSessionBean();
			}

			productorelacionSessionBean.setsPathNavegacionActual(productopromocionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productorelacionSessionBean.setisPermiteRecargarInformacion(false);
			productorelacionSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productorelacionSessionBean.getisPaginaPopup();
			productorelacionSessionBean.setisPaginaPopup(false);
			productorelacionSessionBean.setEstaModoBusqueda(true);
			productorelacionSessionBean.setsFuncionBusquedaRapida("window.opener.productopromocionFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto_relacion(TO_REPLACE);");
			productorelacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productorelacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoPromocionConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoPromocion(true);
			//productoSessionBean.setlidProductoPromocionActual(this.idProductoPromocionActual);

			productopromocionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoPromocion(true);
			productopromocionSessionBean.setlIdProductoPromocionActualForeignKey(this.idProductoPromocionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoPromocionSessionBean productopromocionSessionBean=new ProductoPromocionSessionBean();
		
		if(this.productopromocionSessionBean==null) {
			this.productopromocionSessionBean=new ProductoPromocionSessionBean();
		}
		
		this.productopromocionSessionBean.setsUltimaBusquedaProductoPromocion(this.getsAccionBusqueda());
		this.productopromocionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productopromocionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productopromocionSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodegaRelacion")) {
			productopromocionSessionBean.setid_bodega_relacion(this.getid_bodega_relacionFK_IdBodegaRelacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productopromocionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productopromocionSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProductoRelacion")) {
			productopromocionSessionBean.setid_producto_relacion(this.getid_producto_relacionFK_IdProductoRelacion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productopromocionSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoPromocionSessionBean productopromocionSessionBean=new ProductoPromocionSessionBean();
		
		if(this.productopromocionSessionBean==null) {
			this.productopromocionSessionBean=new ProductoPromocionSessionBean();
		}
		
		if(this.productopromocionSessionBean.getsUltimaBusquedaProductoPromocion()!=null&&!this.productopromocionSessionBean.getsUltimaBusquedaProductoPromocion().equals("")) {
			this.setsAccionBusqueda(productopromocionSessionBean.getsUltimaBusquedaProductoPromocion());
			this.setiNumeroPaginacion(productopromocionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productopromocionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productopromocionSessionBean.getid_bodega());
				productopromocionSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodegaRelacion")) {
				this.setid_bodega_relacionFK_IdBodegaRelacion(productopromocionSessionBean.getid_bodega_relacion());
				productopromocionSessionBean.setid_bodega_relacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productopromocionSessionBean.getid_empresa());
				productopromocionSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productopromocionSessionBean.getid_producto());
				productopromocionSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProductoRelacion")) {
				this.setid_producto_relacionFK_IdProductoRelacion(productopromocionSessionBean.getid_producto_relacion());
				productopromocionSessionBean.setid_producto_relacion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productopromocionSessionBean.getid_sucursal());
				productopromocionSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productopromocionSessionBean.setsUltimaBusquedaProductoPromocion("");
		this.productopromocionSessionBean.setiNumeroPaginacion(ProductoPromocionConstantesFunciones.INUMEROPAGINACION);
		this.productopromocionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoPromocion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoPromocion() {
		this.updateBorderResaltarBusquedasFormularioProductoPromocion();
		this.updateVisibilidadBusquedasFormularioProductoPromocion();
		this.updateHabilitarBusquedasFormularioProductoPromocion();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoPromocion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoPromocion.getComponents().length>0) {
	

		if(this.productopromocionConstantesFunciones.resaltarFK_IdBodegaProductoPromocion!=null) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaProductoPromocion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdBodegaProductoPromocion);
			}
		}

		if(this.productopromocionConstantesFunciones.resaltarFK_IdBodegaRelacionProductoPromocion!=null) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaRelacionProductoPromocion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdBodegaRelacionProductoPromocion);
			}
		}

		if(this.productopromocionConstantesFunciones.resaltarFK_IdProductoProductoPromocion!=null) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoProductoPromocion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdProductoProductoPromocion);
			}
		}

		if(this.productopromocionConstantesFunciones.resaltarFK_IdProductoRelacionProductoPromocion!=null) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoRelacionProductoPromocion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdProductoRelacionProductoPromocion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoPromocion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoPromocion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaProductoPromocion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopromocionConstantesFunciones.mostrarFK_IdBodegaProductoPromocion);
			if(!this.productopromocionConstantesFunciones.mostrarFK_IdBodegaProductoPromocion && index>-1) {
				this.jTabbedPaneBusquedasProductoPromocion.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaRelacionProductoPromocion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopromocionConstantesFunciones.mostrarFK_IdBodegaRelacionProductoPromocion);
			if(!this.productopromocionConstantesFunciones.mostrarFK_IdBodegaRelacionProductoPromocion && index>-1) {
				this.jTabbedPaneBusquedasProductoPromocion.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoProductoPromocion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopromocionConstantesFunciones.mostrarFK_IdProductoProductoPromocion);
			if(!this.productopromocionConstantesFunciones.mostrarFK_IdProductoProductoPromocion && index>-1) {
				this.jTabbedPaneBusquedasProductoPromocion.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoRelacionProductoPromocion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopromocionConstantesFunciones.mostrarFK_IdProductoRelacionProductoPromocion);
			if(!this.productopromocionConstantesFunciones.mostrarFK_IdProductoRelacionProductoPromocion && index>-1) {
				this.jTabbedPaneBusquedasProductoPromocion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoPromocion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoPromocion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaProductoPromocion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopromocionConstantesFunciones.activarFK_IdBodegaProductoPromocion);
				this.jTabbedPaneBusquedasProductoPromocion.setEnabledAt(index,this.productopromocionConstantesFunciones.activarFK_IdBodegaProductoPromocion);
			}

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaRelacionProductoPromocion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopromocionConstantesFunciones.activarFK_IdBodegaRelacionProductoPromocion);
				this.jTabbedPaneBusquedasProductoPromocion.setEnabledAt(index,this.productopromocionConstantesFunciones.activarFK_IdBodegaRelacionProductoPromocion);
			}

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoProductoPromocion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopromocionConstantesFunciones.activarFK_IdProductoProductoPromocion);
				this.jTabbedPaneBusquedasProductoPromocion.setEnabledAt(index,this.productopromocionConstantesFunciones.activarFK_IdProductoProductoPromocion);
			}

			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoRelacionProductoPromocion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopromocionConstantesFunciones.activarFK_IdProductoRelacionProductoPromocion);
				this.jTabbedPaneBusquedasProductoPromocion.setEnabledAt(index,this.productopromocionConstantesFunciones.activarFK_IdProductoRelacionProductoPromocion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoPromocion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaProductoPromocion);

			this.jTabbedPaneBusquedasProductoPromocion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);

			this.productopromocionConstantesFunciones.setResaltarFK_IdBodegaProductoPromocion(resaltar);

			jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdBodegaProductoPromocion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodegaRelacion")) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdBodegaRelacionProductoPromocion);

			this.jTabbedPaneBusquedasProductoPromocion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);

			this.productopromocionConstantesFunciones.setResaltarFK_IdBodegaRelacionProductoPromocion(resaltar);

			jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdBodegaRelacionProductoPromocion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoProductoPromocion);

			this.jTabbedPaneBusquedasProductoPromocion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);

			this.productopromocionConstantesFunciones.setResaltarFK_IdProductoProductoPromocion(resaltar);

			jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdProductoProductoPromocion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProductoRelacion")) {
			index= this.jTabbedPaneBusquedasProductoPromocion.indexOfComponent(this.jPanelFK_IdProductoRelacionProductoPromocion);

			this.jTabbedPaneBusquedasProductoPromocion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPromocion.getComponent(index);

			this.productopromocionConstantesFunciones.setResaltarFK_IdProductoRelacionProductoPromocion(resaltar);

			jPanel.setBorder(this.productopromocionConstantesFunciones.resaltarFK_IdProductoRelacionProductoPromocion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoPromocion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoPromocion() throws Exception {

		if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoPromocion();
		this.updateVisibilidadResaltarControlesFormularioProductoPromocion();
		this.updateHabilitarResaltarControlesFormularioProductoPromocion();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoPromocion() throws Exception {
		if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productopromocionConstantesFunciones.resaltaridProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltaridProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarid_empresaProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarid_empresaProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarid_sucursalProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarid_sucursalProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarid_bodegaProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarid_bodegaProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarid_productoProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarid_productoProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarid_bodega_relacionProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarid_bodega_relacionProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarid_producto_relacionProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarid_producto_relacionProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarcantidadProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarcantidadProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarprecioProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarprecioProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltarporcentajeProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltarporcentajeProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltardescripcionProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltardescripcionProductoPromocion);}
		if(this.productopromocionConstantesFunciones.resaltardescripcion2ProductoPromocion!=null && this.jInternalFrameDetalleFormProductoPromocion!=null) {this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setBorder(this.productopromocionConstantesFunciones.resaltardescripcion2ProductoPromocion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoPromocion() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
	
		//this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostraridProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelidProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostraridProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_empresaProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelid_empresaProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_empresaProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_sucursalProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelid_sucursalProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_sucursalProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_bodegaProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelid_bodegaProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_bodegaProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_productoProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelid_productoProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_productoProductoPromocion);
			this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_productoProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_bodega_relacionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelid_bodega_relacionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_bodega_relacionProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_producto_relacionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelid_producto_relacionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_producto_relacionProductoPromocion);
			this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarid_producto_relacionProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarcantidadProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelcantidadProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarcantidadProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarprecioProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelprecioProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarprecioProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarporcentajeProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPanelporcentajeProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrarporcentajeProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrardescripcionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPaneldescripcionProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrardescripcionProductoPromocion);
		//this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrardescripcion2ProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jPaneldescripcion2ProductoPromocion.setVisible(this.productopromocionConstantesFunciones.mostrardescripcion2ProductoPromocion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoPromocion() throws Exception {
		if(this.jInternalFrameDetalleFormProductoPromocion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoPromocion!=null) {
	
		this.jInternalFrameDetalleFormProductoPromocion.jLabelidProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activaridProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_empresaProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_empresaProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_sucursalProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_sucursalProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodegaProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_bodegaProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_productoProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_productoProductoPromocion);
			this.jInternalFrameDetalleFormProductoPromocion.jButtonid_productoProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_productoProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_bodega_relacionProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_bodega_relacionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jComboBoxid_producto_relacionProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_producto_relacionProductoPromocion);
			this.jInternalFrameDetalleFormProductoPromocion.jButtonid_producto_relacionProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarid_producto_relacionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextFieldcantidadProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarcantidadProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextFieldprecioProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarprecioProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextFieldporcentajeProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activarporcentajeProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcionProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activardescripcionProductoPromocion);
		this.jInternalFrameDetalleFormProductoPromocion.jTextAreadescripcion2ProductoPromocion.setEnabled(this.productopromocionConstantesFunciones.activardescripcion2ProductoPromocion);
		}
	}
	
		
}