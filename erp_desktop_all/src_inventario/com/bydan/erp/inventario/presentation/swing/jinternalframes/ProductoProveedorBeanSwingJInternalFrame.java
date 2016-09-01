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

import com.bydan.erp.inventario.util.ProductoProveedorConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoProveedorParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoProveedorParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoProveedorBean;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoProveedorBeanSwingJInternalFrame extends ProductoProveedorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoProveedorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoProveedor> productoproveedorValidator = new ClassValidator<ProductoProveedor>(ProductoProveedor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoProveedor productoproveedor;	
	public ProductoProveedor productoproveedorAux;
	public ProductoProveedor productoproveedorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoProveedor productoproveedorTotales;
	public Long idProductoProveedorActual;
	public Long iIdNuevoProductoProveedor=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
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
	
	public Boolean isPermisoTodoProductoProveedor;
	public Boolean isPermisoNuevoProductoProveedor;
	public Boolean isPermisoActualizarProductoProveedor;
	public Boolean isPermisoActualizarOriginalProductoProveedor;
	public Boolean isPermisoEliminarProductoProveedor;
	public Boolean isPermisoGuardarCambiosProductoProveedor;
	public Boolean isPermisoConsultaProductoProveedor;
	public Boolean isPermisoBusquedaProductoProveedor;
	public Boolean isPermisoReporteProductoProveedor;
	public Boolean isPermisoPaginacionMedioProductoProveedor;
	public Boolean isPermisoPaginacionAltoProductoProveedor;
	public Boolean isPermisoPaginacionTodoProductoProveedor;
	public Boolean isPermisoCopiarProductoProveedor;
	public Boolean isPermisoVerFormProductoProveedor;
	public Boolean isPermisoDuplicarProductoProveedor;
	public Boolean isPermisoOrdenProductoProveedor;
	
	
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
	
	public ProductoProveedorParameterReturnGeneral productoproveedorReturnGeneral;
	public ProductoProveedorParameterReturnGeneral productoproveedorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoProveedor=false;
	public Boolean esParaAccionDesdeFormularioProductoProveedor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoProveedorSessionBeanAdditional productoproveedorSessionBeanAdditional=null;
	
	public ProductoProveedorSessionBeanAdditional getProductoProveedorSessionBeanAdditional() {
		return this.productoproveedorSessionBeanAdditional;
	}
	
	public void setProductoProveedorSessionBeanAdditional(ProductoProveedorSessionBeanAdditional productoproveedorSessionBeanAdditional) {
		try {
			this.productoproveedorSessionBeanAdditional=productoproveedorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoProveedorBeanSwingJInternalFrameAdditional productoproveedorBeanSwingJInternalFrameAdditional=null;
	//public class ProductoProveedorBeanSwingJInternalFrame
	
	public ProductoProveedorBeanSwingJInternalFrameAdditional getProductoProveedorBeanSwingJInternalFrameAdditional() {
		return this.productoproveedorBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoProveedorBeanSwingJInternalFrameAdditional(ProductoProveedorBeanSwingJInternalFrameAdditional productoproveedorBeanSwingJInternalFrameAdditional) {
		try {
			this.productoproveedorBeanSwingJInternalFrameAdditional=productoproveedorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoProveedorLogic productoproveedorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoProveedor productoproveedorBean;
	public ProductoProveedorConstantesFunciones productoproveedorConstantesFunciones;
	//public ProductoProveedorParameterReturnGeneral productoproveedorReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoProveedor> productoproveedors;	
	//public List<ProductoProveedor> productoproveedorsEliminados;
	//public List<ProductoProveedor> productoproveedorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoProveedor=false;
	public Boolean isVisibilidadCeldaDuplicarProductoProveedor=true;
	public Boolean isVisibilidadCeldaCopiarProductoProveedor=true;
	public Boolean isVisibilidadCeldaVerFormProductoProveedor=true;
	public Boolean isVisibilidadCeldaOrdenProductoProveedor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
	public Boolean isVisibilidadCeldaModificarProductoProveedor=false;
	public Boolean isVisibilidadCeldaActualizarProductoProveedor=false;
	public Boolean isVisibilidadCeldaEliminarProductoProveedor=false;
	public Boolean isVisibilidadCeldaCancelarProductoProveedor=false;
	public Boolean isVisibilidadCeldaGuardarProductoProveedor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoProveedor=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductoProveedor() {
		return this.iIdNuevoProductoProveedor;
	}

	public void setiIdNuevoProductoProveedor(Long iIdNuevoProductoProveedor) {
		this.iIdNuevoProductoProveedor = iIdNuevoProductoProveedor;
	}
	
	public Long getidProductoProveedorActual() {
		return this.idProductoProveedorActual;
	}

	public void setidProductoProveedorActual(Long idProductoProveedorActual) {
		this.idProductoProveedorActual = idProductoProveedorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoProveedor getproductoproveedor() {
		return this.productoproveedor;
	}

	public void setproductoproveedor(ProductoProveedor productoproveedor) {
		this.productoproveedor = productoproveedor;
	}
	
	public ProductoProveedor getproductoproveedorAux() {
		return this.productoproveedorAux;
	}

	public void setproductoproveedorAux(ProductoProveedor productoproveedorAux) {
		this.productoproveedorAux = productoproveedorAux;
	}				
	
	public ProductoProveedor getproductoproveedorAnterior() {
		return this.productoproveedorAnterior;
	}

	public void setproductoproveedorAnterior(ProductoProveedor productoproveedorAnterior) {
		this.productoproveedorAnterior = productoproveedorAnterior;
	}	
	
	public ProductoProveedor getproductoproveedorTotales() {
		return this.productoproveedorTotales;
	}

	public void setproductoproveedorTotales(ProductoProveedor productoproveedorTotales) {
		this.productoproveedorTotales = productoproveedorTotales;
	}	
	
	public ProductoProveedor getproductoproveedorBean() {
		return this.productoproveedorBean;
	}

	public void setproductoproveedorBean(ProductoProveedor productoproveedorBean) {
		this.productoproveedorBean = productoproveedorBean;
	}	
	
	public ProductoProveedorParameterReturnGeneral getproductoproveedorReturnGeneral() {
		return this.productoproveedorReturnGeneral;
	}

	public void setproductoproveedorReturnGeneral(ProductoProveedorParameterReturnGeneral productoproveedorReturnGeneral) {
		this.productoproveedorReturnGeneral = productoproveedorReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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
	
	
	public ProductoProveedorLogic getProductoProveedorLogic()	{		
		return productoproveedorLogic;
	}

	public void setProductoProveedorLogic(ProductoProveedorLogic productoproveedorLogic) {
		this.productoproveedorLogic = productoproveedorLogic;
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
	
	public Boolean getIsEsNuevoProductoProveedor() {
		return isEsNuevoProductoProveedor;
	}

	public void setIsEsNuevoProductoProveedor(Boolean isEsNuevoProductoProveedor) {
		this.isEsNuevoProductoProveedor = isEsNuevoProductoProveedor;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoProveedor() {
		return esParaAccionDesdeFormularioProductoProveedor;
	}
	
	public void setEsParaAccionDesdeFormularioProductoProveedor(Boolean esParaAccionDesdeFormularioProductoProveedor) {
		this.esParaAccionDesdeFormularioProductoProveedor = esParaAccionDesdeFormularioProductoProveedor;
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

			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productoproveedorSessionBean.getlidEmpresaActual());
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

			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productoproveedorSessionBean.getlidSucursalActual());
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

			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productoproveedorSessionBean.getlidBodegaActual());
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

			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productoproveedorSessionBean.getlidProductoActual());
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

			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(productoproveedorSessionBean.getlidClienteActual());
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

					if(this.productoproveedor!=null) {
						this.productoproveedor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoProveedor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoProveedorGenerico)throws Exception
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
				jComboBoxid_empresaProductoProveedorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoProveedorGenerico!=null && jComboBoxid_empresaProductoProveedorGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoProveedorGenerico.setSelectedIndex(0);
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

					if(this.productoproveedor!=null) {
						this.productoproveedor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoProveedor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoProveedorGenerico)throws Exception
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
				jComboBoxid_sucursalProductoProveedorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoProveedorGenerico!=null && jComboBoxid_sucursalProductoProveedorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoProveedorGenerico.setSelectedIndex(0);
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

					if(this.productoproveedor!=null) {
						this.productoproveedor.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoProveedor.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoProveedor!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoProveedor!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoProveedor.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoProveedorGenerico)throws Exception
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
				jComboBoxid_bodegaProductoProveedorGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoProveedorGenerico!=null && jComboBoxid_bodegaProductoProveedorGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoProveedorGenerico.setSelectedIndex(0);
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

					if(this.productoproveedor!=null) {
						this.productoproveedor.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoProveedor.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoProveedor!=null) {
						jComboBoxid_productoFK_IdProductoProductoProveedor.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoProveedor!=null) {
							//jComboBoxid_productoFK_IdProductoProductoProveedor.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoProveedor.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoProveedor.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoProveedorGenerico)throws Exception
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
				jComboBoxid_productoProductoProveedorGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoProveedorGenerico!=null && jComboBoxid_productoProductoProveedorGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoProveedorGenerico.setSelectedIndex(0);
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

					if(this.productoproveedor!=null) {
						this.productoproveedor.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteProductoProveedor.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
						if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteProductoProveedor!=null) {
						jComboBoxid_clienteFK_IdClienteProductoProveedor.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteProductoProveedor!=null) {
							//jComboBoxid_clienteFK_IdClienteProductoProveedor.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteProductoProveedor.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteProductoProveedor.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteProductoProveedorGenerico)throws Exception
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
				jComboBoxid_clienteProductoProveedorGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteProductoProveedorGenerico!=null && jComboBoxid_clienteProductoProveedorGenerico.getItemCount()>0) {
					jComboBoxid_clienteProductoProveedorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoProveedor productoproveedor,JComboBox jComboBoxid_empresaProductoProveedorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoProveedorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoProveedorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productoproveedor.setid_empresa(empresaAux.getId());
				productoproveedor.setempresa_descripcion(ProductoProveedorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productoproveedor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoProveedor productoproveedor,JComboBox jComboBoxid_sucursalProductoProveedorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoProveedorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoProveedorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productoproveedor.setid_sucursal(sucursalAux.getId());
				productoproveedor.setsucursal_descripcion(ProductoProveedorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productoproveedor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoProveedor productoproveedor,JComboBox jComboBoxid_bodegaProductoProveedorGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoProveedorGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoProveedorGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productoproveedor.setid_bodega(bodegaAux.getId());
				productoproveedor.setbodega_descripcion(ProductoProveedorConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productoproveedor.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoProveedor productoproveedor,JComboBox jComboBoxid_productoProductoProveedorGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoProveedorGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoProveedorGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productoproveedor.setid_producto(productoAux.getId());
				productoproveedor.setproducto_descripcion(ProductoProveedorConstantesFunciones.getProductoDescripcion(productoAux));
				productoproveedor.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ProductoProveedor productoproveedor,JComboBox jComboBoxid_clienteProductoProveedorGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteProductoProveedorGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteProductoProveedorGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				productoproveedor.setid_cliente(clienteAux.getId());
				productoproveedor.setcliente_descripcion(ProductoProveedorConstantesFunciones.getClienteDescripcion(clienteAux));
				productoproveedor.setCliente(clienteAux);			}
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

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
					}

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
					}

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
					}

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoProveedor.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoProveedor.addItem(bodega);
							}
						}

						if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
					}

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoProveedor.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoProveedor.addItem(producto);
							}
						}

						if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProveedor!=null) { 
					}

					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteProductoProveedor.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteProductoProveedor.addItem(cliente);
							}
						}

						if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoProveedor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoProveedor.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoProveedor.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteProductoProveedor.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteProductoProveedor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoProveedor() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoProveedorConstantesFunciones.refrescarForeignKeysDescripcionesProductoProveedor(this.productoproveedorLogic.getProductoProveedors());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoProveedorConstantesFunciones.refrescarForeignKeysDescripcionesProductoProveedor(this.productoproveedors);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoproveedorLogic.setProductoProveedors(this.productoproveedors);
			productoproveedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoProveedorParameterReturnGeneral getProductoProveedorParameterGeneral() {
		return this.productoproveedorParameterGeneral;
	}
	
	public void setProductoProveedorParameterGeneral(ProductoProveedorParameterReturnGeneral productoproveedorParameterGeneral) {
		this.productoproveedorParameterGeneral = productoproveedorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoProveedor() {
		return isPermisoTodoProductoProveedor;
	}

	public void setIsPermisoTodoProductoProveedor(Boolean isPermisoTodoProductoProveedor) {
		this.isPermisoTodoProductoProveedor = isPermisoTodoProductoProveedor;
	}

	public Boolean getIsPermisoNuevoProductoProveedor() {
		return isPermisoNuevoProductoProveedor;
	}

	public void setIsPermisoNuevoProductoProveedor(Boolean isPermisoNuevoProductoProveedor) {
		this.isPermisoNuevoProductoProveedor = isPermisoNuevoProductoProveedor;
	}

	public Boolean getIsPermisoActualizarProductoProveedor() {
		return isPermisoActualizarProductoProveedor;
	}

	public void setIsPermisoActualizarProductoProveedor(Boolean isPermisoActualizarProductoProveedor) {
		this.isPermisoActualizarProductoProveedor = isPermisoActualizarProductoProveedor;
	}

	public Boolean getIsPermisoEliminarProductoProveedor() {
		return isPermisoEliminarProductoProveedor;
	}

	public void setIsPermisoEliminarProductoProveedor(Boolean isPermisoEliminarProductoProveedor) {
		this.isPermisoEliminarProductoProveedor = isPermisoEliminarProductoProveedor;
	}

	public Boolean getIsPermisoGuardarCambiosProductoProveedor() {
		return isPermisoGuardarCambiosProductoProveedor;
	}

	public void setIsPermisoGuardarCambiosProductoProveedor(Boolean isPermisoGuardarCambiosProductoProveedor) {
		this.isPermisoGuardarCambiosProductoProveedor = isPermisoGuardarCambiosProductoProveedor;
	}
	
	public Boolean getIsPermisoConsultaProductoProveedor() {
		return isPermisoConsultaProductoProveedor;
	}

	public void setIsPermisoConsultaProductoProveedor(Boolean isPermisoConsultaProductoProveedor) {
		this.isPermisoConsultaProductoProveedor = isPermisoConsultaProductoProveedor;
	}

	public Boolean getIsPermisoBusquedaProductoProveedor() {
		return isPermisoBusquedaProductoProveedor;
	}

	public void setIsPermisoBusquedaProductoProveedor(Boolean isPermisoBusquedaProductoProveedor) {
		this.isPermisoBusquedaProductoProveedor = isPermisoBusquedaProductoProveedor;
	}

	public Boolean getIsPermisoReporteProductoProveedor() {
		return isPermisoReporteProductoProveedor;
	}

	public void setIsPermisoReporteProductoProveedor(Boolean isPermisoReporteProductoProveedor) {
		this.isPermisoReporteProductoProveedor = isPermisoReporteProductoProveedor;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoProveedor() {
		return isPermisoPaginacionMedioProductoProveedor;
	}

	public void setIsPermisoPaginacionMedioProductoProveedor(Boolean isPermisoPaginacionMedioProductoProveedor) {
		this.isPermisoPaginacionMedioProductoProveedor = isPermisoPaginacionMedioProductoProveedor;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoProveedor() {
		return isPermisoPaginacionTodoProductoProveedor;
	}

	public void setIsPermisoPaginacionTodoProductoProveedor(Boolean isPermisoPaginacionTodoProductoProveedor) {
		this.isPermisoPaginacionTodoProductoProveedor = isPermisoPaginacionTodoProductoProveedor;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoProveedor() {
		return isPermisoPaginacionAltoProductoProveedor;
	}

	public void setIsPermisoPaginacionAltoProductoProveedor(Boolean isPermisoPaginacionAltoProductoProveedor) {
		this.isPermisoPaginacionAltoProductoProveedor = isPermisoPaginacionAltoProductoProveedor;
	}
	
	public Boolean getIsPermisoCopiarProductoProveedor() {
		return isPermisoCopiarProductoProveedor;
	}

	public void setIsPermisoCopiarProductoProveedor(Boolean isPermisoCopiarProductoProveedor) {
		this.isPermisoCopiarProductoProveedor = isPermisoCopiarProductoProveedor;
	}
	
	public Boolean getIsPermisoVerFormProductoProveedor() {
		return isPermisoVerFormProductoProveedor;
	}

	public void setIsPermisoVerFormProductoProveedor(Boolean isPermisoVerFormProductoProveedor) {
		this.isPermisoVerFormProductoProveedor = isPermisoVerFormProductoProveedor;
	}
	
	public Boolean getIsPermisoDuplicarProductoProveedor() {
		return isPermisoDuplicarProductoProveedor;
	}

	public void setIsPermisoDuplicarProductoProveedor(Boolean isPermisoDuplicarProductoProveedor) {
		this.isPermisoDuplicarProductoProveedor = isPermisoDuplicarProductoProveedor;
	}
	
	public Boolean getIsPermisoOrdenProductoProveedor() {
		return isPermisoOrdenProductoProveedor;
	}

	public void setIsPermisoOrdenProductoProveedor(Boolean isPermisoOrdenProductoProveedor) {
		this.isPermisoOrdenProductoProveedor = isPermisoOrdenProductoProveedor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoProveedor() {
		return isVisibilidadCeldaNuevoProductoProveedor;
	}

	public void setIsVisibilidadCeldaNuevoProductoProveedor(Boolean isVisibilidadCeldaNuevoProductoProveedor) {
		this.isVisibilidadCeldaNuevoProductoProveedor = isVisibilidadCeldaNuevoProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoProveedor() {
		return isVisibilidadCeldaDuplicarProductoProveedor;
	}

	public void setIsVisibilidadCeldaDuplicarProductoProveedor(Boolean isVisibilidadCeldaDuplicarProductoProveedor) {
		this.isVisibilidadCeldaDuplicarProductoProveedor = isVisibilidadCeldaDuplicarProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoProveedor() {
		return isVisibilidadCeldaCopiarProductoProveedor;
	}

	public void setIsVisibilidadCeldaCopiarProductoProveedor(Boolean isVisibilidadCeldaCopiarProductoProveedor) {
		this.isVisibilidadCeldaCopiarProductoProveedor = isVisibilidadCeldaCopiarProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoProveedor() {
		return isVisibilidadCeldaVerFormProductoProveedor;
	}

	public void setIsVisibilidadCeldaVerFormProductoProveedor(Boolean isVisibilidadCeldaVerFormProductoProveedor) {
		this.isVisibilidadCeldaVerFormProductoProveedor = isVisibilidadCeldaVerFormProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoProveedor() {
		return isVisibilidadCeldaOrdenProductoProveedor;
	}

	public void setIsVisibilidadCeldaOrdenProductoProveedor(Boolean isVisibilidadCeldaOrdenProductoProveedor) {
		this.isVisibilidadCeldaOrdenProductoProveedor = isVisibilidadCeldaOrdenProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoProveedor() {
		return isVisibilidadCeldaNuevoRelacionesProductoProveedor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoProveedor(Boolean isVisibilidadCeldaNuevoRelacionesProductoProveedor) {
		this.isVisibilidadCeldaNuevoRelacionesProductoProveedor = isVisibilidadCeldaNuevoRelacionesProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoProveedor() {
		return isVisibilidadCeldaModificarProductoProveedor;
	}

	public void setIsVisibilidadCeldaModificarProductoProveedor(Boolean isVisibilidadCeldaModificarProductoProveedor) {
		this.isVisibilidadCeldaModificarProductoProveedor = isVisibilidadCeldaModificarProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoProveedor() {
		return isVisibilidadCeldaActualizarProductoProveedor;
	}

	public void setIsVisibilidadCeldaActualizarProductoProveedor(Boolean isVisibilidadCeldaActualizarProductoProveedor) {
		this.isVisibilidadCeldaActualizarProductoProveedor = isVisibilidadCeldaActualizarProductoProveedor;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoProveedor() {
		return isVisibilidadCeldaEliminarProductoProveedor;
	}

	public void setIsVisibilidadCeldaEliminarProductoProveedor(Boolean isVisibilidadCeldaEliminarProductoProveedor) {
		this.isVisibilidadCeldaEliminarProductoProveedor = isVisibilidadCeldaEliminarProductoProveedor;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoProveedor() {
		return isVisibilidadCeldaCancelarProductoProveedor;
	}

	public void setIsVisibilidadCeldaCancelarProductoProveedor(Boolean isVisibilidadCeldaCancelarProductoProveedor) {
		this.isVisibilidadCeldaCancelarProductoProveedor = isVisibilidadCeldaCancelarProductoProveedor;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoProveedor() {
		return isVisibilidadCeldaGuardarProductoProveedor;
	}

	public void setIsVisibilidadCeldaGuardarProductoProveedor(Boolean isVisibilidadCeldaGuardarProductoProveedor) {
		this.isVisibilidadCeldaGuardarProductoProveedor = isVisibilidadCeldaGuardarProductoProveedor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoProveedor() {
		return isVisibilidadCeldaGuardarCambiosProductoProveedor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoProveedor(Boolean isVisibilidadCeldaGuardarCambiosProductoProveedor) {
		this.isVisibilidadCeldaGuardarCambiosProductoProveedor = isVisibilidadCeldaGuardarCambiosProductoProveedor;
	}
		
	public ProductoProveedorSessionBean getproductoproveedorSessionBean() {
		return this.productoproveedorSessionBean;
	}
	
	public void setproductoproveedorSessionBean(ProductoProveedorSessionBean productoproveedorSessionBean) {
		this.productoproveedorSessionBean=productoproveedorSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(ProductoProveedor productoproveedor)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productoproveedor,null);
				this.setActualParaGuardarSucursalForeignKey(productoproveedor,null);
				this.setActualParaGuardarBodegaForeignKey(productoproveedor,null);
				this.setActualParaGuardarProductoForeignKey(productoproveedor,null);
				this.setActualParaGuardarClienteForeignKey(productoproveedor,null);
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
	
	public void bugActualizarReferenciaActual(ProductoProveedor productoproveedor,ProductoProveedor productoproveedorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoProveedor(productoproveedor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoproveedorAux.setId(productoproveedor.getId());
		productoproveedorAux.setVersionRow(productoproveedor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoProveedor();
		
			int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoproveedorValidator.getInvalidValues(this.productoproveedor);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoproveedorLogic.setDatosCliente(datosCliente);
			productoproveedorLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoproveedorAux=new  ProductoProveedor();
				
				productoproveedorAux.setIsNew(true);
				productoproveedorAux.setIsChanged(true);
				
				productoproveedorAux.setProductoProveedorOriginal(this.productoproveedor);
				
				productoproveedorAux.setId(this.productoproveedor.getId());	
				productoproveedorAux.setVersionRow(this.productoproveedor.getVersionRow());	
				productoproveedorAux.setid_empresa(this.productoproveedor.getid_empresa());	
				productoproveedorAux.setid_sucursal(this.productoproveedor.getid_sucursal());	
				productoproveedorAux.setid_bodega(this.productoproveedor.getid_bodega());	
				productoproveedorAux.setid_producto(this.productoproveedor.getid_producto());	
				productoproveedorAux.setid_cliente(this.productoproveedor.getid_cliente());	
				productoproveedorAux.setprecio_ultimo(this.productoproveedor.getprecio_ultimo());	
				productoproveedorAux.setprecio_acuerdo(this.productoproveedor.getprecio_acuerdo());	
				productoproveedorAux.setdia_entra(this.productoproveedor.getdia_entra());	
				productoproveedorAux.setobservacion(this.productoproveedor.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoproveedorAux,productoproveedorLogic.getProductoProveedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproveedorAux,productoproveedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.saveProductoProveedors();//WithConnection
						//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoproveedor,productoproveedorAux);
					
					this.refrescarForeignKeysDescripcionesProductoProveedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoproveedorLogic.saveProductoProveedorRelaciones(productoproveedorAux);//WithConnection
								//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoproveedor,productoproveedorAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoproveedorAux,productoproveedorLogic.getProductoProveedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoproveedorAux,productoproveedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoproveedor,productoproveedorAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoproveedorAux=new  ProductoProveedor();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoproveedorSessionBean.getEsGuardarRelacionado() 
					|| (this.productoproveedorSessionBean.getEsGuardarRelacionado() && this.productoproveedor.getId()>=0)) {
						
					productoproveedorAux.setIsNew(false);
				}
				
				productoproveedorAux.setIsDeleted(false);
			
				productoproveedorAux.setId(this.productoproveedor.getId());	
				productoproveedorAux.setVersionRow(this.productoproveedor.getVersionRow());	
				productoproveedorAux.setid_empresa(this.productoproveedor.getid_empresa());	
				productoproveedorAux.setid_sucursal(this.productoproveedor.getid_sucursal());	
				productoproveedorAux.setid_bodega(this.productoproveedor.getid_bodega());	
				productoproveedorAux.setid_producto(this.productoproveedor.getid_producto());	
				productoproveedorAux.setid_cliente(this.productoproveedor.getid_cliente());	
				productoproveedorAux.setprecio_ultimo(this.productoproveedor.getprecio_ultimo());	
				productoproveedorAux.setprecio_acuerdo(this.productoproveedor.getprecio_acuerdo());	
				productoproveedorAux.setdia_entra(this.productoproveedor.getdia_entra());	
				productoproveedorAux.setobservacion(this.productoproveedor.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoproveedorAux,productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproveedorAux,productoproveedors);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.saveProductoProveedors();//WithConnection
						//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoproveedor,productoproveedorAux);
					
					this.refrescarForeignKeysDescripcionesProductoProveedor();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoproveedorLogic.saveProductoProveedorRelaciones(productoproveedorAux);//WithConnection
								//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoproveedor,productoproveedorAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoproveedorAux,productoproveedorLogic.getProductoProveedors());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoproveedorAux,productoproveedors);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoproveedor,productoproveedorAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoproveedorAux=new  ProductoProveedor();
				
				productoproveedorAux.setIsNew(false);
				productoproveedorAux.setIsChanged(false);
				
				productoproveedorAux.setIsDeleted(true);
				
				productoproveedorAux.setId(this.productoproveedor.getId());	
				productoproveedorAux.setVersionRow(this.productoproveedor.getVersionRow());	
				productoproveedorAux.setid_empresa(this.productoproveedor.getid_empresa());	
				productoproveedorAux.setid_sucursal(this.productoproveedor.getid_sucursal());	
				productoproveedorAux.setid_bodega(this.productoproveedor.getid_bodega());	
				productoproveedorAux.setid_producto(this.productoproveedor.getid_producto());	
				productoproveedorAux.setid_cliente(this.productoproveedor.getid_cliente());	
				productoproveedorAux.setprecio_ultimo(this.productoproveedor.getprecio_ultimo());	
				productoproveedorAux.setprecio_acuerdo(this.productoproveedor.getprecio_acuerdo());	
				productoproveedorAux.setdia_entra(this.productoproveedor.getdia_entra());	
				productoproveedorAux.setobservacion(this.productoproveedor.getobservacion());	
				
				if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoproveedorAux.getId()>=0) {	
						this.productoproveedorsEliminados.add(productoproveedorAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoproveedorAux,productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproveedorAux,productoproveedors);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.saveProductoProveedors();//WithConnection
						//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoproveedorLogic.saveProductoProveedorRelaciones(productoproveedorAux);//WithConnection
								//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
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
							if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoproveedorAux,productoproveedorLogic.getProductoProveedors());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoproveedorAux,productoproveedors);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getProductoProveedors().addAll(this.productoproveedorsEliminados);
					
					productoproveedorLogic.saveProductoProveedors();//WithConnection
					//productoproveedorLogic.getSetVersionRowProductoProveedors();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoProveedor();
				
				this.productoproveedorsEliminados= new ArrayList<ProductoProveedor>();		
			}
			
			if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Proveedor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoproveedor=productoproveedorAux;
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
      		//this.finishProcessProductoProveedor();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoProveedor productoproveedorLocal) throws Exception {
		
		if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoProveedor productoproveedorLocal) throws Exception {	
		if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productoproveedorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productoproveedorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productoproveedorLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productoproveedorLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				productoproveedorLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoProveedorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoproveedorValidator.getInvalidValues(this.productoproveedor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoProveedor productoproveedor,List<ProductoProveedor> productoproveedors) throws Exception {
		try	{		
			ProductoProveedorConstantesFunciones.actualizarLista(productoproveedor,productoproveedors,this.productoproveedorSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoProveedor productoproveedor,List<ProductoProveedor> productoproveedors) throws Exception {
		try	{			
			ProductoProveedorConstantesFunciones.actualizarSelectedLista(productoproveedor,productoproveedors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoProveedor> productoproveedorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoproveedorsLocal=this.productoproveedorLogic.getProductoProveedors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoproveedorsLocal=this.productoproveedors;
			}
			//ARCHITECTURE
		
			for(ProductoProveedor productoproveedorLocal:productoproveedorsLocal) {
				if(this.permiteMantenimiento(productoproveedorLocal) && productoproveedorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoProveedorConstantesFunciones.getProductoProveedorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_empresaProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_sucursalProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_bodegaProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_productoProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_clienteProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.PRECIOULTIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelprecio_ultimoProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.PRECIOACUERDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelprecio_acuerdoProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.DIAENTRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabeldia_entraProductoProveedor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProveedorConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelobservacionProductoProveedor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_empresaProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_sucursalProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_bodegaProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_productoProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelid_clienteProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelprecio_ultimoProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelprecio_acuerdoProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabeldia_entraProductoProveedor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProveedor.jLabelobservacionProductoProveedor,"");
		
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
		this.iIdNuevoProductoProveedor--;	
		
		
		this.productoproveedorAux=new ProductoProveedor();
		
		this.productoproveedorAux.setId(this.iIdNuevoProductoProveedor);
		this.productoproveedorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoproveedorLogic.getProductoProveedors().add(this.productoproveedorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoproveedors.add(this.productoproveedorAux);
		}
		//ARCHITECTURE
		
		this.productoproveedor=this.productoproveedorAux;
		
		if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoProveedor(this.productoproveedor);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProveedor(this.productoproveedor);
		}
				
		//this.setDefaultControlesProductoProveedor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoProveedor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoProveedor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProveedor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProveedor(this.productoproveedorBean,this.productoproveedor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoProveedorConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
			classes=ProductoProveedorConstantesFunciones.getClassesRelationshipsOfProductoProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoproveedorReturnGeneral=productoproveedorLogic.procesarEventosProductoProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoproveedorLogic.getProductoProveedors(),this.productoproveedor,this.productoproveedorParameterGeneral,this.isEsNuevoProductoProveedor,classes);//this.productoproveedorLogic.getProductoProveedor()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoProveedor(this.productoproveedorReturnGeneral,this.productoproveedorBean,false);
		
		if(this.productoproveedorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor());
		}
		
		if(this.productoproveedorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor(),classes);//this.productoproveedorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoProveedor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoProveedor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.RecargarFormProductoProveedor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoProveedor(false);
						
			if(productoproveedorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProveedor();
			}
			
			this.actualizarVisualTableDatosProductoProveedor();
			
			this.jTableDatosProductoProveedor.setRowSelectionInterval(this.getIndiceNuevoProductoProveedor(), this.getIndiceNuevoProductoProveedor());
			
			this.seleccionarFilaTablaProductoProveedorActual();
						
			this.actualizarEstadoCeldasBotonesProductoProveedor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoProveedor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarprecio_ultimoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarprecio_acuerdoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activardia_entraProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarobservacionProductoProveedor);	
		//
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarid_empresaProductoProveedor);//
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarid_sucursalProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarid_bodegaProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarid_productoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setEnabled(isHabilitar && this.productoproveedorConstantesFunciones.activarid_clienteProductoProveedor);
	};
	
	public void setDefaultControlesProductoProveedor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoProveedor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoproveedorSessionBean.setConGuardarRelaciones(true);			
			this.productoproveedorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.setVisible(true);
			
					
		} else {
			//this.productoproveedorSessionBean.setConGuardarRelaciones(false);			
			this.productoproveedorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoProveedor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
				if(productoproveedorAux.getId().equals(this.iIdNuevoProductoProveedor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProveedor productoproveedorAux:this.productoproveedors) {
				if(productoproveedorAux.getId().equals(this.iIdNuevoProductoProveedor)) {
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
	
	public int getIndiceActualProductoProveedor(ProductoProveedor productoproveedor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
				if(productoproveedorAux.getId().equals(productoproveedor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProveedor productoproveedorAux:this.productoproveedors) {
				if(productoproveedorAux.getId().equals(productoproveedor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoProveedor(ProductoProveedor productoproveedorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
				if(productoproveedorAux.getProductoProveedorOriginal().getId().equals(productoproveedorOriginal.getId())) {
					existe=true;
					productoproveedorOriginal.setId(productoproveedorAux.getId());
					productoproveedorOriginal.setVersionRow(productoproveedorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProveedor productoproveedorAux:this.productoproveedors) {
				if(productoproveedorAux.getProductoProveedorOriginal().getId().equals(productoproveedorOriginal.getId())) {
					existe=true;
					productoproveedorOriginal.setId(productoproveedorAux.getId());
					productoproveedorOriginal.setVersionRow(productoproveedorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoProveedor(Boolean esParaCancelar) throws Exception {
		productoproveedorsAux=new ArrayList<ProductoProveedor>();
		productoproveedorAux=new ProductoProveedor();
		
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
					if(productoproveedorAux.getId()<0) {
						productoproveedorsAux.add(productoproveedorAux);
					}		
				}
				this.iIdNuevoProductoProveedor=0L;
				this.productoproveedorLogic.getProductoProveedors().removeAll(productoproveedorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProveedor productoproveedorAux:this.productoproveedors) {
					if(productoproveedorAux.getId()<0) {
						productoproveedorsAux.add(productoproveedorAux);
					}		
				}
				this.iIdNuevoProductoProveedor=0L;
				this.productoproveedors.removeAll(productoproveedorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoProveedor 
					&& this.productoproveedorLogic.getProductoProveedors().size()>0
					) {
					productoproveedorAux=this.productoproveedorLogic.getProductoProveedors().get(this.productoproveedorLogic.getProductoProveedors().size() - 1);
				
					if(productoproveedorAux.getId()<0) {
						this.productoproveedorLogic.getProductoProveedors().remove(productoproveedorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoProveedor && this.productoproveedors.size()>0) {
					productoproveedorAux=this.productoproveedors.get(this.productoproveedors.size() - 1);
				
					if(productoproveedorAux.getId()<0) {
						this.productoproveedors.remove(productoproveedorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoProveedor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoproveedor.getId()<0) {
				this.productoproveedorLogic.getProductoProveedors().remove(this.productoproveedor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoproveedor.getId()<0) {
				this.productoproveedors.remove(this.productoproveedor);
			}
		}			
	}
	
	public void setEstadosInicialesProductoProveedor(List<ProductoProveedor> productoproveedorsAux) throws Exception {
		ProductoProveedorConstantesFunciones.setEstadosInicialesProductoProveedor(productoproveedorsAux);
	}
	
	public void setEstadosInicialesProductoProveedor(ProductoProveedor productoproveedorAux) throws Exception {
		ProductoProveedorConstantesFunciones.setEstadosInicialesProductoProveedor(productoproveedorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoProveedorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoProveedorActual()) {
				if(!this.isEsNuevoProductoProveedor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoProveedor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoProveedorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Proveedor ?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoProveedor productoproveedor) throws Exception {
		ProductoProveedorConstantesFunciones.seleccionarAsignar(this.productoproveedor,productoproveedor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoProveedor=this.isPermisoActualizarOriginalProductoProveedor;
			
			
			this.seleccionarAsignar(productoproveedor);
			
			

			idProductoActual=productoproveedor.getid_producto();
			this.seleccionarProductoActual();

			idClienteActual=productoproveedor.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProveedorConstantesFunciones.quitarEspaciosProductoProveedor(this.productoproveedor,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoproveedorSessionBean.setsFuncionBusquedaRapida(this.productoproveedorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoProveedor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoProveedor(esParaCancelar);				
				this.cancelarNuevoProductoProveedor(esParaCancelar);								
			}
			
			this.productoproveedor=new ProductoProveedor();
			
			this.inicializarProductoProveedor();
			
			this.actualizarEstadoCeldasBotonesProductoProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoProveedor() throws Exception {
		try {
			ProductoProveedorConstantesFunciones.inicializarProductoProveedor(this.productoproveedor);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoproveedorLogic.getProductoProveedors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoProveedors(String sAccionBusqueda,List<ProductoProveedor> productoproveedorsParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoProveedor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoProveedorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoProveedorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoProveedor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Proveedors");		
		parameters.put("busquedapor", ProductoProveedorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoProveedor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoProveedorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoProveedor=new JRBeanArrayDataSource(ProductoProveedorJInternalFrame.TraerProductoProveedorBeans(productoproveedorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoProveedor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoProveedorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoProveedorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoProveedorBean.TraerProductoProveedorBeans(productoproveedorsParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoProveedors(sAccionBusqueda,sTipoArchivoReporte,productoproveedorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoProveedors(sAccionBusqueda,sTipoArchivoReporte,productoproveedorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoProveedorActionPerformed(null);
					//this.generarExcelReporteProductoProveedors(sAccionBusqueda,sTipoArchivoReporte,productoproveedorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoProveedors(sAccionBusqueda,sTipoArchivoReporte,productoproveedorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoProveedors(sAccionBusqueda,sTipoArchivoReporte,productoproveedorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoProveedors(sAccionBusqueda,sTipoArchivoReporte,productoproveedorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProveedor> productoproveedorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProveedors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProveedor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoProveedor productoproveedor : productoproveedorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoProveedorConstantesFunciones.generarExcelReporteDataProductoProveedor("NORMAL",row,workbook,productoproveedor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoProveedor(String sTipo,Row row,Workbook workbook) {
		
		ProductoProveedorConstantesFunciones.generarExcelReporteHeaderProductoProveedor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProveedor> productoproveedorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProveedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoProveedor productoproveedor : productoproveedorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoProveedorConstantesFunciones.getProductoProveedorDescripcion(productoproveedor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getprecio_ultimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getprecio_acuerdo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getdia_entra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoproveedor.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoProveedors(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProveedor> productoproveedorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoProveedor> productoproveedorsRespaldo=null;
		
		classes=ProductoProveedorConstantesFunciones.getClassesRelationshipsOfProductoProveedor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoproveedorLogic.setDatosCliente(this.datosCliente);
		this.productoproveedorLogic.setDatosDeep(this.datosDeep);
		this.productoproveedorLogic.setIsConDeep(true);
		
		productoproveedorsRespaldo=this.productoproveedorLogic.getProductoProveedors();
		
		this.productoproveedorLogic.setProductoProveedors(productoproveedorsParaReportes);	
		this.productoproveedorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoproveedorsParaReportes=this.productoproveedorLogic.getProductoProveedors();
		this.productoproveedorLogic.setProductoProveedors(productoproveedorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProveedors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProveedor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoProveedor productoproveedor : productoproveedorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoProveedor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoProveedorConstantesFunciones.generarExcelReporteDataProductoProveedor("NORMAL",row,workbook,productoproveedor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoProveedorConstantesFunciones.getProductoProveedorDescripcion(productoproveedor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProveedor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoProveedor() throws Exception {		
		this.startProcessProductoProveedor(true);
	}
	
	public void startProcessProductoProveedor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoProveedor ,this.jPanelParametrosReportesProductoProveedor, this.jScrollPanelDatosProductoProveedor,this.jPanelPaginacionProductoProveedor, this.jScrollPanelDatosEdicionProductoProveedor, this.jPanelAccionesProductoProveedor,this.jPanelAccionesFormularioProductoProveedor,this.jmenuBarProductoProveedor,this.jmenuBarDetalleProductoProveedor,this.jTtoolBarProductoProveedor,this.jTtoolBarDetalleProductoProveedor);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProveedor=this.jTabbedPaneBusquedasProductoProveedor; 
		
		final JPanel jPanelParametrosReportesProductoProveedor=this.jPanelParametrosReportesProductoProveedor;
		//final JScrollPane jScrollPanelDatosProductoProveedor=this.jScrollPanelDatosProductoProveedor;
		final JTable jTableDatosProductoProveedor=this.jTableDatosProductoProveedor;		
		final JPanel jPanelPaginacionProductoProveedor=this.jPanelPaginacionProductoProveedor;
		//final JScrollPane jScrollPanelDatosEdicionProductoProveedor=this.jScrollPanelDatosEdicionProductoProveedor;
		final JPanel jPanelAccionesProductoProveedor=this.jPanelAccionesProductoProveedor;
		
		JPanel jPanelCamposAuxiliarProductoProveedor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoProveedor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			jPanelCamposAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jPanelCamposProductoProveedor;
			jPanelAccionesFormularioAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jPanelAccionesFormularioProductoProveedor;
		}
		
		final JPanel jPanelCamposProductoProveedor=jPanelCamposAuxiliarProductoProveedor;
		final JPanel jPanelAccionesFormularioProductoProveedor=jPanelAccionesFormularioAuxiliarProductoProveedor;
		
		
		final JMenuBar jmenuBarProductoProveedor=this.jmenuBarProductoProveedor;
		final JToolBar jTtoolBarProductoProveedor=this.jTtoolBarProductoProveedor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoProveedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProveedor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			jmenuBarDetalleAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jmenuBarDetalleProductoProveedor;
			jTtoolBarDetalleAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jTtoolBarDetalleProductoProveedor;
		}
		
		final JMenuBar jmenuBarDetalleProductoProveedor=jmenuBarDetalleAuxiliarProductoProveedor;
		final JToolBar jTtoolBarDetalleProductoProveedor=jTtoolBarDetalleAuxiliarProductoProveedor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProveedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProveedor;
			processRunnable.jTableDatos=jTableDatosProductoProveedor;
			processRunnable.jPanelCampos=jPanelCamposProductoProveedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProveedor;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProveedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProveedor;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProveedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProveedor;
			processRunnable.jTtoolBar=jTtoolBarProductoProveedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProveedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProveedor ,jPanelParametrosReportesProductoProveedor,jTableDatosProductoProveedor, /*jScrollPanelDatosProductoProveedor,*/jPanelCamposProductoProveedor,jPanelPaginacionProductoProveedor, /*jScrollPanelDatosEdicionProductoProveedor,*/ jPanelAccionesProductoProveedor,jPanelAccionesFormularioProductoProveedor,jmenuBarProductoProveedor,jmenuBarDetalleProductoProveedor,jTtoolBarProductoProveedor,jTtoolBarDetalleProductoProveedor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProveedor ,jPanelParametrosReportesProductoProveedor, jScrollPanelDatosProductoProveedor,jPanelPaginacionProductoProveedor, jScrollPanelDatosEdicionProductoProveedor, jPanelAccionesProductoProveedor,jPanelAccionesFormularioProductoProveedor,jmenuBarProductoProveedor,jmenuBarDetalleProductoProveedor,jTtoolBarProductoProveedor,jTtoolBarDetalleProductoProveedor);
						
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
	
	public void finishProcessProductoProveedor() {// throws Exception 
		this.finishProcessProductoProveedor(true);
	}
	
	public void finishProcessProductoProveedor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoProveedor ,this.jPanelParametrosReportesProductoProveedor, this.jScrollPanelDatosProductoProveedor,this.jPanelPaginacionProductoProveedor, this.jScrollPanelDatosEdicionProductoProveedor, this.jPanelAccionesProductoProveedor,this.jPanelAccionesFormularioProductoProveedor,this.jmenuBarProductoProveedor,this.jmenuBarDetalleProductoProveedor,this.jTtoolBarProductoProveedor,this.jTtoolBarDetalleProductoProveedor);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProveedor=this.jTabbedPaneBusquedasProductoProveedor; 
		
		final JPanel jPanelParametrosReportesProductoProveedor=this.jPanelParametrosReportesProductoProveedor;
		//final JScrollPane jScrollPanelDatosProductoProveedor=this.jScrollPanelDatosProductoProveedor;
		final JTable jTableDatosProductoProveedor=this.jTableDatosProductoProveedor;		
		final JPanel jPanelPaginacionProductoProveedor=this.jPanelPaginacionProductoProveedor;
		//final JScrollPane jScrollPanelDatosEdicionProductoProveedor=this.jScrollPanelDatosEdicionProductoProveedor;
		final JPanel jPanelAccionesProductoProveedor=this.jPanelAccionesProductoProveedor;
		
		JPanel jPanelCamposAuxiliarProductoProveedor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoProveedor=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			jPanelCamposAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jPanelCamposProductoProveedor;
			jPanelAccionesFormularioAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jPanelAccionesFormularioProductoProveedor;
		}
		
		final JPanel jPanelCamposProductoProveedor=jPanelCamposAuxiliarProductoProveedor;
		final JPanel jPanelAccionesFormularioProductoProveedor=jPanelAccionesFormularioAuxiliarProductoProveedor;
		
		
		final JMenuBar jmenuBarProductoProveedor=this.jmenuBarProductoProveedor;		
		final JToolBar jTtoolBarProductoProveedor=this.jTtoolBarProductoProveedor;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoProveedor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProveedor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			jmenuBarDetalleAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jmenuBarDetalleProductoProveedor;
			jTtoolBarDetalleAuxiliarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jTtoolBarDetalleProductoProveedor;		
		}
		
		final JMenuBar jmenuBarDetalleProductoProveedor=jmenuBarDetalleAuxiliarProductoProveedor;
		final JToolBar jTtoolBarDetalleProductoProveedor=jTtoolBarDetalleAuxiliarProductoProveedor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProveedor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProveedor;
			processRunnable.jTableDatos=jTableDatosProductoProveedor;
			processRunnable.jPanelCampos=jPanelCamposProductoProveedor;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProveedor;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProveedor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProveedor;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProveedor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProveedor;
			processRunnable.jTtoolBar=jTtoolBarProductoProveedor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProveedor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoProveedor ,jPanelParametrosReportesProductoProveedor, jTableDatosProductoProveedor,/*jScrollPanelDatosProductoProveedor,*/jPanelCamposProductoProveedor,jPanelPaginacionProductoProveedor, /*jScrollPanelDatosEdicionProductoProveedor,*/ jPanelAccionesProductoProveedor,jPanelAccionesFormularioProductoProveedor,jmenuBarProductoProveedor,jmenuBarDetalleProductoProveedor,jTtoolBarProductoProveedor,jTtoolBarDetalleProductoProveedor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoProveedor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoProveedor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoProveedor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoProveedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoProveedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoProveedor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoProveedor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoProveedor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoProveedor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoproveedorConstantesFunciones.getsFinalQueryProductoProveedor();
		String  finalQueryPaginacionTodos=this.productoproveedorConstantesFunciones.getsFinalQueryProductoProveedor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoProveedorConstantesFunciones.getArrayColumnasGlobalesNoProductoProveedor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoProveedorConstantesFunciones.getArrayColumnasGlobalesProductoProveedor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoProveedorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoproveedorsEliminados= new ArrayList<ProductoProveedor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoProveedor();
		
				///*ProductoProveedorSessionBean*/this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			
			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
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
					this.iNumeroPaginacion=ProductoProveedorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoProveedorConstantesFunciones.getClassesForeignKeysOfProductoProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoproveedor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoproveedorsAux= new ArrayList<ProductoProveedor>();
			
				
			productoproveedorLogic.setDatosCliente(this.datosCliente);
			productoproveedorLogic.setDatosDeep(this.datosDeep);
			productoproveedorLogic.setIsConDeep(true);
			
			
			productoproveedorLogic.getProductoProveedorDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoproveedorLogic.getTodosProductoProveedors(finalQueryGlobal,pagination);
					
					//productoproveedorLogic.getTodosProductoProveedorsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoproveedorLogic.getProductoProveedors()==null|| productoproveedorLogic.getProductoProveedors().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoproveedorsAux= new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedorLogic.getProductoProveedors());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorsAux= new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedors);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoproveedorLogic.getTodosProductoProveedors(finalQueryGlobal+"",this.pagination);												
							
							//productoproveedorLogic.getTodosProductoProveedorsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoProveedors("Todos",productoproveedorLogic.getProductoProveedors() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());					
							productoproveedorLogic.getProductoProveedors().addAll(productoproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedors=new ArrayList<ProductoProveedor>();
							productoproveedors.addAll(productoproveedorsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoProveedor=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoProveedor=this.idActual;
				
				} else if(this.idProductoProveedorActual!=null && this.idProductoProveedorActual!=0L) {
					idProductoProveedor=idProductoProveedorActual;
				}
				
					
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndicePorId(idProductoProveedor);
				
				this.productoproveedors=new ArrayList<ProductoProveedor>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoproveedorLogic.getEntity(idProductoProveedor);
					
					//productoproveedorLogic.getEntityWithConnection(idProductoProveedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());
					productoproveedorLogic.getProductoProveedors().add(productoproveedorLogic.getProductoProveedor());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedors=new ArrayList<ProductoProveedor>();
					this.productoproveedors.add(productoproveedor);
				}
				
				if(productoproveedorLogic.getProductoProveedor()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproveedorLogic.getProductoProveedorsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproveedorLogic.getProductoProveedors()==null||productoproveedorLogic.getProductoProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoproveedors==null|| productoproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorsAux=new ArrayList<ProductoProveedor>();
						productoproveedorsAux.addAll(productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorsAux=new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproveedorLogic.getProductoProveedorsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProveedors("FK_IdBodega",productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProveedors("FK_IdBodega",productoproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());
						productoproveedorLogic.getProductoProveedors().addAll(productoproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedors=new ArrayList<ProductoProveedor>();
							productoproveedors.addAll(productoproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproveedorLogic.getProductoProveedorsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproveedorLogic.getProductoProveedors()==null||productoproveedorLogic.getProductoProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoproveedors==null|| productoproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorsAux=new ArrayList<ProductoProveedor>();
						productoproveedorsAux.addAll(productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorsAux=new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproveedorLogic.getProductoProveedorsFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProveedors("FK_IdCliente",productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProveedors("FK_IdCliente",productoproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());
						productoproveedorLogic.getProductoProveedors().addAll(productoproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedors=new ArrayList<ProductoProveedor>();
							productoproveedors.addAll(productoproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproveedorLogic.getProductoProveedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproveedorLogic.getProductoProveedors()==null||productoproveedorLogic.getProductoProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoproveedors==null|| productoproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorsAux=new ArrayList<ProductoProveedor>();
						productoproveedorsAux.addAll(productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorsAux=new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproveedorLogic.getProductoProveedorsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProveedors("FK_IdEmpresa",productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProveedors("FK_IdEmpresa",productoproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());
						productoproveedorLogic.getProductoProveedors().addAll(productoproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedors=new ArrayList<ProductoProveedor>();
							productoproveedors.addAll(productoproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproveedorLogic.getProductoProveedorsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproveedorLogic.getProductoProveedors()==null||productoproveedorLogic.getProductoProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoproveedors==null|| productoproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorsAux=new ArrayList<ProductoProveedor>();
						productoproveedorsAux.addAll(productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorsAux=new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproveedorLogic.getProductoProveedorsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProveedors("FK_IdProducto",productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProveedors("FK_IdProducto",productoproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());
						productoproveedorLogic.getProductoProveedors().addAll(productoproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedors=new ArrayList<ProductoProveedor>();
							productoproveedors.addAll(productoproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproveedorLogic.getProductoProveedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproveedorLogic.getProductoProveedors()==null||productoproveedorLogic.getProductoProveedors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoproveedors==null|| productoproveedors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorsAux=new ArrayList<ProductoProveedor>();
						productoproveedorsAux.addAll(productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorsAux=new ArrayList<ProductoProveedor>();
							productoproveedorsAux.addAll(productoproveedors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproveedorLogic.getProductoProveedorsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProveedorConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProveedors("FK_IdSucursal",productoproveedorLogic.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProveedors("FK_IdSucursal",productoproveedors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorLogic.setProductoProveedors(new ArrayList<ProductoProveedor>());
						productoproveedorLogic.getProductoProveedors().addAll(productoproveedorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedors=new ArrayList<ProductoProveedor>();
							productoproveedors.addAll(productoproveedorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoProveedor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoProveedor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoproveedorLogic.getProductoProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoproveedors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoproveedorLogic.getProductoProveedors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoproveedors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoProveedor productoproveedor) {
		Boolean permite=true;
		
		if(this.productoproveedor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoProveedorConstantesFunciones.getOrderByListaProductoProveedor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoProveedorConstantesFunciones.getOrderByListaProductoProveedor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProveedor productoproveedor:productoproveedorLogic.getProductoProveedors()) {
				if(productoproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					productoproveedorTotales=productoproveedor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProveedor productoproveedor:this.productoproveedors) {
				if(productoproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					productoproveedorTotales=productoproveedor;
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
			this.productoproveedorAux=new ProductoProveedor();
			this.productoproveedorAux.setsType(Constantes2.S_TOTALES);
			this.productoproveedorAux.setIsNew(false);
			this.productoproveedorAux.setIsChanged(false);
			this.productoproveedorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoProveedorConstantesFunciones.TotalizarValoresFilaProductoProveedor(this.productoproveedorLogic.getProductoProveedors(),this.productoproveedorAux);
				
				this.productoproveedorLogic.getProductoProveedors().add(this.productoproveedorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoProveedorConstantesFunciones.TotalizarValoresFilaProductoProveedor(this.productoproveedors,this.productoproveedorAux);
				
				this.productoproveedors.add(this.productoproveedorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoproveedorTotales=new ProductoProveedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoproveedorLogic.getProductoProveedors().remove(productoproveedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoproveedors.remove(productoproveedorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoproveedorTotales=new ProductoProveedor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProveedor productoproveedor:productoproveedorLogic.getProductoProveedors()) {
				if(productoproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					productoproveedorTotales=productoproveedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProveedorConstantesFunciones.TotalizarValoresFilaProductoProveedor(this.productoproveedorLogic.getProductoProveedors(),productoproveedorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProveedor productoproveedor:this.productoproveedors) {
				if(productoproveedor.getsType().equals(Constantes2.S_TOTALES)) {
					productoproveedorTotales=productoproveedor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProveedorConstantesFunciones.TotalizarValoresFilaProductoProveedor(this.productoproveedors,productoproveedorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoProveedorsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProveedorsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProveedorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProveedorsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProveedorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoProveedorsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLogic.getProductoProveedorsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProveedorsFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLogic.getProductoProveedorsFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProveedorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLogic.getProductoProveedorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProveedorsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLogic.getProductoProveedorsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProveedorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLogic.getProductoProveedorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductoProveedor() {
		this.isPermisoTodoProductoProveedor=false;
		this.isPermisoNuevoProductoProveedor=false;
		this.isPermisoActualizarProductoProveedor=false;
		this.isPermisoActualizarOriginalProductoProveedor=false;
		this.isPermisoEliminarProductoProveedor=false;
		this.isPermisoGuardarCambiosProductoProveedor=false;
		this.isPermisoConsultaProductoProveedor=false;
		this.isPermisoBusquedaProductoProveedor=false;
		this.isPermisoReporteProductoProveedor=false;		
		this.isPermisoOrdenProductoProveedor=false;		
		this.isPermisoPaginacionMedioProductoProveedor=false;		
		this.isPermisoPaginacionAltoProductoProveedor=false;
		this.isPermisoPaginacionTodoProductoProveedor=false;
		this.isPermisoCopiarProductoProveedor=false;		
		this.isPermisoVerFormProductoProveedor=false;		
		this.isPermisoDuplicarProductoProveedor=false;		
		this.isPermisoOrdenProductoProveedor=false;		
	}
	
	public void setPermisosUsuarioProductoProveedor(Boolean isPermiso) {
		this.isPermisoTodoProductoProveedor=isPermiso;
		this.isPermisoNuevoProductoProveedor=isPermiso;
		this.isPermisoActualizarProductoProveedor=isPermiso;
		this.isPermisoActualizarOriginalProductoProveedor=isPermiso;
		this.isPermisoEliminarProductoProveedor=isPermiso;
		this.isPermisoGuardarCambiosProductoProveedor=isPermiso;
		this.isPermisoConsultaProductoProveedor=isPermiso;
		this.isPermisoBusquedaProductoProveedor=isPermiso;
		this.isPermisoReporteProductoProveedor=isPermiso;
		this.isPermisoOrdenProductoProveedor=isPermiso;		
		this.isPermisoPaginacionMedioProductoProveedor=isPermiso;		
		this.isPermisoPaginacionAltoProductoProveedor=isPermiso;		
		this.isPermisoPaginacionTodoProductoProveedor=isPermiso;		
		this.isPermisoCopiarProductoProveedor=isPermiso;		
		this.isPermisoVerFormProductoProveedor=isPermiso;		
		this.isPermisoDuplicarProductoProveedor=isPermiso;
		this.isPermisoOrdenProductoProveedor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoProveedor(Boolean isPermiso) {
		//this.isPermisoTodoProductoProveedor=isPermiso;
		this.isPermisoNuevoProductoProveedor=isPermiso;
		this.isPermisoActualizarProductoProveedor=isPermiso;
		this.isPermisoActualizarOriginalProductoProveedor=isPermiso;
		this.isPermisoEliminarProductoProveedor=isPermiso;
		this.isPermisoGuardarCambiosProductoProveedor=isPermiso;
		//this.isPermisoConsultaProductoProveedor=isPermiso;
		//this.isPermisoBusquedaProductoProveedor=isPermiso;
		//this.isPermisoReporteProductoProveedor=isPermiso;
		//this.isPermisoOrdenProductoProveedor=isPermiso;		
		//this.isPermisoPaginacionMedioProductoProveedor=isPermiso;		
		//this.isPermisoPaginacionAltoProductoProveedor=isPermiso;		
		//this.isPermisoPaginacionTodoProductoProveedor=isPermiso;		
		//this.isPermisoCopiarProductoProveedor=isPermiso;		
		//this.isPermisoDuplicarProductoProveedor=isPermiso;
		//this.isPermisoOrdenProductoProveedor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoProveedorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoProveedor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoProveedorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoProveedorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoProveedorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoProveedorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoProveedor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoProveedorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoProveedor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoProveedor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoProveedor=this.isPermisoActualizarProductoProveedor;
			this.isPermisoEliminarProductoProveedor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoProveedor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoProveedor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoProveedor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoProveedor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoProveedor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProveedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoProveedor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoProveedor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoProveedor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoProveedor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoProveedor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoProveedor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProveedor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoProveedor.setToolTipText(this.jTableDatosProductoProveedor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoProveedor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoProveedor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoProveedor() throws Exception {
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
	public void inicializarCombosForeignKeyProductoProveedorListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoProveedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoProveedorJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoProveedorListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyProductoProveedorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoProveedorParameterReturnGeneral productoproveedorReturnGeneral=new ProductoProveedorParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productoproveedorConstantesFunciones.cargarid_empresaProductoProveedor)
					 || (this.esRecargarFks && this.productoproveedorConstantesFunciones.cargarid_empresaProductoProveedor)) {

					if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productoproveedorSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productoproveedorConstantesFunciones.cargarid_sucursalProductoProveedor)
					 || (this.esRecargarFks && this.productoproveedorConstantesFunciones.cargarid_sucursalProductoProveedor)) {

					if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productoproveedorSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productoproveedorConstantesFunciones.cargarid_bodegaProductoProveedor)
					 || (this.esRecargarFks && this.productoproveedorConstantesFunciones.cargarid_bodegaProductoProveedor)) {

					if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productoproveedorSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productoproveedorConstantesFunciones.cargarid_productoProductoProveedor)
					 || (this.esRecargarFks && this.productoproveedorConstantesFunciones.cargarid_productoProductoProveedor)) {

					if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productoproveedorSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.productoproveedorConstantesFunciones.cargarid_clienteProductoProveedor)
					 || (this.esRecargarFks && this.productoproveedorConstantesFunciones.cargarid_clienteProductoProveedor)) {

					if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+productoproveedorSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoproveedorReturnGeneral=productoproveedorLogic.cargarCombosLoteForeignKeyProductoProveedor(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productoproveedorReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productoproveedorReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productoproveedorReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productoproveedorReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=productoproveedorReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoProveedor()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productoproveedorSessionBean==null) {
				this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.productoproveedorSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoProveedor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoProveedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoProveedor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProveedor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoProveedor(ProductoProveedor productoproveedor)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(productoproveedor.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productoproveedor.getid_producto(),false,"Formulario");
			this.setActualClienteForeignKey(productoproveedor.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoProveedor(ProductoProveedor productoproveedor,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoproveedor.getProducto()!=null && !sTipoEvento.equals("id_productoProductoProveedor")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productoproveedor.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				if(productoproveedor.getCliente()!=null && !sTipoEvento.equals("id_clienteProductoProveedor")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(productoproveedor.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoProveedor()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.productoproveedorConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productoproveedorConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualClienteForeignKey(this.productoproveedorConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProveedor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoProveedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoProveedor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoProveedor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoProveedor()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoProveedor(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoProveedor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProductoProveedorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoProveedorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoProveedorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoproveedorSessionBean=new ProductoProveedorSessionBean(); 
		this.productoproveedorConstantesFunciones=new ProductoProveedorConstantesFunciones(); 
		this.productoproveedorBean=new ProductoProveedor();//(this.productoproveedorConstantesFunciones); 		
		this.productoproveedorReturnGeneral=new ProductoProveedorParameterReturnGeneral(); 
		
		this.productoproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoProveedorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoProveedor(true);
			
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
			
			this.productoproveedorConstantesFunciones=new ProductoProveedorConstantesFunciones(); 
			this.productoproveedorBean=new ProductoProveedor();//this.productoproveedorConstantesFunciones); 			
			this.productoproveedorReturnGeneral=new ProductoProveedorParameterReturnGeneral(); 
		
			ProductoProveedorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Proveedor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoproveedor=new ProductoProveedor();
			this.productoproveedors = new ArrayList<ProductoProveedor>();
			this.productoproveedorsAux = new ArrayList<ProductoProveedor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic=new ProductoProveedorLogic();
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			//this.productoproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoProveedor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProveedor);	
					}
					
					if(this.jInternalFrameImportacionProductoProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProveedor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoProveedor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoProveedor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProveedor);
				this.jInternalFrameDetalleFormProductoProveedor.setVisible(false);
				this.jInternalFrameDetalleFormProductoProveedor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProveedor);
					this.jInternalFrameReporteDinamicoProductoProveedor.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoProveedor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoProveedor);
					this.jInternalFrameImportacionProductoProveedor.setVisible(false);
					this.jInternalFrameImportacionProductoProveedor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoProveedor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoProveedor);
					this.jInternalFrameOrderByProductoProveedor.setVisible(false);
					this.jInternalFrameOrderByProductoProveedor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoProveedorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoProveedorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoproveedorReturnGeneral=new ProductoProveedorParameterReturnGeneral();
			
			this.productoproveedorParameterGeneral=new ProductoProveedorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoproveedorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoProveedorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProveedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoproveedorSessionBean.getEsGuardarRelacionado(),this.productoproveedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProveedorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoproveedorSessionBean.getEsGuardarRelacionado(),this.productoproveedorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaDuplicarProductoProveedor=true;
			this.isVisibilidadCeldaCopiarProductoProveedor=true;
			this.isVisibilidadCeldaVerFormProductoProveedor=true;
			this.isVisibilidadCeldaOrdenProductoProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
			this.isVisibilidadCeldaModificarProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=false;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=false;
			this.isVisibilidadCeldaGuardarProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoProveedor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoProveedor(false);
			
			this.setPermisosUsuarioProductoProveedor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoproveedorSessionBean.getEsGuardarRelacionado() 
				|| (this.productoproveedorSessionBean.getEsGuardarRelacionado() && this.productoproveedorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoProveedorClasesRelacionadas();
			}
			
			if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoProveedorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoProveedor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoProveedor();
			}
			
			if(!this.isPermisoBusquedaProductoProveedor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoProveedor,this.isPermisoPaginacionMedioProductoProveedor,this.isPermisoPaginacionTodoProductoProveedor);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoProveedorConstantesFunciones.getTiposSeleccionarProductoProveedor());
				
				this.tiposColumnasSelect=ProductoProveedorConstantesFunciones.getTiposSeleccionarProductoProveedor(true);
				
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
			//if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoProveedor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoProveedor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoProveedor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProveedor() ;
			
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
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productoproveedorImplementable= (ProductoProveedorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProveedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoproveedorImplementableHome= (ProductoProveedorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProveedorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoproveedors= new ArrayList<ProductoProveedor>();
			this.productoproveedorsEliminados= new ArrayList<ProductoProveedor>();
						
			this.isEsNuevoProductoProveedor=false;
			this.esParaAccionDesdeFormularioProductoProveedor=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoProveedor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoProveedor();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoProveedorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoProveedorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoProveedor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoProveedor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoProveedor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoProveedor();
			}
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoProveedor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoProveedor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoProveedor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoProveedor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoProveedor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoProveedor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoProveedor")) {
				iIndex=this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoProveedor();	
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
	
	public void cargarCombosForeignKeyProductoProveedor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoProveedor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoProveedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoProveedorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoProveedor();
		
		this.cargarCombosFrameForeignKeyProductoProveedor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoProveedor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoProveedor();
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
	
	public void jButtonNuevoProductoProveedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			
			if(jTableDatosProductoProveedor.getRowCount()>=1) {
				jTableDatosProductoProveedor.removeRowSelectionInterval(0, jTableDatosProductoProveedor.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoProveedor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoProveedor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoProveedor(true);			
			//this.productoproveedor=new ProductoProveedor();
			//this.productoproveedor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProveedor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProveedor() ;
			
			if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProveedor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoproveedor);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);				
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoProveedor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoProveedorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoProveedor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoProveedor.getSelectedRows().length;			
			}
			
			productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoProveedor--;			
				//ProductoProveedor productoproveedorAux= new ProductoProveedor();			
				//productoproveedorAux.setId(this.iIdNuevoProductoProveedor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoProveedor productoproveedorOrigen=new ProductoProveedor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoProveedor productoproveedorOrigen : productoproveedorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoproveedorOrigen =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproveedorOrigen =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoProveedor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoproveedor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoProveedor(productoproveedorOrigen,this.productoproveedor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoproveedorLogic.getProductoProveedors().add(this.productoproveedorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoproveedors.add(this.productoproveedorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoProveedor(false);
				
				this.jTableDatosProductoProveedor.setRowSelectionInterval(this.getIndiceNuevoProductoProveedor(), this.getIndiceNuevoProductoProveedor());
				
				int iLastRow =  this.jTableDatosProductoProveedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProveedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProveedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProveedor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();									
		
			ProductoProveedor productoproveedorOrigen=new ProductoProveedor();
			ProductoProveedor productoproveedorDestino=new ProductoProveedor();
				
			productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoProveedor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoproveedorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoProveedor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorOrigen =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoproveedorOrigen =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproveedorDestino =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoproveedorDestino =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoproveedorOrigen =productoproveedorsSeleccionados.get(0);
				productoproveedorDestino =productoproveedorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoProveedor(productoproveedorOrigen,productoproveedorDestino,true,false);
				
				productoproveedorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoproveedorDestino,productoproveedorLogic.getProductoProveedors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproveedorDestino,productoproveedors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoProveedor(false);
				
				//this.jTableDatosProductoProveedor.setRowSelectionInterval(this.getIndiceNuevoProductoProveedor(), this.getIndiceNuevoProductoProveedor());
				
				int iLastRow =  this.jTableDatosProductoProveedor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProveedor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProveedor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProveedor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoProveedor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoProveedor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoProveedor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoProveedor.setVisible(!isVisible);
			this.jPanelPaginacionProductoProveedor.setVisible(!isVisible);
			this.jPanelAccionesProductoProveedor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoProveedor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoProveedor();
			
			this.abrirFrameOrderByProductoProveedor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoProveedor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoProveedor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProveedor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoProveedor.isMaximum()) {
					this.jInternalFrameDetalleFormProductoProveedor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoProveedor.setSize(this.jInternalFrameDetalleFormProductoProveedor.iWidthFormulario,this.jInternalFrameDetalleFormProductoProveedor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoProveedor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoProveedor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoProveedor.isMaximum()) {
						this.jInternalFrameDetalleFormProductoProveedor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoProveedor.jContentPaneDetalleProductoProveedor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoProveedor.jContentPaneDetalleProductoProveedor.getWidth(),ProductoProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoProveedor.jContentPaneDetalleProductoProveedor.getWidth(),ProductoProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoProveedor.jContentPaneDetalleProductoProveedor.getWidth(),ProductoProveedorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoProveedor.setVisible(true);
	        this.jInternalFrameDetalleFormProductoProveedor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoProveedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoProveedor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProveedor,false,this);
				} else {
					this.jInternalFrameOrderByProductoProveedor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProveedor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoProveedor);
				this.jInternalFrameOrderByProductoProveedor.setVisible(false);
				this.jInternalFrameOrderByProductoProveedor.setSelected(false);
				
				this.jInternalFrameOrderByProductoProveedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProveedor"));
				
				this.inicializarActualizarBindingTablaOrderByProductoProveedor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoProveedor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoProveedor==null) {
				
				this.jInternalFrameImportacionProductoProveedor=new ImportacionJInternalFrame(ProductoProveedorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProveedor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoProveedor);
				this.jInternalFrameImportacionProductoProveedor.setVisible(false);
				this.jInternalFrameImportacionProductoProveedor.setSelected(false);


				this.jInternalFrameImportacionProductoProveedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProveedor"));
				this.jInternalFrameImportacionProductoProveedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProveedor"));
				this.jInternalFrameImportacionProductoProveedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProveedor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoProveedor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoProveedor==null) {
				this.jInternalFrameReporteDinamicoProductoProveedor=new ReporteDinamicoJInternalFrame(ProductoProveedorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProveedor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProveedor);
				this.jInternalFrameReporteDinamicoProductoProveedor.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoProveedor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoProveedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProveedor"));
				this.jInternalFrameReporteDinamicoProductoProveedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProveedor"));
				this.jInternalFrameReporteDinamicoProductoProveedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProveedor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProveedor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoProveedor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProveedor);
			
	       	this.jInternalFrameDetalleFormProductoProveedor.setVisible(false);
	        this.jInternalFrameDetalleFormProductoProveedor.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoProveedor.dispose();
			//this.jInternalFrameDetalleFormProductoProveedor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoProveedor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoProveedor.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoProveedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoProveedor.setVisible(true);
	        this.jInternalFrameImportacionProductoProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoProveedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoProveedor.setVisible(true);
	        this.jInternalFrameOrderByProductoProveedor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoProveedor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoProveedor.setVisible(false);
	        this.jInternalFrameOrderByProductoProveedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoProveedor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoProveedor.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoProveedor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoProveedor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoProveedor.setVisible(false);
	        this.jInternalFrameImportacionProductoProveedor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoProveedor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoProveedor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoProveedor(true);
			//this.isEsNuevoProductoProveedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProveedor(false) ;
			
			if(productoproveedorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProveedor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProveedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoProveedorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoProveedor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoProveedor(true);
			//this.isEsNuevoProductoProveedor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoproveedor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoProveedor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoProveedor(false) ;
			
			if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProveedor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProveedor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productoproveedorConstantesFunciones.cargarid_productoProductoProveedor) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoProveedor(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
			
			if(sType.equals("Cliente")) {
				if(!this.productoproveedorConstantesFunciones.cargarid_clienteProductoProveedor) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoProveedor(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProveedor.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProveedor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoProveedor(false);
			
			//if(!this.isEsNuevoProductoProveedor) {								
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				
			}
			
			if(this.permiteMantenimiento(this.productoproveedor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoProveedor=true;
					this.inicializarActualizarBindingTablaProductoProveedor(false);
					this.isEsNuevoProductoProveedor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoProveedor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoProveedor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProveedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProveedor(false);
				
				this.habilitarDeshabilitarControlesProductoProveedor(false);
			
												
				
				if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoProveedor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoProveedorActionPerformed(evt,productoproveedorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoProveedor(this.productoproveedor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoProveedor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoproveedorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoproveedor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				this.productoproveedor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				this.productoproveedor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoproveedor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoProveedorModel) this.jTableDatosProductoProveedor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoProveedor=true;
				this.inicializarActualizarBindingTablaProductoProveedor(false);
				this.isEsNuevoProductoProveedor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProveedor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProveedor(false);
				
				this.habilitarDeshabilitarControlesProductoProveedor(false);
				
				
				
				if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoProveedor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoProveedorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoProveedor.getRowCount()>=1) {
				jTableDatosProductoProveedor.removeRowSelectionInterval(0, jTableDatosProductoProveedor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoProveedor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoProveedor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProveedor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProveedor(false) ;
			
			this.isEsNuevoProductoProveedor=false;
			
			if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoProveedor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoProveedor(false);
				
				//SI ES MANUAL
				if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoProveedor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoProveedor--;			
			//ProductoProveedor productoproveedorAux= new ProductoProveedor();			
			//productoproveedorAux.setId(this.iIdNuevoProductoProveedor);
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoProveedor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
			
			this.productoproveedor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoproveedorLogic.getProductoProveedors().add(this.productoproveedorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoproveedors.add(this.productoproveedorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoProveedor(false);
			
			this.jTableDatosProductoProveedor.setRowSelectionInterval(this.getIndiceNuevoProductoProveedor(), this.getIndiceNuevoProductoProveedor());
			
			int iLastRow =  this.jTableDatosProductoProveedor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoProveedor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoProveedor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoProveedor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoProveedor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProveedor(false);
			
			//SI ES MANUAL
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProveedor();
			}
			
			//this.abrirFrameTreeProductoProveedor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto ProveedorS ?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoProveedor.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoProveedor();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoproveedorReturnGeneral=productoproveedorLogic.procesarImportacionProductoProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoproveedorParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoProveedorReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoProveedor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoProveedor.setFileImportacion(this.jInternalFrameImportacionProductoProveedor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoProveedor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoProveedor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoProveedor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoProveedor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		

		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoProveedorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoProveedorBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecioUltimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecioUltimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecioUltimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecioUltimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecioAcuerdo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecioAcuerdo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecioAcuerdo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecioAcuerdo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_DIAENTRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aEntra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aEntra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aEntra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aEntra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProveedorConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoProveedor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO:
					sNombreCampoCategoria="precio_ultimo";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO:
					sNombreCampoCategoria="precio_acuerdo";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_DIAENTRA:
					sNombreCampoCategoria="dia_entra";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO:
					sNombreCampoCategoriaValor="precio_ultimo";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO:
					sNombreCampoCategoriaValor="precio_acuerdo";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_DIAENTRA:
					sNombreCampoCategoriaValor="dia_entra";
					break;

				case ProductoProveedorConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio Ultimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio_ultimo");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio Acuerdo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio_acuerdo");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_DIAENTRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Entra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_entra");
					break;

				case ProductoProveedorConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoProveedorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoProveedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getprecio_ultimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getprecio_acuerdo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_DIAENTRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getdia_entra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProveedorConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(ProductoProveedor productoproveedor:productoproveedorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoproveedor.getobservacion());
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
			//	this.getFilaCabeceraExportarExcelProductoProveedor(row);				
			//	iRow++;
			//}				
			
			//for(ProductoProveedor productoproveedorAux:productoproveedorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoProveedor(productoproveedorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProveedor(false);
			
			//SI ES MANUAL
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProveedor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProveedor(false);
			
			//SI ES MANUAL
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProveedor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoProveedorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProveedor(false);
			
			//SI ES MANUAL
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProveedor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoProveedor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoProveedor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoProveedor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoProveedor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoProveedor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoProveedor.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoProveedor.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoProveedor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoProveedor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoProveedor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoProveedor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoProveedor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoProveedor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoProveedor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProveedor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoProveedor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoProveedor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoProveedor();
		
		this.inicializarActualizarBindingBotonesManualProductoProveedor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProveedor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProveedor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProveedor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProveedor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoProveedor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoProveedor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoProveedor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoProveedor.jCheckBoxPostAccionNuevoProductoProveedor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoProveedor.jCheckBoxPostAccionSinCerrarProductoProveedor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoProveedor.jCheckBoxPostAccionSinMensajeProductoProveedor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoProveedor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoProveedor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoProveedor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
				this.jInternalFrameDetalleFormProductoProveedor.jCheckBoxPostAccionNuevoProductoProveedor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoProveedor.jCheckBoxPostAccionSinCerrarProductoProveedor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoProveedor.jCheckBoxPostAccionSinMensajeProductoProveedor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoProveedor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoProveedor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoProveedor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoProveedor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoProveedor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoProveedor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoProveedor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoProveedor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoProveedor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoProveedor(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProveedor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoProveedor() throws Exception {
		try	{
			if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProveedor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProveedor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProveedor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoProveedor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoProveedor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoProveedor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoProveedor.addItem(reporte);
			}
			
			
			if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoProveedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoProveedor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoProveedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoProveedor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoProveedor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoProveedor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoProveedor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProveedor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProveedor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
				this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
				this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoProveedor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProveedor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoProveedorConstantesFunciones.getTiposSeleccionarProductoProveedor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoProveedorConstantesFunciones.getTiposSeleccionarProductoProveedor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoProveedorConstantesFunciones.getTiposSeleccionarProductoProveedor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProveedor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoProveedor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoProveedor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoProveedor.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoProveedor.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteProductoProveedor.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteProductoProveedor.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoProveedor.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoProveedor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoProveedor(Boolean esInicializar) throws Exception {				
		if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProveedor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoProveedor() throws Exception {
		this.inicializarActualizarBindingTablaProductoProveedor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoProveedor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoProveedorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoProveedor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoproveedorLogic.getProductoProveedors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoproveedors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoProveedor.setModel(new ProductoProveedorModel(this.productoproveedorLogic.getProductoProveedors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoProveedor.setModel(new ProductoProveedorModel(this.productoproveedors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoProveedor!=null && this.jInternalFrameOrderByProductoProveedor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoProveedor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO,productoproveedorConstantesFunciones.resaltarSeleccionarProductoProveedor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoProveedorConstantesFunciones.SCLASSWEBTITULO,productoproveedorConstantesFunciones.resaltarSeleccionarProductoProveedor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_ID));

		if(this.productoproveedorConstantesFunciones.mostraridProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproveedorConstantesFunciones.resaltaridProductoProveedor,this.productoproveedorConstantesFunciones.activaridProductoProveedor,iSizeTabla,this,true,"idProductoProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproveedorConstantesFunciones.resaltaridProductoProveedor,this.productoproveedorConstantesFunciones.activaridProductoProveedor,this,true,"idProductoProveedor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productoproveedorConstantesFunciones.mostrarid_empresaProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productoproveedorConstantesFunciones.resaltarid_empresaProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_empresaProductoProveedor,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productoproveedorConstantesFunciones.resaltarid_empresaProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_empresaProductoProveedor,false,"id_empresaProductoProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productoproveedorConstantesFunciones.mostrarid_sucursalProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productoproveedorConstantesFunciones.resaltarid_sucursalProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_sucursalProductoProveedor,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productoproveedorConstantesFunciones.resaltarid_sucursalProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_sucursalProductoProveedor,false,"id_sucursalProductoProveedor","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDBODEGA));

		if(this.productoproveedorConstantesFunciones.mostrarid_bodegaProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productoproveedorConstantesFunciones.resaltarid_bodegaProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_bodegaProductoProveedor,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productoproveedorConstantesFunciones.resaltarid_bodegaProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_bodegaProductoProveedor,true,"id_bodegaProductoProveedor","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productoproveedorConstantesFunciones.mostrarid_productoProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productoproveedorConstantesFunciones.resaltarid_productoProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_productoProductoProveedor,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productoproveedorConstantesFunciones.resaltarid_productoProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_productoProductoProveedor,true,"id_productoProductoProveedor","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE));

		if(this.productoproveedorConstantesFunciones.mostrarid_clienteProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.productoproveedorConstantesFunciones.resaltarid_clienteProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_clienteProductoProveedor,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.productoproveedorConstantesFunciones.resaltarid_clienteProductoProveedor,this,this.productoproveedorConstantesFunciones.activarid_clienteProductoProveedor,true,"id_clienteProductoProveedor","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO));

		if(this.productoproveedorConstantesFunciones.mostrarprecio_ultimoProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproveedorConstantesFunciones.resaltarprecio_ultimoProductoProveedor,this.productoproveedorConstantesFunciones.activarprecio_ultimoProductoProveedor,iSizeTabla,this,true,"precio_ultimoProductoProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproveedorConstantesFunciones.resaltarprecio_ultimoProductoProveedor,this.productoproveedorConstantesFunciones.activarprecio_ultimoProductoProveedor,this,true,"precio_ultimoProductoProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO));

		if(this.productoproveedorConstantesFunciones.mostrarprecio_acuerdoProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproveedorConstantesFunciones.resaltarprecio_acuerdoProductoProveedor,this.productoproveedorConstantesFunciones.activarprecio_acuerdoProductoProveedor,iSizeTabla,this,true,"precio_acuerdoProductoProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproveedorConstantesFunciones.resaltarprecio_acuerdoProductoProveedor,this.productoproveedorConstantesFunciones.activarprecio_acuerdoProductoProveedor,this,true,"precio_acuerdoProductoProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_DIAENTRA));

		if(this.productoproveedorConstantesFunciones.mostrardia_entraProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_DIAENTRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproveedorConstantesFunciones.resaltardia_entraProductoProveedor,this.productoproveedorConstantesFunciones.activardia_entraProductoProveedor,iSizeTabla,this,true,"dia_entraProductoProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproveedorConstantesFunciones.resaltardia_entraProductoProveedor,this.productoproveedorConstantesFunciones.activardia_entraProductoProveedor,this,true,"dia_entraProductoProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,ProductoProveedorConstantesFunciones.LABEL_OBSERVACION));

		if(this.productoproveedorConstantesFunciones.mostrarobservacionProductoProveedor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProveedorConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoproveedorConstantesFunciones.resaltarobservacionProductoProveedor,this.productoproveedorConstantesFunciones.activarobservacionProductoProveedor,iSizeTabla,this,true,"observacionProductoProveedor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproveedorConstantesFunciones.resaltarobservacionProductoProveedor,this.productoproveedorConstantesFunciones.activarobservacionProductoProveedor,this,true,"observacionProductoProveedor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProveedorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoproveedorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoproveedorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProveedor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoproveedorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoproveedorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProveedor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoproveedorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoproveedorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoProveedor.addColumn(tableColumn);
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
			
			this.jTableDatosProductoProveedor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoProveedor.moveColumn(this.jTableDatosProductoProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoProveedor.moveColumn(this.jTableDatosProductoProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoProveedor.moveColumn(this.jTableDatosProductoProveedor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoProveedor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoProveedor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoProveedor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoProveedor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoProveedor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoProveedor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoProveedor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoProveedor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoproveedorLogic.getProductoProveedors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoproveedors.size()-1;
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
		//this.jTableDatosProductoProveedor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoProveedor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoProveedor();
			
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
				
				//this.isEsNuevoProductoProveedor=false;
					
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
				if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoProveedor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProveedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProveedor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoproveedor.getsType().equals("DUPLICADO")
				   || this.productoproveedor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoProveedor=true;
				
				} else {
					this.isEsNuevoProductoProveedor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
					if(this.productoproveedor.getId()>=0 && !this.productoproveedor.getIsNew()) {						
						this.isEsNuevoProductoProveedor=false;
						
					} else {
						this.isEsNuevoProductoProveedor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoProveedor(esRelaciones);						
				
				this.seleccionarProductoProveedor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoproveedor.getId()<0) {
					this.isEsNuevoProductoProveedor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoProveedor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoProveedor(evt,rowIndex);
				}	
				
				if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoProveedor: " + this.dDif); 
					}
				}								
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoProveedor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoproveedor)) {
					if(this.productoproveedor.getId()>0) {
						this.productoproveedor.setIsDeleted(true);
						
						this.productoproveedorsEliminados.add(this.productoproveedor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoproveedorLogic.getProductoProveedors().remove(this.productoproveedor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoproveedors.remove(this.productoproveedor);				
					}
					
					
					((ProductoProveedorModel) this.jTableDatosProductoProveedor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProveedor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoProveedor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoProveedor) {
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProveedor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProveedor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoProveedor(this.productoproveedor);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productoproveedorConstantesFunciones.cargarid_empresaProductoProveedor || this.productoproveedorConstantesFunciones.event_dependid_empresaProductoProveedor) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productoproveedor.getid_empresa());
									//this.inicializarActualizarBindingProductoProveedor(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productoproveedor.getEmpresa()!=null) {
							this.empresasForeignKey.add(productoproveedor.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productoproveedor.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productoproveedorConstantesFunciones.cargarid_sucursalProductoProveedor || this.productoproveedorConstantesFunciones.event_dependid_sucursalProductoProveedor) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productoproveedor.getid_sucursal());
									//this.inicializarActualizarBindingProductoProveedor(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productoproveedor.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productoproveedor.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productoproveedor.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.productoproveedorConstantesFunciones.cargarid_bodegaProductoProveedor || this.productoproveedorConstantesFunciones.event_dependid_bodegaProductoProveedor) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productoproveedor.getid_bodega());
									//this.inicializarActualizarBindingProductoProveedor(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productoproveedor.getBodega()!=null) {
							this.bodegasForeignKey.add(productoproveedor.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productoproveedor.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productoproveedorConstantesFunciones.cargarid_productoProductoProveedor || this.productoproveedorConstantesFunciones.event_dependid_productoProductoProveedor) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productoproveedor.getid_producto());
									//this.inicializarActualizarBindingProductoProveedor(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productoproveedor.getProducto()!=null) {
							this.productosForeignKey.add(productoproveedor.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productoproveedor.getid_producto(),false,"Formulario");

					//Cliente
					if(!this.productoproveedorConstantesFunciones.cargarid_clienteProductoProveedor || this.productoproveedorConstantesFunciones.event_dependid_clienteProductoProveedor) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.productoproveedor.getid_cliente());
									//this.inicializarActualizarBindingProductoProveedor(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(productoproveedor.getCliente()!=null) {
							this.clientesForeignKey.add(productoproveedor.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.productoproveedor.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoProveedor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoProveedor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProveedor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProveedor(ProductoProveedor productoproveedor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoProveedor(productoproveedor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProveedor(ProductoProveedor productoproveedor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoProveedor(productoproveedor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoProveedor(productoproveedor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoProveedor(productoproveedor);
	}
	
	public void setVariablesObjetoActualToFormularioProductoProveedor(ProductoProveedor productoproveedor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setText(productoproveedor.getId().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setText(productoproveedor.getprecio_ultimo().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setText(productoproveedor.getprecio_acuerdo().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setText(productoproveedor.getdia_entra().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setText(productoproveedor.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoProveedor productoproveedorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoproveedorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoProveedor productoproveedorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoproveedorLocal=this.productoproveedor;
			} else {
				productoproveedorLocal=this.productoproveedorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoproveedorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoProveedor(productoproveedorLocal,true);
					
					if(productoproveedorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoproveedorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoproveedorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoProveedor(ProductoProveedor productoproveedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProveedor(productoproveedor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(productoproveedor);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProveedor(ProductoProveedor productoproveedor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProveedor(productoproveedor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProveedor(ProductoProveedor productoproveedor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.getText()==null || this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.getText()=="" || this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setText("0");
			}

			if(conColumnasBase) {productoproveedor.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProveedorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelIdProductoProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoproveedor.setprecio_ultimo(Double.parseDouble(this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelprecio_ultimoProductoProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoproveedor.setprecio_acuerdo(Double.parseDouble(this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelprecio_acuerdoProductoProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoproveedor.setdia_entra(Integer.parseInt(this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProveedorConstantesFunciones.LABEL_DIAENTRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabeldia_entraProductoProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoproveedor.setobservacion(this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProveedorConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProveedor.jLabelobservacionProductoProveedor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProveedor(ProductoProveedor productoproveedorBean,ProductoProveedor productoproveedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoproveedorBean.getid_bodega()!=null && !productoproveedorBean.getid_bodega().equals(-1L))) {productoproveedor.setid_bodega(productoproveedorBean.getid_bodega());}
			if(conDefault || (!conDefault && productoproveedorBean.getid_producto()!=null && !productoproveedorBean.getid_producto().equals(-1L))) {productoproveedor.setid_producto(productoproveedorBean.getid_producto());}
			if(conDefault || (!conDefault && productoproveedorBean.getid_cliente()!=null && !productoproveedorBean.getid_cliente().equals(-1L))) {productoproveedor.setid_cliente(productoproveedorBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoProveedor(ProductoProveedor productoproveedorOrigen,ProductoProveedor productoproveedor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoproveedorOrigen.getId()!=null && !productoproveedorOrigen.getId().equals(0L))) {productoproveedor.setId(productoproveedorOrigen.getId());}}
			if(conDefault || (!conDefault && productoproveedorOrigen.getid_bodega()!=null && !productoproveedorOrigen.getid_bodega().equals(-1L))) {productoproveedor.setid_bodega(productoproveedorOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productoproveedorOrigen.getid_producto()!=null && !productoproveedorOrigen.getid_producto().equals(-1L))) {productoproveedor.setid_producto(productoproveedorOrigen.getid_producto());}
			if(conDefault || (!conDefault && productoproveedorOrigen.getid_cliente()!=null && !productoproveedorOrigen.getid_cliente().equals(-1L))) {productoproveedor.setid_cliente(productoproveedorOrigen.getid_cliente());}
			if(conDefault || (!conDefault && productoproveedorOrigen.getprecio_ultimo()!=null && !productoproveedorOrigen.getprecio_ultimo().equals(0.0))) {productoproveedor.setprecio_ultimo(productoproveedorOrigen.getprecio_ultimo());}
			if(conDefault || (!conDefault && productoproveedorOrigen.getprecio_acuerdo()!=null && !productoproveedorOrigen.getprecio_acuerdo().equals(0.0))) {productoproveedor.setprecio_acuerdo(productoproveedorOrigen.getprecio_acuerdo());}
			if(conDefault || (!conDefault && productoproveedorOrigen.getdia_entra()!=null && !productoproveedorOrigen.getdia_entra().equals(0))) {productoproveedor.setdia_entra(productoproveedorOrigen.getdia_entra());}
			if(conDefault || (!conDefault && productoproveedorOrigen.getobservacion()!=null && !productoproveedorOrigen.getobservacion().equals(""))) {productoproveedor.setobservacion(productoproveedorOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProveedor(ProductoProveedor productoproveedor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setText(productoproveedor.getId().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setText(productoproveedor.getprecio_ultimo().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setText(productoproveedor.getprecio_acuerdo().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setText(productoproveedor.getdia_entra().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setText(productoproveedor.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProveedor(ProductoProveedorBean productoproveedorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setText(productoproveedorBean.getId().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setText(productoproveedorBean.getprecio_ultimo().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setText(productoproveedorBean.getprecio_acuerdo().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setText(productoproveedorBean.getdia_entra().toString());
			this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setText(productoproveedorBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoProveedor(ProductoProveedorParameterReturnGeneral productoproveedorReturnGeneral,ProductoProveedorBean productoproveedorBean,Boolean conDefault) throws Exception { 
		try {
			ProductoProveedor productoproveedorLocal=new ProductoProveedor();
			
			productoproveedorLocal=productoproveedorReturnGeneral.getProductoProveedor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoproveedorLocal.getId()!=null && !productoproveedorLocal.getId().equals(0L))) {productoproveedorBean.setId(productoproveedorLocal.getId());}}
			if(conDefault || (!conDefault && productoproveedorLocal.getid_bodega()!=null && !productoproveedorLocal.getid_bodega().equals(-1L))) {productoproveedorBean.setid_bodega(productoproveedorLocal.getid_bodega());}
			if(conDefault || (!conDefault && productoproveedorLocal.getid_producto()!=null && !productoproveedorLocal.getid_producto().equals(-1L))) {productoproveedorBean.setid_producto(productoproveedorLocal.getid_producto());}
			if(conDefault || (!conDefault && productoproveedorLocal.getid_cliente()!=null && !productoproveedorLocal.getid_cliente().equals(-1L))) {productoproveedorBean.setid_cliente(productoproveedorLocal.getid_cliente());}
			if(conDefault || (!conDefault && productoproveedorLocal.getprecio_ultimo()!=null && !productoproveedorLocal.getprecio_ultimo().equals(0.0))) {productoproveedorBean.setprecio_ultimo(productoproveedorLocal.getprecio_ultimo());}
			if(conDefault || (!conDefault && productoproveedorLocal.getprecio_acuerdo()!=null && !productoproveedorLocal.getprecio_acuerdo().equals(0.0))) {productoproveedorBean.setprecio_acuerdo(productoproveedorLocal.getprecio_acuerdo());}
			if(conDefault || (!conDefault && productoproveedorLocal.getdia_entra()!=null && !productoproveedorLocal.getdia_entra().equals(0))) {productoproveedorBean.setdia_entra(productoproveedorLocal.getdia_entra());}
			if(conDefault || (!conDefault && productoproveedorLocal.getobservacion()!=null && !productoproveedorLocal.getobservacion().equals(""))) {productoproveedorBean.setobservacion(productoproveedorLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoProveedorGenerico(Long idProductoProveedorSeleccionado,JComboBox jComboBoxProductoProveedor,List<ProductoProveedor> productoproveedorsLocal)throws Exception {
		try {
			ProductoProveedor  productoproveedorTemp=null;

			for(ProductoProveedor productoproveedorAux:productoproveedorsLocal) {
				if(productoproveedorAux.getId()!=null && productoproveedorAux.getId().equals(idProductoProveedorSeleccionado)) {
					productoproveedorTemp=productoproveedorAux;
					break;
				}
			}

			jComboBoxProductoProveedor.setSelectedItem(productoproveedorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoProveedorGenerico(JComboBox jComboBoxProductoProveedor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProveedor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoProveedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProveedor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoProveedor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoproveedor=(ProductoProveedor) productoproveedorLogic.getProductoProveedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoproveedor =(ProductoProveedor) productoproveedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productoproveedor.getIsNew() && !productoproveedor.getIsChanged() && !productoproveedor.getIsDeleted()) {
				sDescripcion=productoproveedor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoproveedor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productoproveedor.getIsNew() && !productoproveedor.getIsChanged() && !productoproveedor.getIsDeleted()) {
				sDescripcion=productoproveedor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productoproveedor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productoproveedor.getIsNew() && !productoproveedor.getIsChanged() && !productoproveedor.getIsDeleted()) {
				sDescripcion=productoproveedor.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productoproveedor.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productoproveedor.getIsNew() && !productoproveedor.getIsChanged() && !productoproveedor.getIsDeleted()) {
				sDescripcion=productoproveedor.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productoproveedor.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!productoproveedor.getIsNew() && !productoproveedor.getIsChanged() && !productoproveedor.getIsDeleted()) {
				sDescripcion=productoproveedor.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=productoproveedor.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoProveedor productoproveedorRow=new ProductoProveedor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoproveedorRow=(ProductoProveedor) productoproveedorLogic.getProductoProveedors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoproveedorRow=(ProductoProveedor) productoproveedors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoProveedor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoProductoProveedor && this.isPermisoNuevoProductoProveedor));			
			this.jButtonDuplicarProductoProveedor.setVisible((this.isVisibilidadCeldaDuplicarProductoProveedor && this.isPermisoDuplicarProductoProveedor));			
			this.jButtonCopiarProductoProveedor.setVisible((this.isVisibilidadCeldaCopiarProductoProveedor && this.isPermisoCopiarProductoProveedor));
			this.jButtonVerFormProductoProveedor.setVisible((this.isVisibilidadCeldaVerFormProductoProveedor && this.isPermisoVerFormProductoProveedor));
			
			this.jButtonAbrirOrderByProductoProveedor.setVisible((this.isVisibilidadCeldaOrdenProductoProveedor && this.isPermisoOrdenProductoProveedor));			
			
			this.jButtonNuevoRelacionesProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProveedor && this.isPermisoNuevoProductoProveedor));			
			this.jButtonNuevoGuardarCambiosProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoProductoProveedor && this.isPermisoNuevoProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarProductoProveedor.setVisible((this.isVisibilidadCeldaModificarProductoProveedor && this.isPermisoActualizarProductoProveedor));	
			this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarProductoProveedor.setVisible((this.isVisibilidadCeldaActualizarProductoProveedor && this.isPermisoActualizarProductoProveedor));	
			this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarProductoProveedor.setVisible((this.isVisibilidadCeldaEliminarProductoProveedor && this.isPermisoEliminarProductoProveedor));
			this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarProductoProveedor.setVisible(this.isVisibilidadCeldaCancelarProductoProveedor);							
			this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoProductoProveedor && this.isPermisoNuevoProductoProveedor));						
			this.jButtonDuplicarToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaDuplicarProductoProveedor && this.isPermisoDuplicarProductoProveedor));						
			this.jButtonCopiarToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaCopiarProductoProveedor && this.isPermisoCopiarProductoProveedor));			
			this.jButtonVerFormToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaVerFormProductoProveedor && this.isPermisoVerFormProductoProveedor));			
			this.jButtonAbrirOrderByToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaOrdenProductoProveedor && this.isPermisoOrdenProductoProveedor));
			this.jButtonNuevoRelacionesToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProveedor && this.isPermisoNuevoProductoProveedor));			
			this.jButtonNuevoGuardarCambiosToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoProductoProveedor && this.isPermisoNuevoProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));			
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaModificarProductoProveedor && this.isPermisoActualizarProductoProveedor));	
			this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaActualizarProductoProveedor  && this.isPermisoActualizarProductoProveedor));	
			this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaEliminarProductoProveedor && this.isPermisoEliminarProductoProveedor));
			this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarToolBarProductoProveedor.setVisible(this.isVisibilidadCeldaCancelarProductoProveedor);				
			this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoProductoProveedor && this.isPermisoNuevoProductoProveedor));			
			this.jMenuItemDuplicarProductoProveedor.setVisible((this.isVisibilidadCeldaDuplicarProductoProveedor && this.isPermisoDuplicarProductoProveedor));			
			this.jMenuItemCopiarProductoProveedor.setVisible((this.isVisibilidadCeldaCopiarProductoProveedor && this.isPermisoCopiarProductoProveedor));			
			this.jMenuItemVerFormProductoProveedor.setVisible((this.isVisibilidadCeldaVerFormProductoProveedor && this.isPermisoVerFormProductoProveedor));			
			this.jMenuItemAbrirOrderByProductoProveedor.setVisible((this.isVisibilidadCeldaOrdenProductoProveedor && this.isPermisoOrdenProductoProveedor));			
			//this.jMenuItemMostrarOcultarProductoProveedor.setVisible((this.isVisibilidadCeldaOrdenProductoProveedor && this.isPermisoOrdenProductoProveedor));
			this.jMenuItemDetalleAbrirOrderByProductoProveedor.setVisible((this.isVisibilidadCeldaOrdenProductoProveedor && this.isPermisoOrdenProductoProveedor));			
			//this.jMenuItemDetalleMostrarOcultarProductoProveedor.setVisible((this.isVisibilidadCeldaOrdenProductoProveedor && this.isPermisoOrdenProductoProveedor));			
			this.jMenuItemNuevoRelacionesProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProveedor && this.isPermisoNuevoProductoProveedor));			
			this.jMenuItemNuevoGuardarCambiosProductoProveedor.setVisible((this.isVisibilidadCeldaNuevoProductoProveedor && this.isPermisoNuevoProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));									
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemModificarProductoProveedor.setVisible((this.isVisibilidadCeldaModificarProductoProveedor && this.isPermisoActualizarProductoProveedor));	
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemActualizarProductoProveedor.setVisible((this.isVisibilidadCeldaActualizarProductoProveedor && this.isPermisoActualizarProductoProveedor));	
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemEliminarProductoProveedor.setVisible((this.isVisibilidadCeldaEliminarProductoProveedor && this.isPermisoEliminarProductoProveedor));
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemCancelarProductoProveedor.setVisible(this.isVisibilidadCeldaCancelarProductoProveedor);				
			}
			
			this.jMenuItemGuardarCambiosProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));						
			this.jMenuItemGuardarCambiosTablaProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoProveedor=this.jButtonNuevoProductoProveedor.isVisible();
			this.isVisibilidadCeldaDuplicarProductoProveedor=this.jButtonDuplicarProductoProveedor.isVisible();
			this.isVisibilidadCeldaCopiarProductoProveedor=this.jButtonCopiarProductoProveedor.isVisible();
			this.isVisibilidadCeldaVerFormProductoProveedor=this.jButtonVerFormProductoProveedor.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoProveedor=this.jButtonAbrirOrderByProductoProveedor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=this.jButtonNuevoRelacionesProductoProveedor.isVisible();
			this.isVisibilidadCeldaModificarProductoProveedor=this.jButtonModificarProductoProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.isVisibilidadCeldaActualizarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarProductoProveedor.isVisible();
			this.isVisibilidadCeldaEliminarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarProductoProveedor.isVisible();
			this.isVisibilidadCeldaCancelarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarProductoProveedor.isVisible();
			this.isVisibilidadCeldaGuardarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=this.jButtonGuardarCambiosTablaProductoProveedor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoProveedor=this.jButtonNuevoToolBarProductoProveedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=this.jButtonNuevoRelacionesToolBarProductoProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.isVisibilidadCeldaModificarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarToolBarProductoProveedor.isVisible();
			this.isVisibilidadCeldaActualizarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarToolBarProductoProveedor.isVisible();
			this.isVisibilidadCeldaEliminarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarToolBarProductoProveedor.isVisible();
			this.isVisibilidadCeldaCancelarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarToolBarProductoProveedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProveedor=this.jButtonGuardarCambiosToolBarProductoProveedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=this.jButtonGuardarCambiosTablaToolBarProductoProveedor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoProveedor=this.jMenuItemNuevoProductoProveedor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=this.jMenuItemNuevoRelacionesProductoProveedor.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.isVisibilidadCeldaModificarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jMenuItemModificarProductoProveedor.isVisible();
			this.isVisibilidadCeldaActualizarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jMenuItemActualizarProductoProveedor.isVisible();
			this.isVisibilidadCeldaEliminarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jMenuItemEliminarProductoProveedor.isVisible();
			this.isVisibilidadCeldaCancelarProductoProveedor=this.jInternalFrameDetalleFormProductoProveedor.jMenuItemCancelarProductoProveedor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProveedor=this.jMenuItemGuardarCambiosProductoProveedor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=this.jMenuItemGuardarCambiosTablaProductoProveedor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoProveedor(Boolean esInicializar) {
		if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
				//if(this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProveedor();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoProveedor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoProveedor() {
		this.jButtonNuevoProductoProveedor.setVisible(this.isPermisoNuevoProductoProveedor);			
		this.jButtonDuplicarProductoProveedor.setVisible(this.isPermisoDuplicarProductoProveedor);			
		this.jButtonCopiarProductoProveedor.setVisible(this.isPermisoCopiarProductoProveedor);			
		this.jButtonVerFormProductoProveedor.setVisible(this.isPermisoVerFormProductoProveedor);			
		
		this.jButtonAbrirOrderByProductoProveedor.setVisible(this.isPermisoOrdenProductoProveedor);					
		
		this.jButtonNuevoRelacionesProductoProveedor.setVisible(this.isPermisoNuevoProductoProveedor);			
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarProductoProveedor.setVisible(this.isPermisoActualizarProductoProveedor);	
			this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarProductoProveedor.setVisible(this.isPermisoActualizarProductoProveedor);	
			this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarProductoProveedor.setVisible(this.isPermisoEliminarProductoProveedor);
			this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarProductoProveedor.setVisible(this.isVisibilidadCeldaCancelarProductoProveedor);						
			this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.setVisible(this.isPermisoGuardarCambiosProductoProveedor);							
		}
		
		this.jButtonGuardarCambiosTablaProductoProveedor.setVisible(this.isPermisoActualizarProductoProveedor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProveedor() {
		this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarProductoProveedor.setVisible(this.isPermisoActualizarProductoProveedor);	
		this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarProductoProveedor.setVisible(this.isPermisoActualizarProductoProveedor);	
		this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarProductoProveedor.setVisible(this.isPermisoEliminarProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarProductoProveedor.setVisible(this.isVisibilidadCeldaCancelarProductoProveedor);							
		this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.setVisible((this.isVisibilidadCeldaGuardarProductoProveedor && this.isPermisoGuardarCambiosProductoProveedor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoProveedor() {
		if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoProveedor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoProveedor() {
	}
	
	public void jTableDatosProductoProveedorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoProveedor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoproveedor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoProveedor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productoproveedorLogic.getConnexion());

				if(this.productoproveedor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productoproveedor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoProveedor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productoproveedor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoProveedor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productoproveedorLogic.getConnexion());

				if(this.productoproveedor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productoproveedor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoProveedor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productoproveedor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoProveedor(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productoproveedorLogic.getConnexion());

				if(this.productoproveedor.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productoproveedor.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoProveedor.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productoproveedor.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoProveedorActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoProveedor=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoProveedor.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoProveedor.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoProveedor(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productoproveedorLogic.getConnexion());

				if(this.productoproveedor.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productoproveedor.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoProveedor.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productoproveedor.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteProductoProveedorActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoProveedor=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosProductoProveedor.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderProductoProveedor.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteProductoProveedorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebProductoProveedor(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProveedor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProveedor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.productoproveedorLogic.getConnexion());

				if(this.productoproveedor.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.productoproveedor.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProveedor=(TitledBorder)this.jScrollPanelDatosProductoProveedor.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderProductoProveedor.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.productoproveedor.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio_ultimoProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getprecio_ultimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio_ultimo = "+this.productoproveedor.getprecio_ultimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio_acuerdoProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getprecio_acuerdo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio_acuerdo = "+this.productoproveedor.getprecio_acuerdo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_entraProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getdia_entra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_entra = "+this.productoproveedor.getdia_entra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionProductoProveedorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.getproductoproveedor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoproveedor==null) {
						this.productoproveedor = new ProductoProveedor();
					}

					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);
				}

				if(this.productoproveedor.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.productoproveedor.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProveedor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProveedor(false,false);

			this.getProductoProveedorsFK_IdBodega();

			this.inicializarActualizarBindingProductoProveedor(false);

			//if(ProductoProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteProductoProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProveedor(false,false);

			this.getProductoProveedorsFK_IdCliente();

			this.inicializarActualizarBindingProductoProveedor(false);

			//if(ProductoProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductoProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProveedor(false,false);

			this.getProductoProveedorsFK_IdEmpresa();

			this.inicializarActualizarBindingProductoProveedor(false);

			//if(ProductoProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProveedor(false,false);

			this.getProductoProveedorsFK_IdProducto();

			this.inicializarActualizarBindingProductoProveedor(false);

			//if(ProductoProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoProveedorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProveedor(false,false);

			this.getProductoProveedorsFK_IdSucursal();

			this.inicializarActualizarBindingProductoProveedor(false);

			//if(ProductoProveedorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProveedor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproveedorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoProveedor() {
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
			this.jInternalFrameDetalleFormProductoProveedor.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoProveedor.dispose();
			this.jInternalFrameDetalleFormProductoProveedor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
			this.jInternalFrameReporteDinamicoProductoProveedor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoProveedor.dispose();
			this.jInternalFrameReporteDinamicoProductoProveedor=null;
		}
		
		if(this.jInternalFrameImportacionProductoProveedor!=null) {
			this.jInternalFrameImportacionProductoProveedor.setVisible(false);	    			
			this.jInternalFrameImportacionProductoProveedor.dispose();
			this.jInternalFrameImportacionProductoProveedor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoProveedor();
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoProveedor")) {
				jButtonDuplicarProductoProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoProveedor")) {
				jButtonCopiarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoProveedor")) {
				jButtonVerFormProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoProveedor")) {
				jButtonDuplicarProductoProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoProveedor")) {
				jButtonDuplicarProductoProveedorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoProveedor")) {
				jButtonModificarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoProveedor")) {
				jButtonModificarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoProveedor")) {
				jButtonModificarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoProveedor")) {
				jButtonActualizarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoProveedor")) {
				jButtonActualizarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoProveedor")) {
				jButtonActualizarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoProveedor")) {
				jButtonEliminarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoProveedor")) {
				jButtonEliminarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoProveedor")) {
				jButtonEliminarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoProveedor")) {
				jButtonCancelarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoProveedor")) {
				jButtonCancelarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoProveedor")) {
				jButtonCancelarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoProveedor")) {
				jButtonCerrarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoProveedor")) {
				jButtonCerrarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoProveedor")) {
				jButtonCerrarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoProveedor")) {
				jButtonMostrarOcultarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoProveedor")) {
				jButtonCancelarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoProveedor")) {
				jButtonCopiarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoProveedor")) {
				jButtonVerFormProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoProveedor")) {
				jButtonCopiarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoProveedor")) {
				jButtonVerFormProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoProveedor")) {
				jButtonRecargarInformacionProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoProveedor")) {
				jButtonRecargarInformacionProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoProveedor")) {
				jButtonRecargarInformacionProductoProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoProveedor")) {
				jButtonAnterioresProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoProveedor")) {
				jButtonAnterioresProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoProveedor")) {
				jButtonAnterioresProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoProveedor")) {
				jButtonSiguientesProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoProveedor")) {
				jButtonSiguientesProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoProveedor")) {
				jButtonSiguientesProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoProveedor") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoProveedor")) {
				jButtonAbrirOrderByProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoProveedor") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoProveedor")) {
				jButtonMostrarOcultarProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProveedor")) {
				jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoProveedor")) {
				jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoProveedor")) {
				jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoProveedor")) {
				jButtonCerrarReporteDinamicoProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoProveedor")) {
				jButtonGenerarReporteDinamicoProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoProveedor")) {
				
				jButtonGenerarExcelReporteDinamicoProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoProveedor")) {
				jButtonCerrarImportacionProductoProveedorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoProveedor")) {
				
				jButtonGenerarImportacionProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoProveedor")) {
				
				jButtonAbrirImportacionProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoProveedor")) {
				jComboBoxTiposAccionesProductoProveedorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoProveedor")) {
				jComboBoxTiposRelacionesProductoProveedorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoProveedor")) {
				jComboBoxTiposAccionesProductoProveedorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoProveedor")) {
				
				jComboBoxTiposSeleccionarProductoProveedorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoProveedor")) {
				jTextFieldValorCampoGeneralProductoProveedorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoProveedor")) {
				jButtonAbrirOrderByProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoProveedor")) {
				jButtonAbrirOrderByProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoProveedor")) {
				jButtonCerrarOrderByProductoProveedorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProveedorBusqueda")) {
				this.jButtonidProductoProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoProveedorUpdate")) {
				this.jButtonid_empresaProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoProveedorBusqueda")) {
				this.jButtonid_empresaProductoProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoProveedorUpdate")) {
				this.jButtonid_sucursalProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoProveedorBusqueda")) {
				this.jButtonid_sucursalProductoProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoProveedorUpdate")) {
				this.jButtonid_bodegaProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoProveedorBusqueda")) {
				this.jButtonid_bodegaProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoProveedor")) {
				this.jButtonid_productoProductoProveedorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoProveedorUpdate")) {
				this.jButtonid_productoProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoProveedorBusqueda")) {
				this.jButtonid_productoProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteProductoProveedor")) {
				this.jButtonid_clienteProductoProveedorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteProductoProveedorUpdate")) {
				this.jButtonid_clienteProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteProductoProveedorBusqueda")) {
				this.jButtonid_clienteProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_ultimoProductoProveedorBusqueda")) {
				this.jButtonprecio_ultimoProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_acuerdoProductoProveedorBusqueda")) {
				this.jButtonprecio_acuerdoProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_entraProductoProveedorBusqueda")) {
				this.jButtondia_entraProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionProductoProveedorBusqueda")) {
				this.jButtonobservacionProductoProveedorBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteProductoProveedor")) {
				this.jButtonid_clienteProductoProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("id_productoProductoProveedor")) {
				this.jButtonid_productoProductoProveedorActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoProveedor")) {
				this.jButtonFK_IdBodegaProductoProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteProductoProveedor")) {
				this.jButtonFK_IdClienteProductoProveedorActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoProveedor")) {
				this.jButtonFK_IdProductoProductoProveedorActionPerformed(evt);
			}
			
			;
			
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoProveedor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoProveedor productoproveedorLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoproveedorLocal=this.productoproveedor;
			} else {
				productoproveedorLocal=this.productoproveedorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
							
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
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
			
			


			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
								
						
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
								
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
							
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
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
			
			


			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
								
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoProveedor")) {
					jCheckBoxSeleccionarTodosProductoProveedorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoProveedor")) {
					jCheckBoxSeleccionadosProductoProveedorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoProveedor")) {
					
				}
				
				


				
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
												
				
				


				
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
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
			
			


			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProveedorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoproveedor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoproveedor);
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
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
				
				


				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProveedor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProveedor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProveedorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproveedorAnterior =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoProveedor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoProveedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoProveedor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoproveedor =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoproveedor =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoproveedor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoProveedor")) {
				
				}
				
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoProveedor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoProveedor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoProveedor")) {
			
			}
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoProveedor();
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			if(sTipo.equals("NuevoProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoProveedor")) {
				jButtonDuplicarProductoProveedorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoProveedor")) {
				jButtonCopiarProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoProveedor")) {
				jButtonVerFormProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoProveedor")) {
				jButtonNuevoProductoProveedorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoProveedor")) {
				jButtonModificarProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoProveedor")) {
				jButtonActualizarProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoProveedor")) {
				jButtonEliminarProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoProveedor")) {
				jButtonCancelarProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoProveedor")) {
				jButtonCerrarProductoProveedorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoProveedor")) {
				jButtonGuardarCambiosProductoProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProveedor")) {
				jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoProveedor")) {
				jButtonAbrirOrderByProductoProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoProveedor")) {
				jButtonRecargarInformacionProductoProveedorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoProveedor")) {
				jButtonAnterioresProductoProveedorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoProveedor")) {
				jButtonSiguientesProductoProveedorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProveedorBusqueda")) {
				this.jButtonidProductoProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoProveedorUpdate")) {
				this.jButtonid_empresaProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoProveedorBusqueda")) {
				this.jButtonid_empresaProductoProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoProveedorUpdate")) {
				this.jButtonid_sucursalProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoProveedorBusqueda")) {
				this.jButtonid_sucursalProductoProveedorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoProveedorUpdate")) {
				this.jButtonid_bodegaProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoProveedorBusqueda")) {
				this.jButtonid_bodegaProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoProveedor")) {
				this.jButtonid_productoProductoProveedorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoProveedorUpdate")) {
				this.jButtonid_productoProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoProveedorBusqueda")) {
				this.jButtonid_productoProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteProductoProveedor")) {
				this.jButtonid_clienteProductoProveedorActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteProductoProveedorUpdate")) {
				this.jButtonid_clienteProductoProveedorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteProductoProveedorBusqueda")) {
				this.jButtonid_clienteProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_ultimoProductoProveedorBusqueda")) {
				this.jButtonprecio_ultimoProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_acuerdoProductoProveedorBusqueda")) {
				this.jButtonprecio_acuerdoProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_entraProductoProveedorBusqueda")) {
				this.jButtondia_entraProductoProveedorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionProductoProveedorBusqueda")) {
				this.jButtonobservacionProductoProveedorBusquedaActionPerformed(evt);
			}
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoProveedor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoProveedor")) {
				closingInternalFrameProductoProveedor();
				
			} else if(sTipo.equals("jButtonCancelarProductoProveedor")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoProveedor = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoProveedorBeanSwingJInternalFrame jInternalFrameParent=(ProductoProveedorBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProveedor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoProveedorActionPerformed(null);
			}
			
			ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoproveedor,new Object(),this.productoproveedorParameterGeneral,this.productoproveedorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoProveedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoProveedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoProveedor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoproveedor)) {
			if(!esControlTabla) {
				if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);			
				}
				
				if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoProveedor(this.productoproveedor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoproveedorReturnGeneral=productoproveedorLogic.procesarEventosProductoProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoproveedorLogic.getProductoProveedors(),this.productoproveedor,this.productoproveedorParameterGeneral,this.isEsNuevoProductoProveedor,classes);//this.productoproveedorLogic.getProductoProveedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoProveedor(this.productoproveedorReturnGeneral,this.productoproveedorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoProveedor(classes,this.productoproveedorReturnGeneral,this.productoproveedorBean,false);
					}
						
					if(this.productoproveedorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor());	
					}
						
					if(this.productoproveedorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor(),classes);//this.productoproveedorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoProveedor(this.productoproveedor,classes);//this.productoproveedorBean);									
				}
			
				if(ProductoProveedorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoProveedor(this.productoproveedor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProveedor(this.productoproveedor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoproveedorAnterior!=null) {
						this.productoproveedor=this.productoproveedorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoproveedorReturnGeneral=productoproveedorLogic.procesarEventosProductoProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoproveedorLogic.getProductoProveedors(),this.productoproveedor,this.productoproveedorParameterGeneral,this.isEsNuevoProductoProveedor,classes);//this.productoproveedorLogic.getProductoProveedor()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoproveedorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoproveedorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoproveedorReturnGeneral.getProductoProveedor(),productoproveedorLogic.getProductoProveedors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoproveedorReturnGeneral.getProductoProveedor(),this.productoproveedors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoProveedor.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoProveedor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoProveedor();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoProveedor() throws Exception {
		
		ProductoProveedorModel productoproveedorModel=(ProductoProveedorModel)this.jTableDatosProductoProveedor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoproveedorModel.productoproveedors=this.productoproveedorLogic.getProductoProveedors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoproveedorModel.productoproveedors=this.productoproveedors;
		}
		
		
		((ProductoProveedorModel) this.jTableDatosProductoProveedor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoProveedor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoproveedorAnterior(),this.productoproveedorLogic.getProductoProveedors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoproveedorAnterior(),this.productoproveedors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoProveedor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoProveedor(ProductoProveedor productoproveedor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
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
										
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoproveedor,new Object(),generalEntityParameterGeneral,this.productoproveedorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoproveedorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoProveedorConstantesFunciones.getClassesRelationshipsOfProductoProveedor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoProveedorConstantesFunciones.getClassesRelationshipsFromStringsOfProductoProveedor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoProveedor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoProveedorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoproveedor,new Object(),generalEntityParameterGeneral,this.productoproveedorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoProveedor(ProductoProveedorBean productoproveedorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoProveedor(ArrayList<Classe> classes,ProductoProveedorReturnGeneral productoproveedorReturnGeneral,ProductoProveedorBean productoproveedorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoProveedor(ProductoProveedor productoproveedor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoproveedor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoProveedor = new ProductoProveedorDetalleFormJInternalFrame(jDesktopPane,this.productoproveedorSessionBean.getConGuardarRelaciones(),this.productoproveedorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.setVisible(false);
		this.jInternalFrameDetalleFormProductoProveedor.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoProveedor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoProveedor.productoproveedorLogic=this.productoproveedorLogic;
		
		this.cargarCombosFrameForeignKeyProductoProveedor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProveedor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProveedor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoProveedor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoProveedor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoProveedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProveedor"));
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarProductoProveedor.addActionListener(new ButtonActionListener(this,"ModificarProductoProveedor"));

		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProveedor"));
					
		this.jInternalFrameDetalleFormProductoProveedor.jMenuItemModificarProductoProveedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarProductoProveedor.addActionListener (new ButtonActionListener(this,"ActualizarProductoProveedor"));
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProveedor"));
						
		this.jInternalFrameDetalleFormProductoProveedor.jMenuItemActualizarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarProductoProveedor.addActionListener (new ButtonActionListener(this,"EliminarProductoProveedor"));
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProveedor"));
								
		this.jInternalFrameDetalleFormProductoProveedor.jMenuItemEliminarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarProductoProveedor.addActionListener (new ButtonActionListener(this,"CancelarProductoProveedor"));
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProveedor"));
					
		this.jInternalFrameDetalleFormProductoProveedor.jMenuItemCancelarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProveedor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jMenuItemDetalleCerrarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProveedor"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProveedor"));
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProveedor"));
		
		
		
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProveedor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonidProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_empresaProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_empresaProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_sucursalProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_sucursalProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_bodegaProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_bodegaProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProveedorBusqueda"));
		//jButtonid_productoProductoProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedor.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedorBusqueda"));
		//jButtonid_clienteProductoProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteProductoProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedor.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonprecio_ultimoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"precio_ultimoProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonprecio_acuerdoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"precio_acuerdoProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtondia_entraProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"dia_entraProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonobservacionProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"observacionProductoProveedorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProveedor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoProveedor"));
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProveedor"));
		}
		
		this.jTableDatosProductoProveedor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoProveedor"));
		
		this.jTableDatosProductoProveedor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoProveedor"));
		
		this.jButtonNuevoProductoProveedor.addActionListener(new ButtonActionListener(this,"NuevoProductoProveedor"));
		
		this.jButtonDuplicarProductoProveedor.addActionListener(new ButtonActionListener(this,"DuplicarProductoProveedor"));
		
		this.jButtonCopiarProductoProveedor.addActionListener(new ButtonActionListener(this,"CopiarProductoProveedor"));
		
		this.jButtonVerFormProductoProveedor.addActionListener(new ButtonActionListener(this,"VerFormProductoProveedor"));
		
		
		this.jButtonNuevoToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoProveedor"));
			
		this.jButtonDuplicarToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoProveedor"));
			
		this.jMenuItemNuevoProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoProveedor"));
			
		this.jMenuItemDuplicarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoProveedor"));		
		
		
		this.jButtonNuevoRelacionesProductoProveedor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoProveedor"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoProveedor"));
			
		this.jMenuItemNuevoRelacionesProductoProveedor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoProveedor"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarProductoProveedor.addActionListener(new ButtonActionListener(this,"ModificarProductoProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonModificarToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProveedor"));
			
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemModificarProductoProveedor.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarProductoProveedor.addActionListener (new ButtonActionListener(this,"ActualizarProductoProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonActualizarToolBarProductoProveedor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProveedor"));
				
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemActualizarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarProductoProveedor.addActionListener (new ButtonActionListener(this,"EliminarProductoProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonEliminarToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProveedor"));
						
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemEliminarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarProductoProveedor.addActionListener (new ButtonActionListener(this,"CancelarProductoProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonCancelarToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProveedor"));
			
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemCancelarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProveedor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoProveedor"));		
		
		
		this.jButtonCerrarProductoProveedor.addActionListener (new ButtonActionListener(this,"CerrarProductoProveedor"));
		
		
		this.jButtonCerrarToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoProveedor"));
			
		this.jMenuItemCerrarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoProveedor"));
			
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jMenuItemDetalleCerrarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProveedor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoProveedor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProveedor"));
		}
		
		this.jButtonCopiarToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoProveedor"));
			
		this.jButtonVerFormToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoProveedor"));
		
		this.jMenuItemGuardarCambiosProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoProveedor"));
			
		this.jMenuItemCopiarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoProveedor"));		
		
		this.jMenuItemVerFormProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoProveedor"));		
		
		
		this.jButtonGuardarCambiosTablaProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProveedor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoProveedor"));
			
		this.jMenuItemGuardarCambiosTablaProductoProveedor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProveedor"));		
		
		
		
		this.jButtonRecargarInformacionProductoProveedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoProveedor"));
					
		this.jButtonRecargarInformacionToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoProveedor"));
		
		this.jMenuItemRecargarInformacionProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoProveedor"));		
		
		
		
		this.jButtonAnterioresProductoProveedor.addActionListener (new ButtonActionListener(this,"AnterioresProductoProveedor"));
		
		
		this.jButtonAnterioresToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoProveedor"));
		
		this.jMenuItemAnterioresProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoProveedor"));		
		
		
		this.jButtonSiguientesProductoProveedor.addActionListener (new ButtonActionListener(this,"SiguientesProductoProveedor"));
		
		
		this.jButtonSiguientesToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoProveedor"));
			
		this.jMenuItemSiguientesProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoProveedor"));
			
		this.jMenuItemAbrirOrderByProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoProveedor"));
			
		this.jMenuItemMostrarOcultarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoProveedor"));
			
		this.jMenuItemDetalleAbrirOrderByProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoProveedor"));
			
		this.jMenuItemDetalleMostarOcultarProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoProveedor"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoProveedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoProveedor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoProveedor"));
			
		this.jMenuItemNuevoGuardarCambiosProductoProveedor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoProveedor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoProveedor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoProveedor"));

		this.jCheckBoxSeleccionadosProductoProveedor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoProveedor"));
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProveedor"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoProveedor.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoProveedor"));
			
		this.jComboBoxTiposAccionesProductoProveedor.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoProveedor"));
					
		this.jComboBoxTiposSeleccionarProductoProveedor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoProveedor"));
			
		this.jTextFieldValorCampoGeneralProductoProveedor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoProveedor"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonidProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_empresaProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_empresaProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_sucursalProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_sucursalProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_bodegaProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_bodegaProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProveedorBusqueda"));
		//jButtonid_productoProductoProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedor.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedorBusqueda"));
		//jButtonid_clienteProductoProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteProductoProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedor.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonprecio_ultimoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"precio_ultimoProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonprecio_acuerdoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"precio_acuerdoProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtondia_entraProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"dia_entraProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonobservacionProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"observacionProductoProveedorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoProveedor.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoProveedor"));

			this.jButtonFK_IdClienteProductoProveedor.addActionListener(new ButtonActionListener(this,"FK_IdClienteProductoProveedor"));

			this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedor"));

			this.jButtonFK_IdProductoProductoProveedor.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoProveedor"));

			this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoProveedor!=null) {
				this.jInternalFrameReporteDinamicoProductoProveedor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProveedor"));
				this.jInternalFrameReporteDinamicoProductoProveedor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProveedor"));
				this.jInternalFrameReporteDinamicoProductoProveedor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProveedor"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoProveedor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProveedor"));				
			//this.jButtonGenerarReporteDinamicoProductoProveedor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProveedor"));
			//this.jButtonGenerarExcelReporteDinamicoProductoProveedor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProveedor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoProveedor!=null) {
				this.jInternalFrameImportacionProductoProveedor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProveedor"));
				this.jInternalFrameImportacionProductoProveedor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProveedor"));
				this.jInternalFrameImportacionProductoProveedor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProveedor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoProveedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoProveedor"));
			
			this.jButtonAbrirOrderByToolBarProductoProveedor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoProveedor"));			
			
			if(this.jInternalFrameOrderByProductoProveedor!=null) {
				this.jInternalFrameOrderByProductoProveedor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProveedor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProveedor.jTabbedPaneRelacionesProductoProveedor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProveedor"));
		
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
            		closingInternalFrameProductoProveedor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoProveedor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoProveedor = (JInternalFrameBase)event.getSource();
	            	
	            ProductoProveedorBeanSwingJInternalFrame jInternalFrameParent=(ProductoProveedorBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProveedor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoProveedorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoProveedor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoProveedorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoProveedor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoProveedor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProveedorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoProveedor";
		inputMap = this.jButtonNuevoProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProveedorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProveedorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoProveedor";
		inputMap = this.jButtonNuevoRelacionesProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProveedorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoProveedor";
		inputMap = this.jButtonModificarProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoProveedor";
		inputMap = this.jButtonActualizarProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoProveedor";
		inputMap = this.jButtonEliminarProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoProveedor";
		inputMap = this.jButtonCancelarProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoProveedor";
		inputMap = this.jButtonCerrarProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoProveedor";
		inputMap = this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoProveedor.jButtonGuardarCambiosProductoProveedor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoProveedorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoProveedor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoProveedorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoProveedor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoProveedorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonidProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_empresaProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_empresaProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_sucursalProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_sucursalProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoProveedorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_bodegaProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_bodegaProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProveedorBusqueda"));
		//jButtonid_productoProductoProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedor.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedorBusqueda"));
		//jButtonid_clienteProductoProveedor.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteProductoProveedorActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedor.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedor"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedorUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonprecio_ultimoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"precio_ultimoProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonprecio_acuerdoProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"precio_acuerdoProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtondia_entraProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"dia_entraProductoProveedorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProveedor.jButtonobservacionProductoProveedorBusqueda.addActionListener(new ButtonActionListener(this,"observacionProductoProveedorBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoProveedor.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoProveedor"));

		this.jButtonFK_IdClienteProductoProveedor.addActionListener(new ButtonActionListener(this,"FK_IdClienteProductoProveedor"));

		this.jButtonBuscarFK_IdClienteid_clienteProductoProveedor.addActionListener(new ButtonActionListener(this,"id_clienteProductoProveedor"));

		this.jButtonFK_IdProductoProductoProveedor.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoProveedor"));

		this.jButtonBuscarFK_IdProductoid_productoProductoProveedor.addActionListener(new ButtonActionListener(this,"id_productoProductoProveedor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoProveedor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoProveedorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoProveedorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoProveedor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoProveedor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
					productoproveedorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProveedor productoproveedorAux:productoproveedors) {
					productoproveedorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoProveedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProveedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
						productoproveedorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProveedor productoproveedorAux:productoproveedors) {
						productoproveedorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProveedor productoproveedorAux:productoproveedors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProveedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProveedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProveedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoProveedorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProveedor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoProveedor.getSelectedRows();
			
			ProductoProveedor productoproveedorLocal=new ProductoProveedor();
			
			//this.seleccionarTodosProductoProveedor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproveedorLocal =(ProductoProveedor) this.productoproveedorLogic.getProductoProveedors().toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoproveedorLocal =(ProductoProveedor) this.productoproveedors.toArray()[this.jTableDatosProductoProveedor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoproveedorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
						productoproveedorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProveedor productoproveedorAux:productoproveedors) {
						productoproveedorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoProveedor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProveedor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProveedor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProveedor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoProveedorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoProveedorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoProveedorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoProveedor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoProveedor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProveedor productoproveedorAux:this.productoproveedorLogic.getProductoProveedors()) {
				
						if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO)) {
							existe=true;
							productoproveedorAux.setprecio_ultimo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO)) {
							existe=true;
							productoproveedorAux.setprecio_acuerdo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA)) {
							existe=true;
							productoproveedorAux.setdia_entra(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							productoproveedorAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProveedor productoproveedorAux:productoproveedors) {
					
						if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO)) {
							existe=true;
							productoproveedorAux.setprecio_ultimo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO)) {
							existe=true;
							productoproveedorAux.setprecio_acuerdo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA)) {
							existe=true;
							productoproveedorAux.setdia_entra(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							productoproveedorAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProveedor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoProveedorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoProveedor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoProveedor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoProveedor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoProveedor) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoProveedor(conSplash);
				
					this.generarReporteProductoProveedorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoProveedorsSeleccionados();
				//this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProveedorsSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProveedorsSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProveedor();
				
				this.exportarProductoProveedorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoProveedors();
				//this.importarProductoProveedors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProveedor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoProveedorsSeleccionados();
				//this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoProveedor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoProveedor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoProveedor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoProveedorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoProveedor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoProveedor(conSplash);
					
						//this.actualizarParametrosGeneralProductoProveedor();
						
						this.generarReporteProcesoAccionProductoProveedorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoProveedorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto ProveedorS SELECCIONADOS?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoProveedor();
				
						this.actualizarParametrosGeneralProductoProveedor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoproveedorReturnGeneral=productoproveedorLogic.procesarAccionProductoProveedorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoproveedorLogic.getProductoProveedors(),this.productoproveedorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoProveedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoProveedor();
					
					ProductoProveedorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoProveedorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProveedor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProveedor.jComboBoxTiposAccionesFormularioProductoProveedor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoProveedor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoProveedorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoProveedor();
			
			if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
			ProductoProveedor productoproveedor=new ProductoProveedor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoProveedor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoProveedor.getSelectedItem();
			
			
			
			
			productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoproveedorsSeleccionados.size()==1) {
				for(ProductoProveedor productoproveedorAux:productoproveedorsSeleccionados) {
					productoproveedor=productoproveedorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoProveedor();
			
      		//this.finishProcessProductoProveedor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoProveedorReturnGeneral() throws Exception {
		if(this.productoproveedorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoproveedorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoproveedorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoproveedorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoproveedorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoproveedorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoProveedor(false);
		}
		
		if(this.productoproveedorReturnGeneral.getConRetornoLista() || this.productoproveedorReturnGeneral.getConRetornoObjeto()) {
			if(this.productoproveedorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoproveedorLogic.setProductoProveedors(this.productoproveedorReturnGeneral.getProductoProveedors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoproveedorReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoproveedorLogic.setProductoProveedor(this.productoproveedorReturnGeneral.getProductoProveedor());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoProveedor(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoProveedor() throws Exception {
		
		
	}
	
	public ArrayList<ProductoProveedor> getProductoProveedorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoProveedor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoProveedor productoproveedorAux:productoproveedorLogic.getProductoProveedors()) {
					if(productoproveedorAux.getIsSelected()) {
						productoproveedorsSeleccionados.add(productoproveedorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProveedor productoproveedorAux:this.productoproveedors) {
					if(productoproveedorAux.getIsSelected()) {
						productoproveedorsSeleccionados.add(productoproveedorAux);				
					}
				}
			}
			
			if(productoproveedorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoproveedorsSeleccionados.addAll(this.productoproveedorLogic.getProductoProveedors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoproveedorsSeleccionados.addAll(this.productoproveedors);				
					}
				}
			}
		} else {
			productoproveedorsSeleccionados.add(this.productoproveedor);
		}
		
		return productoproveedorsSeleccionados;
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
	
	public void generarReporteProductoProveedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoProveedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoProveedorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProveedorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProveedorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoProveedorsSeleccionados() throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoProveedorsSeleccionados() throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoProveedorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoProveedorsSeleccionados() throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoProveedor();
		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoProveedor();
		
		
		//this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados ,productoproveedorImplementable,productoproveedorImplementableHome);
	}
	
	public void mostrarImportacionProductoProveedors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoProveedor();
		
		this.abrirFrameImportacionProductoProveedor();		
		
			
		//this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados ,productoproveedorImplementable,productoproveedorImplementableHome);
	}
	
	public void importarProductoProveedors() throws Exception {		
	
	}
	
	public void exportarProductoProveedorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoProveedorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoProveedorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoProveedorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoProveedorsSeleccionados() throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoProveedor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoProveedor productoproveedorAux:productoproveedorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoProveedor(productoproveedorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoproveedorAux.setsDetalleGeneralEntityReporte(productoproveedorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoProveedor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_DIAENTRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProveedorConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoProveedor(ProductoProveedor productoproveedor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoproveedor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getprecio_ultimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getprecio_acuerdo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getdia_entra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoproveedor.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoProveedorsSeleccionados() throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoProveedors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoProveedor(row);				
				iRow++;
			}				
			
			for(ProductoProveedor productoproveedorAux:productoproveedorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoProveedor(productoproveedorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoProveedorsSeleccionados() throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();		
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoproveedor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoproveedors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoproveedor");
			//elementRoot.appendChild(element);
		
			for(ProductoProveedor productoproveedorAux:productoproveedorsSeleccionados) {
				element = document.createElement("productoproveedor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoProveedor(productoproveedorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoProveedor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_PRECIOULTIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_PRECIOACUERDO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoProveedor(ProductoProveedor productoproveedor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getprecio_ultimo());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getprecio_acuerdo());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getdia_entra());
		cell = row.createCell(iColumn++);cell.setCellValue(productoproveedor.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlProductoProveedor(ProductoProveedor productoproveedor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoProveedorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoproveedor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoProveedorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoproveedor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoProveedorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productoproveedor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoProveedorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productoproveedor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoProveedorConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productoproveedor.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoProveedorConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productoproveedor.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementcliente_descripcion = document.createElement(ProductoProveedorConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(productoproveedor.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementprecio_ultimo = document.createElement(ProductoProveedorConstantesFunciones.PRECIOULTIMO);
		elementprecio_ultimo.appendChild(document.createTextNode(productoproveedor.getprecio_ultimo().toString().trim()));
		element.appendChild(elementprecio_ultimo);

		Element elementprecio_acuerdo = document.createElement(ProductoProveedorConstantesFunciones.PRECIOACUERDO);
		elementprecio_acuerdo.appendChild(document.createTextNode(productoproveedor.getprecio_acuerdo().toString().trim()));
		element.appendChild(elementprecio_acuerdo);

		Element elementdia_entra = document.createElement(ProductoProveedorConstantesFunciones.DIAENTRA);
		elementdia_entra.appendChild(document.createTextNode(productoproveedor.getdia_entra().toString().trim()));
		element.appendChild(elementdia_entra);

		Element elementobservacion = document.createElement(ProductoProveedorConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(productoproveedor.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoProductoProveedorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoProveedor> productoproveedorsSeleccionados=new ArrayList<ProductoProveedor>();
		
		productoproveedorsSeleccionados=this.getProductoProveedorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoProveedor(productoproveedorsSeleccionados);
		
		this.generarReporteProductoProveedors("Todos",productoproveedorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoProveedor(ArrayList<ProductoProveedor> productoproveedorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoProveedor productoproveedorAux:productoproveedorsSeleccionados) {
				productoproveedorAux.setsDetalleGeneralEntityReporte(productoproveedorAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_DIAENTRA)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getdia_entra().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoProveedorConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					productoproveedorAux.setsDescripcionGeneralEntityReporte1(productoproveedorAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProveedorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoProveedor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoProveedor=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=true;
				this.isVisibilidadCeldaGuardarCambiosProductoProveedor=true;
			}
			
			this.isVisibilidadCeldaModificarProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=false;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
			this.isVisibilidadCeldaModificarProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=true;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
			this.isVisibilidadCeldaModificarProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=true;
			this.isVisibilidadCeldaEliminarProductoProveedor=true;
			this.isVisibilidadCeldaCancelarProductoProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
			this.isVisibilidadCeldaModificarProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=true;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=true;
			this.isVisibilidadCeldaModificarProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=false;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
			this.isVisibilidadCeldaActualizarProductoProveedor=false;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
			this.isVisibilidadCeldaModificarProductoProveedor=true;
			this.isVisibilidadCeldaActualizarProductoProveedor=false;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
			this.isVisibilidadCeldaCancelarProductoProveedor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProveedor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoProveedorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoProveedor=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=true;
		} else {
			this.actualizarEstadoPanelsProductoProveedor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoProveedor=false;
			//this.isVisibilidadCeldaVerFormProductoProveedor=false;
			this.isVisibilidadCeldaDuplicarProductoProveedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoproveedorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoProveedor=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProveedor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoproveedorSessionBean.getEsGuardarRelacionado()) {
			if(!productoproveedorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;												
			}
			
			this.jButtonCerrarProductoProveedor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProveedor=false;
		}
		
		if(!this.permiteMantenimiento(this.productoproveedor)) {
			this.isVisibilidadCeldaActualizarProductoProveedor=false;
			this.isVisibilidadCeldaEliminarProductoProveedor=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProveedor() {
	}
	
	public void actualizarEstadoPanelsProductoProveedor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoProveedor!=null) {
				this.jScrollPanelDatosEdicionProductoProveedor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProveedor!=null) {
				this.jScrollPanelDatosProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProveedor!=null) {
				this.jPanelPaginacionProductoProveedor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
					this.jTabbedPaneBusquedasProductoProveedor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoproveedorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProveedor!=null) {
				this.jTabbedPaneBusquedasProductoProveedor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoProveedor!=null) {
				this.jPanelParametrosReportesProductoProveedor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdBodegaProductoProveedor);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdClienteProductoProveedor);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdProductoProductoProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdBodegaProductoProveedor);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdClienteProductoProveedor);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdProductoProductoProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdBodegaProductoProveedor);}

			this.isVisibilidadFK_IdCliente=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdClienteProductoProveedor);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdProductoProductoProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdBodegaProductoProveedor);}

			this.isVisibilidadFK_IdCliente=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdClienteProductoProveedor);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdProductoProductoProveedor);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdBodega=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdBodegaProductoProveedor);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdClienteProductoProveedor);}

			this.isVisibilidadFK_IdProducto=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProveedor.remove(jPanelFK_IdProductoProductoProveedor);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoProveedorParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productoproveedorSessionBean==null) {
				productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productoproveedorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productoproveedorFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoProveedorConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoProveedor(true);
			//productoSessionBean.setlidProductoProveedorActual(this.idProductoProveedorActual);

			productoproveedorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoProveedor(true);
			productoproveedorSessionBean.setlIdProductoProveedorActualForeignKey(this.idProductoProveedorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionProductoProveedorParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(productoproveedorSessionBean==null) {
				productoproveedorSessionBean=new ProductoProveedorSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(productoproveedorSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.productoproveedorFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ProductoProveedorConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionProductoProveedor(true);
			//clienteSessionBean.setlidProductoProveedorActual(this.idProductoProveedorActual);

			productoproveedorSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoProveedor(true);
			productoproveedorSessionBean.setlIdProductoProveedorActualForeignKey(this.idProductoProveedorActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoProveedorSessionBean productoproveedorSessionBean=new ProductoProveedorSessionBean();
		
		if(this.productoproveedorSessionBean==null) {
			this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
		}
		
		this.productoproveedorSessionBean.setsUltimaBusquedaProductoProveedor(this.getsAccionBusqueda());
		this.productoproveedorSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoproveedorSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productoproveedorSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			productoproveedorSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productoproveedorSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productoproveedorSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productoproveedorSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoProveedorSessionBean productoproveedorSessionBean=new ProductoProveedorSessionBean();
		
		if(this.productoproveedorSessionBean==null) {
			this.productoproveedorSessionBean=new ProductoProveedorSessionBean();
		}
		
		if(this.productoproveedorSessionBean.getsUltimaBusquedaProductoProveedor()!=null&&!this.productoproveedorSessionBean.getsUltimaBusquedaProductoProveedor().equals("")) {
			this.setsAccionBusqueda(productoproveedorSessionBean.getsUltimaBusquedaProductoProveedor());
			this.setiNumeroPaginacion(productoproveedorSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoproveedorSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productoproveedorSessionBean.getid_bodega());
				productoproveedorSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(productoproveedorSessionBean.getid_cliente());
				productoproveedorSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productoproveedorSessionBean.getid_empresa());
				productoproveedorSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productoproveedorSessionBean.getid_producto());
				productoproveedorSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productoproveedorSessionBean.getid_sucursal());
				productoproveedorSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productoproveedorSessionBean.setsUltimaBusquedaProductoProveedor("");
		this.productoproveedorSessionBean.setiNumeroPaginacion(ProductoProveedorConstantesFunciones.INUMEROPAGINACION);
		this.productoproveedorSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoProveedor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoProveedor() {
		this.updateBorderResaltarBusquedasFormularioProductoProveedor();
		this.updateVisibilidadBusquedasFormularioProductoProveedor();
		this.updateHabilitarBusquedasFormularioProductoProveedor();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoProveedor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoProveedor.getComponents().length>0) {
	

		if(this.productoproveedorConstantesFunciones.resaltarFK_IdBodegaProductoProveedor!=null) {
			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdBodegaProductoProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
				jPanel.setBorder(this.productoproveedorConstantesFunciones.resaltarFK_IdBodegaProductoProveedor);
			}
		}

		if(this.productoproveedorConstantesFunciones.resaltarFK_IdClienteProductoProveedor!=null) {
			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdClienteProductoProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
				jPanel.setBorder(this.productoproveedorConstantesFunciones.resaltarFK_IdClienteProductoProveedor);
			}
		}

		if(this.productoproveedorConstantesFunciones.resaltarFK_IdProductoProductoProveedor!=null) {
			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdProductoProductoProveedor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
				jPanel.setBorder(this.productoproveedorConstantesFunciones.resaltarFK_IdProductoProductoProveedor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoProveedor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoProveedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdBodegaProductoProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproveedorConstantesFunciones.mostrarFK_IdBodegaProductoProveedor);
			if(!this.productoproveedorConstantesFunciones.mostrarFK_IdBodegaProductoProveedor && index>-1) {
				this.jTabbedPaneBusquedasProductoProveedor.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdClienteProductoProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproveedorConstantesFunciones.mostrarFK_IdClienteProductoProveedor);
			if(!this.productoproveedorConstantesFunciones.mostrarFK_IdClienteProductoProveedor && index>-1) {
				this.jTabbedPaneBusquedasProductoProveedor.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdProductoProductoProveedor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproveedorConstantesFunciones.mostrarFK_IdProductoProductoProveedor);
			if(!this.productoproveedorConstantesFunciones.mostrarFK_IdProductoProductoProveedor && index>-1) {
				this.jTabbedPaneBusquedasProductoProveedor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoProveedor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoProveedor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdBodegaProductoProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproveedorConstantesFunciones.activarFK_IdBodegaProductoProveedor);
				this.jTabbedPaneBusquedasProductoProveedor.setEnabledAt(index,this.productoproveedorConstantesFunciones.activarFK_IdBodegaProductoProveedor);
			}

			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdClienteProductoProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproveedorConstantesFunciones.activarFK_IdClienteProductoProveedor);
				this.jTabbedPaneBusquedasProductoProveedor.setEnabledAt(index,this.productoproveedorConstantesFunciones.activarFK_IdClienteProductoProveedor);
			}

			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdProductoProductoProveedor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproveedorConstantesFunciones.activarFK_IdProductoProductoProveedor);
				this.jTabbedPaneBusquedasProductoProveedor.setEnabledAt(index,this.productoproveedorConstantesFunciones.activarFK_IdProductoProductoProveedor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoProveedor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdBodegaProductoProveedor);

			this.jTabbedPaneBusquedasProductoProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);

			this.productoproveedorConstantesFunciones.setResaltarFK_IdBodegaProductoProveedor(resaltar);

			jPanel.setBorder(this.productoproveedorConstantesFunciones.resaltarFK_IdBodegaProductoProveedor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdClienteProductoProveedor);

			this.jTabbedPaneBusquedasProductoProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);

			this.productoproveedorConstantesFunciones.setResaltarFK_IdClienteProductoProveedor(resaltar);

			jPanel.setBorder(this.productoproveedorConstantesFunciones.resaltarFK_IdClienteProductoProveedor);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoProveedor.indexOfComponent(this.jPanelFK_IdProductoProductoProveedor);

			this.jTabbedPaneBusquedasProductoProveedor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProveedor.getComponent(index);

			this.productoproveedorConstantesFunciones.setResaltarFK_IdProductoProductoProveedor(resaltar);

			jPanel.setBorder(this.productoproveedorConstantesFunciones.resaltarFK_IdProductoProductoProveedor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoProveedor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoProveedor() throws Exception {

		if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoProveedor();
		this.updateVisibilidadResaltarControlesFormularioProductoProveedor();
		this.updateHabilitarResaltarControlesFormularioProductoProveedor();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoProveedor() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoproveedorConstantesFunciones.resaltaridProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltaridProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarid_empresaProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarid_empresaProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarid_sucursalProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarid_sucursalProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarid_bodegaProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarid_bodegaProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarid_productoProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarid_productoProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarid_clienteProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarid_clienteProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarprecio_ultimoProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarprecio_ultimoProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarprecio_acuerdoProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarprecio_acuerdoProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltardia_entraProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltardia_entraProductoProveedor);}
		if(this.productoproveedorConstantesFunciones.resaltarobservacionProductoProveedor!=null && this.jInternalFrameDetalleFormProductoProveedor!=null) {this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setBorder(this.productoproveedorConstantesFunciones.resaltarobservacionProductoProveedor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoProveedor() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
	
		//this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostraridProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelidProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostraridProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_empresaProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelid_empresaProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_empresaProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_sucursalProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelid_sucursalProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_sucursalProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_bodegaProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelid_bodegaProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_bodegaProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_productoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelid_productoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_productoProductoProveedor);
			this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_productoProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_clienteProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelid_clienteProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_clienteProductoProveedor);
			this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarid_clienteProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarprecio_ultimoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelprecio_ultimoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarprecio_ultimoProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarprecio_acuerdoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelprecio_acuerdoProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarprecio_acuerdoProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrardia_entraProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPaneldia_entraProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrardia_entraProductoProveedor);
		//this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarobservacionProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jPanelobservacionProductoProveedor.setVisible(this.productoproveedorConstantesFunciones.mostrarobservacionProductoProveedor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoProveedor() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProveedor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProveedor!=null) {
	
		this.jInternalFrameDetalleFormProductoProveedor.jLabelidProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activaridProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_empresaProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_empresaProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_sucursalProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_sucursalProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_bodegaProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_bodegaProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_productoProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_productoProductoProveedor);
			this.jInternalFrameDetalleFormProductoProveedor.jButtonid_productoProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_productoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jComboBoxid_clienteProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_clienteProductoProveedor);
			this.jInternalFrameDetalleFormProductoProveedor.jButtonid_clienteProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarid_clienteProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_ultimoProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarprecio_ultimoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextFieldprecio_acuerdoProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarprecio_acuerdoProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextFielddia_entraProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activardia_entraProductoProveedor);
		this.jInternalFrameDetalleFormProductoProveedor.jTextAreaobservacionProductoProveedor.setEnabled(this.productoproveedorConstantesFunciones.activarobservacionProductoProveedor);
		}
	}
	
		
}