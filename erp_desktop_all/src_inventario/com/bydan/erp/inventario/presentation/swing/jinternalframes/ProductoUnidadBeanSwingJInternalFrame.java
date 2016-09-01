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

import com.bydan.erp.inventario.util.ProductoUnidadConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoUnidadParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoUnidadParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoUnidadBean;
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
public class ProductoUnidadBeanSwingJInternalFrame extends ProductoUnidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoUnidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoUnidad> productounidadValidator = new ClassValidator<ProductoUnidad>(ProductoUnidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoUnidad productounidad;	
	public ProductoUnidad productounidadAux;
	public ProductoUnidad productounidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoUnidad productounidadTotales;
	public Long idProductoUnidadActual;
	public Long iIdNuevoProductoUnidad=0L;
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

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
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
	
	public Boolean isPermisoTodoProductoUnidad;
	public Boolean isPermisoNuevoProductoUnidad;
	public Boolean isPermisoActualizarProductoUnidad;
	public Boolean isPermisoActualizarOriginalProductoUnidad;
	public Boolean isPermisoEliminarProductoUnidad;
	public Boolean isPermisoGuardarCambiosProductoUnidad;
	public Boolean isPermisoConsultaProductoUnidad;
	public Boolean isPermisoBusquedaProductoUnidad;
	public Boolean isPermisoReporteProductoUnidad;
	public Boolean isPermisoPaginacionMedioProductoUnidad;
	public Boolean isPermisoPaginacionAltoProductoUnidad;
	public Boolean isPermisoPaginacionTodoProductoUnidad;
	public Boolean isPermisoCopiarProductoUnidad;
	public Boolean isPermisoVerFormProductoUnidad;
	public Boolean isPermisoDuplicarProductoUnidad;
	public Boolean isPermisoOrdenProductoUnidad;
	
	
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
	
	public ProductoUnidadParameterReturnGeneral productounidadReturnGeneral;
	public ProductoUnidadParameterReturnGeneral productounidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoUnidad=false;
	public Boolean esParaAccionDesdeFormularioProductoUnidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoUnidadSessionBeanAdditional productounidadSessionBeanAdditional=null;
	
	public ProductoUnidadSessionBeanAdditional getProductoUnidadSessionBeanAdditional() {
		return this.productounidadSessionBeanAdditional;
	}
	
	public void setProductoUnidadSessionBeanAdditional(ProductoUnidadSessionBeanAdditional productounidadSessionBeanAdditional) {
		try {
			this.productounidadSessionBeanAdditional=productounidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoUnidadBeanSwingJInternalFrameAdditional productounidadBeanSwingJInternalFrameAdditional=null;
	//public class ProductoUnidadBeanSwingJInternalFrame
	
	public ProductoUnidadBeanSwingJInternalFrameAdditional getProductoUnidadBeanSwingJInternalFrameAdditional() {
		return this.productounidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoUnidadBeanSwingJInternalFrameAdditional(ProductoUnidadBeanSwingJInternalFrameAdditional productounidadBeanSwingJInternalFrameAdditional) {
		try {
			this.productounidadBeanSwingJInternalFrameAdditional=productounidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoUnidadLogic productounidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoUnidad productounidadBean;
	public ProductoUnidadConstantesFunciones productounidadConstantesFunciones;
	//public ProductoUnidadParameterReturnGeneral productounidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoUnidad> productounidads;	
	//public List<ProductoUnidad> productounidadsEliminados;
	//public List<ProductoUnidad> productounidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoUnidad=false;
	public Boolean isVisibilidadCeldaDuplicarProductoUnidad=true;
	public Boolean isVisibilidadCeldaCopiarProductoUnidad=true;
	public Boolean isVisibilidadCeldaVerFormProductoUnidad=true;
	public Boolean isVisibilidadCeldaOrdenProductoUnidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
	public Boolean isVisibilidadCeldaModificarProductoUnidad=false;
	public Boolean isVisibilidadCeldaActualizarProductoUnidad=false;
	public Boolean isVisibilidadCeldaEliminarProductoUnidad=false;
	public Boolean isVisibilidadCeldaCancelarProductoUnidad=false;
	public Boolean isVisibilidadCeldaGuardarProductoUnidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoUnidad=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	
	public Long getiIdNuevoProductoUnidad() {
		return this.iIdNuevoProductoUnidad;
	}

	public void setiIdNuevoProductoUnidad(Long iIdNuevoProductoUnidad) {
		this.iIdNuevoProductoUnidad = iIdNuevoProductoUnidad;
	}
	
	public Long getidProductoUnidadActual() {
		return this.idProductoUnidadActual;
	}

	public void setidProductoUnidadActual(Long idProductoUnidadActual) {
		this.idProductoUnidadActual = idProductoUnidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoUnidad getproductounidad() {
		return this.productounidad;
	}

	public void setproductounidad(ProductoUnidad productounidad) {
		this.productounidad = productounidad;
	}
	
	public ProductoUnidad getproductounidadAux() {
		return this.productounidadAux;
	}

	public void setproductounidadAux(ProductoUnidad productounidadAux) {
		this.productounidadAux = productounidadAux;
	}				
	
	public ProductoUnidad getproductounidadAnterior() {
		return this.productounidadAnterior;
	}

	public void setproductounidadAnterior(ProductoUnidad productounidadAnterior) {
		this.productounidadAnterior = productounidadAnterior;
	}	
	
	public ProductoUnidad getproductounidadTotales() {
		return this.productounidadTotales;
	}

	public void setproductounidadTotales(ProductoUnidad productounidadTotales) {
		this.productounidadTotales = productounidadTotales;
	}	
	
	public ProductoUnidad getproductounidadBean() {
		return this.productounidadBean;
	}

	public void setproductounidadBean(ProductoUnidad productounidadBean) {
		this.productounidadBean = productounidadBean;
	}	
	
	public ProductoUnidadParameterReturnGeneral getproductounidadReturnGeneral() {
		return this.productounidadReturnGeneral;
	}

	public void setproductounidadReturnGeneral(ProductoUnidadParameterReturnGeneral productounidadReturnGeneral) {
		this.productounidadReturnGeneral = productounidadReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductoUnidadLogic getProductoUnidadLogic()	{		
		return productounidadLogic;
	}

	public void setProductoUnidadLogic(ProductoUnidadLogic productounidadLogic) {
		this.productounidadLogic = productounidadLogic;
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
	
	public Boolean getIsEsNuevoProductoUnidad() {
		return isEsNuevoProductoUnidad;
	}

	public void setIsEsNuevoProductoUnidad(Boolean isEsNuevoProductoUnidad) {
		this.isEsNuevoProductoUnidad = isEsNuevoProductoUnidad;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoUnidad() {
		return esParaAccionDesdeFormularioProductoUnidad;
	}
	
	public void setEsParaAccionDesdeFormularioProductoUnidad(Boolean esParaAccionDesdeFormularioProductoUnidad) {
		this.esParaAccionDesdeFormularioProductoUnidad = esParaAccionDesdeFormularioProductoUnidad;
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

			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productounidadSessionBean.getlidEmpresaActual());
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

			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productounidadSessionBean.getlidSucursalActual());
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

			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productounidadSessionBean.getlidBodegaActual());
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

			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productounidadSessionBean.getlidProductoActual());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(productounidadSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

					if(this.productounidad!=null) {
						this.productounidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoUnidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoUnidadGenerico)throws Exception
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
				jComboBoxid_empresaProductoUnidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoUnidadGenerico!=null && jComboBoxid_empresaProductoUnidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoUnidadGenerico.setSelectedIndex(0);
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

					if(this.productounidad!=null) {
						this.productounidad.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoUnidad.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoUnidadGenerico)throws Exception
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
				jComboBoxid_sucursalProductoUnidadGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoUnidadGenerico!=null && jComboBoxid_sucursalProductoUnidadGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoUnidadGenerico.setSelectedIndex(0);
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

					if(this.productounidad!=null) {
						this.productounidad.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoUnidad.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoUnidad!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoUnidad!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoUnidad.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoUnidadGenerico)throws Exception
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
				jComboBoxid_bodegaProductoUnidadGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoUnidadGenerico!=null && jComboBoxid_bodegaProductoUnidadGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoUnidadGenerico.setSelectedIndex(0);
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

					if(this.productounidad!=null) {
						this.productounidad.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoUnidad.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoUnidad!=null) {
						jComboBoxid_productoFK_IdProductoProductoUnidad.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoUnidad!=null) {
							//jComboBoxid_productoFK_IdProductoProductoUnidad.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoUnidad.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoUnidad.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoUnidadGenerico)throws Exception
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
				jComboBoxid_productoProductoUnidadGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoUnidadGenerico!=null && jComboBoxid_productoProductoUnidadGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.productounidad!=null) {
						this.productounidad.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoUnidad.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadProductoUnidad!=null) {
						jComboBoxid_unidadFK_IdUnidadProductoUnidad.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadProductoUnidad!=null) {
							//jComboBoxid_unidadFK_IdUnidadProductoUnidad.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadProductoUnidad.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadProductoUnidad.setSelectedIndex(0);
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

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadProductoUnidadGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoUnidadGenerico!=null && jComboBoxid_unidadProductoUnidadGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoUnidad productounidad,JComboBox jComboBoxid_empresaProductoUnidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoUnidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoUnidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productounidad.setid_empresa(empresaAux.getId());
				productounidad.setempresa_descripcion(ProductoUnidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productounidad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoUnidad productounidad,JComboBox jComboBoxid_sucursalProductoUnidadGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoUnidadGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoUnidadGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productounidad.setid_sucursal(sucursalAux.getId());
				productounidad.setsucursal_descripcion(ProductoUnidadConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productounidad.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoUnidad productounidad,JComboBox jComboBoxid_bodegaProductoUnidadGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoUnidadGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoUnidadGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productounidad.setid_bodega(bodegaAux.getId());
				productounidad.setbodega_descripcion(ProductoUnidadConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productounidad.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoUnidad productounidad,JComboBox jComboBoxid_productoProductoUnidadGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoUnidadGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoUnidadGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productounidad.setid_producto(productoAux.getId());
				productounidad.setproducto_descripcion(ProductoUnidadConstantesFunciones.getProductoDescripcion(productoAux));
				productounidad.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoUnidad productounidad,JComboBox jComboBoxid_unidadProductoUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoUnidadGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoUnidadGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productounidad.setid_unidad(unidadAux.getId());
				productounidad.setunidad_descripcion(ProductoUnidadConstantesFunciones.getUnidadDescripcion(unidadAux));
				productounidad.setUnidad(unidadAux);			}
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

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
					}

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
					}

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
					}

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.addItem(bodega);
							}
						}

						if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
					}

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoUnidad.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoUnidad.addItem(producto);
							}
						}

						if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoUnidad!=null) { 
					}

					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoUnidad.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadProductoUnidad.addItem(unidad);
							}
						}

						if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoUnidad.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoUnidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadProductoUnidad.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadProductoUnidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoUnidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoUnidadConstantesFunciones.refrescarForeignKeysDescripcionesProductoUnidad(this.productounidadLogic.getProductoUnidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoUnidadConstantesFunciones.refrescarForeignKeysDescripcionesProductoUnidad(this.productounidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productounidadLogic.setProductoUnidads(this.productounidads);
			productounidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoUnidadParameterReturnGeneral getProductoUnidadParameterGeneral() {
		return this.productounidadParameterGeneral;
	}
	
	public void setProductoUnidadParameterGeneral(ProductoUnidadParameterReturnGeneral productounidadParameterGeneral) {
		this.productounidadParameterGeneral = productounidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoUnidad() {
		return isPermisoTodoProductoUnidad;
	}

	public void setIsPermisoTodoProductoUnidad(Boolean isPermisoTodoProductoUnidad) {
		this.isPermisoTodoProductoUnidad = isPermisoTodoProductoUnidad;
	}

	public Boolean getIsPermisoNuevoProductoUnidad() {
		return isPermisoNuevoProductoUnidad;
	}

	public void setIsPermisoNuevoProductoUnidad(Boolean isPermisoNuevoProductoUnidad) {
		this.isPermisoNuevoProductoUnidad = isPermisoNuevoProductoUnidad;
	}

	public Boolean getIsPermisoActualizarProductoUnidad() {
		return isPermisoActualizarProductoUnidad;
	}

	public void setIsPermisoActualizarProductoUnidad(Boolean isPermisoActualizarProductoUnidad) {
		this.isPermisoActualizarProductoUnidad = isPermisoActualizarProductoUnidad;
	}

	public Boolean getIsPermisoEliminarProductoUnidad() {
		return isPermisoEliminarProductoUnidad;
	}

	public void setIsPermisoEliminarProductoUnidad(Boolean isPermisoEliminarProductoUnidad) {
		this.isPermisoEliminarProductoUnidad = isPermisoEliminarProductoUnidad;
	}

	public Boolean getIsPermisoGuardarCambiosProductoUnidad() {
		return isPermisoGuardarCambiosProductoUnidad;
	}

	public void setIsPermisoGuardarCambiosProductoUnidad(Boolean isPermisoGuardarCambiosProductoUnidad) {
		this.isPermisoGuardarCambiosProductoUnidad = isPermisoGuardarCambiosProductoUnidad;
	}
	
	public Boolean getIsPermisoConsultaProductoUnidad() {
		return isPermisoConsultaProductoUnidad;
	}

	public void setIsPermisoConsultaProductoUnidad(Boolean isPermisoConsultaProductoUnidad) {
		this.isPermisoConsultaProductoUnidad = isPermisoConsultaProductoUnidad;
	}

	public Boolean getIsPermisoBusquedaProductoUnidad() {
		return isPermisoBusquedaProductoUnidad;
	}

	public void setIsPermisoBusquedaProductoUnidad(Boolean isPermisoBusquedaProductoUnidad) {
		this.isPermisoBusquedaProductoUnidad = isPermisoBusquedaProductoUnidad;
	}

	public Boolean getIsPermisoReporteProductoUnidad() {
		return isPermisoReporteProductoUnidad;
	}

	public void setIsPermisoReporteProductoUnidad(Boolean isPermisoReporteProductoUnidad) {
		this.isPermisoReporteProductoUnidad = isPermisoReporteProductoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoUnidad() {
		return isPermisoPaginacionMedioProductoUnidad;
	}

	public void setIsPermisoPaginacionMedioProductoUnidad(Boolean isPermisoPaginacionMedioProductoUnidad) {
		this.isPermisoPaginacionMedioProductoUnidad = isPermisoPaginacionMedioProductoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoUnidad() {
		return isPermisoPaginacionTodoProductoUnidad;
	}

	public void setIsPermisoPaginacionTodoProductoUnidad(Boolean isPermisoPaginacionTodoProductoUnidad) {
		this.isPermisoPaginacionTodoProductoUnidad = isPermisoPaginacionTodoProductoUnidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoUnidad() {
		return isPermisoPaginacionAltoProductoUnidad;
	}

	public void setIsPermisoPaginacionAltoProductoUnidad(Boolean isPermisoPaginacionAltoProductoUnidad) {
		this.isPermisoPaginacionAltoProductoUnidad = isPermisoPaginacionAltoProductoUnidad;
	}
	
	public Boolean getIsPermisoCopiarProductoUnidad() {
		return isPermisoCopiarProductoUnidad;
	}

	public void setIsPermisoCopiarProductoUnidad(Boolean isPermisoCopiarProductoUnidad) {
		this.isPermisoCopiarProductoUnidad = isPermisoCopiarProductoUnidad;
	}
	
	public Boolean getIsPermisoVerFormProductoUnidad() {
		return isPermisoVerFormProductoUnidad;
	}

	public void setIsPermisoVerFormProductoUnidad(Boolean isPermisoVerFormProductoUnidad) {
		this.isPermisoVerFormProductoUnidad = isPermisoVerFormProductoUnidad;
	}
	
	public Boolean getIsPermisoDuplicarProductoUnidad() {
		return isPermisoDuplicarProductoUnidad;
	}

	public void setIsPermisoDuplicarProductoUnidad(Boolean isPermisoDuplicarProductoUnidad) {
		this.isPermisoDuplicarProductoUnidad = isPermisoDuplicarProductoUnidad;
	}
	
	public Boolean getIsPermisoOrdenProductoUnidad() {
		return isPermisoOrdenProductoUnidad;
	}

	public void setIsPermisoOrdenProductoUnidad(Boolean isPermisoOrdenProductoUnidad) {
		this.isPermisoOrdenProductoUnidad = isPermisoOrdenProductoUnidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoUnidad() {
		return isVisibilidadCeldaNuevoProductoUnidad;
	}

	public void setIsVisibilidadCeldaNuevoProductoUnidad(Boolean isVisibilidadCeldaNuevoProductoUnidad) {
		this.isVisibilidadCeldaNuevoProductoUnidad = isVisibilidadCeldaNuevoProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoUnidad() {
		return isVisibilidadCeldaDuplicarProductoUnidad;
	}

	public void setIsVisibilidadCeldaDuplicarProductoUnidad(Boolean isVisibilidadCeldaDuplicarProductoUnidad) {
		this.isVisibilidadCeldaDuplicarProductoUnidad = isVisibilidadCeldaDuplicarProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoUnidad() {
		return isVisibilidadCeldaCopiarProductoUnidad;
	}

	public void setIsVisibilidadCeldaCopiarProductoUnidad(Boolean isVisibilidadCeldaCopiarProductoUnidad) {
		this.isVisibilidadCeldaCopiarProductoUnidad = isVisibilidadCeldaCopiarProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoUnidad() {
		return isVisibilidadCeldaVerFormProductoUnidad;
	}

	public void setIsVisibilidadCeldaVerFormProductoUnidad(Boolean isVisibilidadCeldaVerFormProductoUnidad) {
		this.isVisibilidadCeldaVerFormProductoUnidad = isVisibilidadCeldaVerFormProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoUnidad() {
		return isVisibilidadCeldaOrdenProductoUnidad;
	}

	public void setIsVisibilidadCeldaOrdenProductoUnidad(Boolean isVisibilidadCeldaOrdenProductoUnidad) {
		this.isVisibilidadCeldaOrdenProductoUnidad = isVisibilidadCeldaOrdenProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoUnidad() {
		return isVisibilidadCeldaNuevoRelacionesProductoUnidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoUnidad(Boolean isVisibilidadCeldaNuevoRelacionesProductoUnidad) {
		this.isVisibilidadCeldaNuevoRelacionesProductoUnidad = isVisibilidadCeldaNuevoRelacionesProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoUnidad() {
		return isVisibilidadCeldaModificarProductoUnidad;
	}

	public void setIsVisibilidadCeldaModificarProductoUnidad(Boolean isVisibilidadCeldaModificarProductoUnidad) {
		this.isVisibilidadCeldaModificarProductoUnidad = isVisibilidadCeldaModificarProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoUnidad() {
		return isVisibilidadCeldaActualizarProductoUnidad;
	}

	public void setIsVisibilidadCeldaActualizarProductoUnidad(Boolean isVisibilidadCeldaActualizarProductoUnidad) {
		this.isVisibilidadCeldaActualizarProductoUnidad = isVisibilidadCeldaActualizarProductoUnidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoUnidad() {
		return isVisibilidadCeldaEliminarProductoUnidad;
	}

	public void setIsVisibilidadCeldaEliminarProductoUnidad(Boolean isVisibilidadCeldaEliminarProductoUnidad) {
		this.isVisibilidadCeldaEliminarProductoUnidad = isVisibilidadCeldaEliminarProductoUnidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoUnidad() {
		return isVisibilidadCeldaCancelarProductoUnidad;
	}

	public void setIsVisibilidadCeldaCancelarProductoUnidad(Boolean isVisibilidadCeldaCancelarProductoUnidad) {
		this.isVisibilidadCeldaCancelarProductoUnidad = isVisibilidadCeldaCancelarProductoUnidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoUnidad() {
		return isVisibilidadCeldaGuardarProductoUnidad;
	}

	public void setIsVisibilidadCeldaGuardarProductoUnidad(Boolean isVisibilidadCeldaGuardarProductoUnidad) {
		this.isVisibilidadCeldaGuardarProductoUnidad = isVisibilidadCeldaGuardarProductoUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoUnidad() {
		return isVisibilidadCeldaGuardarCambiosProductoUnidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoUnidad(Boolean isVisibilidadCeldaGuardarCambiosProductoUnidad) {
		this.isVisibilidadCeldaGuardarCambiosProductoUnidad = isVisibilidadCeldaGuardarCambiosProductoUnidad;
	}
		
	public ProductoUnidadSessionBean getproductounidadSessionBean() {
		return this.productounidadSessionBean;
	}
	
	public void setproductounidadSessionBean(ProductoUnidadSessionBean productounidadSessionBean) {
		this.productounidadSessionBean=productounidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(ProductoUnidad productounidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productounidad,null);
				this.setActualParaGuardarSucursalForeignKey(productounidad,null);
				this.setActualParaGuardarBodegaForeignKey(productounidad,null);
				this.setActualParaGuardarProductoForeignKey(productounidad,null);
				this.setActualParaGuardarUnidadForeignKey(productounidad,null);
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
	
	public void bugActualizarReferenciaActual(ProductoUnidad productounidad,ProductoUnidad productounidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoUnidad(productounidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productounidadAux.setId(productounidad.getId());
		productounidadAux.setVersionRow(productounidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoUnidad();
		
			int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productounidadValidator.getInvalidValues(this.productounidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productounidadLogic.setDatosCliente(datosCliente);
			productounidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productounidadAux=new  ProductoUnidad();
				
				productounidadAux.setIsNew(true);
				productounidadAux.setIsChanged(true);
				
				productounidadAux.setProductoUnidadOriginal(this.productounidad);
				
				productounidadAux.setId(this.productounidad.getId());	
				productounidadAux.setVersionRow(this.productounidad.getVersionRow());	
				productounidadAux.setid_empresa(this.productounidad.getid_empresa());	
				productounidadAux.setid_sucursal(this.productounidad.getid_sucursal());	
				productounidadAux.setid_bodega(this.productounidad.getid_bodega());	
				productounidadAux.setid_producto(this.productounidad.getid_producto());	
				productounidadAux.setid_unidad(this.productounidad.getid_unidad());	
				productounidadAux.setvalor_unidad(this.productounidad.getvalor_unidad());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productounidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productounidadAux,productounidadLogic.getProductoUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productounidadAux,productounidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productounidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.saveProductoUnidads();//WithConnection
						//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productounidad,productounidadAux);
					
					this.refrescarForeignKeysDescripcionesProductoUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productounidadLogic.saveProductoUnidadRelaciones(productounidadAux);//WithConnection
								//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productounidad,productounidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productounidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productounidadAux,productounidadLogic.getProductoUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productounidadAux,productounidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productounidad,productounidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productounidadAux=new  ProductoUnidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productounidadSessionBean.getEsGuardarRelacionado() 
					|| (this.productounidadSessionBean.getEsGuardarRelacionado() && this.productounidad.getId()>=0)) {
						
					productounidadAux.setIsNew(false);
				}
				
				productounidadAux.setIsDeleted(false);
			
				productounidadAux.setId(this.productounidad.getId());	
				productounidadAux.setVersionRow(this.productounidad.getVersionRow());	
				productounidadAux.setid_empresa(this.productounidad.getid_empresa());	
				productounidadAux.setid_sucursal(this.productounidad.getid_sucursal());	
				productounidadAux.setid_bodega(this.productounidad.getid_bodega());	
				productounidadAux.setid_producto(this.productounidad.getid_producto());	
				productounidadAux.setid_unidad(this.productounidad.getid_unidad());	
				productounidadAux.setvalor_unidad(this.productounidad.getvalor_unidad());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productounidadAux,productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productounidadAux,productounidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productounidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.saveProductoUnidads();//WithConnection
						//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productounidad,productounidadAux);
					
					this.refrescarForeignKeysDescripcionesProductoUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productounidadLogic.saveProductoUnidadRelaciones(productounidadAux);//WithConnection
								//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productounidad,productounidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productounidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productounidadAux,productounidadLogic.getProductoUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productounidadAux,productounidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productounidad,productounidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productounidadAux=new  ProductoUnidad();
				
				productounidadAux.setIsNew(false);
				productounidadAux.setIsChanged(false);
				
				productounidadAux.setIsDeleted(true);
				
				productounidadAux.setId(this.productounidad.getId());	
				productounidadAux.setVersionRow(this.productounidad.getVersionRow());	
				productounidadAux.setid_empresa(this.productounidad.getid_empresa());	
				productounidadAux.setid_sucursal(this.productounidad.getid_sucursal());	
				productounidadAux.setid_bodega(this.productounidad.getid_bodega());	
				productounidadAux.setid_producto(this.productounidad.getid_producto());	
				productounidadAux.setid_unidad(this.productounidad.getid_unidad());	
				productounidadAux.setvalor_unidad(this.productounidad.getvalor_unidad());	
				
				if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productounidadAux.getId()>=0) {	
						this.productounidadsEliminados.add(productounidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productounidadAux,productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productounidadAux,productounidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productounidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.saveProductoUnidads();//WithConnection
						//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productounidadLogic.saveProductoUnidadRelaciones(productounidadAux);//WithConnection
								//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
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
							if(this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productounidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productounidadAux,productounidadLogic.getProductoUnidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productounidadAux,productounidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getProductoUnidads().addAll(this.productounidadsEliminados);
					
					productounidadLogic.saveProductoUnidads();//WithConnection
					//productounidadLogic.getSetVersionRowProductoUnidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoUnidad();
				
				this.productounidadsEliminados= new ArrayList<ProductoUnidad>();		
			}
			
			if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Unidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productounidad=productounidadAux;
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
      		//this.finishProcessProductoUnidad();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoUnidad productounidadLocal) throws Exception {
		
		if(this.productounidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoUnidad productounidadLocal) throws Exception {	
		if(this.productounidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productounidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productounidadLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productounidadLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productounidadLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productounidadLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoUnidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productounidadValidator.getInvalidValues(this.productounidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoUnidad productounidad,List<ProductoUnidad> productounidads) throws Exception {
		try	{		
			ProductoUnidadConstantesFunciones.actualizarLista(productounidad,productounidads,this.productounidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoUnidad productounidad,List<ProductoUnidad> productounidads) throws Exception {
		try	{			
			ProductoUnidadConstantesFunciones.actualizarSelectedLista(productounidad,productounidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoUnidad> productounidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productounidadsLocal=this.productounidadLogic.getProductoUnidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productounidadsLocal=this.productounidads;
			}
			//ARCHITECTURE
		
			for(ProductoUnidad productounidadLocal:productounidadsLocal) {
				if(this.permiteMantenimiento(productounidadLocal) && productounidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoUnidadConstantesFunciones.getProductoUnidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoUnidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_empresaProductoUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoUnidadConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_sucursalProductoUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoUnidadConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_bodegaProductoUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoUnidadConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_productoProductoUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoUnidadConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_unidadProductoUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoUnidadConstantesFunciones.VALORUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelvalor_unidadProductoUnidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_empresaProductoUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_sucursalProductoUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_bodegaProductoUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_productoProductoUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoUnidad.jLabelid_unidadProductoUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoUnidad.jLabelvalor_unidadProductoUnidad,"");
		
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
		this.iIdNuevoProductoUnidad--;	
		
		
		this.productounidadAux=new ProductoUnidad();
		
		this.productounidadAux.setId(this.iIdNuevoProductoUnidad);
		this.productounidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productounidadLogic.getProductoUnidads().add(this.productounidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productounidads.add(this.productounidadAux);
		}
		//ARCHITECTURE
		
		this.productounidad=this.productounidadAux;
		
		if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoUnidad(this.productounidad);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoUnidad(this.productounidad);
		}
				
		//this.setDefaultControlesProductoUnidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoUnidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoUnidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoUnidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoUnidad(this.productounidadBean,this.productounidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoUnidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productounidadSessionBean.getConGuardarRelaciones()) {
			classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productounidadReturnGeneral=productounidadLogic.procesarEventosProductoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productounidadLogic.getProductoUnidads(),this.productounidad,this.productounidadParameterGeneral,this.isEsNuevoProductoUnidad,classes);//this.productounidadLogic.getProductoUnidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoUnidad(this.productounidadReturnGeneral,this.productounidadBean,false);
		
		if(this.productounidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad());
		}
		
		if(this.productounidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad(),classes);//this.productounidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoUnidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoUnidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.RecargarFormProductoUnidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoUnidad(false);
						
			if(productounidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoUnidad();
			}
			
			this.actualizarVisualTableDatosProductoUnidad();
			
			this.jTableDatosProductoUnidad.setRowSelectionInterval(this.getIndiceNuevoProductoUnidad(), this.getIndiceNuevoProductoUnidad());
			
			this.seleccionarFilaTablaProductoUnidadActual();
						
			this.actualizarEstadoCeldasBotonesProductoUnidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoUnidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setEnabled(isHabilitar && this.productounidadConstantesFunciones.activarvalor_unidadProductoUnidad);	
		//
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setEnabled(isHabilitar && this.productounidadConstantesFunciones.activarid_empresaProductoUnidad);//
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setEnabled(isHabilitar && this.productounidadConstantesFunciones.activarid_sucursalProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setEnabled(isHabilitar && this.productounidadConstantesFunciones.activarid_bodegaProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setEnabled(isHabilitar && this.productounidadConstantesFunciones.activarid_productoProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setEnabled(isHabilitar && this.productounidadConstantesFunciones.activarid_unidadProductoUnidad);
	};
	
	public void setDefaultControlesProductoUnidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoUnidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productounidadSessionBean.setConGuardarRelaciones(true);			
			this.productounidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.setVisible(true);
			
					
		} else {
			//this.productounidadSessionBean.setConGuardarRelaciones(false);			
			this.productounidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoUnidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
				if(productounidadAux.getId().equals(this.iIdNuevoProductoUnidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoUnidad productounidadAux:this.productounidads) {
				if(productounidadAux.getId().equals(this.iIdNuevoProductoUnidad)) {
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
	
	public int getIndiceActualProductoUnidad(ProductoUnidad productounidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
				if(productounidadAux.getId().equals(productounidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoUnidad productounidadAux:this.productounidads) {
				if(productounidadAux.getId().equals(productounidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoUnidad(ProductoUnidad productounidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
				if(productounidadAux.getProductoUnidadOriginal().getId().equals(productounidadOriginal.getId())) {
					existe=true;
					productounidadOriginal.setId(productounidadAux.getId());
					productounidadOriginal.setVersionRow(productounidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoUnidad productounidadAux:this.productounidads) {
				if(productounidadAux.getProductoUnidadOriginal().getId().equals(productounidadOriginal.getId())) {
					existe=true;
					productounidadOriginal.setId(productounidadAux.getId());
					productounidadOriginal.setVersionRow(productounidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoUnidad(Boolean esParaCancelar) throws Exception {
		productounidadsAux=new ArrayList<ProductoUnidad>();
		productounidadAux=new ProductoUnidad();
		
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
					if(productounidadAux.getId()<0) {
						productounidadsAux.add(productounidadAux);
					}		
				}
				this.iIdNuevoProductoUnidad=0L;
				this.productounidadLogic.getProductoUnidads().removeAll(productounidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoUnidad productounidadAux:this.productounidads) {
					if(productounidadAux.getId()<0) {
						productounidadsAux.add(productounidadAux);
					}		
				}
				this.iIdNuevoProductoUnidad=0L;
				this.productounidads.removeAll(productounidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoUnidad 
					&& this.productounidadLogic.getProductoUnidads().size()>0
					) {
					productounidadAux=this.productounidadLogic.getProductoUnidads().get(this.productounidadLogic.getProductoUnidads().size() - 1);
				
					if(productounidadAux.getId()<0) {
						this.productounidadLogic.getProductoUnidads().remove(productounidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoUnidad && this.productounidads.size()>0) {
					productounidadAux=this.productounidads.get(this.productounidads.size() - 1);
				
					if(productounidadAux.getId()<0) {
						this.productounidads.remove(productounidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoUnidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productounidad.getId()<0) {
				this.productounidadLogic.getProductoUnidads().remove(this.productounidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productounidad.getId()<0) {
				this.productounidads.remove(this.productounidad);
			}
		}			
	}
	
	public void setEstadosInicialesProductoUnidad(List<ProductoUnidad> productounidadsAux) throws Exception {
		ProductoUnidadConstantesFunciones.setEstadosInicialesProductoUnidad(productounidadsAux);
	}
	
	public void setEstadosInicialesProductoUnidad(ProductoUnidad productounidadAux) throws Exception {
		ProductoUnidadConstantesFunciones.setEstadosInicialesProductoUnidad(productounidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoUnidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoUnidadActual()) {
				if(!this.isEsNuevoProductoUnidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoUnidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoUnidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Unidad ?", "MANTENIMIENTO DE Producto Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoUnidad productounidad) throws Exception {
		ProductoUnidadConstantesFunciones.seleccionarAsignar(this.productounidad,productounidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoUnidad=this.isPermisoActualizarOriginalProductoUnidad;
			
			
			this.seleccionarAsignar(productounidad);
			
			

			idProductoActual=productounidad.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoUnidadConstantesFunciones.quitarEspaciosProductoUnidad(this.productounidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productounidadSessionBean.setsFuncionBusquedaRapida(this.productounidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductoUnidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoUnidad(esParaCancelar);				
				this.cancelarNuevoProductoUnidad(esParaCancelar);								
			}
			
			this.productounidad=new ProductoUnidad();
			
			this.inicializarProductoUnidad();
			
			this.actualizarEstadoCeldasBotonesProductoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoUnidad() throws Exception {
		try {
			ProductoUnidadConstantesFunciones.inicializarProductoUnidad(this.productounidad);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productounidadLogic.getProductoUnidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoUnidads(String sAccionBusqueda,List<ProductoUnidad> productounidadsParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoUnidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoUnidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoUnidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoUnidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Unidads");		
		parameters.put("busquedapor", ProductoUnidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoUnidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoUnidad=new JRBeanArrayDataSource(ProductoUnidadJInternalFrame.TraerProductoUnidadBeans(productounidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoUnidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoUnidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoUnidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoUnidadBean.TraerProductoUnidadBeans(productounidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoUnidads(sAccionBusqueda,sTipoArchivoReporte,productounidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoUnidads(sAccionBusqueda,sTipoArchivoReporte,productounidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoUnidadActionPerformed(null);
					//this.generarExcelReporteProductoUnidads(sAccionBusqueda,sTipoArchivoReporte,productounidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoUnidads(sAccionBusqueda,sTipoArchivoReporte,productounidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoUnidads(sAccionBusqueda,sTipoArchivoReporte,productounidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoUnidads(sAccionBusqueda,sTipoArchivoReporte,productounidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoUnidad> productounidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoUnidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoUnidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoUnidad productounidad : productounidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoUnidadConstantesFunciones.generarExcelReporteDataProductoUnidad("NORMAL",row,workbook,productounidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoUnidad(String sTipo,Row row,Workbook workbook) {
		
		ProductoUnidadConstantesFunciones.generarExcelReporteHeaderProductoUnidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoUnidad> productounidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoUnidad productounidad : productounidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoUnidadConstantesFunciones.getProductoUnidadDescripcion(productounidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productounidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productounidad.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoUnidadConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productounidad.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productounidad.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productounidad.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productounidad.getvalor_unidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoUnidad> productounidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoUnidad> productounidadsRespaldo=null;
		
		classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productounidadLogic.setDatosCliente(this.datosCliente);
		this.productounidadLogic.setDatosDeep(this.datosDeep);
		this.productounidadLogic.setIsConDeep(true);
		
		productounidadsRespaldo=this.productounidadLogic.getProductoUnidads();
		
		this.productounidadLogic.setProductoUnidads(productounidadsParaReportes);	
		this.productounidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productounidadsParaReportes=this.productounidadLogic.getProductoUnidads();
		this.productounidadLogic.setProductoUnidads(productounidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoUnidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoUnidad productounidad : productounidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoUnidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoUnidadConstantesFunciones.generarExcelReporteDataProductoUnidad("NORMAL",row,workbook,productounidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoUnidadConstantesFunciones.getProductoUnidadDescripcion(productounidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoUnidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoUnidad() throws Exception {		
		this.startProcessProductoUnidad(true);
	}
	
	public void startProcessProductoUnidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoUnidad ,this.jPanelParametrosReportesProductoUnidad, this.jScrollPanelDatosProductoUnidad,this.jPanelPaginacionProductoUnidad, this.jScrollPanelDatosEdicionProductoUnidad, this.jPanelAccionesProductoUnidad,this.jPanelAccionesFormularioProductoUnidad,this.jmenuBarProductoUnidad,this.jmenuBarDetalleProductoUnidad,this.jTtoolBarProductoUnidad,this.jTtoolBarDetalleProductoUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoUnidad=this.jTabbedPaneBusquedasProductoUnidad; 
		
		final JPanel jPanelParametrosReportesProductoUnidad=this.jPanelParametrosReportesProductoUnidad;
		//final JScrollPane jScrollPanelDatosProductoUnidad=this.jScrollPanelDatosProductoUnidad;
		final JTable jTableDatosProductoUnidad=this.jTableDatosProductoUnidad;		
		final JPanel jPanelPaginacionProductoUnidad=this.jPanelPaginacionProductoUnidad;
		//final JScrollPane jScrollPanelDatosEdicionProductoUnidad=this.jScrollPanelDatosEdicionProductoUnidad;
		final JPanel jPanelAccionesProductoUnidad=this.jPanelAccionesProductoUnidad;
		
		JPanel jPanelCamposAuxiliarProductoUnidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoUnidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			jPanelCamposAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jPanelCamposProductoUnidad;
			jPanelAccionesFormularioAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jPanelAccionesFormularioProductoUnidad;
		}
		
		final JPanel jPanelCamposProductoUnidad=jPanelCamposAuxiliarProductoUnidad;
		final JPanel jPanelAccionesFormularioProductoUnidad=jPanelAccionesFormularioAuxiliarProductoUnidad;
		
		
		final JMenuBar jmenuBarProductoUnidad=this.jmenuBarProductoUnidad;
		final JToolBar jTtoolBarProductoUnidad=this.jTtoolBarProductoUnidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoUnidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			jmenuBarDetalleAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jmenuBarDetalleProductoUnidad;
			jTtoolBarDetalleAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jTtoolBarDetalleProductoUnidad;
		}
		
		final JMenuBar jmenuBarDetalleProductoUnidad=jmenuBarDetalleAuxiliarProductoUnidad;
		final JToolBar jTtoolBarDetalleProductoUnidad=jTtoolBarDetalleAuxiliarProductoUnidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoUnidad;
			processRunnable.jTableDatos=jTableDatosProductoUnidad;
			processRunnable.jPanelCampos=jPanelCamposProductoUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesProductoUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarProductoUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoUnidad;
			processRunnable.jTtoolBar=jTtoolBarProductoUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoUnidad ,jPanelParametrosReportesProductoUnidad,jTableDatosProductoUnidad, /*jScrollPanelDatosProductoUnidad,*/jPanelCamposProductoUnidad,jPanelPaginacionProductoUnidad, /*jScrollPanelDatosEdicionProductoUnidad,*/ jPanelAccionesProductoUnidad,jPanelAccionesFormularioProductoUnidad,jmenuBarProductoUnidad,jmenuBarDetalleProductoUnidad,jTtoolBarProductoUnidad,jTtoolBarDetalleProductoUnidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoUnidad ,jPanelParametrosReportesProductoUnidad, jScrollPanelDatosProductoUnidad,jPanelPaginacionProductoUnidad, jScrollPanelDatosEdicionProductoUnidad, jPanelAccionesProductoUnidad,jPanelAccionesFormularioProductoUnidad,jmenuBarProductoUnidad,jmenuBarDetalleProductoUnidad,jTtoolBarProductoUnidad,jTtoolBarDetalleProductoUnidad);
						
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
	
	public void finishProcessProductoUnidad() {// throws Exception 
		this.finishProcessProductoUnidad(true);
	}
	
	public void finishProcessProductoUnidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoUnidad ,this.jPanelParametrosReportesProductoUnidad, this.jScrollPanelDatosProductoUnidad,this.jPanelPaginacionProductoUnidad, this.jScrollPanelDatosEdicionProductoUnidad, this.jPanelAccionesProductoUnidad,this.jPanelAccionesFormularioProductoUnidad,this.jmenuBarProductoUnidad,this.jmenuBarDetalleProductoUnidad,this.jTtoolBarProductoUnidad,this.jTtoolBarDetalleProductoUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoUnidad=this.jTabbedPaneBusquedasProductoUnidad; 
		
		final JPanel jPanelParametrosReportesProductoUnidad=this.jPanelParametrosReportesProductoUnidad;
		//final JScrollPane jScrollPanelDatosProductoUnidad=this.jScrollPanelDatosProductoUnidad;
		final JTable jTableDatosProductoUnidad=this.jTableDatosProductoUnidad;		
		final JPanel jPanelPaginacionProductoUnidad=this.jPanelPaginacionProductoUnidad;
		//final JScrollPane jScrollPanelDatosEdicionProductoUnidad=this.jScrollPanelDatosEdicionProductoUnidad;
		final JPanel jPanelAccionesProductoUnidad=this.jPanelAccionesProductoUnidad;
		
		JPanel jPanelCamposAuxiliarProductoUnidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoUnidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			jPanelCamposAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jPanelCamposProductoUnidad;
			jPanelAccionesFormularioAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jPanelAccionesFormularioProductoUnidad;
		}
		
		final JPanel jPanelCamposProductoUnidad=jPanelCamposAuxiliarProductoUnidad;
		final JPanel jPanelAccionesFormularioProductoUnidad=jPanelAccionesFormularioAuxiliarProductoUnidad;
		
		
		final JMenuBar jmenuBarProductoUnidad=this.jmenuBarProductoUnidad;		
		final JToolBar jTtoolBarProductoUnidad=this.jTtoolBarProductoUnidad;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoUnidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			jmenuBarDetalleAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jmenuBarDetalleProductoUnidad;
			jTtoolBarDetalleAuxiliarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jTtoolBarDetalleProductoUnidad;		
		}
		
		final JMenuBar jmenuBarDetalleProductoUnidad=jmenuBarDetalleAuxiliarProductoUnidad;
		final JToolBar jTtoolBarDetalleProductoUnidad=jTtoolBarDetalleAuxiliarProductoUnidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoUnidad;
			processRunnable.jTableDatos=jTableDatosProductoUnidad;
			processRunnable.jPanelCampos=jPanelCamposProductoUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesProductoUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarProductoUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoUnidad;
			processRunnable.jTtoolBar=jTtoolBarProductoUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoUnidad ,jPanelParametrosReportesProductoUnidad, jTableDatosProductoUnidad,/*jScrollPanelDatosProductoUnidad,*/jPanelCamposProductoUnidad,jPanelPaginacionProductoUnidad, /*jScrollPanelDatosEdicionProductoUnidad,*/ jPanelAccionesProductoUnidad,jPanelAccionesFormularioProductoUnidad,jmenuBarProductoUnidad,jmenuBarDetalleProductoUnidad,jTtoolBarProductoUnidad,jTtoolBarDetalleProductoUnidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoUnidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoUnidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoUnidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoUnidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoUnidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productounidadConstantesFunciones.getsFinalQueryProductoUnidad();
		String  finalQueryPaginacionTodos=this.productounidadConstantesFunciones.getsFinalQueryProductoUnidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoUnidadConstantesFunciones.getArrayColumnasGlobalesNoProductoUnidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoUnidadConstantesFunciones.getArrayColumnasGlobalesProductoUnidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoUnidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productounidadsEliminados= new ArrayList<ProductoUnidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoUnidad();
		
				///*ProductoUnidadSessionBean*/this.productounidadSessionBean=new ProductoUnidadSessionBean();
			
			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
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
					this.iNumeroPaginacion=ProductoUnidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoUnidadConstantesFunciones.getClassesForeignKeysOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productounidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productounidadsAux= new ArrayList<ProductoUnidad>();
			
				
			productounidadLogic.setDatosCliente(this.datosCliente);
			productounidadLogic.setDatosDeep(this.datosDeep);
			productounidadLogic.setIsConDeep(true);
			
			
			productounidadLogic.getProductoUnidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productounidadLogic.getTodosProductoUnidads(finalQueryGlobal,pagination);
					
					//productounidadLogic.getTodosProductoUnidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productounidadLogic.getProductoUnidads()==null|| productounidadLogic.getProductoUnidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productounidadsAux= new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidadLogic.getProductoUnidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadsAux= new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productounidadLogic.getTodosProductoUnidads(finalQueryGlobal+"",this.pagination);												
							
							//productounidadLogic.getTodosProductoUnidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoUnidads("Todos",productounidadLogic.getProductoUnidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());					
							productounidadLogic.getProductoUnidads().addAll(productounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidads=new ArrayList<ProductoUnidad>();
							productounidads.addAll(productounidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoUnidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoUnidad=this.idActual;
				
				} else if(this.idProductoUnidadActual!=null && this.idProductoUnidadActual!=0L) {
					idProductoUnidad=idProductoUnidadActual;
				}
				
					
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndicePorId(idProductoUnidad);
				
				this.productounidads=new ArrayList<ProductoUnidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productounidadLogic.getEntity(idProductoUnidad);
					
					//productounidadLogic.getEntityWithConnection(idProductoUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());
					productounidadLogic.getProductoUnidads().add(productounidadLogic.getProductoUnidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidads=new ArrayList<ProductoUnidad>();
					this.productounidads.add(productounidad);
				}
				
				if(productounidadLogic.getProductoUnidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productounidadLogic.getProductoUnidadsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productounidadLogic.getProductoUnidads()==null||productounidadLogic.getProductoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productounidads==null|| productounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadsAux=new ArrayList<ProductoUnidad>();
						productounidadsAux.addAll(productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadsAux=new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productounidadLogic.getProductoUnidadsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoUnidads("FK_IdBodega",productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoUnidads("FK_IdBodega",productounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());
						productounidadLogic.getProductoUnidads().addAll(productounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidads=new ArrayList<ProductoUnidad>();
							productounidads.addAll(productounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productounidadLogic.getProductoUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productounidadLogic.getProductoUnidads()==null||productounidadLogic.getProductoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productounidads==null|| productounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadsAux=new ArrayList<ProductoUnidad>();
						productounidadsAux.addAll(productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadsAux=new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productounidadLogic.getProductoUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoUnidads("FK_IdEmpresa",productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoUnidads("FK_IdEmpresa",productounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());
						productounidadLogic.getProductoUnidads().addAll(productounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidads=new ArrayList<ProductoUnidad>();
							productounidads.addAll(productounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productounidadLogic.getProductoUnidadsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productounidadLogic.getProductoUnidads()==null||productounidadLogic.getProductoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productounidads==null|| productounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadsAux=new ArrayList<ProductoUnidad>();
						productounidadsAux.addAll(productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadsAux=new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productounidadLogic.getProductoUnidadsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoUnidads("FK_IdProducto",productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoUnidads("FK_IdProducto",productounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());
						productounidadLogic.getProductoUnidads().addAll(productounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidads=new ArrayList<ProductoUnidad>();
							productounidads.addAll(productounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productounidadLogic.getProductoUnidadsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productounidadLogic.getProductoUnidads()==null||productounidadLogic.getProductoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productounidads==null|| productounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadsAux=new ArrayList<ProductoUnidad>();
						productounidadsAux.addAll(productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadsAux=new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productounidadLogic.getProductoUnidadsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoUnidads("FK_IdSucursal",productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoUnidads("FK_IdSucursal",productounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());
						productounidadLogic.getProductoUnidads().addAll(productounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidads=new ArrayList<ProductoUnidad>();
							productounidads.addAll(productounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productounidadLogic.getProductoUnidadsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productounidadLogic.getProductoUnidads()==null||productounidadLogic.getProductoUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productounidads==null|| productounidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadsAux=new ArrayList<ProductoUnidad>();
						productounidadsAux.addAll(productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadsAux=new ArrayList<ProductoUnidad>();
							productounidadsAux.addAll(productounidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productounidadLogic.getProductoUnidadsFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoUnidads("FK_IdUnidad",productounidadLogic.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoUnidads("FK_IdUnidad",productounidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadLogic.setProductoUnidads(new ArrayList<ProductoUnidad>());
						productounidadLogic.getProductoUnidads().addAll(productounidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidads=new ArrayList<ProductoUnidad>();
							productounidads.addAll(productounidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoUnidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoUnidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productounidadLogic.getProductoUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productounidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productounidadLogic.getProductoUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productounidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoUnidad productounidad) {
		Boolean permite=true;
		
		if(this.productounidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoUnidadConstantesFunciones.getOrderByListaProductoUnidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoUnidadConstantesFunciones.getOrderByListaProductoUnidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoUnidad productounidad:productounidadLogic.getProductoUnidads()) {
				if(productounidad.getsType().equals(Constantes2.S_TOTALES)) {
					productounidadTotales=productounidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoUnidad productounidad:this.productounidads) {
				if(productounidad.getsType().equals(Constantes2.S_TOTALES)) {
					productounidadTotales=productounidad;
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
			this.productounidadAux=new ProductoUnidad();
			this.productounidadAux.setsType(Constantes2.S_TOTALES);
			this.productounidadAux.setIsNew(false);
			this.productounidadAux.setIsChanged(false);
			this.productounidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoUnidadConstantesFunciones.TotalizarValoresFilaProductoUnidad(this.productounidadLogic.getProductoUnidads(),this.productounidadAux);
				
				this.productounidadLogic.getProductoUnidads().add(this.productounidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoUnidadConstantesFunciones.TotalizarValoresFilaProductoUnidad(this.productounidads,this.productounidadAux);
				
				this.productounidads.add(this.productounidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productounidadTotales=new ProductoUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productounidadLogic.getProductoUnidads().remove(productounidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productounidads.remove(productounidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productounidadTotales=new ProductoUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoUnidad productounidad:productounidadLogic.getProductoUnidads()) {
				if(productounidad.getsType().equals(Constantes2.S_TOTALES)) {
					productounidadTotales=productounidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoUnidadConstantesFunciones.TotalizarValoresFilaProductoUnidad(this.productounidadLogic.getProductoUnidads(),productounidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoUnidad productounidad:this.productounidads) {
				if(productounidad.getsType().equals(Constantes2.S_TOTALES)) {
					productounidadTotales=productounidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoUnidadConstantesFunciones.TotalizarValoresFilaProductoUnidad(this.productounidads,productounidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoUnidadsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoUnidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoUnidadsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoUnidadsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoUnidadsFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoUnidadsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLogic.getProductoUnidadsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoUnidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLogic.getProductoUnidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoUnidadsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLogic.getProductoUnidadsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoUnidadsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLogic.getProductoUnidadsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoUnidadsFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLogic.getProductoUnidadsFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoUnidad() {
		this.isPermisoTodoProductoUnidad=false;
		this.isPermisoNuevoProductoUnidad=false;
		this.isPermisoActualizarProductoUnidad=false;
		this.isPermisoActualizarOriginalProductoUnidad=false;
		this.isPermisoEliminarProductoUnidad=false;
		this.isPermisoGuardarCambiosProductoUnidad=false;
		this.isPermisoConsultaProductoUnidad=false;
		this.isPermisoBusquedaProductoUnidad=false;
		this.isPermisoReporteProductoUnidad=false;		
		this.isPermisoOrdenProductoUnidad=false;		
		this.isPermisoPaginacionMedioProductoUnidad=false;		
		this.isPermisoPaginacionAltoProductoUnidad=false;
		this.isPermisoPaginacionTodoProductoUnidad=false;
		this.isPermisoCopiarProductoUnidad=false;		
		this.isPermisoVerFormProductoUnidad=false;		
		this.isPermisoDuplicarProductoUnidad=false;		
		this.isPermisoOrdenProductoUnidad=false;		
	}
	
	public void setPermisosUsuarioProductoUnidad(Boolean isPermiso) {
		this.isPermisoTodoProductoUnidad=isPermiso;
		this.isPermisoNuevoProductoUnidad=isPermiso;
		this.isPermisoActualizarProductoUnidad=isPermiso;
		this.isPermisoActualizarOriginalProductoUnidad=isPermiso;
		this.isPermisoEliminarProductoUnidad=isPermiso;
		this.isPermisoGuardarCambiosProductoUnidad=isPermiso;
		this.isPermisoConsultaProductoUnidad=isPermiso;
		this.isPermisoBusquedaProductoUnidad=isPermiso;
		this.isPermisoReporteProductoUnidad=isPermiso;
		this.isPermisoOrdenProductoUnidad=isPermiso;		
		this.isPermisoPaginacionMedioProductoUnidad=isPermiso;		
		this.isPermisoPaginacionAltoProductoUnidad=isPermiso;		
		this.isPermisoPaginacionTodoProductoUnidad=isPermiso;		
		this.isPermisoCopiarProductoUnidad=isPermiso;		
		this.isPermisoVerFormProductoUnidad=isPermiso;		
		this.isPermisoDuplicarProductoUnidad=isPermiso;
		this.isPermisoOrdenProductoUnidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoUnidad(Boolean isPermiso) {
		//this.isPermisoTodoProductoUnidad=isPermiso;
		this.isPermisoNuevoProductoUnidad=isPermiso;
		this.isPermisoActualizarProductoUnidad=isPermiso;
		this.isPermisoActualizarOriginalProductoUnidad=isPermiso;
		this.isPermisoEliminarProductoUnidad=isPermiso;
		this.isPermisoGuardarCambiosProductoUnidad=isPermiso;
		//this.isPermisoConsultaProductoUnidad=isPermiso;
		//this.isPermisoBusquedaProductoUnidad=isPermiso;
		//this.isPermisoReporteProductoUnidad=isPermiso;
		//this.isPermisoOrdenProductoUnidad=isPermiso;		
		//this.isPermisoPaginacionMedioProductoUnidad=isPermiso;		
		//this.isPermisoPaginacionAltoProductoUnidad=isPermiso;		
		//this.isPermisoPaginacionTodoProductoUnidad=isPermiso;		
		//this.isPermisoCopiarProductoUnidad=isPermiso;		
		//this.isPermisoDuplicarProductoUnidad=isPermiso;
		//this.isPermisoOrdenProductoUnidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoUnidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoUnidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoUnidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoUnidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoUnidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoUnidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoUnidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoUnidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoUnidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoUnidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoUnidad=this.isPermisoActualizarProductoUnidad;
			this.isPermisoEliminarProductoUnidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoUnidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoUnidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoUnidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoUnidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoUnidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoUnidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoUnidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoUnidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoUnidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoUnidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoUnidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoUnidad.setToolTipText(this.jTableDatosProductoUnidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoUnidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoUnidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoUnidad() throws Exception {
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
	public void inicializarCombosForeignKeyProductoUnidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoUnidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoUnidadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if(cargarCombosDependencia && (this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
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

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProductoUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoUnidadParameterReturnGeneral productounidadReturnGeneral=new ProductoUnidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productounidadConstantesFunciones.cargarid_empresaProductoUnidad)
					 || (this.esRecargarFks && this.productounidadConstantesFunciones.cargarid_empresaProductoUnidad)) {

					if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productounidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productounidadConstantesFunciones.cargarid_sucursalProductoUnidad)
					 || (this.esRecargarFks && this.productounidadConstantesFunciones.cargarid_sucursalProductoUnidad)) {

					if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productounidadSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productounidadConstantesFunciones.cargarid_bodegaProductoUnidad)
					 || (this.esRecargarFks && this.productounidadConstantesFunciones.cargarid_bodegaProductoUnidad)) {

					if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productounidadSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productounidadConstantesFunciones.cargarid_productoProductoUnidad)
					 || (this.esRecargarFks && this.productounidadConstantesFunciones.cargarid_productoProductoUnidad)) {

					if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productounidadSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productounidadConstantesFunciones.cargarid_unidadProductoUnidad)
					 || (this.esRecargarFks && this.productounidadConstantesFunciones.cargarid_unidadProductoUnidad)) {

					if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productounidadSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productounidadReturnGeneral=productounidadLogic.cargarCombosLoteForeignKeyProductoUnidad(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productounidadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productounidadReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productounidadReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productounidadReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productounidadReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoUnidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productounidadSessionBean==null) {
				this.productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.productounidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductoUnidad()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyProducto(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyBodega(JComboBox jComboBoxBodegaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Bodega bodegaLocal=(Bodega)jComboBoxBodegaGenerico.getSelectedItem();

			if(bodegaLocal!=null  && bodegaLocal.getId()!=null  && bodegaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_bodega="+bodegaLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryProductoFromBodega(bodegaLocal);

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboProducto=sFinalQueryCombo;

			this.productosForeignKey=new ArrayList<Producto>();
			this.cargarCombosForeignKeyProducto(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyProducto(JComboBox jComboBoxProductoGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Producto productoLocal=(Producto)jComboBoxProductoGenerico.getSelectedItem();

			if(productoLocal!=null  && productoLocal.getId()!=null  && productoLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_producto="+productoLocal.getId();
			}
			//REDEFINE
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.productounidad.getid_bodega());

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboUnidad=sFinalQueryCombo;

			this.unidadsForeignKey=new ArrayList<Unidad>();
			this.cargarCombosForeignKeyUnidad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyBodega(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.addItemListener(new ComboBoxItemListener(this,"id_bodegaProductoUnidad"));
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoUnidad"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.addActionListener(new ComboBoxActionListener(this,"id_bodegaProductoUnidad"));
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoUnidad"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoUnidad"));

						this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoUnidad"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoUnidad"));

						this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoUnidad"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.addItemListener(new ComboBoxItemListener(this,"id_productoProductoUnidad"));
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoUnidad"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.addActionListener(new ComboBoxActionListener(this,"id_productoProductoUnidad"));
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoUnidad"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoProductoUnidad.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoProductoUnidad"));

						this.jComboBoxid_productoFK_IdProductoProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoProductoUnidad"));

					} else {
						this.jComboBoxid_productoFK_IdProductoProductoUnidad.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoProductoUnidad"));

						this.jComboBoxid_productoFK_IdProductoProductoUnidad.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoProductoUnidad"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProductoUnidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoUnidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoUnidad(ProductoUnidad productounidad)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(productounidad.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productounidad.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(productounidad.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoUnidad(ProductoUnidad productounidad,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productounidad.getProducto()!=null && !sTipoEvento.equals("id_productoProductoUnidad")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productounidad.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoUnidad()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.productounidadConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productounidadConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productounidadConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoUnidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoUnidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoUnidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoUnidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	





	public void recargarFormProductoUnidadBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoUnidadid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormProductoUnidadProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoUnidadid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormProductoUnidadid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.productounidad,jComboBoxGenericoProducto);
			}

			if(this.productounidad.getid_bodega()!=null && this.productounidad.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.productounidad.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.productounidad.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormProductoUnidadid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.productounidad,jComboBoxGenericoUnidad);
			}

			if(this.productounidad.getid_producto()!=null && this.productounidad.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.productounidad.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.productounidad.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProductoUnidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoUnidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoUnidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productounidadSessionBean=new ProductoUnidadSessionBean(); 
		this.productounidadConstantesFunciones=new ProductoUnidadConstantesFunciones(); 
		this.productounidadBean=new ProductoUnidad();//(this.productounidadConstantesFunciones); 		
		this.productounidadReturnGeneral=new ProductoUnidadParameterReturnGeneral(); 
		
		this.productounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoUnidad(true);
			
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
			
			this.productounidadConstantesFunciones=new ProductoUnidadConstantesFunciones(); 
			this.productounidadBean=new ProductoUnidad();//this.productounidadConstantesFunciones); 			
			this.productounidadReturnGeneral=new ProductoUnidadParameterReturnGeneral(); 
		
			ProductoUnidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Unidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productounidad=new ProductoUnidad();
			this.productounidads = new ArrayList<ProductoUnidad>();
			this.productounidadsAux = new ArrayList<ProductoUnidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic=new ProductoUnidadLogic();
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			//this.productounidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productounidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoUnidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoUnidad);	
					}
					
					if(this.jInternalFrameImportacionProductoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoUnidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoUnidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoUnidad);
				this.jInternalFrameDetalleFormProductoUnidad.setVisible(false);
				this.jInternalFrameDetalleFormProductoUnidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoUnidad);
					this.jInternalFrameReporteDinamicoProductoUnidad.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoUnidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoUnidad);
					this.jInternalFrameImportacionProductoUnidad.setVisible(false);
					this.jInternalFrameImportacionProductoUnidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoUnidad);
					this.jInternalFrameOrderByProductoUnidad.setVisible(false);
					this.jInternalFrameOrderByProductoUnidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoUnidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoUnidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productounidadReturnGeneral=new ProductoUnidadParameterReturnGeneral();
			
			this.productounidadParameterGeneral=new ProductoUnidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productounidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productounidadSessionBean.getEsGuardarRelacionado(),this.productounidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productounidadSessionBean.getEsGuardarRelacionado(),this.productounidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaDuplicarProductoUnidad=true;
			this.isVisibilidadCeldaCopiarProductoUnidad=true;
			this.isVisibilidadCeldaVerFormProductoUnidad=true;
			this.isVisibilidadCeldaOrdenProductoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
			this.isVisibilidadCeldaModificarProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=false;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=false;
			this.isVisibilidadCeldaGuardarProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdUnidad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoUnidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoUnidad(false);
			
			this.setPermisosUsuarioProductoUnidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productounidadSessionBean.getEsGuardarRelacionado() 
				|| (this.productounidadSessionBean.getEsGuardarRelacionado() && this.productounidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoUnidadClasesRelacionadas();
			}
			
			if(this.productounidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoUnidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoUnidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoUnidad();
			}
			
			if(!this.isPermisoBusquedaProductoUnidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoUnidad,this.isPermisoPaginacionMedioProductoUnidad,this.isPermisoPaginacionTodoProductoUnidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoUnidadConstantesFunciones.getTiposSeleccionarProductoUnidad());
				
				this.tiposColumnasSelect=ProductoUnidadConstantesFunciones.getTiposSeleccionarProductoUnidad(true);
				
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
			//if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoUnidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoUnidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoUnidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoUnidad() ;
			
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
			this.unidadLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productounidadImplementable= (ProductoUnidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productounidadImplementableHome= (ProductoUnidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productounidads= new ArrayList<ProductoUnidad>();
			this.productounidadsEliminados= new ArrayList<ProductoUnidad>();
						
			this.isEsNuevoProductoUnidad=false;
			this.esParaAccionDesdeFormularioProductoUnidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoUnidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoUnidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoUnidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoUnidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoUnidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoUnidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoUnidad();
			}
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoUnidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoUnidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoUnidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoUnidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoUnidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoUnidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoUnidad")) {
				iIndex=this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoUnidad();	
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
	
	public void cargarCombosForeignKeyProductoUnidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoUnidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoUnidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoUnidad();
		
		this.cargarCombosFrameForeignKeyProductoUnidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoUnidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoUnidad();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyBodega("Todos");
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
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyProducto("Todos");
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productounidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			
			if(jTableDatosProductoUnidad.getRowCount()>=1) {
				jTableDatosProductoUnidad.removeRowSelectionInterval(0, jTableDatosProductoUnidad.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoUnidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoUnidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoUnidad(true);			
			//this.productounidad=new ProductoUnidad();
			//this.productounidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoUnidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoUnidad() ;
			
			if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoUnidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productounidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.productounidad);				
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			if(this.productounidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoUnidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoUnidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoUnidad.getSelectedRows().length;			
			}
			
			productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoUnidad--;			
				//ProductoUnidad productounidadAux= new ProductoUnidad();			
				//productounidadAux.setId(this.iIdNuevoProductoUnidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoUnidad productounidadOrigen=new ProductoUnidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoUnidad productounidadOrigen : productounidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productounidadOrigen =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productounidadOrigen =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoUnidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productounidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoUnidad(productounidadOrigen,this.productounidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productounidadLogic.getProductoUnidads().add(this.productounidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productounidads.add(this.productounidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoUnidad(false);
				
				this.jTableDatosProductoUnidad.setRowSelectionInterval(this.getIndiceNuevoProductoUnidad(), this.getIndiceNuevoProductoUnidad());
				
				int iLastRow =  this.jTableDatosProductoUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoUnidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();									
		
			ProductoUnidad productounidadOrigen=new ProductoUnidad();
			ProductoUnidad productounidadDestino=new ProductoUnidad();
				
			productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoUnidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productounidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoUnidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadOrigen =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productounidadOrigen =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productounidadDestino =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productounidadDestino =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productounidadOrigen =productounidadsSeleccionados.get(0);
				productounidadDestino =productounidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoUnidad(productounidadOrigen,productounidadDestino,true,false);
				
				productounidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productounidadDestino,productounidadLogic.getProductoUnidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productounidadDestino,productounidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoUnidad(false);
				
				//this.jTableDatosProductoUnidad.setRowSelectionInterval(this.getIndiceNuevoProductoUnidad(), this.getIndiceNuevoProductoUnidad());
				
				int iLastRow =  this.jTableDatosProductoUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoUnidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoUnidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoUnidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoUnidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoUnidad.setVisible(!isVisible);
			this.jPanelPaginacionProductoUnidad.setVisible(!isVisible);
			this.jPanelAccionesProductoUnidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoUnidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoUnidad();
			
			this.abrirFrameOrderByProductoUnidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoUnidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoUnidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoUnidad.isMaximum()) {
					this.jInternalFrameDetalleFormProductoUnidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoUnidad.setSize(this.jInternalFrameDetalleFormProductoUnidad.iWidthFormulario,this.jInternalFrameDetalleFormProductoUnidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoUnidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoUnidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoUnidad.isMaximum()) {
						this.jInternalFrameDetalleFormProductoUnidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoUnidad.jContentPaneDetalleProductoUnidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoUnidad.jContentPaneDetalleProductoUnidad.getWidth(),ProductoUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoUnidad.jContentPaneDetalleProductoUnidad.getWidth(),ProductoUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoUnidad.jContentPaneDetalleProductoUnidad.getWidth(),ProductoUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoUnidad.setVisible(true);
	        this.jInternalFrameDetalleFormProductoUnidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoUnidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoUnidad,false,this);
				} else {
					this.jInternalFrameOrderByProductoUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoUnidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoUnidad);
				this.jInternalFrameOrderByProductoUnidad.setVisible(false);
				this.jInternalFrameOrderByProductoUnidad.setSelected(false);
				
				this.jInternalFrameOrderByProductoUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoUnidad"));
				
				this.inicializarActualizarBindingTablaOrderByProductoUnidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoUnidad==null) {
				
				this.jInternalFrameImportacionProductoUnidad=new ImportacionJInternalFrame(ProductoUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoUnidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoUnidad);
				this.jInternalFrameImportacionProductoUnidad.setVisible(false);
				this.jInternalFrameImportacionProductoUnidad.setSelected(false);


				this.jInternalFrameImportacionProductoUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoUnidad"));
				this.jInternalFrameImportacionProductoUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoUnidad"));
				this.jInternalFrameImportacionProductoUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoUnidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoUnidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoUnidad==null) {
				this.jInternalFrameReporteDinamicoProductoUnidad=new ReporteDinamicoJInternalFrame(ProductoUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoUnidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoUnidad);
				this.jInternalFrameReporteDinamicoProductoUnidad.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoUnidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoUnidad"));
				this.jInternalFrameReporteDinamicoProductoUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoUnidad"));
				this.jInternalFrameReporteDinamicoProductoUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoUnidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoUnidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoUnidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoUnidad);
			
	       	this.jInternalFrameDetalleFormProductoUnidad.setVisible(false);
	        this.jInternalFrameDetalleFormProductoUnidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoUnidad.dispose();
			//this.jInternalFrameDetalleFormProductoUnidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoUnidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoUnidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoUnidad.setVisible(true);
	        this.jInternalFrameImportacionProductoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoUnidad.setVisible(true);
	        this.jInternalFrameOrderByProductoUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoUnidad.setVisible(false);
	        this.jInternalFrameOrderByProductoUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoUnidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoUnidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoUnidad.setVisible(false);
	        this.jInternalFrameImportacionProductoUnidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoUnidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoUnidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoUnidad(true);
			//this.isEsNuevoProductoUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoUnidad(false) ;
			
			if(productounidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoUnidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoUnidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoUnidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoUnidad(true);
			//this.isEsNuevoProductoUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productounidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoUnidad(false) ;
			
			if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoUnidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productounidadConstantesFunciones.cargarid_productoProductoUnidad) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoUnidad(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoUnidad.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoUnidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoUnidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoUnidad(false);
			
			//if(!this.isEsNuevoProductoUnidad) {								
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				
			}
			
			if(this.permiteMantenimiento(this.productounidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productounidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoUnidad=true;
					this.inicializarActualizarBindingTablaProductoUnidad(false);
					this.isEsNuevoProductoUnidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoUnidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoUnidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoUnidad(false);
				
				this.habilitarDeshabilitarControlesProductoUnidad(false);
			
												
				
				if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoUnidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoUnidadActionPerformed(evt,productounidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoUnidad(this.productounidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoUnidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productounidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productounidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				this.productounidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				this.productounidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productounidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productounidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoUnidadModel) this.jTableDatosProductoUnidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoUnidad=true;
				this.inicializarActualizarBindingTablaProductoUnidad(false);
				this.isEsNuevoProductoUnidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoUnidad(false);
				
				this.habilitarDeshabilitarControlesProductoUnidad(false);
				
				
				
				if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoUnidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoUnidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoUnidad.getRowCount()>=1) {
				jTableDatosProductoUnidad.removeRowSelectionInterval(0, jTableDatosProductoUnidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoUnidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoUnidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoUnidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoUnidad(false) ;
			
			this.isEsNuevoProductoUnidad=false;
			
			if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoUnidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoUnidad(false);
				
				//SI ES MANUAL
				if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoUnidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoUnidad--;			
			//ProductoUnidad productounidadAux= new ProductoUnidad();			
			//productounidadAux.setId(this.iIdNuevoProductoUnidad);
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoUnidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
			
			this.productounidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productounidadLogic.getProductoUnidads().add(this.productounidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productounidads.add(this.productounidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoUnidad(false);
			
			this.jTableDatosProductoUnidad.setRowSelectionInterval(this.getIndiceNuevoProductoUnidad(), this.getIndiceNuevoProductoUnidad());
			
			int iLastRow =  this.jTableDatosProductoUnidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoUnidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoUnidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoUnidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoUnidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoUnidad(false);
			
			//SI ES MANUAL
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoUnidad();
			}
			
			//this.abrirFrameTreeProductoUnidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto UnidadS ?", "MANTENIMIENTO DE Producto Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoUnidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoUnidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productounidadReturnGeneral=productounidadLogic.procesarImportacionProductoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productounidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoUnidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoUnidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoUnidad.setFileImportacion(this.jInternalFrameImportacionProductoUnidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoUnidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoUnidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoUnidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoUnidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		

		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoUnidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoUnidadBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorUnidad_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoUnidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD:
					sNombreCampoCategoria="valor_unidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD:
					sNombreCampoCategoriaValor="valor_unidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_unidad");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoUnidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoUnidad productounidad:productounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productounidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoUnidad productounidad:productounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productounidad.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoUnidad productounidad:productounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productounidad.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoUnidad productounidad:productounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productounidad.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoUnidad productounidad:productounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productounidad.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD);
					iRow++;

					for(ProductoUnidad productounidad:productounidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productounidad.getvalor_unidad());
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
			//	this.getFilaCabeceraExportarExcelProductoUnidad(row);				
			//	iRow++;
			//}				
			
			//for(ProductoUnidad productounidadAux:productounidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoUnidad(productounidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoUnidad(false);
			
			//SI ES MANUAL
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoUnidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoUnidad(false);
			
			//SI ES MANUAL
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoUnidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoUnidad(false);
			
			//SI ES MANUAL
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoUnidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoUnidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoUnidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoUnidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoUnidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoUnidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoUnidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoUnidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoUnidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoUnidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoUnidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoUnidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoUnidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoUnidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoUnidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoUnidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoUnidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoUnidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoUnidad();
		
		this.inicializarActualizarBindingBotonesManualProductoUnidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoUnidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoUnidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoUnidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoUnidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoUnidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoUnidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoUnidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoUnidad.jCheckBoxPostAccionNuevoProductoUnidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoUnidad.jCheckBoxPostAccionSinCerrarProductoUnidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoUnidad.jCheckBoxPostAccionSinMensajeProductoUnidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoUnidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoUnidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoUnidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
				this.jInternalFrameDetalleFormProductoUnidad.jCheckBoxPostAccionNuevoProductoUnidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoUnidad.jCheckBoxPostAccionSinCerrarProductoUnidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoUnidad.jCheckBoxPostAccionSinMensajeProductoUnidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoUnidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoUnidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoUnidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoUnidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoUnidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoUnidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoUnidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoUnidad(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoUnidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoUnidad() throws Exception {
		try	{
			if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoUnidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoUnidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoUnidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoUnidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoUnidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoUnidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoUnidad.addItem(reporte);
			}
			
			
			if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoUnidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoUnidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoUnidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoUnidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
				this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
				this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoUnidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoUnidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoUnidadConstantesFunciones.getTiposSeleccionarProductoUnidad(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoUnidadConstantesFunciones.getTiposSeleccionarProductoUnidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoUnidadConstantesFunciones.getTiposSeleccionarProductoUnidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoUnidad.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoUnidad.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoUnidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoUnidad.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoUnidad.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoUnidad.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadProductoUnidad.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadProductoUnidad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoUnidad(Boolean esInicializar) throws Exception {				
		if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoUnidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoUnidad() throws Exception {
		this.inicializarActualizarBindingTablaProductoUnidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoUnidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoUnidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoUnidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productounidadLogic.getProductoUnidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productounidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoUnidad.setModel(new ProductoUnidadModel(this.productounidadLogic.getProductoUnidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoUnidad.setModel(new ProductoUnidadModel(this.productounidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoUnidad!=null && this.jInternalFrameOrderByProductoUnidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoUnidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO,productounidadConstantesFunciones.resaltarSeleccionarProductoUnidad,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoUnidadConstantesFunciones.SCLASSWEBTITULO,productounidadConstantesFunciones.resaltarSeleccionarProductoUnidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_ID));

		if(this.productounidadConstantesFunciones.mostraridProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productounidadConstantesFunciones.resaltaridProductoUnidad,this.productounidadConstantesFunciones.activaridProductoUnidad,iSizeTabla,this,true,"idProductoUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productounidadConstantesFunciones.resaltaridProductoUnidad,this.productounidadConstantesFunciones.activaridProductoUnidad,this,true,"idProductoUnidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productounidadConstantesFunciones.mostrarid_empresaProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productounidadConstantesFunciones.resaltarid_empresaProductoUnidad,this,this.productounidadConstantesFunciones.activarid_empresaProductoUnidad,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productounidadConstantesFunciones.resaltarid_empresaProductoUnidad,this,this.productounidadConstantesFunciones.activarid_empresaProductoUnidad,false,"id_empresaProductoUnidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productounidadConstantesFunciones.mostrarid_sucursalProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productounidadConstantesFunciones.resaltarid_sucursalProductoUnidad,this,this.productounidadConstantesFunciones.activarid_sucursalProductoUnidad,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productounidadConstantesFunciones.resaltarid_sucursalProductoUnidad,this,this.productounidadConstantesFunciones.activarid_sucursalProductoUnidad,false,"id_sucursalProductoUnidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDBODEGA));

		if(this.productounidadConstantesFunciones.mostrarid_bodegaProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productounidadConstantesFunciones.resaltarid_bodegaProductoUnidad,this,this.productounidadConstantesFunciones.activarid_bodegaProductoUnidad,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productounidadConstantesFunciones.resaltarid_bodegaProductoUnidad,this,this.productounidadConstantesFunciones.activarid_bodegaProductoUnidad,true,"id_bodegaProductoUnidad","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productounidadConstantesFunciones.mostrarid_productoProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productounidadConstantesFunciones.resaltarid_productoProductoUnidad,this,this.productounidadConstantesFunciones.activarid_productoProductoUnidad,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productounidadConstantesFunciones.resaltarid_productoProductoUnidad,this,this.productounidadConstantesFunciones.activarid_productoProductoUnidad,true,"id_productoProductoUnidad","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productounidadConstantesFunciones.mostrarid_unidadProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productounidadConstantesFunciones.resaltarid_unidadProductoUnidad,this,this.productounidadConstantesFunciones.activarid_unidadProductoUnidad,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productounidadConstantesFunciones.resaltarid_unidadProductoUnidad,this,this.productounidadConstantesFunciones.activarid_unidadProductoUnidad,true,"id_unidadProductoUnidad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD));

		if(this.productounidadConstantesFunciones.mostrarvalor_unidadProductoUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productounidadConstantesFunciones.resaltarvalor_unidadProductoUnidad,this.productounidadConstantesFunciones.activarvalor_unidadProductoUnidad,iSizeTabla,this,true,"valor_unidadProductoUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productounidadConstantesFunciones.resaltarvalor_unidadProductoUnidad,this.productounidadConstantesFunciones.activarvalor_unidadProductoUnidad,this,true,"valor_unidadProductoUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productounidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productounidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productounidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoUnidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productounidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productounidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoUnidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productounidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productounidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoUnidad.addColumn(tableColumn);
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
			
			this.jTableDatosProductoUnidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoUnidad.moveColumn(this.jTableDatosProductoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoUnidad.moveColumn(this.jTableDatosProductoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoUnidad.moveColumn(this.jTableDatosProductoUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoUnidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoUnidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoUnidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoUnidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoUnidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoUnidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoUnidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoUnidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productounidadLogic.getProductoUnidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productounidads.size()-1;
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
		//this.jTableDatosProductoUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoUnidad();
			
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
				
				//this.isEsNuevoProductoUnidad=false;
					
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoUnidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoUnidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productounidad.getsType().equals("DUPLICADO")
				   || this.productounidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoUnidad=true;
				
				} else {
					this.isEsNuevoProductoUnidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productounidadSessionBean.getEsGuardarRelacionado()) {
					if(this.productounidad.getId()>=0 && !this.productounidad.getIsNew()) {						
						this.isEsNuevoProductoUnidad=false;
						
					} else {
						this.isEsNuevoProductoUnidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoUnidad(esRelaciones);						
				
				this.seleccionarProductoUnidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productounidad.getId()<0) {
					this.isEsNuevoProductoUnidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoUnidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoUnidad(evt,rowIndex);
				}	
				
				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoUnidad: " + this.dDif); 
					}
				}								
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoUnidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productounidad)) {
					if(this.productounidad.getId()>0) {
						this.productounidad.setIsDeleted(true);
						
						this.productounidadsEliminados.add(this.productounidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productounidadLogic.getProductoUnidads().remove(this.productounidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productounidads.remove(this.productounidad);				
					}
					
					
					((ProductoUnidadModel) this.jTableDatosProductoUnidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoUnidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoUnidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoUnidad) {
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoUnidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoUnidad(this.productounidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productounidadConstantesFunciones.cargarid_empresaProductoUnidad || this.productounidadConstantesFunciones.event_dependid_empresaProductoUnidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productounidad.getid_empresa());
									//this.inicializarActualizarBindingProductoUnidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productounidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(productounidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productounidad.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productounidadConstantesFunciones.cargarid_sucursalProductoUnidad || this.productounidadConstantesFunciones.event_dependid_sucursalProductoUnidad) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productounidad.getid_sucursal());
									//this.inicializarActualizarBindingProductoUnidad(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productounidad.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productounidad.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productounidad.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.productounidadConstantesFunciones.cargarid_bodegaProductoUnidad || this.productounidadConstantesFunciones.event_dependid_bodegaProductoUnidad) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productounidad.getid_bodega());
									//this.inicializarActualizarBindingProductoUnidad(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productounidad.getBodega()!=null) {
							this.bodegasForeignKey.add(productounidad.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productounidad.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productounidadConstantesFunciones.cargarid_productoProductoUnidad || this.productounidadConstantesFunciones.event_dependid_productoProductoUnidad) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productounidad.getid_producto());
									//this.inicializarActualizarBindingProductoUnidad(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productounidad.getProducto()!=null) {
							this.productosForeignKey.add(productounidad.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productounidad.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.productounidadConstantesFunciones.cargarid_unidadProductoUnidad || this.productounidadConstantesFunciones.event_dependid_unidadProductoUnidad) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productounidad.getid_unidad());
									//this.inicializarActualizarBindingProductoUnidad(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productounidad.getUnidad()!=null) {
							this.unidadsForeignKey.add(productounidad.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productounidad.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoUnidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoUnidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoUnidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoUnidad(ProductoUnidad productounidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoUnidad(productounidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoUnidad(ProductoUnidad productounidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoUnidad(productounidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoUnidad(productounidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoUnidad(productounidad);
	}
	
	public void setVariablesObjetoActualToFormularioProductoUnidad(ProductoUnidad productounidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setText(productounidad.getId().toString());
			this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setText(productounidad.getvalor_unidad().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoUnidad productounidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productounidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoUnidad productounidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productounidadLocal=this.productounidad;
			} else {
				productounidadLocal=this.productounidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productounidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoUnidad(productounidadLocal,true);
					
					if(productounidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productounidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productounidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoUnidad(ProductoUnidad productounidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoUnidad(productounidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(productounidad);
	}
	
	public void setVariablesFormularioToObjetoActualProductoUnidad(ProductoUnidad productounidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoUnidad(productounidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoUnidad(ProductoUnidad productounidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.getText()==null || this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.getText()=="" || this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setText("0");
			}

			if(conColumnasBase) {productounidad.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoUnidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelIdProductoUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productounidad.setvalor_unidad(Double.parseDouble(this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoUnidad.jLabelvalor_unidadProductoUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoUnidad(ProductoUnidad productounidadBean,ProductoUnidad productounidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productounidadBean.getid_bodega()!=null && !productounidadBean.getid_bodega().equals(-1L))) {productounidad.setid_bodega(productounidadBean.getid_bodega());}
			if(conDefault || (!conDefault && productounidadBean.getid_producto()!=null && !productounidadBean.getid_producto().equals(-1L))) {productounidad.setid_producto(productounidadBean.getid_producto());}
			if(conDefault || (!conDefault && productounidadBean.getid_unidad()!=null && !productounidadBean.getid_unidad().equals(-1L))) {productounidad.setid_unidad(productounidadBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoUnidad(ProductoUnidad productounidadOrigen,ProductoUnidad productounidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productounidadOrigen.getId()!=null && !productounidadOrigen.getId().equals(0L))) {productounidad.setId(productounidadOrigen.getId());}}
			if(conDefault || (!conDefault && productounidadOrigen.getid_bodega()!=null && !productounidadOrigen.getid_bodega().equals(-1L))) {productounidad.setid_bodega(productounidadOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productounidadOrigen.getid_producto()!=null && !productounidadOrigen.getid_producto().equals(-1L))) {productounidad.setid_producto(productounidadOrigen.getid_producto());}
			if(conDefault || (!conDefault && productounidadOrigen.getid_unidad()!=null && !productounidadOrigen.getid_unidad().equals(-1L))) {productounidad.setid_unidad(productounidadOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productounidadOrigen.getvalor_unidad()!=null && !productounidadOrigen.getvalor_unidad().equals(0.0))) {productounidad.setvalor_unidad(productounidadOrigen.getvalor_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoUnidad(ProductoUnidad productounidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setText(productounidad.getId().toString());
			this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setText(productounidad.getvalor_unidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoUnidad(ProductoUnidadBean productounidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setText(productounidadBean.getId().toString());
			this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setText(productounidadBean.getvalor_unidad().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoUnidad(ProductoUnidadParameterReturnGeneral productounidadReturnGeneral,ProductoUnidadBean productounidadBean,Boolean conDefault) throws Exception { 
		try {
			ProductoUnidad productounidadLocal=new ProductoUnidad();
			
			productounidadLocal=productounidadReturnGeneral.getProductoUnidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productounidadLocal.getId()!=null && !productounidadLocal.getId().equals(0L))) {productounidadBean.setId(productounidadLocal.getId());}}
			if(conDefault || (!conDefault && productounidadLocal.getid_bodega()!=null && !productounidadLocal.getid_bodega().equals(-1L))) {productounidadBean.setid_bodega(productounidadLocal.getid_bodega());}
			if(conDefault || (!conDefault && productounidadLocal.getid_producto()!=null && !productounidadLocal.getid_producto().equals(-1L))) {productounidadBean.setid_producto(productounidadLocal.getid_producto());}
			if(conDefault || (!conDefault && productounidadLocal.getid_unidad()!=null && !productounidadLocal.getid_unidad().equals(-1L))) {productounidadBean.setid_unidad(productounidadLocal.getid_unidad());}
			if(conDefault || (!conDefault && productounidadLocal.getvalor_unidad()!=null && !productounidadLocal.getvalor_unidad().equals(0.0))) {productounidadBean.setvalor_unidad(productounidadLocal.getvalor_unidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoUnidadGenerico(Long idProductoUnidadSeleccionado,JComboBox jComboBoxProductoUnidad,List<ProductoUnidad> productounidadsLocal)throws Exception {
		try {
			ProductoUnidad  productounidadTemp=null;

			for(ProductoUnidad productounidadAux:productounidadsLocal) {
				if(productounidadAux.getId()!=null && productounidadAux.getId().equals(idProductoUnidadSeleccionado)) {
					productounidadTemp=productounidadAux;
					break;
				}
			}

			jComboBoxProductoUnidad.setSelectedItem(productounidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoUnidadGenerico(JComboBox jComboBoxProductoUnidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoUnidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoUnidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productounidad=(ProductoUnidad) productounidadLogic.getProductoUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productounidad =(ProductoUnidad) productounidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productounidad.getIsNew() && !productounidad.getIsChanged() && !productounidad.getIsDeleted()) {
				sDescripcion=productounidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productounidad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productounidad.getIsNew() && !productounidad.getIsChanged() && !productounidad.getIsDeleted()) {
				sDescripcion=productounidad.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productounidad.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productounidad.getIsNew() && !productounidad.getIsChanged() && !productounidad.getIsDeleted()) {
				sDescripcion=productounidad.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productounidad.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productounidad.getIsNew() && !productounidad.getIsChanged() && !productounidad.getIsDeleted()) {
				sDescripcion=productounidad.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productounidad.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productounidad.getIsNew() && !productounidad.getIsChanged() && !productounidad.getIsDeleted()) {
				sDescripcion=productounidad.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productounidad.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoUnidad productounidadRow=new ProductoUnidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productounidadRow=(ProductoUnidad) productounidadLogic.getProductoUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productounidadRow=(ProductoUnidad) productounidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoUnidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoProductoUnidad && this.isPermisoNuevoProductoUnidad));			
			this.jButtonDuplicarProductoUnidad.setVisible((this.isVisibilidadCeldaDuplicarProductoUnidad && this.isPermisoDuplicarProductoUnidad));			
			this.jButtonCopiarProductoUnidad.setVisible((this.isVisibilidadCeldaCopiarProductoUnidad && this.isPermisoCopiarProductoUnidad));
			this.jButtonVerFormProductoUnidad.setVisible((this.isVisibilidadCeldaVerFormProductoUnidad && this.isPermisoVerFormProductoUnidad));
			
			this.jButtonAbrirOrderByProductoUnidad.setVisible((this.isVisibilidadCeldaOrdenProductoUnidad && this.isPermisoOrdenProductoUnidad));			
			
			this.jButtonNuevoRelacionesProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoUnidad && this.isPermisoNuevoProductoUnidad));			
			this.jButtonNuevoGuardarCambiosProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoProductoUnidad && this.isPermisoNuevoProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarProductoUnidad.setVisible((this.isVisibilidadCeldaModificarProductoUnidad && this.isPermisoActualizarProductoUnidad));	
			this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarProductoUnidad.setVisible((this.isVisibilidadCeldaActualizarProductoUnidad && this.isPermisoActualizarProductoUnidad));	
			this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarProductoUnidad.setVisible((this.isVisibilidadCeldaEliminarProductoUnidad && this.isPermisoEliminarProductoUnidad));
			this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarProductoUnidad.setVisible(this.isVisibilidadCeldaCancelarProductoUnidad);							
			this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoProductoUnidad && this.isPermisoNuevoProductoUnidad));						
			this.jButtonDuplicarToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaDuplicarProductoUnidad && this.isPermisoDuplicarProductoUnidad));						
			this.jButtonCopiarToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaCopiarProductoUnidad && this.isPermisoCopiarProductoUnidad));			
			this.jButtonVerFormToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaVerFormProductoUnidad && this.isPermisoVerFormProductoUnidad));			
			this.jButtonAbrirOrderByToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaOrdenProductoUnidad && this.isPermisoOrdenProductoUnidad));
			this.jButtonNuevoRelacionesToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoUnidad && this.isPermisoNuevoProductoUnidad));			
			this.jButtonNuevoGuardarCambiosToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoProductoUnidad && this.isPermisoNuevoProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));			
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaModificarProductoUnidad && this.isPermisoActualizarProductoUnidad));	
			this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaActualizarProductoUnidad  && this.isPermisoActualizarProductoUnidad));	
			this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaEliminarProductoUnidad && this.isPermisoEliminarProductoUnidad));
			this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarToolBarProductoUnidad.setVisible(this.isVisibilidadCeldaCancelarProductoUnidad);				
			this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoProductoUnidad && this.isPermisoNuevoProductoUnidad));			
			this.jMenuItemDuplicarProductoUnidad.setVisible((this.isVisibilidadCeldaDuplicarProductoUnidad && this.isPermisoDuplicarProductoUnidad));			
			this.jMenuItemCopiarProductoUnidad.setVisible((this.isVisibilidadCeldaCopiarProductoUnidad && this.isPermisoCopiarProductoUnidad));			
			this.jMenuItemVerFormProductoUnidad.setVisible((this.isVisibilidadCeldaVerFormProductoUnidad && this.isPermisoVerFormProductoUnidad));			
			this.jMenuItemAbrirOrderByProductoUnidad.setVisible((this.isVisibilidadCeldaOrdenProductoUnidad && this.isPermisoOrdenProductoUnidad));			
			//this.jMenuItemMostrarOcultarProductoUnidad.setVisible((this.isVisibilidadCeldaOrdenProductoUnidad && this.isPermisoOrdenProductoUnidad));
			this.jMenuItemDetalleAbrirOrderByProductoUnidad.setVisible((this.isVisibilidadCeldaOrdenProductoUnidad && this.isPermisoOrdenProductoUnidad));			
			//this.jMenuItemDetalleMostrarOcultarProductoUnidad.setVisible((this.isVisibilidadCeldaOrdenProductoUnidad && this.isPermisoOrdenProductoUnidad));			
			this.jMenuItemNuevoRelacionesProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoUnidad && this.isPermisoNuevoProductoUnidad));			
			this.jMenuItemNuevoGuardarCambiosProductoUnidad.setVisible((this.isVisibilidadCeldaNuevoProductoUnidad && this.isPermisoNuevoProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));									
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemModificarProductoUnidad.setVisible((this.isVisibilidadCeldaModificarProductoUnidad && this.isPermisoActualizarProductoUnidad));	
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemActualizarProductoUnidad.setVisible((this.isVisibilidadCeldaActualizarProductoUnidad && this.isPermisoActualizarProductoUnidad));	
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemEliminarProductoUnidad.setVisible((this.isVisibilidadCeldaEliminarProductoUnidad && this.isPermisoEliminarProductoUnidad));
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemCancelarProductoUnidad.setVisible(this.isVisibilidadCeldaCancelarProductoUnidad);				
			}
			
			this.jMenuItemGuardarCambiosProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));						
			this.jMenuItemGuardarCambiosTablaProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoUnidad=this.jButtonNuevoProductoUnidad.isVisible();
			this.isVisibilidadCeldaDuplicarProductoUnidad=this.jButtonDuplicarProductoUnidad.isVisible();
			this.isVisibilidadCeldaCopiarProductoUnidad=this.jButtonCopiarProductoUnidad.isVisible();
			this.isVisibilidadCeldaVerFormProductoUnidad=this.jButtonVerFormProductoUnidad.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoUnidad=this.jButtonAbrirOrderByProductoUnidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=this.jButtonNuevoRelacionesProductoUnidad.isVisible();
			this.isVisibilidadCeldaModificarProductoUnidad=this.jButtonModificarProductoUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.isVisibilidadCeldaActualizarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarProductoUnidad.isVisible();
			this.isVisibilidadCeldaEliminarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarProductoUnidad.isVisible();
			this.isVisibilidadCeldaCancelarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarProductoUnidad.isVisible();
			this.isVisibilidadCeldaGuardarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=this.jButtonGuardarCambiosTablaProductoUnidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoUnidad=this.jButtonNuevoToolBarProductoUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=this.jButtonNuevoRelacionesToolBarProductoUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.isVisibilidadCeldaModificarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarToolBarProductoUnidad.isVisible();
			this.isVisibilidadCeldaActualizarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarToolBarProductoUnidad.isVisible();
			this.isVisibilidadCeldaEliminarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarToolBarProductoUnidad.isVisible();
			this.isVisibilidadCeldaCancelarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarToolBarProductoUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoUnidad=this.jButtonGuardarCambiosToolBarProductoUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=this.jButtonGuardarCambiosTablaToolBarProductoUnidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoUnidad=this.jMenuItemNuevoProductoUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=this.jMenuItemNuevoRelacionesProductoUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.isVisibilidadCeldaModificarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jMenuItemModificarProductoUnidad.isVisible();
			this.isVisibilidadCeldaActualizarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jMenuItemActualizarProductoUnidad.isVisible();
			this.isVisibilidadCeldaEliminarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jMenuItemEliminarProductoUnidad.isVisible();
			this.isVisibilidadCeldaCancelarProductoUnidad=this.jInternalFrameDetalleFormProductoUnidad.jMenuItemCancelarProductoUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoUnidad=this.jMenuItemGuardarCambiosProductoUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=this.jMenuItemGuardarCambiosTablaProductoUnidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoUnidad(Boolean esInicializar) {
		if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productounidadSessionBean.getConGuardarRelaciones()) {
				//if(this.productounidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoUnidad();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoUnidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoUnidad() {
		this.jButtonNuevoProductoUnidad.setVisible(this.isPermisoNuevoProductoUnidad);			
		this.jButtonDuplicarProductoUnidad.setVisible(this.isPermisoDuplicarProductoUnidad);			
		this.jButtonCopiarProductoUnidad.setVisible(this.isPermisoCopiarProductoUnidad);			
		this.jButtonVerFormProductoUnidad.setVisible(this.isPermisoVerFormProductoUnidad);			
		
		this.jButtonAbrirOrderByProductoUnidad.setVisible(this.isPermisoOrdenProductoUnidad);					
		
		this.jButtonNuevoRelacionesProductoUnidad.setVisible(this.isPermisoNuevoProductoUnidad);			
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarProductoUnidad.setVisible(this.isPermisoActualizarProductoUnidad);	
			this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarProductoUnidad.setVisible(this.isPermisoActualizarProductoUnidad);	
			this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarProductoUnidad.setVisible(this.isPermisoEliminarProductoUnidad);
			this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarProductoUnidad.setVisible(this.isVisibilidadCeldaCancelarProductoUnidad);						
			this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.setVisible(this.isPermisoGuardarCambiosProductoUnidad);							
		}
		
		this.jButtonGuardarCambiosTablaProductoUnidad.setVisible(this.isPermisoActualizarProductoUnidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoUnidad() {
		this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarProductoUnidad.setVisible(this.isPermisoActualizarProductoUnidad);	
		this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarProductoUnidad.setVisible(this.isPermisoActualizarProductoUnidad);	
		this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarProductoUnidad.setVisible(this.isPermisoEliminarProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarProductoUnidad.setVisible(this.isVisibilidadCeldaCancelarProductoUnidad);							
		this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.setVisible((this.isVisibilidadCeldaGuardarProductoUnidad && this.isPermisoGuardarCambiosProductoUnidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoUnidad() {
		if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoUnidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoUnidad() {
	}
	
	public void jTableDatosProductoUnidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoUnidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productounidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoUnidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productounidadLogic.getConnexion());

				if(this.productounidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productounidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoUnidad=(TitledBorder)this.jScrollPanelDatosProductoUnidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoUnidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productounidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoUnidad(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productounidadLogic.getConnexion());

				if(this.productounidad.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productounidad.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoUnidad=(TitledBorder)this.jScrollPanelDatosProductoUnidad.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoUnidad.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productounidad.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoUnidad(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productounidadLogic.getConnexion());

				if(this.productounidad.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productounidad.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoUnidad=(TitledBorder)this.jScrollPanelDatosProductoUnidad.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoUnidad.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productounidad.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoUnidadActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoUnidad=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoUnidad.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoUnidad=(TitledBorder)this.jScrollPanelDatosProductoUnidad.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoUnidad.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoUnidad(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productounidadLogic.getConnexion());

				if(this.productounidad.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productounidad.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoUnidad=(TitledBorder)this.jScrollPanelDatosProductoUnidad.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoUnidad.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productounidad.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoUnidad(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productounidadLogic.getConnexion());

				if(this.productounidad.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productounidad.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoUnidad=(TitledBorder)this.jScrollPanelDatosProductoUnidad.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoUnidad.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productounidad.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_unidadProductoUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.getproductounidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productounidad==null) {
						this.productounidad = new ProductoUnidad();
					}

					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);
				}

				if(this.productounidad.getvalor_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_unidad = "+this.productounidad.getvalor_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoUnidad(false,false);

			this.getProductoUnidadsFK_IdBodega();

			this.inicializarActualizarBindingProductoUnidad(false);

			//if(ProductoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoUnidad(false,false);

			this.getProductoUnidadsFK_IdEmpresa();

			this.inicializarActualizarBindingProductoUnidad(false);

			//if(ProductoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoUnidad(false,false);

			this.getProductoUnidadsFK_IdProducto();

			this.inicializarActualizarBindingProductoUnidad(false);

			//if(ProductoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoUnidad(false,false);

			this.getProductoUnidadsFK_IdSucursal();

			this.inicializarActualizarBindingProductoUnidad(false);

			//if(ProductoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadProductoUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoUnidad(false,false);

			this.getProductoUnidadsFK_IdUnidad();

			this.inicializarActualizarBindingProductoUnidad(false);

			//if(ProductoUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productounidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoUnidad() {
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
			this.jInternalFrameDetalleFormProductoUnidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoUnidad.dispose();
			this.jInternalFrameDetalleFormProductoUnidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
			this.jInternalFrameReporteDinamicoProductoUnidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoUnidad.dispose();
			this.jInternalFrameReporteDinamicoProductoUnidad=null;
		}
		
		if(this.jInternalFrameImportacionProductoUnidad!=null) {
			this.jInternalFrameImportacionProductoUnidad.setVisible(false);	    			
			this.jInternalFrameImportacionProductoUnidad.dispose();
			this.jInternalFrameImportacionProductoUnidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoUnidad();
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoUnidad")) {
				jButtonDuplicarProductoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoUnidad")) {
				jButtonCopiarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoUnidad")) {
				jButtonVerFormProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoUnidad")) {
				jButtonDuplicarProductoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoUnidad")) {
				jButtonDuplicarProductoUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoUnidad")) {
				jButtonModificarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoUnidad")) {
				jButtonModificarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoUnidad")) {
				jButtonModificarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoUnidad")) {
				jButtonActualizarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoUnidad")) {
				jButtonActualizarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoUnidad")) {
				jButtonActualizarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoUnidad")) {
				jButtonEliminarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoUnidad")) {
				jButtonEliminarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoUnidad")) {
				jButtonEliminarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoUnidad")) {
				jButtonCancelarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoUnidad")) {
				jButtonCancelarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoUnidad")) {
				jButtonCancelarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoUnidad")) {
				jButtonCerrarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoUnidad")) {
				jButtonCerrarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoUnidad")) {
				jButtonCerrarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoUnidad")) {
				jButtonMostrarOcultarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoUnidad")) {
				jButtonCancelarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoUnidad")) {
				jButtonCopiarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoUnidad")) {
				jButtonVerFormProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoUnidad")) {
				jButtonCopiarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoUnidad")) {
				jButtonVerFormProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoUnidad")) {
				jButtonRecargarInformacionProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoUnidad")) {
				jButtonRecargarInformacionProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoUnidad")) {
				jButtonRecargarInformacionProductoUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoUnidad")) {
				jButtonAnterioresProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoUnidad")) {
				jButtonAnterioresProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoUnidad")) {
				jButtonAnterioresProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoUnidad")) {
				jButtonSiguientesProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoUnidad")) {
				jButtonSiguientesProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoUnidad")) {
				jButtonSiguientesProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoUnidad") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoUnidad")) {
				jButtonAbrirOrderByProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoUnidad") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoUnidad")) {
				jButtonMostrarOcultarProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoUnidad")) {
				jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoUnidad")) {
				jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoUnidad")) {
				jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoUnidad")) {
				jButtonCerrarReporteDinamicoProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoUnidad")) {
				jButtonGenerarReporteDinamicoProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoUnidad")) {
				
				jButtonGenerarExcelReporteDinamicoProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoUnidad")) {
				jButtonCerrarImportacionProductoUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoUnidad")) {
				
				jButtonGenerarImportacionProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoUnidad")) {
				
				jButtonAbrirImportacionProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoUnidad")) {
				jComboBoxTiposAccionesProductoUnidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoUnidad")) {
				jComboBoxTiposRelacionesProductoUnidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoUnidad")) {
				jComboBoxTiposAccionesProductoUnidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoUnidad")) {
				
				jComboBoxTiposSeleccionarProductoUnidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoUnidad")) {
				jTextFieldValorCampoGeneralProductoUnidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoUnidad")) {
				jButtonAbrirOrderByProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoUnidad")) {
				jButtonAbrirOrderByProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoUnidad")) {
				jButtonCerrarOrderByProductoUnidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoUnidadBusqueda")) {
				this.jButtonidProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoUnidadUpdate")) {
				this.jButtonid_empresaProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoUnidadBusqueda")) {
				this.jButtonid_empresaProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoUnidadUpdate")) {
				this.jButtonid_sucursalProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoUnidadBusqueda")) {
				this.jButtonid_sucursalProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoUnidadUpdate")) {
				this.jButtonid_bodegaProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoUnidadBusqueda")) {
				this.jButtonid_bodegaProductoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoUnidad")) {
				this.jButtonid_productoProductoUnidadActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoUnidadUpdate")) {
				this.jButtonid_productoProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoUnidadBusqueda")) {
				this.jButtonid_productoProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoUnidadUpdate")) {
				this.jButtonid_unidadProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoUnidadBusqueda")) {
				this.jButtonid_unidadProductoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_unidadProductoUnidadBusqueda")) {
				this.jButtonvalor_unidadProductoUnidadBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoUnidad")) {
				this.jButtonid_productoProductoUnidadActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoUnidad")) {
				this.jButtonFK_IdBodegaProductoUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoUnidad")) {
				this.jButtonFK_IdProductoProductoUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadProductoUnidad")) {
				this.jButtonFK_IdUnidadProductoUnidadActionPerformed(evt);
			}
			
			;
			
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoUnidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				


				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoUnidad productounidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				productounidadLocal=this.productounidad;
			} else {
				productounidadLocal=this.productounidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
							
				
				


				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
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
			
			


			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
								
						
				


				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
								
				
				


				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
							
				
				


				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
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
			
			


			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
								
				
				


				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoUnidad")) {
					jCheckBoxSeleccionarTodosProductoUnidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoUnidad")) {
					jCheckBoxSeleccionadosProductoUnidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoUnidad")) {
					
				}
				
				


				
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
												
				
				


				
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaProductoUnidad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad;
				}

				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoUnidad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoUnidad")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,"FK_IdBodega");
				//recargarFormProductoUnidadBodega(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoUnidad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad;
				}

				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoUnidad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoUnidad")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoUnidad,"FK_IdProducto");
				//recargarFormProductoUnidadProducto(jComboBoxid_productoFK_IdProductoProductoUnidad,"FK_IdProducto");
			}
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaProductoUnidad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad;
				}

				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoUnidad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoUnidad")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,"FK_IdBodega");
				//recargarFormProductoUnidadBodega(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoUnidad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad;
				}

				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoUnidad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoUnidad")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoUnidad,"FK_IdProducto");
				//recargarFormProductoUnidadProducto(jComboBoxid_productoFK_IdProductoProductoUnidad,"FK_IdProducto");
			}
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productounidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productounidad);
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaProductoUnidad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad;
				}

				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoUnidad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoUnidad")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,"FK_IdBodega");
				//recargarFormProductoUnidadBodega(jComboBoxid_bodegaFK_IdBodegaProductoUnidad,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoUnidad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad;
				}

				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoUnidad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoUnidad")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoUnidad,"FK_IdProducto");
				//recargarFormProductoUnidadProducto(jComboBoxid_productoFK_IdProductoProductoUnidad,"FK_IdProducto");
			}
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoUnidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productounidadAnterior =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoUnidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoUnidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productounidad =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productounidad =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productounidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoUnidad")) {
				
				}
				
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoUnidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoUnidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoUnidad")) {
			
			}
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoUnidad();
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			if(sTipo.equals("NuevoProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoUnidad")) {
				jButtonDuplicarProductoUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoUnidad")) {
				jButtonCopiarProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoUnidad")) {
				jButtonVerFormProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoUnidad")) {
				jButtonNuevoProductoUnidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoUnidad")) {
				jButtonModificarProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoUnidad")) {
				jButtonActualizarProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoUnidad")) {
				jButtonEliminarProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoUnidad")) {
				jButtonCancelarProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoUnidad")) {
				jButtonCerrarProductoUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoUnidad")) {
				jButtonGuardarCambiosProductoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoUnidad")) {
				jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoUnidad")) {
				jButtonAbrirOrderByProductoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoUnidad")) {
				jButtonRecargarInformacionProductoUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoUnidad")) {
				jButtonAnterioresProductoUnidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoUnidad")) {
				jButtonSiguientesProductoUnidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoUnidadBusqueda")) {
				this.jButtonidProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoUnidadUpdate")) {
				this.jButtonid_empresaProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoUnidadBusqueda")) {
				this.jButtonid_empresaProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoUnidadUpdate")) {
				this.jButtonid_sucursalProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoUnidadBusqueda")) {
				this.jButtonid_sucursalProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoUnidadUpdate")) {
				this.jButtonid_bodegaProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoUnidadBusqueda")) {
				this.jButtonid_bodegaProductoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoUnidad")) {
				this.jButtonid_productoProductoUnidadActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoUnidadUpdate")) {
				this.jButtonid_productoProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoUnidadBusqueda")) {
				this.jButtonid_productoProductoUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoUnidadUpdate")) {
				this.jButtonid_unidadProductoUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoUnidadBusqueda")) {
				this.jButtonid_unidadProductoUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_unidadProductoUnidadBusqueda")) {
				this.jButtonvalor_unidadProductoUnidadBusquedaActionPerformed(evt);
			}
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoUnidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoUnidad")) {
				closingInternalFrameProductoUnidad();
				
			} else if(sTipo.equals("jButtonCancelarProductoUnidad")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoUnidad = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoUnidadBeanSwingJInternalFrame jInternalFrameParent=(ProductoUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoUnidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoUnidadActionPerformed(null);
			}
			
			ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productounidad,new Object(),this.productounidadParameterGeneral,this.productounidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productounidad)) {
			if(!esControlTabla) {
				if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);			
				}
				
				if(this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoUnidad(this.productounidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productounidadReturnGeneral=productounidadLogic.procesarEventosProductoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productounidadLogic.getProductoUnidads(),this.productounidad,this.productounidadParameterGeneral,this.isEsNuevoProductoUnidad,classes);//this.productounidadLogic.getProductoUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoUnidad(this.productounidadReturnGeneral,this.productounidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productounidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoUnidad(classes,this.productounidadReturnGeneral,this.productounidadBean,false);
					}
						
					if(this.productounidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad());	
					}
						
					if(this.productounidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad(),classes);//this.productounidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoUnidad(this.productounidad,classes);//this.productounidadBean);									
				}
			
				if(ProductoUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoUnidad(this.productounidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoUnidad(this.productounidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productounidadAnterior!=null) {
						this.productounidad=this.productounidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productounidadReturnGeneral=productounidadLogic.procesarEventosProductoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productounidadLogic.getProductoUnidads(),this.productounidad,this.productounidadParameterGeneral,this.isEsNuevoProductoUnidad,classes);//this.productounidadLogic.getProductoUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productounidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productounidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productounidadReturnGeneral.getProductoUnidad(),productounidadLogic.getProductoUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productounidadReturnGeneral.getProductoUnidad(),this.productounidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoUnidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoUnidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoUnidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoUnidad() throws Exception {
		
		ProductoUnidadModel productounidadModel=(ProductoUnidadModel)this.jTableDatosProductoUnidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productounidadModel.productounidads=this.productounidadLogic.getProductoUnidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productounidadModel.productounidads=this.productounidads;
		}
		
		
		((ProductoUnidadModel) this.jTableDatosProductoUnidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoUnidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductounidadAnterior(),this.productounidadLogic.getProductoUnidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductounidadAnterior(),this.productounidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoUnidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoUnidad(ProductoUnidad productounidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
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
										
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productounidad,new Object(),generalEntityParameterGeneral,this.productounidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productounidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsOfProductoUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoUnidadConstantesFunciones.getClassesRelationshipsFromStringsOfProductoUnidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productounidad,new Object(),generalEntityParameterGeneral,this.productounidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoUnidad(ProductoUnidadBean productounidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoUnidad(ArrayList<Classe> classes,ProductoUnidadReturnGeneral productounidadReturnGeneral,ProductoUnidadBean productounidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoUnidad(ProductoUnidad productounidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productounidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoUnidad = new ProductoUnidadDetalleFormJInternalFrame(jDesktopPane,this.productounidadSessionBean.getConGuardarRelaciones(),this.productounidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.setVisible(false);
		this.jInternalFrameDetalleFormProductoUnidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoUnidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoUnidad.productounidadLogic=this.productounidadLogic;
		
		this.cargarCombosFrameForeignKeyProductoUnidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoUnidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoUnidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoUnidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoUnidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoUnidad"));
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarProductoUnidad.addActionListener(new ButtonActionListener(this,"ModificarProductoUnidad"));

		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoUnidad"));
					
		this.jInternalFrameDetalleFormProductoUnidad.jMenuItemModificarProductoUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarProductoUnidad.addActionListener (new ButtonActionListener(this,"ActualizarProductoUnidad"));
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoUnidad"));
						
		this.jInternalFrameDetalleFormProductoUnidad.jMenuItemActualizarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarProductoUnidad.addActionListener (new ButtonActionListener(this,"EliminarProductoUnidad"));
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoUnidad"));
								
		this.jInternalFrameDetalleFormProductoUnidad.jMenuItemEliminarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarProductoUnidad.addActionListener (new ButtonActionListener(this,"CancelarProductoUnidad"));
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoUnidad"));
					
		this.jInternalFrameDetalleFormProductoUnidad.jMenuItemCancelarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoUnidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jMenuItemDetalleCerrarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoUnidad"));
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoUnidad"));
		
		
		
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoUnidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonidProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_empresaProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_empresaProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_sucursalProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_sucursalProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_bodegaProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_bodegaProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoUnidadBusqueda"));
		//jButtonid_productoProductoUnidad.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoUnidadActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidad.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidad"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_unidadProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_unidadProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonvalor_unidadProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valor_unidadProductoUnidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoUnidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoUnidad"));
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoUnidad"));
		}
		
		this.jTableDatosProductoUnidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoUnidad"));
		
		this.jTableDatosProductoUnidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoUnidad"));
		
		this.jButtonNuevoProductoUnidad.addActionListener(new ButtonActionListener(this,"NuevoProductoUnidad"));
		
		this.jButtonDuplicarProductoUnidad.addActionListener(new ButtonActionListener(this,"DuplicarProductoUnidad"));
		
		this.jButtonCopiarProductoUnidad.addActionListener(new ButtonActionListener(this,"CopiarProductoUnidad"));
		
		this.jButtonVerFormProductoUnidad.addActionListener(new ButtonActionListener(this,"VerFormProductoUnidad"));
		
		
		this.jButtonNuevoToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoUnidad"));
			
		this.jButtonDuplicarToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoUnidad"));
			
		this.jMenuItemNuevoProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoUnidad"));
			
		this.jMenuItemDuplicarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoUnidad"));		
		
		
		this.jButtonNuevoRelacionesProductoUnidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoUnidad"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoUnidad"));
			
		this.jMenuItemNuevoRelacionesProductoUnidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarProductoUnidad.addActionListener(new ButtonActionListener(this,"ModificarProductoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonModificarToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoUnidad"));
			
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemModificarProductoUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarProductoUnidad.addActionListener (new ButtonActionListener(this,"ActualizarProductoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonActualizarToolBarProductoUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoUnidad"));
				
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemActualizarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarProductoUnidad.addActionListener (new ButtonActionListener(this,"EliminarProductoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonEliminarToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoUnidad"));
						
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemEliminarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarProductoUnidad.addActionListener (new ButtonActionListener(this,"CancelarProductoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonCancelarToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoUnidad"));
			
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemCancelarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoUnidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoUnidad"));		
		
		
		this.jButtonCerrarProductoUnidad.addActionListener (new ButtonActionListener(this,"CerrarProductoUnidad"));
		
		
		this.jButtonCerrarToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoUnidad"));
			
		this.jMenuItemCerrarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoUnidad"));
			
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jMenuItemDetalleCerrarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoUnidad"));
		}
		
		this.jButtonCopiarToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoUnidad"));
			
		this.jButtonVerFormToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoUnidad"));
		
		this.jMenuItemGuardarCambiosProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoUnidad"));
			
		this.jMenuItemCopiarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoUnidad"));		
		
		this.jMenuItemVerFormProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoUnidad"));		
		
		
		this.jButtonGuardarCambiosTablaProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoUnidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoUnidad"));
			
		this.jMenuItemGuardarCambiosTablaProductoUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoUnidad"));		
		
		
		
		this.jButtonRecargarInformacionProductoUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoUnidad"));
					
		this.jButtonRecargarInformacionToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoUnidad"));
		
		this.jMenuItemRecargarInformacionProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoUnidad"));		
		
		
		
		this.jButtonAnterioresProductoUnidad.addActionListener (new ButtonActionListener(this,"AnterioresProductoUnidad"));
		
		
		this.jButtonAnterioresToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoUnidad"));
		
		this.jMenuItemAnterioresProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoUnidad"));		
		
		
		this.jButtonSiguientesProductoUnidad.addActionListener (new ButtonActionListener(this,"SiguientesProductoUnidad"));
		
		
		this.jButtonSiguientesToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoUnidad"));
			
		this.jMenuItemSiguientesProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoUnidad"));
			
		this.jMenuItemAbrirOrderByProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoUnidad"));
			
		this.jMenuItemMostrarOcultarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoUnidad"));
			
		this.jMenuItemDetalleAbrirOrderByProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoUnidad"));
			
		this.jMenuItemDetalleMostarOcultarProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoUnidad"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoUnidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoUnidad"));
			
		this.jMenuItemNuevoGuardarCambiosProductoUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoUnidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoUnidad"));

		this.jCheckBoxSeleccionadosProductoUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoUnidad"));
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoUnidad"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoUnidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoUnidad"));
			
		this.jComboBoxTiposAccionesProductoUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoUnidad"));
					
		this.jComboBoxTiposSeleccionarProductoUnidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoUnidad"));
			
		this.jTextFieldValorCampoGeneralProductoUnidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonidProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_empresaProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_empresaProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_sucursalProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_sucursalProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_bodegaProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_bodegaProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoUnidadBusqueda"));
		//jButtonid_productoProductoUnidad.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoUnidadActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidad.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidad"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_unidadProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_unidadProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonvalor_unidadProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valor_unidadProductoUnidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoUnidad.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoUnidad"));

			this.jButtonFK_IdProductoProductoUnidad.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoUnidad"));

			this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidad"));

			this.jButtonFK_IdUnidadProductoUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoUnidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoUnidad!=null) {
				this.jInternalFrameReporteDinamicoProductoUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoUnidad"));
				this.jInternalFrameReporteDinamicoProductoUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoUnidad"));
				this.jInternalFrameReporteDinamicoProductoUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoUnidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoUnidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoUnidad"));				
			//this.jButtonGenerarReporteDinamicoProductoUnidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoUnidad"));
			//this.jButtonGenerarExcelReporteDinamicoProductoUnidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoUnidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoUnidad!=null) {
				this.jInternalFrameImportacionProductoUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoUnidad"));
				this.jInternalFrameImportacionProductoUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoUnidad"));
				this.jInternalFrameImportacionProductoUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoUnidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoUnidad"));
			
			this.jButtonAbrirOrderByToolBarProductoUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoUnidad"));			
			
			if(this.jInternalFrameOrderByProductoUnidad!=null) {
				this.jInternalFrameOrderByProductoUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoUnidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoUnidad.jTabbedPaneRelacionesProductoUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoUnidad"));
		
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
            		closingInternalFrameProductoUnidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoUnidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoUnidad = (JInternalFrameBase)event.getSource();
	            	
	            ProductoUnidadBeanSwingJInternalFrame jInternalFrameParent=(ProductoUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoUnidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoUnidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoUnidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoUnidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoUnidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoUnidad";
		inputMap = this.jButtonNuevoProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoUnidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoUnidad";
		inputMap = this.jButtonNuevoRelacionesProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoUnidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoUnidad";
		inputMap = this.jButtonModificarProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoUnidad";
		inputMap = this.jButtonActualizarProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoUnidad";
		inputMap = this.jButtonEliminarProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoUnidad";
		inputMap = this.jButtonCancelarProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoUnidad";
		inputMap = this.jButtonCerrarProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoUnidad";
		inputMap = this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoUnidad.jButtonGuardarCambiosProductoUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoUnidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoUnidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonidProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_empresaProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_empresaProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_sucursalProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_sucursalProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_bodegaProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_bodegaProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoUnidadBusqueda"));
		//jButtonid_productoProductoUnidad.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoUnidadActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidad.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidad"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_unidadProductoUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonid_unidadProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoUnidad.jButtonvalor_unidadProductoUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valor_unidadProductoUnidadBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoUnidad.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoUnidad"));

		this.jButtonFK_IdProductoProductoUnidad.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoUnidad"));

		this.jButtonBuscarFK_IdProductoid_productoProductoUnidad.addActionListener(new ButtonActionListener(this,"id_productoProductoUnidad"));

		this.jButtonFK_IdUnidadProductoUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadProductoUnidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoUnidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoUnidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
					productounidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoUnidad productounidadAux:productounidads) {
					productounidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
						productounidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoUnidad productounidadAux:productounidads) {
						productounidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoUnidad productounidadAux:productounidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoUnidad.getSelectedRows();
			
			ProductoUnidad productounidadLocal=new ProductoUnidad();
			
			//this.seleccionarTodosProductoUnidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productounidadLocal =(ProductoUnidad) this.productounidadLogic.getProductoUnidads().toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productounidadLocal =(ProductoUnidad) this.productounidads.toArray()[this.jTableDatosProductoUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productounidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
						productounidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoUnidad productounidadAux:productounidads) {
						productounidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoUnidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoUnidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoUnidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoUnidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoUnidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoUnidad productounidadAux:this.productounidadLogic.getProductoUnidads()) {
				
						if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD)) {
							existe=true;
							productounidadAux.setvalor_unidad(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoUnidad productounidadAux:productounidads) {
					
						if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD)) {
							existe=true;
							productounidadAux.setvalor_unidad(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoUnidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoUnidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoUnidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoUnidad) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoUnidad(conSplash);
				
					this.generarReporteProductoUnidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoUnidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoUnidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoUnidad();
				
				this.exportarProductoUnidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoUnidads();
				//this.importarProductoUnidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoUnidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoUnidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoUnidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoUnidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoUnidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoUnidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoUnidad(conSplash);
					
						//this.actualizarParametrosGeneralProductoUnidad();
						
						this.generarReporteProcesoAccionProductoUnidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoUnidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto UnidadS SELECCIONADOS?", "MANTENIMIENTO DE Producto Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoUnidad();
				
						this.actualizarParametrosGeneralProductoUnidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productounidadReturnGeneral=productounidadLogic.procesarAccionProductoUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productounidadLogic.getProductoUnidads(),this.productounidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoUnidad();
					
					ProductoUnidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoUnidad.jComboBoxTiposAccionesFormularioProductoUnidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoUnidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoUnidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoUnidad();
			
			if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
			ProductoUnidad productounidad=new ProductoUnidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoUnidad.getSelectedItem();
			
			
			
			
			productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(productounidadsSeleccionados.size()==1) {
				for(ProductoUnidad productounidadAux:productounidadsSeleccionados) {
					productounidad=productounidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoUnidad();
			
      		//this.finishProcessProductoUnidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoUnidadReturnGeneral() throws Exception {
		if(this.productounidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productounidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productounidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productounidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productounidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productounidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoUnidad(false);
		}
		
		if(this.productounidadReturnGeneral.getConRetornoLista() || this.productounidadReturnGeneral.getConRetornoObjeto()) {
			if(this.productounidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productounidadLogic.setProductoUnidads(this.productounidadReturnGeneral.getProductoUnidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productounidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productounidadLogic.setProductoUnidad(this.productounidadReturnGeneral.getProductoUnidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoUnidad(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoUnidad() throws Exception {
		
		
	}
	
	public ArrayList<ProductoUnidad> getProductoUnidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoUnidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoUnidad productounidadAux:productounidadLogic.getProductoUnidads()) {
					if(productounidadAux.getIsSelected()) {
						productounidadsSeleccionados.add(productounidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoUnidad productounidadAux:this.productounidads) {
					if(productounidadAux.getIsSelected()) {
						productounidadsSeleccionados.add(productounidadAux);				
					}
				}
			}
			
			if(productounidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productounidadsSeleccionados.addAll(this.productounidadLogic.getProductoUnidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productounidadsSeleccionados.addAll(this.productounidads);				
					}
				}
			}
		} else {
			productounidadsSeleccionados.add(this.productounidad);
		}
		
		return productounidadsSeleccionados;
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
	
	public void generarReporteProductoUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoUnidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoUnidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoUnidadsSeleccionados() throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoUnidadsSeleccionados() throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoUnidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoUnidadsSeleccionados() throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoUnidad();
		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoUnidad();
		
		
		//this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados ,productounidadImplementable,productounidadImplementableHome);
	}
	
	public void mostrarImportacionProductoUnidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoUnidad();
		
		this.abrirFrameImportacionProductoUnidad();		
		
			
		//this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados ,productounidadImplementable,productounidadImplementableHome);
	}
	
	public void importarProductoUnidads() throws Exception {		
	
	}
	
	public void exportarProductoUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoUnidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoUnidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoUnidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoUnidadsSeleccionados() throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoUnidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoUnidad productounidadAux:productounidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoUnidad(productounidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productounidadAux.setsDetalleGeneralEntityReporte(productounidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoUnidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoUnidad(ProductoUnidad productounidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productounidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productounidad.getvalor_unidad().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoUnidadsSeleccionados() throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoUnidad(row);				
				iRow++;
			}				
			
			for(ProductoUnidad productounidadAux:productounidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoUnidad(productounidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoUnidadsSeleccionados() throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();		
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productounidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productounidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productounidad");
			//elementRoot.appendChild(element);
		
			for(ProductoUnidad productounidadAux:productounidadsSeleccionados) {
				element = document.createElement("productounidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoUnidad(productounidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productounidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoUnidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoUnidadConstantesFunciones.LABEL_VALORUNIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoUnidad(ProductoUnidad productounidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productounidad.getvalor_unidad());				
	}
	
	public void setFilaDatosExportarXmlProductoUnidad(ProductoUnidad productounidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoUnidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productounidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoUnidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productounidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoUnidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productounidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoUnidadConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productounidad.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoUnidadConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productounidad.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoUnidadConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productounidad.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoUnidadConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productounidad.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementvalor_unidad = document.createElement(ProductoUnidadConstantesFunciones.VALORUNIDAD);
		elementvalor_unidad.appendChild(document.createTextNode(productounidad.getvalor_unidad().toString().trim()));
		element.appendChild(elementvalor_unidad);
	}
	
	public void generarReporteGroupGenericoProductoUnidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoUnidad> productounidadsSeleccionados=new ArrayList<ProductoUnidad>();
		
		productounidadsSeleccionados=this.getProductoUnidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoUnidad(productounidadsSeleccionados);
		
		this.generarReporteProductoUnidads("Todos",productounidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoUnidad(ArrayList<ProductoUnidad> productounidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoUnidad productounidadAux:productounidadsSeleccionados) {
				productounidadAux.setsDetalleGeneralEntityReporte(productounidadAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productounidadAux.setsDescripcionGeneralEntityReporte1(productounidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productounidadAux.setsDescripcionGeneralEntityReporte1(productounidadAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productounidadAux.setsDescripcionGeneralEntityReporte1(productounidadAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productounidadAux.setsDescripcionGeneralEntityReporte1(productounidadAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoUnidadConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productounidadAux.setsDescripcionGeneralEntityReporte1(productounidadAux.getunidad_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoUnidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoUnidad=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=true;
				this.isVisibilidadCeldaGuardarCambiosProductoUnidad=true;
			}
			
			this.isVisibilidadCeldaModificarProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=false;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
			this.isVisibilidadCeldaModificarProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=true;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
			this.isVisibilidadCeldaModificarProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=true;
			this.isVisibilidadCeldaEliminarProductoUnidad=true;
			this.isVisibilidadCeldaCancelarProductoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
			this.isVisibilidadCeldaModificarProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=true;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=true;
			this.isVisibilidadCeldaModificarProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=false;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
			this.isVisibilidadCeldaActualizarProductoUnidad=false;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
			this.isVisibilidadCeldaModificarProductoUnidad=true;
			this.isVisibilidadCeldaActualizarProductoUnidad=false;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
			this.isVisibilidadCeldaCancelarProductoUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoUnidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoUnidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=true;
		} else {
			this.actualizarEstadoPanelsProductoUnidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoUnidad=false;
			//this.isVisibilidadCeldaVerFormProductoUnidad=false;
			this.isVisibilidadCeldaDuplicarProductoUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productounidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosProductoUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productounidadSessionBean.getEsGuardarRelacionado()) {
			if(!productounidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;												
			}
			
			this.jButtonCerrarProductoUnidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoUnidad=false;
		}
		
		if(!this.permiteMantenimiento(this.productounidad)) {
			this.isVisibilidadCeldaActualizarProductoUnidad=false;
			this.isVisibilidadCeldaEliminarProductoUnidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoUnidad() {
	}
	
	public void actualizarEstadoPanelsProductoUnidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoUnidad!=null) {
				this.jScrollPanelDatosEdicionProductoUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoUnidad!=null) {
				this.jScrollPanelDatosProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoUnidad!=null) {
				this.jPanelPaginacionProductoUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productounidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
					this.jTabbedPaneBusquedasProductoUnidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productounidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoUnidad!=null) {
				this.jTabbedPaneBusquedasProductoUnidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoUnidad!=null) {
				this.jPanelParametrosReportesProductoUnidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdBodegaProductoUnidad);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdProductoProductoUnidad);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdUnidadProductoUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdBodegaProductoUnidad);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdProductoProductoUnidad);}

			this.isVisibilidadFK_IdUnidad=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdUnidadProductoUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdBodegaProductoUnidad);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdProductoProductoUnidad);}

			this.isVisibilidadFK_IdUnidad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdUnidadProductoUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdBodegaProductoUnidad);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdProductoProductoUnidad);}

			this.isVisibilidadFK_IdUnidad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdUnidadProductoUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdBodegaProductoUnidad);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdProductoProductoUnidad);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasProductoUnidad.remove(jPanelFK_IdUnidadProductoUnidad);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoUnidadParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productounidadSessionBean==null) {
				productounidadSessionBean=new ProductoUnidadSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productounidadSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productounidadFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoUnidadConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoUnidad(true);
			//productoSessionBean.setlidProductoUnidadActual(this.idProductoUnidadActual);

			productounidadSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoUnidad(true);
			productounidadSessionBean.setlIdProductoUnidadActualForeignKey(this.idProductoUnidadActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoUnidadSessionBean productounidadSessionBean=new ProductoUnidadSessionBean();
		
		if(this.productounidadSessionBean==null) {
			this.productounidadSessionBean=new ProductoUnidadSessionBean();
		}
		
		this.productounidadSessionBean.setsUltimaBusquedaProductoUnidad(this.getsAccionBusqueda());
		this.productounidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productounidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productounidadSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productounidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productounidadSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productounidadSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			productounidadSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoUnidadSessionBean productounidadSessionBean=new ProductoUnidadSessionBean();
		
		if(this.productounidadSessionBean==null) {
			this.productounidadSessionBean=new ProductoUnidadSessionBean();
		}
		
		if(this.productounidadSessionBean.getsUltimaBusquedaProductoUnidad()!=null&&!this.productounidadSessionBean.getsUltimaBusquedaProductoUnidad().equals("")) {
			this.setsAccionBusqueda(productounidadSessionBean.getsUltimaBusquedaProductoUnidad());
			this.setiNumeroPaginacion(productounidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productounidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productounidadSessionBean.getid_bodega());
				productounidadSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productounidadSessionBean.getid_empresa());
				productounidadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productounidadSessionBean.getid_producto());
				productounidadSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productounidadSessionBean.getid_sucursal());
				productounidadSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(productounidadSessionBean.getid_unidad());
				productounidadSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productounidadSessionBean.setsUltimaBusquedaProductoUnidad("");
		this.productounidadSessionBean.setiNumeroPaginacion(ProductoUnidadConstantesFunciones.INUMEROPAGINACION);
		this.productounidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoUnidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoUnidad() {
		this.updateBorderResaltarBusquedasFormularioProductoUnidad();
		this.updateVisibilidadBusquedasFormularioProductoUnidad();
		this.updateHabilitarBusquedasFormularioProductoUnidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoUnidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoUnidad.getComponents().length>0) {
	

		if(this.productounidadConstantesFunciones.resaltarFK_IdBodegaProductoUnidad!=null) {
			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdBodegaProductoUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
				jPanel.setBorder(this.productounidadConstantesFunciones.resaltarFK_IdBodegaProductoUnidad);
			}
		}

		if(this.productounidadConstantesFunciones.resaltarFK_IdProductoProductoUnidad!=null) {
			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdProductoProductoUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
				jPanel.setBorder(this.productounidadConstantesFunciones.resaltarFK_IdProductoProductoUnidad);
			}
		}

		if(this.productounidadConstantesFunciones.resaltarFK_IdUnidadProductoUnidad!=null) {
			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdUnidadProductoUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
				jPanel.setBorder(this.productounidadConstantesFunciones.resaltarFK_IdUnidadProductoUnidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoUnidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdBodegaProductoUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productounidadConstantesFunciones.mostrarFK_IdBodegaProductoUnidad);
			if(!this.productounidadConstantesFunciones.mostrarFK_IdBodegaProductoUnidad && index>-1) {
				this.jTabbedPaneBusquedasProductoUnidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdProductoProductoUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productounidadConstantesFunciones.mostrarFK_IdProductoProductoUnidad);
			if(!this.productounidadConstantesFunciones.mostrarFK_IdProductoProductoUnidad && index>-1) {
				this.jTabbedPaneBusquedasProductoUnidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdUnidadProductoUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productounidadConstantesFunciones.mostrarFK_IdUnidadProductoUnidad);
			if(!this.productounidadConstantesFunciones.mostrarFK_IdUnidadProductoUnidad && index>-1) {
				this.jTabbedPaneBusquedasProductoUnidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoUnidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdBodegaProductoUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productounidadConstantesFunciones.activarFK_IdBodegaProductoUnidad);
				this.jTabbedPaneBusquedasProductoUnidad.setEnabledAt(index,this.productounidadConstantesFunciones.activarFK_IdBodegaProductoUnidad);
			}

			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdProductoProductoUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productounidadConstantesFunciones.activarFK_IdProductoProductoUnidad);
				this.jTabbedPaneBusquedasProductoUnidad.setEnabledAt(index,this.productounidadConstantesFunciones.activarFK_IdProductoProductoUnidad);
			}

			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdUnidadProductoUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productounidadConstantesFunciones.activarFK_IdUnidadProductoUnidad);
				this.jTabbedPaneBusquedasProductoUnidad.setEnabledAt(index,this.productounidadConstantesFunciones.activarFK_IdUnidadProductoUnidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoUnidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdBodegaProductoUnidad);

			this.jTabbedPaneBusquedasProductoUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);

			this.productounidadConstantesFunciones.setResaltarFK_IdBodegaProductoUnidad(resaltar);

			jPanel.setBorder(this.productounidadConstantesFunciones.resaltarFK_IdBodegaProductoUnidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdProductoProductoUnidad);

			this.jTabbedPaneBusquedasProductoUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);

			this.productounidadConstantesFunciones.setResaltarFK_IdProductoProductoUnidad(resaltar);

			jPanel.setBorder(this.productounidadConstantesFunciones.resaltarFK_IdProductoProductoUnidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasProductoUnidad.indexOfComponent(this.jPanelFK_IdUnidadProductoUnidad);

			this.jTabbedPaneBusquedasProductoUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoUnidad.getComponent(index);

			this.productounidadConstantesFunciones.setResaltarFK_IdUnidadProductoUnidad(resaltar);

			jPanel.setBorder(this.productounidadConstantesFunciones.resaltarFK_IdUnidadProductoUnidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoUnidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoUnidad() throws Exception {

		if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoUnidad();
		this.updateVisibilidadResaltarControlesFormularioProductoUnidad();
		this.updateHabilitarResaltarControlesFormularioProductoUnidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productounidadConstantesFunciones.resaltaridProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltaridProductoUnidad);}
		if(this.productounidadConstantesFunciones.resaltarid_empresaProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltarid_empresaProductoUnidad);}
		if(this.productounidadConstantesFunciones.resaltarid_sucursalProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltarid_sucursalProductoUnidad);}
		if(this.productounidadConstantesFunciones.resaltarid_bodegaProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltarid_bodegaProductoUnidad);}
		if(this.productounidadConstantesFunciones.resaltarid_productoProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltarid_productoProductoUnidad);}
		if(this.productounidadConstantesFunciones.resaltarid_unidadProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltarid_unidadProductoUnidad);}
		if(this.productounidadConstantesFunciones.resaltarvalor_unidadProductoUnidad!=null && this.jInternalFrameDetalleFormProductoUnidad!=null) {this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setBorder(this.productounidadConstantesFunciones.resaltarvalor_unidadProductoUnidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoUnidad() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
	
		//this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostraridProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelidProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostraridProductoUnidad);
		//this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_empresaProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelid_empresaProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_empresaProductoUnidad);
		//this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_sucursalProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelid_sucursalProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_sucursalProductoUnidad);
		//this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_bodegaProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelid_bodegaProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_bodegaProductoUnidad);
		//this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_productoProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelid_productoProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_productoProductoUnidad);
			this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_productoProductoUnidad);
		//this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_unidadProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelid_unidadProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarid_unidadProductoUnidad);
		//this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarvalor_unidadProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jPanelvalor_unidadProductoUnidad.setVisible(this.productounidadConstantesFunciones.mostrarvalor_unidadProductoUnidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormProductoUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoUnidad!=null) {
	
		this.jInternalFrameDetalleFormProductoUnidad.jLabelidProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activaridProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_empresaProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarid_empresaProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_sucursalProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarid_sucursalProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_bodegaProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarid_bodegaProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_productoProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarid_productoProductoUnidad);
			this.jInternalFrameDetalleFormProductoUnidad.jButtonid_productoProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarid_productoProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jComboBoxid_unidadProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarid_unidadProductoUnidad);
		this.jInternalFrameDetalleFormProductoUnidad.jTextFieldvalor_unidadProductoUnidad.setEnabled(this.productounidadConstantesFunciones.activarvalor_unidadProductoUnidad);
		}
	}
	
		
}