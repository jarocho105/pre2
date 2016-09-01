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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.ProductoPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.ProductoPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.ProductoPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.ProductoPuntoVentaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

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
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoPuntoVentaBeanSwingJInternalFrame extends ProductoPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoPuntoVenta> productopuntoventaValidator = new ClassValidator<ProductoPuntoVenta>(ProductoPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoPuntoVenta productopuntoventa;	
	public ProductoPuntoVenta productopuntoventaAux;
	public ProductoPuntoVenta productopuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoPuntoVenta productopuntoventaTotales;
	public Long idProductoPuntoVentaActual;
	public Long iIdNuevoProductoPuntoVenta=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoProductoPuntoVenta;
	public Boolean isPermisoNuevoProductoPuntoVenta;
	public Boolean isPermisoActualizarProductoPuntoVenta;
	public Boolean isPermisoActualizarOriginalProductoPuntoVenta;
	public Boolean isPermisoEliminarProductoPuntoVenta;
	public Boolean isPermisoGuardarCambiosProductoPuntoVenta;
	public Boolean isPermisoConsultaProductoPuntoVenta;
	public Boolean isPermisoBusquedaProductoPuntoVenta;
	public Boolean isPermisoReporteProductoPuntoVenta;
	public Boolean isPermisoPaginacionMedioProductoPuntoVenta;
	public Boolean isPermisoPaginacionAltoProductoPuntoVenta;
	public Boolean isPermisoPaginacionTodoProductoPuntoVenta;
	public Boolean isPermisoCopiarProductoPuntoVenta;
	public Boolean isPermisoVerFormProductoPuntoVenta;
	public Boolean isPermisoDuplicarProductoPuntoVenta;
	public Boolean isPermisoOrdenProductoPuntoVenta;
	
	
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
	
	public ProductoPuntoVentaParameterReturnGeneral productopuntoventaReturnGeneral;
	public ProductoPuntoVentaParameterReturnGeneral productopuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioProductoPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoPuntoVentaSessionBeanAdditional productopuntoventaSessionBeanAdditional=null;
	
	public ProductoPuntoVentaSessionBeanAdditional getProductoPuntoVentaSessionBeanAdditional() {
		return this.productopuntoventaSessionBeanAdditional;
	}
	
	public void setProductoPuntoVentaSessionBeanAdditional(ProductoPuntoVentaSessionBeanAdditional productopuntoventaSessionBeanAdditional) {
		try {
			this.productopuntoventaSessionBeanAdditional=productopuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoPuntoVentaBeanSwingJInternalFrameAdditional productopuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class ProductoPuntoVentaBeanSwingJInternalFrame
	
	public ProductoPuntoVentaBeanSwingJInternalFrameAdditional getProductoPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.productopuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoPuntoVentaBeanSwingJInternalFrameAdditional(ProductoPuntoVentaBeanSwingJInternalFrameAdditional productopuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.productopuntoventaBeanSwingJInternalFrameAdditional=productopuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoPuntoVentaLogic productopuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoPuntoVenta productopuntoventaBean;
	public ProductoPuntoVentaConstantesFunciones productopuntoventaConstantesFunciones;
	//public ProductoPuntoVentaParameterReturnGeneral productopuntoventaReturnGeneral;
	
	//FK
	
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoPuntoVenta> productopuntoventas;	
	//public List<ProductoPuntoVenta> productopuntoventasEliminados;
	//public List<ProductoPuntoVenta> productopuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarProductoPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarProductoPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormProductoPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenProductoPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarProductoPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarProductoPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarProductoPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarProductoPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarProductoPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	
	public Long getiIdNuevoProductoPuntoVenta() {
		return this.iIdNuevoProductoPuntoVenta;
	}

	public void setiIdNuevoProductoPuntoVenta(Long iIdNuevoProductoPuntoVenta) {
		this.iIdNuevoProductoPuntoVenta = iIdNuevoProductoPuntoVenta;
	}
	
	public Long getidProductoPuntoVentaActual() {
		return this.idProductoPuntoVentaActual;
	}

	public void setidProductoPuntoVentaActual(Long idProductoPuntoVentaActual) {
		this.idProductoPuntoVentaActual = idProductoPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoPuntoVenta getproductopuntoventa() {
		return this.productopuntoventa;
	}

	public void setproductopuntoventa(ProductoPuntoVenta productopuntoventa) {
		this.productopuntoventa = productopuntoventa;
	}
	
	public ProductoPuntoVenta getproductopuntoventaAux() {
		return this.productopuntoventaAux;
	}

	public void setproductopuntoventaAux(ProductoPuntoVenta productopuntoventaAux) {
		this.productopuntoventaAux = productopuntoventaAux;
	}				
	
	public ProductoPuntoVenta getproductopuntoventaAnterior() {
		return this.productopuntoventaAnterior;
	}

	public void setproductopuntoventaAnterior(ProductoPuntoVenta productopuntoventaAnterior) {
		this.productopuntoventaAnterior = productopuntoventaAnterior;
	}	
	
	public ProductoPuntoVenta getproductopuntoventaTotales() {
		return this.productopuntoventaTotales;
	}

	public void setproductopuntoventaTotales(ProductoPuntoVenta productopuntoventaTotales) {
		this.productopuntoventaTotales = productopuntoventaTotales;
	}	
	
	public ProductoPuntoVenta getproductopuntoventaBean() {
		return this.productopuntoventaBean;
	}

	public void setproductopuntoventaBean(ProductoPuntoVenta productopuntoventaBean) {
		this.productopuntoventaBean = productopuntoventaBean;
	}	
	
	public ProductoPuntoVentaParameterReturnGeneral getproductopuntoventaReturnGeneral() {
		return this.productopuntoventaReturnGeneral;
	}

	public void setproductopuntoventaReturnGeneral(ProductoPuntoVentaParameterReturnGeneral productopuntoventaReturnGeneral) {
		this.productopuntoventaReturnGeneral = productopuntoventaReturnGeneral;
	}	
	
	
	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=null;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=null;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=null;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductoPuntoVentaLogic getProductoPuntoVentaLogic()	{		
		return productopuntoventaLogic;
	}

	public void setProductoPuntoVentaLogic(ProductoPuntoVentaLogic productopuntoventaLogic) {
		this.productopuntoventaLogic = productopuntoventaLogic;
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
	
	public Boolean getIsEsNuevoProductoPuntoVenta() {
		return isEsNuevoProductoPuntoVenta;
	}

	public void setIsEsNuevoProductoPuntoVenta(Boolean isEsNuevoProductoPuntoVenta) {
		this.isEsNuevoProductoPuntoVenta = isEsNuevoProductoPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoPuntoVenta() {
		return esParaAccionDesdeFormularioProductoPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioProductoPuntoVenta(Boolean esParaAccionDesdeFormularioProductoPuntoVenta) {
		this.esParaAccionDesdeFormularioProductoPuntoVenta = esParaAccionDesdeFormularioProductoPuntoVenta;
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
	
	
	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productopuntoventaSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Linea lineagrupoNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineagruposForeignKey.add(0, lineagrupoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productopuntoventaSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Linea lineacategoriaNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineacategoriasForeignKey.add(0, lineacategoriaNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productopuntoventaSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Linea lineamarcaNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineamarcasForeignKey.add(0, lineamarcaNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productopuntoventaSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

			productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productopuntoventaSessionBean.getlidProductoActual());
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

	
	
	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.productopuntoventa!=null) {
						this.productopuntoventa.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProductoPuntoVenta.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaProductoPuntoVenta!=null) {
						jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaProductoPuntoVenta!=null) {
							//jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaProductoPuntoVentaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProductoPuntoVentaGenerico!=null && jComboBoxid_lineaProductoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_lineaProductoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.productopuntoventa!=null) {
						this.productopuntoventa.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProductoPuntoVenta.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLineaGrupo") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta!=null) {
						jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta!=null) {
							//jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.getItemCount()>0) {
								jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoProductoPuntoVentaGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProductoPuntoVentaGenerico!=null && jComboBoxid_linea_grupoProductoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProductoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.productopuntoventa!=null) {
						this.productopuntoventa.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProductoPuntoVenta.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLineaCategoria") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta!=null) {
						jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta!=null) {
							//jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.getItemCount()>0) {
								jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaProductoPuntoVentaGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProductoPuntoVentaGenerico!=null && jComboBoxid_linea_categoriaProductoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProductoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.productopuntoventa!=null) {
						this.productopuntoventa.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProductoPuntoVenta.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLineaMarca") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta!=null) {
						jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta!=null) {
							//jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.getItemCount()>0) {
								jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaProductoPuntoVentaGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProductoPuntoVentaGenerico!=null && jComboBoxid_linea_marcaProductoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProductoPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.productopuntoventa!=null) {
						this.productopuntoventa.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoPuntoVenta.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoPuntoVenta!=null) {
						jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoPuntoVenta!=null) {
							//jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoPuntoVenta.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoPuntoVentaGenerico)throws Exception
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
				jComboBoxid_productoProductoPuntoVentaGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoPuntoVentaGenerico!=null && jComboBoxid_productoProductoPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProductoPuntoVenta productopuntoventa,JComboBox jComboBoxid_lineaProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProductoPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProductoPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productopuntoventa.setid_linea(lineaAux.getId());
				productopuntoventa.setlinea_descripcion(ProductoPuntoVentaConstantesFunciones.getLineaDescripcion(lineaAux));
				productopuntoventa.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProductoPuntoVenta productopuntoventa,JComboBox jComboBoxid_linea_grupoProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProductoPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProductoPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				productopuntoventa.setid_linea_grupo(lineaAux.getId());
				productopuntoventa.setlineagrupo_descripcion(ProductoPuntoVentaConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				productopuntoventa.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProductoPuntoVenta productopuntoventa,JComboBox jComboBoxid_linea_categoriaProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProductoPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProductoPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				productopuntoventa.setid_linea_categoria(lineaAux.getId());
				productopuntoventa.setlineacategoria_descripcion(ProductoPuntoVentaConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				productopuntoventa.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProductoPuntoVenta productopuntoventa,JComboBox jComboBoxid_linea_marcaProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProductoPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProductoPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				productopuntoventa.setid_linea_marca(lineaAux.getId());
				productopuntoventa.setlineamarca_descripcion(ProductoPuntoVentaConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				productopuntoventa.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoPuntoVenta productopuntoventa,JComboBox jComboBoxid_productoProductoPuntoVentaGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoPuntoVentaGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoPuntoVentaGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productopuntoventa.setid_producto(productoAux.getId());
				productopuntoventa.setproducto_descripcion(ProductoPuntoVentaConstantesFunciones.getProductoDescripcion(productoAux));
				productopuntoventa.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
					}

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.addItem(linea);
							}
						}

						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
					}

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLineaGrupo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.addItem(lineagrupo);
							}
						}

						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
					}

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLineaCategoria") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.addItem(lineacategoria);
							}
						}

						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
					}

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLineaMarca") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.addItem(lineamarca);
							}
						}

						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { 
					}

					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoPuntoVenta.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoPuntoVenta.addItem(producto);
							}
						}

						if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesProductoPuntoVenta(this.productopuntoventaLogic.getProductoPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesProductoPuntoVenta(this.productopuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Linea.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productopuntoventaLogic.setProductoPuntoVentas(this.productopuntoventas);
			productopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoPuntoVentaParameterReturnGeneral getProductoPuntoVentaParameterGeneral() {
		return this.productopuntoventaParameterGeneral;
	}
	
	public void setProductoPuntoVentaParameterGeneral(ProductoPuntoVentaParameterReturnGeneral productopuntoventaParameterGeneral) {
		this.productopuntoventaParameterGeneral = productopuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoPuntoVenta() {
		return isPermisoTodoProductoPuntoVenta;
	}

	public void setIsPermisoTodoProductoPuntoVenta(Boolean isPermisoTodoProductoPuntoVenta) {
		this.isPermisoTodoProductoPuntoVenta = isPermisoTodoProductoPuntoVenta;
	}

	public Boolean getIsPermisoNuevoProductoPuntoVenta() {
		return isPermisoNuevoProductoPuntoVenta;
	}

	public void setIsPermisoNuevoProductoPuntoVenta(Boolean isPermisoNuevoProductoPuntoVenta) {
		this.isPermisoNuevoProductoPuntoVenta = isPermisoNuevoProductoPuntoVenta;
	}

	public Boolean getIsPermisoActualizarProductoPuntoVenta() {
		return isPermisoActualizarProductoPuntoVenta;
	}

	public void setIsPermisoActualizarProductoPuntoVenta(Boolean isPermisoActualizarProductoPuntoVenta) {
		this.isPermisoActualizarProductoPuntoVenta = isPermisoActualizarProductoPuntoVenta;
	}

	public Boolean getIsPermisoEliminarProductoPuntoVenta() {
		return isPermisoEliminarProductoPuntoVenta;
	}

	public void setIsPermisoEliminarProductoPuntoVenta(Boolean isPermisoEliminarProductoPuntoVenta) {
		this.isPermisoEliminarProductoPuntoVenta = isPermisoEliminarProductoPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosProductoPuntoVenta() {
		return isPermisoGuardarCambiosProductoPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosProductoPuntoVenta(Boolean isPermisoGuardarCambiosProductoPuntoVenta) {
		this.isPermisoGuardarCambiosProductoPuntoVenta = isPermisoGuardarCambiosProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaProductoPuntoVenta() {
		return isPermisoConsultaProductoPuntoVenta;
	}

	public void setIsPermisoConsultaProductoPuntoVenta(Boolean isPermisoConsultaProductoPuntoVenta) {
		this.isPermisoConsultaProductoPuntoVenta = isPermisoConsultaProductoPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaProductoPuntoVenta() {
		return isPermisoBusquedaProductoPuntoVenta;
	}

	public void setIsPermisoBusquedaProductoPuntoVenta(Boolean isPermisoBusquedaProductoPuntoVenta) {
		this.isPermisoBusquedaProductoPuntoVenta = isPermisoBusquedaProductoPuntoVenta;
	}

	public Boolean getIsPermisoReporteProductoPuntoVenta() {
		return isPermisoReporteProductoPuntoVenta;
	}

	public void setIsPermisoReporteProductoPuntoVenta(Boolean isPermisoReporteProductoPuntoVenta) {
		this.isPermisoReporteProductoPuntoVenta = isPermisoReporteProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoPuntoVenta() {
		return isPermisoPaginacionMedioProductoPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioProductoPuntoVenta(Boolean isPermisoPaginacionMedioProductoPuntoVenta) {
		this.isPermisoPaginacionMedioProductoPuntoVenta = isPermisoPaginacionMedioProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoPuntoVenta() {
		return isPermisoPaginacionTodoProductoPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoProductoPuntoVenta(Boolean isPermisoPaginacionTodoProductoPuntoVenta) {
		this.isPermisoPaginacionTodoProductoPuntoVenta = isPermisoPaginacionTodoProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoPuntoVenta() {
		return isPermisoPaginacionAltoProductoPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoProductoPuntoVenta(Boolean isPermisoPaginacionAltoProductoPuntoVenta) {
		this.isPermisoPaginacionAltoProductoPuntoVenta = isPermisoPaginacionAltoProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarProductoPuntoVenta() {
		return isPermisoCopiarProductoPuntoVenta;
	}

	public void setIsPermisoCopiarProductoPuntoVenta(Boolean isPermisoCopiarProductoPuntoVenta) {
		this.isPermisoCopiarProductoPuntoVenta = isPermisoCopiarProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormProductoPuntoVenta() {
		return isPermisoVerFormProductoPuntoVenta;
	}

	public void setIsPermisoVerFormProductoPuntoVenta(Boolean isPermisoVerFormProductoPuntoVenta) {
		this.isPermisoVerFormProductoPuntoVenta = isPermisoVerFormProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarProductoPuntoVenta() {
		return isPermisoDuplicarProductoPuntoVenta;
	}

	public void setIsPermisoDuplicarProductoPuntoVenta(Boolean isPermisoDuplicarProductoPuntoVenta) {
		this.isPermisoDuplicarProductoPuntoVenta = isPermisoDuplicarProductoPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenProductoPuntoVenta() {
		return isPermisoOrdenProductoPuntoVenta;
	}

	public void setIsPermisoOrdenProductoPuntoVenta(Boolean isPermisoOrdenProductoPuntoVenta) {
		this.isPermisoOrdenProductoPuntoVenta = isPermisoOrdenProductoPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoPuntoVenta() {
		return isVisibilidadCeldaNuevoProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoProductoPuntoVenta(Boolean isVisibilidadCeldaNuevoProductoPuntoVenta) {
		this.isVisibilidadCeldaNuevoProductoPuntoVenta = isVisibilidadCeldaNuevoProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoPuntoVenta() {
		return isVisibilidadCeldaDuplicarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarProductoPuntoVenta(Boolean isVisibilidadCeldaDuplicarProductoPuntoVenta) {
		this.isVisibilidadCeldaDuplicarProductoPuntoVenta = isVisibilidadCeldaDuplicarProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoPuntoVenta() {
		return isVisibilidadCeldaCopiarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarProductoPuntoVenta(Boolean isVisibilidadCeldaCopiarProductoPuntoVenta) {
		this.isVisibilidadCeldaCopiarProductoPuntoVenta = isVisibilidadCeldaCopiarProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoPuntoVenta() {
		return isVisibilidadCeldaVerFormProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormProductoPuntoVenta(Boolean isVisibilidadCeldaVerFormProductoPuntoVenta) {
		this.isVisibilidadCeldaVerFormProductoPuntoVenta = isVisibilidadCeldaVerFormProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoPuntoVenta() {
		return isVisibilidadCeldaOrdenProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenProductoPuntoVenta(Boolean isVisibilidadCeldaOrdenProductoPuntoVenta) {
		this.isVisibilidadCeldaOrdenProductoPuntoVenta = isVisibilidadCeldaOrdenProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta = isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoPuntoVenta() {
		return isVisibilidadCeldaModificarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarProductoPuntoVenta(Boolean isVisibilidadCeldaModificarProductoPuntoVenta) {
		this.isVisibilidadCeldaModificarProductoPuntoVenta = isVisibilidadCeldaModificarProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoPuntoVenta() {
		return isVisibilidadCeldaActualizarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarProductoPuntoVenta(Boolean isVisibilidadCeldaActualizarProductoPuntoVenta) {
		this.isVisibilidadCeldaActualizarProductoPuntoVenta = isVisibilidadCeldaActualizarProductoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoPuntoVenta() {
		return isVisibilidadCeldaEliminarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarProductoPuntoVenta(Boolean isVisibilidadCeldaEliminarProductoPuntoVenta) {
		this.isVisibilidadCeldaEliminarProductoPuntoVenta = isVisibilidadCeldaEliminarProductoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoPuntoVenta() {
		return isVisibilidadCeldaCancelarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarProductoPuntoVenta(Boolean isVisibilidadCeldaCancelarProductoPuntoVenta) {
		this.isVisibilidadCeldaCancelarProductoPuntoVenta = isVisibilidadCeldaCancelarProductoPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoPuntoVenta() {
		return isVisibilidadCeldaGuardarProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarProductoPuntoVenta(Boolean isVisibilidadCeldaGuardarProductoPuntoVenta) {
		this.isVisibilidadCeldaGuardarProductoPuntoVenta = isVisibilidadCeldaGuardarProductoPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosProductoPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosProductoPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta = isVisibilidadCeldaGuardarCambiosProductoPuntoVenta;
	}
		
	public ProductoPuntoVentaSessionBean getproductopuntoventaSessionBean() {
		return this.productopuntoventaSessionBean;
	}
	
	public void setproductopuntoventaSessionBean(ProductoPuntoVentaSessionBean productopuntoventaSessionBean) {
		this.productopuntoventaSessionBean=productopuntoventaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(ProductoPuntoVenta productopuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarLineaForeignKey(productopuntoventa,null);
				this.setActualParaGuardarLineaGrupoForeignKey(productopuntoventa,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(productopuntoventa,null);
				this.setActualParaGuardarLineaMarcaForeignKey(productopuntoventa,null);
				this.setActualParaGuardarProductoForeignKey(productopuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(ProductoPuntoVenta productopuntoventa,ProductoPuntoVenta productopuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoPuntoVenta(productopuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productopuntoventaAux.setId(productopuntoventa.getId());
		productopuntoventaAux.setVersionRow(productopuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoPuntoVenta();
		
			int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productopuntoventaValidator.getInvalidValues(this.productopuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productopuntoventaLogic.setDatosCliente(datosCliente);
			productopuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productopuntoventaAux=new  ProductoPuntoVenta();
				
				productopuntoventaAux.setIsNew(true);
				productopuntoventaAux.setIsChanged(true);
				
				productopuntoventaAux.setProductoPuntoVentaOriginal(this.productopuntoventa);
				
				productopuntoventaAux.setId(this.productopuntoventa.getId());	
				productopuntoventaAux.setVersionRow(this.productopuntoventa.getVersionRow());	
				productopuntoventaAux.setid_linea(this.productopuntoventa.getid_linea());	
				
				if(this.productopuntoventa.getid_linea_grupo()!=null && this.productopuntoventa.getid_linea_grupo()>0L) {
					productopuntoventaAux.setid_linea_grupo(this.productopuntoventa.getid_linea_grupo());
				} else {
					productopuntoventaAux.setid_linea_grupo(null);
				}	
				
				if(this.productopuntoventa.getid_linea_categoria()!=null && this.productopuntoventa.getid_linea_categoria()>0L) {
					productopuntoventaAux.setid_linea_categoria(this.productopuntoventa.getid_linea_categoria());
				} else {
					productopuntoventaAux.setid_linea_categoria(null);
				}	
				
				if(this.productopuntoventa.getid_linea_marca()!=null && this.productopuntoventa.getid_linea_marca()>0L) {
					productopuntoventaAux.setid_linea_marca(this.productopuntoventa.getid_linea_marca());
				} else {
					productopuntoventaAux.setid_linea_marca(null);
				}	
				productopuntoventaAux.setid_producto(this.productopuntoventa.getid_producto());	
				productopuntoventaAux.setesta_activo(this.productopuntoventa.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productopuntoventaAux,productopuntoventaLogic.getProductoPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopuntoventaAux,productopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.saveProductoPuntoVentas();//WithConnection
						//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productopuntoventa,productopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesProductoPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productopuntoventaLogic.saveProductoPuntoVentaRelaciones(productopuntoventaAux);//WithConnection
								//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productopuntoventa,productopuntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productopuntoventaAux,productopuntoventaLogic.getProductoPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productopuntoventaAux,productopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productopuntoventa,productopuntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productopuntoventaAux=new  ProductoPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.productopuntoventaSessionBean.getEsGuardarRelacionado() && this.productopuntoventa.getId()>=0)) {
						
					productopuntoventaAux.setIsNew(false);
				}
				
				productopuntoventaAux.setIsDeleted(false);
			
				productopuntoventaAux.setId(this.productopuntoventa.getId());	
				productopuntoventaAux.setVersionRow(this.productopuntoventa.getVersionRow());	
				productopuntoventaAux.setid_linea(this.productopuntoventa.getid_linea());	
				
				if(this.productopuntoventa.getid_linea_grupo()!=null && this.productopuntoventa.getid_linea_grupo()>0L) {
					productopuntoventaAux.setid_linea_grupo(this.productopuntoventa.getid_linea_grupo());
				} else {
					productopuntoventaAux.setid_linea_grupo(null);
				}	
				
				if(this.productopuntoventa.getid_linea_categoria()!=null && this.productopuntoventa.getid_linea_categoria()>0L) {
					productopuntoventaAux.setid_linea_categoria(this.productopuntoventa.getid_linea_categoria());
				} else {
					productopuntoventaAux.setid_linea_categoria(null);
				}	
				
				if(this.productopuntoventa.getid_linea_marca()!=null && this.productopuntoventa.getid_linea_marca()>0L) {
					productopuntoventaAux.setid_linea_marca(this.productopuntoventa.getid_linea_marca());
				} else {
					productopuntoventaAux.setid_linea_marca(null);
				}	
				productopuntoventaAux.setid_producto(this.productopuntoventa.getid_producto());	
				productopuntoventaAux.setesta_activo(this.productopuntoventa.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productopuntoventaAux,productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopuntoventaAux,productopuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.saveProductoPuntoVentas();//WithConnection
						//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productopuntoventa,productopuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesProductoPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productopuntoventaLogic.saveProductoPuntoVentaRelaciones(productopuntoventaAux);//WithConnection
								//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productopuntoventa,productopuntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productopuntoventaAux,productopuntoventaLogic.getProductoPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productopuntoventaAux,productopuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productopuntoventa,productopuntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productopuntoventaAux=new  ProductoPuntoVenta();
				
				productopuntoventaAux.setIsNew(false);
				productopuntoventaAux.setIsChanged(false);
				
				productopuntoventaAux.setIsDeleted(true);
				
				productopuntoventaAux.setId(this.productopuntoventa.getId());	
				productopuntoventaAux.setVersionRow(this.productopuntoventa.getVersionRow());	
				productopuntoventaAux.setid_linea(this.productopuntoventa.getid_linea());	
				
				if(this.productopuntoventa.getid_linea_grupo()!=null && this.productopuntoventa.getid_linea_grupo()>0L) {
					productopuntoventaAux.setid_linea_grupo(this.productopuntoventa.getid_linea_grupo());
				} else {
					productopuntoventaAux.setid_linea_grupo(null);
				}	
				
				if(this.productopuntoventa.getid_linea_categoria()!=null && this.productopuntoventa.getid_linea_categoria()>0L) {
					productopuntoventaAux.setid_linea_categoria(this.productopuntoventa.getid_linea_categoria());
				} else {
					productopuntoventaAux.setid_linea_categoria(null);
				}	
				
				if(this.productopuntoventa.getid_linea_marca()!=null && this.productopuntoventa.getid_linea_marca()>0L) {
					productopuntoventaAux.setid_linea_marca(this.productopuntoventa.getid_linea_marca());
				} else {
					productopuntoventaAux.setid_linea_marca(null);
				}	
				productopuntoventaAux.setid_producto(this.productopuntoventa.getid_producto());	
				productopuntoventaAux.setesta_activo(this.productopuntoventa.getesta_activo());	
				
				if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productopuntoventaAux.getId()>=0) {	
						this.productopuntoventasEliminados.add(productopuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productopuntoventaAux,productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopuntoventaAux,productopuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.saveProductoPuntoVentas();//WithConnection
						//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productopuntoventaLogic.saveProductoPuntoVentaRelaciones(productopuntoventaAux);//WithConnection
								//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
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
							if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productopuntoventaAux,productopuntoventaLogic.getProductoPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productopuntoventaAux,productopuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getProductoPuntoVentas().addAll(this.productopuntoventasEliminados);
					
					productopuntoventaLogic.saveProductoPuntoVentas();//WithConnection
					//productopuntoventaLogic.getSetVersionRowProductoPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoPuntoVenta();
				
				this.productopuntoventasEliminados= new ArrayList<ProductoPuntoVenta>();		
			}
			
			if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Punto Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productopuntoventa=productopuntoventaAux;
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
      		//this.finishProcessProductoPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoPuntoVenta productopuntoventaLocal) throws Exception {
		
		if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoPuntoVenta productopuntoventaLocal) throws Exception {	
		if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				productopuntoventaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				productopuntoventaLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				productopuntoventaLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				productopuntoventaLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productopuntoventaLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productopuntoventaValidator.getInvalidValues(this.productopuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoPuntoVenta productopuntoventa,List<ProductoPuntoVenta> productopuntoventas) throws Exception {
		try	{		
			ProductoPuntoVentaConstantesFunciones.actualizarLista(productopuntoventa,productopuntoventas,this.productopuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoPuntoVenta productopuntoventa,List<ProductoPuntoVenta> productopuntoventas) throws Exception {
		try	{			
			ProductoPuntoVentaConstantesFunciones.actualizarSelectedLista(productopuntoventa,productopuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoPuntoVenta> productopuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productopuntoventasLocal=this.productopuntoventaLogic.getProductoPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productopuntoventasLocal=this.productopuntoventas;
			}
			//ARCHITECTURE
		
			for(ProductoPuntoVenta productopuntoventaLocal:productopuntoventasLocal) {
				if(this.permiteMantenimiento(productopuntoventaLocal) && productopuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoPuntoVentaConstantesFunciones.getProductoPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoPuntoVentaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_lineaProductoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPuntoVentaConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_linea_grupoProductoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPuntoVentaConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_linea_categoriaProductoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPuntoVentaConstantesFunciones.IDLINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_linea_marcaProductoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPuntoVentaConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_productoProductoPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoPuntoVentaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelesta_activoProductoPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_lineaProductoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_linea_grupoProductoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_linea_categoriaProductoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_linea_marcaProductoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelid_productoProductoPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelesta_activoProductoPuntoVenta,"");
		
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
		this.iIdNuevoProductoPuntoVenta--;	
		
		
		this.productopuntoventaAux=new ProductoPuntoVenta();
		
		this.productopuntoventaAux.setId(this.iIdNuevoProductoPuntoVenta);
		this.productopuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productopuntoventaLogic.getProductoPuntoVentas().add(this.productopuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productopuntoventas.add(this.productopuntoventaAux);
		}
		//ARCHITECTURE
		
		this.productopuntoventa=this.productopuntoventaAux;
		
		if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoPuntoVenta(this.productopuntoventa);
		}
				
		//this.setDefaultControlesProductoPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoPuntoVenta(this.productopuntoventaBean,this.productopuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=ProductoPuntoVentaConstantesFunciones.getClassesRelationshipsOfProductoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productopuntoventaReturnGeneral=productopuntoventaLogic.procesarEventosProductoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productopuntoventaLogic.getProductoPuntoVentas(),this.productopuntoventa,this.productopuntoventaParameterGeneral,this.isEsNuevoProductoPuntoVenta,classes);//this.productopuntoventaLogic.getProductoPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoPuntoVenta(this.productopuntoventaReturnGeneral,this.productopuntoventaBean,false);
		
		if(this.productopuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta());
		}
		
		if(this.productopuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta(),classes);//this.productopuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormProductoPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoPuntoVenta(false);
						
			if(productopuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoPuntoVenta();
			}
			
			this.actualizarVisualTableDatosProductoPuntoVenta();
			
			this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoProductoPuntoVenta(), this.getIndiceNuevoProductoPuntoVenta());
			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesProductoPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setEnabled(isHabilitar && this.productopuntoventaConstantesFunciones.activaresta_activoProductoPuntoVenta);	
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setEnabled(isHabilitar && this.productopuntoventaConstantesFunciones.activarid_lineaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setEnabled(isHabilitar && this.productopuntoventaConstantesFunciones.activarid_linea_grupoProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setEnabled(isHabilitar && this.productopuntoventaConstantesFunciones.activarid_linea_categoriaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setEnabled(isHabilitar && this.productopuntoventaConstantesFunciones.activarid_linea_marcaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setEnabled(isHabilitar && this.productopuntoventaConstantesFunciones.activarid_productoProductoPuntoVenta);
	};
	
	public void setDefaultControlesProductoPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productopuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.productopuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.setVisible(true);
			
					
		} else {
			//this.productopuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.productopuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
				if(productopuntoventaAux.getId().equals(this.iIdNuevoProductoPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventas) {
				if(productopuntoventaAux.getId().equals(this.iIdNuevoProductoPuntoVenta)) {
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
	
	public int getIndiceActualProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
				if(productopuntoventaAux.getId().equals(productopuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventas) {
				if(productopuntoventaAux.getId().equals(productopuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoPuntoVenta(ProductoPuntoVenta productopuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
				if(productopuntoventaAux.getProductoPuntoVentaOriginal().getId().equals(productopuntoventaOriginal.getId())) {
					existe=true;
					productopuntoventaOriginal.setId(productopuntoventaAux.getId());
					productopuntoventaOriginal.setVersionRow(productopuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventas) {
				if(productopuntoventaAux.getProductoPuntoVentaOriginal().getId().equals(productopuntoventaOriginal.getId())) {
					existe=true;
					productopuntoventaOriginal.setId(productopuntoventaAux.getId());
					productopuntoventaOriginal.setVersionRow(productopuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoPuntoVenta(Boolean esParaCancelar) throws Exception {
		productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
		productopuntoventaAux=new ProductoPuntoVenta();
		
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
					if(productopuntoventaAux.getId()<0) {
						productopuntoventasAux.add(productopuntoventaAux);
					}		
				}
				this.iIdNuevoProductoPuntoVenta=0L;
				this.productopuntoventaLogic.getProductoPuntoVentas().removeAll(productopuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventas) {
					if(productopuntoventaAux.getId()<0) {
						productopuntoventasAux.add(productopuntoventaAux);
					}		
				}
				this.iIdNuevoProductoPuntoVenta=0L;
				this.productopuntoventas.removeAll(productopuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoPuntoVenta 
					&& this.productopuntoventaLogic.getProductoPuntoVentas().size()>0
					) {
					productopuntoventaAux=this.productopuntoventaLogic.getProductoPuntoVentas().get(this.productopuntoventaLogic.getProductoPuntoVentas().size() - 1);
				
					if(productopuntoventaAux.getId()<0) {
						this.productopuntoventaLogic.getProductoPuntoVentas().remove(productopuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoPuntoVenta && this.productopuntoventas.size()>0) {
					productopuntoventaAux=this.productopuntoventas.get(this.productopuntoventas.size() - 1);
				
					if(productopuntoventaAux.getId()<0) {
						this.productopuntoventas.remove(productopuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productopuntoventa.getId()<0) {
				this.productopuntoventaLogic.getProductoPuntoVentas().remove(this.productopuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productopuntoventa.getId()<0) {
				this.productopuntoventas.remove(this.productopuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesProductoPuntoVenta(List<ProductoPuntoVenta> productopuntoventasAux) throws Exception {
		ProductoPuntoVentaConstantesFunciones.setEstadosInicialesProductoPuntoVenta(productopuntoventasAux);
	}
	
	public void setEstadosInicialesProductoPuntoVenta(ProductoPuntoVenta productopuntoventaAux) throws Exception {
		ProductoPuntoVentaConstantesFunciones.setEstadosInicialesProductoPuntoVenta(productopuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoPuntoVentaActual()) {
				if(!this.isEsNuevoProductoPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Punto Venta ?", "MANTENIMIENTO DE Producto Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoPuntoVenta productopuntoventa) throws Exception {
		ProductoPuntoVentaConstantesFunciones.seleccionarAsignar(this.productopuntoventa,productopuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoPuntoVenta=this.isPermisoActualizarOriginalProductoPuntoVenta;
			
			
			this.seleccionarAsignar(productopuntoventa);
			
			

			idProductoActual=productopuntoventa.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoPuntoVentaConstantesFunciones.quitarEspaciosProductoPuntoVenta(this.productopuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productopuntoventaSessionBean.setsFuncionBusquedaRapida(this.productopuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoPuntoVenta(esParaCancelar);				
				this.cancelarNuevoProductoPuntoVenta(esParaCancelar);								
			}
			
			this.productopuntoventa=new ProductoPuntoVenta();
			
			this.inicializarProductoPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesProductoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoPuntoVenta() throws Exception {
		try {
			ProductoPuntoVentaConstantesFunciones.inicializarProductoPuntoVenta(this.productopuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productopuntoventaLogic.getProductoPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoPuntoVentas(String sAccionBusqueda,List<ProductoPuntoVenta> productopuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Punto Ventas");		
		parameters.put("busquedapor", ProductoPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoPuntoVenta=new JRBeanArrayDataSource(ProductoPuntoVentaJInternalFrame.TraerProductoPuntoVentaBeans(productopuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoPuntoVentaBean.TraerProductoPuntoVentaBeans(productopuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,productopuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,productopuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoPuntoVentaActionPerformed(null);
					//this.generarExcelReporteProductoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,productopuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,productopuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,productopuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,productopuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoPuntoVenta> productopuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoPuntoVenta productopuntoventa : productopuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoPuntoVentaConstantesFunciones.generarExcelReporteDataProductoPuntoVenta("NORMAL",row,workbook,productopuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		ProductoPuntoVentaConstantesFunciones.generarExcelReporteHeaderProductoPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoPuntoVenta> productopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoPuntoVenta productopuntoventa : productopuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoPuntoVentaConstantesFunciones.getProductoPuntoVentaDescripcion(productopuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopuntoventa.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopuntoventa.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopuntoventa.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopuntoventa.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productopuntoventa.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(productopuntoventa.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoPuntoVenta> productopuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoPuntoVenta> productopuntoventasRespaldo=null;
		
		classes=ProductoPuntoVentaConstantesFunciones.getClassesRelationshipsOfProductoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productopuntoventaLogic.setDatosCliente(this.datosCliente);
		this.productopuntoventaLogic.setDatosDeep(this.datosDeep);
		this.productopuntoventaLogic.setIsConDeep(true);
		
		productopuntoventasRespaldo=this.productopuntoventaLogic.getProductoPuntoVentas();
		
		this.productopuntoventaLogic.setProductoPuntoVentas(productopuntoventasParaReportes);	
		this.productopuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productopuntoventasParaReportes=this.productopuntoventaLogic.getProductoPuntoVentas();
		this.productopuntoventaLogic.setProductoPuntoVentas(productopuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoPuntoVenta productopuntoventa : productopuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoPuntoVentaConstantesFunciones.generarExcelReporteDataProductoPuntoVenta("NORMAL",row,workbook,productopuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoPuntoVentaConstantesFunciones.getProductoPuntoVentaDescripcion(productopuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoPuntoVenta() throws Exception {		
		this.startProcessProductoPuntoVenta(true);
	}
	
	public void startProcessProductoPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoPuntoVenta ,this.jPanelParametrosReportesProductoPuntoVenta, this.jScrollPanelDatosProductoPuntoVenta,this.jPanelPaginacionProductoPuntoVenta, this.jScrollPanelDatosEdicionProductoPuntoVenta, this.jPanelAccionesProductoPuntoVenta,this.jPanelAccionesFormularioProductoPuntoVenta,this.jmenuBarProductoPuntoVenta,this.jmenuBarDetalleProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,this.jTtoolBarDetalleProductoPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoPuntoVenta=this.jTabbedPaneBusquedasProductoPuntoVenta; 
		
		final JPanel jPanelParametrosReportesProductoPuntoVenta=this.jPanelParametrosReportesProductoPuntoVenta;
		//final JScrollPane jScrollPanelDatosProductoPuntoVenta=this.jScrollPanelDatosProductoPuntoVenta;
		final JTable jTableDatosProductoPuntoVenta=this.jTableDatosProductoPuntoVenta;		
		final JPanel jPanelPaginacionProductoPuntoVenta=this.jPanelPaginacionProductoPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionProductoPuntoVenta=this.jScrollPanelDatosEdicionProductoPuntoVenta;
		final JPanel jPanelAccionesProductoPuntoVenta=this.jPanelAccionesProductoPuntoVenta;
		
		JPanel jPanelCamposAuxiliarProductoPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			jPanelCamposAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelCamposProductoPuntoVenta;
			jPanelAccionesFormularioAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelAccionesFormularioProductoPuntoVenta;
		}
		
		final JPanel jPanelCamposProductoPuntoVenta=jPanelCamposAuxiliarProductoPuntoVenta;
		final JPanel jPanelAccionesFormularioProductoPuntoVenta=jPanelAccionesFormularioAuxiliarProductoPuntoVenta;
		
		
		final JMenuBar jmenuBarProductoPuntoVenta=this.jmenuBarProductoPuntoVenta;
		final JToolBar jTtoolBarProductoPuntoVenta=this.jTtoolBarProductoPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jmenuBarDetalleProductoPuntoVenta;
			jTtoolBarDetalleAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jTtoolBarDetalleProductoPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleProductoPuntoVenta=jmenuBarDetalleAuxiliarProductoPuntoVenta;
		final JToolBar jTtoolBarDetalleProductoPuntoVenta=jTtoolBarDetalleAuxiliarProductoPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoPuntoVenta;
			processRunnable.jTableDatos=jTableDatosProductoPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposProductoPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesProductoPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarProductoPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarProductoPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoPuntoVenta ,jPanelParametrosReportesProductoPuntoVenta,jTableDatosProductoPuntoVenta, /*jScrollPanelDatosProductoPuntoVenta,*/jPanelCamposProductoPuntoVenta,jPanelPaginacionProductoPuntoVenta, /*jScrollPanelDatosEdicionProductoPuntoVenta,*/ jPanelAccionesProductoPuntoVenta,jPanelAccionesFormularioProductoPuntoVenta,jmenuBarProductoPuntoVenta,jmenuBarDetalleProductoPuntoVenta,jTtoolBarProductoPuntoVenta,jTtoolBarDetalleProductoPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoPuntoVenta ,jPanelParametrosReportesProductoPuntoVenta, jScrollPanelDatosProductoPuntoVenta,jPanelPaginacionProductoPuntoVenta, jScrollPanelDatosEdicionProductoPuntoVenta, jPanelAccionesProductoPuntoVenta,jPanelAccionesFormularioProductoPuntoVenta,jmenuBarProductoPuntoVenta,jmenuBarDetalleProductoPuntoVenta,jTtoolBarProductoPuntoVenta,jTtoolBarDetalleProductoPuntoVenta);
						
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
	
	public void finishProcessProductoPuntoVenta() {// throws Exception 
		this.finishProcessProductoPuntoVenta(true);
	}
	
	public void finishProcessProductoPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoPuntoVenta ,this.jPanelParametrosReportesProductoPuntoVenta, this.jScrollPanelDatosProductoPuntoVenta,this.jPanelPaginacionProductoPuntoVenta, this.jScrollPanelDatosEdicionProductoPuntoVenta, this.jPanelAccionesProductoPuntoVenta,this.jPanelAccionesFormularioProductoPuntoVenta,this.jmenuBarProductoPuntoVenta,this.jmenuBarDetalleProductoPuntoVenta,this.jTtoolBarProductoPuntoVenta,this.jTtoolBarDetalleProductoPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoPuntoVenta=this.jTabbedPaneBusquedasProductoPuntoVenta; 
		
		final JPanel jPanelParametrosReportesProductoPuntoVenta=this.jPanelParametrosReportesProductoPuntoVenta;
		//final JScrollPane jScrollPanelDatosProductoPuntoVenta=this.jScrollPanelDatosProductoPuntoVenta;
		final JTable jTableDatosProductoPuntoVenta=this.jTableDatosProductoPuntoVenta;		
		final JPanel jPanelPaginacionProductoPuntoVenta=this.jPanelPaginacionProductoPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionProductoPuntoVenta=this.jScrollPanelDatosEdicionProductoPuntoVenta;
		final JPanel jPanelAccionesProductoPuntoVenta=this.jPanelAccionesProductoPuntoVenta;
		
		JPanel jPanelCamposAuxiliarProductoPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			jPanelCamposAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelCamposProductoPuntoVenta;
			jPanelAccionesFormularioAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelAccionesFormularioProductoPuntoVenta;
		}
		
		final JPanel jPanelCamposProductoPuntoVenta=jPanelCamposAuxiliarProductoPuntoVenta;
		final JPanel jPanelAccionesFormularioProductoPuntoVenta=jPanelAccionesFormularioAuxiliarProductoPuntoVenta;
		
		
		final JMenuBar jmenuBarProductoPuntoVenta=this.jmenuBarProductoPuntoVenta;		
		final JToolBar jTtoolBarProductoPuntoVenta=this.jTtoolBarProductoPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jmenuBarDetalleProductoPuntoVenta;
			jTtoolBarDetalleAuxiliarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jTtoolBarDetalleProductoPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleProductoPuntoVenta=jmenuBarDetalleAuxiliarProductoPuntoVenta;
		final JToolBar jTtoolBarDetalleProductoPuntoVenta=jTtoolBarDetalleAuxiliarProductoPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoPuntoVenta;
			processRunnable.jTableDatos=jTableDatosProductoPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposProductoPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesProductoPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarProductoPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarProductoPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoPuntoVenta ,jPanelParametrosReportesProductoPuntoVenta, jTableDatosProductoPuntoVenta,/*jScrollPanelDatosProductoPuntoVenta,*/jPanelCamposProductoPuntoVenta,jPanelPaginacionProductoPuntoVenta, /*jScrollPanelDatosEdicionProductoPuntoVenta,*/ jPanelAccionesProductoPuntoVenta,jPanelAccionesFormularioProductoPuntoVenta,jmenuBarProductoPuntoVenta,jmenuBarDetalleProductoPuntoVenta,jTtoolBarProductoPuntoVenta,jTtoolBarDetalleProductoPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productopuntoventaConstantesFunciones.getsFinalQueryProductoPuntoVenta();
		String  finalQueryPaginacionTodos=this.productopuntoventaConstantesFunciones.getsFinalQueryProductoPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoProductoPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoPuntoVentaConstantesFunciones.getArrayColumnasGlobalesProductoPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productopuntoventasEliminados= new ArrayList<ProductoPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoPuntoVenta();
		
				///*ProductoPuntoVentaSessionBean*/this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			
			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=ProductoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoPuntoVentaConstantesFunciones.getClassesForeignKeysOfProductoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productopuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productopuntoventasAux= new ArrayList<ProductoPuntoVenta>();
			
				
			productopuntoventaLogic.setDatosCliente(this.datosCliente);
			productopuntoventaLogic.setDatosDeep(this.datosDeep);
			productopuntoventaLogic.setIsConDeep(true);
			
			
			productopuntoventaLogic.getProductoPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productopuntoventaLogic.getTodosProductoPuntoVentas(finalQueryGlobal,pagination);
					
					//productopuntoventaLogic.getTodosProductoPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productopuntoventaLogic.getProductoPuntoVentas()==null|| productopuntoventaLogic.getProductoPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productopuntoventasAux= new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventaLogic.getProductoPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventasAux= new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productopuntoventaLogic.getTodosProductoPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//productopuntoventaLogic.getTodosProductoPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoPuntoVentas("Todos",productopuntoventaLogic.getProductoPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());					
							productopuntoventaLogic.getProductoPuntoVentas().addAll(productopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventas=new ArrayList<ProductoPuntoVenta>();
							productopuntoventas.addAll(productopuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoPuntoVenta=this.idActual;
				
				} else if(this.idProductoPuntoVentaActual!=null && this.idProductoPuntoVentaActual!=0L) {
					idProductoPuntoVenta=idProductoPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndicePorId(idProductoPuntoVenta);
				
				this.productopuntoventas=new ArrayList<ProductoPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productopuntoventaLogic.getEntity(idProductoPuntoVenta);
					
					//productopuntoventaLogic.getEntityWithConnection(idProductoPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
					productopuntoventaLogic.getProductoPuntoVentas().add(productopuntoventaLogic.getProductoPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventas=new ArrayList<ProductoPuntoVenta>();
					this.productopuntoventas.add(productopuntoventa);
				}
				
				if(productopuntoventaLogic.getProductoPuntoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopuntoventaLogic.getProductoPuntoVentasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopuntoventaLogic.getProductoPuntoVentas()==null||productopuntoventaLogic.getProductoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopuntoventas==null|| productopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
						productopuntoventasAux.addAll(productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopuntoventaLogic.getProductoPuntoVentasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPuntoVentas("FK_IdLinea",productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPuntoVentas("FK_IdLinea",productopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
						productopuntoventaLogic.getProductoPuntoVentas().addAll(productopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventas=new ArrayList<ProductoPuntoVenta>();
							productopuntoventas.addAll(productopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLineaCategoria")) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaCategoria(finalQueryGlobal,pagination,id_linea_categoriaFK_IdLineaCategoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopuntoventaLogic.getProductoPuntoVentas()==null||productopuntoventaLogic.getProductoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopuntoventas==null|| productopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
						productopuntoventasAux.addAll(productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaCategoria(finalQueryGlobal,pagination,id_linea_categoriaFK_IdLineaCategoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPuntoVentas("FK_IdLineaCategoria",productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPuntoVentas("FK_IdLineaCategoria",productopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
						productopuntoventaLogic.getProductoPuntoVentas().addAll(productopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventas=new ArrayList<ProductoPuntoVenta>();
							productopuntoventas.addAll(productopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLineaGrupo")) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaGrupo(finalQueryGlobal,pagination,id_linea_grupoFK_IdLineaGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopuntoventaLogic.getProductoPuntoVentas()==null||productopuntoventaLogic.getProductoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopuntoventas==null|| productopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
						productopuntoventasAux.addAll(productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaGrupo(finalQueryGlobal,pagination,id_linea_grupoFK_IdLineaGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPuntoVentas("FK_IdLineaGrupo",productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPuntoVentas("FK_IdLineaGrupo",productopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
						productopuntoventaLogic.getProductoPuntoVentas().addAll(productopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventas=new ArrayList<ProductoPuntoVenta>();
							productopuntoventas.addAll(productopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLineaMarca")) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaMarca(finalQueryGlobal,pagination,id_linea_marcaFK_IdLineaMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopuntoventaLogic.getProductoPuntoVentas()==null||productopuntoventaLogic.getProductoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopuntoventas==null|| productopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
						productopuntoventasAux.addAll(productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaMarca(finalQueryGlobal,pagination,id_linea_marcaFK_IdLineaMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPuntoVentas("FK_IdLineaMarca",productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPuntoVentas("FK_IdLineaMarca",productopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
						productopuntoventaLogic.getProductoPuntoVentas().addAll(productopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventas=new ArrayList<ProductoPuntoVenta>();
							productopuntoventas.addAll(productopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productopuntoventaLogic.getProductoPuntoVentasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productopuntoventaLogic.getProductoPuntoVentas()==null||productopuntoventaLogic.getProductoPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productopuntoventas==null|| productopuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
						productopuntoventasAux.addAll(productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventasAux=new ArrayList<ProductoPuntoVenta>();
							productopuntoventasAux.addAll(productopuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productopuntoventaLogic.getProductoPuntoVentasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoPuntoVentas("FK_IdProducto",productopuntoventaLogic.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoPuntoVentas("FK_IdProducto",productopuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaLogic.setProductoPuntoVentas(new ArrayList<ProductoPuntoVenta>());
						productopuntoventaLogic.getProductoPuntoVentas().addAll(productopuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventas=new ArrayList<ProductoPuntoVenta>();
							productopuntoventas.addAll(productopuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productopuntoventaLogic.getProductoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productopuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productopuntoventaLogic.getProductoPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productopuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoPuntoVenta productopuntoventa) {
		Boolean permite=true;
		
		if(this.productopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoPuntoVentaConstantesFunciones.getOrderByListaProductoPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoPuntoVentaConstantesFunciones.getOrderByListaProductoPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPuntoVenta productopuntoventa:productopuntoventaLogic.getProductoPuntoVentas()) {
				if(productopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					productopuntoventaTotales=productopuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPuntoVenta productopuntoventa:this.productopuntoventas) {
				if(productopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					productopuntoventaTotales=productopuntoventa;
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
			this.productopuntoventaAux=new ProductoPuntoVenta();
			this.productopuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.productopuntoventaAux.setIsNew(false);
			this.productopuntoventaAux.setIsChanged(false);
			this.productopuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoPuntoVentaConstantesFunciones.TotalizarValoresFilaProductoPuntoVenta(this.productopuntoventaLogic.getProductoPuntoVentas(),this.productopuntoventaAux);
				
				this.productopuntoventaLogic.getProductoPuntoVentas().add(this.productopuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoPuntoVentaConstantesFunciones.TotalizarValoresFilaProductoPuntoVenta(this.productopuntoventas,this.productopuntoventaAux);
				
				this.productopuntoventas.add(this.productopuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productopuntoventaTotales=new ProductoPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productopuntoventaLogic.getProductoPuntoVentas().remove(productopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productopuntoventas.remove(productopuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productopuntoventaTotales=new ProductoPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoPuntoVenta productopuntoventa:productopuntoventaLogic.getProductoPuntoVentas()) {
				if(productopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					productopuntoventaTotales=productopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoPuntoVentaConstantesFunciones.TotalizarValoresFilaProductoPuntoVenta(this.productopuntoventaLogic.getProductoPuntoVentas(),productopuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoPuntoVenta productopuntoventa:this.productopuntoventas) {
				if(productopuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					productopuntoventaTotales=productopuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoPuntoVentaConstantesFunciones.TotalizarValoresFilaProductoPuntoVenta(this.productopuntoventas,productopuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoPuntoVentasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPuntoVentasFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPuntoVentasFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPuntoVentasFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoPuntoVentasFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoPuntoVentasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLogic.getProductoPuntoVentasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPuntoVentasFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPuntoVentasFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPuntoVentasFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLogic.getProductoPuntoVentasFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoPuntoVentasFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLogic.getProductoPuntoVentasFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
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
	
	public void inicializarPermisosProductoPuntoVenta() {
		this.isPermisoTodoProductoPuntoVenta=false;
		this.isPermisoNuevoProductoPuntoVenta=false;
		this.isPermisoActualizarProductoPuntoVenta=false;
		this.isPermisoActualizarOriginalProductoPuntoVenta=false;
		this.isPermisoEliminarProductoPuntoVenta=false;
		this.isPermisoGuardarCambiosProductoPuntoVenta=false;
		this.isPermisoConsultaProductoPuntoVenta=false;
		this.isPermisoBusquedaProductoPuntoVenta=false;
		this.isPermisoReporteProductoPuntoVenta=false;		
		this.isPermisoOrdenProductoPuntoVenta=false;		
		this.isPermisoPaginacionMedioProductoPuntoVenta=false;		
		this.isPermisoPaginacionAltoProductoPuntoVenta=false;
		this.isPermisoPaginacionTodoProductoPuntoVenta=false;
		this.isPermisoCopiarProductoPuntoVenta=false;		
		this.isPermisoVerFormProductoPuntoVenta=false;		
		this.isPermisoDuplicarProductoPuntoVenta=false;		
		this.isPermisoOrdenProductoPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioProductoPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoProductoPuntoVenta=isPermiso;
		this.isPermisoNuevoProductoPuntoVenta=isPermiso;
		this.isPermisoActualizarProductoPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalProductoPuntoVenta=isPermiso;
		this.isPermisoEliminarProductoPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosProductoPuntoVenta=isPermiso;
		this.isPermisoConsultaProductoPuntoVenta=isPermiso;
		this.isPermisoBusquedaProductoPuntoVenta=isPermiso;
		this.isPermisoReporteProductoPuntoVenta=isPermiso;
		this.isPermisoOrdenProductoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioProductoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoProductoPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoProductoPuntoVenta=isPermiso;		
		this.isPermisoCopiarProductoPuntoVenta=isPermiso;		
		this.isPermisoVerFormProductoPuntoVenta=isPermiso;		
		this.isPermisoDuplicarProductoPuntoVenta=isPermiso;
		this.isPermisoOrdenProductoPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoProductoPuntoVenta=isPermiso;
		this.isPermisoNuevoProductoPuntoVenta=isPermiso;
		this.isPermisoActualizarProductoPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalProductoPuntoVenta=isPermiso;
		this.isPermisoEliminarProductoPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosProductoPuntoVenta=isPermiso;
		//this.isPermisoConsultaProductoPuntoVenta=isPermiso;
		//this.isPermisoBusquedaProductoPuntoVenta=isPermiso;
		//this.isPermisoReporteProductoPuntoVenta=isPermiso;
		//this.isPermisoOrdenProductoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioProductoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoProductoPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoProductoPuntoVenta=isPermiso;		
		//this.isPermisoCopiarProductoPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarProductoPuntoVenta=isPermiso;
		//this.isPermisoOrdenProductoPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoPuntoVenta=this.isPermisoActualizarProductoPuntoVenta;
			this.isPermisoEliminarProductoPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoPuntoVenta.setToolTipText(this.jTableDatosProductoPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyProductoPuntoVentaListas()throws Exception {
		try	{						
			
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoPuntoVentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoPuntoVentaParameterReturnGeneral productopuntoventaReturnGeneral=new ProductoPuntoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.productopuntoventaConstantesFunciones.cargarid_lineaProductoPuntoVenta)
					 || (this.esRecargarFks && this.productopuntoventaConstantesFunciones.cargarid_lineaProductoPuntoVenta)) {

					if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+productopuntoventaSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.productopuntoventaConstantesFunciones.cargarid_linea_grupoProductoPuntoVenta)
					 || (this.esRecargarFks && this.productopuntoventaConstantesFunciones.cargarid_linea_grupoProductoPuntoVenta)) {

					if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+productopuntoventaSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}


				String finalQueryGlobalLineaCategoria="";

				if(((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0) && this.productopuntoventaConstantesFunciones.cargarid_linea_categoriaProductoPuntoVenta)
					 || (this.esRecargarFks && this.productopuntoventaConstantesFunciones.cargarid_linea_categoriaProductoPuntoVenta)) {

					if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaCategoria=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaCategoria=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaCategoria, "");
						finalQueryGlobalLineaCategoria+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaCategoria=" WHERE " + ConstantesSql.ID + "="+productopuntoventaSessionBean.getlidLineaCategoriaActual();
					}
				} else {
					finalQueryGlobalLineaCategoria="NONE";
				}


				String finalQueryGlobalLineaMarca="";

				if(((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0) && this.productopuntoventaConstantesFunciones.cargarid_linea_marcaProductoPuntoVenta)
					 || (this.esRecargarFks && this.productopuntoventaConstantesFunciones.cargarid_linea_marcaProductoPuntoVenta)) {

					if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaMarca=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaMarca=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaMarca, "");
						finalQueryGlobalLineaMarca+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaMarca=" WHERE " + ConstantesSql.ID + "="+productopuntoventaSessionBean.getlidLineaMarcaActual();
					}
				} else {
					finalQueryGlobalLineaMarca="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productopuntoventaConstantesFunciones.cargarid_productoProductoPuntoVenta)
					 || (this.esRecargarFks && this.productopuntoventaConstantesFunciones.cargarid_productoProductoPuntoVenta)) {

					if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productopuntoventaSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productopuntoventaReturnGeneral=productopuntoventaLogic.cargarCombosLoteForeignKeyProductoPuntoVenta(finalQueryGlobalLinea,finalQueryGlobalLineaGrupo,finalQueryGlobalLineaCategoria,finalQueryGlobalLineaMarca,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=productopuntoventaReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=productopuntoventaReturnGeneral.getlineagruposForeignKey();
			}

			if(!finalQueryGlobalLineaCategoria.equals("NONE")) {
				this.lineacategoriasForeignKey=productopuntoventaReturnGeneral.getlineacategoriasForeignKey();
			}

			if(!finalQueryGlobalLineaMarca.equals("NONE")) {
				this.lineamarcasForeignKey=productopuntoventaReturnGeneral.getlineamarcasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productopuntoventaReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoPuntoVenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {
			if(this.productopuntoventaSessionBean==null) {
				this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.productopuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoPuntoVenta(ProductoPuntoVenta productopuntoventa)throws Exception {	
		try {
			
			this.setActualLineaForeignKey(productopuntoventa.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(productopuntoventa.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(productopuntoventa.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(productopuntoventa.getid_linea_marca(),false,"Formulario");
			this.setActualProductoForeignKey(productopuntoventa.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productopuntoventa.getProducto()!=null && !sTipoEvento.equals("id_productoProductoPuntoVenta")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productopuntoventa.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoPuntoVenta()throws Exception {	
		try {
			
			this.setActualLineaForeignKey(this.productopuntoventaConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.productopuntoventaConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.productopuntoventaConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(this.productopuntoventaConstantesFunciones.getid_linea_marca(),false,"Formulario");
			this.setActualProductoForeignKey(this.productopuntoventaConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoPuntoVenta()throws Exception {
		try {
			

			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProductoPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean(); 
		this.productopuntoventaConstantesFunciones=new ProductoPuntoVentaConstantesFunciones(); 
		this.productopuntoventaBean=new ProductoPuntoVenta();//(this.productopuntoventaConstantesFunciones); 		
		this.productopuntoventaReturnGeneral=new ProductoPuntoVentaParameterReturnGeneral(); 
		
		this.productopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoPuntoVenta(true);
			
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
			
			this.productopuntoventaConstantesFunciones=new ProductoPuntoVentaConstantesFunciones(); 
			this.productopuntoventaBean=new ProductoPuntoVenta();//this.productopuntoventaConstantesFunciones); 			
			this.productopuntoventaReturnGeneral=new ProductoPuntoVentaParameterReturnGeneral(); 
		
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productopuntoventa=new ProductoPuntoVenta();
			this.productopuntoventas = new ArrayList<ProductoPuntoVenta>();
			this.productopuntoventasAux = new ArrayList<ProductoPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic=new ProductoPuntoVentaLogic();
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.productopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionProductoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoPuntoVenta);
				this.jInternalFrameDetalleFormProductoPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormProductoPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoPuntoVenta);
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoPuntoVenta);
					this.jInternalFrameImportacionProductoPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionProductoPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoPuntoVenta);
					this.jInternalFrameOrderByProductoPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByProductoPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productopuntoventaReturnGeneral=new ProductoPuntoVentaParameterReturnGeneral();
			
			this.productopuntoventaParameterGeneral=new ProductoPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productopuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productopuntoventaSessionBean.getEsGuardarRelacionado(),this.productopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productopuntoventaSessionBean.getEsGuardarRelacionado(),this.productopuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarProductoPuntoVenta=true;
			this.isVisibilidadCeldaCopiarProductoPuntoVenta=true;
			this.isVisibilidadCeldaVerFormProductoPuntoVenta=true;
			this.isVisibilidadCeldaOrdenProductoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
			this.isVisibilidadCeldaModificarProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
			
			
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoPuntoVenta(false);
			
			this.setPermisosUsuarioProductoPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.productopuntoventaSessionBean.getEsGuardarRelacionado() && this.productopuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoPuntoVentaClasesRelacionadas();
			}
			
			if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaProductoPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoPuntoVenta,this.isPermisoPaginacionMedioProductoPuntoVenta,this.isPermisoPaginacionTodoProductoPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoPuntoVentaConstantesFunciones.getTiposSeleccionarProductoPuntoVenta());
				
				this.tiposColumnasSelect=ProductoPuntoVentaConstantesFunciones.getTiposSeleccionarProductoPuntoVenta(true);
				
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
			//if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProductoPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProductoPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoPuntoVenta() ;
			
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
			
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
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
				productopuntoventaImplementable= (ProductoPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productopuntoventaImplementableHome= (ProductoPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productopuntoventas= new ArrayList<ProductoPuntoVenta>();
			this.productopuntoventasEliminados= new ArrayList<ProductoPuntoVenta>();
						
			this.isEsNuevoProductoPuntoVenta=false;
			this.esParaAccionDesdeFormularioProductoPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoPuntoVenta();
			}
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoPuntoVenta();	
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
	
	public void cargarCombosForeignKeyProductoPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoPuntoVenta();
		
		this.cargarCombosFrameForeignKeyProductoPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoPuntoVenta();
		}
	}
	
	

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

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
	
	public void jButtonNuevoProductoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			
			if(jTableDatosProductoPuntoVenta.getRowCount()>=1) {
				jTableDatosProductoPuntoVenta.removeRowSelectionInterval(0, jTableDatosProductoPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoPuntoVenta(true);			
			//this.productopuntoventa=new ProductoPuntoVenta();
			//this.productopuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta() ;
			
			if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productopuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);				
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoPuntoVenta.getSelectedRows().length;			
			}
			
			productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoPuntoVenta--;			
				//ProductoPuntoVenta productopuntoventaAux= new ProductoPuntoVenta();			
				//productopuntoventaAux.setId(this.iIdNuevoProductoPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoPuntoVenta productopuntoventaOrigen=new ProductoPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoPuntoVenta productopuntoventaOrigen : productopuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productopuntoventaOrigen =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productopuntoventaOrigen =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productopuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoPuntoVenta(productopuntoventaOrigen,this.productopuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productopuntoventaLogic.getProductoPuntoVentas().add(this.productopuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productopuntoventas.add(this.productopuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
				
				this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoProductoPuntoVenta(), this.getIndiceNuevoProductoPuntoVenta());
				
				int iLastRow =  this.jTableDatosProductoPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();									
		
			ProductoPuntoVenta productopuntoventaOrigen=new ProductoPuntoVenta();
			ProductoPuntoVenta productopuntoventaDestino=new ProductoPuntoVenta();
				
			productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productopuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaOrigen =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productopuntoventaOrigen =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productopuntoventaDestino =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productopuntoventaDestino =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productopuntoventaOrigen =productopuntoventasSeleccionados.get(0);
				productopuntoventaDestino =productopuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoPuntoVenta(productopuntoventaOrigen,productopuntoventaDestino,true,false);
				
				productopuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productopuntoventaDestino,productopuntoventaLogic.getProductoPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productopuntoventaDestino,productopuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
				
				//this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoProductoPuntoVenta(), this.getIndiceNuevoProductoPuntoVenta());
				
				int iLastRow =  this.jTableDatosProductoPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionProductoPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesProductoPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoPuntoVenta();
			
			this.abrirFrameOrderByProductoPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormProductoPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoPuntoVenta.setSize(this.jInternalFrameDetalleFormProductoPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormProductoPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormProductoPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoPuntoVenta.jContentPaneDetalleProductoPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoPuntoVenta.jContentPaneDetalleProductoPuntoVenta.getWidth(),ProductoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoPuntoVenta.jContentPaneDetalleProductoPuntoVenta.getWidth(),ProductoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoPuntoVenta.jContentPaneDetalleProductoPuntoVenta.getWidth(),ProductoPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormProductoPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByProductoPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoPuntoVenta);
				this.jInternalFrameOrderByProductoPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByProductoPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByProductoPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByProductoPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoPuntoVenta==null) {
				
				this.jInternalFrameImportacionProductoPuntoVenta=new ImportacionJInternalFrame(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoPuntoVenta);
				this.jInternalFrameImportacionProductoPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionProductoPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionProductoPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoPuntoVenta"));
				this.jInternalFrameImportacionProductoPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoPuntoVenta"));
				this.jInternalFrameImportacionProductoPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoProductoPuntoVenta=new ReporteDinamicoJInternalFrame(ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoPuntoVenta);
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoPuntoVenta"));
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoPuntoVenta"));
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoPuntoVenta);
			
	       	this.jInternalFrameDetalleFormProductoPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormProductoPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormProductoPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionProductoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByProductoPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByProductoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionProductoPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeLinea(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="Linea";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLinea(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaGrupo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaGrupo";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaGrupo(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaCategoria(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaCategoria";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
						TitledBorder titledBorderLineaCategoria=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaCategoria.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaCategoria(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaMarca(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaMarca";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
						TitledBorder titledBorderLineaMarca=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaMarca.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaMarca(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoPuntoVenta(true);
			//this.isEsNuevoProductoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoPuntoVenta(false) ;
			
			if(productopuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoPuntoVenta(true);
			//this.isEsNuevoProductoPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productopuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoPuntoVenta(false) ;
			
			if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productopuntoventaConstantesFunciones.cargarid_productoProductoPuntoVenta) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoPuntoVenta(false);
			
			//if(!this.isEsNuevoProductoPuntoVenta) {								
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.productopuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoPuntoVenta=true;
					this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
					this.isEsNuevoProductoPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesProductoPuntoVenta(false);
			
												
				
				if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoPuntoVentaActionPerformed(evt,productopuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoPuntoVenta(this.productopuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productopuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productopuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.productopuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.productopuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productopuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoPuntoVentaModel) this.jTableDatosProductoPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoPuntoVenta=true;
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
				this.isEsNuevoProductoPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesProductoPuntoVenta(false);
				
				
				
				if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoPuntoVenta.getRowCount()>=1) {
				jTableDatosProductoPuntoVenta.removeRowSelectionInterval(0, jTableDatosProductoPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(false) ;
			
			this.isEsNuevoProductoPuntoVenta=false;
			
			if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoPuntoVenta(false);
				
				//SI ES MANUAL
				if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoPuntoVenta--;			
			//ProductoPuntoVenta productopuntoventaAux= new ProductoPuntoVenta();			
			//productopuntoventaAux.setId(this.iIdNuevoProductoPuntoVenta);
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
			
			this.productopuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productopuntoventaLogic.getProductoPuntoVentas().add(this.productopuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productopuntoventas.add(this.productopuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			
			this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoProductoPuntoVenta(), this.getIndiceNuevoProductoPuntoVenta());
			
			int iLastRow =  this.jTableDatosProductoPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPuntoVenta(false);
			
			//SI ES MANUAL
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoPuntoVenta();
			}
			
			//this.abrirFrameTreeProductoPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Punto VentaS ?", "MANTENIMIENTO DE Producto Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productopuntoventaReturnGeneral=productopuntoventaLogic.procesarImportacionProductoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productopuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoPuntoVenta.setFileImportacion(this.jInternalFrameImportacionProductoPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		

		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoria="id_linea_marca";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoriaValor="id_linea_marca";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca");
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProductoPuntoVenta productopuntoventa:productopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopuntoventa.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProductoPuntoVenta productopuntoventa:productopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopuntoventa.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProductoPuntoVenta productopuntoventa:productopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopuntoventa.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProductoPuntoVenta productopuntoventa:productopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopuntoventa.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoPuntoVenta productopuntoventa:productopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopuntoventa.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(ProductoPuntoVenta productopuntoventa:productopuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productopuntoventa.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelProductoPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoPuntoVenta(productopuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPuntoVenta(false);
			
			//SI ES MANUAL
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPuntoVenta(false);
			
			//SI ES MANUAL
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoPuntoVenta(false);
			
			//SI ES MANUAL
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxPostAccionNuevoProductoPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxPostAccionSinCerrarProductoPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxPostAccionSinMensajeProductoPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxPostAccionNuevoProductoPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxPostAccionSinCerrarProductoPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxPostAccionSinMensajeProductoPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoPuntoVenta() throws Exception {
		try	{
			if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaProductoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.getSelectedItem()!=null){this.id_linea_categoriaFK_IdLineaCategoria=((Linea)this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaProductoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.getSelectedItem()!=null){this.id_linea_grupoFK_IdLineaGrupo=((Linea)this.jComboBoxid_linea_grupoFK_IdLineaGrupoProductoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.getSelectedItem()!=null){this.id_linea_marcaFK_IdLineaMarca=((Linea)this.jComboBoxid_linea_marcaFK_IdLineaMarcaProductoPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoPuntoVenta.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoPuntoVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoPuntoVenta(Boolean esInicializar) throws Exception {				
		if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productopuntoventaLogic.getProductoPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productopuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoPuntoVenta.setModel(new ProductoPuntoVentaModel(this.productopuntoventaLogic.getProductoPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoPuntoVenta.setModel(new ProductoPuntoVentaModel(this.productopuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoPuntoVenta!=null && this.jInternalFrameOrderByProductoPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,productopuntoventaConstantesFunciones.resaltarSeleccionarProductoPuntoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoPuntoVentaConstantesFunciones.SCLASSWEBTITULO,productopuntoventaConstantesFunciones.resaltarSeleccionarProductoPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.productopuntoventaConstantesFunciones.mostraridProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productopuntoventaConstantesFunciones.resaltaridProductoPuntoVenta,this.productopuntoventaConstantesFunciones.activaridProductoPuntoVenta,this,true,"idProductoPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productopuntoventaConstantesFunciones.resaltaridProductoPuntoVenta,this.productopuntoventaConstantesFunciones.activaridProductoPuntoVenta,this,true,"idProductoPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA));

		if(this.productopuntoventaConstantesFunciones.mostrarid_lineaProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_lineaProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_lineaProductoPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_lineaProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_lineaProductoPuntoVenta,true,"id_lineaProductoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.productopuntoventaConstantesFunciones.mostrarid_linea_grupoProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_linea_grupoProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_linea_grupoProductoPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_linea_grupoProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_linea_grupoProductoPuntoVenta,true,"id_linea_grupoProductoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA));

		if(this.productopuntoventaConstantesFunciones.mostrarid_linea_categoriaProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriasForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_linea_categoriaProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_linea_categoriaProductoPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriasForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_linea_categoriaProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_linea_categoriaProductoPuntoVenta,true,"id_linea_categoriaProductoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA));

		if(this.productopuntoventaConstantesFunciones.mostrarid_linea_marcaProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineamarcasForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_linea_marcaProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_linea_marcaProductoPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineamarcasForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_linea_marcaProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_linea_marcaProductoPuntoVenta,true,"id_linea_marcaProductoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productopuntoventaConstantesFunciones.mostrarid_productoProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_productoProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_productoProductoPuntoVenta));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productopuntoventaConstantesFunciones.resaltarid_productoProductoPuntoVenta,this,this.productopuntoventaConstantesFunciones.activarid_productoProductoPuntoVenta,true,"id_productoProductoPuntoVenta","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.productopuntoventaConstantesFunciones.mostraresta_activoProductoPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.productopuntoventaConstantesFunciones.resaltaresta_activoProductoPuntoVenta,this.productopuntoventaConstantesFunciones.activaresta_activoProductoPuntoVenta));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.productopuntoventaConstantesFunciones.resaltaresta_activoProductoPuntoVenta,this.productopuntoventaConstantesFunciones.activaresta_activoProductoPuntoVenta,this,true,"esta_activoProductoPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productopuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productopuntoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productopuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productopuntoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productopuntoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productopuntoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosProductoPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoPuntoVenta.moveColumn(this.jTableDatosProductoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoPuntoVenta.moveColumn(this.jTableDatosProductoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoPuntoVenta.moveColumn(this.jTableDatosProductoPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productopuntoventaLogic.getProductoPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productopuntoventas.size()-1;
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
		//this.jTableDatosProductoPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoPuntoVenta();
			
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
				
				//this.isEsNuevoProductoPuntoVenta=false;
					
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
				if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productopuntoventa.getsType().equals("DUPLICADO")
				   || this.productopuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoPuntoVenta=true;
				
				} else {
					this.isEsNuevoProductoPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.productopuntoventa.getId()>=0 && !this.productopuntoventa.getIsNew()) {						
						this.isEsNuevoProductoPuntoVenta=false;
						
					} else {
						this.isEsNuevoProductoPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoPuntoVenta(esRelaciones);						
				
				this.seleccionarProductoPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productopuntoventa.getId()<0) {
					this.isEsNuevoProductoPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoPuntoVenta(evt,rowIndex);
				}	
				
				if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoPuntoVenta: " + this.dDif); 
					}
				}								
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productopuntoventa)) {
					if(this.productopuntoventa.getId()>0) {
						this.productopuntoventa.setIsDeleted(true);
						
						this.productopuntoventasEliminados.add(this.productopuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productopuntoventaLogic.getProductoPuntoVentas().remove(this.productopuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productopuntoventas.remove(this.productopuntoventa);				
					}
					
					
					((ProductoPuntoVentaModel) this.jTableDatosProductoPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Linea
					if(!this.productopuntoventaConstantesFunciones.cargarid_lineaProductoPuntoVenta || this.productopuntoventaConstantesFunciones.event_dependid_lineaProductoPuntoVenta) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.productopuntoventa.getid_linea());
									//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(productopuntoventa.getLinea()!=null) {
							this.lineasForeignKey.add(productopuntoventa.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.productopuntoventa.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.productopuntoventaConstantesFunciones.cargarid_linea_grupoProductoPuntoVenta || this.productopuntoventaConstantesFunciones.event_dependid_linea_grupoProductoPuntoVenta) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.productopuntoventa.getid_linea_grupo());
									//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(productopuntoventa.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(productopuntoventa.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.productopuntoventa.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.productopuntoventaConstantesFunciones.cargarid_linea_categoriaProductoPuntoVenta || this.productopuntoventaConstantesFunciones.event_dependid_linea_categoriaProductoPuntoVenta) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.productopuntoventa.getid_linea_categoria());
									//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(productopuntoventa.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(productopuntoventa.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.productopuntoventa.getid_linea_categoria(),false,"Formulario");

					//LineaMarca
					if(!this.productopuntoventaConstantesFunciones.cargarid_linea_marcaProductoPuntoVenta || this.productopuntoventaConstantesFunciones.event_dependid_linea_marcaProductoPuntoVenta) {
						//this.cargarCombosLineaMarcasForeignKeyLista(" where id="+this.productopuntoventa.getid_linea_marca());
									//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
						this.lineamarcasForeignKey=new ArrayList<Linea>();

						if(productopuntoventa.getLineaMarca()!=null) {
							this.lineamarcasForeignKey.add(productopuntoventa.getLineaMarca());
						}

						this.addItemDefectoCombosForeignKeyLineaMarca();
						this.cargarCombosFrameLineaMarcasForeignKey("Todos");
					}
					this.setActualLineaMarcaForeignKey(this.productopuntoventa.getid_linea_marca(),false,"Formulario");

					//Producto
					if(!this.productopuntoventaConstantesFunciones.cargarid_productoProductoPuntoVenta || this.productopuntoventaConstantesFunciones.event_dependid_productoProductoPuntoVenta) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productopuntoventa.getid_producto());
									//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productopuntoventa.getProducto()!=null) {
							this.productosForeignKey.add(productopuntoventa.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productopuntoventa.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoPuntoVenta(ProductoPuntoVenta productopuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoPuntoVenta(productopuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoPuntoVenta(productopuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoPuntoVenta(productopuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoPuntoVenta(productopuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioProductoPuntoVenta(ProductoPuntoVenta productopuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setText(productopuntoventa.getId().toString());
			this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setSelected(productopuntoventa.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoPuntoVenta productopuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productopuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoPuntoVenta productopuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productopuntoventaLocal=this.productopuntoventa;
			} else {
				productopuntoventaLocal=this.productopuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productopuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoPuntoVenta(productopuntoventaLocal,true);
					
					if(productopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productopuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productopuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoPuntoVenta(productopuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(productopuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoPuntoVenta(productopuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.getText()==null || this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setText("0");
			}

			if(conColumnasBase) {productopuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelIdProductoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productopuntoventa.setesta_activo(this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelesta_activoProductoPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoPuntoVenta(ProductoPuntoVenta productopuntoventaBean,ProductoPuntoVenta productopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productopuntoventaBean.getid_linea()!=null && !productopuntoventaBean.getid_linea().equals(-1L))) {productopuntoventa.setid_linea(productopuntoventaBean.getid_linea());}
			if(conDefault || (!conDefault && productopuntoventaBean.getid_linea_grupo()!=null && !productopuntoventaBean.getid_linea_grupo().equals(null))) {productopuntoventa.setid_linea_grupo(productopuntoventaBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && productopuntoventaBean.getid_linea_categoria()!=null && !productopuntoventaBean.getid_linea_categoria().equals(null))) {productopuntoventa.setid_linea_categoria(productopuntoventaBean.getid_linea_categoria());}
			if(conDefault || (!conDefault && productopuntoventaBean.getid_linea_marca()!=null && !productopuntoventaBean.getid_linea_marca().equals(null))) {productopuntoventa.setid_linea_marca(productopuntoventaBean.getid_linea_marca());}
			if(conDefault || (!conDefault && productopuntoventaBean.getid_producto()!=null && !productopuntoventaBean.getid_producto().equals(-1L))) {productopuntoventa.setid_producto(productopuntoventaBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoPuntoVenta(ProductoPuntoVenta productopuntoventaOrigen,ProductoPuntoVenta productopuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productopuntoventaOrigen.getId()!=null && !productopuntoventaOrigen.getId().equals(0L))) {productopuntoventa.setId(productopuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && productopuntoventaOrigen.getid_linea()!=null && !productopuntoventaOrigen.getid_linea().equals(-1L))) {productopuntoventa.setid_linea(productopuntoventaOrigen.getid_linea());}
			if(conDefault || (!conDefault && productopuntoventaOrigen.getid_linea_grupo()!=null && !productopuntoventaOrigen.getid_linea_grupo().equals(null))) {productopuntoventa.setid_linea_grupo(productopuntoventaOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && productopuntoventaOrigen.getid_linea_categoria()!=null && !productopuntoventaOrigen.getid_linea_categoria().equals(null))) {productopuntoventa.setid_linea_categoria(productopuntoventaOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && productopuntoventaOrigen.getid_linea_marca()!=null && !productopuntoventaOrigen.getid_linea_marca().equals(null))) {productopuntoventa.setid_linea_marca(productopuntoventaOrigen.getid_linea_marca());}
			if(conDefault || (!conDefault && productopuntoventaOrigen.getid_producto()!=null && !productopuntoventaOrigen.getid_producto().equals(-1L))) {productopuntoventa.setid_producto(productopuntoventaOrigen.getid_producto());}
			if(conDefault || (!conDefault && productopuntoventaOrigen.getesta_activo()!=null && !productopuntoventaOrigen.getesta_activo().equals(false))) {productopuntoventa.setesta_activo(productopuntoventaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoPuntoVenta(ProductoPuntoVenta productopuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setText(productopuntoventa.getId().toString());
			this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setSelected(productopuntoventa.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoPuntoVenta(ProductoPuntoVentaBean productopuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setText(productopuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setSelected(productopuntoventaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoPuntoVenta(ProductoPuntoVentaParameterReturnGeneral productopuntoventaReturnGeneral,ProductoPuntoVentaBean productopuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			ProductoPuntoVenta productopuntoventaLocal=new ProductoPuntoVenta();
			
			productopuntoventaLocal=productopuntoventaReturnGeneral.getProductoPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productopuntoventaLocal.getId()!=null && !productopuntoventaLocal.getId().equals(0L))) {productopuntoventaBean.setId(productopuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && productopuntoventaLocal.getid_linea()!=null && !productopuntoventaLocal.getid_linea().equals(-1L))) {productopuntoventaBean.setid_linea(productopuntoventaLocal.getid_linea());}
			if(conDefault || (!conDefault && productopuntoventaLocal.getid_linea_grupo()!=null && !productopuntoventaLocal.getid_linea_grupo().equals(null))) {productopuntoventaBean.setid_linea_grupo(productopuntoventaLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && productopuntoventaLocal.getid_linea_categoria()!=null && !productopuntoventaLocal.getid_linea_categoria().equals(null))) {productopuntoventaBean.setid_linea_categoria(productopuntoventaLocal.getid_linea_categoria());}
			if(conDefault || (!conDefault && productopuntoventaLocal.getid_linea_marca()!=null && !productopuntoventaLocal.getid_linea_marca().equals(null))) {productopuntoventaBean.setid_linea_marca(productopuntoventaLocal.getid_linea_marca());}
			if(conDefault || (!conDefault && productopuntoventaLocal.getid_producto()!=null && !productopuntoventaLocal.getid_producto().equals(-1L))) {productopuntoventaBean.setid_producto(productopuntoventaLocal.getid_producto());}
			if(conDefault || (!conDefault && productopuntoventaLocal.getesta_activo()!=null && !productopuntoventaLocal.getesta_activo().equals(false))) {productopuntoventaBean.setesta_activo(productopuntoventaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoPuntoVentaGenerico(Long idProductoPuntoVentaSeleccionado,JComboBox jComboBoxProductoPuntoVenta,List<ProductoPuntoVenta> productopuntoventasLocal)throws Exception {
		try {
			ProductoPuntoVenta  productopuntoventaTemp=null;

			for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasLocal) {
				if(productopuntoventaAux.getId()!=null && productopuntoventaAux.getId().equals(idProductoPuntoVentaSeleccionado)) {
					productopuntoventaTemp=productopuntoventaAux;
					break;
				}
			}

			jComboBoxProductoPuntoVenta.setSelectedItem(productopuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoPuntoVentaGenerico(JComboBox jComboBoxProductoPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productopuntoventa=(ProductoPuntoVenta) productopuntoventaLogic.getProductoPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productopuntoventa =(ProductoPuntoVenta) productopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!productopuntoventa.getIsNew() && !productopuntoventa.getIsChanged() && !productopuntoventa.getIsDeleted()) {
				sDescripcion=productopuntoventa.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=productopuntoventa.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!productopuntoventa.getIsNew() && !productopuntoventa.getIsChanged() && !productopuntoventa.getIsDeleted()) {
				sDescripcion=productopuntoventa.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=productopuntoventa.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!productopuntoventa.getIsNew() && !productopuntoventa.getIsChanged() && !productopuntoventa.getIsDeleted()) {
				sDescripcion=productopuntoventa.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=productopuntoventa.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!productopuntoventa.getIsNew() && !productopuntoventa.getIsChanged() && !productopuntoventa.getIsDeleted()) {
				sDescripcion=productopuntoventa.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=productopuntoventa.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productopuntoventa.getIsNew() && !productopuntoventa.getIsChanged() && !productopuntoventa.getIsDeleted()) {
				sDescripcion=productopuntoventa.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productopuntoventa.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoPuntoVenta productopuntoventaRow=new ProductoPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productopuntoventaRow=(ProductoPuntoVenta) productopuntoventaLogic.getProductoPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productopuntoventaRow=(ProductoPuntoVenta) productopuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta));			
			this.jButtonDuplicarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarProductoPuntoVenta && this.isPermisoDuplicarProductoPuntoVenta));			
			this.jButtonCopiarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarProductoPuntoVenta && this.isPermisoCopiarProductoPuntoVenta));
			this.jButtonVerFormProductoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormProductoPuntoVenta && this.isPermisoVerFormProductoPuntoVenta));
			
			this.jButtonAbrirOrderByProductoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenProductoPuntoVenta && this.isPermisoOrdenProductoPuntoVenta));			
			
			this.jButtonNuevoRelacionesProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarProductoPuntoVenta && this.isPermisoActualizarProductoPuntoVenta));	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarProductoPuntoVenta && this.isPermisoActualizarProductoPuntoVenta));	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarProductoPuntoVenta && this.isPermisoEliminarProductoPuntoVenta));
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarProductoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarProductoPuntoVenta);							
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta));						
			this.jButtonDuplicarToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarProductoPuntoVenta && this.isPermisoDuplicarProductoPuntoVenta));						
			this.jButtonCopiarToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarProductoPuntoVenta && this.isPermisoCopiarProductoPuntoVenta));			
			this.jButtonVerFormToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormProductoPuntoVenta && this.isPermisoVerFormProductoPuntoVenta));			
			this.jButtonAbrirOrderByToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenProductoPuntoVenta && this.isPermisoOrdenProductoPuntoVenta));
			this.jButtonNuevoRelacionesToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarProductoPuntoVenta && this.isPermisoActualizarProductoPuntoVenta));	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarProductoPuntoVenta  && this.isPermisoActualizarProductoPuntoVenta));	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarProductoPuntoVenta && this.isPermisoEliminarProductoPuntoVenta));
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarToolBarProductoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarProductoPuntoVenta);				
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta));			
			this.jMenuItemDuplicarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarProductoPuntoVenta && this.isPermisoDuplicarProductoPuntoVenta));			
			this.jMenuItemCopiarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarProductoPuntoVenta && this.isPermisoCopiarProductoPuntoVenta));			
			this.jMenuItemVerFormProductoPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormProductoPuntoVenta && this.isPermisoVerFormProductoPuntoVenta));			
			this.jMenuItemAbrirOrderByProductoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenProductoPuntoVenta && this.isPermisoOrdenProductoPuntoVenta));			
			//this.jMenuItemMostrarOcultarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenProductoPuntoVenta && this.isPermisoOrdenProductoPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenProductoPuntoVenta && this.isPermisoOrdenProductoPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenProductoPuntoVenta && this.isPermisoOrdenProductoPuntoVenta));			
			this.jMenuItemNuevoRelacionesProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoProductoPuntoVenta && this.isPermisoNuevoProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemModificarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaModificarProductoPuntoVenta && this.isPermisoActualizarProductoPuntoVenta));	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemActualizarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarProductoPuntoVenta && this.isPermisoActualizarProductoPuntoVenta));	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemEliminarProductoPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarProductoPuntoVenta && this.isPermisoEliminarProductoPuntoVenta));
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemCancelarProductoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarProductoPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=this.jButtonNuevoProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarProductoPuntoVenta=this.jButtonDuplicarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarProductoPuntoVenta=this.jButtonCopiarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormProductoPuntoVenta=this.jButtonVerFormProductoPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoPuntoVenta=this.jButtonAbrirOrderByProductoPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=this.jButtonNuevoRelacionesProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarProductoPuntoVenta=this.jButtonModificarProductoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=this.jButtonGuardarCambiosTablaProductoPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=this.jButtonNuevoToolBarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=this.jButtonNuevoRelacionesToolBarProductoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarToolBarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarToolBarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarToolBarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarToolBarProductoPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoPuntoVenta=this.jButtonGuardarCambiosToolBarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=this.jButtonGuardarCambiosTablaToolBarProductoPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=this.jMenuItemNuevoProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=this.jMenuItemNuevoRelacionesProductoPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemModificarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemActualizarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemEliminarProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemCancelarProductoPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoPuntoVenta=this.jMenuItemGuardarCambiosProductoPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=this.jMenuItemGuardarCambiosTablaProductoPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoPuntoVenta(Boolean esInicializar) {
		if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoPuntoVenta() {
		this.jButtonNuevoProductoPuntoVenta.setVisible(this.isPermisoNuevoProductoPuntoVenta);			
		this.jButtonDuplicarProductoPuntoVenta.setVisible(this.isPermisoDuplicarProductoPuntoVenta);			
		this.jButtonCopiarProductoPuntoVenta.setVisible(this.isPermisoCopiarProductoPuntoVenta);			
		this.jButtonVerFormProductoPuntoVenta.setVisible(this.isPermisoVerFormProductoPuntoVenta);			
		
		this.jButtonAbrirOrderByProductoPuntoVenta.setVisible(this.isPermisoOrdenProductoPuntoVenta);					
		
		this.jButtonNuevoRelacionesProductoPuntoVenta.setVisible(this.isPermisoNuevoProductoPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarProductoPuntoVenta.setVisible(this.isPermisoActualizarProductoPuntoVenta);	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarProductoPuntoVenta.setVisible(this.isPermisoActualizarProductoPuntoVenta);	
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarProductoPuntoVenta.setVisible(this.isPermisoEliminarProductoPuntoVenta);
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarProductoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarProductoPuntoVenta);						
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.setVisible(this.isPermisoGuardarCambiosProductoPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.setVisible(this.isPermisoActualizarProductoPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoPuntoVenta() {
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarProductoPuntoVenta.setVisible(this.isPermisoActualizarProductoPuntoVenta);	
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarProductoPuntoVenta.setVisible(this.isPermisoActualizarProductoPuntoVenta);	
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarProductoPuntoVenta.setVisible(this.isPermisoEliminarProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarProductoPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarProductoPuntoVenta);							
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarProductoPuntoVenta && this.isPermisoGuardarCambiosProductoPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoPuntoVenta() {
		if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoPuntoVenta() {
	}
	
	public void jTableDatosProductoPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productopuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProductoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProductoPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productopuntoventaLogic.getConnexion());

				if(this.productopuntoventa.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.productopuntoventa.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.productopuntoventa.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProductoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProductoPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productopuntoventaLogic.getConnexion());

				if(this.productopuntoventa.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.productopuntoventa.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.productopuntoventa.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProductoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProductoPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productopuntoventaLogic.getConnexion());

				if(this.productopuntoventa.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.productopuntoventa.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.productopuntoventa.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProductoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProductoPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productopuntoventaLogic.getConnexion());

				if(this.productopuntoventa.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.productopuntoventa.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.productopuntoventa.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoPuntoVenta=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoPuntoVenta.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoPuntoVenta(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productopuntoventaLogic.getConnexion());

				if(this.productopuntoventa.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productopuntoventa.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoPuntoVenta=(TitledBorder)this.jScrollPanelDatosProductoPuntoVenta.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoPuntoVenta.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productopuntoventa.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoProductoPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.getproductopuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productopuntoventa==null) {
						this.productopuntoventa = new ProductoPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);
				}

				if(this.productopuntoventa.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.productopuntoventa.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdLineaProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);

			this.getProductoPuntoVentasFK_IdLinea();

			this.inicializarActualizarBindingProductoPuntoVenta(false);

			//if(ProductoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);

			this.getProductoPuntoVentasFK_IdLineaCategoria();

			this.inicializarActualizarBindingProductoPuntoVenta(false);

			//if(ProductoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);

			this.getProductoPuntoVentasFK_IdLineaGrupo();

			this.inicializarActualizarBindingProductoPuntoVenta(false);

			//if(ProductoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);

			this.getProductoPuntoVentasFK_IdLineaMarca();

			this.inicializarActualizarBindingProductoPuntoVenta(false);

			//if(ProductoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);

			this.getProductoPuntoVentasFK_IdProducto();

			this.inicializarActualizarBindingProductoPuntoVenta(false);

			//if(ProductoPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productopuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoPuntoVenta() {
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoPuntoVenta.dispose();
			this.jInternalFrameDetalleFormProductoPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoProductoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoProductoPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionProductoPuntoVenta!=null) {
			this.jInternalFrameImportacionProductoPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionProductoPuntoVenta.dispose();
			this.jInternalFrameImportacionProductoPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoPuntoVenta();
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoPuntoVenta")) {
				jButtonDuplicarProductoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoPuntoVenta")) {
				jButtonCopiarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoPuntoVenta")) {
				jButtonVerFormProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoPuntoVenta")) {
				jButtonDuplicarProductoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoPuntoVenta")) {
				jButtonDuplicarProductoPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoPuntoVenta")) {
				jButtonModificarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoPuntoVenta")) {
				jButtonModificarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoPuntoVenta")) {
				jButtonModificarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoPuntoVenta")) {
				jButtonActualizarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoPuntoVenta")) {
				jButtonActualizarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoPuntoVenta")) {
				jButtonActualizarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoPuntoVenta")) {
				jButtonEliminarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoPuntoVenta")) {
				jButtonEliminarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoPuntoVenta")) {
				jButtonEliminarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoPuntoVenta")) {
				jButtonCancelarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoPuntoVenta")) {
				jButtonCancelarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoPuntoVenta")) {
				jButtonCancelarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoPuntoVenta")) {
				jButtonCerrarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoPuntoVenta")) {
				jButtonCerrarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoPuntoVenta")) {
				jButtonCerrarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoPuntoVenta")) {
				jButtonMostrarOcultarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoPuntoVenta")) {
				jButtonCancelarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoPuntoVenta")) {
				jButtonCopiarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoPuntoVenta")) {
				jButtonVerFormProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoPuntoVenta")) {
				jButtonCopiarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoPuntoVenta")) {
				jButtonVerFormProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoPuntoVenta")) {
				jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoPuntoVenta")) {
				jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoPuntoVenta")) {
				jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoPuntoVenta")) {
				jButtonAnterioresProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoPuntoVenta")) {
				jButtonAnterioresProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoPuntoVenta")) {
				jButtonAnterioresProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoPuntoVenta")) {
				jButtonSiguientesProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoPuntoVenta")) {
				jButtonSiguientesProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoPuntoVenta")) {
				jButtonSiguientesProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoPuntoVenta")) {
				jButtonAbrirOrderByProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoPuntoVenta")) {
				jButtonMostrarOcultarProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoPuntoVenta")) {
				jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoPuntoVenta")) {
				jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoPuntoVenta")) {
				jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoPuntoVenta")) {
				jButtonCerrarReporteDinamicoProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoPuntoVenta")) {
				jButtonGenerarReporteDinamicoProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoPuntoVenta")) {
				jButtonCerrarImportacionProductoPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoPuntoVenta")) {
				
				jButtonGenerarImportacionProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoPuntoVenta")) {
				
				jButtonAbrirImportacionProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoPuntoVenta")) {
				jComboBoxTiposAccionesProductoPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoPuntoVenta")) {
				jComboBoxTiposRelacionesProductoPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoPuntoVenta")) {
				jComboBoxTiposAccionesProductoPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoPuntoVenta")) {
				
				jComboBoxTiposSeleccionarProductoPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoPuntoVenta")) {
				jTextFieldValorCampoGeneralProductoPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoPuntoVenta")) {
				jButtonAbrirOrderByProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoPuntoVenta")) {
				jButtonAbrirOrderByProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoPuntoVenta")) {
				jButtonCerrarOrderByProductoPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoPuntoVentaBusqueda")) {
				this.jButtonidProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductoPuntoVentaUpdate")) {
				this.jButtonid_lineaProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductoPuntoVentaBusqueda")) {
				this.jButtonid_lineaProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductoPuntoVentaUpdate")) {
				this.jButtonid_linea_grupoProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductoPuntoVentaBusqueda")) {
				this.jButtonid_linea_grupoProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductoPuntoVentaUpdate")) {
				this.jButtonid_linea_categoriaProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductoPuntoVentaBusqueda")) {
				this.jButtonid_linea_categoriaProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductoPuntoVentaUpdate")) {
				this.jButtonid_linea_marcaProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductoPuntoVentaBusqueda")) {
				this.jButtonid_linea_marcaProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoPuntoVenta")) {
				this.jButtonid_productoProductoPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoPuntoVentaUpdate")) {
				this.jButtonid_productoProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoPuntoVentaBusqueda")) {
				this.jButtonid_productoProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoProductoPuntoVentaBusqueda")) {
				this.jButtonesta_activoProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoPuntoVenta")) {
				this.jButtonid_productoProductoPuntoVentaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdLineaProductoPuntoVenta")) {
				this.jButtonFK_IdLineaProductoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaCategoriaProductoPuntoVenta")) {
				this.jButtonFK_IdLineaCategoriaProductoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaGrupoProductoPuntoVenta")) {
				this.jButtonFK_IdLineaGrupoProductoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaMarcaProductoPuntoVenta")) {
				this.jButtonFK_IdLineaMarcaProductoPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoPuntoVenta")) {
				this.jButtonFK_IdProductoProductoPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoPuntoVenta productopuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				productopuntoventaLocal=this.productopuntoventa;
			} else {
				productopuntoventaLocal=this.productopuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
							
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
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
			
			


			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
								
						
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
								
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
							
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
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
			
			


			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
								
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoPuntoVenta")) {
					jCheckBoxSeleccionarTodosProductoPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoPuntoVenta")) {
					jCheckBoxSeleccionadosProductoPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoPuntoVenta")) {
					
				}
				
				


				
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
												
				
				


				
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
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
			
			


			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productopuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productopuntoventa);
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
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
				
				


				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productopuntoventaAnterior =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productopuntoventa =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productopuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoPuntoVenta")) {
				
				}
				
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoPuntoVenta")) {
			
			}
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoPuntoVenta();
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoPuntoVenta")) {
				jButtonDuplicarProductoPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoPuntoVenta")) {
				jButtonCopiarProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoPuntoVenta")) {
				jButtonVerFormProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoPuntoVenta")) {
				jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoPuntoVenta")) {
				jButtonModificarProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoPuntoVenta")) {
				jButtonActualizarProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoPuntoVenta")) {
				jButtonEliminarProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoPuntoVenta")) {
				jButtonCancelarProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoPuntoVenta")) {
				jButtonCerrarProductoPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoPuntoVenta")) {
				jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoPuntoVenta")) {
				jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoPuntoVenta")) {
				jButtonAbrirOrderByProductoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoPuntoVenta")) {
				jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoPuntoVenta")) {
				jButtonAnterioresProductoPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoPuntoVenta")) {
				jButtonSiguientesProductoPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoPuntoVentaBusqueda")) {
				this.jButtonidProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductoPuntoVentaUpdate")) {
				this.jButtonid_lineaProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductoPuntoVentaBusqueda")) {
				this.jButtonid_lineaProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductoPuntoVentaUpdate")) {
				this.jButtonid_linea_grupoProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductoPuntoVentaBusqueda")) {
				this.jButtonid_linea_grupoProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductoPuntoVentaUpdate")) {
				this.jButtonid_linea_categoriaProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductoPuntoVentaBusqueda")) {
				this.jButtonid_linea_categoriaProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductoPuntoVentaUpdate")) {
				this.jButtonid_linea_marcaProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductoPuntoVentaBusqueda")) {
				this.jButtonid_linea_marcaProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoPuntoVenta")) {
				this.jButtonid_productoProductoPuntoVentaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoPuntoVentaUpdate")) {
				this.jButtonid_productoProductoPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoPuntoVentaBusqueda")) {
				this.jButtonid_productoProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoProductoPuntoVentaBusqueda")) {
				this.jButtonesta_activoProductoPuntoVentaBusquedaActionPerformed(evt);
			}
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoPuntoVenta")) {
				closingInternalFrameProductoPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarProductoPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(ProductoPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoPuntoVentaActionPerformed(null);
			}
			
			ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productopuntoventa,new Object(),this.productopuntoventaParameterGeneral,this.productopuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productopuntoventa)) {
			if(!esControlTabla) {
				if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);			
				}
				
				if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoPuntoVenta(this.productopuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productopuntoventaReturnGeneral=productopuntoventaLogic.procesarEventosProductoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopuntoventaLogic.getProductoPuntoVentas(),this.productopuntoventa,this.productopuntoventaParameterGeneral,this.isEsNuevoProductoPuntoVenta,classes);//this.productopuntoventaLogic.getProductoPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoPuntoVenta(this.productopuntoventaReturnGeneral,this.productopuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoPuntoVenta(classes,this.productopuntoventaReturnGeneral,this.productopuntoventaBean,false);
					}
						
					if(this.productopuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta());	
					}
						
					if(this.productopuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta(),classes);//this.productopuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoPuntoVenta(this.productopuntoventa,classes);//this.productopuntoventaBean);									
				}
			
				if(ProductoPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoPuntoVenta(this.productopuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoPuntoVenta(this.productopuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productopuntoventaAnterior!=null) {
						this.productopuntoventa=this.productopuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productopuntoventaReturnGeneral=productopuntoventaLogic.procesarEventosProductoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopuntoventaLogic.getProductoPuntoVentas(),this.productopuntoventa,this.productopuntoventaParameterGeneral,this.isEsNuevoProductoPuntoVenta,classes);//this.productopuntoventaLogic.getProductoPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productopuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productopuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productopuntoventaReturnGeneral.getProductoPuntoVenta(),productopuntoventaLogic.getProductoPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productopuntoventaReturnGeneral.getProductoPuntoVenta(),this.productopuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoPuntoVenta() throws Exception {
		
		ProductoPuntoVentaModel productopuntoventaModel=(ProductoPuntoVentaModel)this.jTableDatosProductoPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productopuntoventaModel.productopuntoventas=this.productopuntoventaLogic.getProductoPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productopuntoventaModel.productopuntoventas=this.productopuntoventas;
		}
		
		
		((ProductoPuntoVentaModel) this.jTableDatosProductoPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductopuntoventaAnterior(),this.productopuntoventaLogic.getProductoPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductopuntoventaAnterior(),this.productopuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopuntoventa,new Object(),generalEntityParameterGeneral,this.productopuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productopuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoPuntoVentaConstantesFunciones.getClassesRelationshipsOfProductoPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfProductoPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productopuntoventa,new Object(),generalEntityParameterGeneral,this.productopuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoPuntoVenta(ProductoPuntoVentaBean productopuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoPuntoVenta(ArrayList<Classe> classes,ProductoPuntoVentaReturnGeneral productopuntoventaReturnGeneral,ProductoPuntoVentaBean productopuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productopuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoPuntoVenta = new ProductoPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.productopuntoventaSessionBean.getConGuardarRelaciones(),this.productopuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormProductoPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.productopuntoventaLogic=this.productopuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyProductoPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoPuntoVenta"));
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarProductoPuntoVenta"));

		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoPuntoVenta"));
					
		this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemModificarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarProductoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoPuntoVenta"));
						
		this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemActualizarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarProductoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoPuntoVenta"));
								
		this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemEliminarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarProductoPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoPuntoVenta"));
					
		this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemCancelarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemDetalleCerrarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonidProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_lineaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_lineaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_grupoProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_grupoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_categoriaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_marcaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_marcaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductoPuntoVentaBusqueda"));
		//jButtonid_productoProductoPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonesta_activoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoProductoPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoPuntoVenta"));
		}
		
		this.jTableDatosProductoPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoPuntoVenta"));
		
		this.jTableDatosProductoPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoPuntoVenta"));
		
		this.jButtonNuevoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoProductoPuntoVenta"));
		
		this.jButtonDuplicarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarProductoPuntoVenta"));
		
		this.jButtonCopiarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarProductoPuntoVenta"));
		
		this.jButtonVerFormProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormProductoPuntoVenta"));
		
		
		this.jButtonNuevoToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoPuntoVenta"));
			
		this.jButtonDuplicarToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoPuntoVenta"));
			
		this.jMenuItemNuevoProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoPuntoVenta"));
			
		this.jMenuItemDuplicarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarProductoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonModificarToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoPuntoVenta"));
			
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemModificarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarProductoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonActualizarToolBarProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoPuntoVenta"));
				
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemActualizarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarProductoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonEliminarToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoPuntoVenta"));
						
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemEliminarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarProductoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonCancelarToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoPuntoVenta"));
			
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemCancelarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoPuntoVenta"));		
		
		
		this.jButtonCerrarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarProductoPuntoVenta"));
		
		
		this.jButtonCerrarToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoPuntoVenta"));
			
		this.jMenuItemCerrarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jMenuItemDetalleCerrarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoPuntoVenta"));
			
		this.jButtonVerFormToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoPuntoVenta"));
		
		this.jMenuItemGuardarCambiosProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoPuntoVenta"));
			
		this.jMenuItemCopiarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoPuntoVenta"));		
		
		this.jMenuItemVerFormProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoPuntoVenta"));
		
		this.jMenuItemRecargarInformacionProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoPuntoVenta"));		
		
		
		
		this.jButtonAnterioresProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresProductoPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoPuntoVenta"));
		
		this.jMenuItemAnterioresProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoPuntoVenta"));		
		
		
		this.jButtonSiguientesProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesProductoPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoPuntoVenta"));
			
		this.jMenuItemSiguientesProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoPuntoVenta"));
			
		this.jMenuItemAbrirOrderByProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoPuntoVenta"));
			
		this.jMenuItemMostrarOcultarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoPuntoVenta"));

		this.jCheckBoxSeleccionadosProductoPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoPuntoVenta"));
			
		this.jComboBoxTiposAccionesProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonidProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_lineaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_lineaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_grupoProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_grupoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_categoriaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_marcaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_marcaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductoPuntoVentaBusqueda"));
		//jButtonid_productoProductoPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonesta_activoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoProductoPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdLineaProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaProductoPuntoVenta"));

			this.jButtonFK_IdLineaCategoriaProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaCategoriaProductoPuntoVenta"));

			this.jButtonFK_IdLineaGrupoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaGrupoProductoPuntoVenta"));

			this.jButtonFK_IdLineaMarcaProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaMarcaProductoPuntoVenta"));

			this.jButtonFK_IdProductoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoPuntoVenta"));

			this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoPuntoVenta"));
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoPuntoVenta"));
				this.jInternalFrameReporteDinamicoProductoPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoPuntoVenta!=null) {
				this.jInternalFrameImportacionProductoPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoPuntoVenta"));
				this.jInternalFrameImportacionProductoPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoPuntoVenta"));
				this.jInternalFrameImportacionProductoPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarProductoPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoPuntoVenta"));			
			
			if(this.jInternalFrameOrderByProductoPuntoVenta!=null) {
				this.jInternalFrameOrderByProductoPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoPuntoVenta.jTabbedPaneRelacionesProductoPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoPuntoVenta"));
		
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
            		closingInternalFrameProductoPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            ProductoPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(ProductoPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoPuntoVenta";
		inputMap = this.jButtonNuevoProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoPuntoVenta";
		inputMap = this.jButtonModificarProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoPuntoVenta";
		inputMap = this.jButtonActualizarProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoPuntoVenta";
		inputMap = this.jButtonEliminarProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoPuntoVenta";
		inputMap = this.jButtonCancelarProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoPuntoVenta";
		inputMap = this.jButtonCerrarProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonGuardarCambiosProductoPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonidProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_lineaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_lineaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_grupoProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_grupoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_categoriaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_categoriaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductoPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_marcaProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_linea_marcaProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductoPuntoVentaBusqueda"));
		//jButtonid_productoProductoPuntoVenta.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoPuntoVentaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVenta"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonesta_activoProductoPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoProductoPuntoVentaBusqueda"));
		
		
		this.jButtonFK_IdLineaProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaProductoPuntoVenta"));

		this.jButtonFK_IdLineaCategoriaProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaCategoriaProductoPuntoVenta"));

		this.jButtonFK_IdLineaGrupoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaGrupoProductoPuntoVenta"));

		this.jButtonFK_IdLineaMarcaProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaMarcaProductoPuntoVenta"));

		this.jButtonFK_IdProductoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoPuntoVenta"));

		this.jButtonBuscarFK_IdProductoid_productoProductoPuntoVenta.addActionListener(new ButtonActionListener(this,"id_productoProductoPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
					productopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPuntoVenta productopuntoventaAux:productopuntoventas) {
					productopuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
						productopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoPuntoVenta productopuntoventaAux:productopuntoventas) {
						productopuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
					
						if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							productopuntoventaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoPuntoVenta productopuntoventaAux:productopuntoventas) {
						
						if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							productopuntoventaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoPuntoVenta.getSelectedRows();
			
			ProductoPuntoVenta productopuntoventaLocal=new ProductoPuntoVenta();
			
			//this.seleccionarTodosProductoPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productopuntoventaLocal =(ProductoPuntoVenta) this.productopuntoventaLogic.getProductoPuntoVentas().toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productopuntoventaLocal =(ProductoPuntoVenta) this.productopuntoventas.toArray()[this.jTableDatosProductoPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productopuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
						productopuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoPuntoVenta productopuntoventaAux:productopuntoventas) {
						productopuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventaLogic.getProductoPuntoVentas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPuntoVenta productopuntoventaAux:productopuntoventas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoPuntoVenta(conSplash);
				
					this.generarReporteProductoPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoPuntoVenta();
				
				this.exportarProductoPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoPuntoVentas();
				//this.importarProductoPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralProductoPuntoVenta();
						
						this.generarReporteProcesoAccionProductoPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Punto VentaS SELECCIONADOS?", "MANTENIMIENTO DE Producto Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoPuntoVenta();
				
						this.actualizarParametrosGeneralProductoPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productopuntoventaReturnGeneral=productopuntoventaLogic.procesarAccionProductoPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productopuntoventaLogic.getProductoPuntoVentas(),this.productopuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoPuntoVenta();
					
					ProductoPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxTiposAccionesFormularioProductoPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoPuntoVenta();
			
			if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
			ProductoPuntoVenta productopuntoventa=new ProductoPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoPuntoVenta.getSelectedItem();
			
			
			
			
			productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(productopuntoventasSeleccionados.size()==1) {
				for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasSeleccionados) {
					productopuntoventa=productopuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoPuntoVenta();
			
      		//this.finishProcessProductoPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoPuntoVentaReturnGeneral() throws Exception {
		if(this.productopuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productopuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productopuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productopuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productopuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoPuntoVenta(false);
		}
		
		if(this.productopuntoventaReturnGeneral.getConRetornoLista() || this.productopuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.productopuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productopuntoventaLogic.setProductoPuntoVentas(this.productopuntoventaReturnGeneral.getProductoPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productopuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productopuntoventaLogic.setProductoPuntoVenta(this.productopuntoventaReturnGeneral.getProductoPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<ProductoPuntoVenta> getProductoPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoPuntoVenta productopuntoventaAux:productopuntoventaLogic.getProductoPuntoVentas()) {
					if(productopuntoventaAux.getIsSelected()) {
						productopuntoventasSeleccionados.add(productopuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoPuntoVenta productopuntoventaAux:this.productopuntoventas) {
					if(productopuntoventaAux.getIsSelected()) {
						productopuntoventasSeleccionados.add(productopuntoventaAux);				
					}
				}
			}
			
			if(productopuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productopuntoventasSeleccionados.addAll(this.productopuntoventaLogic.getProductoPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productopuntoventasSeleccionados.addAll(this.productopuntoventas);				
					}
				}
			}
		} else {
			productopuntoventasSeleccionados.add(this.productopuntoventa);
		}
		
		return productopuntoventasSeleccionados;
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
	
	public void generarReporteProductoPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoPuntoVentasSeleccionados() throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoPuntoVentasSeleccionados() throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoPuntoVentasSeleccionados() throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoPuntoVenta();
		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoPuntoVenta();
		
		
		//this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados ,productopuntoventaImplementable,productopuntoventaImplementableHome);
	}
	
	public void mostrarImportacionProductoPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoPuntoVenta();
		
		this.abrirFrameImportacionProductoPuntoVenta();		
		
			
		//this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados ,productopuntoventaImplementable,productopuntoventaImplementableHome);
	}
	
	public void importarProductoPuntoVentas() throws Exception {		
	
	}
	
	public void exportarProductoPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoPuntoVentasSeleccionados() throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoPuntoVenta(productopuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productopuntoventaAux.setsDetalleGeneralEntityReporte(productopuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productopuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productopuntoventa.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoPuntoVentasSeleccionados() throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoPuntoVenta(row);				
				iRow++;
			}				
			
			for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoPuntoVenta(productopuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoPuntoVentasSeleccionados() throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();		
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productopuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productopuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productopuntoventa");
			//elementRoot.appendChild(element);
		
			for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasSeleccionados) {
				element = document.createElement("productopuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoPuntoVenta(productopuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productopuntoventa.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlProductoPuntoVenta(ProductoPuntoVenta productopuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productopuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productopuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementlinea_descripcion = document.createElement(ProductoPuntoVentaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(productopuntoventa.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProductoPuntoVentaConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(productopuntoventa.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProductoPuntoVentaConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(productopuntoventa.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProductoPuntoVentaConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(productopuntoventa.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoPuntoVentaConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productopuntoventa.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementesta_activo = document.createElement(ProductoPuntoVentaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(productopuntoventa.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoProductoPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados=new ArrayList<ProductoPuntoVenta>();
		
		productopuntoventasSeleccionados=this.getProductoPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoPuntoVenta(productopuntoventasSeleccionados);
		
		this.generarReporteProductoPuntoVentas("Todos",productopuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoPuntoVenta(ArrayList<ProductoPuntoVenta> productopuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoPuntoVenta productopuntoventaAux:productopuntoventasSeleccionados) {
				productopuntoventaAux.setsDetalleGeneralEntityReporte(productopuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					productopuntoventaAux.setsDescripcionGeneralEntityReporte1(productopuntoventaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					productopuntoventaAux.setsDescripcionGeneralEntityReporte1(productopuntoventaAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					productopuntoventaAux.setsDescripcionGeneralEntityReporte1(productopuntoventaAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					productopuntoventaAux.setsDescripcionGeneralEntityReporte1(productopuntoventaAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productopuntoventaAux.setsDescripcionGeneralEntityReporte1(productopuntoventaAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					productopuntoventaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(productopuntoventaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
			this.isVisibilidadCeldaModificarProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
			this.isVisibilidadCeldaModificarProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=true;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
			this.isVisibilidadCeldaModificarProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=true;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=true;
			this.isVisibilidadCeldaModificarProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
			this.isVisibilidadCeldaModificarProductoPuntoVenta=true;
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
			this.isVisibilidadCeldaCancelarProductoPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsProductoPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormProductoPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarProductoPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productopuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosProductoPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!productopuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;												
			}
			
			this.jButtonCerrarProductoPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.productopuntoventa)) {
			this.isVisibilidadCeldaActualizarProductoPuntoVenta=false;
			this.isVisibilidadCeldaEliminarProductoPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsProductoPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionProductoPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoPuntoVenta!=null) {
				this.jScrollPanelDatosProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoPuntoVenta!=null) {
				this.jPanelPaginacionProductoPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
					this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productopuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoPuntoVenta!=null) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoPuntoVenta!=null) {
				this.jPanelParametrosReportesProductoPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaCategoriaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaGrupoProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaMarcaProductoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdProductoProductoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadFK_IdLinea=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaCategoriaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaGrupo;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaGrupoProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaMarcaProductoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdProductoProductoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadFK_IdLinea=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaCategoria;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaCategoriaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaGrupoProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaMarcaProductoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdProductoProductoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadFK_IdLinea=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaCategoriaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaGrupoProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaMarca;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaMarcaProductoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdProductoProductoPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdLinea=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaCategoriaProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaGrupoProductoPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdLineaMarcaProductoPuntoVenta);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoPuntoVenta.remove(jPanelFK_IdProductoProductoPuntoVenta);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoPuntoVentaParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productopuntoventaSessionBean==null) {
				productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productopuntoventaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productopuntoventaFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoPuntoVentaConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoPuntoVenta(true);
			//productoSessionBean.setlidProductoPuntoVentaActual(this.idProductoPuntoVentaActual);

			productopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoPuntoVenta(true);
			productopuntoventaSessionBean.setlIdProductoPuntoVentaActualForeignKey(this.idProductoPuntoVentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoPuntoVentaSessionBean productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		
		if(this.productopuntoventaSessionBean==null) {
			this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		}
		
		this.productopuntoventaSessionBean.setsUltimaBusquedaProductoPuntoVenta(this.getsAccionBusqueda());
		this.productopuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productopuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			productopuntoventaSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLineaCategoria")) {
			productopuntoventaSessionBean.setid_linea_categoria(this.getid_linea_categoriaFK_IdLineaCategoria());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLineaGrupo")) {
			productopuntoventaSessionBean.setid_linea_grupo(this.getid_linea_grupoFK_IdLineaGrupo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLineaMarca")) {
			productopuntoventaSessionBean.setid_linea_marca(this.getid_linea_marcaFK_IdLineaMarca());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productopuntoventaSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoPuntoVentaSessionBean productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		
		if(this.productopuntoventaSessionBean==null) {
			this.productopuntoventaSessionBean=new ProductoPuntoVentaSessionBean();
		}
		
		if(this.productopuntoventaSessionBean.getsUltimaBusquedaProductoPuntoVenta()!=null&&!this.productopuntoventaSessionBean.getsUltimaBusquedaProductoPuntoVenta().equals("")) {
			this.setsAccionBusqueda(productopuntoventaSessionBean.getsUltimaBusquedaProductoPuntoVenta());
			this.setiNumeroPaginacion(productopuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productopuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(productopuntoventaSessionBean.getid_linea());
				productopuntoventaSessionBean.setid_linea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLineaCategoria")) {
				this.setid_linea_categoriaFK_IdLineaCategoria(productopuntoventaSessionBean.getid_linea_categoria());
				productopuntoventaSessionBean.setid_linea_categoria(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLineaGrupo")) {
				this.setid_linea_grupoFK_IdLineaGrupo(productopuntoventaSessionBean.getid_linea_grupo());
				productopuntoventaSessionBean.setid_linea_grupo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLineaMarca")) {
				this.setid_linea_marcaFK_IdLineaMarca(productopuntoventaSessionBean.getid_linea_marca());
				productopuntoventaSessionBean.setid_linea_marca(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productopuntoventaSessionBean.getid_producto());
				productopuntoventaSessionBean.setid_producto(-1L);
			}
		}
		
		this.productopuntoventaSessionBean.setsUltimaBusquedaProductoPuntoVenta("");
		this.productopuntoventaSessionBean.setiNumeroPaginacion(ProductoPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.productopuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioProductoPuntoVenta();
		this.updateVisibilidadBusquedasFormularioProductoPuntoVenta();
		this.updateHabilitarBusquedasFormularioProductoPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoPuntoVenta.getComponents().length>0) {
	

		if(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaProductoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaProductoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaProductoPuntoVenta);
			}
		}

		if(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaCategoriaProductoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaProductoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaCategoriaProductoPuntoVenta);
			}
		}

		if(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaGrupoProductoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoProductoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaGrupoProductoPuntoVenta);
			}
		}

		if(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaMarcaProductoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaProductoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaMarcaProductoPuntoVenta);
			}
		}

		if(this.productopuntoventaConstantesFunciones.resaltarFK_IdProductoProductoPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoProductoPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdProductoProductoPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaProductoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaProductoPuntoVenta);
			if(!this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaProductoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaProductoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaCategoriaProductoPuntoVenta);
			if(!this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaCategoriaProductoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoProductoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaGrupoProductoPuntoVenta);
			if(!this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaGrupoProductoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaProductoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaMarcaProductoPuntoVenta);
			if(!this.productopuntoventaConstantesFunciones.mostrarFK_IdLineaMarcaProductoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoProductoPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productopuntoventaConstantesFunciones.mostrarFK_IdProductoProductoPuntoVenta);
			if(!this.productopuntoventaConstantesFunciones.mostrarFK_IdProductoProductoPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasProductoPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaProductoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopuntoventaConstantesFunciones.activarFK_IdLineaProductoPuntoVenta);
				this.jTabbedPaneBusquedasProductoPuntoVenta.setEnabledAt(index,this.productopuntoventaConstantesFunciones.activarFK_IdLineaProductoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaProductoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopuntoventaConstantesFunciones.activarFK_IdLineaCategoriaProductoPuntoVenta);
				this.jTabbedPaneBusquedasProductoPuntoVenta.setEnabledAt(index,this.productopuntoventaConstantesFunciones.activarFK_IdLineaCategoriaProductoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoProductoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopuntoventaConstantesFunciones.activarFK_IdLineaGrupoProductoPuntoVenta);
				this.jTabbedPaneBusquedasProductoPuntoVenta.setEnabledAt(index,this.productopuntoventaConstantesFunciones.activarFK_IdLineaGrupoProductoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaProductoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopuntoventaConstantesFunciones.activarFK_IdLineaMarcaProductoPuntoVenta);
				this.jTabbedPaneBusquedasProductoPuntoVenta.setEnabledAt(index,this.productopuntoventaConstantesFunciones.activarFK_IdLineaMarcaProductoPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoProductoPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productopuntoventaConstantesFunciones.activarFK_IdProductoProductoPuntoVenta);
				this.jTabbedPaneBusquedasProductoPuntoVenta.setEnabledAt(index,this.productopuntoventaConstantesFunciones.activarFK_IdProductoProductoPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaProductoPuntoVenta);

			this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);

			this.productopuntoventaConstantesFunciones.setResaltarFK_IdLineaProductoPuntoVenta(resaltar);

			jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaProductoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLineaCategoria")) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaProductoPuntoVenta);

			this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);

			this.productopuntoventaConstantesFunciones.setResaltarFK_IdLineaCategoriaProductoPuntoVenta(resaltar);

			jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaCategoriaProductoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLineaGrupo")) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoProductoPuntoVenta);

			this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);

			this.productopuntoventaConstantesFunciones.setResaltarFK_IdLineaGrupoProductoPuntoVenta(resaltar);

			jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaGrupoProductoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLineaMarca")) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaProductoPuntoVenta);

			this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);

			this.productopuntoventaConstantesFunciones.setResaltarFK_IdLineaMarcaProductoPuntoVenta(resaltar);

			jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdLineaMarcaProductoPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoPuntoVenta.indexOfComponent(this.jPanelFK_IdProductoProductoPuntoVenta);

			this.jTabbedPaneBusquedasProductoPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoPuntoVenta.getComponent(index);

			this.productopuntoventaConstantesFunciones.setResaltarFK_IdProductoProductoPuntoVenta(resaltar);

			jPanel.setBorder(this.productopuntoventaConstantesFunciones.resaltarFK_IdProductoProductoPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioProductoPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioProductoPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productopuntoventaConstantesFunciones.resaltaridProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltaridProductoPuntoVenta);}
		if(this.productopuntoventaConstantesFunciones.resaltarid_lineaProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltarid_lineaProductoPuntoVenta);}
		if(this.productopuntoventaConstantesFunciones.resaltarid_linea_grupoProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltarid_linea_grupoProductoPuntoVenta);}
		if(this.productopuntoventaConstantesFunciones.resaltarid_linea_categoriaProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltarid_linea_categoriaProductoPuntoVenta);}
		if(this.productopuntoventaConstantesFunciones.resaltarid_linea_marcaProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltarid_linea_marcaProductoPuntoVenta);}
		if(this.productopuntoventaConstantesFunciones.resaltarid_productoProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltarid_productoProductoPuntoVenta);}
		if(this.productopuntoventaConstantesFunciones.resaltaresta_activoProductoPuntoVenta!=null && this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setBorderPainted(true);this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setBorder(this.productopuntoventaConstantesFunciones.resaltaresta_activoProductoPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostraridProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelidProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostraridProductoPuntoVenta);
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_lineaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelid_lineaProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_lineaProductoPuntoVenta);
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_linea_grupoProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelid_linea_grupoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_linea_grupoProductoPuntoVenta);
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_linea_categoriaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelid_linea_categoriaProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_linea_categoriaProductoPuntoVenta);
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_linea_marcaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelid_linea_marcaProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_linea_marcaProductoPuntoVenta);
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_productoProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelid_productoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_productoProductoPuntoVenta);
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostrarid_productoProductoPuntoVenta);
		//this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostraresta_activoProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jPanelesta_activoProductoPuntoVenta.setVisible(this.productopuntoventaConstantesFunciones.mostraresta_activoProductoPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormProductoPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormProductoPuntoVenta.jLabelidProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activaridProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_lineaProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activarid_lineaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_grupoProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activarid_linea_grupoProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_categoriaProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activarid_linea_categoriaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_linea_marcaProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activarid_linea_marcaProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jComboBoxid_productoProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activarid_productoProductoPuntoVenta);
			this.jInternalFrameDetalleFormProductoPuntoVenta.jButtonid_productoProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activarid_productoProductoPuntoVenta);
		this.jInternalFrameDetalleFormProductoPuntoVenta.jCheckBoxesta_activoProductoPuntoVenta.setEnabled(this.productopuntoventaConstantesFunciones.activaresta_activoProductoPuntoVenta);
		}
	}
	
		
}