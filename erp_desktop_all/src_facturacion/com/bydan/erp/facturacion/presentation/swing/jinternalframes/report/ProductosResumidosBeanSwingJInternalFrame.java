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

//import com.bydan.erp.facturacion.util.ProductosResumidosConstantesFunciones;
import com.bydan.erp.facturacion.util.report.ProductosResumidosParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.ProductosResumidosParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.ProductosResumidosBean;
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
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductosResumidosBeanSwingJInternalFrame extends ProductosResumidosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosResumidosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosResumidos> productosresumidosValidator = new ClassValidator<ProductosResumidos>(ProductosResumidos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosResumidos productosresumidos;	
	public ProductosResumidos productosresumidosAux;
	public ProductosResumidos productosresumidosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosResumidos productosresumidosTotales;
	public Long idProductosResumidosActual;
	public Long iIdNuevoProductosResumidos=0L;
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
	
	public Boolean isPermisoTodoProductosResumidos;
	public Boolean isPermisoNuevoProductosResumidos;
	public Boolean isPermisoActualizarProductosResumidos;
	public Boolean isPermisoActualizarOriginalProductosResumidos;
	public Boolean isPermisoEliminarProductosResumidos;
	public Boolean isPermisoGuardarCambiosProductosResumidos;
	public Boolean isPermisoConsultaProductosResumidos;
	public Boolean isPermisoBusquedaProductosResumidos;
	public Boolean isPermisoReporteProductosResumidos;
	public Boolean isPermisoPaginacionMedioProductosResumidos;
	public Boolean isPermisoPaginacionAltoProductosResumidos;
	public Boolean isPermisoPaginacionTodoProductosResumidos;
	public Boolean isPermisoCopiarProductosResumidos;
	public Boolean isPermisoVerFormProductosResumidos;
	public Boolean isPermisoDuplicarProductosResumidos;
	public Boolean isPermisoOrdenProductosResumidos;
	
	
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
	
	public ProductosResumidosParameterReturnGeneral productosresumidosReturnGeneral;
	public ProductosResumidosParameterReturnGeneral productosresumidosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosResumidos=false;
	public Boolean esParaAccionDesdeFormularioProductosResumidos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosResumidosSessionBeanAdditional productosresumidosSessionBeanAdditional=null;
	
	public ProductosResumidosSessionBeanAdditional getProductosResumidosSessionBeanAdditional() {
		return this.productosresumidosSessionBeanAdditional;
	}
	
	public void setProductosResumidosSessionBeanAdditional(ProductosResumidosSessionBeanAdditional productosresumidosSessionBeanAdditional) {
		try {
			this.productosresumidosSessionBeanAdditional=productosresumidosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosResumidosBeanSwingJInternalFrameAdditional productosresumidosBeanSwingJInternalFrameAdditional=null;
	//public class ProductosResumidosBeanSwingJInternalFrame
	
	public ProductosResumidosBeanSwingJInternalFrameAdditional getProductosResumidosBeanSwingJInternalFrameAdditional() {
		return this.productosresumidosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosResumidosBeanSwingJInternalFrameAdditional(ProductosResumidosBeanSwingJInternalFrameAdditional productosresumidosBeanSwingJInternalFrameAdditional) {
		try {
			this.productosresumidosBeanSwingJInternalFrameAdditional=productosresumidosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosResumidosLogic productosresumidosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosResumidos productosresumidosBean;
	public ProductosResumidosConstantesFunciones productosresumidosConstantesFunciones;
	//public ProductosResumidosParameterReturnGeneral productosresumidosReturnGeneral;
	
	//FK
	
	public ProductoLogic productoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<ProductosResumidos> productosresumidoss;	
	//public List<ProductosResumidos> productosresumidossEliminados;
	//public List<ProductosResumidos> productosresumidossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosResumidos=false;
	public Boolean isVisibilidadCeldaDuplicarProductosResumidos=true;
	public Boolean isVisibilidadCeldaCopiarProductosResumidos=true;
	public Boolean isVisibilidadCeldaVerFormProductosResumidos=true;
	public Boolean isVisibilidadCeldaOrdenProductosResumidos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
	public Boolean isVisibilidadCeldaModificarProductosResumidos=false;
	public Boolean isVisibilidadCeldaActualizarProductosResumidos=false;
	public Boolean isVisibilidadCeldaEliminarProductosResumidos=false;
	public Boolean isVisibilidadCeldaCancelarProductosResumidos=false;
	public Boolean isVisibilidadCeldaGuardarProductosResumidos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosResumidos=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosResumidos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductosResumidos() {
		return this.iIdNuevoProductosResumidos;
	}

	public void setiIdNuevoProductosResumidos(Long iIdNuevoProductosResumidos) {
		this.iIdNuevoProductosResumidos = iIdNuevoProductosResumidos;
	}
	
	public Long getidProductosResumidosActual() {
		return this.idProductosResumidosActual;
	}

	public void setidProductosResumidosActual(Long idProductosResumidosActual) {
		this.idProductosResumidosActual = idProductosResumidosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosResumidos getproductosresumidos() {
		return this.productosresumidos;
	}

	public void setproductosresumidos(ProductosResumidos productosresumidos) {
		this.productosresumidos = productosresumidos;
	}
	
	public ProductosResumidos getproductosresumidosAux() {
		return this.productosresumidosAux;
	}

	public void setproductosresumidosAux(ProductosResumidos productosresumidosAux) {
		this.productosresumidosAux = productosresumidosAux;
	}				
	
	public ProductosResumidos getproductosresumidosAnterior() {
		return this.productosresumidosAnterior;
	}

	public void setproductosresumidosAnterior(ProductosResumidos productosresumidosAnterior) {
		this.productosresumidosAnterior = productosresumidosAnterior;
	}	
	
	public ProductosResumidos getproductosresumidosTotales() {
		return this.productosresumidosTotales;
	}

	public void setproductosresumidosTotales(ProductosResumidos productosresumidosTotales) {
		this.productosresumidosTotales = productosresumidosTotales;
	}	
	
	public ProductosResumidos getproductosresumidosBean() {
		return this.productosresumidosBean;
	}

	public void setproductosresumidosBean(ProductosResumidos productosresumidosBean) {
		this.productosresumidosBean = productosresumidosBean;
	}	
	
	public ProductosResumidosParameterReturnGeneral getproductosresumidosReturnGeneral() {
		return this.productosresumidosReturnGeneral;
	}

	public void setproductosresumidosReturnGeneral(ProductosResumidosParameterReturnGeneral productosresumidosReturnGeneral) {
		this.productosresumidosReturnGeneral = productosresumidosReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaProductosResumidos=-1L;

	public Long getid_productoBusquedaProductosResumidos() {
		return this.id_productoBusquedaProductosResumidos;
	}

	public void setid_productoBusquedaProductosResumidos(Long id_productoBusquedaProductosResumidos) {
		this.id_productoBusquedaProductosResumidos = id_productoBusquedaProductosResumidos;
	}

;
	public Date fecha_emision_desdeBusquedaProductosResumidos=new Date();

	public Date getfecha_emision_desdeBusquedaProductosResumidos() {
		return this.fecha_emision_desdeBusquedaProductosResumidos;
	}

	public void setfecha_emision_desdeBusquedaProductosResumidos(Date fecha_emision_desdeBusquedaProductosResumidos) {
		this.fecha_emision_desdeBusquedaProductosResumidos = fecha_emision_desdeBusquedaProductosResumidos;
	}

;
	public Date fecha_emision_hastaBusquedaProductosResumidos=new Date();

	public Date getfecha_emision_hastaBusquedaProductosResumidos() {
		return this.fecha_emision_hastaBusquedaProductosResumidos;
	}

	public void setfecha_emision_hastaBusquedaProductosResumidos(Date fecha_emision_hastaBusquedaProductosResumidos) {
		this.fecha_emision_hastaBusquedaProductosResumidos = fecha_emision_hastaBusquedaProductosResumidos;
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
	
	
	public ProductosResumidosLogic getProductosResumidosLogic()	{		
		return productosresumidosLogic;
	}

	public void setProductosResumidosLogic(ProductosResumidosLogic productosresumidosLogic) {
		this.productosresumidosLogic = productosresumidosLogic;
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
	
	public Boolean getIsEsNuevoProductosResumidos() {
		return isEsNuevoProductosResumidos;
	}

	public void setIsEsNuevoProductosResumidos(Boolean isEsNuevoProductosResumidos) {
		this.isEsNuevoProductosResumidos = isEsNuevoProductosResumidos;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosResumidos() {
		return esParaAccionDesdeFormularioProductosResumidos;
	}
	
	public void setEsParaAccionDesdeFormularioProductosResumidos(Boolean esParaAccionDesdeFormularioProductosResumidos) {
		this.esParaAccionDesdeFormularioProductosResumidos = esParaAccionDesdeFormularioProductosResumidos;
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

			if(this.productosresumidosSessionBean==null) {
				this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
			}

			if(!this.productosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productosresumidosSessionBean.getlidProductoActual());
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

			if(this.productosresumidosSessionBean==null) {
				this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
			}

			if(!this.productosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosresumidosSessionBean.getlidEmpresaActual());
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

			if(this.productosresumidosSessionBean==null) {
				this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
			}

			if(!this.productosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosresumidosSessionBean.getlidSucursalActual());
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

					if(this.productosresumidos!=null) {
						this.productosresumidos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
						this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductosResumidos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
						if(this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosResumidos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProductosResumidosProductosResumidos!=null) {
						jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProductosResumidosProductosResumidos!=null) {
							//jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.getItemCount()>0) {
								jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductosResumidosGenerico)throws Exception
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
				jComboBoxid_productoProductosResumidosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductosResumidosGenerico!=null && jComboBoxid_productoProductosResumidosGenerico.getItemCount()>0) {
					jComboBoxid_productoProductosResumidosGenerico.setSelectedIndex(0);
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

					if(this.productosresumidos!=null) {
						this.productosresumidos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
						this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosResumidos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
						if(this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosResumidosGenerico)throws Exception
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
				jComboBoxid_empresaProductosResumidosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosResumidosGenerico!=null && jComboBoxid_empresaProductosResumidosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosResumidosGenerico.setSelectedIndex(0);
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

					if(this.productosresumidos!=null) {
						this.productosresumidos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
						this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductosResumidos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
						if(this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosResumidosGenerico)throws Exception
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
				jComboBoxid_sucursalProductosResumidosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosResumidosGenerico!=null && jComboBoxid_sucursalProductosResumidosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosResumidosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductosResumidos productosresumidos,JComboBox jComboBoxid_productoProductosResumidosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductosResumidosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductosResumidosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productosresumidos.setid_producto(productoAux.getId());
				productosresumidos.setproducto_descripcion(ProductosResumidosConstantesFunciones.getProductoDescripcion(productoAux));
				productosresumidos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosResumidos productosresumidos,JComboBox jComboBoxid_empresaProductosResumidosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosResumidosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosResumidosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productosresumidos.setid_empresa(empresaAux.getId());
				productosresumidos.setempresa_descripcion(ProductosResumidosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productosresumidos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductosResumidos productosresumidos,JComboBox jComboBoxid_sucursalProductosResumidosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosResumidosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosResumidosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productosresumidos.setid_sucursal(sucursalAux.getId());
				productosresumidos.setsucursal_descripcion(ProductosResumidosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productosresumidos.setSucursal(sucursalAux);			}
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

					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) { 
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosResumidos!=null) { 
					}

					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosResumidos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.addItem(producto);
							}
						}

						if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) { 
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosResumidos!=null) { 
					}

					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) { 
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosResumidos!=null) { 
					}

					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesProductosResumidos() throws Exception {
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
		
	public ProductosResumidosParameterReturnGeneral getProductosResumidosParameterGeneral() {
		return this.productosresumidosParameterGeneral;
	}
	
	public void setProductosResumidosParameterGeneral(ProductosResumidosParameterReturnGeneral productosresumidosParameterGeneral) {
		this.productosresumidosParameterGeneral = productosresumidosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosResumidos() {
		return isPermisoTodoProductosResumidos;
	}

	public void setIsPermisoTodoProductosResumidos(Boolean isPermisoTodoProductosResumidos) {
		this.isPermisoTodoProductosResumidos = isPermisoTodoProductosResumidos;
	}

	public Boolean getIsPermisoNuevoProductosResumidos() {
		return isPermisoNuevoProductosResumidos;
	}

	public void setIsPermisoNuevoProductosResumidos(Boolean isPermisoNuevoProductosResumidos) {
		this.isPermisoNuevoProductosResumidos = isPermisoNuevoProductosResumidos;
	}

	public Boolean getIsPermisoActualizarProductosResumidos() {
		return isPermisoActualizarProductosResumidos;
	}

	public void setIsPermisoActualizarProductosResumidos(Boolean isPermisoActualizarProductosResumidos) {
		this.isPermisoActualizarProductosResumidos = isPermisoActualizarProductosResumidos;
	}

	public Boolean getIsPermisoEliminarProductosResumidos() {
		return isPermisoEliminarProductosResumidos;
	}

	public void setIsPermisoEliminarProductosResumidos(Boolean isPermisoEliminarProductosResumidos) {
		this.isPermisoEliminarProductosResumidos = isPermisoEliminarProductosResumidos;
	}

	public Boolean getIsPermisoGuardarCambiosProductosResumidos() {
		return isPermisoGuardarCambiosProductosResumidos;
	}

	public void setIsPermisoGuardarCambiosProductosResumidos(Boolean isPermisoGuardarCambiosProductosResumidos) {
		this.isPermisoGuardarCambiosProductosResumidos = isPermisoGuardarCambiosProductosResumidos;
	}
	
	public Boolean getIsPermisoConsultaProductosResumidos() {
		return isPermisoConsultaProductosResumidos;
	}

	public void setIsPermisoConsultaProductosResumidos(Boolean isPermisoConsultaProductosResumidos) {
		this.isPermisoConsultaProductosResumidos = isPermisoConsultaProductosResumidos;
	}

	public Boolean getIsPermisoBusquedaProductosResumidos() {
		return isPermisoBusquedaProductosResumidos;
	}

	public void setIsPermisoBusquedaProductosResumidos(Boolean isPermisoBusquedaProductosResumidos) {
		this.isPermisoBusquedaProductosResumidos = isPermisoBusquedaProductosResumidos;
	}

	public Boolean getIsPermisoReporteProductosResumidos() {
		return isPermisoReporteProductosResumidos;
	}

	public void setIsPermisoReporteProductosResumidos(Boolean isPermisoReporteProductosResumidos) {
		this.isPermisoReporteProductosResumidos = isPermisoReporteProductosResumidos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosResumidos() {
		return isPermisoPaginacionMedioProductosResumidos;
	}

	public void setIsPermisoPaginacionMedioProductosResumidos(Boolean isPermisoPaginacionMedioProductosResumidos) {
		this.isPermisoPaginacionMedioProductosResumidos = isPermisoPaginacionMedioProductosResumidos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosResumidos() {
		return isPermisoPaginacionTodoProductosResumidos;
	}

	public void setIsPermisoPaginacionTodoProductosResumidos(Boolean isPermisoPaginacionTodoProductosResumidos) {
		this.isPermisoPaginacionTodoProductosResumidos = isPermisoPaginacionTodoProductosResumidos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosResumidos() {
		return isPermisoPaginacionAltoProductosResumidos;
	}

	public void setIsPermisoPaginacionAltoProductosResumidos(Boolean isPermisoPaginacionAltoProductosResumidos) {
		this.isPermisoPaginacionAltoProductosResumidos = isPermisoPaginacionAltoProductosResumidos;
	}
	
	public Boolean getIsPermisoCopiarProductosResumidos() {
		return isPermisoCopiarProductosResumidos;
	}

	public void setIsPermisoCopiarProductosResumidos(Boolean isPermisoCopiarProductosResumidos) {
		this.isPermisoCopiarProductosResumidos = isPermisoCopiarProductosResumidos;
	}
	
	public Boolean getIsPermisoVerFormProductosResumidos() {
		return isPermisoVerFormProductosResumidos;
	}

	public void setIsPermisoVerFormProductosResumidos(Boolean isPermisoVerFormProductosResumidos) {
		this.isPermisoVerFormProductosResumidos = isPermisoVerFormProductosResumidos;
	}
	
	public Boolean getIsPermisoDuplicarProductosResumidos() {
		return isPermisoDuplicarProductosResumidos;
	}

	public void setIsPermisoDuplicarProductosResumidos(Boolean isPermisoDuplicarProductosResumidos) {
		this.isPermisoDuplicarProductosResumidos = isPermisoDuplicarProductosResumidos;
	}
	
	public Boolean getIsPermisoOrdenProductosResumidos() {
		return isPermisoOrdenProductosResumidos;
	}

	public void setIsPermisoOrdenProductosResumidos(Boolean isPermisoOrdenProductosResumidos) {
		this.isPermisoOrdenProductosResumidos = isPermisoOrdenProductosResumidos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosResumidos() {
		return isVisibilidadCeldaNuevoProductosResumidos;
	}

	public void setIsVisibilidadCeldaNuevoProductosResumidos(Boolean isVisibilidadCeldaNuevoProductosResumidos) {
		this.isVisibilidadCeldaNuevoProductosResumidos = isVisibilidadCeldaNuevoProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosResumidos() {
		return isVisibilidadCeldaDuplicarProductosResumidos;
	}

	public void setIsVisibilidadCeldaDuplicarProductosResumidos(Boolean isVisibilidadCeldaDuplicarProductosResumidos) {
		this.isVisibilidadCeldaDuplicarProductosResumidos = isVisibilidadCeldaDuplicarProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosResumidos() {
		return isVisibilidadCeldaCopiarProductosResumidos;
	}

	public void setIsVisibilidadCeldaCopiarProductosResumidos(Boolean isVisibilidadCeldaCopiarProductosResumidos) {
		this.isVisibilidadCeldaCopiarProductosResumidos = isVisibilidadCeldaCopiarProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosResumidos() {
		return isVisibilidadCeldaVerFormProductosResumidos;
	}

	public void setIsVisibilidadCeldaVerFormProductosResumidos(Boolean isVisibilidadCeldaVerFormProductosResumidos) {
		this.isVisibilidadCeldaVerFormProductosResumidos = isVisibilidadCeldaVerFormProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosResumidos() {
		return isVisibilidadCeldaOrdenProductosResumidos;
	}

	public void setIsVisibilidadCeldaOrdenProductosResumidos(Boolean isVisibilidadCeldaOrdenProductosResumidos) {
		this.isVisibilidadCeldaOrdenProductosResumidos = isVisibilidadCeldaOrdenProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosResumidos() {
		return isVisibilidadCeldaNuevoRelacionesProductosResumidos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosResumidos(Boolean isVisibilidadCeldaNuevoRelacionesProductosResumidos) {
		this.isVisibilidadCeldaNuevoRelacionesProductosResumidos = isVisibilidadCeldaNuevoRelacionesProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosResumidos() {
		return isVisibilidadCeldaModificarProductosResumidos;
	}

	public void setIsVisibilidadCeldaModificarProductosResumidos(Boolean isVisibilidadCeldaModificarProductosResumidos) {
		this.isVisibilidadCeldaModificarProductosResumidos = isVisibilidadCeldaModificarProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosResumidos() {
		return isVisibilidadCeldaActualizarProductosResumidos;
	}

	public void setIsVisibilidadCeldaActualizarProductosResumidos(Boolean isVisibilidadCeldaActualizarProductosResumidos) {
		this.isVisibilidadCeldaActualizarProductosResumidos = isVisibilidadCeldaActualizarProductosResumidos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosResumidos() {
		return isVisibilidadCeldaEliminarProductosResumidos;
	}

	public void setIsVisibilidadCeldaEliminarProductosResumidos(Boolean isVisibilidadCeldaEliminarProductosResumidos) {
		this.isVisibilidadCeldaEliminarProductosResumidos = isVisibilidadCeldaEliminarProductosResumidos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosResumidos() {
		return isVisibilidadCeldaCancelarProductosResumidos;
	}

	public void setIsVisibilidadCeldaCancelarProductosResumidos(Boolean isVisibilidadCeldaCancelarProductosResumidos) {
		this.isVisibilidadCeldaCancelarProductosResumidos = isVisibilidadCeldaCancelarProductosResumidos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosResumidos() {
		return isVisibilidadCeldaGuardarProductosResumidos;
	}

	public void setIsVisibilidadCeldaGuardarProductosResumidos(Boolean isVisibilidadCeldaGuardarProductosResumidos) {
		this.isVisibilidadCeldaGuardarProductosResumidos = isVisibilidadCeldaGuardarProductosResumidos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosResumidos() {
		return isVisibilidadCeldaGuardarCambiosProductosResumidos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosResumidos(Boolean isVisibilidadCeldaGuardarCambiosProductosResumidos) {
		this.isVisibilidadCeldaGuardarCambiosProductosResumidos = isVisibilidadCeldaGuardarCambiosProductosResumidos;
	}
		
	public ProductosResumidosSessionBean getproductosresumidosSessionBean() {
		return this.productosresumidosSessionBean;
	}
	
	public void setproductosresumidosSessionBean(ProductosResumidosSessionBean productosresumidosSessionBean) {
		this.productosresumidosSessionBean=productosresumidosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosResumidos() {
		return this.isVisibilidadBusquedaProductosResumidos;
	}

	public void setisVisibilidadBusquedaProductosResumidos(Boolean isVisibilidadBusquedaProductosResumidos) {
		this.isVisibilidadBusquedaProductosResumidos=isVisibilidadBusquedaProductosResumidos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(ProductosResumidos productosresumidos)throws Exception {
		try {
			
				this.setActualParaGuardarProductoForeignKey(productosresumidos,null);
				this.setActualParaGuardarEmpresaForeignKey(productosresumidos,null);
				this.setActualParaGuardarSucursalForeignKey(productosresumidos,null);
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
	
	public void bugActualizarReferenciaActual(ProductosResumidos productosresumidos,ProductosResumidos productosresumidosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosResumidos(productosresumidos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosresumidosAux.setId(productosresumidos.getId());
		productosresumidosAux.setVersionRow(productosresumidos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosResumidos productosresumidosLocal) throws Exception {
		
		if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosResumidos productosresumidosLocal) throws Exception {	
		if(this.productosresumidosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productosresumidosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosresumidosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosresumidosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosResumidosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosresumidosValidator.getInvalidValues(this.productosresumidos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosResumidos productosresumidos,List<ProductosResumidos> productosresumidoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosResumidos productosresumidos,List<ProductosResumidos> productosresumidoss) throws Exception {
		try	{			
			ProductosResumidosConstantesFunciones.actualizarSelectedLista(productosresumidos,productosresumidoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosResumidos> productosresumidossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productosresumidossLocal=this.productosresumidosLogic.getProductosResumidoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productosresumidossLocal=this.productosresumidoss;
			}
			//ARCHITECTURE
		
			for(ProductosResumidos productosresumidosLocal:productosresumidossLocal) {
				if(this.permiteMantenimiento(productosresumidosLocal) && productosresumidosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosResumidosConstantesFunciones.getProductosResumidosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosResumidosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelnombre_unidadProductosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosResumidosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelnombre_productoProductosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosResumidosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelcantidadProductosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosResumidosConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelmontoProductosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosResumidosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelcodigo_productoProductosResumidos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosResumidosConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabeltipoProductosResumidos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosResumidos.jLabelnombre_unidadProductosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosResumidos.jLabelnombre_productoProductosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosResumidos.jLabelcantidadProductosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosResumidos.jLabelmontoProductosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosResumidos.jLabelcodigo_productoProductosResumidos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosResumidos.jLabeltipoProductosResumidos,"");
		
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
		this.iIdNuevoProductosResumidos--;	
		
		
		this.productosresumidosAux=new ProductosResumidos();
		
		this.productosresumidosAux.setId(this.iIdNuevoProductosResumidos);
		this.productosresumidosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosresumidosLogic.getProductosResumidoss().add(this.productosresumidosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productosresumidoss.add(this.productosresumidosAux);
		}
		//ARCHITECTURE
		
		this.productosresumidos=this.productosresumidosAux;
		
		if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosResumidos(this.productosresumidos);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosResumidos(this.productosresumidos);
		}
				
		//this.setDefaultControlesProductosResumidos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosResumidos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosResumidos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosResumidos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosResumidos(this.productosresumidosBean,this.productosresumidos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosResumidos(this.productosresumidosReturnGeneral,this.productosresumidosBean,false);
		
		if(this.productosresumidosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosResumidos(this.productosresumidosReturnGeneral.getProductosResumidos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosResumidos(this.productosresumidosReturnGeneral.getProductosResumidos());
		}
		
		if(this.productosresumidosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosResumidos(this.productosresumidosReturnGeneral.getProductosResumidos(),classes);//this.productosresumidosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosResumidos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosResumidos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.RecargarFormProductosResumidos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosResumidos(false);
						
			if(productosresumidosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosResumidos();
			}
			
			this.actualizarVisualTableDatosProductosResumidos();
			
			this.jTableDatosProductosResumidos.setRowSelectionInterval(this.getIndiceNuevoProductosResumidos(), this.getIndiceNuevoProductosResumidos());
			
			this.seleccionarFilaTablaProductosResumidosActual();
						
			this.actualizarEstadoCeldasBotonesProductosResumidos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosResumidos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_desdeProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarfecha_emision_desdeProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_hastaProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarfecha_emision_hastaProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarnombre_unidadProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarnombre_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarcantidadProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarmontoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarcodigo_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activartipoProductosResumidos);	
		
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarid_productoProductosResumidos);//
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarid_empresaProductosResumidos);//
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setEnabled(isHabilitar && this.productosresumidosConstantesFunciones.activarid_sucursalProductosResumidos);
	};
	
	public void setDefaultControlesProductosResumidos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosResumidos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosresumidosSessionBean.setConGuardarRelaciones(true);			
			this.productosresumidosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.setVisible(true);
			
					
		} else {
			//this.productosresumidosSessionBean.setConGuardarRelaciones(false);			
			this.productosresumidosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosResumidos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
				if(productosresumidosAux.getId().equals(this.iIdNuevoProductosResumidos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosResumidos productosresumidosAux:this.productosresumidoss) {
				if(productosresumidosAux.getId().equals(this.iIdNuevoProductosResumidos)) {
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
	
	public int getIndiceActualProductosResumidos(ProductosResumidos productosresumidos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
				if(productosresumidosAux.getId().equals(productosresumidos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosResumidos productosresumidosAux:this.productosresumidoss) {
				if(productosresumidosAux.getId().equals(productosresumidos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosResumidos(ProductosResumidos productosresumidosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
				if(productosresumidosAux.getProductosResumidosOriginal().getId().equals(productosresumidosOriginal.getId())) {
					existe=true;
					productosresumidosOriginal.setId(productosresumidosAux.getId());
					productosresumidosOriginal.setVersionRow(productosresumidosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosResumidos productosresumidosAux:this.productosresumidoss) {
				if(productosresumidosAux.getProductosResumidosOriginal().getId().equals(productosresumidosOriginal.getId())) {
					existe=true;
					productosresumidosOriginal.setId(productosresumidosAux.getId());
					productosresumidosOriginal.setVersionRow(productosresumidosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosResumidos(Boolean esParaCancelar) throws Exception {
		productosresumidossAux=new ArrayList<ProductosResumidos>();
		productosresumidosAux=new ProductosResumidos();
		
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
					if(productosresumidosAux.getId()<0) {
						productosresumidossAux.add(productosresumidosAux);
					}		
				}
				this.iIdNuevoProductosResumidos=0L;
				this.productosresumidosLogic.getProductosResumidoss().removeAll(productosresumidossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosResumidos productosresumidosAux:this.productosresumidoss) {
					if(productosresumidosAux.getId()<0) {
						productosresumidossAux.add(productosresumidosAux);
					}		
				}
				this.iIdNuevoProductosResumidos=0L;
				this.productosresumidoss.removeAll(productosresumidossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosResumidos 
					&& this.productosresumidosLogic.getProductosResumidoss().size()>0
					) {
					productosresumidosAux=this.productosresumidosLogic.getProductosResumidoss().get(this.productosresumidosLogic.getProductosResumidoss().size() - 1);
				
					if(productosresumidosAux.getId()<0) {
						this.productosresumidosLogic.getProductosResumidoss().remove(productosresumidosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosResumidos && this.productosresumidoss.size()>0) {
					productosresumidosAux=this.productosresumidoss.get(this.productosresumidoss.size() - 1);
				
					if(productosresumidosAux.getId()<0) {
						this.productosresumidoss.remove(productosresumidosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosResumidos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productosresumidos.getId()<0) {
				this.productosresumidosLogic.getProductosResumidoss().remove(this.productosresumidos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productosresumidos.getId()<0) {
				this.productosresumidoss.remove(this.productosresumidos);
			}
		}			
	}
	
	public void setEstadosInicialesProductosResumidos(List<ProductosResumidos> productosresumidossAux) throws Exception {
		ProductosResumidosConstantesFunciones.setEstadosInicialesProductosResumidos(productosresumidossAux);
	}
	
	public void setEstadosInicialesProductosResumidos(ProductosResumidos productosresumidosAux) throws Exception {
		ProductosResumidosConstantesFunciones.setEstadosInicialesProductosResumidos(productosresumidosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosResumidosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosResumidosActual()) {
				if(!this.isEsNuevoProductosResumidos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosResumidos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosResumidosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Resumidos ?", "MANTENIMIENTO DE Productos Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosResumidos productosresumidos) throws Exception {
		ProductosResumidosConstantesFunciones.seleccionarAsignar(this.productosresumidos,productosresumidos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosResumidos=this.isPermisoActualizarOriginalProductosResumidos;
			
			
			this.seleccionarAsignar(productosresumidos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosresumidosSessionBean.setsFuncionBusquedaRapida(this.productosresumidosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosResumidos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosResumidos(esParaCancelar);				
				this.cancelarNuevoProductosResumidos(esParaCancelar);								
			}
			
			this.productosresumidos=new ProductosResumidos();
			
			this.inicializarProductosResumidos();
			
			this.actualizarEstadoCeldasBotonesProductosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosResumidos() throws Exception {
		try {
			ProductosResumidosConstantesFunciones.inicializarProductosResumidos(this.productosresumidos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosresumidosLogic.getProductosResumidoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosResumidoss(String sAccionBusqueda,List<ProductosResumidos> productosresumidossParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosResumidos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosResumidosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosResumidosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosResumidos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Resumidoses");		
		parameters.put("busquedapor", ProductosResumidosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosResumidos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosResumidosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosResumidos=new JRBeanArrayDataSource(ProductosResumidosJInternalFrame.TraerProductosResumidosBeans(productosresumidossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosResumidos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosResumidosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosResumidosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosResumidosBean.TraerProductosResumidosBeans(productosresumidossParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosResumidoss(sAccionBusqueda,sTipoArchivoReporte,productosresumidossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosResumidoss(sAccionBusqueda,sTipoArchivoReporte,productosresumidossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosResumidosActionPerformed(null);
					//this.generarExcelReporteProductosResumidoss(sAccionBusqueda,sTipoArchivoReporte,productosresumidossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosResumidoss(sAccionBusqueda,sTipoArchivoReporte,productosresumidossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosResumidoss(sAccionBusqueda,sTipoArchivoReporte,productosresumidossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosResumidoss(sAccionBusqueda,sTipoArchivoReporte,productosresumidossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosResumidos> productosresumidossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosResumidoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosResumidos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosResumidos productosresumidos : productosresumidossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosResumidosConstantesFunciones.generarExcelReporteDataProductosResumidos("NORMAL",row,workbook,productosresumidos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosResumidos(String sTipo,Row row,Workbook workbook) {
		
		ProductosResumidosConstantesFunciones.generarExcelReporteHeaderProductosResumidos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosResumidos> productosresumidossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosResumidos productosresumidos : productosresumidossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosResumidosConstantesFunciones.getProductosResumidosDescripcion(productosresumidos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosResumidosConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosresumidos.gettipo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosResumidoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosResumidos> productosresumidossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosResumidos> productosresumidossRespaldo=null;
		
		classes=ProductosResumidosConstantesFunciones.getClassesRelationshipsOfProductosResumidos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosresumidosLogic.setDatosCliente(this.datosCliente);
		this.productosresumidosLogic.setDatosDeep(this.datosDeep);
		this.productosresumidosLogic.setIsConDeep(true);
		
		productosresumidossRespaldo=this.productosresumidosLogic.getProductosResumidoss();
		
		this.productosresumidosLogic.setProductosResumidoss(productosresumidossParaReportes);	
		this.productosresumidosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productosresumidossParaReportes=this.productosresumidosLogic.getProductosResumidoss();
		this.productosresumidosLogic.setProductosResumidoss(productosresumidossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosResumidoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosResumidos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosResumidos productosresumidos : productosresumidossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosResumidos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosResumidosConstantesFunciones.generarExcelReporteDataProductosResumidos("NORMAL",row,workbook,productosresumidos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosResumidosConstantesFunciones.getProductosResumidosDescripcion(productosresumidos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosResumidos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosResumidos() throws Exception {		
		this.startProcessProductosResumidos(true);
	}
	
	public void startProcessProductosResumidos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosResumidos ,this.jPanelParametrosReportesProductosResumidos, this.jScrollPanelDatosProductosResumidos,this.jPanelPaginacionProductosResumidos, this.jScrollPanelDatosEdicionProductosResumidos, this.jPanelAccionesProductosResumidos,this.jPanelAccionesFormularioProductosResumidos,this.jmenuBarProductosResumidos,this.jmenuBarDetalleProductosResumidos,this.jTtoolBarProductosResumidos,this.jTtoolBarDetalleProductosResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosResumidos=this.jTabbedPaneBusquedasProductosResumidos; 
		
		final JPanel jPanelParametrosReportesProductosResumidos=this.jPanelParametrosReportesProductosResumidos;
		//final JScrollPane jScrollPanelDatosProductosResumidos=this.jScrollPanelDatosProductosResumidos;
		final JTable jTableDatosProductosResumidos=this.jTableDatosProductosResumidos;		
		final JPanel jPanelPaginacionProductosResumidos=this.jPanelPaginacionProductosResumidos;
		//final JScrollPane jScrollPanelDatosEdicionProductosResumidos=this.jScrollPanelDatosEdicionProductosResumidos;
		final JPanel jPanelAccionesProductosResumidos=this.jPanelAccionesProductosResumidos;
		
		JPanel jPanelCamposAuxiliarProductosResumidos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosResumidos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			jPanelCamposAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jPanelCamposProductosResumidos;
			jPanelAccionesFormularioAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jPanelAccionesFormularioProductosResumidos;
		}
		
		final JPanel jPanelCamposProductosResumidos=jPanelCamposAuxiliarProductosResumidos;
		final JPanel jPanelAccionesFormularioProductosResumidos=jPanelAccionesFormularioAuxiliarProductosResumidos;
		
		
		final JMenuBar jmenuBarProductosResumidos=this.jmenuBarProductosResumidos;
		final JToolBar jTtoolBarProductosResumidos=this.jTtoolBarProductosResumidos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosResumidos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			jmenuBarDetalleAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jmenuBarDetalleProductosResumidos;
			jTtoolBarDetalleAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jTtoolBarDetalleProductosResumidos;
		}
		
		final JMenuBar jmenuBarDetalleProductosResumidos=jmenuBarDetalleAuxiliarProductosResumidos;
		final JToolBar jTtoolBarDetalleProductosResumidos=jTtoolBarDetalleAuxiliarProductosResumidos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosResumidos;
			processRunnable.jTableDatos=jTableDatosProductosResumidos;
			processRunnable.jPanelCampos=jPanelCamposProductosResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesProductosResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarProductosResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosResumidos;
			processRunnable.jTtoolBar=jTtoolBarProductosResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosResumidos ,jPanelParametrosReportesProductosResumidos,jTableDatosProductosResumidos, /*jScrollPanelDatosProductosResumidos,*/jPanelCamposProductosResumidos,jPanelPaginacionProductosResumidos, /*jScrollPanelDatosEdicionProductosResumidos,*/ jPanelAccionesProductosResumidos,jPanelAccionesFormularioProductosResumidos,jmenuBarProductosResumidos,jmenuBarDetalleProductosResumidos,jTtoolBarProductosResumidos,jTtoolBarDetalleProductosResumidos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosResumidos ,jPanelParametrosReportesProductosResumidos, jScrollPanelDatosProductosResumidos,jPanelPaginacionProductosResumidos, jScrollPanelDatosEdicionProductosResumidos, jPanelAccionesProductosResumidos,jPanelAccionesFormularioProductosResumidos,jmenuBarProductosResumidos,jmenuBarDetalleProductosResumidos,jTtoolBarProductosResumidos,jTtoolBarDetalleProductosResumidos);
						
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
	
	public void finishProcessProductosResumidos() {// throws Exception 
		this.finishProcessProductosResumidos(true);
	}
	
	public void finishProcessProductosResumidos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosResumidos ,this.jPanelParametrosReportesProductosResumidos, this.jScrollPanelDatosProductosResumidos,this.jPanelPaginacionProductosResumidos, this.jScrollPanelDatosEdicionProductosResumidos, this.jPanelAccionesProductosResumidos,this.jPanelAccionesFormularioProductosResumidos,this.jmenuBarProductosResumidos,this.jmenuBarDetalleProductosResumidos,this.jTtoolBarProductosResumidos,this.jTtoolBarDetalleProductosResumidos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosResumidos=this.jTabbedPaneBusquedasProductosResumidos; 
		
		final JPanel jPanelParametrosReportesProductosResumidos=this.jPanelParametrosReportesProductosResumidos;
		//final JScrollPane jScrollPanelDatosProductosResumidos=this.jScrollPanelDatosProductosResumidos;
		final JTable jTableDatosProductosResumidos=this.jTableDatosProductosResumidos;		
		final JPanel jPanelPaginacionProductosResumidos=this.jPanelPaginacionProductosResumidos;
		//final JScrollPane jScrollPanelDatosEdicionProductosResumidos=this.jScrollPanelDatosEdicionProductosResumidos;
		final JPanel jPanelAccionesProductosResumidos=this.jPanelAccionesProductosResumidos;
		
		JPanel jPanelCamposAuxiliarProductosResumidos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosResumidos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			jPanelCamposAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jPanelCamposProductosResumidos;
			jPanelAccionesFormularioAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jPanelAccionesFormularioProductosResumidos;
		}
		
		final JPanel jPanelCamposProductosResumidos=jPanelCamposAuxiliarProductosResumidos;
		final JPanel jPanelAccionesFormularioProductosResumidos=jPanelAccionesFormularioAuxiliarProductosResumidos;
		
		
		final JMenuBar jmenuBarProductosResumidos=this.jmenuBarProductosResumidos;		
		final JToolBar jTtoolBarProductosResumidos=this.jTtoolBarProductosResumidos;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosResumidos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosResumidos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			jmenuBarDetalleAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jmenuBarDetalleProductosResumidos;
			jTtoolBarDetalleAuxiliarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jTtoolBarDetalleProductosResumidos;		
		}
		
		final JMenuBar jmenuBarDetalleProductosResumidos=jmenuBarDetalleAuxiliarProductosResumidos;
		final JToolBar jTtoolBarDetalleProductosResumidos=jTtoolBarDetalleAuxiliarProductosResumidos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosResumidos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosResumidos;
			processRunnable.jTableDatos=jTableDatosProductosResumidos;
			processRunnable.jPanelCampos=jPanelCamposProductosResumidos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosResumidos;
			processRunnable.jPanelAcciones=jPanelAccionesProductosResumidos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosResumidos;
			
			
			processRunnable.jmenuBar=jmenuBarProductosResumidos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosResumidos;
			processRunnable.jTtoolBar=jTtoolBarProductosResumidos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosResumidos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosResumidos ,jPanelParametrosReportesProductosResumidos, jTableDatosProductosResumidos,/*jScrollPanelDatosProductosResumidos,*/jPanelCamposProductosResumidos,jPanelPaginacionProductosResumidos, /*jScrollPanelDatosEdicionProductosResumidos,*/ jPanelAccionesProductosResumidos,jPanelAccionesFormularioProductosResumidos,jmenuBarProductosResumidos,jmenuBarDetalleProductosResumidos,jTtoolBarProductosResumidos,jTtoolBarDetalleProductosResumidos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosResumidos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosResumidos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosResumidos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosResumidos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosResumidos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosResumidos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosResumidos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosresumidosConstantesFunciones.getsFinalQueryProductosResumidos();
		String  finalQueryPaginacionTodos=this.productosresumidosConstantesFunciones.getsFinalQueryProductosResumidos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosResumidosConstantesFunciones.getArrayColumnasGlobalesNoProductosResumidos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosResumidosConstantesFunciones.getArrayColumnasGlobalesProductosResumidos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosResumidosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productosresumidossEliminados= new ArrayList<ProductosResumidos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosResumidos();
		
				///*ProductosResumidosSessionBean*/this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
			
			if(this.productosresumidosSessionBean==null) {
				this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
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
					this.iNumeroPaginacion=ProductosResumidosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosResumidosConstantesFunciones.getClassesForeignKeysOfProductosResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productosresumidos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productosresumidossAux= new ArrayList<ProductosResumidos>();
			
				
			productosresumidosLogic.setDatosCliente(this.datosCliente);
			productosresumidosLogic.setDatosDeep(this.datosDeep);
			productosresumidosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosResumidos")) {
				this.sDetalleReporte=ProductosResumidosConstantesFunciones.getDetalleIndiceBusquedaProductosResumidos(id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosresumidosLogic.getProductosResumidossBusquedaProductosResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosResumidosConstantesFunciones.getDetalleIndiceBusquedaProductosResumidos(id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosResumidosConstantesFunciones.getDetalleIndiceBusquedaProductosResumidos(id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosresumidosLogic.getProductosResumidoss()==null||productosresumidosLogic.getProductosResumidoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productosresumidoss==null|| productosresumidoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productosresumidossAux=new ArrayList<ProductosResumidos>();
						productosresumidossAux.addAll(productosresumidosLogic.getProductosResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosresumidossAux=new ArrayList<ProductosResumidos>();
							productosresumidossAux.addAll(productosresumidoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosresumidosLogic.getProductosResumidossBusquedaProductosResumidos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosResumidosConstantesFunciones.getDetalleIndiceBusquedaProductosResumidos(id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosResumidosConstantesFunciones.getDetalleIndiceBusquedaProductosResumidos(id_productoBusquedaProductosResumidos,fecha_emision_desdeBusquedaProductosResumidos,fecha_emision_hastaBusquedaProductosResumidos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosResumidoss("BusquedaProductosResumidos",productosresumidosLogic.getProductosResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosResumidoss("BusquedaProductosResumidos",productosresumidoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosresumidosLogic.setProductosResumidoss(new ArrayList<ProductosResumidos>());
						productosresumidosLogic.getProductosResumidoss().addAll(productosresumidossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosresumidoss=new ArrayList<ProductosResumidos>();
							productosresumidoss.addAll(productosresumidossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosResumidos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosResumidos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosresumidosLogic.getProductosResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosresumidoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosresumidosLogic.getProductosResumidoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosresumidoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosResumidos productosresumidos) {
		Boolean permite=true;
		
		if(this.productosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosResumidosConstantesFunciones.getOrderByListaProductosResumidos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosResumidosConstantesFunciones.getOrderByListaProductosResumidos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosResumidos productosresumidos:productosresumidosLogic.getProductosResumidoss()) {
				if(productosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					productosresumidosTotales=productosresumidos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosResumidos productosresumidos:this.productosresumidoss) {
				if(productosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					productosresumidosTotales=productosresumidos;
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
			this.productosresumidosAux=new ProductosResumidos();
			this.productosresumidosAux.setsType(Constantes2.S_TOTALES);
			this.productosresumidosAux.setIsNew(false);
			this.productosresumidosAux.setIsChanged(false);
			this.productosresumidosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosResumidosConstantesFunciones.TotalizarValoresFilaProductosResumidos(this.productosresumidosLogic.getProductosResumidoss(),this.productosresumidosAux);
				
				//this.productosresumidosLogic.getProductosResumidoss().add(this.productosresumidosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosResumidosConstantesFunciones.TotalizarValoresFilaProductosResumidos(this.productosresumidoss,this.productosresumidosAux);
				
				this.productosresumidoss.add(this.productosresumidosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosresumidosTotales=new ProductosResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosresumidosLogic.getProductosResumidoss().remove(productosresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosresumidoss.remove(productosresumidosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosresumidosTotales=new ProductosResumidos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosResumidos productosresumidos:productosresumidosLogic.getProductosResumidoss()) {
				if(productosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					productosresumidosTotales=productosresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosResumidosConstantesFunciones.TotalizarValoresFilaProductosResumidos(this.productosresumidosLogic.getProductosResumidoss(),productosresumidosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosResumidos productosresumidos:this.productosresumidoss) {
				if(productosresumidos.getsType().equals(Constantes2.S_TOTALES)) {
					productosresumidosTotales=productosresumidos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosResumidosConstantesFunciones.TotalizarValoresFilaProductosResumidos(this.productosresumidoss,productosresumidosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosResumidossBusquedaProductosResumidos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosResumidos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosResumidossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosResumidossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosResumidossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosResumidossBusquedaProductosResumidos(String sFinalQuery,Long id_producto,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosresumidosLogic.getProductosResumidossBusquedaProductosResumidos(sFinalQuery,this.pagination,id_producto,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosResumidossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosresumidosLogic.getProductosResumidossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosResumidossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosresumidosLogic.getProductosResumidossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosResumidossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosresumidosLogic.getProductosResumidossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductosResumidos() {
		this.isPermisoTodoProductosResumidos=false;
		this.isPermisoNuevoProductosResumidos=false;
		this.isPermisoActualizarProductosResumidos=false;
		this.isPermisoActualizarOriginalProductosResumidos=false;
		this.isPermisoEliminarProductosResumidos=false;
		this.isPermisoGuardarCambiosProductosResumidos=false;
		this.isPermisoConsultaProductosResumidos=true;
		this.isPermisoBusquedaProductosResumidos=true;
		this.isPermisoReporteProductosResumidos=true;
		this.isPermisoOrdenProductosResumidos=false;		
		this.isPermisoPaginacionMedioProductosResumidos=false;		
		this.isPermisoPaginacionAltoProductosResumidos=false;		
		this.isPermisoPaginacionTodoProductosResumidos=false;		
		this.isPermisoCopiarProductosResumidos=false;		
		this.isPermisoVerFormProductosResumidos=false;		
		this.isPermisoDuplicarProductosResumidos=false;
		this.isPermisoOrdenProductosResumidos=false;
	}
	
	public void setPermisosUsuarioProductosResumidos(Boolean isPermiso) {
		this.isPermisoTodoProductosResumidos=isPermiso;
		this.isPermisoNuevoProductosResumidos=isPermiso;
		this.isPermisoActualizarProductosResumidos=isPermiso;
		this.isPermisoActualizarOriginalProductosResumidos=isPermiso;
		this.isPermisoEliminarProductosResumidos=isPermiso;
		this.isPermisoGuardarCambiosProductosResumidos=isPermiso;
		this.isPermisoConsultaProductosResumidos=isPermiso;
		this.isPermisoBusquedaProductosResumidos=isPermiso;
		this.isPermisoReporteProductosResumidos=isPermiso;
		this.isPermisoOrdenProductosResumidos=isPermiso;		
		this.isPermisoPaginacionMedioProductosResumidos=isPermiso;		
		this.isPermisoPaginacionAltoProductosResumidos=isPermiso;		
		this.isPermisoPaginacionTodoProductosResumidos=isPermiso;		
		this.isPermisoCopiarProductosResumidos=isPermiso;		
		this.isPermisoVerFormProductosResumidos=isPermiso;		
		this.isPermisoDuplicarProductosResumidos=isPermiso;
		this.isPermisoOrdenProductosResumidos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosResumidos(Boolean isPermiso) {
		//this.isPermisoTodoProductosResumidos=isPermiso;
		this.isPermisoNuevoProductosResumidos=isPermiso;
		this.isPermisoActualizarProductosResumidos=isPermiso;
		this.isPermisoActualizarOriginalProductosResumidos=isPermiso;
		this.isPermisoEliminarProductosResumidos=isPermiso;
		this.isPermisoGuardarCambiosProductosResumidos=isPermiso;
		//this.isPermisoConsultaProductosResumidos=isPermiso;
		//this.isPermisoBusquedaProductosResumidos=isPermiso;
		//this.isPermisoReporteProductosResumidos=isPermiso;
		//this.isPermisoOrdenProductosResumidos=isPermiso;		
		//this.isPermisoPaginacionMedioProductosResumidos=isPermiso;		
		//this.isPermisoPaginacionAltoProductosResumidos=isPermiso;		
		//this.isPermisoPaginacionTodoProductosResumidos=isPermiso;		
		//this.isPermisoCopiarProductosResumidos=isPermiso;		
		//this.isPermisoDuplicarProductosResumidos=isPermiso;
		//this.isPermisoOrdenProductosResumidos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosResumidosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosResumidos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosResumidosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosResumidosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosResumidosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosResumidosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosResumidos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosResumidosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosResumidos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosResumidos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosResumidos=this.isPermisoActualizarProductosResumidos;
			this.isPermisoEliminarProductosResumidos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosResumidos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosResumidos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosResumidos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosResumidos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosResumidos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosResumidos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosResumidos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosResumidos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosResumidos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosResumidos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosResumidos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosResumidos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosResumidos.setToolTipText(this.jTableDatosProductosResumidos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosResumidos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosResumidos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosResumidos() throws Exception {
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
	public void inicializarCombosForeignKeyProductosResumidosListas()throws Exception {
		try	{						
			
				this.productosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosResumidosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosResumidosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosResumidos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {
			if(this.productosresumidosSessionBean==null) {
				this.productosresumidosSessionBean=new ProductosResumidosSessionBean();
			}

			if(!this.productosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.productosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosresumidosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyProductosResumidos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosResumidos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosResumidos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosResumidos(ProductosResumidos productosresumidos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosResumidos(ProductosResumidos productosresumidos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosResumidos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosResumidos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosResumidos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosResumidos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosResumidos()throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductosResumidos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductosResumidos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductosResumidosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosResumidosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosResumidosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosresumidosSessionBean=new ProductosResumidosSessionBean(); 
		this.productosresumidosConstantesFunciones=new ProductosResumidosConstantesFunciones(); 
		this.productosresumidosBean=new ProductosResumidos();//(this.productosresumidosConstantesFunciones); 		
		this.productosresumidosReturnGeneral=new ProductosResumidosParameterReturnGeneral(); 
		
		this.productosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosResumidosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosResumidos(true);
			
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
			
			this.productosresumidosConstantesFunciones=new ProductosResumidosConstantesFunciones(); 
			this.productosresumidosBean=new ProductosResumidos();//this.productosresumidosConstantesFunciones); 			
			this.productosresumidosReturnGeneral=new ProductosResumidosParameterReturnGeneral(); 
		
			ProductosResumidosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Resumidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productosresumidos=new ProductosResumidos();
			this.productosresumidoss = new ArrayList<ProductosResumidos>();
			this.productosresumidossAux = new ArrayList<ProductosResumidos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic=new ProductosResumidosLogic();
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.productosresumidosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosresumidosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosResumidos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosResumidos);	
					}
					
					if(this.jInternalFrameImportacionProductosResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosResumidos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosResumidos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosResumidos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosResumidos);
				this.jInternalFrameDetalleFormProductosResumidos.setVisible(false);
				this.jInternalFrameDetalleFormProductosResumidos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosResumidos);
					this.jInternalFrameReporteDinamicoProductosResumidos.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosResumidos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosResumidos);
					this.jInternalFrameImportacionProductosResumidos.setVisible(false);
					this.jInternalFrameImportacionProductosResumidos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosResumidos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosResumidos);
					this.jInternalFrameOrderByProductosResumidos.setVisible(false);
					this.jInternalFrameOrderByProductosResumidos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosResumidosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosResumidosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosresumidosReturnGeneral=new ProductosResumidosParameterReturnGeneral();
			
			this.productosresumidosParameterGeneral=new ProductosResumidosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosresumidosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosResumidosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosresumidosSessionBean.getEsGuardarRelacionado(),this.productosresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosResumidosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosresumidosSessionBean.getEsGuardarRelacionado(),this.productosresumidosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaDuplicarProductosResumidos=true;
			this.isVisibilidadCeldaCopiarProductosResumidos=true;
			this.isVisibilidadCeldaVerFormProductosResumidos=true;
			this.isVisibilidadCeldaOrdenProductosResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
			this.isVisibilidadCeldaModificarProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=false;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=false;
			this.isVisibilidadCeldaGuardarProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
			
			
			this.isVisibilidadBusquedaProductosResumidos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosResumidos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosResumidos(false);
			
			this.setPermisosUsuarioProductosResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosresumidosSessionBean.getEsGuardarRelacionado() 
				|| (this.productosresumidosSessionBean.getEsGuardarRelacionado() && this.productosresumidosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosResumidosClasesRelacionadas();
			}
			
			if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosResumidosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosResumidos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosResumidos();
			}
			
			if(!this.isPermisoBusquedaProductosResumidos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosResumidosConstantesFunciones.getTiposSeleccionarProductosResumidos());
				
				this.tiposColumnasSelect=ProductosResumidosConstantesFunciones.getTiposSeleccionarProductosResumidos(true);
				
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
			//if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosResumidos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProductosResumidos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProductosResumidos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosResumidos() ;
			
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
				productosresumidosImplementable= (ProductosResumidosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosresumidosImplementableHome= (ProductosResumidosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosResumidosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productosresumidoss= new ArrayList<ProductosResumidos>();
			this.productosresumidossEliminados= new ArrayList<ProductosResumidos>();
						
			this.isEsNuevoProductosResumidos=false;
			this.esParaAccionDesdeFormularioProductosResumidos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductosResumidos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosResumidos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosResumidosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosResumidosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosResumidos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosResumidos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosResumidos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosResumidos();
			}
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosResumidos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosResumidos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosResumidos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosResumidos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosResumidos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosResumidos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosResumidos")) {
				iIndex=this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosResumidos();	
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
	
	public void cargarCombosForeignKeyProductosResumidos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosResumidos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosResumidos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosResumidosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosResumidos();
		
		this.cargarCombosFrameForeignKeyProductosResumidos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosResumidos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosResumidos();
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
	
	public void jButtonNuevoProductosResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			
			if(jTableDatosProductosResumidos.getRowCount()>=1) {
				jTableDatosProductosResumidos.removeRowSelectionInterval(0, jTableDatosProductosResumidos.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosResumidos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosResumidos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosResumidos(true);			
			//this.productosresumidos=new ProductosResumidos();
			//this.productosresumidos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosResumidos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosResumidos() ;
			
			if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosResumidos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productosresumidos);	
			this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);				
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosResumidos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosResumidosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosResumidos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosResumidos.getSelectedRows().length;			
			}
			
			productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosResumidos--;			
				//ProductosResumidos productosresumidosAux= new ProductosResumidos();			
				//productosresumidosAux.setId(this.iIdNuevoProductosResumidos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosResumidos productosresumidosOrigen=new ProductosResumidos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosResumidos productosresumidosOrigen : productosresumidossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosresumidosOrigen =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosresumidosOrigen =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosResumidos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productosresumidos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosResumidos(productosresumidosOrigen,this.productosresumidos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosresumidosLogic.getProductosResumidoss().add(this.productosresumidosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosresumidoss.add(this.productosresumidosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosResumidos(false);
				
				this.jTableDatosProductosResumidos.setRowSelectionInterval(this.getIndiceNuevoProductosResumidos(), this.getIndiceNuevoProductosResumidos());
				
				int iLastRow =  this.jTableDatosProductosResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosResumidos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();									
		
			ProductosResumidos productosresumidosOrigen=new ProductosResumidos();
			ProductosResumidos productosresumidosDestino=new ProductosResumidos();
				
			productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosResumidos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productosresumidossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosResumidos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosresumidosOrigen =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosresumidosOrigen =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosresumidosDestino =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosresumidosDestino =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosresumidosOrigen =productosresumidossSeleccionados.get(0);
				productosresumidosDestino =productosresumidossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosResumidos(productosresumidosOrigen,productosresumidosDestino,true,false);
				
				productosresumidosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosresumidosDestino,productosresumidosLogic.getProductosResumidoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosresumidosDestino,productosresumidoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosResumidos(false);
				
				//this.jTableDatosProductosResumidos.setRowSelectionInterval(this.getIndiceNuevoProductosResumidos(), this.getIndiceNuevoProductosResumidos());
				
				int iLastRow =  this.jTableDatosProductosResumidos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosResumidos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosResumidos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosResumidos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosResumidos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosResumidos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosResumidos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosResumidos.setVisible(!isVisible);
			this.jPanelPaginacionProductosResumidos.setVisible(!isVisible);
			this.jPanelAccionesProductosResumidos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosResumidos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosResumidos();
			
			this.abrirFrameOrderByProductosResumidos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosResumidos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosResumidos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosResumidos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosResumidos.isMaximum()) {
					this.jInternalFrameDetalleFormProductosResumidos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosResumidos.setSize(this.jInternalFrameDetalleFormProductosResumidos.iWidthFormulario,this.jInternalFrameDetalleFormProductosResumidos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosResumidos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosResumidos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosResumidos.isMaximum()) {
						this.jInternalFrameDetalleFormProductosResumidos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosResumidos.jContentPaneDetalleProductosResumidos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosResumidos.jContentPaneDetalleProductosResumidos.getWidth(),ProductosResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosResumidos.jContentPaneDetalleProductosResumidos.getWidth(),ProductosResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosResumidos.jContentPaneDetalleProductosResumidos.getWidth(),ProductosResumidosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosResumidos.setVisible(true);
	        this.jInternalFrameDetalleFormProductosResumidos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosResumidos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosResumidos,false,this);
				} else {
					this.jInternalFrameOrderByProductosResumidos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosResumidos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosResumidos);
				this.jInternalFrameOrderByProductosResumidos.setVisible(false);
				this.jInternalFrameOrderByProductosResumidos.setSelected(false);
				
				this.jInternalFrameOrderByProductosResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosResumidos"));
				
				this.inicializarActualizarBindingTablaOrderByProductosResumidos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosResumidos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosResumidos==null) {
				
				this.jInternalFrameImportacionProductosResumidos=new ImportacionJInternalFrame(ProductosResumidosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosResumidos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosResumidos);
				this.jInternalFrameImportacionProductosResumidos.setVisible(false);
				this.jInternalFrameImportacionProductosResumidos.setSelected(false);


				this.jInternalFrameImportacionProductosResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosResumidos"));
				this.jInternalFrameImportacionProductosResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosResumidos"));
				this.jInternalFrameImportacionProductosResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosResumidos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosResumidos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosResumidos==null) {
				this.jInternalFrameReporteDinamicoProductosResumidos=new ReporteDinamicoJInternalFrame(ProductosResumidosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosResumidos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosResumidos);
				this.jInternalFrameReporteDinamicoProductosResumidos.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosResumidos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosResumidos"));
				this.jInternalFrameReporteDinamicoProductosResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosResumidos"));
				this.jInternalFrameReporteDinamicoProductosResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosResumidos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosResumidos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosResumidos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosResumidos);
			
	       	this.jInternalFrameDetalleFormProductosResumidos.setVisible(false);
	        this.jInternalFrameDetalleFormProductosResumidos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosResumidos.dispose();
			//this.jInternalFrameDetalleFormProductosResumidos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosResumidos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosResumidos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosResumidos.setVisible(true);
	        this.jInternalFrameImportacionProductosResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosResumidos.setVisible(true);
	        this.jInternalFrameOrderByProductosResumidos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosResumidos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosResumidos.setVisible(false);
	        this.jInternalFrameOrderByProductosResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosResumidos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosResumidos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosResumidos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosResumidos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosResumidos.setVisible(false);
	        this.jInternalFrameImportacionProductosResumidos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosResumidos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosResumidos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosResumidos(true);
			//this.isEsNuevoProductosResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosResumidos(false) ;
			
			if(productosresumidosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosResumidos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosResumidosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosResumidos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosResumidos(true);
			//this.isEsNuevoProductosResumidos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productosresumidos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosResumidos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosResumidos(false) ;
			
			if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosResumidos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosResumidos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosResumidos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	
	public void jButtonActualizarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosResumidos(false);
			
			//if(!this.isEsNuevoProductosResumidos) {								
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				
			}
			
			if(this.permiteMantenimiento(this.productosresumidos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosResumidos=true;
					this.inicializarActualizarBindingTablaProductosResumidos(false);
					this.isEsNuevoProductosResumidos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosResumidos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosResumidos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosResumidos(false);
				
				this.habilitarDeshabilitarControlesProductosResumidos(false);
			
												
				
				if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosResumidos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosResumidosActionPerformed(evt,productosresumidosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosResumidos(this.productosresumidos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosResumidos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosresumidosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productosresumidos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				this.productosresumidos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				this.productosresumidos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productosresumidos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosResumidosModel) this.jTableDatosProductosResumidos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosResumidos=true;
				this.inicializarActualizarBindingTablaProductosResumidos(false);
				this.isEsNuevoProductosResumidos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosResumidos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosResumidos(false);
				
				this.habilitarDeshabilitarControlesProductosResumidos(false);
				
				
				
				if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosResumidos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosResumidosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosResumidos.getRowCount()>=1) {
				jTableDatosProductosResumidos.removeRowSelectionInterval(0, jTableDatosProductosResumidos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosResumidos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosResumidos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosResumidos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosResumidos(false) ;
			
			this.isEsNuevoProductosResumidos=false;
			
			if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosResumidos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosResumidos(false);
				
				//SI ES MANUAL
				if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosResumidos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosResumidos--;			
			//ProductosResumidos productosresumidosAux= new ProductosResumidos();			
			//productosresumidosAux.setId(this.iIdNuevoProductosResumidos);
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosResumidos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
			
			this.productosresumidos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosresumidosLogic.getProductosResumidoss().add(this.productosresumidosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productosresumidoss.add(this.productosresumidosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosResumidos(false);
			
			this.jTableDatosProductosResumidos.setRowSelectionInterval(this.getIndiceNuevoProductosResumidos(), this.getIndiceNuevoProductosResumidos());
			
			int iLastRow =  this.jTableDatosProductosResumidos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosResumidos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosResumidos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosResumidos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosResumidos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosResumidos(false);
			
			//SI ES MANUAL
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosResumidos();
			}
			
			//this.abrirFrameTreeProductosResumidos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosResumidos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosResumidos.setFileImportacion(this.jInternalFrameImportacionProductosResumidos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosResumidos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosResumidos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosResumidos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosResumidos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		

		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosResumidosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosResumidosBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosResumidosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosResumidosConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosResumidosConstantesFunciones.LABEL_TIPO:
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
		
		if(this.jInternalFrameReporteDinamicoProductosResumidos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ProductosResumidosConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductosResumidosConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ProductosResumidosConstantesFunciones.LABEL_TIPO:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosResumidosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosResumidosConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(ProductosResumidos productosresumidos:productosresumidossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosresumidos.gettipo());
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
			//	this.getFilaCabeceraExportarExcelProductosResumidos(row);				
			//	iRow++;
			//}				
			
			//for(ProductosResumidos productosresumidosAux:productosresumidossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosResumidos(productosresumidosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosResumidos(false);
			
			//SI ES MANUAL
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosResumidos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosResumidos(false);
			
			//SI ES MANUAL
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosResumidos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosResumidosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosResumidos(false);
			
			//SI ES MANUAL
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosResumidos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosResumidos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosResumidos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosResumidos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosResumidos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosResumidos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosResumidos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosResumidos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosResumidos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosResumidos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosResumidos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosResumidos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosResumidos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosResumidos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosResumidos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosResumidos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosResumidos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosResumidos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosResumidos();
		
		this.inicializarActualizarBindingBotonesManualProductosResumidos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosResumidos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosResumidos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosResumidos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosResumidos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosResumidos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosResumidos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosResumidos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosResumidos.jCheckBoxPostAccionNuevoProductosResumidos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosResumidos.jCheckBoxPostAccionSinCerrarProductosResumidos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosResumidos.jCheckBoxPostAccionSinMensajeProductosResumidos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosResumidos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosResumidos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosResumidos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
				this.jInternalFrameDetalleFormProductosResumidos.jCheckBoxPostAccionNuevoProductosResumidos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosResumidos.jCheckBoxPostAccionSinCerrarProductosResumidos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosResumidos.jCheckBoxPostAccionSinMensajeProductosResumidos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosResumidos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosResumidos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosResumidos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosResumidos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosResumidos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosResumidos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosResumidos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosResumidos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosResumidos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosResumidos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosResumidos() throws Exception {
		try	{
			if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosResumidos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosResumidos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosResumidos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosResumidos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosResumidos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosResumidos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosResumidos.addItem(reporte);
			}
			
			
			if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosResumidos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosResumidos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosResumidos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosResumidos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosResumidos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosResumidos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosResumidos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
				this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
				this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosResumidos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosResumidos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductosResumidosConstantesFunciones.getTiposSeleccionarProductosResumidos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductosResumidosConstantesFunciones.getTiposSeleccionarProductosResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductosResumidosConstantesFunciones.getTiposSeleccionarProductosResumidos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosResumidos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductosResumidos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosResumidos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.getSelectedItem()!=null){this.id_productoBusquedaProductosResumidos=((Producto)this.jComboBoxid_productoBusquedaProductosResumidosProductosResumidos.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaProductosResumidos=new Date(this.jDateChooserfecha_emision_desdeBusquedaProductosResumidosProductosResumidos.getDate().getTime());
		this.fecha_emision_hastaBusquedaProductosResumidos=new Date(this.jDateChooserfecha_emision_hastaBusquedaProductosResumidosProductosResumidos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosResumidos(Boolean esInicializar) throws Exception {				
		if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosResumidos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosResumidos() throws Exception {
		this.inicializarActualizarBindingTablaProductosResumidos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosResumidos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosResumidosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosResumidos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosresumidosLogic.getProductosResumidoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productosresumidoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosResumidos.setModel(new ProductosResumidosModel(this.productosresumidosLogic.getProductosResumidoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosResumidos.setModel(new ProductosResumidosModel(this.productosresumidoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosResumidos!=null && this.jInternalFrameOrderByProductosResumidos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosResumidos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO,productosresumidosConstantesFunciones.resaltarSeleccionarProductosResumidos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosResumidosConstantesFunciones.SCLASSWEBTITULO,productosresumidosConstantesFunciones.resaltarSeleccionarProductosResumidos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_ID));

		if(this.productosresumidosConstantesFunciones.mostraridProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosresumidosConstantesFunciones.resaltaridProductosResumidos,this.productosresumidosConstantesFunciones.activaridProductosResumidos,iSizeTabla,this,true,"idProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltaridProductosResumidos,this.productosresumidosConstantesFunciones.activaridProductosResumidos,this,true,"idProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.productosresumidosConstantesFunciones.mostrarnombre_unidadProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosresumidosConstantesFunciones.resaltarnombre_unidadProductosResumidos,this.productosresumidosConstantesFunciones.activarnombre_unidadProductosResumidos,iSizeTabla,this,true,"nombre_unidadProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltarnombre_unidadProductosResumidos,this.productosresumidosConstantesFunciones.activarnombre_unidadProductosResumidos,this,true,"nombre_unidadProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.productosresumidosConstantesFunciones.mostrarnombre_productoProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosresumidosConstantesFunciones.resaltarnombre_productoProductosResumidos,this.productosresumidosConstantesFunciones.activarnombre_productoProductosResumidos,iSizeTabla,this,true,"nombre_productoProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltarnombre_productoProductosResumidos,this.productosresumidosConstantesFunciones.activarnombre_productoProductosResumidos,this,true,"nombre_productoProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_CANTIDAD));

		if(this.productosresumidosConstantesFunciones.mostrarcantidadProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosresumidosConstantesFunciones.resaltarcantidadProductosResumidos,this.productosresumidosConstantesFunciones.activarcantidadProductosResumidos,iSizeTabla,this,true,"cantidadProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltarcantidadProductosResumidos,this.productosresumidosConstantesFunciones.activarcantidadProductosResumidos,this,true,"cantidadProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_MONTO));

		if(this.productosresumidosConstantesFunciones.mostrarmontoProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosresumidosConstantesFunciones.resaltarmontoProductosResumidos,this.productosresumidosConstantesFunciones.activarmontoProductosResumidos,iSizeTabla,this,true,"montoProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltarmontoProductosResumidos,this.productosresumidosConstantesFunciones.activarmontoProductosResumidos,this,true,"montoProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.productosresumidosConstantesFunciones.mostrarcodigo_productoProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosresumidosConstantesFunciones.resaltarcodigo_productoProductosResumidos,this.productosresumidosConstantesFunciones.activarcodigo_productoProductosResumidos,iSizeTabla,this,true,"codigo_productoProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltarcodigo_productoProductosResumidos,this.productosresumidosConstantesFunciones.activarcodigo_productoProductosResumidos,this,true,"codigo_productoProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,ProductosResumidosConstantesFunciones.LABEL_TIPO));

		if(this.productosresumidosConstantesFunciones.mostrartipoProductosResumidos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosResumidosConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosresumidosConstantesFunciones.resaltartipoProductosResumidos,this.productosresumidosConstantesFunciones.activartipoProductosResumidos,iSizeTabla,this,true,"tipoProductosResumidos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosresumidosConstantesFunciones.resaltartipoProductosResumidos,this.productosresumidosConstantesFunciones.activartipoProductosResumidos,this,true,"tipoProductosResumidos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosResumidosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosResumidos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosResumidos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosresumidosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosResumidos.addColumn(tableColumn);
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
			
			this.jTableDatosProductosResumidos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosResumidos.moveColumn(this.jTableDatosProductosResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosResumidos.moveColumn(this.jTableDatosProductosResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosResumidos.moveColumn(this.jTableDatosProductosResumidos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosResumidos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosResumidos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosResumidos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosResumidos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosResumidos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosResumidos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosResumidos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosResumidos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosresumidosLogic.getProductosResumidoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productosresumidoss.size()-1;
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
		//this.jTableDatosProductosResumidos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosResumidos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosResumidos();
			
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
				
				//this.isEsNuevoProductosResumidos=false;
					
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
				if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosResumidos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosResumidos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productosresumidos.getsType().equals("DUPLICADO")
				   || this.productosresumidos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosResumidos=true;
				
				} else {
					this.isEsNuevoProductosResumidos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
					if(this.productosresumidos.getId()>=0 && !this.productosresumidos.getIsNew()) {						
						this.isEsNuevoProductosResumidos=false;
						
					} else {
						this.isEsNuevoProductosResumidos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosResumidos(esRelaciones);						
				
				this.seleccionarProductosResumidos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productosresumidos.getId()<0) {
					this.isEsNuevoProductosResumidos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosResumidos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosResumidos(evt,rowIndex);
				}	
				
				if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosResumidos: " + this.dDif); 
					}
				}								
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosResumidos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productosresumidos)) {
					if(this.productosresumidos.getId()>0) {
						this.productosresumidos.setIsDeleted(true);
						
						this.productosresumidossEliminados.add(this.productosresumidos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosresumidosLogic.getProductosResumidoss().remove(this.productosresumidos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosresumidoss.remove(this.productosresumidos);				
					}
					
					
					((ProductosResumidosModel) this.jTableDatosProductosResumidos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosResumidos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosResumidos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosResumidos) {
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosResumidos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosResumidos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosResumidos(this.productosresumidos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosResumidos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosResumidos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosResumidos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosResumidos(ProductosResumidos productosresumidos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosResumidos(productosresumidos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosResumidos(ProductosResumidos productosresumidos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosResumidos(productosresumidos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosResumidos(productosresumidos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosResumidos(productosresumidos);
	}
	
	public void setVariablesObjetoActualToFormularioProductosResumidos(ProductosResumidos productosresumidos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setText(productosresumidos.getId().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setText(productosresumidos.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setText(productosresumidos.getnombre_producto());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setText(productosresumidos.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setText(productosresumidos.getmonto().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setText(productosresumidos.getcodigo_producto());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setText(productosresumidos.gettipo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosResumidos productosresumidosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosresumidosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosResumidos productosresumidosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosresumidosLocal=this.productosresumidos;
			} else {
				productosresumidosLocal=this.productosresumidosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosresumidosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosResumidos(productosresumidosLocal,true);
					
					if(productosresumidosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosresumidosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosresumidosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosResumidos(ProductosResumidos productosresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosResumidos(productosresumidos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(productosresumidos);
	}
	
	public void setVariablesFormularioToObjetoActualProductosResumidos(ProductosResumidos productosresumidos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosResumidos(productosresumidos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosResumidos(ProductosResumidos productosresumidos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.getText()==null || this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.getText()=="" || this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setText("0");
			}

			if(conColumnasBase) {productosresumidos.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelIdProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosresumidos.setnombre_unidad(this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelnombre_unidadProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosresumidos.setnombre_producto(this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelnombre_productoProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosresumidos.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelcantidadProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosresumidos.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelmontoProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosresumidos.setcodigo_producto(this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabelcodigo_productoProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosresumidos.settipo(this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosResumidosConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosResumidos.jLabeltipoProductosResumidos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosResumidos(ProductosResumidos productosresumidosBean,ProductosResumidos productosresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosResumidos(ProductosResumidos productosresumidosOrigen,ProductosResumidos productosresumidos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosresumidosOrigen.getId()!=null && !productosresumidosOrigen.getId().equals(0L))) {productosresumidos.setId(productosresumidosOrigen.getId());}}
			if(conDefault || (!conDefault && productosresumidosOrigen.getfecha_emision_desde()!=null && !productosresumidosOrigen.getfecha_emision_desde().equals(new Date()))) {productosresumidos.setfecha_emision_desde(productosresumidosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && productosresumidosOrigen.getfecha_emision_hasta()!=null && !productosresumidosOrigen.getfecha_emision_hasta().equals(new Date()))) {productosresumidos.setfecha_emision_hasta(productosresumidosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && productosresumidosOrigen.getnombre_unidad()!=null && !productosresumidosOrigen.getnombre_unidad().equals(""))) {productosresumidos.setnombre_unidad(productosresumidosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && productosresumidosOrigen.getnombre_producto()!=null && !productosresumidosOrigen.getnombre_producto().equals(""))) {productosresumidos.setnombre_producto(productosresumidosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && productosresumidosOrigen.getcantidad()!=null && !productosresumidosOrigen.getcantidad().equals(0))) {productosresumidos.setcantidad(productosresumidosOrigen.getcantidad());}
			if(conDefault || (!conDefault && productosresumidosOrigen.getmonto()!=null && !productosresumidosOrigen.getmonto().equals(0.0))) {productosresumidos.setmonto(productosresumidosOrigen.getmonto());}
			if(conDefault || (!conDefault && productosresumidosOrigen.getcodigo_producto()!=null && !productosresumidosOrigen.getcodigo_producto().equals(""))) {productosresumidos.setcodigo_producto(productosresumidosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && productosresumidosOrigen.gettipo()!=null && !productosresumidosOrigen.gettipo().equals(""))) {productosresumidos.settipo(productosresumidosOrigen.gettipo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosResumidos(ProductosResumidos productosresumidos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setText(productosresumidos.getId().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setText(productosresumidos.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setText(productosresumidos.getnombre_producto());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setText(productosresumidos.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setText(productosresumidos.getmonto().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setText(productosresumidos.getcodigo_producto());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setText(productosresumidos.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosResumidos(ProductosResumidosBean productosresumidosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setText(productosresumidosBean.getId().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setText(productosresumidosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setText(productosresumidosBean.getnombre_producto());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setText(productosresumidosBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setText(productosresumidosBean.getmonto().toString());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setText(productosresumidosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setText(productosresumidosBean.gettipo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosResumidos(ProductosResumidosParameterReturnGeneral productosresumidosReturnGeneral,ProductosResumidosBean productosresumidosBean,Boolean conDefault) throws Exception { 
		try {
			ProductosResumidos productosresumidosLocal=new ProductosResumidos();
			
			productosresumidosLocal=productosresumidosReturnGeneral.getProductosResumidos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosresumidosLocal.getId()!=null && !productosresumidosLocal.getId().equals(0L))) {productosresumidosBean.setId(productosresumidosLocal.getId());}}
			if(conDefault || (!conDefault && productosresumidosLocal.getnombre_unidad()!=null && !productosresumidosLocal.getnombre_unidad().equals(""))) {productosresumidosBean.setnombre_unidad(productosresumidosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && productosresumidosLocal.getnombre_producto()!=null && !productosresumidosLocal.getnombre_producto().equals(""))) {productosresumidosBean.setnombre_producto(productosresumidosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && productosresumidosLocal.getcantidad()!=null && !productosresumidosLocal.getcantidad().equals(0))) {productosresumidosBean.setcantidad(productosresumidosLocal.getcantidad());}
			if(conDefault || (!conDefault && productosresumidosLocal.getmonto()!=null && !productosresumidosLocal.getmonto().equals(0.0))) {productosresumidosBean.setmonto(productosresumidosLocal.getmonto());}
			if(conDefault || (!conDefault && productosresumidosLocal.getcodigo_producto()!=null && !productosresumidosLocal.getcodigo_producto().equals(""))) {productosresumidosBean.setcodigo_producto(productosresumidosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && productosresumidosLocal.gettipo()!=null && !productosresumidosLocal.gettipo().equals(""))) {productosresumidosBean.settipo(productosresumidosLocal.gettipo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosResumidosGenerico(Long idProductosResumidosSeleccionado,JComboBox jComboBoxProductosResumidos,List<ProductosResumidos> productosresumidossLocal)throws Exception {
		try {
			ProductosResumidos  productosresumidosTemp=null;

			for(ProductosResumidos productosresumidosAux:productosresumidossLocal) {
				if(productosresumidosAux.getId()!=null && productosresumidosAux.getId().equals(idProductosResumidosSeleccionado)) {
					productosresumidosTemp=productosresumidosAux;
					break;
				}
			}

			jComboBoxProductosResumidos.setSelectedItem(productosresumidosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosResumidosGenerico(JComboBox jComboBoxProductosResumidos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosResumidos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosResumidos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosResumidos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosResumidos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosResumidos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosresumidos=(ProductosResumidos) productosresumidosLogic.getProductosResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosresumidos =(ProductosResumidos) productosresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productosresumidos.getIsNew() && !productosresumidos.getIsChanged() && !productosresumidos.getIsDeleted()) {
				sDescripcion=productosresumidos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productosresumidos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productosresumidos.getIsNew() && !productosresumidos.getIsChanged() && !productosresumidos.getIsDeleted()) {
				sDescripcion=productosresumidos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productosresumidos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productosresumidos.getIsNew() && !productosresumidos.getIsChanged() && !productosresumidos.getIsDeleted()) {
				sDescripcion=productosresumidos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productosresumidos.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosResumidos productosresumidosRow=new ProductosResumidos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosresumidosRow=(ProductosResumidos) productosresumidosLogic.getProductosResumidoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosresumidosRow=(ProductosResumidos) productosresumidoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosResumidos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoProductosResumidos && this.isPermisoNuevoProductosResumidos));			
			this.jButtonDuplicarProductosResumidos.setVisible((this.isVisibilidadCeldaDuplicarProductosResumidos && this.isPermisoDuplicarProductosResumidos));			
			this.jButtonCopiarProductosResumidos.setVisible((this.isVisibilidadCeldaCopiarProductosResumidos && this.isPermisoCopiarProductosResumidos));
			this.jButtonVerFormProductosResumidos.setVisible((this.isVisibilidadCeldaVerFormProductosResumidos && this.isPermisoVerFormProductosResumidos));
			
			this.jButtonAbrirOrderByProductosResumidos.setVisible((this.isVisibilidadCeldaOrdenProductosResumidos && this.isPermisoOrdenProductosResumidos));			
			
			this.jButtonNuevoRelacionesProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosResumidos && this.isPermisoNuevoProductosResumidos));			
			this.jButtonNuevoGuardarCambiosProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoProductosResumidos && this.isPermisoNuevoProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarProductosResumidos.setVisible((this.isVisibilidadCeldaModificarProductosResumidos && this.isPermisoActualizarProductosResumidos));	
			this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarProductosResumidos.setVisible((this.isVisibilidadCeldaActualizarProductosResumidos && this.isPermisoActualizarProductosResumidos));	
			this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarProductosResumidos.setVisible((this.isVisibilidadCeldaEliminarProductosResumidos && this.isPermisoEliminarProductosResumidos));
			this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarProductosResumidos.setVisible(this.isVisibilidadCeldaCancelarProductosResumidos);							
			this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoProductosResumidos && this.isPermisoNuevoProductosResumidos));						
			this.jButtonDuplicarToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaDuplicarProductosResumidos && this.isPermisoDuplicarProductosResumidos));						
			this.jButtonCopiarToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaCopiarProductosResumidos && this.isPermisoCopiarProductosResumidos));			
			this.jButtonVerFormToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaVerFormProductosResumidos && this.isPermisoVerFormProductosResumidos));			
			this.jButtonAbrirOrderByToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaOrdenProductosResumidos && this.isPermisoOrdenProductosResumidos));
			this.jButtonNuevoRelacionesToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosResumidos && this.isPermisoNuevoProductosResumidos));			
			this.jButtonNuevoGuardarCambiosToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoProductosResumidos && this.isPermisoNuevoProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));			
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaModificarProductosResumidos && this.isPermisoActualizarProductosResumidos));	
			this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaActualizarProductosResumidos  && this.isPermisoActualizarProductosResumidos));	
			this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaEliminarProductosResumidos && this.isPermisoEliminarProductosResumidos));
			this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarToolBarProductosResumidos.setVisible(this.isVisibilidadCeldaCancelarProductosResumidos);				
			this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoProductosResumidos && this.isPermisoNuevoProductosResumidos));			
			this.jMenuItemDuplicarProductosResumidos.setVisible((this.isVisibilidadCeldaDuplicarProductosResumidos && this.isPermisoDuplicarProductosResumidos));			
			this.jMenuItemCopiarProductosResumidos.setVisible((this.isVisibilidadCeldaCopiarProductosResumidos && this.isPermisoCopiarProductosResumidos));			
			this.jMenuItemVerFormProductosResumidos.setVisible((this.isVisibilidadCeldaVerFormProductosResumidos && this.isPermisoVerFormProductosResumidos));			
			this.jMenuItemAbrirOrderByProductosResumidos.setVisible((this.isVisibilidadCeldaOrdenProductosResumidos && this.isPermisoOrdenProductosResumidos));			
			//this.jMenuItemMostrarOcultarProductosResumidos.setVisible((this.isVisibilidadCeldaOrdenProductosResumidos && this.isPermisoOrdenProductosResumidos));
			this.jMenuItemDetalleAbrirOrderByProductosResumidos.setVisible((this.isVisibilidadCeldaOrdenProductosResumidos && this.isPermisoOrdenProductosResumidos));			
			//this.jMenuItemDetalleMostrarOcultarProductosResumidos.setVisible((this.isVisibilidadCeldaOrdenProductosResumidos && this.isPermisoOrdenProductosResumidos));			
			this.jMenuItemNuevoRelacionesProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosResumidos && this.isPermisoNuevoProductosResumidos));			
			this.jMenuItemNuevoGuardarCambiosProductosResumidos.setVisible((this.isVisibilidadCeldaNuevoProductosResumidos && this.isPermisoNuevoProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));									
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemModificarProductosResumidos.setVisible((this.isVisibilidadCeldaModificarProductosResumidos && this.isPermisoActualizarProductosResumidos));	
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemActualizarProductosResumidos.setVisible((this.isVisibilidadCeldaActualizarProductosResumidos && this.isPermisoActualizarProductosResumidos));	
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemEliminarProductosResumidos.setVisible((this.isVisibilidadCeldaEliminarProductosResumidos && this.isPermisoEliminarProductosResumidos));
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemCancelarProductosResumidos.setVisible(this.isVisibilidadCeldaCancelarProductosResumidos);				
			}
			
			this.jMenuItemGuardarCambiosProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));						
			this.jMenuItemGuardarCambiosTablaProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosResumidos=this.jButtonNuevoProductosResumidos.isVisible();
			this.isVisibilidadCeldaDuplicarProductosResumidos=this.jButtonDuplicarProductosResumidos.isVisible();
			this.isVisibilidadCeldaCopiarProductosResumidos=this.jButtonCopiarProductosResumidos.isVisible();
			this.isVisibilidadCeldaVerFormProductosResumidos=this.jButtonVerFormProductosResumidos.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosResumidos=this.jButtonAbrirOrderByProductosResumidos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=this.jButtonNuevoRelacionesProductosResumidos.isVisible();
			this.isVisibilidadCeldaModificarProductosResumidos=this.jButtonModificarProductosResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.isVisibilidadCeldaActualizarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarProductosResumidos.isVisible();
			this.isVisibilidadCeldaEliminarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarProductosResumidos.isVisible();
			this.isVisibilidadCeldaCancelarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarProductosResumidos.isVisible();
			this.isVisibilidadCeldaGuardarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=this.jButtonGuardarCambiosTablaProductosResumidos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosResumidos=this.jButtonNuevoToolBarProductosResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=this.jButtonNuevoRelacionesToolBarProductosResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.isVisibilidadCeldaModificarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarToolBarProductosResumidos.isVisible();
			this.isVisibilidadCeldaActualizarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarToolBarProductosResumidos.isVisible();
			this.isVisibilidadCeldaEliminarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarToolBarProductosResumidos.isVisible();
			this.isVisibilidadCeldaCancelarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarToolBarProductosResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosResumidos=this.jButtonGuardarCambiosToolBarProductosResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=this.jButtonGuardarCambiosTablaToolBarProductosResumidos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosResumidos=this.jMenuItemNuevoProductosResumidos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=this.jMenuItemNuevoRelacionesProductosResumidos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.isVisibilidadCeldaModificarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jMenuItemModificarProductosResumidos.isVisible();
			this.isVisibilidadCeldaActualizarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jMenuItemActualizarProductosResumidos.isVisible();
			this.isVisibilidadCeldaEliminarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jMenuItemEliminarProductosResumidos.isVisible();
			this.isVisibilidadCeldaCancelarProductosResumidos=this.jInternalFrameDetalleFormProductosResumidos.jMenuItemCancelarProductosResumidos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosResumidos=this.jMenuItemGuardarCambiosProductosResumidos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=this.jMenuItemGuardarCambiosTablaProductosResumidos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosResumidos(Boolean esInicializar) {
		if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
				//if(this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosResumidos();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosResumidos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosResumidos() {
		this.jButtonNuevoProductosResumidos.setVisible(this.isPermisoNuevoProductosResumidos);			
		this.jButtonDuplicarProductosResumidos.setVisible(this.isPermisoDuplicarProductosResumidos);			
		this.jButtonCopiarProductosResumidos.setVisible(this.isPermisoCopiarProductosResumidos);			
		this.jButtonVerFormProductosResumidos.setVisible(this.isPermisoVerFormProductosResumidos);			
		
		this.jButtonAbrirOrderByProductosResumidos.setVisible(this.isPermisoOrdenProductosResumidos);					
		
		this.jButtonNuevoRelacionesProductosResumidos.setVisible(this.isPermisoNuevoProductosResumidos);			
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarProductosResumidos.setVisible(this.isPermisoActualizarProductosResumidos);	
			this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarProductosResumidos.setVisible(this.isPermisoActualizarProductosResumidos);	
			this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarProductosResumidos.setVisible(this.isPermisoEliminarProductosResumidos);
			this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarProductosResumidos.setVisible(this.isVisibilidadCeldaCancelarProductosResumidos);						
			this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.setVisible(this.isPermisoGuardarCambiosProductosResumidos);							
		}
		
		this.jButtonGuardarCambiosTablaProductosResumidos.setVisible(this.isPermisoActualizarProductosResumidos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosResumidos() {
		this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarProductosResumidos.setVisible(this.isPermisoActualizarProductosResumidos);	
		this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarProductosResumidos.setVisible(this.isPermisoActualizarProductosResumidos);	
		this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarProductosResumidos.setVisible(this.isPermisoEliminarProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarProductosResumidos.setVisible(this.isVisibilidadCeldaCancelarProductosResumidos);							
		this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.setVisible((this.isVisibilidadCeldaGuardarProductosResumidos && this.isPermisoGuardarCambiosProductosResumidos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosResumidos() {
		if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosResumidos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosResumidos() {
	}
	
	public void jTableDatosProductosResumidosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosResumidos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productosresumidos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductosResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductosResumidos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productosresumidosLogic.getConnexion());

				if(this.productosresumidos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productosresumidos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosResumidos=(TitledBorder)this.jScrollPanelDatosProductosResumidos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductosResumidos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productosresumidos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosResumidos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosresumidosLogic.getConnexion());

				if(this.productosresumidos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productosresumidos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosResumidos=(TitledBorder)this.jScrollPanelDatosProductosResumidos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosResumidos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productosresumidos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosResumidosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductosResumidos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosResumidos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosResumidos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosresumidosLogic.getConnexion());

				if(this.productosresumidos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productosresumidos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosResumidos=(TitledBorder)this.jScrollPanelDatosProductosResumidos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductosResumidos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productosresumidos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.productosresumidos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.productosresumidos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.productosresumidos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.productosresumidos.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productosresumidos.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.productosresumidos.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.productosresumidos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoProductosResumidosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.getproductosresumidos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosresumidos==null) {
						this.productosresumidos = new ProductosResumidos();
					}

					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);
				}

				if(this.productosresumidos.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.productosresumidos.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosResumidos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosResumidosProductosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosResumidos(false,false);

			this.getProductosResumidossBusquedaProductosResumidos();

			this.inicializarActualizarBindingProductosResumidos(false);

			//if(ProductosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosResumidos(false,false);

			this.getProductosResumidossFK_IdEmpresa();

			this.inicializarActualizarBindingProductosResumidos(false);

			//if(ProductosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosResumidos(false,false);

			this.getProductosResumidossFK_IdProducto();

			this.inicializarActualizarBindingProductosResumidos(false);

			//if(ProductosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosResumidosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosResumidos(false,false);

			this.getProductosResumidossFK_IdSucursal();

			this.inicializarActualizarBindingProductosResumidos(false);

			//if(ProductosResumidosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosResumidos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosresumidosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosResumidos() {
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
			this.jInternalFrameDetalleFormProductosResumidos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosResumidos.dispose();
			this.jInternalFrameDetalleFormProductosResumidos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
			this.jInternalFrameReporteDinamicoProductosResumidos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosResumidos.dispose();
			this.jInternalFrameReporteDinamicoProductosResumidos=null;
		}
		
		if(this.jInternalFrameImportacionProductosResumidos!=null) {
			this.jInternalFrameImportacionProductosResumidos.setVisible(false);	    			
			this.jInternalFrameImportacionProductosResumidos.dispose();
			this.jInternalFrameImportacionProductosResumidos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosResumidos();
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosResumidos")) {
				jButtonDuplicarProductosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosResumidos")) {
				jButtonCopiarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosResumidos")) {
				jButtonVerFormProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosResumidos")) {
				jButtonDuplicarProductosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosResumidos")) {
				jButtonDuplicarProductosResumidosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosResumidos")) {
				jButtonModificarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosResumidos")) {
				jButtonModificarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosResumidos")) {
				jButtonModificarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosResumidos")) {
				jButtonActualizarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosResumidos")) {
				jButtonActualizarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosResumidos")) {
				jButtonActualizarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosResumidos")) {
				jButtonEliminarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosResumidos")) {
				jButtonEliminarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosResumidos")) {
				jButtonEliminarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosResumidos")) {
				jButtonCancelarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosResumidos")) {
				jButtonCancelarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosResumidos")) {
				jButtonCancelarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosResumidos")) {
				jButtonCerrarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosResumidos")) {
				jButtonCerrarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosResumidos")) {
				jButtonCerrarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosResumidos")) {
				jButtonMostrarOcultarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosResumidos")) {
				jButtonCancelarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosResumidos")) {
				jButtonCopiarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosResumidos")) {
				jButtonVerFormProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosResumidos")) {
				jButtonCopiarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosResumidos")) {
				jButtonVerFormProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosResumidos")) {
				jButtonRecargarInformacionProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosResumidos")) {
				jButtonRecargarInformacionProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosResumidos")) {
				jButtonRecargarInformacionProductosResumidosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosResumidos")) {
				jButtonAnterioresProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosResumidos")) {
				jButtonAnterioresProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosResumidos")) {
				jButtonAnterioresProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosResumidos")) {
				jButtonSiguientesProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosResumidos")) {
				jButtonSiguientesProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosResumidos")) {
				jButtonSiguientesProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosResumidos") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosResumidos")) {
				jButtonAbrirOrderByProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosResumidos") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosResumidos")) {
				jButtonMostrarOcultarProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosResumidos")) {
				jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosResumidos")) {
				jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosResumidos")) {
				jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosResumidos")) {
				jButtonCerrarReporteDinamicoProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosResumidos")) {
				jButtonGenerarReporteDinamicoProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosResumidos")) {
				
				jButtonGenerarExcelReporteDinamicoProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosResumidos")) {
				jButtonCerrarImportacionProductosResumidosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosResumidos")) {
				
				jButtonGenerarImportacionProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosResumidos")) {
				
				jButtonAbrirImportacionProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosResumidos")) {
				jComboBoxTiposAccionesProductosResumidosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosResumidos")) {
				jComboBoxTiposRelacionesProductosResumidosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosResumidos")) {
				jComboBoxTiposAccionesProductosResumidosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosResumidos")) {
				
				jComboBoxTiposSeleccionarProductosResumidosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosResumidos")) {
				jTextFieldValorCampoGeneralProductosResumidosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosResumidos")) {
				jButtonAbrirOrderByProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosResumidos")) {
				jButtonAbrirOrderByProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosResumidos")) {
				jButtonCerrarOrderByProductosResumidosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosResumidosBusqueda")) {
				this.jButtonidProductosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductosResumidosUpdate")) {
				this.jButtonid_productoProductosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductosResumidosBusqueda")) {
				this.jButtonid_productoProductosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosResumidosUpdate")) {
				this.jButtonid_empresaProductosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosResumidosBusqueda")) {
				this.jButtonid_empresaProductosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosResumidosUpdate")) {
				this.jButtonid_sucursalProductosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosResumidosBusqueda")) {
				this.jButtonid_sucursalProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProductosResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProductosResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosResumidosBusqueda")) {
				this.jButtonnombre_unidadProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosResumidosBusqueda")) {
				this.jButtonnombre_productoProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosResumidosBusqueda")) {
				this.jButtoncantidadProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoProductosResumidosBusqueda")) {
				this.jButtonmontoProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProductosResumidosBusqueda")) {
				this.jButtoncodigo_productoProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoProductosResumidosBusqueda")) {
				this.jButtontipoProductosResumidosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosResumidosProductosResumidos")) {
				this.jButtonBusquedaProductosResumidosProductosResumidosActionPerformed(evt);
			}
			
			;
			
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosResumidos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosResumidos productosresumidosLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosresumidosLocal=this.productosresumidos;
			} else {
				productosresumidosLocal=this.productosresumidosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
							
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
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
			
			


			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
								
						
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
								
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
							
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
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
			
			


			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
								
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosResumidos")) {
					jCheckBoxSeleccionarTodosProductosResumidosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosResumidos")) {
					jCheckBoxSeleccionadosProductosResumidosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosResumidos")) {
					
				}
				
				


				
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
												
				
				


				
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
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
			
			


			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosResumidosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosresumidos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosresumidos);
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
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
				
				


				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosResumidos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosResumidos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosResumidosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosresumidosAnterior =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosResumidos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosResumidos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productosresumidos =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productosresumidos =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productosresumidos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosResumidos")) {
				
				}
				
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosResumidos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosResumidos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosResumidos")) {
			
			}
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosResumidos();
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			if(sTipo.equals("NuevoProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosResumidos")) {
				jButtonDuplicarProductosResumidosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosResumidos")) {
				jButtonCopiarProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosResumidos")) {
				jButtonVerFormProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosResumidos")) {
				jButtonNuevoProductosResumidosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosResumidos")) {
				jButtonModificarProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosResumidos")) {
				jButtonActualizarProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosResumidos")) {
				jButtonEliminarProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosResumidos")) {
				jButtonCancelarProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosResumidos")) {
				jButtonCerrarProductosResumidosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosResumidos")) {
				jButtonGuardarCambiosProductosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosResumidos")) {
				jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosResumidos")) {
				jButtonAbrirOrderByProductosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosResumidos")) {
				jButtonRecargarInformacionProductosResumidosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosResumidos")) {
				jButtonAnterioresProductosResumidosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosResumidos")) {
				jButtonSiguientesProductosResumidosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosResumidosBusqueda")) {
				this.jButtonidProductosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductosResumidosUpdate")) {
				this.jButtonid_productoProductosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductosResumidosBusqueda")) {
				this.jButtonid_productoProductosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosResumidosUpdate")) {
				this.jButtonid_empresaProductosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosResumidosBusqueda")) {
				this.jButtonid_empresaProductosResumidosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosResumidosUpdate")) {
				this.jButtonid_sucursalProductosResumidosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosResumidosBusqueda")) {
				this.jButtonid_sucursalProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeProductosResumidosBusqueda")) {
				this.jButtonfecha_emision_desdeProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaProductosResumidosBusqueda")) {
				this.jButtonfecha_emision_hastaProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosResumidosBusqueda")) {
				this.jButtonnombre_unidadProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProductosResumidosBusqueda")) {
				this.jButtonnombre_productoProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductosResumidosBusqueda")) {
				this.jButtoncantidadProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoProductosResumidosBusqueda")) {
				this.jButtonmontoProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProductosResumidosBusqueda")) {
				this.jButtoncodigo_productoProductosResumidosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoProductosResumidosBusqueda")) {
				this.jButtontipoProductosResumidosBusquedaActionPerformed(evt);
			}
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosResumidos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosResumidos")) {
				closingInternalFrameProductosResumidos();
				
			} else if(sTipo.equals("jButtonCancelarProductosResumidos")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosResumidos = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosResumidosBeanSwingJInternalFrame jInternalFrameParent=(ProductosResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosResumidos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosResumidosActionPerformed(null);
			}
			
			ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosresumidos,new Object(),this.productosresumidosParameterGeneral,this.productosresumidosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosResumidos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productosresumidos)) {
			if(!esControlTabla) {
				if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);			
				}
				
				if(this.productosresumidosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosResumidos(this.productosresumidos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosResumidos(this.productosresumidosReturnGeneral,this.productosresumidosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosresumidosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosResumidos(classes,this.productosresumidosReturnGeneral,this.productosresumidosBean,false);
					}
						
					if(this.productosresumidosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosResumidos(this.productosresumidosReturnGeneral.getProductosResumidos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosResumidos(this.productosresumidosReturnGeneral.getProductosResumidos());	
					}
						
					if(this.productosresumidosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosResumidos(this.productosresumidosReturnGeneral.getProductosResumidos(),classes);//this.productosresumidosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosResumidos(this.productosresumidos,classes);//this.productosresumidosBean);									
				}
			
				if(ProductosResumidosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosResumidos(this.productosresumidos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosResumidos(this.productosresumidos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosresumidosAnterior!=null) {
						this.productosresumidos=this.productosresumidosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosresumidosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosresumidosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosresumidosReturnGeneral.getProductosResumidos(),productosresumidosLogic.getProductosResumidoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosresumidosReturnGeneral.getProductosResumidos(),this.productosresumidoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosResumidos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosResumidos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosResumidos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosResumidos() throws Exception {
		
		ProductosResumidosModel productosresumidosModel=(ProductosResumidosModel)this.jTableDatosProductosResumidos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosresumidosModel.productosresumidoss=this.productosresumidosLogic.getProductosResumidoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosresumidosModel.productosresumidoss=this.productosresumidoss;
		}
		
		
		((ProductosResumidosModel) this.jTableDatosProductosResumidos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosResumidos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosresumidosAnterior(),this.productosresumidosLogic.getProductosResumidoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosresumidosAnterior(),this.productosresumidoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosResumidos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosResumidos(ProductosResumidos productosresumidos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
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
										
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosresumidos,new Object(),generalEntityParameterGeneral,this.productosresumidosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosresumidosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosResumidosConstantesFunciones.getClassesRelationshipsOfProductosResumidos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosResumidosConstantesFunciones.getClassesRelationshipsFromStringsOfProductosResumidos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosResumidos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosResumidosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosresumidos,new Object(),generalEntityParameterGeneral,this.productosresumidosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosResumidos(ProductosResumidosBean productosresumidosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosResumidos(ArrayList<Classe> classes,ProductosResumidosReturnGeneral productosresumidosReturnGeneral,ProductosResumidosBean productosresumidosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosResumidos(ProductosResumidos productosresumidos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productosresumidos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosResumidos = new ProductosResumidosDetalleFormJInternalFrame(jDesktopPane,this.productosresumidosSessionBean.getConGuardarRelaciones(),this.productosresumidosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.setVisible(false);
		this.jInternalFrameDetalleFormProductosResumidos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosResumidos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosResumidos.productosresumidosLogic=this.productosresumidosLogic;
		
		this.cargarCombosFrameForeignKeyProductosResumidos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosResumidos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosResumidos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosResumidos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosResumidos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosResumidos"));
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarProductosResumidos.addActionListener(new ButtonActionListener(this,"ModificarProductosResumidos"));

		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosResumidos"));
					
		this.jInternalFrameDetalleFormProductosResumidos.jMenuItemModificarProductosResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarProductosResumidos.addActionListener (new ButtonActionListener(this,"ActualizarProductosResumidos"));
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosResumidos"));
						
		this.jInternalFrameDetalleFormProductosResumidos.jMenuItemActualizarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarProductosResumidos.addActionListener (new ButtonActionListener(this,"EliminarProductosResumidos"));
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosResumidos"));
								
		this.jInternalFrameDetalleFormProductosResumidos.jMenuItemEliminarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarProductosResumidos.addActionListener (new ButtonActionListener(this,"CancelarProductosResumidos"));
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosResumidos"));
					
		this.jInternalFrameDetalleFormProductosResumidos.jMenuItemCancelarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosResumidos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jMenuItemDetalleCerrarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosResumidos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosResumidos"));
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosResumidos"));
		
		
		
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosResumidos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonidProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_productoProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_empresaProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_empresaProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_sucursalProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_sucursalProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonfecha_emision_desdeProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonfecha_emision_hastaProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonnombre_unidadProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonnombre_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtoncantidadProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonmontoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"montoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtoncodigo_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtontipoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tipoProductosResumidosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosResumidos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosResumidos"));
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosResumidos"));
		}
		
		this.jTableDatosProductosResumidos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosResumidos"));
		
		this.jTableDatosProductosResumidos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosResumidos"));
		
		this.jButtonNuevoProductosResumidos.addActionListener(new ButtonActionListener(this,"NuevoProductosResumidos"));
		
		this.jButtonDuplicarProductosResumidos.addActionListener(new ButtonActionListener(this,"DuplicarProductosResumidos"));
		
		this.jButtonCopiarProductosResumidos.addActionListener(new ButtonActionListener(this,"CopiarProductosResumidos"));
		
		this.jButtonVerFormProductosResumidos.addActionListener(new ButtonActionListener(this,"VerFormProductosResumidos"));
		
		
		this.jButtonNuevoToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosResumidos"));
			
		this.jButtonDuplicarToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosResumidos"));
			
		this.jMenuItemNuevoProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosResumidos"));
			
		this.jMenuItemDuplicarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosResumidos"));		
		
		
		this.jButtonNuevoRelacionesProductosResumidos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosResumidos"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosResumidos"));
			
		this.jMenuItemNuevoRelacionesProductosResumidos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarProductosResumidos.addActionListener(new ButtonActionListener(this,"ModificarProductosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonModificarToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosResumidos"));
			
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemModificarProductosResumidos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarProductosResumidos.addActionListener (new ButtonActionListener(this,"ActualizarProductosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonActualizarToolBarProductosResumidos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosResumidos"));
				
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemActualizarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarProductosResumidos.addActionListener (new ButtonActionListener(this,"EliminarProductosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonEliminarToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosResumidos"));
						
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemEliminarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarProductosResumidos.addActionListener (new ButtonActionListener(this,"CancelarProductosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonCancelarToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosResumidos"));
			
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemCancelarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosResumidos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosResumidos"));		
		
		
		this.jButtonCerrarProductosResumidos.addActionListener (new ButtonActionListener(this,"CerrarProductosResumidos"));
		
		
		this.jButtonCerrarToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosResumidos"));
			
		this.jMenuItemCerrarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosResumidos"));
			
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jMenuItemDetalleCerrarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosResumidos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosResumidos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosResumidos"));
		}
		
		this.jButtonCopiarToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosResumidos"));
			
		this.jButtonVerFormToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosResumidos"));
		
		this.jMenuItemGuardarCambiosProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosResumidos"));
			
		this.jMenuItemCopiarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosResumidos"));		
		
		this.jMenuItemVerFormProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosResumidos"));		
		
		
		this.jButtonGuardarCambiosTablaProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosResumidos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosResumidos"));
			
		this.jMenuItemGuardarCambiosTablaProductosResumidos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosResumidos"));		
		
		
		
		this.jButtonRecargarInformacionProductosResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosResumidos"));
					
		this.jButtonRecargarInformacionToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosResumidos"));
		
		this.jMenuItemRecargarInformacionProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosResumidos"));		
		
		
		
		this.jButtonAnterioresProductosResumidos.addActionListener (new ButtonActionListener(this,"AnterioresProductosResumidos"));
		
		
		this.jButtonAnterioresToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosResumidos"));
		
		this.jMenuItemAnterioresProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosResumidos"));		
		
		
		this.jButtonSiguientesProductosResumidos.addActionListener (new ButtonActionListener(this,"SiguientesProductosResumidos"));
		
		
		this.jButtonSiguientesToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosResumidos"));
			
		this.jMenuItemSiguientesProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosResumidos"));
			
		this.jMenuItemAbrirOrderByProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosResumidos"));
			
		this.jMenuItemMostrarOcultarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosResumidos"));
			
		this.jMenuItemDetalleAbrirOrderByProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosResumidos"));
			
		this.jMenuItemDetalleMostarOcultarProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosResumidos"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosResumidos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosResumidos"));
			
		this.jMenuItemNuevoGuardarCambiosProductosResumidos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosResumidos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosResumidos"));

		this.jCheckBoxSeleccionadosProductosResumidos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosResumidos"));
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosResumidos"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosResumidos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosResumidos"));
			
		this.jComboBoxTiposAccionesProductosResumidos.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosResumidos"));
					
		this.jComboBoxTiposSeleccionarProductosResumidos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosResumidos"));
			
		this.jTextFieldValorCampoGeneralProductosResumidos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosResumidos"));		
		
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonidProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_productoProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_empresaProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_empresaProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_sucursalProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_sucursalProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonfecha_emision_desdeProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonfecha_emision_hastaProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonnombre_unidadProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonnombre_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtoncantidadProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonmontoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"montoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtoncodigo_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtontipoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tipoProductosResumidosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosResumidosProductosResumidos.addActionListener(new ButtonActionListener(this,"BusquedaProductosResumidosProductosResumidos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosResumidos!=null) {
				this.jInternalFrameReporteDinamicoProductosResumidos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosResumidos"));
				this.jInternalFrameReporteDinamicoProductosResumidos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosResumidos"));
				this.jInternalFrameReporteDinamicoProductosResumidos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosResumidos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosResumidos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosResumidos"));				
			//this.jButtonGenerarReporteDinamicoProductosResumidos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosResumidos"));
			//this.jButtonGenerarExcelReporteDinamicoProductosResumidos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosResumidos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosResumidos!=null) {
				this.jInternalFrameImportacionProductosResumidos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosResumidos"));
				this.jInternalFrameImportacionProductosResumidos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosResumidos"));
				this.jInternalFrameImportacionProductosResumidos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosResumidos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosResumidos"));
			
			this.jButtonAbrirOrderByToolBarProductosResumidos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosResumidos"));			
			
			if(this.jInternalFrameOrderByProductosResumidos!=null) {
				this.jInternalFrameOrderByProductosResumidos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosResumidos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosResumidos.jTabbedPaneRelacionesProductosResumidos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosResumidos"));
		
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
            		closingInternalFrameProductosResumidos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosResumidos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosResumidos = (JInternalFrameBase)event.getSource();
	            	
	            ProductosResumidosBeanSwingJInternalFrame jInternalFrameParent=(ProductosResumidosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosResumidos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosResumidosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosResumidos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosResumidosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosResumidos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosResumidos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosResumidosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosResumidos";
		inputMap = this.jButtonNuevoProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosResumidosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosResumidosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosResumidos";
		inputMap = this.jButtonNuevoRelacionesProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosResumidosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosResumidos";
		inputMap = this.jButtonModificarProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosResumidos";
		inputMap = this.jButtonActualizarProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosResumidos";
		inputMap = this.jButtonEliminarProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosResumidos";
		inputMap = this.jButtonCancelarProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosResumidos";
		inputMap = this.jButtonCerrarProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosResumidos";
		inputMap = this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosResumidos.jButtonGuardarCambiosProductosResumidos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosResumidosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosResumidos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosResumidosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosResumidos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosResumidosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonidProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_productoProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_empresaProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_empresaProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosResumidosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_sucursalProductosResumidosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosResumidosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonid_sucursalProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonfecha_emision_desdeProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonfecha_emision_hastaProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonnombre_unidadProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonnombre_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtoncantidadProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtonmontoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"montoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtoncodigo_productoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProductosResumidosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosResumidos.jButtontipoProductosResumidosBusqueda.addActionListener(new ButtonActionListener(this,"tipoProductosResumidosBusqueda"));
		
		
		this.jButtonBusquedaProductosResumidosProductosResumidos.addActionListener(new ButtonActionListener(this,"BusquedaProductosResumidosProductosResumidos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosResumidos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosResumidosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosResumidos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosResumidos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
					productosresumidosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosResumidos productosresumidosAux:productosresumidoss) {
					productosresumidosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
						productosresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosResumidos productosresumidosAux:productosresumidoss) {
						productosresumidosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosResumidos productosresumidosAux:productosresumidoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosResumidosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosResumidos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosResumidos.getSelectedRows();
			
			ProductosResumidos productosresumidosLocal=new ProductosResumidos();
			
			//this.seleccionarTodosProductosResumidos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosresumidosLocal =(ProductosResumidos) this.productosresumidosLogic.getProductosResumidoss().toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosresumidosLocal =(ProductosResumidos) this.productosresumidoss.toArray()[this.jTableDatosProductosResumidos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosresumidosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
						productosresumidosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosResumidos productosresumidosAux:productosresumidoss) {
						productosresumidosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosResumidos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosResumidos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosResumidos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosResumidos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosResumidosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosResumidosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosResumidosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosResumidos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosResumidos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosResumidos productosresumidosAux:this.productosresumidosLogic.getProductosResumidoss()) {
				
						if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							productosresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							productosresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosresumidosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productosresumidosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productosresumidosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							productosresumidosAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							productosresumidosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							productosresumidosAux.settipo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosResumidos productosresumidosAux:productosresumidoss) {
					
						if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							productosresumidosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							productosresumidosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosresumidosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							productosresumidosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productosresumidosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							productosresumidosAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							productosresumidosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							productosresumidosAux.settipo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosResumidos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosResumidosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosResumidos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosResumidos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosResumidos) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosResumidos(conSplash);
				
					this.generarReporteProductosResumidossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosResumidossSeleccionados();
				//this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosResumidossSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosResumidossSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosResumidos();
				
				this.exportarProductosResumidossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosResumidoss();
				//this.importarProductosResumidoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosResumidos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosResumidossSeleccionados();
				//this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosResumidos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosResumidos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosResumidos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosResumidosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosResumidos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosResumidos(conSplash);
					
						//this.actualizarParametrosGeneralProductosResumidos();
						
						this.generarReporteProcesoAccionProductosResumidossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosResumidosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos ResumidosES SELECCIONADOS?", "MANTENIMIENTO DE Productos Resumidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosResumidos();
				
						this.actualizarParametrosGeneralProductosResumidos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosresumidosReturnGeneral=productosresumidosLogic.procesarAccionProductosResumidossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosresumidosLogic.getProductosResumidoss(),this.productosresumidosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosResumidos();
					
					ProductosResumidosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosResumidosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosResumidos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosResumidos.jComboBoxTiposAccionesFormularioProductosResumidos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosResumidos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosResumidosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosResumidos();
			
			if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
			ProductosResumidos productosresumidos=new ProductosResumidos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosResumidos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosResumidos.getSelectedItem();
			
			
			
			
			productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
			//this.sTipoAccion;
			
			if(productosresumidossSeleccionados.size()==1) {
				for(ProductosResumidos productosresumidosAux:productosresumidossSeleccionados) {
					productosresumidos=productosresumidosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosResumidos();
			
      		//this.finishProcessProductosResumidos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosResumidosReturnGeneral() throws Exception {
		if(this.productosresumidosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosresumidosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosresumidosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosresumidosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosresumidosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosResumidos(false);
		}
		
		if(this.productosresumidosReturnGeneral.getConRetornoLista() || this.productosresumidosReturnGeneral.getConRetornoObjeto()) {
			if(this.productosresumidosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosresumidosLogic.setProductosResumidoss(this.productosresumidosReturnGeneral.getProductosResumidoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosResumidos(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosResumidos() throws Exception {
		
		
	}
	
	public ArrayList<ProductosResumidos> getProductosResumidossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosResumidos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosResumidos productosresumidosAux:productosresumidosLogic.getProductosResumidoss()) {
					if(productosresumidosAux.getIsSelected()) {
						productosresumidossSeleccionados.add(productosresumidosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosResumidos productosresumidosAux:this.productosresumidoss) {
					if(productosresumidosAux.getIsSelected()) {
						productosresumidossSeleccionados.add(productosresumidosAux);				
					}
				}
			}
			
			if(productosresumidossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productosresumidossSeleccionados.addAll(this.productosresumidosLogic.getProductosResumidoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productosresumidossSeleccionados.addAll(this.productosresumidoss);				
					}
				}
			}
		} else {
			productosresumidossSeleccionados.add(this.productosresumidos);
		}
		
		return productosresumidossSeleccionados;
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
	
	public void generarReporteProductosResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosResumidossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosResumidossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosResumidossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosResumidossSeleccionados() throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosResumidossSeleccionados() throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosResumidossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosResumidossSeleccionados() throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosResumidos();
		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosResumidos();
		
		
		//this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados ,productosresumidosImplementable,productosresumidosImplementableHome);
	}
	
	public void mostrarImportacionProductosResumidoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosResumidos();
		
		this.abrirFrameImportacionProductosResumidos();		
		
			
		//this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados ,productosresumidosImplementable,productosresumidosImplementableHome);
	}
	
	public void importarProductosResumidoss() throws Exception {		
	
	}
	
	public void exportarProductosResumidossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosResumidossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosResumidossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosResumidossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Resumidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosResumidossSeleccionados() throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosResumidos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosResumidos productosresumidosAux:productosresumidossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosResumidos(productosresumidosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosresumidosAux.setsDetalleGeneralEntityReporte(productosresumidosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosResumidos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosResumidosConstantesFunciones.LABEL_TIPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosResumidos(ProductosResumidos productosresumidos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productosresumidos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosresumidos.gettipo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosResumidossSeleccionados() throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosResumidoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosResumidos(row);				
				iRow++;
			}				
			
			for(ProductosResumidos productosresumidosAux:productosresumidossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosResumidos(productosresumidosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosResumidossSeleccionados() throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();		
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosresumidos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productosresumidoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productosresumidos");
			//elementRoot.appendChild(element);
		
			for(ProductosResumidos productosresumidosAux:productosresumidossSeleccionados) {
				element = document.createElement("productosresumidos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosResumidos(productosresumidosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Resumidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosResumidos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosResumidosConstantesFunciones.LABEL_TIPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosResumidos(ProductosResumidos productosresumidos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(productosresumidos.gettipo());				
	}
	
	public void setFilaDatosExportarXmlProductosResumidos(ProductosResumidos productosresumidos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosResumidosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productosresumidos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosResumidosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productosresumidos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproducto_descripcion = document.createElement(ProductosResumidosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productosresumidos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ProductosResumidosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productosresumidos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosResumidosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productosresumidos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_emision_desde = document.createElement(ProductosResumidosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(productosresumidos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ProductosResumidosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(productosresumidos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_unidad = document.createElement(ProductosResumidosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(productosresumidos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementnombre_producto = document.createElement(ProductosResumidosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(productosresumidos.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(ProductosResumidosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productosresumidos.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementmonto = document.createElement(ProductosResumidosConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(productosresumidos.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementcodigo_producto = document.createElement(ProductosResumidosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(productosresumidos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementtipo = document.createElement(ProductosResumidosConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(productosresumidos.gettipo().trim()));
		element.appendChild(elementtipo);
	}
	
	public void generarReporteGroupGenericoProductosResumidossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosResumidos> productosresumidossSeleccionados=new ArrayList<ProductosResumidos>();
		
		productosresumidossSeleccionados=this.getProductosResumidossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosResumidos(productosresumidossSeleccionados);
		
		this.generarReporteProductosResumidoss("Todos",productosresumidossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosResumidos(ArrayList<ProductosResumidos> productosresumidossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosResumidos productosresumidosAux:productosresumidossSeleccionados) {
				productosresumidosAux.setsDetalleGeneralEntityReporte(productosresumidosAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosresumidosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(productosresumidosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ProductosResumidosConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					productosresumidosAux.setsDescripcionGeneralEntityReporte1(productosresumidosAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosResumidosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosResumidos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosResumidos=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=true;
				this.isVisibilidadCeldaGuardarCambiosProductosResumidos=true;
			}
			
			this.isVisibilidadCeldaModificarProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=false;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
			this.isVisibilidadCeldaModificarProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=true;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
			this.isVisibilidadCeldaModificarProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=true;
			this.isVisibilidadCeldaEliminarProductosResumidos=true;
			this.isVisibilidadCeldaCancelarProductosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
			this.isVisibilidadCeldaModificarProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=true;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=true;
			this.isVisibilidadCeldaModificarProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=false;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
			this.isVisibilidadCeldaActualizarProductosResumidos=false;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
			this.isVisibilidadCeldaModificarProductosResumidos=true;
			this.isVisibilidadCeldaActualizarProductosResumidos=false;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
			this.isVisibilidadCeldaCancelarProductosResumidos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosResumidos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosResumidosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosResumidos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=true;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=true;
		} else {
			this.actualizarEstadoPanelsProductosResumidos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosResumidos=false;
			//this.isVisibilidadCeldaVerFormProductosResumidos=false;
			this.isVisibilidadCeldaDuplicarProductosResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosresumidosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosResumidos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!productosresumidosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;												
			}
			
			this.jButtonCerrarProductosResumidos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
		}
		
		if(!this.permiteMantenimiento(this.productosresumidos)) {
			this.isVisibilidadCeldaActualizarProductosResumidos=false;
			this.isVisibilidadCeldaEliminarProductosResumidos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosResumidos=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosResumidos=false;
		this.isVisibilidadCeldaGuardarCambiosProductosResumidos=false;
		//this.isVisibilidadCeldaModificarProductosResumidos=true;
		this.isVisibilidadCeldaActualizarProductosResumidos=false;
		this.isVisibilidadCeldaEliminarProductosResumidos=false;
		//this.isVisibilidadCeldaCancelarProductosResumidos=true;			
		this.isVisibilidadCeldaGuardarProductosResumidos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosResumidos() {
	}
	
	public void actualizarEstadoPanelsProductosResumidos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosResumidos!=null) {
				this.jScrollPanelDatosEdicionProductosResumidos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosResumidos!=null) {
				this.jScrollPanelDatosProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosResumidos!=null) {
				this.jPanelPaginacionProductosResumidos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
					this.jTabbedPaneBusquedasProductosResumidos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosresumidosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosResumidos!=null) {
				this.jTabbedPaneBusquedasProductosResumidos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosResumidos!=null) {
				this.jPanelParametrosReportesProductosResumidos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProductosResumidos=isParaProducto;
			if(!this.isVisibilidadBusquedaProductosResumidos) {this.jTabbedPaneBusquedasProductosResumidos.remove(jPanelBusquedaProductosResumidosProductosResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosResumidos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosResumidos) {this.jTabbedPaneBusquedasProductosResumidos.remove(jPanelBusquedaProductosResumidosProductosResumidos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductosResumidos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductosResumidos) {this.jTabbedPaneBusquedasProductosResumidos.remove(jPanelBusquedaProductosResumidosProductosResumidos);}
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
			
			this.inicializarActualizarBindingTablaProductosResumidos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosResumidos() {
		this.updateBorderResaltarBusquedasFormularioProductosResumidos();
		this.updateVisibilidadBusquedasFormularioProductosResumidos();
		this.updateHabilitarBusquedasFormularioProductosResumidos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosResumidos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosResumidos.getComponents().length>0) {
	

		if(this.productosresumidosConstantesFunciones.resaltarBusquedaProductosResumidosProductosResumidos!=null) {
			index= this.jTabbedPaneBusquedasProductosResumidos.indexOfComponent(this.jPanelBusquedaProductosResumidosProductosResumidos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosResumidos.getComponent(index);
				jPanel.setBorder(this.productosresumidosConstantesFunciones.resaltarBusquedaProductosResumidosProductosResumidos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosResumidos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosResumidos.indexOfComponent(this.jPanelBusquedaProductosResumidosProductosResumidos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosResumidos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosresumidosConstantesFunciones.mostrarBusquedaProductosResumidosProductosResumidos);
			if(!this.productosresumidosConstantesFunciones.mostrarBusquedaProductosResumidosProductosResumidos && index>-1) {
				this.jTabbedPaneBusquedasProductosResumidos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosResumidos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosResumidos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosResumidos.indexOfComponent(this.jPanelBusquedaProductosResumidosProductosResumidos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosResumidos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosresumidosConstantesFunciones.activarBusquedaProductosResumidosProductosResumidos);
				this.jTabbedPaneBusquedasProductosResumidos.setEnabledAt(index,this.productosresumidosConstantesFunciones.activarBusquedaProductosResumidosProductosResumidos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosResumidos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosResumidos")) {
			index= this.jTabbedPaneBusquedasProductosResumidos.indexOfComponent(this.jPanelBusquedaProductosResumidosProductosResumidos);

			this.jTabbedPaneBusquedasProductosResumidos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosResumidos.getComponent(index);

			this.productosresumidosConstantesFunciones.setResaltarBusquedaProductosResumidosProductosResumidos(resaltar);

			jPanel.setBorder(this.productosresumidosConstantesFunciones.resaltarBusquedaProductosResumidosProductosResumidos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosResumidos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosResumidos() throws Exception {

		if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosResumidos();
		this.updateVisibilidadResaltarControlesFormularioProductosResumidos();
		this.updateHabilitarResaltarControlesFormularioProductosResumidos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosresumidosConstantesFunciones.resaltaridProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltaridProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarid_productoProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarid_productoProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarid_empresaProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarid_empresaProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarid_sucursalProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarid_sucursalProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarfecha_emision_desdeProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_desdeProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarfecha_emision_desdeProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarfecha_emision_hastaProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_hastaProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarfecha_emision_hastaProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarnombre_unidadProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarnombre_unidadProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarnombre_productoProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarnombre_productoProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarcantidadProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarcantidadProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarmontoProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarmontoProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltarcodigo_productoProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltarcodigo_productoProductosResumidos);}
		if(this.productosresumidosConstantesFunciones.resaltartipoProductosResumidos!=null && this.jInternalFrameDetalleFormProductosResumidos!=null) {this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setBorder(this.productosresumidosConstantesFunciones.resaltartipoProductosResumidos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosResumidos() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
	
		//this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostraridProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelidProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostraridProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarid_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelid_productoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarid_productoProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarid_empresaProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelid_empresaProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarid_empresaProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarid_sucursalProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelid_sucursalProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarid_sucursalProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_desdeProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarfecha_emision_desdeProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelfecha_emision_desdeProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarfecha_emision_desdeProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_hastaProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarfecha_emision_hastaProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelfecha_emision_hastaProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarfecha_emision_hastaProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarnombre_unidadProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelnombre_unidadProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarnombre_unidadProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarnombre_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelnombre_productoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarnombre_productoProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarcantidadProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelcantidadProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarcantidadProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarmontoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelmontoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarmontoProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarcodigo_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPanelcodigo_productoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrarcodigo_productoProductosResumidos);
		//this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrartipoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jPaneltipoProductosResumidos.setVisible(this.productosresumidosConstantesFunciones.mostrartipoProductosResumidos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosResumidos() throws Exception {
		if(this.jInternalFrameDetalleFormProductosResumidos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosResumidos!=null) {
	
		this.jInternalFrameDetalleFormProductosResumidos.jLabelidProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activaridProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_productoProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarid_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_empresaProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarid_empresaProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jComboBoxid_sucursalProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarid_sucursalProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_desdeProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarfecha_emision_desdeProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jDateChooserfecha_emision_hastaProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarfecha_emision_hastaProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldnombre_unidadProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarnombre_unidadProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextAreanombre_productoProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarnombre_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcantidadProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarcantidadProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldmontoProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarmontoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldcodigo_productoProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activarcodigo_productoProductosResumidos);
		this.jInternalFrameDetalleFormProductosResumidos.jTextFieldtipoProductosResumidos.setEnabled(this.productosresumidosConstantesFunciones.activartipoProductosResumidos);
		}
	}
	
		
}