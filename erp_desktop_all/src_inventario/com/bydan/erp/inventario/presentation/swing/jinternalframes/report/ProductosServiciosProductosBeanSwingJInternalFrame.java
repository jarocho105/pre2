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

//import com.bydan.erp.inventario.util.ProductosServiciosProductosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProductosServiciosProductosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProductosServiciosProductosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProductosServiciosProductosBean;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductosServiciosProductosBeanSwingJInternalFrame extends ProductosServiciosProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosServiciosProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosServiciosProductos> productosserviciosproductosValidator = new ClassValidator<ProductosServiciosProductos>(ProductosServiciosProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosServiciosProductos productosserviciosproductos;	
	public ProductosServiciosProductos productosserviciosproductosAux;
	public ProductosServiciosProductos productosserviciosproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosServiciosProductos productosserviciosproductosTotales;
	public Long idProductosServiciosProductosActual;
	public Long iIdNuevoProductosServiciosProductos=0L;
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

	public String sFinalQueryComboTipoProductoServicio="";

	public List<TipoProductoServicio> tipoproductoserviciosForeignKey;

	public List<TipoProductoServicio> gettipoproductoserviciosForeignKey() {
		return tipoproductoserviciosForeignKey;
	}

	public void settipoproductoserviciosForeignKey(List<TipoProductoServicio> tipoproductoserviciosForeignKey) {
		this.tipoproductoserviciosForeignKey = tipoproductoserviciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoProductoServicio tipoproductoservicioForeignKey;

	public TipoProductoServicio gettipoproductoservicioForeignKey() {
		return tipoproductoservicioForeignKey;
	}

	public void settipoproductoservicioForeignKey(TipoProductoServicio tipoproductoservicioForeignKey) {
		this.tipoproductoservicioForeignKey = tipoproductoservicioForeignKey;
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
	
	public Boolean isPermisoTodoProductosServiciosProductos;
	public Boolean isPermisoNuevoProductosServiciosProductos;
	public Boolean isPermisoActualizarProductosServiciosProductos;
	public Boolean isPermisoActualizarOriginalProductosServiciosProductos;
	public Boolean isPermisoEliminarProductosServiciosProductos;
	public Boolean isPermisoGuardarCambiosProductosServiciosProductos;
	public Boolean isPermisoConsultaProductosServiciosProductos;
	public Boolean isPermisoBusquedaProductosServiciosProductos;
	public Boolean isPermisoReporteProductosServiciosProductos;
	public Boolean isPermisoPaginacionMedioProductosServiciosProductos;
	public Boolean isPermisoPaginacionAltoProductosServiciosProductos;
	public Boolean isPermisoPaginacionTodoProductosServiciosProductos;
	public Boolean isPermisoCopiarProductosServiciosProductos;
	public Boolean isPermisoVerFormProductosServiciosProductos;
	public Boolean isPermisoDuplicarProductosServiciosProductos;
	public Boolean isPermisoOrdenProductosServiciosProductos;
	
	
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
	
	public ProductosServiciosProductosParameterReturnGeneral productosserviciosproductosReturnGeneral;
	public ProductosServiciosProductosParameterReturnGeneral productosserviciosproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosServiciosProductos=false;
	public Boolean esParaAccionDesdeFormularioProductosServiciosProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosServiciosProductosSessionBeanAdditional productosserviciosproductosSessionBeanAdditional=null;
	
	public ProductosServiciosProductosSessionBeanAdditional getProductosServiciosProductosSessionBeanAdditional() {
		return this.productosserviciosproductosSessionBeanAdditional;
	}
	
	public void setProductosServiciosProductosSessionBeanAdditional(ProductosServiciosProductosSessionBeanAdditional productosserviciosproductosSessionBeanAdditional) {
		try {
			this.productosserviciosproductosSessionBeanAdditional=productosserviciosproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosServiciosProductosBeanSwingJInternalFrameAdditional productosserviciosproductosBeanSwingJInternalFrameAdditional=null;
	//public class ProductosServiciosProductosBeanSwingJInternalFrame
	
	public ProductosServiciosProductosBeanSwingJInternalFrameAdditional getProductosServiciosProductosBeanSwingJInternalFrameAdditional() {
		return this.productosserviciosproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosServiciosProductosBeanSwingJInternalFrameAdditional(ProductosServiciosProductosBeanSwingJInternalFrameAdditional productosserviciosproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.productosserviciosproductosBeanSwingJInternalFrameAdditional=productosserviciosproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosServiciosProductosLogic productosserviciosproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosServiciosProductos productosserviciosproductosBean;
	public ProductosServiciosProductosConstantesFunciones productosserviciosproductosConstantesFunciones;
	//public ProductosServiciosProductosParameterReturnGeneral productosserviciosproductosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public TipoProductoServicioLogic tipoproductoservicioLogic;
	
	//PARAMETROS
	
	
	//public List<ProductosServiciosProductos> productosserviciosproductoss;	
	//public List<ProductosServiciosProductos> productosserviciosproductossEliminados;
	//public List<ProductosServiciosProductos> productosserviciosproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosServiciosProductos=false;
	public Boolean isVisibilidadCeldaDuplicarProductosServiciosProductos=true;
	public Boolean isVisibilidadCeldaCopiarProductosServiciosProductos=true;
	public Boolean isVisibilidadCeldaVerFormProductosServiciosProductos=true;
	public Boolean isVisibilidadCeldaOrdenProductosServiciosProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
	public Boolean isVisibilidadCeldaModificarProductosServiciosProductos=false;
	public Boolean isVisibilidadCeldaActualizarProductosServiciosProductos=false;
	public Boolean isVisibilidadCeldaEliminarProductosServiciosProductos=false;
	public Boolean isVisibilidadCeldaCancelarProductosServiciosProductos=false;
	public Boolean isVisibilidadCeldaGuardarProductosServiciosProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosServiciosProductos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoProductoServicio=false;
	
	public Long getiIdNuevoProductosServiciosProductos() {
		return this.iIdNuevoProductosServiciosProductos;
	}

	public void setiIdNuevoProductosServiciosProductos(Long iIdNuevoProductosServiciosProductos) {
		this.iIdNuevoProductosServiciosProductos = iIdNuevoProductosServiciosProductos;
	}
	
	public Long getidProductosServiciosProductosActual() {
		return this.idProductosServiciosProductosActual;
	}

	public void setidProductosServiciosProductosActual(Long idProductosServiciosProductosActual) {
		this.idProductosServiciosProductosActual = idProductosServiciosProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosServiciosProductos getproductosserviciosproductos() {
		return this.productosserviciosproductos;
	}

	public void setproductosserviciosproductos(ProductosServiciosProductos productosserviciosproductos) {
		this.productosserviciosproductos = productosserviciosproductos;
	}
	
	public ProductosServiciosProductos getproductosserviciosproductosAux() {
		return this.productosserviciosproductosAux;
	}

	public void setproductosserviciosproductosAux(ProductosServiciosProductos productosserviciosproductosAux) {
		this.productosserviciosproductosAux = productosserviciosproductosAux;
	}				
	
	public ProductosServiciosProductos getproductosserviciosproductosAnterior() {
		return this.productosserviciosproductosAnterior;
	}

	public void setproductosserviciosproductosAnterior(ProductosServiciosProductos productosserviciosproductosAnterior) {
		this.productosserviciosproductosAnterior = productosserviciosproductosAnterior;
	}	
	
	public ProductosServiciosProductos getproductosserviciosproductosTotales() {
		return this.productosserviciosproductosTotales;
	}

	public void setproductosserviciosproductosTotales(ProductosServiciosProductos productosserviciosproductosTotales) {
		this.productosserviciosproductosTotales = productosserviciosproductosTotales;
	}	
	
	public ProductosServiciosProductos getproductosserviciosproductosBean() {
		return this.productosserviciosproductosBean;
	}

	public void setproductosserviciosproductosBean(ProductosServiciosProductos productosserviciosproductosBean) {
		this.productosserviciosproductosBean = productosserviciosproductosBean;
	}	
	
	public ProductosServiciosProductosParameterReturnGeneral getproductosserviciosproductosReturnGeneral() {
		return this.productosserviciosproductosReturnGeneral;
	}

	public void setproductosserviciosproductosReturnGeneral(ProductosServiciosProductosParameterReturnGeneral productosserviciosproductosReturnGeneral) {
		this.productosserviciosproductosReturnGeneral = productosserviciosproductosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProductosServiciosProductos=-1L;

	public Long getid_bodegaBusquedaProductosServiciosProductos() {
		return this.id_bodegaBusquedaProductosServiciosProductos;
	}

	public void setid_bodegaBusquedaProductosServiciosProductos(Long id_bodegaBusquedaProductosServiciosProductos) {
		this.id_bodegaBusquedaProductosServiciosProductos = id_bodegaBusquedaProductosServiciosProductos;
	}

;
	public Long id_lineaBusquedaProductosServiciosProductos=-1L;

	public Long getid_lineaBusquedaProductosServiciosProductos() {
		return this.id_lineaBusquedaProductosServiciosProductos;
	}

	public void setid_lineaBusquedaProductosServiciosProductos(Long id_lineaBusquedaProductosServiciosProductos) {
		this.id_lineaBusquedaProductosServiciosProductos = id_lineaBusquedaProductosServiciosProductos;
	}

;
	public Long id_linea_grupoBusquedaProductosServiciosProductos=-1L;

	public Long getid_linea_grupoBusquedaProductosServiciosProductos() {
		return this.id_linea_grupoBusquedaProductosServiciosProductos;
	}

	public void setid_linea_grupoBusquedaProductosServiciosProductos(Long id_linea_grupoBusquedaProductosServiciosProductos) {
		this.id_linea_grupoBusquedaProductosServiciosProductos = id_linea_grupoBusquedaProductosServiciosProductos;
	}

;
	public Long id_linea_categoriaBusquedaProductosServiciosProductos=-1L;

	public Long getid_linea_categoriaBusquedaProductosServiciosProductos() {
		return this.id_linea_categoriaBusquedaProductosServiciosProductos;
	}

	public void setid_linea_categoriaBusquedaProductosServiciosProductos(Long id_linea_categoriaBusquedaProductosServiciosProductos) {
		this.id_linea_categoriaBusquedaProductosServiciosProductos = id_linea_categoriaBusquedaProductosServiciosProductos;
	}

;
	public Long id_linea_marcaBusquedaProductosServiciosProductos=-1L;

	public Long getid_linea_marcaBusquedaProductosServiciosProductos() {
		return this.id_linea_marcaBusquedaProductosServiciosProductos;
	}

	public void setid_linea_marcaBusquedaProductosServiciosProductos(Long id_linea_marcaBusquedaProductosServiciosProductos) {
		this.id_linea_marcaBusquedaProductosServiciosProductos = id_linea_marcaBusquedaProductosServiciosProductos;
	}

;
	public Long id_tipo_producto_servicioBusquedaProductosServiciosProductos=-1L;

	public Long getid_tipo_producto_servicioBusquedaProductosServiciosProductos() {
		return this.id_tipo_producto_servicioBusquedaProductosServiciosProductos;
	}

	public void setid_tipo_producto_servicioBusquedaProductosServiciosProductos(Long id_tipo_producto_servicioBusquedaProductosServiciosProductos) {
		this.id_tipo_producto_servicioBusquedaProductosServiciosProductos = id_tipo_producto_servicioBusquedaProductosServiciosProductos;
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

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_producto_servicioFK_IdTipoProductoServicio=-1L;

	public Long getid_tipo_producto_servicioFK_IdTipoProductoServicio() {
		return this.id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

	public void setid_tipo_producto_servicioFK_IdTipoProductoServicio(Long id_tipo_producto_servicioFK_IdTipoProductoServicio) {
		this.id_tipo_producto_servicioFK_IdTipoProductoServicio = id_tipo_producto_servicioFK_IdTipoProductoServicio;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductosServiciosProductosLogic getProductosServiciosProductosLogic()	{		
		return productosserviciosproductosLogic;
	}

	public void setProductosServiciosProductosLogic(ProductosServiciosProductosLogic productosserviciosproductosLogic) {
		this.productosserviciosproductosLogic = productosserviciosproductosLogic;
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
	
	public Boolean getIsEsNuevoProductosServiciosProductos() {
		return isEsNuevoProductosServiciosProductos;
	}

	public void setIsEsNuevoProductosServiciosProductos(Boolean isEsNuevoProductosServiciosProductos) {
		this.isEsNuevoProductosServiciosProductos = isEsNuevoProductosServiciosProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosServiciosProductos() {
		return esParaAccionDesdeFormularioProductosServiciosProductos;
	}
	
	public void setEsParaAccionDesdeFormularioProductosServiciosProductos(Boolean esParaAccionDesdeFormularioProductosServiciosProductos) {
		this.esParaAccionDesdeFormularioProductosServiciosProductos = esParaAccionDesdeFormularioProductosServiciosProductos;
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

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidEmpresaActual());
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

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidSucursalActual());
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

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidBodegaActual());
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

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

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
					lineaLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidLineaActual());
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

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidLineaGrupoActual());
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

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidLineaCategoriaActual());
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

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidLineaMarcaActual());
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

	public void cargarCombosTipoProductoServiciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoProductoServicioLogic tipoproductoservicioLogic=new TipoProductoServicioLogic();

			//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoproductoservicioLogic.getTipoProductoServicioDataAccess().setIsForForeingKeyData(true);

					tipoproductoservicioLogic.getTodosTipoProductoServiciosWithConnection(sFinalQuery,new Pagination());

					this.tipoproductoserviciosForeignKey=tipoproductoservicioLogic.getTipoProductoServicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoProductoServicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoproductoservicioLogic.getEntityWithConnection(productosserviciosproductosSessionBean.getlidTipoProductoServicioActual());
					this.tipoproductoserviciosForeignKey.add(tipoproductoservicioLogic.getTipoProductoServicio());
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosServiciosProductos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_empresaProductosServiciosProductosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosServiciosProductosGenerico!=null && jComboBoxid_empresaProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosServiciosProductosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductosServiciosProductos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_sucursalProductosServiciosProductosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosServiciosProductosGenerico!=null && jComboBoxid_sucursalProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosServiciosProductosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductosServiciosProductos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
						jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
							//jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_bodegaProductosServiciosProductosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductosServiciosProductosGenerico!=null && jComboBoxid_bodegaProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductosServiciosProductosGenerico.setSelectedIndex(0);
				}
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProductosServiciosProductos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
						jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
							//jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_lineaProductosServiciosProductosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProductosServiciosProductosGenerico!=null && jComboBoxid_lineaProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_lineaProductosServiciosProductosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProductosServiciosProductos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
						jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
							//jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_linea_grupoProductosServiciosProductosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProductosServiciosProductosGenerico!=null && jComboBoxid_linea_grupoProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProductosServiciosProductosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProductosServiciosProductos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
						jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
							//jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProductosServiciosProductosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProductosServiciosProductosGenerico!=null && jComboBoxid_linea_categoriaProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProductosServiciosProductosGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProductosServiciosProductos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
						jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
							//jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProductosServiciosProductosGenerico)throws Exception
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
				jComboBoxid_linea_marcaProductosServiciosProductosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProductosServiciosProductosGenerico!=null && jComboBoxid_linea_marcaProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProductosServiciosProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoProductoServicioForeignKey(Long idTipoProductoServicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoproductoservicioTemp!=null) {

					if(this.productosserviciosproductos!=null) {
						this.productosserviciosproductos.setTipoProductoServicio(tipoproductoservicioTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setSelectedItem(tipoproductoservicioTemp);
					}
				} else {
					//jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setSelectedItem(tipoproductoservicioTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoservicioTemp!=null && jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
						jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(tipoproductoservicioTemp);
					} else {
						if(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
							//jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(tipoproductoservicioTemp);
							if(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.getItemCount()>0) {
								jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(0);
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

	public String getActualTipoProductoServicioForeignKeyDescripcion(Long idTipoProductoServicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}


			sDescripcion=TipoProductoServicioConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoProductoServicioForeignKeyGenerico(Long idTipoProductoServicioSeleccionado,JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioTemp=null;

			for(TipoProductoServicio tipoproductoservicioAux:tipoproductoserviciosForeignKey) {
				if(tipoproductoservicioAux.getId()!=null && tipoproductoservicioAux.getId().equals(idTipoProductoServicioSeleccionado)) {
					tipoproductoservicioTemp=tipoproductoservicioAux;
					break;
				}
			}

			if(tipoproductoservicioTemp!=null) {
				jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico.setSelectedItem(tipoproductoservicioTemp);
			} else {
				if(jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico!=null && jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_empresaProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosServiciosProductosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productosserviciosproductos.setid_empresa(empresaAux.getId());
				productosserviciosproductos.setempresa_descripcion(ProductosServiciosProductosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productosserviciosproductos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_sucursalProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosServiciosProductosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productosserviciosproductos.setid_sucursal(sucursalAux.getId());
				productosserviciosproductos.setsucursal_descripcion(ProductosServiciosProductosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productosserviciosproductos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_bodegaProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductosServiciosProductosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productosserviciosproductos.setid_bodega(bodegaAux.getId());
				productosserviciosproductos.setbodega_descripcion(ProductosServiciosProductosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productosserviciosproductos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_lineaProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProductosServiciosProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosproductos.setid_linea(lineaAux.getId());
				productosserviciosproductos.setlinea_descripcion(ProductosServiciosProductosConstantesFunciones.getLineaDescripcion(lineaAux));
				productosserviciosproductos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_linea_grupoProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProductosServiciosProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosproductos.setid_linea_grupo(lineaAux.getId());
				productosserviciosproductos.setlineagrupo_descripcion(ProductosServiciosProductosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				productosserviciosproductos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_linea_categoriaProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProductosServiciosProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosproductos.setid_linea_categoria(lineaAux.getId());
				productosserviciosproductos.setlineacategoria_descripcion(ProductosServiciosProductosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				productosserviciosproductos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_linea_marcaProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProductosServiciosProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosproductos.setid_linea_marca(lineaAux.getId());
				productosserviciosproductos.setlineamarca_descripcion(ProductosServiciosProductosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				productosserviciosproductos.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoServicioForeignKey(ProductosServiciosProductos productosserviciosproductos,JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioAux=new TipoProductoServicio();

			if(jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico==null) {
				tipoproductoservicioAux=(TipoProductoServicio)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getSelectedItem();
			} else {
				tipoproductoservicioAux=(TipoProductoServicio)jComboBoxid_tipo_producto_servicioProductosServiciosProductosGenerico.getSelectedItem();
			}

			if(tipoproductoservicioAux!=null && tipoproductoservicioAux.getId()!=null) {
				productosserviciosproductos.setid_tipo_producto_servicio(tipoproductoservicioAux.getId());
				productosserviciosproductos.settipoproductoservicio_descripcion(ProductosServiciosProductosConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioAux));
				productosserviciosproductos.setTipoProductoServicio(tipoproductoservicioAux);			}
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

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.addItem(bodega);
							}
						}

						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.addItem(linea);
							}
						}

						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.addItem(lineagrupo);
							}
						}

						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.addItem(lineacategoria);
							}
						}

						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.addItem(lineamarca);
							}
						}

						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoProductoServiciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoProductoServicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.addItem(tipoproductoservicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { 
					}

					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.addItem(tipoproductoservicio);
							}
						}

						if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoProductoServicioForeignKey(TipoProductoServicio tipoproductoservicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setSelectedItem(tipoproductoservicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedItem(tipoproductoservicio);
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductosServiciosProductos() throws Exception {
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
		
	public ProductosServiciosProductosParameterReturnGeneral getProductosServiciosProductosParameterGeneral() {
		return this.productosserviciosproductosParameterGeneral;
	}
	
	public void setProductosServiciosProductosParameterGeneral(ProductosServiciosProductosParameterReturnGeneral productosserviciosproductosParameterGeneral) {
		this.productosserviciosproductosParameterGeneral = productosserviciosproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosServiciosProductos() {
		return isPermisoTodoProductosServiciosProductos;
	}

	public void setIsPermisoTodoProductosServiciosProductos(Boolean isPermisoTodoProductosServiciosProductos) {
		this.isPermisoTodoProductosServiciosProductos = isPermisoTodoProductosServiciosProductos;
	}

	public Boolean getIsPermisoNuevoProductosServiciosProductos() {
		return isPermisoNuevoProductosServiciosProductos;
	}

	public void setIsPermisoNuevoProductosServiciosProductos(Boolean isPermisoNuevoProductosServiciosProductos) {
		this.isPermisoNuevoProductosServiciosProductos = isPermisoNuevoProductosServiciosProductos;
	}

	public Boolean getIsPermisoActualizarProductosServiciosProductos() {
		return isPermisoActualizarProductosServiciosProductos;
	}

	public void setIsPermisoActualizarProductosServiciosProductos(Boolean isPermisoActualizarProductosServiciosProductos) {
		this.isPermisoActualizarProductosServiciosProductos = isPermisoActualizarProductosServiciosProductos;
	}

	public Boolean getIsPermisoEliminarProductosServiciosProductos() {
		return isPermisoEliminarProductosServiciosProductos;
	}

	public void setIsPermisoEliminarProductosServiciosProductos(Boolean isPermisoEliminarProductosServiciosProductos) {
		this.isPermisoEliminarProductosServiciosProductos = isPermisoEliminarProductosServiciosProductos;
	}

	public Boolean getIsPermisoGuardarCambiosProductosServiciosProductos() {
		return isPermisoGuardarCambiosProductosServiciosProductos;
	}

	public void setIsPermisoGuardarCambiosProductosServiciosProductos(Boolean isPermisoGuardarCambiosProductosServiciosProductos) {
		this.isPermisoGuardarCambiosProductosServiciosProductos = isPermisoGuardarCambiosProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoConsultaProductosServiciosProductos() {
		return isPermisoConsultaProductosServiciosProductos;
	}

	public void setIsPermisoConsultaProductosServiciosProductos(Boolean isPermisoConsultaProductosServiciosProductos) {
		this.isPermisoConsultaProductosServiciosProductos = isPermisoConsultaProductosServiciosProductos;
	}

	public Boolean getIsPermisoBusquedaProductosServiciosProductos() {
		return isPermisoBusquedaProductosServiciosProductos;
	}

	public void setIsPermisoBusquedaProductosServiciosProductos(Boolean isPermisoBusquedaProductosServiciosProductos) {
		this.isPermisoBusquedaProductosServiciosProductos = isPermisoBusquedaProductosServiciosProductos;
	}

	public Boolean getIsPermisoReporteProductosServiciosProductos() {
		return isPermisoReporteProductosServiciosProductos;
	}

	public void setIsPermisoReporteProductosServiciosProductos(Boolean isPermisoReporteProductosServiciosProductos) {
		this.isPermisoReporteProductosServiciosProductos = isPermisoReporteProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosServiciosProductos() {
		return isPermisoPaginacionMedioProductosServiciosProductos;
	}

	public void setIsPermisoPaginacionMedioProductosServiciosProductos(Boolean isPermisoPaginacionMedioProductosServiciosProductos) {
		this.isPermisoPaginacionMedioProductosServiciosProductos = isPermisoPaginacionMedioProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosServiciosProductos() {
		return isPermisoPaginacionTodoProductosServiciosProductos;
	}

	public void setIsPermisoPaginacionTodoProductosServiciosProductos(Boolean isPermisoPaginacionTodoProductosServiciosProductos) {
		this.isPermisoPaginacionTodoProductosServiciosProductos = isPermisoPaginacionTodoProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosServiciosProductos() {
		return isPermisoPaginacionAltoProductosServiciosProductos;
	}

	public void setIsPermisoPaginacionAltoProductosServiciosProductos(Boolean isPermisoPaginacionAltoProductosServiciosProductos) {
		this.isPermisoPaginacionAltoProductosServiciosProductos = isPermisoPaginacionAltoProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoCopiarProductosServiciosProductos() {
		return isPermisoCopiarProductosServiciosProductos;
	}

	public void setIsPermisoCopiarProductosServiciosProductos(Boolean isPermisoCopiarProductosServiciosProductos) {
		this.isPermisoCopiarProductosServiciosProductos = isPermisoCopiarProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoVerFormProductosServiciosProductos() {
		return isPermisoVerFormProductosServiciosProductos;
	}

	public void setIsPermisoVerFormProductosServiciosProductos(Boolean isPermisoVerFormProductosServiciosProductos) {
		this.isPermisoVerFormProductosServiciosProductos = isPermisoVerFormProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoDuplicarProductosServiciosProductos() {
		return isPermisoDuplicarProductosServiciosProductos;
	}

	public void setIsPermisoDuplicarProductosServiciosProductos(Boolean isPermisoDuplicarProductosServiciosProductos) {
		this.isPermisoDuplicarProductosServiciosProductos = isPermisoDuplicarProductosServiciosProductos;
	}
	
	public Boolean getIsPermisoOrdenProductosServiciosProductos() {
		return isPermisoOrdenProductosServiciosProductos;
	}

	public void setIsPermisoOrdenProductosServiciosProductos(Boolean isPermisoOrdenProductosServiciosProductos) {
		this.isPermisoOrdenProductosServiciosProductos = isPermisoOrdenProductosServiciosProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosServiciosProductos() {
		return isVisibilidadCeldaNuevoProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaNuevoProductosServiciosProductos(Boolean isVisibilidadCeldaNuevoProductosServiciosProductos) {
		this.isVisibilidadCeldaNuevoProductosServiciosProductos = isVisibilidadCeldaNuevoProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosServiciosProductos() {
		return isVisibilidadCeldaDuplicarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaDuplicarProductosServiciosProductos(Boolean isVisibilidadCeldaDuplicarProductosServiciosProductos) {
		this.isVisibilidadCeldaDuplicarProductosServiciosProductos = isVisibilidadCeldaDuplicarProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosServiciosProductos() {
		return isVisibilidadCeldaCopiarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaCopiarProductosServiciosProductos(Boolean isVisibilidadCeldaCopiarProductosServiciosProductos) {
		this.isVisibilidadCeldaCopiarProductosServiciosProductos = isVisibilidadCeldaCopiarProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosServiciosProductos() {
		return isVisibilidadCeldaVerFormProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaVerFormProductosServiciosProductos(Boolean isVisibilidadCeldaVerFormProductosServiciosProductos) {
		this.isVisibilidadCeldaVerFormProductosServiciosProductos = isVisibilidadCeldaVerFormProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosServiciosProductos() {
		return isVisibilidadCeldaOrdenProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaOrdenProductosServiciosProductos(Boolean isVisibilidadCeldaOrdenProductosServiciosProductos) {
		this.isVisibilidadCeldaOrdenProductosServiciosProductos = isVisibilidadCeldaOrdenProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosServiciosProductos() {
		return isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosServiciosProductos(Boolean isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos) {
		this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos = isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosServiciosProductos() {
		return isVisibilidadCeldaModificarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaModificarProductosServiciosProductos(Boolean isVisibilidadCeldaModificarProductosServiciosProductos) {
		this.isVisibilidadCeldaModificarProductosServiciosProductos = isVisibilidadCeldaModificarProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosServiciosProductos() {
		return isVisibilidadCeldaActualizarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaActualizarProductosServiciosProductos(Boolean isVisibilidadCeldaActualizarProductosServiciosProductos) {
		this.isVisibilidadCeldaActualizarProductosServiciosProductos = isVisibilidadCeldaActualizarProductosServiciosProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosServiciosProductos() {
		return isVisibilidadCeldaEliminarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaEliminarProductosServiciosProductos(Boolean isVisibilidadCeldaEliminarProductosServiciosProductos) {
		this.isVisibilidadCeldaEliminarProductosServiciosProductos = isVisibilidadCeldaEliminarProductosServiciosProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosServiciosProductos() {
		return isVisibilidadCeldaCancelarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaCancelarProductosServiciosProductos(Boolean isVisibilidadCeldaCancelarProductosServiciosProductos) {
		this.isVisibilidadCeldaCancelarProductosServiciosProductos = isVisibilidadCeldaCancelarProductosServiciosProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosServiciosProductos() {
		return isVisibilidadCeldaGuardarProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaGuardarProductosServiciosProductos(Boolean isVisibilidadCeldaGuardarProductosServiciosProductos) {
		this.isVisibilidadCeldaGuardarProductosServiciosProductos = isVisibilidadCeldaGuardarProductosServiciosProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosServiciosProductos() {
		return isVisibilidadCeldaGuardarCambiosProductosServiciosProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosServiciosProductos(Boolean isVisibilidadCeldaGuardarCambiosProductosServiciosProductos) {
		this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos = isVisibilidadCeldaGuardarCambiosProductosServiciosProductos;
	}
		
	public ProductosServiciosProductosSessionBean getproductosserviciosproductosSessionBean() {
		return this.productosserviciosproductosSessionBean;
	}
	
	public void setproductosserviciosproductosSessionBean(ProductosServiciosProductosSessionBean productosserviciosproductosSessionBean) {
		this.productosserviciosproductosSessionBean=productosserviciosproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosServiciosProductos() {
		return this.isVisibilidadBusquedaProductosServiciosProductos;
	}

	public void setisVisibilidadBusquedaProductosServiciosProductos(Boolean isVisibilidadBusquedaProductosServiciosProductos) {
		this.isVisibilidadBusquedaProductosServiciosProductos=isVisibilidadBusquedaProductosServiciosProductos;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoProductoServicio() {
		return this.isVisibilidadFK_IdTipoProductoServicio;
	}

	public void setisVisibilidadFK_IdTipoProductoServicio(Boolean isVisibilidadFK_IdTipoProductoServicio) {
		this.isVisibilidadFK_IdTipoProductoServicio=isVisibilidadFK_IdTipoProductoServicio;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarSucursalForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarBodegaForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarLineaForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(productosserviciosproductos,null);
				this.setActualParaGuardarTipoProductoServicioForeignKey(productosserviciosproductos,null);
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
	
	public void bugActualizarReferenciaActual(ProductosServiciosProductos productosserviciosproductos,ProductosServiciosProductos productosserviciosproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosServiciosProductos(productosserviciosproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosserviciosproductosAux.setId(productosserviciosproductos.getId());
		productosserviciosproductosAux.setVersionRow(productosserviciosproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosServiciosProductos productosserviciosproductosLocal) throws Exception {
		
		if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosServiciosProductos productosserviciosproductosLocal) throws Exception {	
		if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosserviciosproductosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosserviciosproductosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productosserviciosproductosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				productosserviciosproductosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				productosserviciosproductosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				productosserviciosproductosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				productosserviciosproductosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoServicioDetalleFormJInternalFrame.class)) {
				TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrameLocal=(TipoProductoServicioBeanSwingJInternalFrame) ((TipoProductoServicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoservicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.gettipoproductoservicio(),true);
				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio,this.tipoproductoserviciosForeignKey);

				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				productosserviciosproductosLocal.setTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey("Formulario");
				this.setActualTipoProductoServicioForeignKey(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosServiciosProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosserviciosproductosValidator.getInvalidValues(this.productosserviciosproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosServiciosProductos productosserviciosproductos,List<ProductosServiciosProductos> productosserviciosproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosServiciosProductos productosserviciosproductos,List<ProductosServiciosProductos> productosserviciosproductoss) throws Exception {
		try	{			
			ProductosServiciosProductosConstantesFunciones.actualizarSelectedLista(productosserviciosproductos,productosserviciosproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosServiciosProductos> productosserviciosproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productosserviciosproductossLocal=this.productosserviciosproductosLogic.getProductosServiciosProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productosserviciosproductossLocal=this.productosserviciosproductoss;
			}
			//ARCHITECTURE
		
			for(ProductosServiciosProductos productosserviciosproductosLocal:productosserviciosproductossLocal) {
				if(this.permiteMantenimiento(productosserviciosproductosLocal) && productosserviciosproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosServiciosProductosConstantesFunciones.getProductosServiciosProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_sucursalProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_lineaProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_grupoProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_categoriaProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_marcaProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelcodigoProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombreProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBRETIPOPRODUCTOSERVICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_tipo_producto_servicioProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_bodegaProductosServiciosProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosProductosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_unidadProductosServiciosProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_sucursalProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_lineaProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_grupoProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_categoriaProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_marcaProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelcodigoProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombreProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_tipo_producto_servicioProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_bodegaProductosServiciosProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_unidadProductosServiciosProductos,"");
		
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
		this.iIdNuevoProductosServiciosProductos--;	
		
		
		this.productosserviciosproductosAux=new ProductosServiciosProductos();
		
		this.productosserviciosproductosAux.setId(this.iIdNuevoProductosServiciosProductos);
		this.productosserviciosproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosserviciosproductosLogic.getProductosServiciosProductoss().add(this.productosserviciosproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productosserviciosproductoss.add(this.productosserviciosproductosAux);
		}
		//ARCHITECTURE
		
		this.productosserviciosproductos=this.productosserviciosproductosAux;
		
		if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosProductos(this.productosserviciosproductos);
		}
				
		//this.setDefaultControlesProductosServiciosProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosServiciosProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosServiciosProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosServiciosProductos(this.productosserviciosproductosBean,this.productosserviciosproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosServiciosProductos(this.productosserviciosproductosReturnGeneral,this.productosserviciosproductosBean,false);
		
		if(this.productosserviciosproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosProductos(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos());
		}
		
		if(this.productosserviciosproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos(),classes);//this.productosserviciosproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosServiciosProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosServiciosProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.RecargarFormProductosServiciosProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosServiciosProductos(false);
						
			if(productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosProductos();
			}
			
			this.actualizarVisualTableDatosProductosServiciosProductos();
			
			this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosProductos(), this.getIndiceNuevoProductosServiciosProductos());
			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
						
			this.actualizarEstadoCeldasBotonesProductosServiciosProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosServiciosProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_sucursalProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_lineaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_linea_grupoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_linea_categoriaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_linea_marcaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarcodigoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombreProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_bodegaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarnombre_unidadProductosServiciosProductos);	
		//
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_empresaProductosServiciosProductos);//
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_sucursalProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_bodegaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_lineaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_linea_grupoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_linea_categoriaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_linea_marcaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setEnabled(isHabilitar && this.productosserviciosproductosConstantesFunciones.activarid_tipo_producto_servicioProductosServiciosProductos);
	};
	
	public void setDefaultControlesProductosServiciosProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosServiciosProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosserviciosproductosSessionBean.setConGuardarRelaciones(true);			
			this.productosserviciosproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.setVisible(true);
			
					
		} else {
			//this.productosserviciosproductosSessionBean.setConGuardarRelaciones(false);			
			this.productosserviciosproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosServiciosProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
				if(productosserviciosproductosAux.getId().equals(this.iIdNuevoProductosServiciosProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductoss) {
				if(productosserviciosproductosAux.getId().equals(this.iIdNuevoProductosServiciosProductos)) {
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
	
	public int getIndiceActualProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
				if(productosserviciosproductosAux.getId().equals(productosserviciosproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductoss) {
				if(productosserviciosproductosAux.getId().equals(productosserviciosproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
				if(productosserviciosproductosAux.getProductosServiciosProductosOriginal().getId().equals(productosserviciosproductosOriginal.getId())) {
					existe=true;
					productosserviciosproductosOriginal.setId(productosserviciosproductosAux.getId());
					productosserviciosproductosOriginal.setVersionRow(productosserviciosproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductoss) {
				if(productosserviciosproductosAux.getProductosServiciosProductosOriginal().getId().equals(productosserviciosproductosOriginal.getId())) {
					existe=true;
					productosserviciosproductosOriginal.setId(productosserviciosproductosAux.getId());
					productosserviciosproductosOriginal.setVersionRow(productosserviciosproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosServiciosProductos(Boolean esParaCancelar) throws Exception {
		productosserviciosproductossAux=new ArrayList<ProductosServiciosProductos>();
		productosserviciosproductosAux=new ProductosServiciosProductos();
		
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
					if(productosserviciosproductosAux.getId()<0) {
						productosserviciosproductossAux.add(productosserviciosproductosAux);
					}		
				}
				this.iIdNuevoProductosServiciosProductos=0L;
				this.productosserviciosproductosLogic.getProductosServiciosProductoss().removeAll(productosserviciosproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductoss) {
					if(productosserviciosproductosAux.getId()<0) {
						productosserviciosproductossAux.add(productosserviciosproductosAux);
					}		
				}
				this.iIdNuevoProductosServiciosProductos=0L;
				this.productosserviciosproductoss.removeAll(productosserviciosproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosServiciosProductos 
					&& this.productosserviciosproductosLogic.getProductosServiciosProductoss().size()>0
					) {
					productosserviciosproductosAux=this.productosserviciosproductosLogic.getProductosServiciosProductoss().get(this.productosserviciosproductosLogic.getProductosServiciosProductoss().size() - 1);
				
					if(productosserviciosproductosAux.getId()<0) {
						this.productosserviciosproductosLogic.getProductosServiciosProductoss().remove(productosserviciosproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosServiciosProductos && this.productosserviciosproductoss.size()>0) {
					productosserviciosproductosAux=this.productosserviciosproductoss.get(this.productosserviciosproductoss.size() - 1);
				
					if(productosserviciosproductosAux.getId()<0) {
						this.productosserviciosproductoss.remove(productosserviciosproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosServiciosProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productosserviciosproductos.getId()<0) {
				this.productosserviciosproductosLogic.getProductosServiciosProductoss().remove(this.productosserviciosproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productosserviciosproductos.getId()<0) {
				this.productosserviciosproductoss.remove(this.productosserviciosproductos);
			}
		}			
	}
	
	public void setEstadosInicialesProductosServiciosProductos(List<ProductosServiciosProductos> productosserviciosproductossAux) throws Exception {
		ProductosServiciosProductosConstantesFunciones.setEstadosInicialesProductosServiciosProductos(productosserviciosproductossAux);
	}
	
	public void setEstadosInicialesProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductosAux) throws Exception {
		ProductosServiciosProductosConstantesFunciones.setEstadosInicialesProductosServiciosProductos(productosserviciosproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosServiciosProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosServiciosProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosServiciosProductosActual()) {
				if(!this.isEsNuevoProductosServiciosProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosServiciosProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosServiciosProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosServiciosProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Servicios Productos ?", "MANTENIMIENTO DE Productos Servicios Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosServiciosProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosServiciosProductos productosserviciosproductos) throws Exception {
		ProductosServiciosProductosConstantesFunciones.seleccionarAsignar(this.productosserviciosproductos,productosserviciosproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosServiciosProductos=this.isPermisoActualizarOriginalProductosServiciosProductos;
			
			
			this.seleccionarAsignar(productosserviciosproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosServiciosProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosserviciosproductosSessionBean.setsFuncionBusquedaRapida(this.productosserviciosproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosServiciosProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosServiciosProductos(esParaCancelar);				
				this.cancelarNuevoProductosServiciosProductos(esParaCancelar);								
			}
			
			this.productosserviciosproductos=new ProductosServiciosProductos();
			
			this.inicializarProductosServiciosProductos();
			
			this.actualizarEstadoCeldasBotonesProductosServiciosProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosServiciosProductos() throws Exception {
		try {
			ProductosServiciosProductosConstantesFunciones.inicializarProductosServiciosProductos(this.productosserviciosproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosserviciosproductosLogic.getProductosServiciosProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosServiciosProductoss(String sAccionBusqueda,List<ProductosServiciosProductos> productosserviciosproductossParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosServiciosProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosServiciosProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosServiciosProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosServiciosProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Servicios Productoses");		
		parameters.put("busquedapor", ProductosServiciosProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosServiciosProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosServiciosProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosServiciosProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosServiciosProductos=new JRBeanArrayDataSource(ProductosServiciosProductosJInternalFrame.TraerProductosServiciosProductosBeans(productosserviciosproductossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosServiciosProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosServiciosProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosServiciosProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosServiciosProductosBean.TraerProductosServiciosProductosBeans(productosserviciosproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosServiciosProductoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciosproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosServiciosProductoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciosproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductosActionPerformed(null);
					//this.generarExcelReporteProductosServiciosProductoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciosproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosServiciosProductoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciosproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosServiciosProductoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciosproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosServiciosProductoss(sAccionBusqueda,sTipoArchivoReporte,productosserviciosproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosServiciosProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosProductos> productosserviciosproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosServiciosProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosServiciosProductos productosserviciosproductos : productosserviciosproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosServiciosProductosConstantesFunciones.generarExcelReporteDataProductosServiciosProductos("NORMAL",row,workbook,productosserviciosproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosServiciosProductos(String sTipo,Row row,Workbook workbook) {
		
		ProductosServiciosProductosConstantesFunciones.generarExcelReporteHeaderProductosServiciosProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosServiciosProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosProductos> productosserviciosproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosServiciosProductos productosserviciosproductos : productosserviciosproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosServiciosProductosConstantesFunciones.getProductosServiciosProductosDescripcion(productosserviciosproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.gettipoproductoservicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_tipo_producto_servicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosproductos.getnombre_unidad());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosServiciosProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosProductos> productosserviciosproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosServiciosProductos> productosserviciosproductossRespaldo=null;
		
		classes=ProductosServiciosProductosConstantesFunciones.getClassesRelationshipsOfProductosServiciosProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosserviciosproductosLogic.setDatosCliente(this.datosCliente);
		this.productosserviciosproductosLogic.setDatosDeep(this.datosDeep);
		this.productosserviciosproductosLogic.setIsConDeep(true);
		
		productosserviciosproductossRespaldo=this.productosserviciosproductosLogic.getProductosServiciosProductoss();
		
		this.productosserviciosproductosLogic.setProductosServiciosProductoss(productosserviciosproductossParaReportes);	
		this.productosserviciosproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productosserviciosproductossParaReportes=this.productosserviciosproductosLogic.getProductosServiciosProductoss();
		this.productosserviciosproductosLogic.setProductosServiciosProductoss(productosserviciosproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosServiciosProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosServiciosProductos productosserviciosproductos : productosserviciosproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosServiciosProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosServiciosProductosConstantesFunciones.generarExcelReporteDataProductosServiciosProductos("NORMAL",row,workbook,productosserviciosproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosServiciosProductosConstantesFunciones.getProductosServiciosProductosDescripcion(productosserviciosproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosServiciosProductos() throws Exception {		
		this.startProcessProductosServiciosProductos(true);
	}
	
	public void startProcessProductosServiciosProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosServiciosProductos ,this.jPanelParametrosReportesProductosServiciosProductos, this.jScrollPanelDatosProductosServiciosProductos,this.jPanelPaginacionProductosServiciosProductos, this.jScrollPanelDatosEdicionProductosServiciosProductos, this.jPanelAccionesProductosServiciosProductos,this.jPanelAccionesFormularioProductosServiciosProductos,this.jmenuBarProductosServiciosProductos,this.jmenuBarDetalleProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,this.jTtoolBarDetalleProductosServiciosProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosServiciosProductos=this.jTabbedPaneBusquedasProductosServiciosProductos; 
		
		final JPanel jPanelParametrosReportesProductosServiciosProductos=this.jPanelParametrosReportesProductosServiciosProductos;
		//final JScrollPane jScrollPanelDatosProductosServiciosProductos=this.jScrollPanelDatosProductosServiciosProductos;
		final JTable jTableDatosProductosServiciosProductos=this.jTableDatosProductosServiciosProductos;		
		final JPanel jPanelPaginacionProductosServiciosProductos=this.jPanelPaginacionProductosServiciosProductos;
		//final JScrollPane jScrollPanelDatosEdicionProductosServiciosProductos=this.jScrollPanelDatosEdicionProductosServiciosProductos;
		final JPanel jPanelAccionesProductosServiciosProductos=this.jPanelAccionesProductosServiciosProductos;
		
		JPanel jPanelCamposAuxiliarProductosServiciosProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosServiciosProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			jPanelCamposAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelCamposProductosServiciosProductos;
			jPanelAccionesFormularioAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelAccionesFormularioProductosServiciosProductos;
		}
		
		final JPanel jPanelCamposProductosServiciosProductos=jPanelCamposAuxiliarProductosServiciosProductos;
		final JPanel jPanelAccionesFormularioProductosServiciosProductos=jPanelAccionesFormularioAuxiliarProductosServiciosProductos;
		
		
		final JMenuBar jmenuBarProductosServiciosProductos=this.jmenuBarProductosServiciosProductos;
		final JToolBar jTtoolBarProductosServiciosProductos=this.jTtoolBarProductosServiciosProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosServiciosProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosServiciosProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			jmenuBarDetalleAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jmenuBarDetalleProductosServiciosProductos;
			jTtoolBarDetalleAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jTtoolBarDetalleProductosServiciosProductos;
		}
		
		final JMenuBar jmenuBarDetalleProductosServiciosProductos=jmenuBarDetalleAuxiliarProductosServiciosProductos;
		final JToolBar jTtoolBarDetalleProductosServiciosProductos=jTtoolBarDetalleAuxiliarProductosServiciosProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosServiciosProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosServiciosProductos;
			processRunnable.jTableDatos=jTableDatosProductosServiciosProductos;
			processRunnable.jPanelCampos=jPanelCamposProductosServiciosProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosServiciosProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProductosServiciosProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosServiciosProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProductosServiciosProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosServiciosProductos;
			processRunnable.jTtoolBar=jTtoolBarProductosServiciosProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosServiciosProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosServiciosProductos ,jPanelParametrosReportesProductosServiciosProductos,jTableDatosProductosServiciosProductos, /*jScrollPanelDatosProductosServiciosProductos,*/jPanelCamposProductosServiciosProductos,jPanelPaginacionProductosServiciosProductos, /*jScrollPanelDatosEdicionProductosServiciosProductos,*/ jPanelAccionesProductosServiciosProductos,jPanelAccionesFormularioProductosServiciosProductos,jmenuBarProductosServiciosProductos,jmenuBarDetalleProductosServiciosProductos,jTtoolBarProductosServiciosProductos,jTtoolBarDetalleProductosServiciosProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosServiciosProductos ,jPanelParametrosReportesProductosServiciosProductos, jScrollPanelDatosProductosServiciosProductos,jPanelPaginacionProductosServiciosProductos, jScrollPanelDatosEdicionProductosServiciosProductos, jPanelAccionesProductosServiciosProductos,jPanelAccionesFormularioProductosServiciosProductos,jmenuBarProductosServiciosProductos,jmenuBarDetalleProductosServiciosProductos,jTtoolBarProductosServiciosProductos,jTtoolBarDetalleProductosServiciosProductos);
						
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
	
	public void finishProcessProductosServiciosProductos() {// throws Exception 
		this.finishProcessProductosServiciosProductos(true);
	}
	
	public void finishProcessProductosServiciosProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosServiciosProductos ,this.jPanelParametrosReportesProductosServiciosProductos, this.jScrollPanelDatosProductosServiciosProductos,this.jPanelPaginacionProductosServiciosProductos, this.jScrollPanelDatosEdicionProductosServiciosProductos, this.jPanelAccionesProductosServiciosProductos,this.jPanelAccionesFormularioProductosServiciosProductos,this.jmenuBarProductosServiciosProductos,this.jmenuBarDetalleProductosServiciosProductos,this.jTtoolBarProductosServiciosProductos,this.jTtoolBarDetalleProductosServiciosProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosServiciosProductos=this.jTabbedPaneBusquedasProductosServiciosProductos; 
		
		final JPanel jPanelParametrosReportesProductosServiciosProductos=this.jPanelParametrosReportesProductosServiciosProductos;
		//final JScrollPane jScrollPanelDatosProductosServiciosProductos=this.jScrollPanelDatosProductosServiciosProductos;
		final JTable jTableDatosProductosServiciosProductos=this.jTableDatosProductosServiciosProductos;		
		final JPanel jPanelPaginacionProductosServiciosProductos=this.jPanelPaginacionProductosServiciosProductos;
		//final JScrollPane jScrollPanelDatosEdicionProductosServiciosProductos=this.jScrollPanelDatosEdicionProductosServiciosProductos;
		final JPanel jPanelAccionesProductosServiciosProductos=this.jPanelAccionesProductosServiciosProductos;
		
		JPanel jPanelCamposAuxiliarProductosServiciosProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosServiciosProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			jPanelCamposAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelCamposProductosServiciosProductos;
			jPanelAccionesFormularioAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelAccionesFormularioProductosServiciosProductos;
		}
		
		final JPanel jPanelCamposProductosServiciosProductos=jPanelCamposAuxiliarProductosServiciosProductos;
		final JPanel jPanelAccionesFormularioProductosServiciosProductos=jPanelAccionesFormularioAuxiliarProductosServiciosProductos;
		
		
		final JMenuBar jmenuBarProductosServiciosProductos=this.jmenuBarProductosServiciosProductos;		
		final JToolBar jTtoolBarProductosServiciosProductos=this.jTtoolBarProductosServiciosProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosServiciosProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosServiciosProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			jmenuBarDetalleAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jmenuBarDetalleProductosServiciosProductos;
			jTtoolBarDetalleAuxiliarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jTtoolBarDetalleProductosServiciosProductos;		
		}
		
		final JMenuBar jmenuBarDetalleProductosServiciosProductos=jmenuBarDetalleAuxiliarProductosServiciosProductos;
		final JToolBar jTtoolBarDetalleProductosServiciosProductos=jTtoolBarDetalleAuxiliarProductosServiciosProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosServiciosProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosServiciosProductos;
			processRunnable.jTableDatos=jTableDatosProductosServiciosProductos;
			processRunnable.jPanelCampos=jPanelCamposProductosServiciosProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosServiciosProductos;
			processRunnable.jPanelAcciones=jPanelAccionesProductosServiciosProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosServiciosProductos;
			
			
			processRunnable.jmenuBar=jmenuBarProductosServiciosProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosServiciosProductos;
			processRunnable.jTtoolBar=jTtoolBarProductosServiciosProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosServiciosProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosServiciosProductos ,jPanelParametrosReportesProductosServiciosProductos, jTableDatosProductosServiciosProductos,/*jScrollPanelDatosProductosServiciosProductos,*/jPanelCamposProductosServiciosProductos,jPanelPaginacionProductosServiciosProductos, /*jScrollPanelDatosEdicionProductosServiciosProductos,*/ jPanelAccionesProductosServiciosProductos,jPanelAccionesFormularioProductosServiciosProductos,jmenuBarProductosServiciosProductos,jmenuBarDetalleProductosServiciosProductos,jTtoolBarProductosServiciosProductos,jTtoolBarDetalleProductosServiciosProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosServiciosProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosServiciosProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosServiciosProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosServiciosProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosServiciosProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosServiciosProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosServiciosProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosServiciosProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosServiciosProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosserviciosproductosConstantesFunciones.getsFinalQueryProductosServiciosProductos();
		String  finalQueryPaginacionTodos=this.productosserviciosproductosConstantesFunciones.getsFinalQueryProductosServiciosProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosServiciosProductosConstantesFunciones.getArrayColumnasGlobalesNoProductosServiciosProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosServiciosProductosConstantesFunciones.getArrayColumnasGlobalesProductosServiciosProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosServiciosProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productosserviciosproductossEliminados= new ArrayList<ProductosServiciosProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosServiciosProductos();
		
				///*ProductosServiciosProductosSessionBean*/this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			
			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
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
					this.iNumeroPaginacion=ProductosServiciosProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosServiciosProductosConstantesFunciones.getClassesForeignKeysOfProductosServiciosProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productosserviciosproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productosserviciosproductossAux= new ArrayList<ProductosServiciosProductos>();
			
				
			productosserviciosproductosLogic.setDatosCliente(this.datosCliente);
			productosserviciosproductosLogic.setDatosDeep(this.datosDeep);
			productosserviciosproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosServiciosProductos")) {
				this.sDetalleReporte=ProductosServiciosProductosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosProductos(id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosserviciosproductosLogic.getProductosServiciosProductossBusquedaProductosServiciosProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosServiciosProductosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosProductos(id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosServiciosProductosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosProductos(id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosserviciosproductosLogic.getProductosServiciosProductoss()==null||productosserviciosproductosLogic.getProductosServiciosProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productosserviciosproductoss==null|| productosserviciosproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosproductossAux=new ArrayList<ProductosServiciosProductos>();
						productosserviciosproductossAux.addAll(productosserviciosproductosLogic.getProductosServiciosProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciosproductossAux=new ArrayList<ProductosServiciosProductos>();
							productosserviciosproductossAux.addAll(productosserviciosproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosserviciosproductosLogic.getProductosServiciosProductossBusquedaProductosServiciosProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosServiciosProductosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosProductos(id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosServiciosProductosConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosProductos(id_bodegaBusquedaProductosServiciosProductos,id_lineaBusquedaProductosServiciosProductos,id_linea_grupoBusquedaProductosServiciosProductos,id_linea_categoriaBusquedaProductosServiciosProductos,id_linea_marcaBusquedaProductosServiciosProductos,id_tipo_producto_servicioBusquedaProductosServiciosProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosServiciosProductoss("BusquedaProductosServiciosProductos",productosserviciosproductosLogic.getProductosServiciosProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosServiciosProductoss("BusquedaProductosServiciosProductos",productosserviciosproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosproductosLogic.setProductosServiciosProductoss(new ArrayList<ProductosServiciosProductos>());
						productosserviciosproductosLogic.getProductosServiciosProductoss().addAll(productosserviciosproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciosproductoss=new ArrayList<ProductosServiciosProductos>();
							productosserviciosproductoss.addAll(productosserviciosproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosServiciosProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosServiciosProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosserviciosproductosLogic.getProductosServiciosProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosserviciosproductosLogic.getProductosServiciosProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosServiciosProductos productosserviciosproductos) {
		Boolean permite=true;
		
		if(this.productosserviciosproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosServiciosProductosConstantesFunciones.getOrderByListaProductosServiciosProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosServiciosProductosConstantesFunciones.getOrderByListaProductosServiciosProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductosLogic.getProductosServiciosProductoss()) {
				if(productosserviciosproductos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosproductosTotales=productosserviciosproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosProductos productosserviciosproductos:this.productosserviciosproductoss) {
				if(productosserviciosproductos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosproductosTotales=productosserviciosproductos;
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
			this.productosserviciosproductosAux=new ProductosServiciosProductos();
			this.productosserviciosproductosAux.setsType(Constantes2.S_TOTALES);
			this.productosserviciosproductosAux.setIsNew(false);
			this.productosserviciosproductosAux.setIsChanged(false);
			this.productosserviciosproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosServiciosProductosConstantesFunciones.TotalizarValoresFilaProductosServiciosProductos(this.productosserviciosproductosLogic.getProductosServiciosProductoss(),this.productosserviciosproductosAux);
				
				//this.productosserviciosproductosLogic.getProductosServiciosProductoss().add(this.productosserviciosproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosServiciosProductosConstantesFunciones.TotalizarValoresFilaProductosServiciosProductos(this.productosserviciosproductoss,this.productosserviciosproductosAux);
				
				this.productosserviciosproductoss.add(this.productosserviciosproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosserviciosproductosTotales=new ProductosServiciosProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosserviciosproductosLogic.getProductosServiciosProductoss().remove(productosserviciosproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosserviciosproductoss.remove(productosserviciosproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosserviciosproductosTotales=new ProductosServiciosProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductosLogic.getProductosServiciosProductoss()) {
				if(productosserviciosproductos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosproductosTotales=productosserviciosproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosServiciosProductosConstantesFunciones.TotalizarValoresFilaProductosServiciosProductos(this.productosserviciosproductosLogic.getProductosServiciosProductoss(),productosserviciosproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosProductos productosserviciosproductos:this.productosserviciosproductoss) {
				if(productosserviciosproductos.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosproductosTotales=productosserviciosproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosServiciosProductosConstantesFunciones.TotalizarValoresFilaProductosServiciosProductos(this.productosserviciosproductoss,productosserviciosproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosServiciosProductossBusquedaProductosServiciosProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosServiciosProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosProductossFK_IdTipoProductoServicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProductoServicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosServiciosProductossBusquedaProductosServiciosProductos(String sFinalQuery,Long id_bodega,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossBusquedaProductosServiciosProductos(sFinalQuery,this.pagination,id_bodega,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,id_tipo_producto_servicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosProductossFK_IdTipoProductoServicio(String sFinalQuery,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosproductosLogic.getProductosServiciosProductossFK_IdTipoProductoServicio(sFinalQuery,this.pagination,id_tipo_producto_servicio);
				
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
	
	public void inicializarPermisosProductosServiciosProductos() {
		this.isPermisoTodoProductosServiciosProductos=false;
		this.isPermisoNuevoProductosServiciosProductos=false;
		this.isPermisoActualizarProductosServiciosProductos=false;
		this.isPermisoActualizarOriginalProductosServiciosProductos=false;
		this.isPermisoEliminarProductosServiciosProductos=false;
		this.isPermisoGuardarCambiosProductosServiciosProductos=false;
		this.isPermisoConsultaProductosServiciosProductos=true;
		this.isPermisoBusquedaProductosServiciosProductos=true;
		this.isPermisoReporteProductosServiciosProductos=true;
		this.isPermisoOrdenProductosServiciosProductos=false;		
		this.isPermisoPaginacionMedioProductosServiciosProductos=false;		
		this.isPermisoPaginacionAltoProductosServiciosProductos=false;		
		this.isPermisoPaginacionTodoProductosServiciosProductos=false;		
		this.isPermisoCopiarProductosServiciosProductos=false;		
		this.isPermisoVerFormProductosServiciosProductos=false;		
		this.isPermisoDuplicarProductosServiciosProductos=false;
		this.isPermisoOrdenProductosServiciosProductos=false;
	}
	
	public void setPermisosUsuarioProductosServiciosProductos(Boolean isPermiso) {
		this.isPermisoTodoProductosServiciosProductos=isPermiso;
		this.isPermisoNuevoProductosServiciosProductos=isPermiso;
		this.isPermisoActualizarProductosServiciosProductos=isPermiso;
		this.isPermisoActualizarOriginalProductosServiciosProductos=isPermiso;
		this.isPermisoEliminarProductosServiciosProductos=isPermiso;
		this.isPermisoGuardarCambiosProductosServiciosProductos=isPermiso;
		this.isPermisoConsultaProductosServiciosProductos=isPermiso;
		this.isPermisoBusquedaProductosServiciosProductos=isPermiso;
		this.isPermisoReporteProductosServiciosProductos=isPermiso;
		this.isPermisoOrdenProductosServiciosProductos=isPermiso;		
		this.isPermisoPaginacionMedioProductosServiciosProductos=isPermiso;		
		this.isPermisoPaginacionAltoProductosServiciosProductos=isPermiso;		
		this.isPermisoPaginacionTodoProductosServiciosProductos=isPermiso;		
		this.isPermisoCopiarProductosServiciosProductos=isPermiso;		
		this.isPermisoVerFormProductosServiciosProductos=isPermiso;		
		this.isPermisoDuplicarProductosServiciosProductos=isPermiso;
		this.isPermisoOrdenProductosServiciosProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosServiciosProductos(Boolean isPermiso) {
		//this.isPermisoTodoProductosServiciosProductos=isPermiso;
		this.isPermisoNuevoProductosServiciosProductos=isPermiso;
		this.isPermisoActualizarProductosServiciosProductos=isPermiso;
		this.isPermisoActualizarOriginalProductosServiciosProductos=isPermiso;
		this.isPermisoEliminarProductosServiciosProductos=isPermiso;
		this.isPermisoGuardarCambiosProductosServiciosProductos=isPermiso;
		//this.isPermisoConsultaProductosServiciosProductos=isPermiso;
		//this.isPermisoBusquedaProductosServiciosProductos=isPermiso;
		//this.isPermisoReporteProductosServiciosProductos=isPermiso;
		//this.isPermisoOrdenProductosServiciosProductos=isPermiso;		
		//this.isPermisoPaginacionMedioProductosServiciosProductos=isPermiso;		
		//this.isPermisoPaginacionAltoProductosServiciosProductos=isPermiso;		
		//this.isPermisoPaginacionTodoProductosServiciosProductos=isPermiso;		
		//this.isPermisoCopiarProductosServiciosProductos=isPermiso;		
		//this.isPermisoDuplicarProductosServiciosProductos=isPermiso;
		//this.isPermisoOrdenProductosServiciosProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosServiciosProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosServiciosProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosServiciosProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosServiciosProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosServiciosProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosServiciosProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosServiciosProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosServiciosProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosServiciosProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosServiciosProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosServiciosProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosServiciosProductos=this.isPermisoActualizarProductosServiciosProductos;
			this.isPermisoEliminarProductosServiciosProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosServiciosProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosServiciosProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosServiciosProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosServiciosProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosServiciosProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosServiciosProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosServiciosProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosServiciosProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosServiciosProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosServiciosProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosServiciosProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosServiciosProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosServiciosProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosServiciosProductos.setToolTipText(this.jTableDatosProductosServiciosProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosServiciosProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosServiciosProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosServiciosProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosServiciosProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosServiciosProductos() throws Exception {
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
	public void inicializarCombosForeignKeyProductosServiciosProductosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.tipoproductoserviciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductosServiciosProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosServiciosProductosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoProductoServicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoproductoserviciosForeignKey==null||this.tipoproductoserviciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoProductoServicioConstantesFunciones.getArrayColumnasGlobalesTipoProductoServicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoProductoServicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoProductoServicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoProductoServiciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosServiciosProductos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyTipoProductoServicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productosserviciosproductosSessionBean==null) {
				this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean();
			}

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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

	public void addItemDefectoCombosForeignKeyTipoProductoServicio()throws Exception {
		try {

			if(!this.productosserviciosproductosSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
				TipoProductoServicio tipoproductoservicio=new TipoProductoServicio();
				TipoProductoServicioConstantesFunciones.setTipoProductoServicioDescripcion(tipoproductoservicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoproductoservicio.setId(null);

				if(!TipoProductoServicioConstantesFunciones.ExisteEnLista(this.tipoproductoserviciosForeignKey,tipoproductoservicio,true)) {

					this.tipoproductoserviciosForeignKey.add(0,tipoproductoservicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductosServiciosProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosServiciosProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosServiciosProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosServiciosProductos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosServiciosProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosServiciosProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosServiciosProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosServiciosProductos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameTipoProductoServiciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductosServiciosProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductosServiciosProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProductosServiciosProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosServiciosProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosServiciosProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosserviciosproductosSessionBean=new ProductosServiciosProductosSessionBean(); 
		this.productosserviciosproductosConstantesFunciones=new ProductosServiciosProductosConstantesFunciones(); 
		this.productosserviciosproductosBean=new ProductosServiciosProductos();//(this.productosserviciosproductosConstantesFunciones); 		
		this.productosserviciosproductosReturnGeneral=new ProductosServiciosProductosParameterReturnGeneral(); 
		
		this.productosserviciosproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosServiciosProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosServiciosProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosServiciosProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosServiciosProductos(true);
			
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
			
			this.productosserviciosproductosConstantesFunciones=new ProductosServiciosProductosConstantesFunciones(); 
			this.productosserviciosproductosBean=new ProductosServiciosProductos();//this.productosserviciosproductosConstantesFunciones); 			
			this.productosserviciosproductosReturnGeneral=new ProductosServiciosProductosParameterReturnGeneral(); 
		
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productosserviciosproductos=new ProductosServiciosProductos();
			this.productosserviciosproductoss = new ArrayList<ProductosServiciosProductos>();
			this.productosserviciosproductossAux = new ArrayList<ProductosServiciosProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic=new ProductosServiciosProductosLogic();
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.productosserviciosproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosserviciosproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosServiciosProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosServiciosProductos);	
					}
					
					if(this.jInternalFrameImportacionProductosServiciosProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosServiciosProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosServiciosProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosServiciosProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosServiciosProductos);
				this.jInternalFrameDetalleFormProductosServiciosProductos.setVisible(false);
				this.jInternalFrameDetalleFormProductosServiciosProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosServiciosProductos);
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosServiciosProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosServiciosProductos);
					this.jInternalFrameImportacionProductosServiciosProductos.setVisible(false);
					this.jInternalFrameImportacionProductosServiciosProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosServiciosProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosServiciosProductos);
					this.jInternalFrameOrderByProductosServiciosProductos.setVisible(false);
					this.jInternalFrameOrderByProductosServiciosProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosServiciosProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosServiciosProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosserviciosproductosReturnGeneral=new ProductosServiciosProductosParameterReturnGeneral();
			
			this.productosserviciosproductosParameterGeneral=new ProductosServiciosProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosserviciosproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosServiciosProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosServiciosProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado(),this.productosserviciosproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosServiciosProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado(),this.productosserviciosproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaDuplicarProductosServiciosProductos=true;
			this.isVisibilidadCeldaCopiarProductosServiciosProductos=true;
			this.isVisibilidadCeldaVerFormProductosServiciosProductos=true;
			this.isVisibilidadCeldaOrdenProductosServiciosProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
			this.isVisibilidadCeldaModificarProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
			
			
			this.isVisibilidadBusquedaProductosServiciosProductos=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoProductoServicio=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductosServiciosProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosServiciosProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosServiciosProductos(false);
			
			this.setPermisosUsuarioProductosServiciosProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.productosserviciosproductosSessionBean.getEsGuardarRelacionado() && this.productosserviciosproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosServiciosProductosClasesRelacionadas();
			}
			
			if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosServiciosProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosServiciosProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosServiciosProductos();
			}
			
			if(!this.isPermisoBusquedaProductosServiciosProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosServiciosProductosConstantesFunciones.getTiposSeleccionarProductosServiciosProductos());
				
				this.tiposColumnasSelect=ProductosServiciosProductosConstantesFunciones.getTiposSeleccionarProductosServiciosProductos(true);
				
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
			//if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosServiciosProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioProductosServiciosProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioProductosServiciosProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosProductos() ;
			
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
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			this.tipoproductoservicioLogic=new TipoProductoServicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productosserviciosproductosImplementable= (ProductosServiciosProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosServiciosProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosserviciosproductosImplementableHome= (ProductosServiciosProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosServiciosProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productosserviciosproductoss= new ArrayList<ProductosServiciosProductos>();
			this.productosserviciosproductossEliminados= new ArrayList<ProductosServiciosProductos>();
						
			this.isEsNuevoProductosServiciosProductos=false;
			this.esParaAccionDesdeFormularioProductosServiciosProductos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.tipoproductoserviciosForeignKey=new ArrayList<TipoProductoServicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductosServiciosProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosServiciosProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosServiciosProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosServiciosProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosServiciosProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosServiciosProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosServiciosProductos();
			}
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosServiciosProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosServiciosProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosServiciosProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosServiciosProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosServiciosProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosServiciosProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosServiciosProductos")) {
				iIndex=this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosServiciosProductos();	
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
	
	public void cargarCombosForeignKeyProductosServiciosProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosServiciosProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosServiciosProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosServiciosProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosServiciosProductos();
		
		this.cargarCombosFrameForeignKeyProductosServiciosProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosServiciosProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosServiciosProductos();
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

	public void cargarCombosForeignKeyTipoProductoServicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoProductoServicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoProductoServicio(this.tipoproductoserviciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductosServiciosProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			
			if(jTableDatosProductosServiciosProductos.getRowCount()>=1) {
				jTableDatosProductosServiciosProductos.removeRowSelectionInterval(0, jTableDatosProductosServiciosProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosServiciosProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosServiciosProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosServiciosProductos(true);			
			//this.productosserviciosproductos=new ProductosServiciosProductos();
			//this.productosserviciosproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos() ;
			
			if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productosserviciosproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);				
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosServiciosProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosServiciosProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosServiciosProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosServiciosProductos.getSelectedRows().length;			
			}
			
			productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosServiciosProductos--;			
				//ProductosServiciosProductos productosserviciosproductosAux= new ProductosServiciosProductos();			
				//productosserviciosproductosAux.setId(this.iIdNuevoProductosServiciosProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosServiciosProductos productosserviciosproductosOrigen=new ProductosServiciosProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosServiciosProductos productosserviciosproductosOrigen : productosserviciosproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosserviciosproductosOrigen =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciosproductosOrigen =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosServiciosProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productosserviciosproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosServiciosProductos(productosserviciosproductosOrigen,this.productosserviciosproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosserviciosproductosLogic.getProductosServiciosProductoss().add(this.productosserviciosproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductoss.add(this.productosserviciosproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
				
				this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosProductos(), this.getIndiceNuevoProductosServiciosProductos());
				
				int iLastRow =  this.jTableDatosProductosServiciosProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosServiciosProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosServiciosProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();									
		
			ProductosServiciosProductos productosserviciosproductosOrigen=new ProductosServiciosProductos();
			ProductosServiciosProductos productosserviciosproductosDestino=new ProductosServiciosProductos();
				
			productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosServiciosProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productosserviciosproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosServiciosProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosproductosOrigen =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosserviciosproductosOrigen =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosproductosDestino =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosserviciosproductosDestino =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosserviciosproductosOrigen =productosserviciosproductossSeleccionados.get(0);
				productosserviciosproductosDestino =productosserviciosproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosServiciosProductos(productosserviciosproductosOrigen,productosserviciosproductosDestino,true,false);
				
				productosserviciosproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosserviciosproductosDestino,productosserviciosproductosLogic.getProductosServiciosProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosserviciosproductosDestino,productosserviciosproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
				
				//this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosProductos(), this.getIndiceNuevoProductosServiciosProductos());
				
				int iLastRow =  this.jTableDatosProductosServiciosProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosServiciosProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosServiciosProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosServiciosProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosServiciosProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosServiciosProductos.setVisible(!isVisible);
			this.jPanelPaginacionProductosServiciosProductos.setVisible(!isVisible);
			this.jPanelAccionesProductosServiciosProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosServiciosProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosServiciosProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosServiciosProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosServiciosProductos();
			
			this.abrirFrameOrderByProductosServiciosProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosServiciosProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosServiciosProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosServiciosProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosServiciosProductos.isMaximum()) {
					this.jInternalFrameDetalleFormProductosServiciosProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosServiciosProductos.setSize(this.jInternalFrameDetalleFormProductosServiciosProductos.iWidthFormulario,this.jInternalFrameDetalleFormProductosServiciosProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosServiciosProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosServiciosProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosServiciosProductos.isMaximum()) {
						this.jInternalFrameDetalleFormProductosServiciosProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosServiciosProductos.jContentPaneDetalleProductosServiciosProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosProductos.jContentPaneDetalleProductosServiciosProductos.getWidth(),ProductosServiciosProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosProductos.jContentPaneDetalleProductosServiciosProductos.getWidth(),ProductosServiciosProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosProductos.jContentPaneDetalleProductosServiciosProductos.getWidth(),ProductosServiciosProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosServiciosProductos.setVisible(true);
	        this.jInternalFrameDetalleFormProductosServiciosProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosServiciosProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosServiciosProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosServiciosProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosProductos,false,this);
				} else {
					this.jInternalFrameOrderByProductosServiciosProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosServiciosProductos);
				this.jInternalFrameOrderByProductosServiciosProductos.setVisible(false);
				this.jInternalFrameOrderByProductosServiciosProductos.setSelected(false);
				
				this.jInternalFrameOrderByProductosServiciosProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosServiciosProductos"));
				
				this.inicializarActualizarBindingTablaOrderByProductosServiciosProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosServiciosProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosServiciosProductos==null) {
				
				this.jInternalFrameImportacionProductosServiciosProductos=new ImportacionJInternalFrame(ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosServiciosProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosServiciosProductos);
				this.jInternalFrameImportacionProductosServiciosProductos.setVisible(false);
				this.jInternalFrameImportacionProductosServiciosProductos.setSelected(false);


				this.jInternalFrameImportacionProductosServiciosProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosServiciosProductos"));
				this.jInternalFrameImportacionProductosServiciosProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosServiciosProductos"));
				this.jInternalFrameImportacionProductosServiciosProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosServiciosProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosServiciosProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosProductos==null) {
				this.jInternalFrameReporteDinamicoProductosServiciosProductos=new ReporteDinamicoJInternalFrame(ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosServiciosProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosServiciosProductos);
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosProductos"));
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosProductos"));
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosServiciosProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosServiciosProductos);
			
	       	this.jInternalFrameDetalleFormProductosServiciosProductos.setVisible(false);
	        this.jInternalFrameDetalleFormProductosServiciosProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosServiciosProductos.dispose();
			//this.jInternalFrameDetalleFormProductosServiciosProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosServiciosProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosServiciosProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosServiciosProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosServiciosProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosServiciosProductos.setVisible(true);
	        this.jInternalFrameImportacionProductosServiciosProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosServiciosProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosServiciosProductos.setVisible(true);
	        this.jInternalFrameOrderByProductosServiciosProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosServiciosProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosServiciosProductos.setVisible(false);
	        this.jInternalFrameOrderByProductosServiciosProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosServiciosProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosServiciosProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosServiciosProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosServiciosProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosServiciosProductos.setVisible(false);
	        this.jInternalFrameImportacionProductosServiciosProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosServiciosProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosServiciosProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosServiciosProductos(true);
			//this.isEsNuevoProductosServiciosProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosServiciosProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosProductos(false) ;
			
			if(productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosServiciosProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosServiciosProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosServiciosProductos(true);
			//this.isEsNuevoProductosServiciosProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productosserviciosproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosServiciosProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosServiciosProductos(false) ;
			
			if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoProductoServicio(List<TipoProductoServicio> tipoproductoserviciosForeignKey)throws Exception{
		TableColumn tableColumnTipoProductoServicio=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO));
		TableCellEditor tableCellEditorTipoProductoServicio =tableColumnTipoProductoServicio.getCellEditor();

		TipoProductoServicioTableCell tipoproductoservicioTableCellFk=(TipoProductoServicioTableCell)tableCellEditorTipoProductoServicio;

		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKey(tipoproductoserviciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoservicioTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKeyActual(tipoproductoserviciosForeignKey);
		//}


		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.RecargarTipoProductoServiciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosServiciosProductos(false);
			
			//if(!this.isEsNuevoProductosServiciosProductos) {								
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				
			}
			
			if(this.permiteMantenimiento(this.productosserviciosproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosServiciosProductos=true;
					this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
					this.isEsNuevoProductosServiciosProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosServiciosProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosServiciosProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosServiciosProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(false);
				
				this.habilitarDeshabilitarControlesProductosServiciosProductos(false);
			
												
				
				if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosServiciosProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosServiciosProductosActionPerformed(evt,productosserviciosproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosServiciosProductos(this.productosserviciosproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosserviciosproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productosserviciosproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				this.productosserviciosproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				this.productosserviciosproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productosserviciosproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosServiciosProductosModel) this.jTableDatosProductosServiciosProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosServiciosProductos=true;
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
				this.isEsNuevoProductosServiciosProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosServiciosProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(false);
				
				this.habilitarDeshabilitarControlesProductosServiciosProductos(false);
				
				
				
				if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosServiciosProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosServiciosProductos.getRowCount()>=1) {
				jTableDatosProductosServiciosProductos.removeRowSelectionInterval(0, jTableDatosProductosServiciosProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosServiciosProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(false) ;
			
			this.isEsNuevoProductosServiciosProductos=false;
			
			if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosServiciosProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosServiciosProductos(false);
				
				//SI ES MANUAL
				if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosServiciosProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosServiciosProductos--;			
			//ProductosServiciosProductos productosserviciosproductosAux= new ProductosServiciosProductos();			
			//productosserviciosproductosAux.setId(this.iIdNuevoProductosServiciosProductos);
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosServiciosProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
			
			this.productosserviciosproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosserviciosproductosLogic.getProductosServiciosProductoss().add(this.productosserviciosproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productosserviciosproductoss.add(this.productosserviciosproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			
			this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosProductos(), this.getIndiceNuevoProductosServiciosProductos());
			
			int iLastRow =  this.jTableDatosProductosServiciosProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosServiciosProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosServiciosProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosProductos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosProductos();
			}
			
			//this.abrirFrameTreeProductosServiciosProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosServiciosProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosServiciosProductos.setFileImportacion(this.jInternalFrameImportacionProductosServiciosProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosServiciosProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosServiciosProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosServiciosProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosServiciosProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		

		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosServiciosProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosServiciosProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoProductoServicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoProductoServicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoProductoServicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoProductoServicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					sNombreCampoCategoria="nombre_tipo_producto_servicio";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					sNombreCampoCategoriaValor="nombre_tipo_producto_servicio";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Producto Servicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_producto_servicio");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosServiciosProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.gettipoproductoservicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_tipo_producto_servicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProductosServiciosProductos productosserviciosproductos:productosserviciosproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosproductos.getnombre_unidad());
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
			//	this.getFilaCabeceraExportarExcelProductosServiciosProductos(row);				
			//	iRow++;
			//}				
			
			//for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosServiciosProductos(productosserviciosproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosProductos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosProductos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosServiciosProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosProductos(false);
			
			//SI ES MANUAL
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosServiciosProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosServiciosProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosServiciosProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosServiciosProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosServiciosProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosServiciosProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosServiciosProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosServiciosProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosServiciosProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosServiciosProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosServiciosProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosServiciosProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosServiciosProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosServiciosProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosServiciosProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosServiciosProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosServiciosProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosServiciosProductos();
		
		this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosServiciosProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosServiciosProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosServiciosProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosServiciosProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosServiciosProductos.jCheckBoxPostAccionNuevoProductosServiciosProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosServiciosProductos.jCheckBoxPostAccionSinCerrarProductosServiciosProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosServiciosProductos.jCheckBoxPostAccionSinMensajeProductosServiciosProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosServiciosProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosServiciosProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosServiciosProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jCheckBoxPostAccionNuevoProductosServiciosProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosServiciosProductos.jCheckBoxPostAccionSinCerrarProductosServiciosProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosServiciosProductos.jCheckBoxPostAccionSinMensajeProductosServiciosProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosServiciosProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosServiciosProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosServiciosProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosServiciosProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosServiciosProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosServiciosProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosServiciosProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosServiciosProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosServiciosProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosServiciosProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosProductos() throws Exception {
		try	{
			if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosServiciosProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosServiciosProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosServiciosProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosServiciosProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosServiciosProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosServiciosProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosServiciosProductos.addItem(reporte);
			}
			
			
			if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosServiciosProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosServiciosProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosServiciosProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosServiciosProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosServiciosProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosServiciosProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosServiciosProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosServiciosProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()!=null){this.id_bodegaBusquedaProductosServiciosProductos=((Bodega)this.jComboBoxid_bodegaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()!=null){this.id_lineaBusquedaProductosServiciosProductos=((Linea)this.jComboBoxid_lineaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()!=null){this.id_linea_grupoBusquedaProductosServiciosProductos=((Linea)this.jComboBoxid_linea_grupoBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProductosServiciosProductos=((Linea)this.jComboBoxid_linea_categoriaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()!=null){this.id_linea_marcaBusquedaProductosServiciosProductos=((Linea)this.jComboBoxid_linea_marcaBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()!=null){this.id_tipo_producto_servicioBusquedaProductosServiciosProductos=((TipoProductoServicio)this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosProductosProductosServiciosProductos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosServiciosProductos(Boolean esInicializar) throws Exception {				
		if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosServiciosProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosServiciosProductos() throws Exception {
		this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosServiciosProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosServiciosProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosServiciosProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosserviciosproductosLogic.getProductosServiciosProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productosserviciosproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosServiciosProductos.setModel(new ProductosServiciosProductosModel(this.productosserviciosproductosLogic.getProductosServiciosProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosServiciosProductos.setModel(new ProductosServiciosProductosModel(this.productosserviciosproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosServiciosProductos!=null && this.jInternalFrameOrderByProductosServiciosProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosServiciosProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO,productosserviciosproductosConstantesFunciones.resaltarSeleccionarProductosServiciosProductos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosServiciosProductosConstantesFunciones.SCLASSWEBTITULO,productosserviciosproductosConstantesFunciones.resaltarSeleccionarProductosServiciosProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_ID));

		if(this.productosserviciosproductosConstantesFunciones.mostraridProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosproductosConstantesFunciones.resaltaridProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activaridProductosServiciosProductos,this,true,"idProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltaridProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activaridProductosServiciosProductos,this,true,"idProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_sucursalProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_sucursalProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_sucursalProductosServiciosProductos,this,true,"nombre_sucursalProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_sucursalProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_sucursalProductosServiciosProductos,this,true,"nombre_sucursalProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_lineaProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_lineaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_lineaProductosServiciosProductos,this,true,"nombre_lineaProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_lineaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_lineaProductosServiciosProductos,this,true,"nombre_lineaProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_grupoProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_linea_grupoProductosServiciosProductos,this,true,"nombre_linea_grupoProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_linea_grupoProductosServiciosProductos,this,true,"nombre_linea_grupoProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_categoriaProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_linea_categoriaProductosServiciosProductos,this,true,"nombre_linea_categoriaProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_linea_categoriaProductosServiciosProductos,this,true,"nombre_linea_categoriaProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_marcaProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_linea_marcaProductosServiciosProductos,this,true,"nombre_linea_marcaProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_linea_marcaProductosServiciosProductos,this,true,"nombre_linea_marcaProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO));

		if(this.productosserviciosproductosConstantesFunciones.mostrarcodigoProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarcodigoProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarcodigoProductosServiciosProductos,this,true,"codigoProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarcodigoProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarcodigoProductosServiciosProductos,this,true,"codigoProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombreProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombreProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombreProductosServiciosProductos,this,true,"nombreProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombreProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombreProductosServiciosProductos,this,true,"nombreProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_tipo_producto_servicioProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosProductos,this,true,"nombre_tipo_producto_servicioProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosProductos,this,true,"nombre_tipo_producto_servicioProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_bodegaProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_bodegaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_bodegaProductosServiciosProductos,this,true,"nombre_bodegaProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_bodegaProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_bodegaProductosServiciosProductos,this,true,"nombre_bodegaProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.productosserviciosproductosConstantesFunciones.mostrarnombre_unidadProductosServiciosProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_unidadProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_unidadProductosServiciosProductos,this,true,"nombre_unidadProductosServiciosProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosproductosConstantesFunciones.resaltarnombre_unidadProductosServiciosProductos,this.productosserviciosproductosConstantesFunciones.activarnombre_unidadProductosServiciosProductos,this,true,"nombre_unidadProductosServiciosProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosServiciosProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosServiciosProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosServiciosProductos.addColumn(tableColumn);
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
			
			this.jTableDatosProductosServiciosProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosServiciosProductos.moveColumn(this.jTableDatosProductosServiciosProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosServiciosProductos.moveColumn(this.jTableDatosProductosServiciosProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosServiciosProductos.moveColumn(this.jTableDatosProductosServiciosProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosServiciosProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosServiciosProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosServiciosProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosServiciosProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosServiciosProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosServiciosProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosServiciosProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosserviciosproductosLogic.getProductosServiciosProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productosserviciosproductoss.size()-1;
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
		//this.jTableDatosProductosServiciosProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosServiciosProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosServiciosProductos();
			
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
				
				//this.isEsNuevoProductosServiciosProductos=false;
					
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
				if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosServiciosProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productosserviciosproductos.getsType().equals("DUPLICADO")
				   || this.productosserviciosproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosServiciosProductos=true;
				
				} else {
					this.isEsNuevoProductosServiciosProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.productosserviciosproductos.getId()>=0 && !this.productosserviciosproductos.getIsNew()) {						
						this.isEsNuevoProductosServiciosProductos=false;
						
					} else {
						this.isEsNuevoProductosServiciosProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosServiciosProductos(esRelaciones);						
				
				this.seleccionarProductosServiciosProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productosserviciosproductos.getId()<0) {
					this.isEsNuevoProductosServiciosProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosServiciosProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosServiciosProductos(evt,rowIndex);
				}	
				
				if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosServiciosProductos: " + this.dDif); 
					}
				}								
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosServiciosProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productosserviciosproductos)) {
					if(this.productosserviciosproductos.getId()>0) {
						this.productosserviciosproductos.setIsDeleted(true);
						
						this.productosserviciosproductossEliminados.add(this.productosserviciosproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosserviciosproductosLogic.getProductosServiciosProductoss().remove(this.productosserviciosproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductoss.remove(this.productosserviciosproductos);				
					}
					
					
					((ProductosServiciosProductosModel) this.jTableDatosProductosServiciosProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosServiciosProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosServiciosProductos) {
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosServiciosProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosServiciosProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosServiciosProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosServiciosProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosServiciosProductos(productosserviciosproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosServiciosProductos(productosserviciosproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosServiciosProductos(productosserviciosproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosProductos(productosserviciosproductos);
	}
	
	public void setVariablesObjetoActualToFormularioProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setText(productosserviciosproductos.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setText(productosserviciosproductos.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setText(productosserviciosproductos.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setText(productosserviciosproductos.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setText(productosserviciosproductos.getnombre_tipo_producto_servicio());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setText(productosserviciosproductos.getnombre_unidad());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosServiciosProductos productosserviciosproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosserviciosproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosServiciosProductos productosserviciosproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosserviciosproductosLocal=this.productosserviciosproductos;
			} else {
				productosserviciosproductosLocal=this.productosserviciosproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosserviciosproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosServiciosProductos(productosserviciosproductosLocal,true);
					
					if(productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosserviciosproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosserviciosproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosServiciosProductos(productosserviciosproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(productosserviciosproductos);
	}
	
	public void setVariablesFormularioToObjetoActualProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosServiciosProductos(productosserviciosproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.getText()==null || this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.getText()=="" || this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setText("0");
			}

			if(conColumnasBase) {productosserviciosproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelIdProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_sucursal(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_sucursalProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_linea(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_lineaProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_linea_grupo(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_grupoProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_linea_categoria(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_categoriaProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_linea_marca(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_linea_marcaProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setcodigo(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelcodigoProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombreProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_tipo_producto_servicio(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_tipo_producto_servicioProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_bodega(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_bodegaProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosproductos.setnombre_unidad(this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelnombre_unidadProductosServiciosProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductosBean,ProductosServiciosProductos productosserviciosproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductosOrigen,ProductosServiciosProductos productosserviciosproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosserviciosproductosOrigen.getId()!=null && !productosserviciosproductosOrigen.getId().equals(0L))) {productosserviciosproductos.setId(productosserviciosproductosOrigen.getId());}}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_sucursal()!=null && !productosserviciosproductosOrigen.getnombre_sucursal().equals(""))) {productosserviciosproductos.setnombre_sucursal(productosserviciosproductosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_linea()!=null && !productosserviciosproductosOrigen.getnombre_linea().equals(""))) {productosserviciosproductos.setnombre_linea(productosserviciosproductosOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_linea_grupo()!=null && !productosserviciosproductosOrigen.getnombre_linea_grupo().equals(""))) {productosserviciosproductos.setnombre_linea_grupo(productosserviciosproductosOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_linea_categoria()!=null && !productosserviciosproductosOrigen.getnombre_linea_categoria().equals(""))) {productosserviciosproductos.setnombre_linea_categoria(productosserviciosproductosOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_linea_marca()!=null && !productosserviciosproductosOrigen.getnombre_linea_marca().equals(""))) {productosserviciosproductos.setnombre_linea_marca(productosserviciosproductosOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getcodigo()!=null && !productosserviciosproductosOrigen.getcodigo().equals(""))) {productosserviciosproductos.setcodigo(productosserviciosproductosOrigen.getcodigo());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre()!=null && !productosserviciosproductosOrigen.getnombre().equals(""))) {productosserviciosproductos.setnombre(productosserviciosproductosOrigen.getnombre());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_tipo_producto_servicio()!=null && !productosserviciosproductosOrigen.getnombre_tipo_producto_servicio().equals(""))) {productosserviciosproductos.setnombre_tipo_producto_servicio(productosserviciosproductosOrigen.getnombre_tipo_producto_servicio());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_bodega()!=null && !productosserviciosproductosOrigen.getnombre_bodega().equals(""))) {productosserviciosproductos.setnombre_bodega(productosserviciosproductosOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && productosserviciosproductosOrigen.getnombre_unidad()!=null && !productosserviciosproductosOrigen.getnombre_unidad().equals(""))) {productosserviciosproductos.setnombre_unidad(productosserviciosproductosOrigen.getnombre_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setText(productosserviciosproductos.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setText(productosserviciosproductos.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setText(productosserviciosproductos.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setText(productosserviciosproductos.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setText(productosserviciosproductos.getnombre_tipo_producto_servicio());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setText(productosserviciosproductos.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setText(productosserviciosproductos.getnombre_unidad());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosServiciosProductos(ProductosServiciosProductosBean productosserviciosproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setText(productosserviciosproductosBean.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_linea());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setText(productosserviciosproductosBean.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_tipo_producto_servicio());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setText(productosserviciosproductosBean.getnombre_unidad());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosServiciosProductos(ProductosServiciosProductosParameterReturnGeneral productosserviciosproductosReturnGeneral,ProductosServiciosProductosBean productosserviciosproductosBean,Boolean conDefault) throws Exception { 
		try {
			ProductosServiciosProductos productosserviciosproductosLocal=new ProductosServiciosProductos();
			
			productosserviciosproductosLocal=productosserviciosproductosReturnGeneral.getProductosServiciosProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosserviciosproductosLocal.getId()!=null && !productosserviciosproductosLocal.getId().equals(0L))) {productosserviciosproductosBean.setId(productosserviciosproductosLocal.getId());}}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_sucursal()!=null && !productosserviciosproductosLocal.getnombre_sucursal().equals(""))) {productosserviciosproductosBean.setnombre_sucursal(productosserviciosproductosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_linea()!=null && !productosserviciosproductosLocal.getnombre_linea().equals(""))) {productosserviciosproductosBean.setnombre_linea(productosserviciosproductosLocal.getnombre_linea());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_linea_grupo()!=null && !productosserviciosproductosLocal.getnombre_linea_grupo().equals(""))) {productosserviciosproductosBean.setnombre_linea_grupo(productosserviciosproductosLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_linea_categoria()!=null && !productosserviciosproductosLocal.getnombre_linea_categoria().equals(""))) {productosserviciosproductosBean.setnombre_linea_categoria(productosserviciosproductosLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_linea_marca()!=null && !productosserviciosproductosLocal.getnombre_linea_marca().equals(""))) {productosserviciosproductosBean.setnombre_linea_marca(productosserviciosproductosLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getcodigo()!=null && !productosserviciosproductosLocal.getcodigo().equals(""))) {productosserviciosproductosBean.setcodigo(productosserviciosproductosLocal.getcodigo());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre()!=null && !productosserviciosproductosLocal.getnombre().equals(""))) {productosserviciosproductosBean.setnombre(productosserviciosproductosLocal.getnombre());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_tipo_producto_servicio()!=null && !productosserviciosproductosLocal.getnombre_tipo_producto_servicio().equals(""))) {productosserviciosproductosBean.setnombre_tipo_producto_servicio(productosserviciosproductosLocal.getnombre_tipo_producto_servicio());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_bodega()!=null && !productosserviciosproductosLocal.getnombre_bodega().equals(""))) {productosserviciosproductosBean.setnombre_bodega(productosserviciosproductosLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && productosserviciosproductosLocal.getnombre_unidad()!=null && !productosserviciosproductosLocal.getnombre_unidad().equals(""))) {productosserviciosproductosBean.setnombre_unidad(productosserviciosproductosLocal.getnombre_unidad());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosServiciosProductosGenerico(Long idProductosServiciosProductosSeleccionado,JComboBox jComboBoxProductosServiciosProductos,List<ProductosServiciosProductos> productosserviciosproductossLocal)throws Exception {
		try {
			ProductosServiciosProductos  productosserviciosproductosTemp=null;

			for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossLocal) {
				if(productosserviciosproductosAux.getId()!=null && productosserviciosproductosAux.getId().equals(idProductosServiciosProductosSeleccionado)) {
					productosserviciosproductosTemp=productosserviciosproductosAux;
					break;
				}
			}

			jComboBoxProductosServiciosProductos.setSelectedItem(productosserviciosproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosServiciosProductosGenerico(JComboBox jComboBoxProductosServiciosProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosServiciosProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosServiciosProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosServiciosProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosServiciosProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosServiciosProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosServiciosProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciosproductos=(ProductosServiciosProductos) productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosserviciosproductos =(ProductosServiciosProductos) productosserviciosproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("TipoProductoServicio")) {
			//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
			if(!productosserviciosproductos.getIsNew() && !productosserviciosproductos.getIsChanged() && !productosserviciosproductos.getIsDeleted()) {
				sDescripcion=productosserviciosproductos.gettipoproductoservicio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosproductos.gettipoproductoservicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosServiciosProductos productosserviciosproductosRow=new ProductosServiciosProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciosproductosRow=(ProductosServiciosProductos) productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosserviciosproductosRow=(ProductosServiciosProductos) productosserviciosproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosServiciosProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos));			
			this.jButtonDuplicarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosProductos && this.isPermisoDuplicarProductosServiciosProductos));			
			this.jButtonCopiarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosProductos && this.isPermisoCopiarProductosServiciosProductos));
			this.jButtonVerFormProductosServiciosProductos.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosProductos && this.isPermisoVerFormProductosServiciosProductos));
			
			this.jButtonAbrirOrderByProductosServiciosProductos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosProductos && this.isPermisoOrdenProductosServiciosProductos));			
			
			this.jButtonNuevoRelacionesProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos));			
			this.jButtonNuevoGuardarCambiosProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaModificarProductosServiciosProductos && this.isPermisoActualizarProductosServiciosProductos));	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosProductos && this.isPermisoActualizarProductosServiciosProductos));	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosProductos && this.isPermisoEliminarProductosServiciosProductos));
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarProductosServiciosProductos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosProductos);							
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos));						
			this.jButtonDuplicarToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosProductos && this.isPermisoDuplicarProductosServiciosProductos));						
			this.jButtonCopiarToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosProductos && this.isPermisoCopiarProductosServiciosProductos));			
			this.jButtonVerFormToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosProductos && this.isPermisoVerFormProductosServiciosProductos));			
			this.jButtonAbrirOrderByToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosProductos && this.isPermisoOrdenProductosServiciosProductos));
			this.jButtonNuevoRelacionesToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos));			
			this.jButtonNuevoGuardarCambiosToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));			
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaModificarProductosServiciosProductos && this.isPermisoActualizarProductosServiciosProductos));	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosProductos  && this.isPermisoActualizarProductosServiciosProductos));	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosProductos && this.isPermisoEliminarProductosServiciosProductos));
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarToolBarProductosServiciosProductos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosProductos);				
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos));			
			this.jMenuItemDuplicarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosProductos && this.isPermisoDuplicarProductosServiciosProductos));			
			this.jMenuItemCopiarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosProductos && this.isPermisoCopiarProductosServiciosProductos));			
			this.jMenuItemVerFormProductosServiciosProductos.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosProductos && this.isPermisoVerFormProductosServiciosProductos));			
			this.jMenuItemAbrirOrderByProductosServiciosProductos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosProductos && this.isPermisoOrdenProductosServiciosProductos));			
			//this.jMenuItemMostrarOcultarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosProductos && this.isPermisoOrdenProductosServiciosProductos));
			this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosProductos && this.isPermisoOrdenProductosServiciosProductos));			
			//this.jMenuItemDetalleMostrarOcultarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosProductos && this.isPermisoOrdenProductosServiciosProductos));			
			this.jMenuItemNuevoRelacionesProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos));			
			this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosProductos && this.isPermisoNuevoProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));									
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemModificarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaModificarProductosServiciosProductos && this.isPermisoActualizarProductosServiciosProductos));	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemActualizarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosProductos && this.isPermisoActualizarProductosServiciosProductos));	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemEliminarProductosServiciosProductos.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosProductos && this.isPermisoEliminarProductosServiciosProductos));
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemCancelarProductosServiciosProductos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosProductos);				
			}
			
			this.jMenuItemGuardarCambiosProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));						
			this.jMenuItemGuardarCambiosTablaProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=this.jButtonNuevoProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaDuplicarProductosServiciosProductos=this.jButtonDuplicarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaCopiarProductosServiciosProductos=this.jButtonCopiarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaVerFormProductosServiciosProductos=this.jButtonVerFormProductosServiciosProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosServiciosProductos=this.jButtonAbrirOrderByProductosServiciosProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=this.jButtonNuevoRelacionesProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaModificarProductosServiciosProductos=this.jButtonModificarProductosServiciosProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaGuardarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=this.jButtonGuardarCambiosTablaProductosServiciosProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=this.jButtonNuevoToolBarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=this.jButtonNuevoRelacionesToolBarProductosServiciosProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.isVisibilidadCeldaModificarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarToolBarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarToolBarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarToolBarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarToolBarProductosServiciosProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosServiciosProductos=this.jButtonGuardarCambiosToolBarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=this.jButtonGuardarCambiosTablaToolBarProductosServiciosProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=this.jMenuItemNuevoProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=this.jMenuItemNuevoRelacionesProductosServiciosProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.isVisibilidadCeldaModificarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemModificarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemActualizarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemEliminarProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemCancelarProductosServiciosProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosServiciosProductos=this.jMenuItemGuardarCambiosProductosServiciosProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=this.jMenuItemGuardarCambiosTablaProductosServiciosProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosServiciosProductos(Boolean esInicializar) {
		if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosServiciosProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosServiciosProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosServiciosProductos() {
		this.jButtonNuevoProductosServiciosProductos.setVisible(this.isPermisoNuevoProductosServiciosProductos);			
		this.jButtonDuplicarProductosServiciosProductos.setVisible(this.isPermisoDuplicarProductosServiciosProductos);			
		this.jButtonCopiarProductosServiciosProductos.setVisible(this.isPermisoCopiarProductosServiciosProductos);			
		this.jButtonVerFormProductosServiciosProductos.setVisible(this.isPermisoVerFormProductosServiciosProductos);			
		
		this.jButtonAbrirOrderByProductosServiciosProductos.setVisible(this.isPermisoOrdenProductosServiciosProductos);					
		
		this.jButtonNuevoRelacionesProductosServiciosProductos.setVisible(this.isPermisoNuevoProductosServiciosProductos);			
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarProductosServiciosProductos.setVisible(this.isPermisoActualizarProductosServiciosProductos);	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarProductosServiciosProductos.setVisible(this.isPermisoActualizarProductosServiciosProductos);	
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarProductosServiciosProductos.setVisible(this.isPermisoEliminarProductosServiciosProductos);
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarProductosServiciosProductos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosProductos);						
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.setVisible(this.isPermisoGuardarCambiosProductosServiciosProductos);							
		}
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.setVisible(this.isPermisoActualizarProductosServiciosProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosServiciosProductos() {
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarProductosServiciosProductos.setVisible(this.isPermisoActualizarProductosServiciosProductos);	
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarProductosServiciosProductos.setVisible(this.isPermisoActualizarProductosServiciosProductos);	
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarProductosServiciosProductos.setVisible(this.isPermisoEliminarProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarProductosServiciosProductos.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosProductos);							
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosProductos && this.isPermisoGuardarCambiosProductosServiciosProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosServiciosProductos() {
		if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosServiciosProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosServiciosProductos() {
	}
	
	public void jTableDatosProductosServiciosProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosServiciosProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productosserviciosproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productosserviciosproductos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productosserviciosproductos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productosserviciosproductos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.productosserviciosproductos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.productosserviciosproductos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.productosserviciosproductos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.productosserviciosproductos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_producto_servicioProductosServiciosProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproductoservicio=true;

			idTienePermisotipoproductoservicio=this.tienePermisosUsuarioEnPaginaWebProductosServiciosProductos(TipoProductoServicioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproductoservicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);

				this.tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoservicioBeanSwingJInternalFrame.getTipoProductoServicioLogic().setConnexion(this.productosserviciosproductosLogic.getConnexion());

				if(this.productosserviciosproductos.getid_tipo_producto_servicio()!=null) {
					this.tipoproductoservicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoservicioBeanSwingJInternalFrame.setIdActual(this.productosserviciosproductos.getid_tipo_producto_servicio());
					this.tipoproductoservicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProductoServicio();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoservicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosProductos=(TitledBorder)this.jScrollPanelDatosProductosServiciosProductos.getBorder();
				TitledBorder titledBordertipoproductoservicio=(TitledBorder)this.tipoproductoservicioBeanSwingJInternalFrame.jScrollPanelDatosTipoProductoServicio.getBorder();

				titledBordertipoproductoservicio.setTitle(titledBorderProductosServiciosProductos.getTitle() + " -> TIPOPRODUCTOSERVICIO");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_producto_servicioProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getid_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto_servicio = "+this.productosserviciosproductos.getid_tipo_producto_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.productosserviciosproductos.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.productosserviciosproductos.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.productosserviciosproductos.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.productosserviciosproductos.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.productosserviciosproductos.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.productosserviciosproductos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.productosserviciosproductos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_producto_servicio like '%"+this.productosserviciosproductos.getnombre_tipo_producto_servicio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.productosserviciosproductos.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProductosServiciosProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.getproductosserviciosproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosproductos==null) {
						this.productosserviciosproductos = new ProductosServiciosProductos();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);
				}

				if(this.productosserviciosproductos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.productosserviciosproductos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosServiciosProductosProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossBusquedaProductosServiciosProductos();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdBodega();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdEmpresa();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdLinea();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdLineaCategoria();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdLineaGrupo();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdLineaMarca();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdSucursal();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoServicioProductosServiciosProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);

			this.getProductosServiciosProductossFK_IdTipoProductoServicio();

			this.inicializarActualizarBindingProductosServiciosProductos(false);

			//if(ProductosServiciosProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosServiciosProductos() {
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosServiciosProductos.dispose();
			this.jInternalFrameDetalleFormProductosServiciosProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
			this.jInternalFrameReporteDinamicoProductosServiciosProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosServiciosProductos.dispose();
			this.jInternalFrameReporteDinamicoProductosServiciosProductos=null;
		}
		
		if(this.jInternalFrameImportacionProductosServiciosProductos!=null) {
			this.jInternalFrameImportacionProductosServiciosProductos.setVisible(false);	    			
			this.jInternalFrameImportacionProductosServiciosProductos.dispose();
			this.jInternalFrameImportacionProductosServiciosProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosServiciosProductos();
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosServiciosProductos")) {
				jButtonDuplicarProductosServiciosProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosServiciosProductos")) {
				jButtonCopiarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosServiciosProductos")) {
				jButtonVerFormProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosServiciosProductos")) {
				jButtonDuplicarProductosServiciosProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosServiciosProductos")) {
				jButtonDuplicarProductosServiciosProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosServiciosProductos")) {
				jButtonModificarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosServiciosProductos")) {
				jButtonModificarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosServiciosProductos")) {
				jButtonModificarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosServiciosProductos")) {
				jButtonActualizarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosServiciosProductos")) {
				jButtonActualizarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosServiciosProductos")) {
				jButtonActualizarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosServiciosProductos")) {
				jButtonEliminarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosServiciosProductos")) {
				jButtonEliminarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosServiciosProductos")) {
				jButtonEliminarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosServiciosProductos")) {
				jButtonCancelarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosServiciosProductos")) {
				jButtonCancelarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosServiciosProductos")) {
				jButtonCancelarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosServiciosProductos")) {
				jButtonCerrarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosServiciosProductos")) {
				jButtonCerrarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosServiciosProductos")) {
				jButtonCerrarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosServiciosProductos")) {
				jButtonMostrarOcultarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosServiciosProductos")) {
				jButtonCancelarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosServiciosProductos")) {
				jButtonCopiarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosServiciosProductos")) {
				jButtonVerFormProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosServiciosProductos")) {
				jButtonCopiarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosServiciosProductos")) {
				jButtonVerFormProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosServiciosProductos")) {
				jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosServiciosProductos")) {
				jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosServiciosProductos")) {
				jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosServiciosProductos")) {
				jButtonAnterioresProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosServiciosProductos")) {
				jButtonAnterioresProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosServiciosProductos")) {
				jButtonAnterioresProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosServiciosProductos")) {
				jButtonSiguientesProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosServiciosProductos")) {
				jButtonSiguientesProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosServiciosProductos")) {
				jButtonSiguientesProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosServiciosProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosServiciosProductos")) {
				jButtonAbrirOrderByProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosServiciosProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosServiciosProductos")) {
				jButtonMostrarOcultarProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosServiciosProductos")) {
				jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosServiciosProductos")) {
				jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosServiciosProductos")) {
				jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosServiciosProductos")) {
				jButtonCerrarReporteDinamicoProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosServiciosProductos")) {
				jButtonGenerarReporteDinamicoProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosServiciosProductos")) {
				
				jButtonGenerarExcelReporteDinamicoProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosServiciosProductos")) {
				jButtonCerrarImportacionProductosServiciosProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosServiciosProductos")) {
				
				jButtonGenerarImportacionProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosServiciosProductos")) {
				
				jButtonAbrirImportacionProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosServiciosProductos")) {
				jComboBoxTiposAccionesProductosServiciosProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosServiciosProductos")) {
				jComboBoxTiposRelacionesProductosServiciosProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosServiciosProductos")) {
				jComboBoxTiposAccionesProductosServiciosProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosServiciosProductos")) {
				
				jComboBoxTiposSeleccionarProductosServiciosProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosServiciosProductos")) {
				jTextFieldValorCampoGeneralProductosServiciosProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosServiciosProductos")) {
				jButtonAbrirOrderByProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosServiciosProductos")) {
				jButtonAbrirOrderByProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosServiciosProductos")) {
				jButtonCerrarOrderByProductosServiciosProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosServiciosProductosBusqueda")) {
				this.jButtonidProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosProductosUpdate")) {
				this.jButtonid_empresaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosProductosBusqueda")) {
				this.jButtonid_empresaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosProductosUpdate")) {
				this.jButtonid_sucursalProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosProductosBusqueda")) {
				this.jButtonid_sucursalProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosProductosUpdate")) {
				this.jButtonid_bodegaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosProductosBusqueda")) {
				this.jButtonid_bodegaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosProductosUpdate")) {
				this.jButtonid_lineaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosProductosBusqueda")) {
				this.jButtonid_lineaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosProductosUpdate")) {
				this.jButtonid_linea_grupoProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosProductosBusqueda")) {
				this.jButtonid_linea_grupoProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosProductosUpdate")) {
				this.jButtonid_linea_categoriaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosProductosBusqueda")) {
				this.jButtonid_linea_categoriaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosProductosUpdate")) {
				this.jButtonid_linea_marcaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosProductosBusqueda")) {
				this.jButtonid_linea_marcaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosProductosUpdate")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosProductosBusqueda")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_sucursalProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_lineaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_linea_grupoProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_linea_marcaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosServiciosProductosBusqueda")) {
				this.jButtoncodigoProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosServiciosProductosBusqueda")) {
				this.jButtonnombreProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_producto_servicioProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_bodegaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_unidadProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosServiciosProductosProductosServiciosProductos")) {
				this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductosActionPerformed(evt);
			}
			
			;
			
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosServiciosProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosServiciosProductos productosserviciosproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosserviciosproductosLocal=this.productosserviciosproductos;
			} else {
				productosserviciosproductosLocal=this.productosserviciosproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
							
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
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
			
			


			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
								
						
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
								
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
							
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
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
			
			


			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
								
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosServiciosProductos")) {
					jCheckBoxSeleccionarTodosProductosServiciosProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosServiciosProductos")) {
					jCheckBoxSeleccionadosProductosServiciosProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosServiciosProductos")) {
					
				}
				
				


				
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
												
				
				


				
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
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
			
			


			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosproductos);
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
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
				
				


				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosproductosAnterior =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosServiciosProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosServiciosProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosServiciosProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productosserviciosproductos =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productosserviciosproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosServiciosProductos")) {
				
				}
				
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosServiciosProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosServiciosProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosServiciosProductos")) {
			
			}
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosServiciosProductos();
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			if(sTipo.equals("NuevoProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosServiciosProductos")) {
				jButtonDuplicarProductosServiciosProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosServiciosProductos")) {
				jButtonCopiarProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosServiciosProductos")) {
				jButtonVerFormProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosServiciosProductos")) {
				jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosServiciosProductos")) {
				jButtonModificarProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosServiciosProductos")) {
				jButtonActualizarProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosServiciosProductos")) {
				jButtonEliminarProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosServiciosProductos")) {
				jButtonCancelarProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosServiciosProductos")) {
				jButtonCerrarProductosServiciosProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosServiciosProductos")) {
				jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosServiciosProductos")) {
				jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosServiciosProductos")) {
				jButtonAbrirOrderByProductosServiciosProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosServiciosProductos")) {
				jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosServiciosProductos")) {
				jButtonAnterioresProductosServiciosProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosServiciosProductos")) {
				jButtonSiguientesProductosServiciosProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosServiciosProductosBusqueda")) {
				this.jButtonidProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosProductosUpdate")) {
				this.jButtonid_empresaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosProductosBusqueda")) {
				this.jButtonid_empresaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosProductosUpdate")) {
				this.jButtonid_sucursalProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosProductosBusqueda")) {
				this.jButtonid_sucursalProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosProductosUpdate")) {
				this.jButtonid_bodegaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosProductosBusqueda")) {
				this.jButtonid_bodegaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosProductosUpdate")) {
				this.jButtonid_lineaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosProductosBusqueda")) {
				this.jButtonid_lineaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosProductosUpdate")) {
				this.jButtonid_linea_grupoProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosProductosBusqueda")) {
				this.jButtonid_linea_grupoProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosProductosUpdate")) {
				this.jButtonid_linea_categoriaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosProductosBusqueda")) {
				this.jButtonid_linea_categoriaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosProductosUpdate")) {
				this.jButtonid_linea_marcaProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosProductosBusqueda")) {
				this.jButtonid_linea_marcaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosProductosUpdate")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosProductosBusqueda")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_sucursalProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_lineaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_linea_grupoProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_linea_marcaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosServiciosProductosBusqueda")) {
				this.jButtoncodigoProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosServiciosProductosBusqueda")) {
				this.jButtonnombreProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_producto_servicioProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_bodegaProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosServiciosProductosBusqueda")) {
				this.jButtonnombre_unidadProductosServiciosProductosBusquedaActionPerformed(evt);
			}
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosServiciosProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosServiciosProductos")) {
				closingInternalFrameProductosServiciosProductos();
				
			} else if(sTipo.equals("jButtonCancelarProductosServiciosProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosServiciosProductos = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosServiciosProductosBeanSwingJInternalFrame jInternalFrameParent=(ProductosServiciosProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosServiciosProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosServiciosProductosActionPerformed(null);
			}
			
			ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosserviciosproductos,new Object(),this.productosserviciosproductosParameterGeneral,this.productosserviciosproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosServiciosProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosServiciosProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosServiciosProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productosserviciosproductos)) {
			if(!esControlTabla) {
				if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);			
				}
				
				if(this.productosserviciosproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosServiciosProductos(this.productosserviciosproductosReturnGeneral,this.productosserviciosproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosserviciosproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosServiciosProductos(classes,this.productosserviciosproductosReturnGeneral,this.productosserviciosproductosBean,false);
					}
						
					if(this.productosserviciosproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosProductos(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos());	
					}
						
					if(this.productosserviciosproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos(),classes);//this.productosserviciosproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosProductos(this.productosserviciosproductos,classes);//this.productosserviciosproductosBean);									
				}
			
				if(ProductosServiciosProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosServiciosProductos(this.productosserviciosproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosProductos(this.productosserviciosproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosserviciosproductosAnterior!=null) {
						this.productosserviciosproductos=this.productosserviciosproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosserviciosproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosserviciosproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos(),productosserviciosproductosLogic.getProductosServiciosProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductos(),this.productosserviciosproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosServiciosProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosServiciosProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosServiciosProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosServiciosProductos() throws Exception {
		
		ProductosServiciosProductosModel productosserviciosproductosModel=(ProductosServiciosProductosModel)this.jTableDatosProductosServiciosProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciosproductosModel.productosserviciosproductoss=this.productosserviciosproductosLogic.getProductosServiciosProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosserviciosproductosModel.productosserviciosproductoss=this.productosserviciosproductoss;
		}
		
		
		((ProductosServiciosProductosModel) this.jTableDatosProductosServiciosProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosServiciosProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosserviciosproductosAnterior(),this.productosserviciosproductosLogic.getProductosServiciosProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosserviciosproductosAnterior(),this.productosserviciosproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosServiciosProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
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
										
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosserviciosproductos,new Object(),generalEntityParameterGeneral,this.productosserviciosproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosServiciosProductosConstantesFunciones.getClassesRelationshipsOfProductosServiciosProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosServiciosProductosConstantesFunciones.getClassesRelationshipsFromStringsOfProductosServiciosProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosServiciosProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosServiciosProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosserviciosproductos,new Object(),generalEntityParameterGeneral,this.productosserviciosproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosServiciosProductos(ProductosServiciosProductosBean productosserviciosproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosServiciosProductos(ArrayList<Classe> classes,ProductosServiciosProductosReturnGeneral productosserviciosproductosReturnGeneral,ProductosServiciosProductosBean productosserviciosproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productosserviciosproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosServiciosProductos = new ProductosServiciosProductosDetalleFormJInternalFrame(jDesktopPane,this.productosserviciosproductosSessionBean.getConGuardarRelaciones(),this.productosserviciosproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.setVisible(false);
		this.jInternalFrameDetalleFormProductosServiciosProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.productosserviciosproductosLogic=this.productosserviciosproductosLogic;
		
		this.cargarCombosFrameForeignKeyProductosServiciosProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosServiciosProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosServiciosProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosServiciosProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosServiciosProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosServiciosProductos"));
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"ModificarProductosServiciosProductos"));

		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosServiciosProductos"));
					
		this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemModificarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosServiciosProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"ActualizarProductosServiciosProductos"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosServiciosProductos"));
						
		this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemActualizarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosServiciosProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"EliminarProductosServiciosProductos"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosServiciosProductos"));
								
		this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemEliminarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosServiciosProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CancelarProductosServiciosProductos"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosServiciosProductos"));
					
		this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemCancelarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosServiciosProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemDetalleCerrarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosServiciosProductos"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosProductos"));
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosProductos"));
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosServiciosProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonidProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_empresaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_empresaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_sucursalProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_sucursalProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_bodegaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_bodegaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_lineaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_lineaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_grupoProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_grupoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_categoriaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_marcaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_marcaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_sucursalProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_lineaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtoncodigoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombreProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_producto_servicioProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_bodegaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_unidadProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosServiciosProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosServiciosProductos"));
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosServiciosProductos"));
		}
		
		this.jTableDatosProductosServiciosProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosServiciosProductos"));
		
		this.jTableDatosProductosServiciosProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosServiciosProductos"));
		
		this.jButtonNuevoProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"NuevoProductosServiciosProductos"));
		
		this.jButtonDuplicarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"DuplicarProductosServiciosProductos"));
		
		this.jButtonCopiarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"CopiarProductosServiciosProductos"));
		
		this.jButtonVerFormProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"VerFormProductosServiciosProductos"));
		
		
		this.jButtonNuevoToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosServiciosProductos"));
			
		this.jButtonDuplicarToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosServiciosProductos"));
			
		this.jMenuItemNuevoProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosServiciosProductos"));
			
		this.jMenuItemDuplicarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosServiciosProductos"));		
		
		
		this.jButtonNuevoRelacionesProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosServiciosProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosServiciosProductos"));
			
		this.jMenuItemNuevoRelacionesProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosServiciosProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"ModificarProductosServiciosProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonModificarToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosServiciosProductos"));
			
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemModificarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosServiciosProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"ActualizarProductosServiciosProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonActualizarToolBarProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosServiciosProductos"));
				
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemActualizarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosServiciosProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"EliminarProductosServiciosProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonEliminarToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosServiciosProductos"));
						
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemEliminarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosServiciosProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CancelarProductosServiciosProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonCancelarToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosServiciosProductos"));
			
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemCancelarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosServiciosProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosServiciosProductos"));		
		
		
		this.jButtonCerrarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CerrarProductosServiciosProductos"));
		
		
		this.jButtonCerrarToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosServiciosProductos"));
			
		this.jMenuItemCerrarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosServiciosProductos"));
			
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jMenuItemDetalleCerrarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosServiciosProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosServiciosProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosProductos"));
		}
		
		this.jButtonCopiarToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosServiciosProductos"));
			
		this.jButtonVerFormToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosServiciosProductos"));
		
		this.jMenuItemGuardarCambiosProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosServiciosProductos"));
			
		this.jMenuItemCopiarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosServiciosProductos"));		
		
		this.jMenuItemVerFormProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosServiciosProductos"));		
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosServiciosProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosServiciosProductos"));
			
		this.jMenuItemGuardarCambiosTablaProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosServiciosProductos"));		
		
		
		
		this.jButtonRecargarInformacionProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosServiciosProductos"));
					
		this.jButtonRecargarInformacionToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosServiciosProductos"));
		
		this.jMenuItemRecargarInformacionProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosServiciosProductos"));		
		
		
		
		this.jButtonAnterioresProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"AnterioresProductosServiciosProductos"));
		
		
		this.jButtonAnterioresToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosServiciosProductos"));
		
		this.jMenuItemAnterioresProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosServiciosProductos"));		
		
		
		this.jButtonSiguientesProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"SiguientesProductosServiciosProductos"));
		
		
		this.jButtonSiguientesToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosServiciosProductos"));
			
		this.jMenuItemSiguientesProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosServiciosProductos"));
			
		this.jMenuItemAbrirOrderByProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosServiciosProductos"));
			
		this.jMenuItemMostrarOcultarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosServiciosProductos"));
			
		this.jMenuItemDetalleAbrirOrderByProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosServiciosProductos"));
			
		this.jMenuItemDetalleMostarOcultarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosServiciosProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosServiciosProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosServiciosProductos"));
			
		this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosServiciosProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosServiciosProductos"));

		this.jCheckBoxSeleccionadosProductosServiciosProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosServiciosProductos"));
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosServiciosProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosServiciosProductos"));
			
		this.jComboBoxTiposAccionesProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosServiciosProductos"));
					
		this.jComboBoxTiposSeleccionarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosServiciosProductos"));
			
		this.jTextFieldValorCampoGeneralProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosServiciosProductos"));		
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonidProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_empresaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_empresaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_sucursalProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_sucursalProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_bodegaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_bodegaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_lineaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_lineaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_grupoProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_grupoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_categoriaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_marcaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_marcaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_sucursalProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_lineaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtoncodigoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombreProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_producto_servicioProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_bodegaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_unidadProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"BusquedaProductosServiciosProductosProductosServiciosProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosProductos!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosProductos"));
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosProductos"));
				this.jInternalFrameReporteDinamicoProductosServiciosProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosProductos"));				
			//this.jButtonGenerarReporteDinamicoProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosProductos"));
			//this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosServiciosProductos!=null) {
				this.jInternalFrameImportacionProductosServiciosProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosServiciosProductos"));
				this.jInternalFrameImportacionProductosServiciosProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosServiciosProductos"));
				this.jInternalFrameImportacionProductosServiciosProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosServiciosProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosServiciosProductos"));
			
			this.jButtonAbrirOrderByToolBarProductosServiciosProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosServiciosProductos"));			
			
			if(this.jInternalFrameOrderByProductosServiciosProductos!=null) {
				this.jInternalFrameOrderByProductosServiciosProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosServiciosProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosProductos.jTabbedPaneRelacionesProductosServiciosProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosServiciosProductos"));
		
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
            		closingInternalFrameProductosServiciosProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosServiciosProductos = (JInternalFrameBase)event.getSource();
	            	
	            ProductosServiciosProductosBeanSwingJInternalFrame jInternalFrameParent=(ProductosServiciosProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosServiciosProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosServiciosProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosServiciosProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosServiciosProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosServiciosProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosServiciosProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosServiciosProductos";
		inputMap = this.jButtonNuevoProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosServiciosProductos";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosServiciosProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosServiciosProductos";
		inputMap = this.jButtonModificarProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosServiciosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosServiciosProductos";
		inputMap = this.jButtonActualizarProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosServiciosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosServiciosProductos";
		inputMap = this.jButtonEliminarProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosServiciosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosServiciosProductos";
		inputMap = this.jButtonCancelarProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosServiciosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosServiciosProductos";
		inputMap = this.jButtonCerrarProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosServiciosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosServiciosProductos";
		inputMap = this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonGuardarCambiosProductosServiciosProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosServiciosProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosServiciosProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosServiciosProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosServiciosProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosServiciosProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosServiciosProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosServiciosProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosServiciosProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosServiciosProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonidProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_empresaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_empresaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_sucursalProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_sucursalProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_bodegaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_bodegaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_lineaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_lineaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_grupoProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_grupoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_categoriaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_categoriaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_marcaProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_linea_marcaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_tipo_producto_servicioProductosServiciosProductosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonid_tipo_producto_servicioProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_sucursalProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_lineaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_grupoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_categoriaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_linea_marcaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtoncodigoProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombreProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_tipo_producto_servicioProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_producto_servicioProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_bodegaProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosProductos.jButtonnombre_unidadProductosServiciosProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosProductosBusqueda"));
		
		
		this.jButtonBusquedaProductosServiciosProductosProductosServiciosProductos.addActionListener(new ButtonActionListener(this,"BusquedaProductosServiciosProductosProductosServiciosProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosServiciosProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosServiciosProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosServiciosProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosServiciosProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosServiciosProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
					productosserviciosproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductoss) {
					productosserviciosproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosServiciosProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
						productosserviciosproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductoss) {
						productosserviciosproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosServiciosProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosServiciosProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosServiciosProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosServiciosProductos.getSelectedRows();
			
			ProductosServiciosProductos productosserviciosproductosLocal=new ProductosServiciosProductos();
			
			//this.seleccionarTodosProductosServiciosProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosserviciosproductosLocal =(ProductosServiciosProductos) this.productosserviciosproductosLogic.getProductosServiciosProductoss().toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosserviciosproductosLocal =(ProductosServiciosProductos) this.productosserviciosproductoss.toArray()[this.jTableDatosProductosServiciosProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosserviciosproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
						productosserviciosproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductoss) {
						productosserviciosproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosServiciosProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosServiciosProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosServiciosProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosServiciosProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosServiciosProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosServiciosProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductosLogic.getProductosServiciosProductoss()) {
				
						if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosserviciosproductosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosserviciosproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosserviciosproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO)) {
							existe=true;
							productosserviciosproductosAux.setnombre_tipo_producto_servicio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosserviciosproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductoss) {
					
						if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosserviciosproductosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosserviciosproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosserviciosproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO)) {
							existe=true;
							productosserviciosproductosAux.setnombre_tipo_producto_servicio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosserviciosproductosAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosserviciosproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosServiciosProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosServiciosProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosServiciosProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosServiciosProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosServiciosProductos(conSplash);
				
					this.generarReporteProductosServiciosProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosServiciosProductossSeleccionados();
				//this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosServiciosProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosServiciosProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosServiciosProductos();
				
				this.exportarProductosServiciosProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosServiciosProductoss();
				//this.importarProductosServiciosProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosServiciosProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosServiciosProductossSeleccionados();
				//this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Servicios Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosServiciosProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosServiciosProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosServiciosProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosServiciosProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosServiciosProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosServiciosProductos(conSplash);
					
						//this.actualizarParametrosGeneralProductosServiciosProductos();
						
						this.generarReporteProcesoAccionProductosServiciosProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosServiciosProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos Servicios ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Productos Servicios Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosServiciosProductos();
				
						this.actualizarParametrosGeneralProductosServiciosProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosserviciosproductosReturnGeneral=productosserviciosproductosLogic.procesarAccionProductosServiciosProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosserviciosproductosLogic.getProductosServiciosProductoss(),this.productosserviciosproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosServiciosProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosServiciosProductos();
					
					ProductosServiciosProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosServiciosProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosServiciosProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxTiposAccionesFormularioProductosServiciosProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosServiciosProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosServiciosProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosServiciosProductos();
			
			if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
			ProductosServiciosProductos productosserviciosproductos=new ProductosServiciosProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosServiciosProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosServiciosProductos.getSelectedItem();
			
			
			
			
			productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(productosserviciosproductossSeleccionados.size()==1) {
				for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossSeleccionados) {
					productosserviciosproductos=productosserviciosproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosServiciosProductos();
			
      		//this.finishProcessProductosServiciosProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosServiciosProductosReturnGeneral() throws Exception {
		if(this.productosserviciosproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosserviciosproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosserviciosproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosserviciosproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosserviciosproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosserviciosproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosServiciosProductos(false);
		}
		
		if(this.productosserviciosproductosReturnGeneral.getConRetornoLista() || this.productosserviciosproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.productosserviciosproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosserviciosproductosLogic.setProductosServiciosProductoss(this.productosserviciosproductosReturnGeneral.getProductosServiciosProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosServiciosProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosServiciosProductos() throws Exception {
		
		
	}
	
	public ArrayList<ProductosServiciosProductos> getProductosServiciosProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosServiciosProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductosLogic.getProductosServiciosProductoss()) {
					if(productosserviciosproductosAux.getIsSelected()) {
						productosserviciosproductossSeleccionados.add(productosserviciosproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosProductos productosserviciosproductosAux:this.productosserviciosproductoss) {
					if(productosserviciosproductosAux.getIsSelected()) {
						productosserviciosproductossSeleccionados.add(productosserviciosproductosAux);				
					}
				}
			}
			
			if(productosserviciosproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productosserviciosproductossSeleccionados.addAll(this.productosserviciosproductosLogic.getProductosServiciosProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productosserviciosproductossSeleccionados.addAll(this.productosserviciosproductoss);				
					}
				}
			}
		} else {
			productosserviciosproductossSeleccionados.add(this.productosserviciosproductos);
		}
		
		return productosserviciosproductossSeleccionados;
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
	
	public void generarReporteProductosServiciosProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosServiciosProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosServiciosProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosServiciosProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosServiciosProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Servicios Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosServiciosProductossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosServiciosProductossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosServiciosProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosServiciosProductossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosServiciosProductos();
		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosServiciosProductos();
		
		
		//this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados ,productosserviciosproductosImplementable,productosserviciosproductosImplementableHome);
	}
	
	public void mostrarImportacionProductosServiciosProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosServiciosProductos();
		
		this.abrirFrameImportacionProductosServiciosProductos();		
		
			
		//this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados ,productosserviciosproductosImplementable,productosserviciosproductosImplementableHome);
	}
	
	public void importarProductosServiciosProductoss() throws Exception {		
	
	}
	
	public void exportarProductosServiciosProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosServiciosProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosServiciosProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosServiciosProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Servicios Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosServiciosProductossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosServiciosProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosServiciosProductos(productosserviciosproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosserviciosproductosAux.setsDetalleGeneralEntityReporte(productosserviciosproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosServiciosProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productosserviciosproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.gettipoproductoservicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_tipo_producto_servicio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosproductos.getnombre_unidad();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosServiciosProductossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosServiciosProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosServiciosProductos(row);				
				iRow++;
			}				
			
			for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosServiciosProductos(productosserviciosproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosServiciosProductossSeleccionados() throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();		
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productosserviciosproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productosserviciosproductos");
			//elementRoot.appendChild(element);
		
			for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossSeleccionados) {
				element = document.createElement("productosserviciosproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosServiciosProductos(productosserviciosproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosServiciosProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.gettipoproductoservicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_tipo_producto_servicio());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosproductos.getnombre_unidad());				
	}
	
	public void setFilaDatosExportarXmlProductosServiciosProductos(ProductosServiciosProductos productosserviciosproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosServiciosProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productosserviciosproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosServiciosProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productosserviciosproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementlinea_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(productosserviciosproductos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementtipoproductoservicio_descripcion = document.createElement(ProductosServiciosProductosConstantesFunciones.IDTIPOPRODUCTOSERVICIO);
		elementtipoproductoservicio_descripcion.appendChild(document.createTextNode(productosserviciosproductos.gettipoproductoservicio_descripcion()));
		element.appendChild(elementtipoproductoservicio_descripcion);

		Element elementnombre_sucursal = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(productosserviciosproductos.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_linea = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(productosserviciosproductos.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(productosserviciosproductos.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(productosserviciosproductos.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(productosserviciosproductos.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(ProductosServiciosProductosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(productosserviciosproductos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(productosserviciosproductos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_tipo_producto_servicio = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBRETIPOPRODUCTOSERVICIO);
		elementnombre_tipo_producto_servicio.appendChild(document.createTextNode(productosserviciosproductos.getnombre_tipo_producto_servicio().trim()));
		element.appendChild(elementnombre_tipo_producto_servicio);

		Element elementnombre_bodega = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(productosserviciosproductos.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_unidad = document.createElement(ProductosServiciosProductosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(productosserviciosproductos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);
	}
	
	public void generarReporteGroupGenericoProductosServiciosProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados=new ArrayList<ProductosServiciosProductos>();
		
		productosserviciosproductossSeleccionados=this.getProductosServiciosProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosServiciosProductos(productosserviciosproductossSeleccionados);
		
		this.generarReporteProductosServiciosProductoss("Todos",productosserviciosproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosServiciosProductos(ArrayList<ProductosServiciosProductos> productosserviciosproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosServiciosProductos productosserviciosproductosAux:productosserviciosproductossSeleccionados) {
				productosserviciosproductosAux.setsDetalleGeneralEntityReporte(productosserviciosproductosAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.gettipoproductoservicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_tipo_producto_servicio());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					productosserviciosproductosAux.setsDescripcionGeneralEntityReporte1(productosserviciosproductosAux.getnombre_unidad());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosServiciosProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosServiciosProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=true;
				this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=true;
			}
			
			this.isVisibilidadCeldaModificarProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
			this.isVisibilidadCeldaModificarProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=true;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
			this.isVisibilidadCeldaModificarProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=true;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=true;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
			this.isVisibilidadCeldaModificarProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=true;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=true;
			this.isVisibilidadCeldaModificarProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
			this.isVisibilidadCeldaModificarProductosServiciosProductos=true;
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
			this.isVisibilidadCeldaCancelarProductosServiciosProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosServiciosProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=true;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=true;
		} else {
			this.actualizarEstadoPanelsProductosServiciosProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosServiciosProductos=false;
			//this.isVisibilidadCeldaVerFormProductosServiciosProductos=false;
			this.isVisibilidadCeldaDuplicarProductosServiciosProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosserviciosproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			if(!productosserviciosproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;												
			}
			
			this.jButtonCerrarProductosServiciosProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.productosserviciosproductos)) {
			this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
			this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosServiciosProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosServiciosProductos=false;
		this.isVisibilidadCeldaGuardarCambiosProductosServiciosProductos=false;
		//this.isVisibilidadCeldaModificarProductosServiciosProductos=true;
		this.isVisibilidadCeldaActualizarProductosServiciosProductos=false;
		this.isVisibilidadCeldaEliminarProductosServiciosProductos=false;
		//this.isVisibilidadCeldaCancelarProductosServiciosProductos=true;			
		this.isVisibilidadCeldaGuardarProductosServiciosProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosServiciosProductos() {
	}
	
	public void actualizarEstadoPanelsProductosServiciosProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosServiciosProductos!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosProductos!=null) {
				this.jScrollPanelDatosProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosProductos!=null) {
				this.jPanelPaginacionProductosServiciosProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
					this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosserviciosproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosProductos!=null) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosServiciosProductos!=null) {
				this.jPanelParametrosReportesProductosServiciosProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaBodega;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaLinea;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProductoServicio(Boolean isParaTipoProductoServicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoServicioNegation=!isParaTipoProductoServicio;

			this.isVisibilidadBusquedaProductosServiciosProductos=isParaTipoProductoServicio;
			if(!this.isVisibilidadBusquedaProductosServiciosProductos) {this.jTabbedPaneBusquedasProductosServiciosProductos.remove(jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);}
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
			
			this.inicializarActualizarBindingTablaProductosServiciosProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosServiciosProductos() {
		this.updateBorderResaltarBusquedasFormularioProductosServiciosProductos();
		this.updateVisibilidadBusquedasFormularioProductosServiciosProductos();
		this.updateHabilitarBusquedasFormularioProductosServiciosProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosServiciosProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosServiciosProductos.getComponents().length>0) {
	

		if(this.productosserviciosproductosConstantesFunciones.resaltarBusquedaProductosServiciosProductosProductosServiciosProductos!=null) {
			index= this.jTabbedPaneBusquedasProductosServiciosProductos.indexOfComponent(this.jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosProductos.getComponent(index);
				jPanel.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarBusquedaProductosServiciosProductosProductosServiciosProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosServiciosProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosServiciosProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosServiciosProductos.indexOfComponent(this.jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarBusquedaProductosServiciosProductosProductosServiciosProductos);
			if(!this.productosserviciosproductosConstantesFunciones.mostrarBusquedaProductosServiciosProductosProductosServiciosProductos && index>-1) {
				this.jTabbedPaneBusquedasProductosServiciosProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosServiciosProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosServiciosProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosServiciosProductos.indexOfComponent(this.jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosserviciosproductosConstantesFunciones.activarBusquedaProductosServiciosProductosProductosServiciosProductos);
				this.jTabbedPaneBusquedasProductosServiciosProductos.setEnabledAt(index,this.productosserviciosproductosConstantesFunciones.activarBusquedaProductosServiciosProductosProductosServiciosProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosServiciosProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosServiciosProductos")) {
			index= this.jTabbedPaneBusquedasProductosServiciosProductos.indexOfComponent(this.jPanelBusquedaProductosServiciosProductosProductosServiciosProductos);

			this.jTabbedPaneBusquedasProductosServiciosProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosProductos.getComponent(index);

			this.productosserviciosproductosConstantesFunciones.setResaltarBusquedaProductosServiciosProductosProductosServiciosProductos(resaltar);

			jPanel.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarBusquedaProductosServiciosProductosProductosServiciosProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosServiciosProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosServiciosProductos() throws Exception {

		if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosServiciosProductos();
		this.updateVisibilidadResaltarControlesFormularioProductosServiciosProductos();
		this.updateHabilitarResaltarControlesFormularioProductosServiciosProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosServiciosProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosserviciosproductosConstantesFunciones.resaltaridProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltaridProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_empresaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_empresaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_sucursalProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_sucursalProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_bodegaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_bodegaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_lineaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_lineaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_linea_grupoProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_linea_grupoProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_linea_categoriaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_linea_categoriaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_linea_marcaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_linea_marcaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarid_tipo_producto_servicioProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarid_tipo_producto_servicioProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_sucursalProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_sucursalProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_lineaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_lineaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarcodigoProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarcodigoProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombreProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombreProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_bodegaProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_bodegaProductosServiciosProductos);}
		if(this.productosserviciosproductosConstantesFunciones.resaltarnombre_unidadProductosServiciosProductos!=null && this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setBorder(this.productosserviciosproductosConstantesFunciones.resaltarnombre_unidadProductosServiciosProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosServiciosProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
	
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostraridProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelidProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostraridProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_empresaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_empresaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_empresaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_sucursalProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_sucursalProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_sucursalProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_bodegaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_bodegaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_bodegaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_lineaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_lineaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_lineaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_linea_grupoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_linea_grupoProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_linea_grupoProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_linea_categoriaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_linea_categoriaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_linea_categoriaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_linea_marcaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_linea_marcaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_linea_marcaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_tipo_producto_servicioProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelid_tipo_producto_servicioProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarid_tipo_producto_servicioProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_sucursalProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_sucursalProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_sucursalProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_lineaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_lineaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_lineaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_grupoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_linea_grupoProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_grupoProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_categoriaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_linea_categoriaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_categoriaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_marcaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_linea_marcaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_linea_marcaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarcodigoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelcodigoProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarcodigoProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombreProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombreProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombreProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_tipo_producto_servicioProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_tipo_producto_servicioProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_tipo_producto_servicioProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_bodegaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_bodegaProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_bodegaProductosServiciosProductos);
		//this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_unidadProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jPanelnombre_unidadProductosServiciosProductos.setVisible(this.productosserviciosproductosConstantesFunciones.mostrarnombre_unidadProductosServiciosProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosServiciosProductos() throws Exception {
		if(this.jInternalFrameDetalleFormProductosServiciosProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosProductos!=null) {
	
		this.jInternalFrameDetalleFormProductosServiciosProductos.jLabelidProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activaridProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_empresaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_empresaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_sucursalProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_sucursalProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_bodegaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_bodegaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_lineaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_lineaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_grupoProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_linea_grupoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_categoriaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_linea_categoriaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_linea_marcaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_linea_marcaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jComboBoxid_tipo_producto_servicioProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarid_tipo_producto_servicioProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_sucursalProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_sucursalProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_lineaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_lineaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_grupoProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_linea_grupoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_categoriaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_linea_categoriaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_linea_marcaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_linea_marcaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldcodigoProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarcodigoProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombreProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombreProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_tipo_producto_servicioProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextAreanombre_bodegaProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_bodegaProductosServiciosProductos);
		this.jInternalFrameDetalleFormProductosServiciosProductos.jTextFieldnombre_unidadProductosServiciosProductos.setEnabled(this.productosserviciosproductosConstantesFunciones.activarnombre_unidadProductosServiciosProductos);
		}
	}
	
		
}