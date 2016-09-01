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

//import com.bydan.erp.inventario.util.ProductosServiciosDisponiblesConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProductosServiciosDisponiblesParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProductosServiciosDisponiblesParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProductosServiciosDisponiblesBean;
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
public class ProductosServiciosDisponiblesBeanSwingJInternalFrame extends ProductosServiciosDisponiblesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductosServiciosDisponiblesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductosServiciosDisponibles> productosserviciosdisponiblesValidator = new ClassValidator<ProductosServiciosDisponibles>(ProductosServiciosDisponibles.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductosServiciosDisponibles productosserviciosdisponibles;	
	public ProductosServiciosDisponibles productosserviciosdisponiblesAux;
	public ProductosServiciosDisponibles productosserviciosdisponiblesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductosServiciosDisponibles productosserviciosdisponiblesTotales;
	public Long idProductosServiciosDisponiblesActual;
	public Long iIdNuevoProductosServiciosDisponibles=0L;
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
	
	public Boolean isPermisoTodoProductosServiciosDisponibles;
	public Boolean isPermisoNuevoProductosServiciosDisponibles;
	public Boolean isPermisoActualizarProductosServiciosDisponibles;
	public Boolean isPermisoActualizarOriginalProductosServiciosDisponibles;
	public Boolean isPermisoEliminarProductosServiciosDisponibles;
	public Boolean isPermisoGuardarCambiosProductosServiciosDisponibles;
	public Boolean isPermisoConsultaProductosServiciosDisponibles;
	public Boolean isPermisoBusquedaProductosServiciosDisponibles;
	public Boolean isPermisoReporteProductosServiciosDisponibles;
	public Boolean isPermisoPaginacionMedioProductosServiciosDisponibles;
	public Boolean isPermisoPaginacionAltoProductosServiciosDisponibles;
	public Boolean isPermisoPaginacionTodoProductosServiciosDisponibles;
	public Boolean isPermisoCopiarProductosServiciosDisponibles;
	public Boolean isPermisoVerFormProductosServiciosDisponibles;
	public Boolean isPermisoDuplicarProductosServiciosDisponibles;
	public Boolean isPermisoOrdenProductosServiciosDisponibles;
	
	
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
	
	public ProductosServiciosDisponiblesParameterReturnGeneral productosserviciosdisponiblesReturnGeneral;
	public ProductosServiciosDisponiblesParameterReturnGeneral productosserviciosdisponiblesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductosServiciosDisponibles=false;
	public Boolean esParaAccionDesdeFormularioProductosServiciosDisponibles=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductosServiciosDisponiblesSessionBeanAdditional productosserviciosdisponiblesSessionBeanAdditional=null;
	
	public ProductosServiciosDisponiblesSessionBeanAdditional getProductosServiciosDisponiblesSessionBeanAdditional() {
		return this.productosserviciosdisponiblesSessionBeanAdditional;
	}
	
	public void setProductosServiciosDisponiblesSessionBeanAdditional(ProductosServiciosDisponiblesSessionBeanAdditional productosserviciosdisponiblesSessionBeanAdditional) {
		try {
			this.productosserviciosdisponiblesSessionBeanAdditional=productosserviciosdisponiblesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional productosserviciosdisponiblesBeanSwingJInternalFrameAdditional=null;
	//public class ProductosServiciosDisponiblesBeanSwingJInternalFrame
	
	public ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional getProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional() {
		return this.productosserviciosdisponiblesBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional(ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional productosserviciosdisponiblesBeanSwingJInternalFrameAdditional) {
		try {
			this.productosserviciosdisponiblesBeanSwingJInternalFrameAdditional=productosserviciosdisponiblesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductosServiciosDisponiblesLogic productosserviciosdisponiblesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductosServiciosDisponibles productosserviciosdisponiblesBean;
	public ProductosServiciosDisponiblesConstantesFunciones productosserviciosdisponiblesConstantesFunciones;
	//public ProductosServiciosDisponiblesParameterReturnGeneral productosserviciosdisponiblesReturnGeneral;
	
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
	
	
	//public List<ProductosServiciosDisponibles> productosserviciosdisponibless;	
	//public List<ProductosServiciosDisponibles> productosserviciosdisponiblessEliminados;
	//public List<ProductosServiciosDisponibles> productosserviciosdisponiblessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
	public Boolean isVisibilidadCeldaDuplicarProductosServiciosDisponibles=true;
	public Boolean isVisibilidadCeldaCopiarProductosServiciosDisponibles=true;
	public Boolean isVisibilidadCeldaVerFormProductosServiciosDisponibles=true;
	public Boolean isVisibilidadCeldaOrdenProductosServiciosDisponibles=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
	public Boolean isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
	public Boolean isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
	public Boolean isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
	public Boolean isVisibilidadCeldaCancelarProductosServiciosDisponibles=false;
	public Boolean isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;	
	
	
	public Boolean isVisibilidadBusquedaProductosServiciosDisponibles=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoProductoServicio=false;
	
	public Long getiIdNuevoProductosServiciosDisponibles() {
		return this.iIdNuevoProductosServiciosDisponibles;
	}

	public void setiIdNuevoProductosServiciosDisponibles(Long iIdNuevoProductosServiciosDisponibles) {
		this.iIdNuevoProductosServiciosDisponibles = iIdNuevoProductosServiciosDisponibles;
	}
	
	public Long getidProductosServiciosDisponiblesActual() {
		return this.idProductosServiciosDisponiblesActual;
	}

	public void setidProductosServiciosDisponiblesActual(Long idProductosServiciosDisponiblesActual) {
		this.idProductosServiciosDisponiblesActual = idProductosServiciosDisponiblesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductosServiciosDisponibles getproductosserviciosdisponibles() {
		return this.productosserviciosdisponibles;
	}

	public void setproductosserviciosdisponibles(ProductosServiciosDisponibles productosserviciosdisponibles) {
		this.productosserviciosdisponibles = productosserviciosdisponibles;
	}
	
	public ProductosServiciosDisponibles getproductosserviciosdisponiblesAux() {
		return this.productosserviciosdisponiblesAux;
	}

	public void setproductosserviciosdisponiblesAux(ProductosServiciosDisponibles productosserviciosdisponiblesAux) {
		this.productosserviciosdisponiblesAux = productosserviciosdisponiblesAux;
	}				
	
	public ProductosServiciosDisponibles getproductosserviciosdisponiblesAnterior() {
		return this.productosserviciosdisponiblesAnterior;
	}

	public void setproductosserviciosdisponiblesAnterior(ProductosServiciosDisponibles productosserviciosdisponiblesAnterior) {
		this.productosserviciosdisponiblesAnterior = productosserviciosdisponiblesAnterior;
	}	
	
	public ProductosServiciosDisponibles getproductosserviciosdisponiblesTotales() {
		return this.productosserviciosdisponiblesTotales;
	}

	public void setproductosserviciosdisponiblesTotales(ProductosServiciosDisponibles productosserviciosdisponiblesTotales) {
		this.productosserviciosdisponiblesTotales = productosserviciosdisponiblesTotales;
	}	
	
	public ProductosServiciosDisponibles getproductosserviciosdisponiblesBean() {
		return this.productosserviciosdisponiblesBean;
	}

	public void setproductosserviciosdisponiblesBean(ProductosServiciosDisponibles productosserviciosdisponiblesBean) {
		this.productosserviciosdisponiblesBean = productosserviciosdisponiblesBean;
	}	
	
	public ProductosServiciosDisponiblesParameterReturnGeneral getproductosserviciosdisponiblesReturnGeneral() {
		return this.productosserviciosdisponiblesReturnGeneral;
	}

	public void setproductosserviciosdisponiblesReturnGeneral(ProductosServiciosDisponiblesParameterReturnGeneral productosserviciosdisponiblesReturnGeneral) {
		this.productosserviciosdisponiblesReturnGeneral = productosserviciosdisponiblesReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProductosServiciosDisponibles=-1L;

	public Long getid_bodegaBusquedaProductosServiciosDisponibles() {
		return this.id_bodegaBusquedaProductosServiciosDisponibles;
	}

	public void setid_bodegaBusquedaProductosServiciosDisponibles(Long id_bodegaBusquedaProductosServiciosDisponibles) {
		this.id_bodegaBusquedaProductosServiciosDisponibles = id_bodegaBusquedaProductosServiciosDisponibles;
	}

;
	public Long id_lineaBusquedaProductosServiciosDisponibles=-1L;

	public Long getid_lineaBusquedaProductosServiciosDisponibles() {
		return this.id_lineaBusquedaProductosServiciosDisponibles;
	}

	public void setid_lineaBusquedaProductosServiciosDisponibles(Long id_lineaBusquedaProductosServiciosDisponibles) {
		this.id_lineaBusquedaProductosServiciosDisponibles = id_lineaBusquedaProductosServiciosDisponibles;
	}

;
	public Long id_linea_grupoBusquedaProductosServiciosDisponibles=-1L;

	public Long getid_linea_grupoBusquedaProductosServiciosDisponibles() {
		return this.id_linea_grupoBusquedaProductosServiciosDisponibles;
	}

	public void setid_linea_grupoBusquedaProductosServiciosDisponibles(Long id_linea_grupoBusquedaProductosServiciosDisponibles) {
		this.id_linea_grupoBusquedaProductosServiciosDisponibles = id_linea_grupoBusquedaProductosServiciosDisponibles;
	}

;
	public Long id_linea_categoriaBusquedaProductosServiciosDisponibles=-1L;

	public Long getid_linea_categoriaBusquedaProductosServiciosDisponibles() {
		return this.id_linea_categoriaBusquedaProductosServiciosDisponibles;
	}

	public void setid_linea_categoriaBusquedaProductosServiciosDisponibles(Long id_linea_categoriaBusquedaProductosServiciosDisponibles) {
		this.id_linea_categoriaBusquedaProductosServiciosDisponibles = id_linea_categoriaBusquedaProductosServiciosDisponibles;
	}

;
	public Long id_linea_marcaBusquedaProductosServiciosDisponibles=-1L;

	public Long getid_linea_marcaBusquedaProductosServiciosDisponibles() {
		return this.id_linea_marcaBusquedaProductosServiciosDisponibles;
	}

	public void setid_linea_marcaBusquedaProductosServiciosDisponibles(Long id_linea_marcaBusquedaProductosServiciosDisponibles) {
		this.id_linea_marcaBusquedaProductosServiciosDisponibles = id_linea_marcaBusquedaProductosServiciosDisponibles;
	}

;
	public Long id_tipo_producto_servicioBusquedaProductosServiciosDisponibles=-1L;

	public Long getid_tipo_producto_servicioBusquedaProductosServiciosDisponibles() {
		return this.id_tipo_producto_servicioBusquedaProductosServiciosDisponibles;
	}

	public void setid_tipo_producto_servicioBusquedaProductosServiciosDisponibles(Long id_tipo_producto_servicioBusquedaProductosServiciosDisponibles) {
		this.id_tipo_producto_servicioBusquedaProductosServiciosDisponibles = id_tipo_producto_servicioBusquedaProductosServiciosDisponibles;
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
	
	
	public ProductosServiciosDisponiblesLogic getProductosServiciosDisponiblesLogic()	{		
		return productosserviciosdisponiblesLogic;
	}

	public void setProductosServiciosDisponiblesLogic(ProductosServiciosDisponiblesLogic productosserviciosdisponiblesLogic) {
		this.productosserviciosdisponiblesLogic = productosserviciosdisponiblesLogic;
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
	
	public Boolean getIsEsNuevoProductosServiciosDisponibles() {
		return isEsNuevoProductosServiciosDisponibles;
	}

	public void setIsEsNuevoProductosServiciosDisponibles(Boolean isEsNuevoProductosServiciosDisponibles) {
		this.isEsNuevoProductosServiciosDisponibles = isEsNuevoProductosServiciosDisponibles;
	}

	public Boolean getEsParaAccionDesdeFormularioProductosServiciosDisponibles() {
		return esParaAccionDesdeFormularioProductosServiciosDisponibles;
	}
	
	public void setEsParaAccionDesdeFormularioProductosServiciosDisponibles(Boolean esParaAccionDesdeFormularioProductosServiciosDisponibles) {
		this.esParaAccionDesdeFormularioProductosServiciosDisponibles = esParaAccionDesdeFormularioProductosServiciosDisponibles;
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidEmpresaActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidSucursalActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidBodegaActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidLineaActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidLineaGrupoActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidLineaCategoriaActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidLineaMarcaActual());
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

			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
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
					tipoproductoservicioLogic.getEntityWithConnection(productosserviciosdisponiblesSessionBean.getlidTipoProductoServicioActual());
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductosServiciosDisponibles.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_empresaProductosServiciosDisponiblesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductosServiciosDisponiblesGenerico!=null && jComboBoxid_empresaProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductosServiciosDisponibles.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_sucursalProductosServiciosDisponiblesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductosServiciosDisponiblesGenerico!=null && jComboBoxid_sucursalProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductosServiciosDisponibles.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
						jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
							//jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_bodegaProductosServiciosDisponiblesGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductosServiciosDisponiblesGenerico!=null && jComboBoxid_bodegaProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProductosServiciosDisponibles.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
						jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
							//jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_lineaProductosServiciosDisponiblesGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProductosServiciosDisponiblesGenerico!=null && jComboBoxid_lineaProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_lineaProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProductosServiciosDisponibles.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
						jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
							//jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico!=null && jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProductosServiciosDisponibles.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
						jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
							//jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico!=null && jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProductosServiciosDisponibles.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
						jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
							//jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico!=null && jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
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

					if(this.productosserviciosdisponibles!=null) {
						this.productosserviciosdisponibles.setTipoProductoServicio(tipoproductoservicioTemp);
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setSelectedItem(tipoproductoservicioTemp);
					}
				} else {
					//jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setSelectedItem(tipoproductoservicioTemp);
					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoproductoservicioTemp!=null && jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
						jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(tipoproductoservicioTemp);
					} else {
						if(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
							//jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(tipoproductoservicioTemp);
							if(jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getItemCount()>0) {
								jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(0);
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
	public void setActualTipoProductoServicioForeignKeyGenerico(Long idTipoProductoServicioSeleccionado,JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico)throws Exception
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
				jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico.setSelectedItem(tipoproductoservicioTemp);
			} else {
				if(jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico!=null && jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico.getItemCount()>0) {
					jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_empresaProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductosServiciosDisponiblesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productosserviciosdisponibles.setid_empresa(empresaAux.getId());
				productosserviciosdisponibles.setempresa_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productosserviciosdisponibles.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_sucursalProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductosServiciosDisponiblesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productosserviciosdisponibles.setid_sucursal(sucursalAux.getId());
				productosserviciosdisponibles.setsucursal_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productosserviciosdisponibles.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_bodegaProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductosServiciosDisponiblesGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productosserviciosdisponibles.setid_bodega(bodegaAux.getId());
				productosserviciosdisponibles.setbodega_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productosserviciosdisponibles.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_lineaProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProductosServiciosDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosdisponibles.setid_linea(lineaAux.getId());
				productosserviciosdisponibles.setlinea_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getLineaDescripcion(lineaAux));
				productosserviciosdisponibles.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosdisponibles.setid_linea_grupo(lineaAux.getId());
				productosserviciosdisponibles.setlineagrupo_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				productosserviciosdisponibles.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosdisponibles.setid_linea_categoria(lineaAux.getId());
				productosserviciosdisponibles.setlineacategoria_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				productosserviciosdisponibles.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				productosserviciosdisponibles.setid_linea_marca(lineaAux.getId());
				productosserviciosdisponibles.setlineamarca_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				productosserviciosdisponibles.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoProductoServicioForeignKey(ProductosServiciosDisponibles productosserviciosdisponibles,JComboBox jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico)throws Exception
	{
		try
		{
			TipoProductoServicio  tipoproductoservicioAux=new TipoProductoServicio();

			if(jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico==null) {
				tipoproductoservicioAux=(TipoProductoServicio)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getSelectedItem();
			} else {
				tipoproductoservicioAux=(TipoProductoServicio)jComboBoxid_tipo_producto_servicioProductosServiciosDisponiblesGenerico.getSelectedItem();
			}

			if(tipoproductoservicioAux!=null && tipoproductoservicioAux.getId()!=null) {
				productosserviciosdisponibles.setid_tipo_producto_servicio(tipoproductoservicioAux.getId());
				productosserviciosdisponibles.settipoproductoservicio_descripcion(ProductosServiciosDisponiblesConstantesFunciones.getTipoProductoServicioDescripcion(tipoproductoservicioAux));
				productosserviciosdisponibles.setTipoProductoServicio(tipoproductoservicioAux);			}
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addItem(bodega);
							}
						}

						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addItem(linea);
							}
						}

						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addItem(lineagrupo);
							}
						}

						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addItem(lineacategoria);
							}
						}

						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addItem(lineamarca);
							}
						}

						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.addItem(tipoproductoservicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { 
					}

					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProductosServiciosDisponibles") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.removeAllItems();

							for(TipoProductoServicio tipoproductoservicio:this.tipoproductoserviciosForeignKey) {
								this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addItem(tipoproductoservicio);
							}
						}

						if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setSelectedItem(tipoproductoservicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedItem(tipoproductoservicio);
						} else {
							this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductosServiciosDisponibles() throws Exception {
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
		
	public ProductosServiciosDisponiblesParameterReturnGeneral getProductosServiciosDisponiblesParameterGeneral() {
		return this.productosserviciosdisponiblesParameterGeneral;
	}
	
	public void setProductosServiciosDisponiblesParameterGeneral(ProductosServiciosDisponiblesParameterReturnGeneral productosserviciosdisponiblesParameterGeneral) {
		this.productosserviciosdisponiblesParameterGeneral = productosserviciosdisponiblesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductosServiciosDisponibles() {
		return isPermisoTodoProductosServiciosDisponibles;
	}

	public void setIsPermisoTodoProductosServiciosDisponibles(Boolean isPermisoTodoProductosServiciosDisponibles) {
		this.isPermisoTodoProductosServiciosDisponibles = isPermisoTodoProductosServiciosDisponibles;
	}

	public Boolean getIsPermisoNuevoProductosServiciosDisponibles() {
		return isPermisoNuevoProductosServiciosDisponibles;
	}

	public void setIsPermisoNuevoProductosServiciosDisponibles(Boolean isPermisoNuevoProductosServiciosDisponibles) {
		this.isPermisoNuevoProductosServiciosDisponibles = isPermisoNuevoProductosServiciosDisponibles;
	}

	public Boolean getIsPermisoActualizarProductosServiciosDisponibles() {
		return isPermisoActualizarProductosServiciosDisponibles;
	}

	public void setIsPermisoActualizarProductosServiciosDisponibles(Boolean isPermisoActualizarProductosServiciosDisponibles) {
		this.isPermisoActualizarProductosServiciosDisponibles = isPermisoActualizarProductosServiciosDisponibles;
	}

	public Boolean getIsPermisoEliminarProductosServiciosDisponibles() {
		return isPermisoEliminarProductosServiciosDisponibles;
	}

	public void setIsPermisoEliminarProductosServiciosDisponibles(Boolean isPermisoEliminarProductosServiciosDisponibles) {
		this.isPermisoEliminarProductosServiciosDisponibles = isPermisoEliminarProductosServiciosDisponibles;
	}

	public Boolean getIsPermisoGuardarCambiosProductosServiciosDisponibles() {
		return isPermisoGuardarCambiosProductosServiciosDisponibles;
	}

	public void setIsPermisoGuardarCambiosProductosServiciosDisponibles(Boolean isPermisoGuardarCambiosProductosServiciosDisponibles) {
		this.isPermisoGuardarCambiosProductosServiciosDisponibles = isPermisoGuardarCambiosProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoConsultaProductosServiciosDisponibles() {
		return isPermisoConsultaProductosServiciosDisponibles;
	}

	public void setIsPermisoConsultaProductosServiciosDisponibles(Boolean isPermisoConsultaProductosServiciosDisponibles) {
		this.isPermisoConsultaProductosServiciosDisponibles = isPermisoConsultaProductosServiciosDisponibles;
	}

	public Boolean getIsPermisoBusquedaProductosServiciosDisponibles() {
		return isPermisoBusquedaProductosServiciosDisponibles;
	}

	public void setIsPermisoBusquedaProductosServiciosDisponibles(Boolean isPermisoBusquedaProductosServiciosDisponibles) {
		this.isPermisoBusquedaProductosServiciosDisponibles = isPermisoBusquedaProductosServiciosDisponibles;
	}

	public Boolean getIsPermisoReporteProductosServiciosDisponibles() {
		return isPermisoReporteProductosServiciosDisponibles;
	}

	public void setIsPermisoReporteProductosServiciosDisponibles(Boolean isPermisoReporteProductosServiciosDisponibles) {
		this.isPermisoReporteProductosServiciosDisponibles = isPermisoReporteProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductosServiciosDisponibles() {
		return isPermisoPaginacionMedioProductosServiciosDisponibles;
	}

	public void setIsPermisoPaginacionMedioProductosServiciosDisponibles(Boolean isPermisoPaginacionMedioProductosServiciosDisponibles) {
		this.isPermisoPaginacionMedioProductosServiciosDisponibles = isPermisoPaginacionMedioProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductosServiciosDisponibles() {
		return isPermisoPaginacionTodoProductosServiciosDisponibles;
	}

	public void setIsPermisoPaginacionTodoProductosServiciosDisponibles(Boolean isPermisoPaginacionTodoProductosServiciosDisponibles) {
		this.isPermisoPaginacionTodoProductosServiciosDisponibles = isPermisoPaginacionTodoProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductosServiciosDisponibles() {
		return isPermisoPaginacionAltoProductosServiciosDisponibles;
	}

	public void setIsPermisoPaginacionAltoProductosServiciosDisponibles(Boolean isPermisoPaginacionAltoProductosServiciosDisponibles) {
		this.isPermisoPaginacionAltoProductosServiciosDisponibles = isPermisoPaginacionAltoProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoCopiarProductosServiciosDisponibles() {
		return isPermisoCopiarProductosServiciosDisponibles;
	}

	public void setIsPermisoCopiarProductosServiciosDisponibles(Boolean isPermisoCopiarProductosServiciosDisponibles) {
		this.isPermisoCopiarProductosServiciosDisponibles = isPermisoCopiarProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoVerFormProductosServiciosDisponibles() {
		return isPermisoVerFormProductosServiciosDisponibles;
	}

	public void setIsPermisoVerFormProductosServiciosDisponibles(Boolean isPermisoVerFormProductosServiciosDisponibles) {
		this.isPermisoVerFormProductosServiciosDisponibles = isPermisoVerFormProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoDuplicarProductosServiciosDisponibles() {
		return isPermisoDuplicarProductosServiciosDisponibles;
	}

	public void setIsPermisoDuplicarProductosServiciosDisponibles(Boolean isPermisoDuplicarProductosServiciosDisponibles) {
		this.isPermisoDuplicarProductosServiciosDisponibles = isPermisoDuplicarProductosServiciosDisponibles;
	}
	
	public Boolean getIsPermisoOrdenProductosServiciosDisponibles() {
		return isPermisoOrdenProductosServiciosDisponibles;
	}

	public void setIsPermisoOrdenProductosServiciosDisponibles(Boolean isPermisoOrdenProductosServiciosDisponibles) {
		this.isPermisoOrdenProductosServiciosDisponibles = isPermisoOrdenProductosServiciosDisponibles;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductosServiciosDisponibles() {
		return isVisibilidadCeldaNuevoProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaNuevoProductosServiciosDisponibles(Boolean isVisibilidadCeldaNuevoProductosServiciosDisponibles) {
		this.isVisibilidadCeldaNuevoProductosServiciosDisponibles = isVisibilidadCeldaNuevoProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductosServiciosDisponibles() {
		return isVisibilidadCeldaDuplicarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaDuplicarProductosServiciosDisponibles(Boolean isVisibilidadCeldaDuplicarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles = isVisibilidadCeldaDuplicarProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductosServiciosDisponibles() {
		return isVisibilidadCeldaCopiarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaCopiarProductosServiciosDisponibles(Boolean isVisibilidadCeldaCopiarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaCopiarProductosServiciosDisponibles = isVisibilidadCeldaCopiarProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductosServiciosDisponibles() {
		return isVisibilidadCeldaVerFormProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaVerFormProductosServiciosDisponibles(Boolean isVisibilidadCeldaVerFormProductosServiciosDisponibles) {
		this.isVisibilidadCeldaVerFormProductosServiciosDisponibles = isVisibilidadCeldaVerFormProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductosServiciosDisponibles() {
		return isVisibilidadCeldaOrdenProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaOrdenProductosServiciosDisponibles(Boolean isVisibilidadCeldaOrdenProductosServiciosDisponibles) {
		this.isVisibilidadCeldaOrdenProductosServiciosDisponibles = isVisibilidadCeldaOrdenProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles() {
		return isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles(Boolean isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles) {
		this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles = isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductosServiciosDisponibles() {
		return isVisibilidadCeldaModificarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaModificarProductosServiciosDisponibles(Boolean isVisibilidadCeldaModificarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaModificarProductosServiciosDisponibles = isVisibilidadCeldaModificarProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductosServiciosDisponibles() {
		return isVisibilidadCeldaActualizarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaActualizarProductosServiciosDisponibles(Boolean isVisibilidadCeldaActualizarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaActualizarProductosServiciosDisponibles = isVisibilidadCeldaActualizarProductosServiciosDisponibles;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductosServiciosDisponibles() {
		return isVisibilidadCeldaEliminarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaEliminarProductosServiciosDisponibles(Boolean isVisibilidadCeldaEliminarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaEliminarProductosServiciosDisponibles = isVisibilidadCeldaEliminarProductosServiciosDisponibles;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductosServiciosDisponibles() {
		return isVisibilidadCeldaCancelarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaCancelarProductosServiciosDisponibles(Boolean isVisibilidadCeldaCancelarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaCancelarProductosServiciosDisponibles = isVisibilidadCeldaCancelarProductosServiciosDisponibles;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductosServiciosDisponibles() {
		return isVisibilidadCeldaGuardarProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaGuardarProductosServiciosDisponibles(Boolean isVisibilidadCeldaGuardarProductosServiciosDisponibles) {
		this.isVisibilidadCeldaGuardarProductosServiciosDisponibles = isVisibilidadCeldaGuardarProductosServiciosDisponibles;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles() {
		return isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles(Boolean isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles) {
		this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles = isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles;
	}
		
	public ProductosServiciosDisponiblesSessionBean getproductosserviciosdisponiblesSessionBean() {
		return this.productosserviciosdisponiblesSessionBean;
	}
	
	public void setproductosserviciosdisponiblesSessionBean(ProductosServiciosDisponiblesSessionBean productosserviciosdisponiblesSessionBean) {
		this.productosserviciosdisponiblesSessionBean=productosserviciosdisponiblesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProductosServiciosDisponibles() {
		return this.isVisibilidadBusquedaProductosServiciosDisponibles;
	}

	public void setisVisibilidadBusquedaProductosServiciosDisponibles(Boolean isVisibilidadBusquedaProductosServiciosDisponibles) {
		this.isVisibilidadBusquedaProductosServiciosDisponibles=isVisibilidadBusquedaProductosServiciosDisponibles;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarSucursalForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarBodegaForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarLineaForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarLineaGrupoForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarLineaMarcaForeignKey(productosserviciosdisponibles,null);
				this.setActualParaGuardarTipoProductoServicioForeignKey(productosserviciosdisponibles,null);
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
	
	public void bugActualizarReferenciaActual(ProductosServiciosDisponibles productosserviciosdisponibles,ProductosServiciosDisponibles productosserviciosdisponiblesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductosServiciosDisponibles(productosserviciosdisponibles);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productosserviciosdisponiblesAux.setId(productosserviciosdisponibles.getId());
		productosserviciosdisponiblesAux.setVersionRow(productosserviciosdisponibles.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProductosServiciosDisponibles productosserviciosdisponiblesLocal) throws Exception {
		
		if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductosServiciosDisponibles productosserviciosdisponiblesLocal) throws Exception {	
		if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productosserviciosdisponiblesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productosserviciosdisponiblesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productosserviciosdisponiblesLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				productosserviciosdisponiblesLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				productosserviciosdisponiblesLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				productosserviciosdisponiblesLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				productosserviciosdisponiblesLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoProductoServicioDetalleFormJInternalFrame.class)) {
				TipoProductoServicioBeanSwingJInternalFrame tipoproductoservicioBeanSwingJInternalFrameLocal=(TipoProductoServicioBeanSwingJInternalFrame) ((TipoProductoServicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoproductoservicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.gettipoproductoservicio(),true);
				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarLista(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio,this.tipoproductoserviciosForeignKey);

				tipoproductoservicioBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				productosserviciosdisponiblesLocal.setTipoProductoServicio(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio);

				this.addItemDefectoCombosForeignKeyTipoProductoServicio();
				this.cargarCombosFrameTipoProductoServiciosForeignKey("Formulario");
				this.setActualTipoProductoServicioForeignKey(tipoproductoservicioBeanSwingJInternalFrameLocal.tipoproductoservicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductosServiciosDisponiblesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productosserviciosdisponiblesValidator.getInvalidValues(this.productosserviciosdisponibles);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductosServiciosDisponibles productosserviciosdisponibles,List<ProductosServiciosDisponibles> productosserviciosdisponibless) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProductosServiciosDisponibles productosserviciosdisponibles,List<ProductosServiciosDisponibles> productosserviciosdisponibless) throws Exception {
		try	{			
			ProductosServiciosDisponiblesConstantesFunciones.actualizarSelectedLista(productosserviciosdisponibles,productosserviciosdisponibless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductosServiciosDisponibles> productosserviciosdisponiblessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productosserviciosdisponiblessLocal=this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productosserviciosdisponiblessLocal=this.productosserviciosdisponibless;
			}
			//ARCHITECTURE
		
			for(ProductosServiciosDisponibles productosserviciosdisponiblesLocal:productosserviciosdisponiblessLocal) {
				if(this.permiteMantenimiento(productosserviciosdisponiblesLocal) && productosserviciosdisponiblesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.getProductosServiciosDisponiblesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_sucursalProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_lineaProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_grupoProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_categoriaProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_marcaProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcodigoProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombreProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBRETIPOPRODUCTOSERVICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_bodegaProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_unidadProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.CANTIDADDISPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_disponibleProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.CANTIDADMAXIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_maximoProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.CANTIDADMINIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_minimoProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.PRECIOCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelprecio_compraProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.PRECIOVENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelprecio_ventaProductosServiciosDisponibles,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductosServiciosDisponiblesConstantesFunciones.COSTOULTIMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcosto_ultimoProductosServiciosDisponibles,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_sucursalProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_lineaProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_grupoProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_categoriaProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_marcaProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcodigoProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombreProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_bodegaProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_unidadProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_disponibleProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_maximoProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_minimoProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelprecio_compraProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelprecio_ventaProductosServiciosDisponibles,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcosto_ultimoProductosServiciosDisponibles,"");
		
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
		this.iIdNuevoProductosServiciosDisponibles--;	
		
		
		this.productosserviciosdisponiblesAux=new ProductosServiciosDisponibles();
		
		this.productosserviciosdisponiblesAux.setId(this.iIdNuevoProductosServiciosDisponibles);
		this.productosserviciosdisponiblesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().add(this.productosserviciosdisponiblesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productosserviciosdisponibless.add(this.productosserviciosdisponiblesAux);
		}
		//ARCHITECTURE
		
		this.productosserviciosdisponibles=this.productosserviciosdisponiblesAux;
		
		if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponibles);
			this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosDisponibles(this.productosserviciosdisponibles);
		}
				
		//this.setDefaultControlesProductosServiciosDisponibles();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductosServiciosDisponibles();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductosServiciosDisponibles();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosDisponibles();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponiblesBean,this.productosserviciosdisponibles,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral,this.productosserviciosdisponiblesBean,false);
		
		if(this.productosserviciosdisponiblesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles());
		}
		
		if(this.productosserviciosdisponiblesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles(),classes);//this.productosserviciosdisponiblesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductosServiciosDisponibles();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductosServiciosDisponibles();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.RecargarFormProductosServiciosDisponibles(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
						
			if(productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosDisponibles();
			}
			
			this.actualizarVisualTableDatosProductosServiciosDisponibles();
			
			this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosDisponibles(), this.getIndiceNuevoProductosServiciosDisponibles());
			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
						
			this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductosServiciosDisponibles(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_sucursalProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_lineaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_grupoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_categoriaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_marcaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarcodigoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombreProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_bodegaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarnombre_unidadProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_disponibleProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_maximoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_minimoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarprecio_compraProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarprecio_ventaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarcosto_ultimoProductosServiciosDisponibles);	
		//
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_empresaProductosServiciosDisponibles);//
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_sucursalProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_bodegaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_lineaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_linea_grupoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_linea_categoriaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_linea_marcaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setEnabled(isHabilitar && this.productosserviciosdisponiblesConstantesFunciones.activarid_tipo_producto_servicioProductosServiciosDisponibles);
	};
	
	public void setDefaultControlesProductosServiciosDisponibles() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductosServiciosDisponibles(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productosserviciosdisponiblesSessionBean.setConGuardarRelaciones(true);			
			this.productosserviciosdisponiblesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.setVisible(true);
			
					
		} else {
			//this.productosserviciosdisponiblesSessionBean.setConGuardarRelaciones(false);			
			this.productosserviciosdisponiblesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductosServiciosDisponibles() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
				if(productosserviciosdisponiblesAux.getId().equals(this.iIdNuevoProductosServiciosDisponibles)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponibless) {
				if(productosserviciosdisponiblesAux.getId().equals(this.iIdNuevoProductosServiciosDisponibles)) {
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
	
	public int getIndiceActualProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
				if(productosserviciosdisponiblesAux.getId().equals(productosserviciosdisponibles.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponibless) {
				if(productosserviciosdisponiblesAux.getId().equals(productosserviciosdisponibles.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponiblesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
				if(productosserviciosdisponiblesAux.getProductosServiciosDisponiblesOriginal().getId().equals(productosserviciosdisponiblesOriginal.getId())) {
					existe=true;
					productosserviciosdisponiblesOriginal.setId(productosserviciosdisponiblesAux.getId());
					productosserviciosdisponiblesOriginal.setVersionRow(productosserviciosdisponiblesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponibless) {
				if(productosserviciosdisponiblesAux.getProductosServiciosDisponiblesOriginal().getId().equals(productosserviciosdisponiblesOriginal.getId())) {
					existe=true;
					productosserviciosdisponiblesOriginal.setId(productosserviciosdisponiblesAux.getId());
					productosserviciosdisponiblesOriginal.setVersionRow(productosserviciosdisponiblesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductosServiciosDisponibles(Boolean esParaCancelar) throws Exception {
		productosserviciosdisponiblessAux=new ArrayList<ProductosServiciosDisponibles>();
		productosserviciosdisponiblesAux=new ProductosServiciosDisponibles();
		
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
					if(productosserviciosdisponiblesAux.getId()<0) {
						productosserviciosdisponiblessAux.add(productosserviciosdisponiblesAux);
					}		
				}
				this.iIdNuevoProductosServiciosDisponibles=0L;
				this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().removeAll(productosserviciosdisponiblessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponibless) {
					if(productosserviciosdisponiblesAux.getId()<0) {
						productosserviciosdisponiblessAux.add(productosserviciosdisponiblesAux);
					}		
				}
				this.iIdNuevoProductosServiciosDisponibles=0L;
				this.productosserviciosdisponibless.removeAll(productosserviciosdisponiblessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductosServiciosDisponibles 
					&& this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size()>0
					) {
					productosserviciosdisponiblesAux=this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().get(this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size() - 1);
				
					if(productosserviciosdisponiblesAux.getId()<0) {
						this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().remove(productosserviciosdisponiblesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductosServiciosDisponibles && this.productosserviciosdisponibless.size()>0) {
					productosserviciosdisponiblesAux=this.productosserviciosdisponibless.get(this.productosserviciosdisponibless.size() - 1);
				
					if(productosserviciosdisponiblesAux.getId()<0) {
						this.productosserviciosdisponibless.remove(productosserviciosdisponiblesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductosServiciosDisponibles(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productosserviciosdisponibles.getId()<0) {
				this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().remove(this.productosserviciosdisponibles);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productosserviciosdisponibles.getId()<0) {
				this.productosserviciosdisponibless.remove(this.productosserviciosdisponibles);
			}
		}			
	}
	
	public void setEstadosInicialesProductosServiciosDisponibles(List<ProductosServiciosDisponibles> productosserviciosdisponiblessAux) throws Exception {
		ProductosServiciosDisponiblesConstantesFunciones.setEstadosInicialesProductosServiciosDisponibles(productosserviciosdisponiblessAux);
	}
	
	public void setEstadosInicialesProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponiblesAux) throws Exception {
		ProductosServiciosDisponiblesConstantesFunciones.setEstadosInicialesProductosServiciosDisponibles(productosserviciosdisponiblesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductosServiciosDisponiblesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductosServiciosDisponiblesActual()) {
				if(!this.isEsNuevoProductosServiciosDisponibles) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductosServiciosDisponibles=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductosServiciosDisponiblesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Productos Servicios Disponibles ?", "MANTENIMIENTO DE Productos Servicios Disponibles", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductosServiciosDisponibles productosserviciosdisponibles) throws Exception {
		ProductosServiciosDisponiblesConstantesFunciones.seleccionarAsignar(this.productosserviciosdisponibles,productosserviciosdisponibles);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductosServiciosDisponibles=this.isPermisoActualizarOriginalProductosServiciosDisponibles;
			
			
			this.seleccionarAsignar(productosserviciosdisponibles);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productosserviciosdisponiblesSessionBean.setsFuncionBusquedaRapida(this.productosserviciosdisponiblesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProductosServiciosDisponibles) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductosServiciosDisponibles(esParaCancelar);				
				this.cancelarNuevoProductosServiciosDisponibles(esParaCancelar);								
			}
			
			this.productosserviciosdisponibles=new ProductosServiciosDisponibles();
			
			this.inicializarProductosServiciosDisponibles();
			
			this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductosServiciosDisponibles() throws Exception {
		try {
			ProductosServiciosDisponiblesConstantesFunciones.inicializarProductosServiciosDisponibles(this.productosserviciosdisponibles);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductosServiciosDisponibless(String sAccionBusqueda,List<ProductosServiciosDisponibles> productosserviciosdisponiblessParaReportes) throws Exception {
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
					sPathReporteFinal="ProductosServiciosDisponibles"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductosServiciosDisponiblesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductosServiciosDisponiblesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductosServiciosDisponibles"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Productos Servicios Disponibleses");		
		parameters.put("busquedapor", ProductosServiciosDisponiblesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductosServiciosDisponibles=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductosServiciosDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductosServiciosDisponiblesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductosServiciosDisponibles=new JRBeanArrayDataSource(ProductosServiciosDisponiblesJInternalFrame.TraerProductosServiciosDisponiblesBeans(productosserviciosdisponiblessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductosServiciosDisponibles);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductosServiciosDisponiblesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductosServiciosDisponiblesBean.TraerProductosServiciosDisponiblesBeans(productosserviciosdisponiblessParaReportes).toArray()));
							
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
				this.generarExcelReporteProductosServiciosDisponibless(sAccionBusqueda,sTipoArchivoReporte,productosserviciosdisponiblessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductosServiciosDisponibless(sAccionBusqueda,sTipoArchivoReporte,productosserviciosdisponiblessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponiblesActionPerformed(null);
					//this.generarExcelReporteProductosServiciosDisponibless(sAccionBusqueda,sTipoArchivoReporte,productosserviciosdisponiblessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductosServiciosDisponibless(sAccionBusqueda,sTipoArchivoReporte,productosserviciosdisponiblessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductosServiciosDisponibless(sAccionBusqueda,sTipoArchivoReporte,productosserviciosdisponiblessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductosServiciosDisponibless(sAccionBusqueda,sTipoArchivoReporte,productosserviciosdisponiblessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductosServiciosDisponibless(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosDisponibles> productosserviciosdisponiblessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosDisponibless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosServiciosDisponibles("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductosServiciosDisponibles productosserviciosdisponibles : productosserviciosdisponiblessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductosServiciosDisponiblesConstantesFunciones.generarExcelReporteDataProductosServiciosDisponibles("NORMAL",row,workbook,productosserviciosdisponibles,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductosServiciosDisponibles(String sTipo,Row row,Workbook workbook) {
		
		ProductosServiciosDisponiblesConstantesFunciones.generarExcelReporteHeaderProductosServiciosDisponibles(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductosServiciosDisponibless(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosDisponibles> productosserviciosdisponiblessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosDisponibless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductosServiciosDisponibles productosserviciosdisponibles : productosserviciosdisponiblessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.getProductosServiciosDisponiblesDescripcion(productosserviciosdisponibles));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.gettipoproductoservicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_linea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_linea_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_linea_categoria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_linea_marca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_tipo_producto_servicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getcantidad_disponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getcantidad_maximo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getcantidad_minimo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getprecio_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getprecio_venta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productosserviciosdisponibles.getcosto_ultimo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductosServiciosDisponibless(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductosServiciosDisponibles> productosserviciosdisponiblessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductosServiciosDisponibles> productosserviciosdisponiblessRespaldo=null;
		
		classes=ProductosServiciosDisponiblesConstantesFunciones.getClassesRelationshipsOfProductosServiciosDisponibles(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productosserviciosdisponiblesLogic.setDatosCliente(this.datosCliente);
		this.productosserviciosdisponiblesLogic.setDatosDeep(this.datosDeep);
		this.productosserviciosdisponiblesLogic.setIsConDeep(true);
		
		productosserviciosdisponiblessRespaldo=this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless();
		
		this.productosserviciosdisponiblesLogic.setProductosServiciosDisponibless(productosserviciosdisponiblessParaReportes);	
		this.productosserviciosdisponiblesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productosserviciosdisponiblessParaReportes=this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless();
		this.productosserviciosdisponiblesLogic.setProductosServiciosDisponibless(productosserviciosdisponiblessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductosServiciosDisponibless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductosServiciosDisponibles("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductosServiciosDisponibles productosserviciosdisponibles : productosserviciosdisponiblessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductosServiciosDisponibles("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductosServiciosDisponiblesConstantesFunciones.generarExcelReporteDataProductosServiciosDisponibles("NORMAL",row,workbook,productosserviciosdisponibles,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.getProductosServiciosDisponiblesDescripcion(productosserviciosdisponibles));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductosServiciosDisponibles() throws Exception {		
		this.startProcessProductosServiciosDisponibles(true);
	}
	
	public void startProcessProductosServiciosDisponibles(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductosServiciosDisponibles ,this.jPanelParametrosReportesProductosServiciosDisponibles, this.jScrollPanelDatosProductosServiciosDisponibles,this.jPanelPaginacionProductosServiciosDisponibles, this.jScrollPanelDatosEdicionProductosServiciosDisponibles, this.jPanelAccionesProductosServiciosDisponibles,this.jPanelAccionesFormularioProductosServiciosDisponibles,this.jmenuBarProductosServiciosDisponibles,this.jmenuBarDetalleProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,this.jTtoolBarDetalleProductosServiciosDisponibles);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosServiciosDisponibles=this.jTabbedPaneBusquedasProductosServiciosDisponibles; 
		
		final JPanel jPanelParametrosReportesProductosServiciosDisponibles=this.jPanelParametrosReportesProductosServiciosDisponibles;
		//final JScrollPane jScrollPanelDatosProductosServiciosDisponibles=this.jScrollPanelDatosProductosServiciosDisponibles;
		final JTable jTableDatosProductosServiciosDisponibles=this.jTableDatosProductosServiciosDisponibles;		
		final JPanel jPanelPaginacionProductosServiciosDisponibles=this.jPanelPaginacionProductosServiciosDisponibles;
		//final JScrollPane jScrollPanelDatosEdicionProductosServiciosDisponibles=this.jScrollPanelDatosEdicionProductosServiciosDisponibles;
		final JPanel jPanelAccionesProductosServiciosDisponibles=this.jPanelAccionesProductosServiciosDisponibles;
		
		JPanel jPanelCamposAuxiliarProductosServiciosDisponibles=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductosServiciosDisponibles=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			jPanelCamposAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelCamposProductosServiciosDisponibles;
			jPanelAccionesFormularioAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelAccionesFormularioProductosServiciosDisponibles;
		}
		
		final JPanel jPanelCamposProductosServiciosDisponibles=jPanelCamposAuxiliarProductosServiciosDisponibles;
		final JPanel jPanelAccionesFormularioProductosServiciosDisponibles=jPanelAccionesFormularioAuxiliarProductosServiciosDisponibles;
		
		
		final JMenuBar jmenuBarProductosServiciosDisponibles=this.jmenuBarProductosServiciosDisponibles;
		final JToolBar jTtoolBarProductosServiciosDisponibles=this.jTtoolBarProductosServiciosDisponibles;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductosServiciosDisponibles=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosServiciosDisponibles=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			jmenuBarDetalleAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jmenuBarDetalleProductosServiciosDisponibles;
			jTtoolBarDetalleAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTtoolBarDetalleProductosServiciosDisponibles;
		}
		
		final JMenuBar jmenuBarDetalleProductosServiciosDisponibles=jmenuBarDetalleAuxiliarProductosServiciosDisponibles;
		final JToolBar jTtoolBarDetalleProductosServiciosDisponibles=jTtoolBarDetalleAuxiliarProductosServiciosDisponibles;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosServiciosDisponibles;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosServiciosDisponibles;
			processRunnable.jTableDatos=jTableDatosProductosServiciosDisponibles;
			processRunnable.jPanelCampos=jPanelCamposProductosServiciosDisponibles;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosServiciosDisponibles;
			processRunnable.jPanelAcciones=jPanelAccionesProductosServiciosDisponibles;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosServiciosDisponibles;
			
			
			processRunnable.jmenuBar=jmenuBarProductosServiciosDisponibles;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosServiciosDisponibles;
			processRunnable.jTtoolBar=jTtoolBarProductosServiciosDisponibles;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosServiciosDisponibles;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosServiciosDisponibles ,jPanelParametrosReportesProductosServiciosDisponibles,jTableDatosProductosServiciosDisponibles, /*jScrollPanelDatosProductosServiciosDisponibles,*/jPanelCamposProductosServiciosDisponibles,jPanelPaginacionProductosServiciosDisponibles, /*jScrollPanelDatosEdicionProductosServiciosDisponibles,*/ jPanelAccionesProductosServiciosDisponibles,jPanelAccionesFormularioProductosServiciosDisponibles,jmenuBarProductosServiciosDisponibles,jmenuBarDetalleProductosServiciosDisponibles,jTtoolBarProductosServiciosDisponibles,jTtoolBarDetalleProductosServiciosDisponibles);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductosServiciosDisponibles ,jPanelParametrosReportesProductosServiciosDisponibles, jScrollPanelDatosProductosServiciosDisponibles,jPanelPaginacionProductosServiciosDisponibles, jScrollPanelDatosEdicionProductosServiciosDisponibles, jPanelAccionesProductosServiciosDisponibles,jPanelAccionesFormularioProductosServiciosDisponibles,jmenuBarProductosServiciosDisponibles,jmenuBarDetalleProductosServiciosDisponibles,jTtoolBarProductosServiciosDisponibles,jTtoolBarDetalleProductosServiciosDisponibles);
						
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
	
	public void finishProcessProductosServiciosDisponibles() {// throws Exception 
		this.finishProcessProductosServiciosDisponibles(true);
	}
	
	public void finishProcessProductosServiciosDisponibles(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductosServiciosDisponibles ,this.jPanelParametrosReportesProductosServiciosDisponibles, this.jScrollPanelDatosProductosServiciosDisponibles,this.jPanelPaginacionProductosServiciosDisponibles, this.jScrollPanelDatosEdicionProductosServiciosDisponibles, this.jPanelAccionesProductosServiciosDisponibles,this.jPanelAccionesFormularioProductosServiciosDisponibles,this.jmenuBarProductosServiciosDisponibles,this.jmenuBarDetalleProductosServiciosDisponibles,this.jTtoolBarProductosServiciosDisponibles,this.jTtoolBarDetalleProductosServiciosDisponibles);		
		
		final JTabbedPane jTabbedPaneBusquedasProductosServiciosDisponibles=this.jTabbedPaneBusquedasProductosServiciosDisponibles; 
		
		final JPanel jPanelParametrosReportesProductosServiciosDisponibles=this.jPanelParametrosReportesProductosServiciosDisponibles;
		//final JScrollPane jScrollPanelDatosProductosServiciosDisponibles=this.jScrollPanelDatosProductosServiciosDisponibles;
		final JTable jTableDatosProductosServiciosDisponibles=this.jTableDatosProductosServiciosDisponibles;		
		final JPanel jPanelPaginacionProductosServiciosDisponibles=this.jPanelPaginacionProductosServiciosDisponibles;
		//final JScrollPane jScrollPanelDatosEdicionProductosServiciosDisponibles=this.jScrollPanelDatosEdicionProductosServiciosDisponibles;
		final JPanel jPanelAccionesProductosServiciosDisponibles=this.jPanelAccionesProductosServiciosDisponibles;
		
		JPanel jPanelCamposAuxiliarProductosServiciosDisponibles=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductosServiciosDisponibles=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			jPanelCamposAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelCamposProductosServiciosDisponibles;
			jPanelAccionesFormularioAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelAccionesFormularioProductosServiciosDisponibles;
		}
		
		final JPanel jPanelCamposProductosServiciosDisponibles=jPanelCamposAuxiliarProductosServiciosDisponibles;
		final JPanel jPanelAccionesFormularioProductosServiciosDisponibles=jPanelAccionesFormularioAuxiliarProductosServiciosDisponibles;
		
		
		final JMenuBar jmenuBarProductosServiciosDisponibles=this.jmenuBarProductosServiciosDisponibles;		
		final JToolBar jTtoolBarProductosServiciosDisponibles=this.jTtoolBarProductosServiciosDisponibles;
				
		JMenuBar jmenuBarDetalleAuxiliarProductosServiciosDisponibles=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductosServiciosDisponibles=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			jmenuBarDetalleAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jmenuBarDetalleProductosServiciosDisponibles;
			jTtoolBarDetalleAuxiliarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTtoolBarDetalleProductosServiciosDisponibles;		
		}
		
		final JMenuBar jmenuBarDetalleProductosServiciosDisponibles=jmenuBarDetalleAuxiliarProductosServiciosDisponibles;
		final JToolBar jTtoolBarDetalleProductosServiciosDisponibles=jTtoolBarDetalleAuxiliarProductosServiciosDisponibles;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductosServiciosDisponibles;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductosServiciosDisponibles;
			processRunnable.jTableDatos=jTableDatosProductosServiciosDisponibles;
			processRunnable.jPanelCampos=jPanelCamposProductosServiciosDisponibles;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductosServiciosDisponibles;
			processRunnable.jPanelAcciones=jPanelAccionesProductosServiciosDisponibles;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductosServiciosDisponibles;
			
			
			processRunnable.jmenuBar=jmenuBarProductosServiciosDisponibles;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductosServiciosDisponibles;
			processRunnable.jTtoolBar=jTtoolBarProductosServiciosDisponibles;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductosServiciosDisponibles;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductosServiciosDisponibles ,jPanelParametrosReportesProductosServiciosDisponibles, jTableDatosProductosServiciosDisponibles,/*jScrollPanelDatosProductosServiciosDisponibles,*/jPanelCamposProductosServiciosDisponibles,jPanelPaginacionProductosServiciosDisponibles, /*jScrollPanelDatosEdicionProductosServiciosDisponibles,*/ jPanelAccionesProductosServiciosDisponibles,jPanelAccionesFormularioProductosServiciosDisponibles,jmenuBarProductosServiciosDisponibles,jmenuBarDetalleProductosServiciosDisponibles,jTtoolBarProductosServiciosDisponibles,jTtoolBarDetalleProductosServiciosDisponibles));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductosServiciosDisponibles(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductosServiciosDisponibles(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductosServiciosDisponibles(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductosServiciosDisponibles(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductosServiciosDisponibles,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductosServiciosDisponibles,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductosServiciosDisponibles(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductosServiciosDisponibles,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductosServiciosDisponibles,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productosserviciosdisponiblesConstantesFunciones.getsFinalQueryProductosServiciosDisponibles();
		String  finalQueryPaginacionTodos=this.productosserviciosdisponiblesConstantesFunciones.getsFinalQueryProductosServiciosDisponibles();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductosServiciosDisponiblesConstantesFunciones.getArrayColumnasGlobalesNoProductosServiciosDisponibles(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductosServiciosDisponiblesConstantesFunciones.getArrayColumnasGlobalesProductosServiciosDisponibles(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductosServiciosDisponiblesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productosserviciosdisponiblessEliminados= new ArrayList<ProductosServiciosDisponibles>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductosServiciosDisponibles();
		
				///*ProductosServiciosDisponiblesSessionBean*/this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			
			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
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
					this.iNumeroPaginacion=ProductosServiciosDisponiblesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductosServiciosDisponiblesConstantesFunciones.getClassesForeignKeysOfProductosServiciosDisponibles(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productosserviciosdisponibles."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productosserviciosdisponiblessAux= new ArrayList<ProductosServiciosDisponibles>();
			
				
			productosserviciosdisponiblesLogic.setDatosCliente(this.datosCliente);
			productosserviciosdisponiblesLogic.setDatosDeep(this.datosDeep);
			productosserviciosdisponiblesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProductosServiciosDisponibles")) {
				this.sDetalleReporte=ProductosServiciosDisponiblesConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosDisponibles(id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessBusquedaProductosServiciosDisponibles(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosServiciosDisponiblesConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosDisponibles(id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosServiciosDisponiblesConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosDisponibles(id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()==null||productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productosserviciosdisponibless==null|| productosserviciosdisponibless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosdisponiblessAux=new ArrayList<ProductosServiciosDisponibles>();
						productosserviciosdisponiblessAux.addAll(productosserviciosdisponiblesLogic.getProductosServiciosDisponibless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciosdisponiblessAux=new ArrayList<ProductosServiciosDisponibles>();
							productosserviciosdisponiblessAux.addAll(productosserviciosdisponibless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessBusquedaProductosServiciosDisponibles(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductosServiciosDisponiblesConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosDisponibles(id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductosServiciosDisponiblesConstantesFunciones.getDetalleIndiceBusquedaProductosServiciosDisponibles(id_bodegaBusquedaProductosServiciosDisponibles,id_lineaBusquedaProductosServiciosDisponibles,id_linea_grupoBusquedaProductosServiciosDisponibles,id_linea_categoriaBusquedaProductosServiciosDisponibles,id_linea_marcaBusquedaProductosServiciosDisponibles,id_tipo_producto_servicioBusquedaProductosServiciosDisponibles);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductosServiciosDisponibless("BusquedaProductosServiciosDisponibles",productosserviciosdisponiblesLogic.getProductosServiciosDisponibless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductosServiciosDisponibless("BusquedaProductosServiciosDisponibles",productosserviciosdisponibless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosdisponiblesLogic.setProductosServiciosDisponibless(new ArrayList<ProductosServiciosDisponibles>());
						productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().addAll(productosserviciosdisponiblessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciosdisponibless=new ArrayList<ProductosServiciosDisponibles>();
							productosserviciosdisponibless.addAll(productosserviciosdisponiblessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductosServiciosDisponibles();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductosServiciosDisponibles();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosdisponibless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productosserviciosdisponibless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductosServiciosDisponibles productosserviciosdisponibles) {
		Boolean permite=true;
		
		if(this.productosserviciosdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductosServiciosDisponiblesConstantesFunciones.getOrderByListaProductosServiciosDisponibles();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductosServiciosDisponiblesConstantesFunciones.getOrderByListaProductosServiciosDisponibles();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
				if(productosserviciosdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosdisponiblesTotales=productosserviciosdisponibles;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosDisponibles productosserviciosdisponibles:this.productosserviciosdisponibless) {
				if(productosserviciosdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosdisponiblesTotales=productosserviciosdisponibles;
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
			this.productosserviciosdisponiblesAux=new ProductosServiciosDisponibles();
			this.productosserviciosdisponiblesAux.setsType(Constantes2.S_TOTALES);
			this.productosserviciosdisponiblesAux.setIsNew(false);
			this.productosserviciosdisponiblesAux.setIsChanged(false);
			this.productosserviciosdisponiblesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProductosServiciosDisponiblesConstantesFunciones.TotalizarValoresFilaProductosServiciosDisponibles(this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless(),this.productosserviciosdisponiblesAux);
				
				//this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().add(this.productosserviciosdisponiblesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductosServiciosDisponiblesConstantesFunciones.TotalizarValoresFilaProductosServiciosDisponibles(this.productosserviciosdisponibless,this.productosserviciosdisponiblesAux);
				
				this.productosserviciosdisponibless.add(this.productosserviciosdisponiblesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productosserviciosdisponiblesTotales=new ProductosServiciosDisponibles();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().remove(productosserviciosdisponiblesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productosserviciosdisponibless.remove(productosserviciosdisponiblesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productosserviciosdisponiblesTotales=new ProductosServiciosDisponibles();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
				if(productosserviciosdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosdisponiblesTotales=productosserviciosdisponibles;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosServiciosDisponiblesConstantesFunciones.TotalizarValoresFilaProductosServiciosDisponibles(this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless(),productosserviciosdisponiblesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductosServiciosDisponibles productosserviciosdisponibles:this.productosserviciosdisponibless) {
				if(productosserviciosdisponibles.getsType().equals(Constantes2.S_TOTALES)) {
					productosserviciosdisponiblesTotales=productosserviciosdisponibles;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductosServiciosDisponiblesConstantesFunciones.TotalizarValoresFilaProductosServiciosDisponibles(this.productosserviciosdisponibless,productosserviciosdisponiblesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductosServiciosDisponiblessBusquedaProductosServiciosDisponibles()throws Exception {
		try {
			sAccionBusqueda="BusquedaProductosServiciosDisponibles";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductosServiciosDisponiblessFK_IdTipoProductoServicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoProductoServicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductosServiciosDisponiblessBusquedaProductosServiciosDisponibles(String sFinalQuery,Long id_bodega,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessBusquedaProductosServiciosDisponibles(sFinalQuery,this.pagination,id_bodega,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,id_tipo_producto_servicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductosServiciosDisponiblessFK_IdTipoProductoServicio(String sFinalQuery,Long id_tipo_producto_servicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productosserviciosdisponiblesLogic.getProductosServiciosDisponiblessFK_IdTipoProductoServicio(sFinalQuery,this.pagination,id_tipo_producto_servicio);
				
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
	
	public void inicializarPermisosProductosServiciosDisponibles() {
		this.isPermisoTodoProductosServiciosDisponibles=false;
		this.isPermisoNuevoProductosServiciosDisponibles=false;
		this.isPermisoActualizarProductosServiciosDisponibles=false;
		this.isPermisoActualizarOriginalProductosServiciosDisponibles=false;
		this.isPermisoEliminarProductosServiciosDisponibles=false;
		this.isPermisoGuardarCambiosProductosServiciosDisponibles=false;
		this.isPermisoConsultaProductosServiciosDisponibles=true;
		this.isPermisoBusquedaProductosServiciosDisponibles=true;
		this.isPermisoReporteProductosServiciosDisponibles=true;
		this.isPermisoOrdenProductosServiciosDisponibles=false;		
		this.isPermisoPaginacionMedioProductosServiciosDisponibles=false;		
		this.isPermisoPaginacionAltoProductosServiciosDisponibles=false;		
		this.isPermisoPaginacionTodoProductosServiciosDisponibles=false;		
		this.isPermisoCopiarProductosServiciosDisponibles=false;		
		this.isPermisoVerFormProductosServiciosDisponibles=false;		
		this.isPermisoDuplicarProductosServiciosDisponibles=false;
		this.isPermisoOrdenProductosServiciosDisponibles=false;
	}
	
	public void setPermisosUsuarioProductosServiciosDisponibles(Boolean isPermiso) {
		this.isPermisoTodoProductosServiciosDisponibles=isPermiso;
		this.isPermisoNuevoProductosServiciosDisponibles=isPermiso;
		this.isPermisoActualizarProductosServiciosDisponibles=isPermiso;
		this.isPermisoActualizarOriginalProductosServiciosDisponibles=isPermiso;
		this.isPermisoEliminarProductosServiciosDisponibles=isPermiso;
		this.isPermisoGuardarCambiosProductosServiciosDisponibles=isPermiso;
		this.isPermisoConsultaProductosServiciosDisponibles=isPermiso;
		this.isPermisoBusquedaProductosServiciosDisponibles=isPermiso;
		this.isPermisoReporteProductosServiciosDisponibles=isPermiso;
		this.isPermisoOrdenProductosServiciosDisponibles=isPermiso;		
		this.isPermisoPaginacionMedioProductosServiciosDisponibles=isPermiso;		
		this.isPermisoPaginacionAltoProductosServiciosDisponibles=isPermiso;		
		this.isPermisoPaginacionTodoProductosServiciosDisponibles=isPermiso;		
		this.isPermisoCopiarProductosServiciosDisponibles=isPermiso;		
		this.isPermisoVerFormProductosServiciosDisponibles=isPermiso;		
		this.isPermisoDuplicarProductosServiciosDisponibles=isPermiso;
		this.isPermisoOrdenProductosServiciosDisponibles=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductosServiciosDisponibles(Boolean isPermiso) {
		//this.isPermisoTodoProductosServiciosDisponibles=isPermiso;
		this.isPermisoNuevoProductosServiciosDisponibles=isPermiso;
		this.isPermisoActualizarProductosServiciosDisponibles=isPermiso;
		this.isPermisoActualizarOriginalProductosServiciosDisponibles=isPermiso;
		this.isPermisoEliminarProductosServiciosDisponibles=isPermiso;
		this.isPermisoGuardarCambiosProductosServiciosDisponibles=isPermiso;
		//this.isPermisoConsultaProductosServiciosDisponibles=isPermiso;
		//this.isPermisoBusquedaProductosServiciosDisponibles=isPermiso;
		//this.isPermisoReporteProductosServiciosDisponibles=isPermiso;
		//this.isPermisoOrdenProductosServiciosDisponibles=isPermiso;		
		//this.isPermisoPaginacionMedioProductosServiciosDisponibles=isPermiso;		
		//this.isPermisoPaginacionAltoProductosServiciosDisponibles=isPermiso;		
		//this.isPermisoPaginacionTodoProductosServiciosDisponibles=isPermiso;		
		//this.isPermisoCopiarProductosServiciosDisponibles=isPermiso;		
		//this.isPermisoDuplicarProductosServiciosDisponibles=isPermiso;
		//this.isPermisoOrdenProductosServiciosDisponibles=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductosServiciosDisponiblesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductosServiciosDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductosServiciosDisponiblesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductosServiciosDisponiblesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductosServiciosDisponiblesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductosServiciosDisponiblesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductosServiciosDisponibles() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductosServiciosDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductosServiciosDisponiblesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductosServiciosDisponibles=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductosServiciosDisponibles=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductosServiciosDisponibles=this.isPermisoActualizarProductosServiciosDisponibles;
			this.isPermisoEliminarProductosServiciosDisponibles=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductosServiciosDisponibles=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductosServiciosDisponibles=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductosServiciosDisponibles=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductosServiciosDisponibles=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductosServiciosDisponibles=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosServiciosDisponibles=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductosServiciosDisponibles=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductosServiciosDisponibles=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductosServiciosDisponibles=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductosServiciosDisponibles=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductosServiciosDisponibles=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductosServiciosDisponibles=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductosServiciosDisponibles=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductosServiciosDisponibles.setToolTipText(this.jTableDatosProductosServiciosDisponibles.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductosServiciosDisponibles(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductosServiciosDisponibles(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductosServiciosDisponibles() throws Exception {
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
	public void inicializarCombosForeignKeyProductosServiciosDisponiblesListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyProductosServiciosDisponiblesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductosServiciosDisponiblesJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProductosServiciosDisponibles()throws Exception {
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
			if(this.productosserviciosdisponiblesSessionBean==null) {
				this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean();
			}

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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

			if(!this.productosserviciosdisponiblesSessionBean.getisBusquedaDesdeForeignKeySesionTipoProductoServicio()) {
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
	
	public void initActionsCombosTodosForeignKeyProductosServiciosDisponibles()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductosServiciosDisponibles(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductosServiciosDisponibles()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosDisponibles();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductosServiciosDisponibles()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductosServiciosDisponibles()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductosServiciosDisponibles()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductosServiciosDisponibles()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductosServiciosDisponibles()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductosServiciosDisponibles()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyProductosServiciosDisponibles(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyProductosServiciosDisponibles()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProductosServiciosDisponiblesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductosServiciosDisponiblesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductosServiciosDisponiblesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productosserviciosdisponiblesSessionBean=new ProductosServiciosDisponiblesSessionBean(); 
		this.productosserviciosdisponiblesConstantesFunciones=new ProductosServiciosDisponiblesConstantesFunciones(); 
		this.productosserviciosdisponiblesBean=new ProductosServiciosDisponibles();//(this.productosserviciosdisponiblesConstantesFunciones); 		
		this.productosserviciosdisponiblesReturnGeneral=new ProductosServiciosDisponiblesParameterReturnGeneral(); 
		
		this.productosserviciosdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productosserviciosdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductosServiciosDisponiblesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductosServiciosDisponiblesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductosServiciosDisponiblesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductosServiciosDisponibles(true);
			
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
			
			this.productosserviciosdisponiblesConstantesFunciones=new ProductosServiciosDisponiblesConstantesFunciones(); 
			this.productosserviciosdisponiblesBean=new ProductosServiciosDisponibles();//this.productosserviciosdisponiblesConstantesFunciones); 			
			this.productosserviciosdisponiblesReturnGeneral=new ProductosServiciosDisponiblesParameterReturnGeneral(); 
		
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Productos Servicios Disponibles Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productosserviciosdisponibles=new ProductosServiciosDisponibles();
			this.productosserviciosdisponibless = new ArrayList<ProductosServiciosDisponibles>();
			this.productosserviciosdisponiblessAux = new ArrayList<ProductosServiciosDisponibles>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic=new ProductosServiciosDisponiblesLogic();
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			//this.productosserviciosdisponiblesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productosserviciosdisponiblesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductosServiciosDisponibles);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosServiciosDisponibles);	
					}
					
					if(this.jInternalFrameImportacionProductosServiciosDisponibles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosServiciosDisponibles);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductosServiciosDisponibles!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductosServiciosDisponibles);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosServiciosDisponibles);
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.setVisible(false);
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles);
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setVisible(false);
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductosServiciosDisponibles!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductosServiciosDisponibles);
					this.jInternalFrameImportacionProductosServiciosDisponibles.setVisible(false);
					this.jInternalFrameImportacionProductosServiciosDisponibles.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductosServiciosDisponibles!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductosServiciosDisponibles);
					this.jInternalFrameOrderByProductosServiciosDisponibles.setVisible(false);
					this.jInternalFrameOrderByProductosServiciosDisponibles.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductosServiciosDisponiblesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductosServiciosDisponiblesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productosserviciosdisponiblesReturnGeneral=new ProductosServiciosDisponiblesParameterReturnGeneral();
			
			this.productosserviciosdisponiblesParameterGeneral=new ProductosServiciosDisponiblesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosServiciosDisponiblesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductosServiciosDisponiblesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaCopiarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaVerFormProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaOrdenProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
			
			
			this.isVisibilidadBusquedaProductosServiciosDisponibles=true;
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
			
			//this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductosServiciosDisponibles();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductosServiciosDisponibles(false);
			
			this.setPermisosUsuarioProductosServiciosDisponibles();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() 
				|| (this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado() && this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductosServiciosDisponiblesClasesRelacionadas();
			}
			
			if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductosServiciosDisponiblesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductosServiciosDisponibles();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductosServiciosDisponibles();
			}
			
			if(!this.isPermisoBusquedaProductosServiciosDisponibles) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductosServiciosDisponiblesConstantesFunciones.getTiposSeleccionarProductosServiciosDisponibles());
				
				this.tiposColumnasSelect=ProductosServiciosDisponiblesConstantesFunciones.getTiposSeleccionarProductosServiciosDisponibles(true);
				
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
			//if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductosServiciosDisponibles();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProductosServiciosDisponibles(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProductosServiciosDisponibles(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosDisponibles() ;
			
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
				productosserviciosdisponiblesImplementable= (ProductosServiciosDisponiblesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosServiciosDisponiblesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productosserviciosdisponiblesImplementableHome= (ProductosServiciosDisponiblesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductosServiciosDisponiblesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productosserviciosdisponibless= new ArrayList<ProductosServiciosDisponibles>();
			this.productosserviciosdisponiblessEliminados= new ArrayList<ProductosServiciosDisponibles>();
						
			this.isEsNuevoProductosServiciosDisponibles=false;
			this.esParaAccionDesdeFormularioProductosServiciosDisponibles=false;
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
				this.cargarCombosForeignKeyProductosServiciosDisponibles(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductosServiciosDisponibles();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductosServiciosDisponiblesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductosServiciosDisponibles(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductosServiciosDisponibles();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductosServiciosDisponibles();
			}
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductosServiciosDisponibles.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductosServiciosDisponibles.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductosServiciosDisponibles.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductosServiciosDisponibles(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductosServiciosDisponibles: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductosServiciosDisponibles() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductosServiciosDisponibles")) {
				iIndex=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductosServiciosDisponibles();	
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
	
	public void cargarCombosForeignKeyProductosServiciosDisponibles(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductosServiciosDisponibles(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductosServiciosDisponibles(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductosServiciosDisponiblesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductosServiciosDisponibles();
		
		this.cargarCombosFrameForeignKeyProductosServiciosDisponibles();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductosServiciosDisponibles();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductosServiciosDisponibles();
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
	
	public void jButtonNuevoProductosServiciosDisponiblesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			
			if(jTableDatosProductosServiciosDisponibles.getRowCount()>=1) {
				jTableDatosProductosServiciosDisponibles.removeRowSelectionInterval(0, jTableDatosProductosServiciosDisponibles.getRowCount()-1);						
			}
			
			this.isEsNuevoProductosServiciosDisponibles=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductosServiciosDisponibles(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductosServiciosDisponibles(true);			
			//this.productosserviciosdisponibles=new ProductosServiciosDisponibles();
			//this.productosserviciosdisponibles.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles() ;
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosDisponibles(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productosserviciosdisponibles);	
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);				
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductosServiciosDisponibles: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductosServiciosDisponiblesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductosServiciosDisponibles.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductosServiciosDisponibles.getSelectedRows().length;			
			}
			
			productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductosServiciosDisponibles--;			
				//ProductosServiciosDisponibles productosserviciosdisponiblesAux= new ProductosServiciosDisponibles();			
				//productosserviciosdisponiblesAux.setId(this.iIdNuevoProductosServiciosDisponibles);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductosServiciosDisponibles productosserviciosdisponiblesOrigen=new ProductosServiciosDisponibles();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductosServiciosDisponibles productosserviciosdisponiblesOrigen : productosserviciosdisponiblessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productosserviciosdisponiblesOrigen =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productosserviciosdisponiblesOrigen =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductosServiciosDisponibles();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productosserviciosdisponibles.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductosServiciosDisponibles(productosserviciosdisponiblesOrigen,this.productosserviciosdisponibles,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().add(this.productosserviciosdisponiblesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibless.add(this.productosserviciosdisponiblesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
				
				this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosDisponibles(), this.getIndiceNuevoProductosServiciosDisponibles());
				
				int iLastRow =  this.jTableDatosProductosServiciosDisponibles.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosServiciosDisponibles.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosServiciosDisponibles.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();									
		
			ProductosServiciosDisponibles productosserviciosdisponiblesOrigen=new ProductosServiciosDisponibles();
			ProductosServiciosDisponibles productosserviciosdisponiblesDestino=new ProductosServiciosDisponibles();
				
			productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductosServiciosDisponibles.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productosserviciosdisponiblessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductosServiciosDisponibles.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosdisponiblesOrigen =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosserviciosdisponiblesOrigen =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productosserviciosdisponiblesDestino =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productosserviciosdisponiblesDestino =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productosserviciosdisponiblesOrigen =productosserviciosdisponiblessSeleccionados.get(0);
				productosserviciosdisponiblesDestino =productosserviciosdisponiblessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductosServiciosDisponibles(productosserviciosdisponiblesOrigen,productosserviciosdisponiblesDestino,true,false);
				
				productosserviciosdisponiblesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productosserviciosdisponiblesDestino,productosserviciosdisponiblesLogic.getProductosServiciosDisponibless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productosserviciosdisponiblesDestino,productosserviciosdisponibless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
				
				//this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosDisponibles(), this.getIndiceNuevoProductosServiciosDisponibles());
				
				int iLastRow =  this.jTableDatosProductosServiciosDisponibles.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductosServiciosDisponibles.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductosServiciosDisponibles.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductosServiciosDisponibles.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(!isVisible);
			this.jPanelPaginacionProductosServiciosDisponibles.setVisible(!isVisible);
			this.jPanelAccionesProductosServiciosDisponibles.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductosServiciosDisponibles();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductosServiciosDisponibles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductosServiciosDisponibles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductosServiciosDisponibles();
			
			this.abrirFrameOrderByProductosServiciosDisponibles();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductosServiciosDisponibles();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductosServiciosDisponibles(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosServiciosDisponibles);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.isMaximum()) {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSize(this.jInternalFrameDetalleFormProductosServiciosDisponibles.iWidthFormulario,this.jInternalFrameDetalleFormProductosServiciosDisponibles.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductosServiciosDisponibles.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductosServiciosDisponibles.isMaximum()) {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jContentPaneDetalleProductosServiciosDisponibles.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jContentPaneDetalleProductosServiciosDisponibles.getWidth(),ProductosServiciosDisponiblesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jContentPaneDetalleProductosServiciosDisponibles.getWidth(),ProductosServiciosDisponiblesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jContentPaneDetalleProductosServiciosDisponibles.getWidth(),ProductosServiciosDisponiblesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductosServiciosDisponibles.setVisible(true);
	        this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductosServiciosDisponibles() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductosServiciosDisponibles==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductosServiciosDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosDisponibles,false,this);
				} else {
					this.jInternalFrameOrderByProductosServiciosDisponibles=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductosServiciosDisponibles,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductosServiciosDisponibles);
				this.jInternalFrameOrderByProductosServiciosDisponibles.setVisible(false);
				this.jInternalFrameOrderByProductosServiciosDisponibles.setSelected(false);
				
				this.jInternalFrameOrderByProductosServiciosDisponibles.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosServiciosDisponibles"));
				
				this.inicializarActualizarBindingTablaOrderByProductosServiciosDisponibles();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductosServiciosDisponibles() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductosServiciosDisponibles==null) {
				
				this.jInternalFrameImportacionProductosServiciosDisponibles=new ImportacionJInternalFrame(ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductosServiciosDisponibles);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductosServiciosDisponibles);
				this.jInternalFrameImportacionProductosServiciosDisponibles.setVisible(false);
				this.jInternalFrameImportacionProductosServiciosDisponibles.setSelected(false);


				this.jInternalFrameImportacionProductosServiciosDisponibles.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosServiciosDisponibles"));
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosServiciosDisponibles"));
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosServiciosDisponibles"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductosServiciosDisponibles() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles==null) {
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles=new ReporteDinamicoJInternalFrame(ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductosServiciosDisponibles);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles);
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setVisible(false);
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosDisponibles"));
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosDisponibles"));
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosDisponibles"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosDisponibles();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductosServiciosDisponibles() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductosServiciosDisponibles);
			
	       	this.jInternalFrameDetalleFormProductosServiciosDisponibles.setVisible(false);
	        this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductosServiciosDisponibles.dispose();
			//this.jInternalFrameDetalleFormProductosServiciosDisponibles=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductosServiciosDisponibles() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductosServiciosDisponibles() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductosServiciosDisponibles.setVisible(true);
	        this.jInternalFrameImportacionProductosServiciosDisponibles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductosServiciosDisponibles() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductosServiciosDisponibles.setVisible(true);
	        this.jInternalFrameOrderByProductosServiciosDisponibles.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductosServiciosDisponibles() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductosServiciosDisponibles.setVisible(false);
	        this.jInternalFrameOrderByProductosServiciosDisponibles.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductosServiciosDisponibles() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductosServiciosDisponibles() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductosServiciosDisponibles.setVisible(false);
	        this.jInternalFrameImportacionProductosServiciosDisponibles.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductosServiciosDisponibles(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductosServiciosDisponibles(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductosServiciosDisponibles(true);
			//this.isEsNuevoProductosServiciosDisponibles=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false) ;
			
			if(productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosDisponibles(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductosServiciosDisponiblesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductosServiciosDisponibles(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductosServiciosDisponibles(true);
			//this.isEsNuevoProductosServiciosDisponibles=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productosserviciosdisponibles.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false) ;
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductosServiciosDisponibles(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

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
		TableColumn tableColumnTipoProductoServicio=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO));
		TableCellEditor tableCellEditorTipoProductoServicio =tableColumnTipoProductoServicio.getCellEditor();

		TipoProductoServicioTableCell tipoproductoservicioTableCellFk=(TipoProductoServicioTableCell)tableCellEditorTipoProductoServicio;

		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKey(tipoproductoserviciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoproductoservicioTableCellFk.setRowActual(intSelectedRow);
			//tipoproductoservicioTableCellFk.settipoproductoserviciosForeignKeyActual(tipoproductoserviciosForeignKey);
		//}


		if(tipoproductoservicioTableCellFk!=null) {
			tipoproductoservicioTableCellFk.RecargarTipoProductoServiciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductosServiciosDisponibles(false);
			
			//if(!this.isEsNuevoProductosServiciosDisponibles) {								
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				
			}
			
			if(this.permiteMantenimiento(this.productosserviciosdisponibles)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductosServiciosDisponibles=true;
					this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
					this.isEsNuevoProductosServiciosDisponibles=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductosServiciosDisponibles=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductosServiciosDisponibles=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(false);
				
				this.habilitarDeshabilitarControlesProductosServiciosDisponibles(false);
			
												
				
				if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductosServiciosDisponibles();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,productosserviciosdisponiblesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductosServiciosDisponibles(this.productosserviciosdisponibles,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productosserviciosdisponiblesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productosserviciosdisponibles.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				this.productosserviciosdisponibles.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				this.productosserviciosdisponibles.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productosserviciosdisponibles)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductosServiciosDisponiblesModel) this.jTableDatosProductosServiciosDisponibles.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductosServiciosDisponibles=true;
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
				this.isEsNuevoProductosServiciosDisponibles=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(false);
				
				this.habilitarDeshabilitarControlesProductosServiciosDisponibles(false);
				
				
				
				if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductosServiciosDisponibles();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductosServiciosDisponibles.getRowCount()>=1) {
				jTableDatosProductosServiciosDisponibles.removeRowSelectionInterval(0, jTableDatosProductosServiciosDisponibles.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductosServiciosDisponibles(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(false) ;
			
			this.isEsNuevoProductosServiciosDisponibles=false;
			
			if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductosServiciosDisponibles();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				
				//SI ES MANUAL
				if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductosServiciosDisponibles();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductosServiciosDisponibles--;			
			//ProductosServiciosDisponibles productosserviciosdisponiblesAux= new ProductosServiciosDisponibles();			
			//productosserviciosdisponiblesAux.setId(this.iIdNuevoProductosServiciosDisponibles);
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductosServiciosDisponibles();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
			
			this.productosserviciosdisponibles.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().add(this.productosserviciosdisponiblesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productosserviciosdisponibless.add(this.productosserviciosdisponiblesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			
			this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(this.getIndiceNuevoProductosServiciosDisponibles(), this.getIndiceNuevoProductosServiciosDisponibles());
			
			int iLastRow =  this.jTableDatosProductosServiciosDisponibles.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductosServiciosDisponibles.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductosServiciosDisponibles.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
			
			//SI ES MANUAL
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosDisponibles();
			}
			
			//this.abrirFrameTreeProductosServiciosDisponibles();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductosServiciosDisponibles.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductosServiciosDisponibles.setFileImportacion(this.jInternalFrameImportacionProductosServiciosDisponibles.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductosServiciosDisponibles.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductosServiciosDisponibles.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		

		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductosServiciosDisponiblesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductosServiciosDisponiblesBaseDesign.jrxml";
			
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
			
			this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLinea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLinea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLinea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLinea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreLineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreLineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreLineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreLineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoProductoServicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoProductoServicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoProductoServicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoProductoServicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadDisponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadDisponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadDisponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadDisponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadMaximo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadMaximo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadMaximo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadMaximo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadMinimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadMinimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadMinimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadMinimo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecioCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecioCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecioCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecioCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecioVenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecioVenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecioVenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecioVenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUltimo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUltimo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUltimo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUltimo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoria="nombre_linea";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoria="nombre_linea_grupo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoria="nombre_linea_categoria";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoria="nombre_linea_marca";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					sNombreCampoCategoria="nombre_tipo_producto_servicio";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoria="cantidad_disponible";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO:
					sNombreCampoCategoria="cantidad_maximo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO:
					sNombreCampoCategoria="cantidad_minimo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA:
					sNombreCampoCategoria="precio_compra";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA:
					sNombreCampoCategoria="precio_venta";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO:
					sNombreCampoCategoria="costo_ultimo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA:
					sNombreCampoCategoriaValor="nombre_linea";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					sNombreCampoCategoriaValor="nombre_linea_grupo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					sNombreCampoCategoriaValor="nombre_linea_categoria";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					sNombreCampoCategoriaValor="nombre_linea_marca";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					sNombreCampoCategoriaValor="nombre_tipo_producto_servicio";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoriaValor="cantidad_disponible";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO:
					sNombreCampoCategoriaValor="cantidad_maximo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO:
					sNombreCampoCategoriaValor="cantidad_minimo";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA:
					sNombreCampoCategoriaValor="precio_compra";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA:
					sNombreCampoCategoriaValor="precio_venta";
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO:
					sNombreCampoCategoriaValor="costo_ultimo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_grupo");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_categoria");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_linea_marca");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Producto Servicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_producto_servicio");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Disponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_disponible");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Maximo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_maximo");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Minimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_minimo");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio_compra");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio_venta");
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Ultimo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_ultimo");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductosServiciosDisponibless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.gettipoproductoservicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_linea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_linea_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_linea_categoria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_linea_marca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_tipo_producto_servicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getcantidad_disponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getcantidad_maximo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getcantidad_minimo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getprecio_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getprecio_venta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO);
					iRow++;

					for(ProductosServiciosDisponibles productosserviciosdisponibles:productosserviciosdisponiblessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productosserviciosdisponibles.getcosto_ultimo());
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
			//	this.getFilaCabeceraExportarExcelProductosServiciosDisponibles(row);				
			//	iRow++;
			//}				
			
			//for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductosServiciosDisponibles(productosserviciosdisponiblesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
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
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
			
			//SI ES MANUAL
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductosServiciosDisponibles();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
			
			//SI ES MANUAL
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosServiciosDisponibles();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
			
			//SI ES MANUAL
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductosServiciosDisponibles();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductosServiciosDisponibles() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductosServiciosDisponibles.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductosServiciosDisponibles.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductosServiciosDisponibles.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductosServiciosDisponibles.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductosServiciosDisponibles.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductosServiciosDisponibles.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductosServiciosDisponibles.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductosServiciosDisponibles(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductosServiciosDisponibles(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductosServiciosDisponibles(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductosServiciosDisponibles(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductosServiciosDisponibles(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosDisponibles(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductosServiciosDisponibles(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductosServiciosDisponibles() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductosServiciosDisponibles();
		
		this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductosServiciosDisponibles();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosDisponibles() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosDisponibles(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosDisponibles(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductosServiciosDisponibles.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jCheckBoxPostAccionNuevoProductosServiciosDisponibles.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductosServiciosDisponibles.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductosServiciosDisponibles.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jCheckBoxPostAccionNuevoProductosServiciosDisponibles.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jCheckBoxPostAccionSinCerrarProductosServiciosDisponibles.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jCheckBoxPostAccionSinMensajeProductosServiciosDisponibles.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductosServiciosDisponibles.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductosServiciosDisponibles.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductosServiciosDisponibles.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductosServiciosDisponibles.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductosServiciosDisponibles.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductosServiciosDisponibles(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductosServiciosDisponibles(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductosServiciosDisponibles() throws Exception {
		try	{
			if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosServiciosDisponibles();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosServiciosDisponibles() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductosServiciosDisponibles() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductosServiciosDisponibles.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductosServiciosDisponibles.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductosServiciosDisponibles.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductosServiciosDisponibles.addItem(reporte);
			}
			
			
			if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductosServiciosDisponibles.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductosServiciosDisponibles.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductosServiciosDisponibles.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosDisponibles();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductosServiciosDisponibles() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductosServiciosDisponiblesConstantesFunciones.getTiposSeleccionarProductosServiciosDisponibles(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductosServiciosDisponiblesConstantesFunciones.getTiposSeleccionarProductosServiciosDisponibles(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductosServiciosDisponiblesConstantesFunciones.getTiposSeleccionarProductosServiciosDisponibles(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductosServiciosDisponibles()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()!=null){this.id_bodegaBusquedaProductosServiciosDisponibles=((Bodega)this.jComboBoxid_bodegaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()!=null){this.id_lineaBusquedaProductosServiciosDisponibles=((Linea)this.jComboBoxid_lineaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()!=null){this.id_linea_grupoBusquedaProductosServiciosDisponibles=((Linea)this.jComboBoxid_linea_grupoBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProductosServiciosDisponibles=((Linea)this.jComboBoxid_linea_categoriaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()!=null){this.id_linea_marcaBusquedaProductosServiciosDisponibles=((Linea)this.jComboBoxid_linea_marcaBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()!=null){this.id_tipo_producto_servicioBusquedaProductosServiciosDisponibles=((TipoProductoServicio)this.jComboBoxid_tipo_producto_servicioBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductosServiciosDisponibles(Boolean esInicializar) throws Exception {				
		if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductosServiciosDisponibles();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductosServiciosDisponibles() throws Exception {
		this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductosServiciosDisponibles() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductosServiciosDisponiblesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponiblesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductosServiciosDisponibles(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productosserviciosdisponibless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductosServiciosDisponibles.setModel(new ProductosServiciosDisponiblesModel(this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductosServiciosDisponibles.setModel(new ProductosServiciosDisponiblesModel(this.productosserviciosdisponibless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductosServiciosDisponibles!=null && this.jInternalFrameOrderByProductosServiciosDisponibles.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductosServiciosDisponibles();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO,productosserviciosdisponiblesConstantesFunciones.resaltarSeleccionarProductosServiciosDisponibles,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductosServiciosDisponiblesConstantesFunciones.SCLASSWEBTITULO,productosserviciosdisponiblesConstantesFunciones.resaltarSeleccionarProductosServiciosDisponibles,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_ID));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostraridProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltaridProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activaridProductosServiciosDisponibles,iSizeTabla,this,true,"idProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltaridProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activaridProductosServiciosDisponibles,this,true,"idProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_sucursalProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_sucursalProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_sucursalProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_sucursalProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_sucursalProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_sucursalProductosServiciosDisponibles,this,true,"nombre_sucursalProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_lineaProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_lineaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_lineaProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_lineaProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_lineaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_lineaProductosServiciosDisponibles,this,true,"nombre_lineaProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_grupoProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_grupoProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_linea_grupoProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_grupoProductosServiciosDisponibles,this,true,"nombre_linea_grupoProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_categoriaProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_categoriaProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_linea_categoriaProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_categoriaProductosServiciosDisponibles,this,true,"nombre_linea_categoriaProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_marcaProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_marcaProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_linea_marcaProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_marcaProductosServiciosDisponibles,this,true,"nombre_linea_marcaProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarcodigoProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcodigoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcodigoProductosServiciosDisponibles,iSizeTabla,this,true,"codigoProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcodigoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcodigoProductosServiciosDisponibles,this,true,"codigoProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombreProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombreProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombreProductosServiciosDisponibles,iSizeTabla,this,true,"nombreProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombreProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombreProductosServiciosDisponibles,this,true,"nombreProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_tipo_producto_servicioProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_tipo_producto_servicioProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosDisponibles,this,true,"nombre_tipo_producto_servicioProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_bodegaProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_bodegaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_bodegaProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_bodegaProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_bodegaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_bodegaProductosServiciosDisponibles,this,true,"nombre_bodegaProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_unidadProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_unidadProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_unidadProductosServiciosDisponibles,iSizeTabla,this,true,"nombre_unidadProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_unidadProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarnombre_unidadProductosServiciosDisponibles,this,true,"nombre_unidadProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_disponibleProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_disponibleProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_disponibleProductosServiciosDisponibles,iSizeTabla,this,true,"cantidad_disponibleProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_disponibleProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_disponibleProductosServiciosDisponibles,this,true,"cantidad_disponibleProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_maximoProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_maximoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_maximoProductosServiciosDisponibles,iSizeTabla,this,true,"cantidad_maximoProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_maximoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_maximoProductosServiciosDisponibles,this,true,"cantidad_maximoProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_minimoProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_minimoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_minimoProductosServiciosDisponibles,iSizeTabla,this,true,"cantidad_minimoProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_minimoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_minimoProductosServiciosDisponibles,this,true,"cantidad_minimoProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarprecio_compraProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_compraProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarprecio_compraProductosServiciosDisponibles,iSizeTabla,this,true,"precio_compraProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_compraProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarprecio_compraProductosServiciosDisponibles,this,true,"precio_compraProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarprecio_ventaProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_ventaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarprecio_ventaProductosServiciosDisponibles,iSizeTabla,this,true,"precio_ventaProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_ventaProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarprecio_ventaProductosServiciosDisponibles,this,true,"precio_ventaProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO));

		if(this.productosserviciosdisponiblesConstantesFunciones.mostrarcosto_ultimoProductosServiciosDisponibles && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcosto_ultimoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcosto_ultimoProductosServiciosDisponibles,iSizeTabla,this,true,"costo_ultimoProductosServiciosDisponibles","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productosserviciosdisponiblesConstantesFunciones.resaltarcosto_ultimoProductosServiciosDisponibles,this.productosserviciosdisponiblesConstantesFunciones.activarcosto_ultimoProductosServiciosDisponibles,this,true,"costo_ultimoProductosServiciosDisponibles","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductosServiciosDisponiblesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosServiciosDisponibles.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductosServiciosDisponibles.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductosServiciosDisponibles.addColumn(tableColumn);
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
			
			this.jTableDatosProductosServiciosDisponibles.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductosServiciosDisponibles.moveColumn(this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductosServiciosDisponibles.moveColumn(this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductosServiciosDisponibles.moveColumn(this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductosServiciosDisponibles.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductosServiciosDisponibles.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductosServiciosDisponibles,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductosServiciosDisponibles.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductosServiciosDisponibles.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductosServiciosDisponibles.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productosserviciosdisponibless.size()-1;
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
		//this.jTableDatosProductosServiciosDisponibles.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductosServiciosDisponibles.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductosServiciosDisponibles();
			
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
				
				//this.isEsNuevoProductosServiciosDisponibles=false;
					
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
				if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosServiciosDisponibles.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productosserviciosdisponibles.getsType().equals("DUPLICADO")
				   || this.productosserviciosdisponibles.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductosServiciosDisponibles=true;
				
				} else {
					this.isEsNuevoProductosServiciosDisponibles=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
					if(this.productosserviciosdisponibles.getId()>=0 && !this.productosserviciosdisponibles.getIsNew()) {						
						this.isEsNuevoProductosServiciosDisponibles=false;
						
					} else {
						this.isEsNuevoProductosServiciosDisponibles=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductosServiciosDisponibles(esRelaciones);						
				
				this.seleccionarProductosServiciosDisponibles(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productosserviciosdisponibles.getId()<0) {
					this.isEsNuevoProductosServiciosDisponibles=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductosServiciosDisponibles(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductosServiciosDisponibles(evt,rowIndex);
				}	
				
				if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductosServiciosDisponibles: " + this.dDif); 
					}
				}								
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductosServiciosDisponibles(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productosserviciosdisponibles)) {
					if(this.productosserviciosdisponibles.getId()>0) {
						this.productosserviciosdisponibles.setIsDeleted(true);
						
						this.productosserviciosdisponiblessEliminados.add(this.productosserviciosdisponibles);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().remove(this.productosserviciosdisponibles);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibless.remove(this.productosserviciosdisponibles);				
					}
					
					
					((ProductosServiciosDisponiblesModel) this.jTableDatosProductosServiciosDisponibles.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductosServiciosDisponibles(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductosServiciosDisponibles) {
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductosServiciosDisponibles.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductosServiciosDisponibles.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductosServiciosDisponibles("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductosServiciosDisponibles(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductosServiciosDisponibles(productosserviciosdisponibles,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductosServiciosDisponibles(productosserviciosdisponibles);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductosServiciosDisponibles(productosserviciosdisponibles,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosDisponibles(productosserviciosdisponibles);
	}
	
	public void setVariablesObjetoActualToFormularioProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setText(productosserviciosdisponibles.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_tipo_producto_servicio());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcantidad_maximo().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcantidad_minimo().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setText(productosserviciosdisponibles.getprecio_compra().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getprecio_venta().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcosto_ultimo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductosServiciosDisponibles productosserviciosdisponiblesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productosserviciosdisponiblesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductosServiciosDisponibles productosserviciosdisponiblesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productosserviciosdisponiblesLocal=this.productosserviciosdisponibles;
			} else {
				productosserviciosdisponiblesLocal=this.productosserviciosdisponiblesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productosserviciosdisponiblesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductosServiciosDisponibles(productosserviciosdisponiblesLocal,true);
					
					if(productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productosserviciosdisponiblesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productosserviciosdisponiblesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(productosserviciosdisponibles,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(productosserviciosdisponibles);
	}
	
	public void setVariablesFormularioToObjetoActualProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(productosserviciosdisponibles,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.getText()==null || this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.getText()=="" || this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.getText()=="Id") {
				this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setText("0");
			}

			if(conColumnasBase) {productosserviciosdisponibles.setId(Long.parseLong(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelIdProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_sucursal(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_sucursalProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_linea(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_lineaProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_linea_grupo(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_grupoProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_linea_categoria(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_categoriaProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_linea_marca(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_linea_marcaProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setcodigo(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcodigoProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombreProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_tipo_producto_servicio(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_tipo_producto_servicioProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_bodega(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_bodegaProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setnombre_unidad(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelnombre_unidadProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setcantidad_disponible(Integer.parseInt(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_disponibleProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setcantidad_maximo(Integer.parseInt(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_maximoProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setcantidad_minimo(Integer.parseInt(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcantidad_minimoProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setprecio_compra(Double.parseDouble(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelprecio_compraProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setprecio_venta(Double.parseDouble(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelprecio_ventaProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productosserviciosdisponibles.setcosto_ultimo(Double.parseDouble(this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelcosto_ultimoProductosServiciosDisponibles,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponiblesBean,ProductosServiciosDisponibles productosserviciosdisponibles,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponiblesOrigen,ProductosServiciosDisponibles productosserviciosdisponibles,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getId()!=null && !productosserviciosdisponiblesOrigen.getId().equals(0L))) {productosserviciosdisponibles.setId(productosserviciosdisponiblesOrigen.getId());}}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_sucursal()!=null && !productosserviciosdisponiblesOrigen.getnombre_sucursal().equals(""))) {productosserviciosdisponibles.setnombre_sucursal(productosserviciosdisponiblesOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_linea()!=null && !productosserviciosdisponiblesOrigen.getnombre_linea().equals(""))) {productosserviciosdisponibles.setnombre_linea(productosserviciosdisponiblesOrigen.getnombre_linea());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_linea_grupo()!=null && !productosserviciosdisponiblesOrigen.getnombre_linea_grupo().equals(""))) {productosserviciosdisponibles.setnombre_linea_grupo(productosserviciosdisponiblesOrigen.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_linea_categoria()!=null && !productosserviciosdisponiblesOrigen.getnombre_linea_categoria().equals(""))) {productosserviciosdisponibles.setnombre_linea_categoria(productosserviciosdisponiblesOrigen.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_linea_marca()!=null && !productosserviciosdisponiblesOrigen.getnombre_linea_marca().equals(""))) {productosserviciosdisponibles.setnombre_linea_marca(productosserviciosdisponiblesOrigen.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getcodigo()!=null && !productosserviciosdisponiblesOrigen.getcodigo().equals(""))) {productosserviciosdisponibles.setcodigo(productosserviciosdisponiblesOrigen.getcodigo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre()!=null && !productosserviciosdisponiblesOrigen.getnombre().equals(""))) {productosserviciosdisponibles.setnombre(productosserviciosdisponiblesOrigen.getnombre());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_tipo_producto_servicio()!=null && !productosserviciosdisponiblesOrigen.getnombre_tipo_producto_servicio().equals(""))) {productosserviciosdisponibles.setnombre_tipo_producto_servicio(productosserviciosdisponiblesOrigen.getnombre_tipo_producto_servicio());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_bodega()!=null && !productosserviciosdisponiblesOrigen.getnombre_bodega().equals(""))) {productosserviciosdisponibles.setnombre_bodega(productosserviciosdisponiblesOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getnombre_unidad()!=null && !productosserviciosdisponiblesOrigen.getnombre_unidad().equals(""))) {productosserviciosdisponibles.setnombre_unidad(productosserviciosdisponiblesOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getcantidad_disponible()!=null && !productosserviciosdisponiblesOrigen.getcantidad_disponible().equals(0))) {productosserviciosdisponibles.setcantidad_disponible(productosserviciosdisponiblesOrigen.getcantidad_disponible());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getcantidad_maximo()!=null && !productosserviciosdisponiblesOrigen.getcantidad_maximo().equals(0))) {productosserviciosdisponibles.setcantidad_maximo(productosserviciosdisponiblesOrigen.getcantidad_maximo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getcantidad_minimo()!=null && !productosserviciosdisponiblesOrigen.getcantidad_minimo().equals(0))) {productosserviciosdisponibles.setcantidad_minimo(productosserviciosdisponiblesOrigen.getcantidad_minimo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getprecio_compra()!=null && !productosserviciosdisponiblesOrigen.getprecio_compra().equals(0.0))) {productosserviciosdisponibles.setprecio_compra(productosserviciosdisponiblesOrigen.getprecio_compra());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getprecio_venta()!=null && !productosserviciosdisponiblesOrigen.getprecio_venta().equals(0.0))) {productosserviciosdisponibles.setprecio_venta(productosserviciosdisponiblesOrigen.getprecio_venta());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesOrigen.getcosto_ultimo()!=null && !productosserviciosdisponiblesOrigen.getcosto_ultimo().equals(0.0))) {productosserviciosdisponibles.setcosto_ultimo(productosserviciosdisponiblesOrigen.getcosto_ultimo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setText(productosserviciosdisponibles.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_tipo_producto_servicio());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setText(productosserviciosdisponibles.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcantidad_maximo().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcantidad_minimo().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setText(productosserviciosdisponibles.getprecio_compra().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setText(productosserviciosdisponibles.getprecio_venta().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setText(productosserviciosdisponibles.getcosto_ultimo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductosServiciosDisponibles(ProductosServiciosDisponiblesBean productosserviciosdisponiblesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getId().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_linea());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_linea_grupo());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_linea_categoria());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_linea_marca());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getcodigo());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_tipo_producto_servicio());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_bodega());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getnombre_unidad());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getcantidad_maximo().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getcantidad_minimo().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getprecio_compra().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getprecio_venta().toString());
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setText(productosserviciosdisponiblesBean.getcosto_ultimo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductosServiciosDisponibles(ProductosServiciosDisponiblesParameterReturnGeneral productosserviciosdisponiblesReturnGeneral,ProductosServiciosDisponiblesBean productosserviciosdisponiblesBean,Boolean conDefault) throws Exception { 
		try {
			ProductosServiciosDisponibles productosserviciosdisponiblesLocal=new ProductosServiciosDisponibles();
			
			productosserviciosdisponiblesLocal=productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getId()!=null && !productosserviciosdisponiblesLocal.getId().equals(0L))) {productosserviciosdisponiblesBean.setId(productosserviciosdisponiblesLocal.getId());}}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_sucursal()!=null && !productosserviciosdisponiblesLocal.getnombre_sucursal().equals(""))) {productosserviciosdisponiblesBean.setnombre_sucursal(productosserviciosdisponiblesLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_linea()!=null && !productosserviciosdisponiblesLocal.getnombre_linea().equals(""))) {productosserviciosdisponiblesBean.setnombre_linea(productosserviciosdisponiblesLocal.getnombre_linea());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_linea_grupo()!=null && !productosserviciosdisponiblesLocal.getnombre_linea_grupo().equals(""))) {productosserviciosdisponiblesBean.setnombre_linea_grupo(productosserviciosdisponiblesLocal.getnombre_linea_grupo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_linea_categoria()!=null && !productosserviciosdisponiblesLocal.getnombre_linea_categoria().equals(""))) {productosserviciosdisponiblesBean.setnombre_linea_categoria(productosserviciosdisponiblesLocal.getnombre_linea_categoria());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_linea_marca()!=null && !productosserviciosdisponiblesLocal.getnombre_linea_marca().equals(""))) {productosserviciosdisponiblesBean.setnombre_linea_marca(productosserviciosdisponiblesLocal.getnombre_linea_marca());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getcodigo()!=null && !productosserviciosdisponiblesLocal.getcodigo().equals(""))) {productosserviciosdisponiblesBean.setcodigo(productosserviciosdisponiblesLocal.getcodigo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre()!=null && !productosserviciosdisponiblesLocal.getnombre().equals(""))) {productosserviciosdisponiblesBean.setnombre(productosserviciosdisponiblesLocal.getnombre());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_tipo_producto_servicio()!=null && !productosserviciosdisponiblesLocal.getnombre_tipo_producto_servicio().equals(""))) {productosserviciosdisponiblesBean.setnombre_tipo_producto_servicio(productosserviciosdisponiblesLocal.getnombre_tipo_producto_servicio());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_bodega()!=null && !productosserviciosdisponiblesLocal.getnombre_bodega().equals(""))) {productosserviciosdisponiblesBean.setnombre_bodega(productosserviciosdisponiblesLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getnombre_unidad()!=null && !productosserviciosdisponiblesLocal.getnombre_unidad().equals(""))) {productosserviciosdisponiblesBean.setnombre_unidad(productosserviciosdisponiblesLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getcantidad_disponible()!=null && !productosserviciosdisponiblesLocal.getcantidad_disponible().equals(0))) {productosserviciosdisponiblesBean.setcantidad_disponible(productosserviciosdisponiblesLocal.getcantidad_disponible());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getcantidad_maximo()!=null && !productosserviciosdisponiblesLocal.getcantidad_maximo().equals(0))) {productosserviciosdisponiblesBean.setcantidad_maximo(productosserviciosdisponiblesLocal.getcantidad_maximo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getcantidad_minimo()!=null && !productosserviciosdisponiblesLocal.getcantidad_minimo().equals(0))) {productosserviciosdisponiblesBean.setcantidad_minimo(productosserviciosdisponiblesLocal.getcantidad_minimo());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getprecio_compra()!=null && !productosserviciosdisponiblesLocal.getprecio_compra().equals(0.0))) {productosserviciosdisponiblesBean.setprecio_compra(productosserviciosdisponiblesLocal.getprecio_compra());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getprecio_venta()!=null && !productosserviciosdisponiblesLocal.getprecio_venta().equals(0.0))) {productosserviciosdisponiblesBean.setprecio_venta(productosserviciosdisponiblesLocal.getprecio_venta());}
			if(conDefault || (!conDefault && productosserviciosdisponiblesLocal.getcosto_ultimo()!=null && !productosserviciosdisponiblesLocal.getcosto_ultimo().equals(0.0))) {productosserviciosdisponiblesBean.setcosto_ultimo(productosserviciosdisponiblesLocal.getcosto_ultimo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductosServiciosDisponiblesGenerico(Long idProductosServiciosDisponiblesSeleccionado,JComboBox jComboBoxProductosServiciosDisponibles,List<ProductosServiciosDisponibles> productosserviciosdisponiblessLocal)throws Exception {
		try {
			ProductosServiciosDisponibles  productosserviciosdisponiblesTemp=null;

			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessLocal) {
				if(productosserviciosdisponiblesAux.getId()!=null && productosserviciosdisponiblesAux.getId().equals(idProductosServiciosDisponiblesSeleccionado)) {
					productosserviciosdisponiblesTemp=productosserviciosdisponiblesAux;
					break;
				}
			}

			jComboBoxProductosServiciosDisponibles.setSelectedItem(productosserviciosdisponiblesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductosServiciosDisponiblesGenerico(JComboBox jComboBoxProductosServiciosDisponibles,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosServiciosDisponibles.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductosServiciosDisponibles.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductosServiciosDisponibles.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductosServiciosDisponibles.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductosServiciosDisponibles.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductosServiciosDisponibles.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciosdisponibles=(ProductosServiciosDisponibles) productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosserviciosdisponibles =(ProductosServiciosDisponibles) productosserviciosdisponibless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("TipoProductoServicio")) {
			//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
			if(!productosserviciosdisponibles.getIsNew() && !productosserviciosdisponibles.getIsChanged() && !productosserviciosdisponibles.getIsDeleted()) {
				sDescripcion=productosserviciosdisponibles.gettipoproductoservicio_descripcion();
			} else {
				//sDescripcion=this.getActualTipoProductoServicioForeignKeyDescripcion((Long)value);
				sDescripcion=productosserviciosdisponibles.gettipoproductoservicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductosServiciosDisponibles productosserviciosdisponiblesRow=new ProductosServiciosDisponibles();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciosdisponiblesRow=(ProductosServiciosDisponibles) productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productosserviciosdisponiblesRow=(ProductosServiciosDisponibles) productosserviciosdisponibless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles));			
			this.jButtonDuplicarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles && this.isPermisoDuplicarProductosServiciosDisponibles));			
			this.jButtonCopiarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosDisponibles && this.isPermisoCopiarProductosServiciosDisponibles));
			this.jButtonVerFormProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosDisponibles && this.isPermisoVerFormProductosServiciosDisponibles));
			
			this.jButtonAbrirOrderByProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosDisponibles && this.isPermisoOrdenProductosServiciosDisponibles));			
			
			this.jButtonNuevoRelacionesProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles));			
			this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaModificarProductosServiciosDisponibles && this.isPermisoActualizarProductosServiciosDisponibles));	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosDisponibles && this.isPermisoActualizarProductosServiciosDisponibles));	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosDisponibles && this.isPermisoEliminarProductosServiciosDisponibles));
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarProductosServiciosDisponibles.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosDisponibles);							
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles));						
			this.jButtonDuplicarToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles && this.isPermisoDuplicarProductosServiciosDisponibles));						
			this.jButtonCopiarToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosDisponibles && this.isPermisoCopiarProductosServiciosDisponibles));			
			this.jButtonVerFormToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosDisponibles && this.isPermisoVerFormProductosServiciosDisponibles));			
			this.jButtonAbrirOrderByToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosDisponibles && this.isPermisoOrdenProductosServiciosDisponibles));
			this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles));			
			this.jButtonNuevoGuardarCambiosToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));			
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaModificarProductosServiciosDisponibles && this.isPermisoActualizarProductosServiciosDisponibles));	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosDisponibles  && this.isPermisoActualizarProductosServiciosDisponibles));	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosDisponibles && this.isPermisoEliminarProductosServiciosDisponibles));
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarToolBarProductosServiciosDisponibles.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosDisponibles);				
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles));			
			this.jMenuItemDuplicarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles && this.isPermisoDuplicarProductosServiciosDisponibles));			
			this.jMenuItemCopiarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaCopiarProductosServiciosDisponibles && this.isPermisoCopiarProductosServiciosDisponibles));			
			this.jMenuItemVerFormProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaVerFormProductosServiciosDisponibles && this.isPermisoVerFormProductosServiciosDisponibles));			
			this.jMenuItemAbrirOrderByProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosDisponibles && this.isPermisoOrdenProductosServiciosDisponibles));			
			//this.jMenuItemMostrarOcultarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosDisponibles && this.isPermisoOrdenProductosServiciosDisponibles));
			this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosDisponibles && this.isPermisoOrdenProductosServiciosDisponibles));			
			//this.jMenuItemDetalleMostrarOcultarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaOrdenProductosServiciosDisponibles && this.isPermisoOrdenProductosServiciosDisponibles));			
			this.jMenuItemNuevoRelacionesProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles));			
			this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaNuevoProductosServiciosDisponibles && this.isPermisoNuevoProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));									
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemModificarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaModificarProductosServiciosDisponibles && this.isPermisoActualizarProductosServiciosDisponibles));	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemActualizarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaActualizarProductosServiciosDisponibles && this.isPermisoActualizarProductosServiciosDisponibles));	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemEliminarProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaEliminarProductosServiciosDisponibles && this.isPermisoEliminarProductosServiciosDisponibles));
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemCancelarProductosServiciosDisponibles.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosDisponibles);				
			}
			
			this.jMenuItemGuardarCambiosProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));						
			this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=this.jButtonNuevoProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles=this.jButtonDuplicarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaCopiarProductosServiciosDisponibles=this.jButtonCopiarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaVerFormProductosServiciosDisponibles=this.jButtonVerFormProductosServiciosDisponibles.isVisible();
			
			this.isVisibilidadCeldaOrdenProductosServiciosDisponibles=this.jButtonAbrirOrderByProductosServiciosDisponibles.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=this.jButtonNuevoRelacionesProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=this.jButtonModificarProductosServiciosDisponibles.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=this.jButtonNuevoToolBarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarToolBarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarToolBarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarToolBarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarToolBarProductosServiciosDisponibles.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=this.jButtonGuardarCambiosToolBarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=this.jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=this.jMenuItemNuevoProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=this.jMenuItemNuevoRelacionesProductosServiciosDisponibles.isVisible();
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemModificarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemActualizarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemEliminarProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemCancelarProductosServiciosDisponibles.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=this.jMenuItemGuardarCambiosProductosServiciosDisponibles.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductosServiciosDisponibles(Boolean esInicializar) {
		if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
				//if(this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductosServiciosDisponibles();
			}
			
			this.inicializarActualizarBindingBotonesManualProductosServiciosDisponibles(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductosServiciosDisponibles() {
		this.jButtonNuevoProductosServiciosDisponibles.setVisible(this.isPermisoNuevoProductosServiciosDisponibles);			
		this.jButtonDuplicarProductosServiciosDisponibles.setVisible(this.isPermisoDuplicarProductosServiciosDisponibles);			
		this.jButtonCopiarProductosServiciosDisponibles.setVisible(this.isPermisoCopiarProductosServiciosDisponibles);			
		this.jButtonVerFormProductosServiciosDisponibles.setVisible(this.isPermisoVerFormProductosServiciosDisponibles);			
		
		this.jButtonAbrirOrderByProductosServiciosDisponibles.setVisible(this.isPermisoOrdenProductosServiciosDisponibles);					
		
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.setVisible(this.isPermisoNuevoProductosServiciosDisponibles);			
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarProductosServiciosDisponibles.setVisible(this.isPermisoActualizarProductosServiciosDisponibles);	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarProductosServiciosDisponibles.setVisible(this.isPermisoActualizarProductosServiciosDisponibles);	
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarProductosServiciosDisponibles.setVisible(this.isPermisoEliminarProductosServiciosDisponibles);
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarProductosServiciosDisponibles.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosDisponibles);						
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.setVisible(this.isPermisoGuardarCambiosProductosServiciosDisponibles);							
		}
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.setVisible(this.isPermisoActualizarProductosServiciosDisponibles);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosServiciosDisponibles() {
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarProductosServiciosDisponibles.setVisible(this.isPermisoActualizarProductosServiciosDisponibles);	
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarProductosServiciosDisponibles.setVisible(this.isPermisoActualizarProductosServiciosDisponibles);	
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarProductosServiciosDisponibles.setVisible(this.isPermisoEliminarProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarProductosServiciosDisponibles.setVisible(this.isVisibilidadCeldaCancelarProductosServiciosDisponibles);							
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.setVisible((this.isVisibilidadCeldaGuardarProductosServiciosDisponibles && this.isPermisoGuardarCambiosProductosServiciosDisponibles));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductosServiciosDisponibles() {
		if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductosServiciosDisponibles();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductosServiciosDisponibles() {
	}
	
	public void jTableDatosProductosServiciosDisponiblesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductosServiciosDisponibles(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productosserviciosdisponibles.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productosserviciosdisponibles.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productosserviciosdisponibles.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productosserviciosdisponibles.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.productosserviciosdisponibles.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.productosserviciosdisponibles.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.productosserviciosdisponibles.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.productosserviciosdisponibles.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoproductoservicio=true;

			idTienePermisotipoproductoservicio=this.tienePermisosUsuarioEnPaginaWebProductosServiciosDisponibles(TipoProductoServicioConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoproductoservicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductosServiciosDisponibles.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductosServiciosDisponibles.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);

				this.tipoproductoservicioBeanSwingJInternalFrame=new TipoProductoServicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoproductoservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoproductoservicioBeanSwingJInternalFrame.getTipoProductoServicioLogic().setConnexion(this.productosserviciosdisponiblesLogic.getConnexion());

				if(this.productosserviciosdisponibles.getid_tipo_producto_servicio()!=null) {
					this.tipoproductoservicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoproductoservicioBeanSwingJInternalFrame.setIdActual(this.productosserviciosdisponibles.getid_tipo_producto_servicio());
					this.tipoproductoservicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoproductoservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoProductoServicio();
				}

				JInternalFrameBase jinternalFrame =this.tipoproductoservicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductosServiciosDisponibles=(TitledBorder)this.jScrollPanelDatosProductosServiciosDisponibles.getBorder();
				TitledBorder titledBordertipoproductoservicio=(TitledBorder)this.tipoproductoservicioBeanSwingJInternalFrame.jScrollPanelDatosTipoProductoServicio.getBorder();

				titledBordertipoproductoservicio.setTitle(titledBorderProductosServiciosDisponibles.getTitle() + " -> TIPOPRODUCTOSERVICIO");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getid_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_producto_servicio = "+this.productosserviciosdisponibles.getid_tipo_producto_servicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.productosserviciosdisponibles.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_lineaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea like '%"+this.productosserviciosdisponibles.getnombre_linea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_grupoProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_grupo like '%"+this.productosserviciosdisponibles.getnombre_linea_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_categoria like '%"+this.productosserviciosdisponibles.getnombre_linea_categoria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_linea_marcaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_linea_marca like '%"+this.productosserviciosdisponibles.getnombre_linea_marca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.productosserviciosdisponibles.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.productosserviciosdisponibles.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_tipo_producto_servicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_producto_servicio like '%"+this.productosserviciosdisponibles.getnombre_tipo_producto_servicio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.productosserviciosdisponibles.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.productosserviciosdisponibles.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_disponibleProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getcantidad_disponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_disponible = "+this.productosserviciosdisponibles.getcantidad_disponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_maximoProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getcantidad_maximo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_maximo = "+this.productosserviciosdisponibles.getcantidad_maximo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_minimoProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getcantidad_minimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_minimo = "+this.productosserviciosdisponibles.getcantidad_minimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio_compraProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getprecio_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio_compra = "+this.productosserviciosdisponibles.getprecio_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio_ventaProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getprecio_venta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio_venta = "+this.productosserviciosdisponibles.getprecio_venta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_ultimoProductosServiciosDisponiblesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.getproductosserviciosdisponibles(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productosserviciosdisponibles==null) {
						this.productosserviciosdisponibles = new ProductosServiciosDisponibles();
					}

					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);
				}

				if(this.productosserviciosdisponibles.getcosto_ultimo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_ultimo = "+this.productosserviciosdisponibles.getcosto_ultimo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductosServiciosDisponibles(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessBusquedaProductosServiciosDisponibles();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdBodega();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdEmpresa();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdLinea();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdLineaCategoria();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdLineaGrupo();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdLineaMarca();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdSucursal();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoProductoServicioProductosServiciosDisponiblesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);

			this.getProductosServiciosDisponiblessFK_IdTipoProductoServicio();

			this.inicializarActualizarBindingProductosServiciosDisponibles(false);

			//if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productosserviciosdisponiblesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductosServiciosDisponibles() {
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.dispose();
			this.jInternalFrameDetalleFormProductosServiciosDisponibles=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
			this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.dispose();
			this.jInternalFrameReporteDinamicoProductosServiciosDisponibles=null;
		}
		
		if(this.jInternalFrameImportacionProductosServiciosDisponibles!=null) {
			this.jInternalFrameImportacionProductosServiciosDisponibles.setVisible(false);	    			
			this.jInternalFrameImportacionProductosServiciosDisponibles.dispose();
			this.jInternalFrameImportacionProductosServiciosDisponibles=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductosServiciosDisponibles();
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductosServiciosDisponibles")) {
				jButtonDuplicarProductosServiciosDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductosServiciosDisponibles")) {
				jButtonCopiarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductosServiciosDisponibles")) {
				jButtonVerFormProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductosServiciosDisponibles")) {
				jButtonDuplicarProductosServiciosDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductosServiciosDisponibles")) {
				jButtonDuplicarProductosServiciosDisponiblesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductosServiciosDisponibles")) {
				jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductosServiciosDisponibles")) {
				jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductosServiciosDisponibles")) {
				jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductosServiciosDisponibles")) {
				jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductosServiciosDisponibles")) {
				jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductosServiciosDisponibles")) {
				jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductosServiciosDisponibles")) {
				jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductosServiciosDisponibles")) {
				jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductosServiciosDisponibles")) {
				jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductosServiciosDisponibles")) {
				jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductosServiciosDisponibles")) {
				jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductosServiciosDisponibles")) {
				jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductosServiciosDisponibles")) {
				jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductosServiciosDisponibles")) {
				jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductosServiciosDisponibles")) {
				jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductosServiciosDisponibles")) {
				jButtonMostrarOcultarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductosServiciosDisponibles")) {
				jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductosServiciosDisponibles")) {
				jButtonCopiarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductosServiciosDisponibles")) {
				jButtonVerFormProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductosServiciosDisponibles")) {
				jButtonCopiarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductosServiciosDisponibles")) {
				jButtonVerFormProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductosServiciosDisponibles")) {
				jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductosServiciosDisponibles")) {
				jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductosServiciosDisponibles")) {
				jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductosServiciosDisponibles")) {
				jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductosServiciosDisponibles")) {
				jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductosServiciosDisponibles")) {
				jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductosServiciosDisponibles")) {
				jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductosServiciosDisponibles")) {
				jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductosServiciosDisponibles")) {
				jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductosServiciosDisponibles") || sTipo.equals("MenuItemDetalleAbrirOrderByProductosServiciosDisponibles")) {
				jButtonAbrirOrderByProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductosServiciosDisponibles") || sTipo.equals("MenuItemDetalleMostrarOcultarProductosServiciosDisponibles")) {
				jButtonMostrarOcultarProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductosServiciosDisponibles")) {
				jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductosServiciosDisponibles")) {
				jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductosServiciosDisponibles")) {
				jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductosServiciosDisponibles")) {
				jButtonCerrarReporteDinamicoProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductosServiciosDisponibles")) {
				jButtonGenerarReporteDinamicoProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductosServiciosDisponibles")) {
				
				jButtonGenerarExcelReporteDinamicoProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductosServiciosDisponibles")) {
				jButtonCerrarImportacionProductosServiciosDisponiblesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductosServiciosDisponibles")) {
				
				jButtonGenerarImportacionProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductosServiciosDisponibles")) {
				
				jButtonAbrirImportacionProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductosServiciosDisponibles")) {
				jComboBoxTiposAccionesProductosServiciosDisponiblesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductosServiciosDisponibles")) {
				jComboBoxTiposRelacionesProductosServiciosDisponiblesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductosServiciosDisponibles")) {
				jComboBoxTiposAccionesProductosServiciosDisponiblesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductosServiciosDisponibles")) {
				
				jComboBoxTiposSeleccionarProductosServiciosDisponiblesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductosServiciosDisponibles")) {
				jTextFieldValorCampoGeneralProductosServiciosDisponiblesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductosServiciosDisponibles")) {
				jButtonAbrirOrderByProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductosServiciosDisponibles")) {
				jButtonAbrirOrderByProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductosServiciosDisponibles")) {
				jButtonCerrarOrderByProductosServiciosDisponiblesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosServiciosDisponiblesBusqueda")) {
				this.jButtonidProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_empresaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_empresaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_sucursalProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_sucursalProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_bodegaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_bodegaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_lineaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_lineaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_linea_grupoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_linea_marcaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_sucursalProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_lineaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncodigoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombreProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_bodegaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_unidadProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_maximoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncantidad_maximoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_minimoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncantidad_minimoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_compraProductosServiciosDisponiblesBusqueda")) {
				this.jButtonprecio_compraProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_ventaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonprecio_ventaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_ultimoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncosto_ultimoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProductosServiciosDisponiblesProductosServiciosDisponibles")) {
				this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponiblesActionPerformed(evt);
			}
			
			;
			
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductosServiciosDisponibles();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductosServiciosDisponibles productosserviciosdisponiblesLocal=null;
			
			if(!this.getEsControlTabla()) {
				productosserviciosdisponiblesLocal=this.productosserviciosdisponibles;
			} else {
				productosserviciosdisponiblesLocal=this.productosserviciosdisponiblesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
							
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
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
			
			


			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
								
						
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
								
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
							
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
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
			
			


			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
								
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductosServiciosDisponibles")) {
					jCheckBoxSeleccionarTodosProductosServiciosDisponiblesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductosServiciosDisponibles")) {
					jCheckBoxSeleccionadosProductosServiciosDisponiblesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductosServiciosDisponibles")) {
					
				}
				
				


				
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
												
				
				


				
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
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
			
			


			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productosserviciosdisponibles);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productosserviciosdisponibles);
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
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
				
				


				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductosServiciosDisponibles.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductosServiciosDisponibles.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductosServiciosDisponiblesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productosserviciosdisponiblesAnterior =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductosServiciosDisponibles")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductosServiciosDisponiblesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductosServiciosDisponibles.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productosserviciosdisponibles =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productosserviciosdisponibles);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductosServiciosDisponibles")) {
				
				}
				
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductosServiciosDisponibles")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductosServiciosDisponibles.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductosServiciosDisponibles")) {
			
			}
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductosServiciosDisponibles();
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			if(sTipo.equals("NuevoProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductosServiciosDisponibles")) {
				jButtonDuplicarProductosServiciosDisponiblesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductosServiciosDisponibles")) {
				jButtonCopiarProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductosServiciosDisponibles")) {
				jButtonVerFormProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductosServiciosDisponibles")) {
				jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductosServiciosDisponibles")) {
				jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductosServiciosDisponibles")) {
				jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductosServiciosDisponibles")) {
				jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductosServiciosDisponibles")) {
				jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductosServiciosDisponibles")) {
				jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductosServiciosDisponibles")) {
				jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductosServiciosDisponibles")) {
				jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductosServiciosDisponibles")) {
				jButtonAbrirOrderByProductosServiciosDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductosServiciosDisponibles")) {
				jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductosServiciosDisponibles")) {
				jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductosServiciosDisponibles")) {
				jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductosServiciosDisponiblesBusqueda")) {
				this.jButtonidProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_empresaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_empresaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_sucursalProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_sucursalProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_bodegaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_bodegaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_lineaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_lineaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_linea_grupoProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_linea_grupoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_linea_categoriaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_linea_marcaProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_linea_marcaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosDisponiblesUpdate")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_producto_servicioProductosServiciosDisponiblesBusqueda")) {
				this.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_sucursalProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_lineaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_lineaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_grupoProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_categoriaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_linea_marcaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncodigoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombreProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_bodegaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadProductosServiciosDisponiblesBusqueda")) {
				this.jButtonnombre_unidadProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncantidad_disponibleProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_maximoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncantidad_maximoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_minimoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncantidad_minimoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_compraProductosServiciosDisponiblesBusqueda")) {
				this.jButtonprecio_compraProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_ventaProductosServiciosDisponiblesBusqueda")) {
				this.jButtonprecio_ventaProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_ultimoProductosServiciosDisponiblesBusqueda")) {
				this.jButtoncosto_ultimoProductosServiciosDisponiblesBusquedaActionPerformed(evt);
			}
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductosServiciosDisponibles();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductosServiciosDisponibles")) {
				closingInternalFrameProductosServiciosDisponibles();
				
			} else if(sTipo.equals("jButtonCancelarProductosServiciosDisponibles")) {
				JInternalFrameBase jInternalFrameDetalleFormProductosServiciosDisponibles = (JInternalFrameBase)evt.getSource();
	            	
	            ProductosServiciosDisponiblesBeanSwingJInternalFrame jInternalFrameParent=(ProductosServiciosDisponiblesBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosServiciosDisponibles.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductosServiciosDisponiblesActionPerformed(null);
			}
			
			ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productosserviciosdisponibles,new Object(),this.productosserviciosdisponiblesParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductosServiciosDisponibles(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductosServiciosDisponibles(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductosServiciosDisponibles(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productosserviciosdisponibles)) {
			if(!esControlTabla) {
				if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);			
				}
				
				if(this.productosserviciosdisponiblesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral,this.productosserviciosdisponiblesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productosserviciosdisponiblesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductosServiciosDisponibles(classes,this.productosserviciosdisponiblesReturnGeneral,this.productosserviciosdisponiblesBean,false);
					}
						
					if(this.productosserviciosdisponiblesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles());	
					}
						
					if(this.productosserviciosdisponiblesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles(),classes);//this.productosserviciosdisponiblesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductosServiciosDisponibles(this.productosserviciosdisponibles,classes);//this.productosserviciosdisponiblesBean);									
				}
			
				if(ProductosServiciosDisponiblesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductosServiciosDisponibles(this.productosserviciosdisponibles,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductosServiciosDisponibles(this.productosserviciosdisponibles);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productosserviciosdisponiblesAnterior!=null) {
						this.productosserviciosdisponibles=this.productosserviciosdisponiblesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productosserviciosdisponiblesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles(),productosserviciosdisponiblesLogic.getProductosServiciosDisponibless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibles(),this.productosserviciosdisponibless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductosServiciosDisponibles.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductosServiciosDisponibles.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductosServiciosDisponibles();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductosServiciosDisponibles() throws Exception {
		
		ProductosServiciosDisponiblesModel productosserviciosdisponiblesModel=(ProductosServiciosDisponiblesModel)this.jTableDatosProductosServiciosDisponibles.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productosserviciosdisponiblesModel.productosserviciosdisponibless=this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productosserviciosdisponiblesModel.productosserviciosdisponibless=this.productosserviciosdisponibless;
		}
		
		
		((ProductosServiciosDisponiblesModel) this.jTableDatosProductosServiciosDisponibles.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductosServiciosDisponibles() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductosserviciosdisponiblesAnterior(),this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductosserviciosdisponiblesAnterior(),this.productosserviciosdisponibless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductosServiciosDisponibles();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
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
										
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosserviciosdisponibles,new Object(),generalEntityParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductosServiciosDisponiblesConstantesFunciones.getClassesRelationshipsOfProductosServiciosDisponibles(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductosServiciosDisponiblesConstantesFunciones.getClassesRelationshipsFromStringsOfProductosServiciosDisponibles(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductosServiciosDisponibles(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productosserviciosdisponibles,new Object(),generalEntityParameterGeneral,this.productosserviciosdisponiblesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductosServiciosDisponibles(ProductosServiciosDisponiblesBean productosserviciosdisponiblesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductosServiciosDisponibles(ArrayList<Classe> classes,ProductosServiciosDisponiblesReturnGeneral productosserviciosdisponiblesReturnGeneral,ProductosServiciosDisponiblesBean productosserviciosdisponiblesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productosserviciosdisponibles)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles = new ProductosServiciosDisponiblesDetalleFormJInternalFrame(jDesktopPane,this.productosserviciosdisponiblesSessionBean.getConGuardarRelaciones(),this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.setVisible(false);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.productosserviciosdisponiblesLogic=this.productosserviciosdisponiblesLogic;
		
		this.cargarCombosFrameForeignKeyProductosServiciosDisponibles("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductosServiciosDisponibles();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductosServiciosDisponibles();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductosServiciosDisponibles("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductosServiciosDisponibles();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosServiciosDisponibles"));
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"ModificarProductosServiciosDisponibles"));

		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosServiciosDisponibles"));
					
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemModificarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosServiciosDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"ActualizarProductosServiciosDisponibles"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosServiciosDisponibles"));
						
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemActualizarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosServiciosDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"EliminarProductosServiciosDisponibles"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosServiciosDisponibles"));
								
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemEliminarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosServiciosDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CancelarProductosServiciosDisponibles"));
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosServiciosDisponibles"));
					
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemCancelarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosServiciosDisponibles"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemDetalleCerrarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosServiciosDisponibles"));		
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosDisponibles"));
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosDisponibles"));
		
		
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosServiciosDisponibles"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonidProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_empresaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_empresaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_sucursalProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_bodegaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_lineaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_lineaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncodigoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombreProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_maximoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_minimoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"precio_compraProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"precio_ventaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"costo_ultimoProductosServiciosDisponiblesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosServiciosDisponibles"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductosServiciosDisponibles"));
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductosServiciosDisponibles"));
		}
		
		this.jTableDatosProductosServiciosDisponibles.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductosServiciosDisponibles"));
		
		this.jTableDatosProductosServiciosDisponibles.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductosServiciosDisponibles"));
		
		this.jButtonNuevoProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"NuevoProductosServiciosDisponibles"));
		
		this.jButtonDuplicarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"DuplicarProductosServiciosDisponibles"));
		
		this.jButtonCopiarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"CopiarProductosServiciosDisponibles"));
		
		this.jButtonVerFormProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"VerFormProductosServiciosDisponibles"));
		
		
		this.jButtonNuevoToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductosServiciosDisponibles"));
			
		this.jButtonDuplicarToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductosServiciosDisponibles"));
			
		this.jMenuItemNuevoProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductosServiciosDisponibles"));
			
		this.jMenuItemDuplicarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductosServiciosDisponibles"));		
		
		
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductosServiciosDisponibles"));
		
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductosServiciosDisponibles"));
			
		this.jMenuItemNuevoRelacionesProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductosServiciosDisponibles"));		
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"ModificarProductosServiciosDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonModificarToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductosServiciosDisponibles"));
			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemModificarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductosServiciosDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"ActualizarProductosServiciosDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonActualizarToolBarProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductosServiciosDisponibles"));
				
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemActualizarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductosServiciosDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"EliminarProductosServiciosDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonEliminarToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductosServiciosDisponibles"));
						
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemEliminarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductosServiciosDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CancelarProductosServiciosDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonCancelarToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductosServiciosDisponibles"));
			
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemCancelarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductosServiciosDisponibles"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductosServiciosDisponibles"));		
		
		
		this.jButtonCerrarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CerrarProductosServiciosDisponibles"));
		
		
		this.jButtonCerrarToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductosServiciosDisponibles"));
			
		this.jMenuItemCerrarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductosServiciosDisponibles"));
			
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jMenuItemDetalleCerrarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductosServiciosDisponibles"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductosServiciosDisponibles"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductosServiciosDisponibles"));
		}
		
		this.jButtonCopiarToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductosServiciosDisponibles"));
			
		this.jButtonVerFormToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductosServiciosDisponibles"));
		
		this.jMenuItemGuardarCambiosProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductosServiciosDisponibles"));
			
		this.jMenuItemCopiarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductosServiciosDisponibles"));		
		
		this.jMenuItemVerFormProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductosServiciosDisponibles"));		
		
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosServiciosDisponibles"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductosServiciosDisponibles"));
			
		this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductosServiciosDisponibles"));		
		
		
		
		this.jButtonRecargarInformacionProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductosServiciosDisponibles"));
					
		this.jButtonRecargarInformacionToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductosServiciosDisponibles"));
		
		this.jMenuItemRecargarInformacionProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductosServiciosDisponibles"));		
		
		
		
		this.jButtonAnterioresProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"AnterioresProductosServiciosDisponibles"));
		
		
		this.jButtonAnterioresToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductosServiciosDisponibles"));
		
		this.jMenuItemAnterioresProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductosServiciosDisponibles"));		
		
		
		this.jButtonSiguientesProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"SiguientesProductosServiciosDisponibles"));
		
		
		this.jButtonSiguientesToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductosServiciosDisponibles"));
			
		this.jMenuItemSiguientesProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductosServiciosDisponibles"));
			
		this.jMenuItemAbrirOrderByProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductosServiciosDisponibles"));
			
		this.jMenuItemMostrarOcultarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductosServiciosDisponibles"));
			
		this.jMenuItemDetalleAbrirOrderByProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductosServiciosDisponibles"));
			
		this.jMenuItemDetalleMostarOcultarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductosServiciosDisponibles"));		
		
		
		this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductosServiciosDisponibles"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductosServiciosDisponibles"));
			
		this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductosServiciosDisponibles"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductosServiciosDisponibles"));

		this.jCheckBoxSeleccionadosProductosServiciosDisponibles.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductosServiciosDisponibles"));
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductosServiciosDisponibles"));
		}
		
		
		this.jComboBoxTiposRelacionesProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductosServiciosDisponibles"));
			
		this.jComboBoxTiposAccionesProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"TiposAccionesProductosServiciosDisponibles"));
					
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductosServiciosDisponibles"));
			
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductosServiciosDisponibles"));		
		
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonidProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_empresaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_empresaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_sucursalProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_bodegaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_lineaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_lineaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncodigoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombreProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_maximoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_minimoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"precio_compraProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"precio_ventaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"costo_ultimoProductosServiciosDisponiblesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"BusquedaProductosServiciosDisponiblesProductosServiciosDisponibles"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductosServiciosDisponibles!=null) {
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosDisponibles"));
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosDisponibles"));
				this.jInternalFrameReporteDinamicoProductosServiciosDisponibles.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosDisponibles"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductosServiciosDisponibles"));				
			//this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductosServiciosDisponibles"));
			//this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductosServiciosDisponibles"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductosServiciosDisponibles!=null) {
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductosServiciosDisponibles"));
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductosServiciosDisponibles"));
				this.jInternalFrameImportacionProductosServiciosDisponibles.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductosServiciosDisponibles"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductosServiciosDisponibles"));
			
			this.jButtonAbrirOrderByToolBarProductosServiciosDisponibles.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductosServiciosDisponibles"));			
			
			if(this.jInternalFrameOrderByProductosServiciosDisponibles!=null) {
				this.jInternalFrameOrderByProductosServiciosDisponibles.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductosServiciosDisponibles"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTabbedPaneRelacionesProductosServiciosDisponibles.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductosServiciosDisponibles"));
		
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
            		closingInternalFrameProductosServiciosDisponibles();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductosServiciosDisponibles = (JInternalFrameBase)event.getSource();
	            	
	            ProductosServiciosDisponiblesBeanSwingJInternalFrame jInternalFrameParent=(ProductosServiciosDisponiblesBeanSwingJInternalFrame)jInternalFrameDetalleFormProductosServiciosDisponibles.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductosServiciosDisponiblesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductosServiciosDisponibles.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductosServiciosDisponiblesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductosServiciosDisponibles.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductosServiciosDisponibles.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductosServiciosDisponibles";
		inputMap = this.jButtonNuevoProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductosServiciosDisponibles";
		inputMap = this.jButtonNuevoRelacionesProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductosServiciosDisponiblesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductosServiciosDisponibles";
		inputMap = this.jButtonModificarProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductosServiciosDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductosServiciosDisponibles";
		inputMap = this.jButtonActualizarProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductosServiciosDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductosServiciosDisponibles";
		inputMap = this.jButtonEliminarProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductosServiciosDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductosServiciosDisponibles";
		inputMap = this.jButtonCancelarProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductosServiciosDisponibles";
		inputMap = this.jButtonCerrarProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductosServiciosDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductosServiciosDisponibles";
		inputMap = this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonGuardarCambiosProductosServiciosDisponibles.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductosServiciosDisponibles.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductosServiciosDisponiblesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductosServiciosDisponibles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductosServiciosDisponiblesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductosServiciosDisponiblesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductosServiciosDisponiblesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonidProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"idProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_empresaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_empresaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_sucursalProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_sucursalProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_bodegaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_bodegaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_lineaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_lineaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_grupoProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_grupoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_categoriaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_categoriaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_marcaProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_linea_marcaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProductosServiciosDisponiblesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosDisponiblesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonid_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_sucursalProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_lineaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_lineaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_grupoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_grupoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_categoriaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_categoriaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_linea_marcaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_linea_marcaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncodigoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"codigoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombreProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombreProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_producto_servicioProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_bodegaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonnombre_unidadProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_disponibleProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_maximoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_maximoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncantidad_minimoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_minimoProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonprecio_compraProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"precio_compraProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtonprecio_ventaProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"precio_ventaProductosServiciosDisponiblesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jButtoncosto_ultimoProductosServiciosDisponiblesBusqueda.addActionListener(new ButtonActionListener(this,"costo_ultimoProductosServiciosDisponiblesBusqueda"));
		
		
		this.jButtonBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles.addActionListener(new ButtonActionListener(this,"BusquedaProductosServiciosDisponiblesProductosServiciosDisponibles"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductosServiciosDisponibles.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductosServiciosDisponiblesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductosServiciosDisponiblesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductosServiciosDisponibles.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductosServiciosDisponibles(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
					productosserviciosdisponiblesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponibless) {
					productosserviciosdisponiblesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductosServiciosDisponiblesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
						productosserviciosdisponiblesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponibless) {
						productosserviciosdisponiblesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponibless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosServiciosDisponibles.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosServiciosDisponibles.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductosServiciosDisponiblesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductosServiciosDisponibles.getSelectedRows();
			
			ProductosServiciosDisponibles productosserviciosdisponiblesLocal=new ProductosServiciosDisponibles();
			
			//this.seleccionarTodosProductosServiciosDisponibles(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productosserviciosdisponiblesLocal =(ProductosServiciosDisponibles) this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless().toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productosserviciosdisponiblesLocal =(ProductosServiciosDisponibles) this.productosserviciosdisponibless.toArray()[this.jTableDatosProductosServiciosDisponibles.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productosserviciosdisponiblesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
						productosserviciosdisponiblesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponibless) {
						productosserviciosdisponiblesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductosServiciosDisponibles.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductosServiciosDisponibles.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductosServiciosDisponibles,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductosServiciosDisponiblesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductosServiciosDisponiblesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductosServiciosDisponiblesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductosServiciosDisponibles.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
				
						if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_tipo_producto_servicio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							productosserviciosdisponiblesAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcantidad_maximo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcantidad_minimo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA)) {
							existe=true;
							productosserviciosdisponiblesAux.setprecio_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA)) {
							existe=true;
							productosserviciosdisponiblesAux.setprecio_venta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcosto_ultimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponibless) {
					
						if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea_categoria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_linea_marca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_tipo_producto_servicio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							productosserviciosdisponiblesAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							productosserviciosdisponiblesAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcantidad_maximo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcantidad_minimo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA)) {
							existe=true;
							productosserviciosdisponiblesAux.setprecio_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA)) {
							existe=true;
							productosserviciosdisponiblesAux.setprecio_venta(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO)) {
							existe=true;
							productosserviciosdisponiblesAux.setcosto_ultimo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductosServiciosDisponiblesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductosServiciosDisponibles=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductosServiciosDisponibles.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductosServiciosDisponibles) {				
					conSplash=true;//false;										
					
					//this.startProcessProductosServiciosDisponibles(conSplash);
				
					this.generarReporteProductosServiciosDisponiblessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductosServiciosDisponiblessSeleccionados();
				//this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosServiciosDisponiblessSeleccionados(false);
				//this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductosServiciosDisponiblessSeleccionados(true);
				//this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosServiciosDisponibles();
				
				this.exportarProductosServiciosDisponiblessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductosServiciosDisponibless();
				//this.importarProductosServiciosDisponibless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductosServiciosDisponibles();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductosServiciosDisponiblessSeleccionados();
				//this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Productos Servicios Disponibles", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductosServiciosDisponibles();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductosServiciosDisponibles)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductosServiciosDisponibles(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductosServiciosDisponiblesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductosServiciosDisponibles) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductosServiciosDisponibles(conSplash);
					
						//this.actualizarParametrosGeneralProductosServiciosDisponibles();
						
						this.generarReporteProcesoAccionProductosServiciosDisponiblessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Productos Servicios DisponiblesES SELECCIONADOS?", "MANTENIMIENTO DE Productos Servicios Disponibles", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductosServiciosDisponibles();
				
						this.actualizarParametrosGeneralProductosServiciosDisponibles();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productosserviciosdisponiblesReturnGeneral=productosserviciosdisponiblesLogic.procesarAccionProductosServiciosDisponiblessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless(),this.productosserviciosdisponiblesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductosServiciosDisponiblesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductosServiciosDisponibles();
					
					ProductosServiciosDisponiblesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductosServiciosDisponiblesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductosServiciosDisponibles.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxTiposAccionesFormularioProductosServiciosDisponibles.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductosServiciosDisponibles(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductosServiciosDisponiblesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductosServiciosDisponibles();
			
			if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
			ProductosServiciosDisponibles productosserviciosdisponibles=new ProductosServiciosDisponibles();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductosServiciosDisponibles.getSelectedItem();
			
			
			
			
			productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
			//this.sTipoAccion;
			
			if(productosserviciosdisponiblessSeleccionados.size()==1) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessSeleccionados) {
					productosserviciosdisponibles=productosserviciosdisponiblesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductosServiciosDisponibles();
			
      		//this.finishProcessProductosServiciosDisponibles(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductosServiciosDisponiblesReturnGeneral() throws Exception {
		if(this.productosserviciosdisponiblesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productosserviciosdisponiblesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productosserviciosdisponiblesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productosserviciosdisponiblesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productosserviciosdisponiblesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productosserviciosdisponiblesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
		}
		
		if(this.productosserviciosdisponiblesReturnGeneral.getConRetornoLista() || this.productosserviciosdisponiblesReturnGeneral.getConRetornoObjeto()) {
			if(this.productosserviciosdisponiblesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productosserviciosdisponiblesLogic.setProductosServiciosDisponibless(this.productosserviciosdisponiblesReturnGeneral.getProductosServiciosDisponibless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProductosServiciosDisponibles(false);
		}
	}
	
	public void actualizarParametrosGeneralProductosServiciosDisponibles() throws Exception {
		
		
	}
	
	public ArrayList<ProductosServiciosDisponibles> getProductosServiciosDisponiblessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductosServiciosDisponibles) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblesLogic.getProductosServiciosDisponibless()) {
					if(productosserviciosdisponiblesAux.getIsSelected()) {
						productosserviciosdisponiblessSeleccionados.add(productosserviciosdisponiblesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:this.productosserviciosdisponibless) {
					if(productosserviciosdisponiblesAux.getIsSelected()) {
						productosserviciosdisponiblessSeleccionados.add(productosserviciosdisponiblesAux);				
					}
				}
			}
			
			if(productosserviciosdisponiblessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productosserviciosdisponiblessSeleccionados.addAll(this.productosserviciosdisponiblesLogic.getProductosServiciosDisponibless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productosserviciosdisponiblessSeleccionados.addAll(this.productosserviciosdisponibless);				
					}
				}
			}
		} else {
			productosserviciosdisponiblessSeleccionados.add(this.productosserviciosdisponibles);
		}
		
		return productosserviciosdisponiblessSeleccionados;
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
	
	public void generarReporteProductosServiciosDisponiblessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductosServiciosDisponiblessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductosServiciosDisponiblessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosServiciosDisponiblessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductosServiciosDisponiblessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Productos Servicios Disponibles",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductosServiciosDisponiblessSeleccionados() throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados);
		
	}	
	
	public void generarReporteNormalProductosServiciosDisponiblessSeleccionados() throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductosServiciosDisponiblessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductosServiciosDisponiblessSeleccionados() throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductosServiciosDisponibles();
		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductosServiciosDisponibles();
		
		
		//this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados ,productosserviciosdisponiblesImplementable,productosserviciosdisponiblesImplementableHome);
	}
	
	public void mostrarImportacionProductosServiciosDisponibless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductosServiciosDisponibles();
		
		this.abrirFrameImportacionProductosServiciosDisponibles();		
		
			
		//this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados ,productosserviciosdisponiblesImplementable,productosserviciosdisponiblesImplementableHome);
	}
	
	public void importarProductosServiciosDisponibless() throws Exception {		
	
	}
	
	public void exportarProductosServiciosDisponiblessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductosServiciosDisponiblessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductosServiciosDisponiblessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductosServiciosDisponiblessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Productos Servicios Disponibles",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductosServiciosDisponiblessSeleccionados() throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductosServiciosDisponibles(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductosServiciosDisponibles(productosserviciosdisponiblesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productosserviciosdisponiblesAux.setsDetalleGeneralEntityReporte(productosserviciosdisponiblesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductosServiciosDisponibles(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productosserviciosdisponibles.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.gettipoproductoservicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_linea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_linea_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_linea_categoria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_linea_marca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_tipo_producto_servicio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getcantidad_disponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getcantidad_maximo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getcantidad_minimo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getprecio_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getprecio_venta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productosserviciosdisponibles.getcosto_ultimo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductosServiciosDisponiblessSeleccionados() throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductosServiciosDisponibless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductosServiciosDisponibles(row);				
				iRow++;
			}				
			
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductosServiciosDisponibles(productosserviciosdisponiblesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductosServiciosDisponiblessSeleccionados() throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();		
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productosserviciosdisponibles.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productosserviciosdisponibless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productosserviciosdisponibles");
			//elementRoot.appendChild(element);
		
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessSeleccionados) {
				element = document.createElement("productosserviciosdisponibles");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductosServiciosDisponibles(productosserviciosdisponiblesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Productos Servicios Disponibles",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductosServiciosDisponibles(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_PRECIOVENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductosServiciosDisponiblesConstantesFunciones.LABEL_COSTOULTIMO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.gettipoproductoservicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_linea());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_linea_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_linea_categoria());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_linea_marca());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_tipo_producto_servicio());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getcantidad_disponible());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getcantidad_maximo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getcantidad_minimo());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getprecio_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getprecio_venta());
		cell = row.createCell(iColumn++);cell.setCellValue(productosserviciosdisponibles.getcosto_ultimo());				
	}
	
	public void setFilaDatosExportarXmlProductosServiciosDisponibles(ProductosServiciosDisponibles productosserviciosdisponibles,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productosserviciosdisponibles.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productosserviciosdisponibles.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementlinea_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementtipoproductoservicio_descripcion = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.IDTIPOPRODUCTOSERVICIO);
		elementtipoproductoservicio_descripcion.appendChild(document.createTextNode(productosserviciosdisponibles.gettipoproductoservicio_descripcion()));
		element.appendChild(elementtipoproductoservicio_descripcion);

		Element elementnombre_sucursal = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_linea = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEA);
		elementnombre_linea.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_linea().trim()));
		element.appendChild(elementnombre_linea);

		Element elementnombre_linea_grupo = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEAGRUPO);
		elementnombre_linea_grupo.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_linea_grupo().trim()));
		element.appendChild(elementnombre_linea_grupo);

		Element elementnombre_linea_categoria = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEACATEGORIA);
		elementnombre_linea_categoria.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_linea_categoria().trim()));
		element.appendChild(elementnombre_linea_categoria);

		Element elementnombre_linea_marca = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRELINEAMARCA);
		elementnombre_linea_marca.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_linea_marca().trim()));
		element.appendChild(elementnombre_linea_marca);

		Element elementcodigo = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(productosserviciosdisponibles.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementnombre_tipo_producto_servicio = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBRETIPOPRODUCTOSERVICIO);
		elementnombre_tipo_producto_servicio.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_tipo_producto_servicio().trim()));
		element.appendChild(elementnombre_tipo_producto_servicio);

		Element elementnombre_bodega = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_unidad = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(productosserviciosdisponibles.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_disponible = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.CANTIDADDISPONIBLE);
		elementcantidad_disponible.appendChild(document.createTextNode(productosserviciosdisponibles.getcantidad_disponible().toString().trim()));
		element.appendChild(elementcantidad_disponible);

		Element elementcantidad_maximo = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.CANTIDADMAXIMO);
		elementcantidad_maximo.appendChild(document.createTextNode(productosserviciosdisponibles.getcantidad_maximo().toString().trim()));
		element.appendChild(elementcantidad_maximo);

		Element elementcantidad_minimo = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.CANTIDADMINIMO);
		elementcantidad_minimo.appendChild(document.createTextNode(productosserviciosdisponibles.getcantidad_minimo().toString().trim()));
		element.appendChild(elementcantidad_minimo);

		Element elementprecio_compra = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.PRECIOCOMPRA);
		elementprecio_compra.appendChild(document.createTextNode(productosserviciosdisponibles.getprecio_compra().toString().trim()));
		element.appendChild(elementprecio_compra);

		Element elementprecio_venta = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.PRECIOVENTA);
		elementprecio_venta.appendChild(document.createTextNode(productosserviciosdisponibles.getprecio_venta().toString().trim()));
		element.appendChild(elementprecio_venta);

		Element elementcosto_ultimo = document.createElement(ProductosServiciosDisponiblesConstantesFunciones.COSTOULTIMO);
		elementcosto_ultimo.appendChild(document.createTextNode(productosserviciosdisponibles.getcosto_ultimo().toString().trim()));
		element.appendChild(elementcosto_ultimo);
	}
	
	public void generarReporteGroupGenericoProductosServiciosDisponiblessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados=new ArrayList<ProductosServiciosDisponibles>();
		
		productosserviciosdisponiblessSeleccionados=this.getProductosServiciosDisponiblessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductosServiciosDisponibles(productosserviciosdisponiblessSeleccionados);
		
		this.generarReporteProductosServiciosDisponibless("Todos",productosserviciosdisponiblessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductosServiciosDisponibles(ArrayList<ProductosServiciosDisponibles> productosserviciosdisponiblessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductosServiciosDisponibles productosserviciosdisponiblesAux:productosserviciosdisponiblessSeleccionados) {
				productosserviciosdisponiblesAux.setsDetalleGeneralEntityReporte(productosserviciosdisponiblesAux.toString());
			
				if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_IDTIPOPRODUCTOSERVICIO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.gettipoproductoservicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_linea());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAGRUPO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_linea_grupo());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEACATEGORIA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_linea_categoria());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRELINEAMARCA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_linea_marca());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBRETIPOPRODUCTOSERVICIO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_tipo_producto_servicio());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getcantidad_disponible().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMAXIMO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getcantidad_maximo().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductosServiciosDisponiblesConstantesFunciones.LABEL_CANTIDADMINIMO)) {
					existe=true;
					productosserviciosdisponiblesAux.setsDescripcionGeneralEntityReporte1(productosserviciosdisponiblesAux.getcantidad_minimo().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductosServiciosDisponiblesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductosServiciosDisponibles(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=true;
				this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=true;
				this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=true;
			}
			
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=true;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaModificarProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				} else {
					this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductosServiciosDisponiblesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=true;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=true;
		} else {
			this.actualizarEstadoPanelsProductosServiciosDisponibles(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductosServiciosDisponibles=false;
			//this.isVisibilidadCeldaVerFormProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaDuplicarProductosServiciosDisponibles=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
		} else {
			this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			if(!productosserviciosdisponiblesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;												
			}
			
			this.jButtonCerrarProductosServiciosDisponibles.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
		}
		
		if(!this.permiteMantenimiento(this.productosserviciosdisponibles)) {
			this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
			this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProductosServiciosDisponibles=false;
		this.isVisibilidadCeldaNuevoRelacionesProductosServiciosDisponibles=false;
		this.isVisibilidadCeldaGuardarCambiosProductosServiciosDisponibles=false;
		//this.isVisibilidadCeldaModificarProductosServiciosDisponibles=true;
		this.isVisibilidadCeldaActualizarProductosServiciosDisponibles=false;
		this.isVisibilidadCeldaEliminarProductosServiciosDisponibles=false;
		//this.isVisibilidadCeldaCancelarProductosServiciosDisponibles=true;			
		this.isVisibilidadCeldaGuardarProductosServiciosDisponibles=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductosServiciosDisponibles() {
	}
	
	public void actualizarEstadoPanelsProductosServiciosDisponibles(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosEdicionProductosServiciosDisponibles.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductosServiciosDisponibles!=null) {
				this.jScrollPanelDatosProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductosServiciosDisponibles!=null) {
				this.jPanelPaginacionProductosServiciosDisponibles.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
					this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productosserviciosdisponiblesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductosServiciosDisponibles!=null) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductosServiciosDisponibles!=null) {
				this.jPanelParametrosReportesProductosServiciosDisponibles.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaBodega;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaLinea;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoProductoServicio(Boolean isParaTipoProductoServicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoProductoServicioNegation=!isParaTipoProductoServicio;

			this.isVisibilidadBusquedaProductosServiciosDisponibles=isParaTipoProductoServicio;
			if(!this.isVisibilidadBusquedaProductosServiciosDisponibles) {this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);}
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
			
			this.inicializarActualizarBindingTablaProductosServiciosDisponibles(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductosServiciosDisponibles() {
		this.updateBorderResaltarBusquedasFormularioProductosServiciosDisponibles();
		this.updateVisibilidadBusquedasFormularioProductosServiciosDisponibles();
		this.updateHabilitarBusquedasFormularioProductosServiciosDisponibles();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductosServiciosDisponibles() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponents().length>0) {
	

		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles!=null) {
			index= this.jTabbedPaneBusquedasProductosServiciosDisponibles.indexOfComponent(this.jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponent(index);
				jPanel.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductosServiciosDisponibles() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosServiciosDisponibles.indexOfComponent(this.jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			if(!this.productosserviciosdisponiblesConstantesFunciones.mostrarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles && index>-1) {
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductosServiciosDisponibles() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductosServiciosDisponibles.indexOfComponent(this.jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
				this.jTabbedPaneBusquedasProductosServiciosDisponibles.setEnabledAt(index,this.productosserviciosdisponiblesConstantesFunciones.activarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductosServiciosDisponibles(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProductosServiciosDisponibles")) {
			index= this.jTabbedPaneBusquedasProductosServiciosDisponibles.indexOfComponent(this.jPanelBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);

			this.jTabbedPaneBusquedasProductosServiciosDisponibles.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductosServiciosDisponibles.getComponent(index);

			this.productosserviciosdisponiblesConstantesFunciones.setResaltarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles(resaltar);

			jPanel.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarBusquedaProductosServiciosDisponiblesProductosServiciosDisponibles);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductosServiciosDisponibles.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductosServiciosDisponibles() throws Exception {

		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductosServiciosDisponibles();
		this.updateVisibilidadResaltarControlesFormularioProductosServiciosDisponibles();
		this.updateHabilitarResaltarControlesFormularioProductosServiciosDisponibles();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductosServiciosDisponibles() throws Exception {
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltaridProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltaridProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_empresaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_empresaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_sucursalProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_sucursalProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_bodegaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_bodegaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_lineaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_lineaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_linea_grupoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_linea_grupoProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_linea_categoriaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_linea_categoriaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_linea_marcaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_linea_marcaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_tipo_producto_servicioProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarid_tipo_producto_servicioProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_sucursalProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_sucursalProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_lineaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_lineaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_grupoProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_categoriaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_linea_marcaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarcodigoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarcodigoProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombreProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombreProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_tipo_producto_servicioProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_bodegaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_bodegaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_unidadProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarnombre_unidadProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_disponibleProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_disponibleProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_maximoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_maximoProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_minimoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarcantidad_minimoProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_compraProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_compraProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_ventaProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarprecio_ventaProductosServiciosDisponibles);}
		if(this.productosserviciosdisponiblesConstantesFunciones.resaltarcosto_ultimoProductosServiciosDisponibles!=null && this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setBorder(this.productosserviciosdisponiblesConstantesFunciones.resaltarcosto_ultimoProductosServiciosDisponibles);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductosServiciosDisponibles() throws Exception {		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
	
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostraridProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelidProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostraridProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_empresaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_empresaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_empresaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_sucursalProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_sucursalProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_sucursalProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_bodegaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_bodegaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_bodegaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_lineaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_lineaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_lineaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_linea_grupoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_linea_grupoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_linea_grupoProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_linea_categoriaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_linea_categoriaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_linea_categoriaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_linea_marcaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_linea_marcaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_linea_marcaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_tipo_producto_servicioProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelid_tipo_producto_servicioProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarid_tipo_producto_servicioProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_sucursalProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_sucursalProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_sucursalProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_lineaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_lineaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_lineaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_grupoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_linea_grupoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_grupoProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_categoriaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_linea_categoriaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_categoriaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_marcaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_linea_marcaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_linea_marcaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcodigoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelcodigoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcodigoProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombreProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombreProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombreProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_tipo_producto_servicioProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_tipo_producto_servicioProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_tipo_producto_servicioProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_bodegaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_bodegaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_bodegaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_unidadProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelnombre_unidadProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarnombre_unidadProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_disponibleProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelcantidad_disponibleProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_disponibleProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_maximoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelcantidad_maximoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_maximoProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_minimoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelcantidad_minimoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcantidad_minimoProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarprecio_compraProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelprecio_compraProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarprecio_compraProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarprecio_ventaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelprecio_ventaProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarprecio_ventaProductosServiciosDisponibles);
		//this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcosto_ultimoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jPanelcosto_ultimoProductosServiciosDisponibles.setVisible(this.productosserviciosdisponiblesConstantesFunciones.mostrarcosto_ultimoProductosServiciosDisponibles);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductosServiciosDisponibles() throws Exception {
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductosServiciosDisponibles!=null) {
	
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jLabelidProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activaridProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_empresaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_empresaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_sucursalProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_sucursalProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_bodegaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_bodegaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_lineaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_lineaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_grupoProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_linea_grupoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_categoriaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_linea_categoriaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_linea_marcaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_linea_marcaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jComboBoxid_tipo_producto_servicioProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarid_tipo_producto_servicioProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_sucursalProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_sucursalProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_lineaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_lineaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_grupoProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_grupoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_categoriaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_categoriaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_linea_marcaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_linea_marcaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcodigoProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarcodigoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombreProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombreProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_tipo_producto_servicioProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_tipo_producto_servicioProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextAreanombre_bodegaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_bodegaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldnombre_unidadProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarnombre_unidadProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_disponibleProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_disponibleProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_maximoProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_maximoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcantidad_minimoProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarcantidad_minimoProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_compraProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarprecio_compraProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldprecio_ventaProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarprecio_ventaProductosServiciosDisponibles);
		this.jInternalFrameDetalleFormProductosServiciosDisponibles.jTextFieldcosto_ultimoProductosServiciosDisponibles.setEnabled(this.productosserviciosdisponiblesConstantesFunciones.activarcosto_ultimoProductosServiciosDisponibles);
		}
	}
	
		
}